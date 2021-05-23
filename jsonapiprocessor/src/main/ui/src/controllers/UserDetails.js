import axios from 'axios'

const USERS_API_URL = 'http://sarveshfmapiconsumer-env.eba-3gpnrptp.ap-southeast-2.elasticbeanstalk.com/api/users';

class UserDetails {

    getUsers(){
        return axios.get(USERS_API_URL);
    }
}

export default new UserDetails();