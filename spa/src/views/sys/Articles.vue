<template>
	<div>
		<!-- 搜索-->
		<el-form :inline="true" :model="formInline" class="user-search">
			<el-form-item label="搜索: ">
				<el-input size="small" v-model="formInline.title" placeholder="请输入标题"></el-input>
			</el-form-item>
			<el-form-item>
				<el-button size="small" type="primary" icon="el-icon-search" @click="search">搜索</el-button>
				<el-button size="small" type="primary" icon="el-icon-plus" @click="add()">添加</el-button>
			</el-form-item>
		</el-form>
		<el-table :data="listData" style="width: 100%" :row-class-name="tableRowClassName">
			<el-table-column prop="id" label="ID" width="180">
			</el-table-column>
			<el-table-column prop="title" label="文章标题" width="180">
			</el-table-column>
			<el-table-column prop="body" label="文章内容">
			</el-table-column>
			<el-table-column align="center" label="操作">
				<template slot-scope="scope">
					<el-button size="mini" @click="edit(scope.$index, scope.row)">编辑</el-button>
					<el-button size="mini" type="danger" @click="del(scope.$index, scope.row)">删除</el-button>
				</template>
			</el-table-column>
		</el-table>
		<el-pagination style="margin-top: 20px;" @size-change="handleSizeChange" @current-change="handleCurrentChange"
		 :current-page="formInline.page" :page-sizes="[10, 20, 30, 50]" :page-size="formInline.rows" layout="total, sizes, prev, pager, next, jumper"
		 :total="total">
		</el-pagination>

		<el-dialog :title="title" :visible.sync="editFormVisible" width="30%" @click="closeDialog">
			<el-form label-width="120px" :model="editForm" :rules="rules" ref="editForm">
				<el-form-item label="文章标题" prop="title">
					<el-input size="small" v-model="editForm.title" auto-complete="off" placeholder="请输入文章标题"></el-input>
				</el-form-item>
				<el-form-item label="文章内容" prop="body">
					<el-input size="small" v-model="editForm.body" auto-complete="off" placeholder="请输入文章内容"></el-input>
				</el-form-item>
			</el-form>
			<div slot="footer" class="dialog-footer">
				<el-button size="small" @click="closeDialog">取消</el-button>
				<el-button size="small" type="primary" class="title" @click="submitForm()">保存</el-button>
			</div>
		</el-dialog>
	</div>
</template>

<style>
	.el-table .warning-row {
		background: oldlace;
	}

	.el-table .success-row {
		background: #f0f9eb;
	}
</style>

<script>
	export default {
		data() {
			return {
				listData: [],
				total: 0,
				formInline: {
					title: '',
					page: 1,
					rows: 10,
				},
				title: '',
				editFormVisible: false,
				editForm: {
					title: '',
					body: '',
					id: 0
				},
				rules: {
					title: [{
						required: true,
						message: '请输入文章标题',
						trigger: 'blur'
					}],
					body: [{
							required: true,
							message: '请输入文章内容',
							trigger: 'blur'
						},
						{
							min: 3,
							message: '长度不小于3个字符',
							trigger: 'blur'
						}
					]
				}
			};
		},
		methods: {
			tableRowClassName({
				row,
				rowIndex
			}) {
				if (rowIndex % 2 === 0) {
					return 'warning-row';
				} else {
					return 'success-row';
				}
				return '';
			},
			search() {
				this.doSearch(this.formInline);
			},
			doSearch(params) {
				let url = this.axios.urls.SYSTEM_ARTICLE_LIST;
				this.axios.post(url, params).then((response) => {
					console.log(response);
					this.listData = response.data.result;
					this.total = response.data.pageBean.total;
				}).catch((response) => {
					console.log(response);
				});
			},
			handleSizeChange(rows) {
				console.log("页码数量改变");
				this.formInline.page = 1;
				this.formInline.rows = rows;
				this.search();
			},
			handleCurrentChange(page) {
				console.log("当前页改变");
				this.formInline.page = page;
				this.search();
			},
			add() {
				this.clearForm();
				this.title = '添加文章';
				this.editFormVisible = true;
			},
			edit(index, row) {
				this.title = '编辑文章';
				this.editForm.id = row.id;
				this.editForm.title = row.title;
				this.editForm.body = row.body;
				this.editFormVisible = true;
			},
			del(index, row) {
				this.$confirm('此操作将永久删除该文件, 是否继续?', '提示', {
					confirmButtonText: '确定',
					cancelButtonText: '取消',
					type: 'warning'
				}).then(() => {
					let url = this.axios.urls.SYSTEM_ARTICLE_DEL;
					this.axios.post(url, {
						id: row.id
					}).then((response) => {
						console.log(response);
						this.$message({
							type: 'success',
							message: '删除成功'
						});
						this.doSearch(this.formInline);
						this.clearForm();
					}).catch((response) => {
						console.log(response);
					});
				}).catch(() => {
					this.$message({
						type: 'info',
						message: '已取消删除'
					});
				});
			},
			closeDialog() {
				this.editFormVisible = false;
				this.clearForm();
			},
			submitForm() {
				this.$refs['editForm'].validate((valid) => {
					if (valid) {
						let url;
						if(this.editForm.id==0){
							url = this.axios.urls.SYSTEM_ARTICLE_ADD;
						}else{
							url = this.axios.urls.SYSTEM_ARTICLE_EDIT;
						}
						this.axios.post(url, this.editForm).then((response) => {
							console.log(response);
							this.doSearch(this.formInline);
							this.clearForm();
						}).catch((response) => {
							console.log(response);
						});
					} else {
						console.log('error submit!!');
						return false;
					}
				});
			},
			clearForm() {
				this.editForm.title = '';
				this.editForm.body = '';
				this.editFormVisible = false;
			}
		},
		created() {
			this.doSearch({});
		}
	}
</script>
 