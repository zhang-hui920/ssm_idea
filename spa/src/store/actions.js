export default{
	setResturantNameByAsync: (context, payload) => {
		console.log('xxxx');
		setTimeout(() => {
			console.log('yyyy');
			console.log(payload)
			context.commit('setResturantName', payload); //Action提交的是mutation
		}, 3000)
		console.log('zzzz');
	},
	doAjax: (context, payload) => {
		let _this = payload._this
		let url = _this.axios.urls.SYSTEM_USER_DOLOGIN;
		_this.axios.post(url, {}).then((response)=> {
			console.log(response);
		}).catch(function(error) {
			console.log(error);
		});
	}
}
