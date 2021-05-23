import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/js/src/collapse.js';
import UserDetails from '../controllers/UserDetails';
import PostDetails from '../controllers/PostDetails';
import '../assets/Display.css';

class UserPostCollapsibleDisplay extends React.Component {

    constructor(props){
        super(props)
        this.state = {
            users:[],
            posts:[],
            userOpen: []
        }
    }

    togglePanel(e, user){
            if(!this.state.userOpen.includes(user.id)){
            this.setState({
              userOpen: this.state.userOpen.concat(user.id)
            })}
            else{
            this.setState({
                     userOpen: this.state.userOpen.filter(item => item !== user.id)
             })
            }
    }

    componentDidMount(){
        PostDetails.getPosts().then((response) => {
            this.setState({ posts: response.data})
        });
        UserDetails.getUsers().then((response) => {
            this.setState({ users: response.data})
        });
    }

    componentDidUpdate(){

    }

    render (){
        return (
            <div className = "outerDiv">
                <h1 className = "textLeft"> Users </h1>
                <h6 className = "textLeft">Click on the users to toggle user posts</h6>
                    {
                        this.state.users.map(
                            user =>
                            <div className = 'inner'>
                                <div key = {user.id} className ='userBox' onClick ={(e)=>this.togglePanel(e, user)}>
                                     <p>User ID: {user.id}</p>
                                     <p>User Name: {user.name}</p>
                                     <p>Username: {user.username}</p>
                                     <p>User Email: {user.email}</p>
                                </div>
                                <div className = 'postBox'>
                                    {this.state.userOpen.includes(user.id) ? (
                                        <div className='postHolder'>
                                        {
                                         this.state.posts.filter(poster => poster.userId === user.id).map(
                                          post =>
                                          <div className='post'>
                                               <p>Post ID: {post.id} and post under User Id {post.userId}</p>
                                               <p>Post Title: {post.title}</p>
                                               <p>Post Body: {post.body}</p>
                                          </div>
                                         )}
                                        </div>
                                    ) : null}
                                </div>
                            </div>
                        )
                    }
            </div>
        )
   }
}

export default UserPostCollapsibleDisplay;