import React from "react";


class UserComponent extends React.Component {
     
    state={
        loading:true,
        person:null,
    };
      
    
   async componentDidMount(){
       
      const url="http://localhost:8090/users";
     const respone= await fetch(url);
     const data=await respone.json();
     console.log(data);
     this.setState({person:data[0],loading:false})

    }
    render() {
        return (
     
             <div>{this.state.loading || !this.state.person ?
             <div>loading...</div>
             :
             (<div>
                 <div>{this.state.person.firstname}</div>
                 <div>{this.state.person.lastname}</div>
                 <div>{this.state.person.gender}</div>
                 <div>{this.state.person.email}</div>
                 <div>{this.state.person.ipaddress}</div>
             </div>)}</div>
        );
    }
}

export default UserComponent