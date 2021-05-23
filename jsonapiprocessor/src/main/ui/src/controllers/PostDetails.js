import axios from 'axios'

const POSTS_API_URL = 'http://sarveshfmapiconsumer-env.eba-3gpnrptp.ap-southeast-2.elasticbeanstalk.com/api/posts';

class PostDetails {

    getPosts(){
        return axios.get(POSTS_API_URL);
    }
}

export default new PostDetails();