<template>
	<div>
		<h3>角色管理页面的:{{title}}</h3>
	</div>
</template>

<script>
	export default{
		data(){
			return{
				title:''
			}
		},
		created() {
			this.title = this.$store.state.resturantName;
		}
	}
</script>

<style>
</style>
