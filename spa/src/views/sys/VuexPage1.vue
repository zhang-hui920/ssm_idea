<template>
	<div>
		<h3>用户管理页面的:{{title}}</h3>
		<button @click="Change">改变</button>
		<button @click="ChangeAsync">异步方法改变</button>
		<button @click="doAjax">测试Vuex使用ajax</button>
	</div>
</template>

<script>
	export default{
		data(){
			return{
				
			}
		},
		methods:{
			Change(){
				this.$store.commit('setResturantName',{
					resturantName:'麻婆豆腐'
				})
			},
			ChangeAsync(){
				this.$store.dispatch('setResturantNameByAsync',{
					resturantName:'麻辣小龙虾'
				})
			},
			doAjax(){
				this.$store.dispatch('doAjax',{
					_this:this
				})
			}
		},
		computed:{
			title(){
				// return this.$store.state.resturantName;
				return this.$store.getters.getResturantName;
			}
		}
	}
</script>

<style>
</style>
