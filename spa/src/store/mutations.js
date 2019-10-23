export default{
	setResturantName:(state,payload)=>{
		state.resturantName = payload.resturantName;
	},
	setjwt:(state,payload)=>{
		state.jwt = payload.jwt;
	}
}
