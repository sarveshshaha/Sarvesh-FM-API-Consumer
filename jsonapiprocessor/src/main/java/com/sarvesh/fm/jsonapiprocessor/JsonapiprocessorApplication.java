package com.sarvesh.fm.jsonapiprocessor;

import com.sarvesh.fm.jsonapiprocessor.entities.Post;
import com.sarvesh.fm.jsonapiprocessor.entities.User;
import com.sarvesh.fm.jsonapiprocessor.repositories.PostStore;
import com.sarvesh.fm.jsonapiprocessor.repositories.UserStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**JsonapiprocessorApplication Class acting as the entry point to the application.
 * @author Sarvesh Shaha
 */
@SpringBootApplication
public class JsonapiprocessorApplication implements CommandLineRunner {

//	private static final Logger log = LoggerFactory.getLogger(JsonapiprocessorApplication.class);

	/**
	 * Main method where the Spring Application run method is called.
	 * @param args The command line arguments.
	 **/
	public static void main(String[] args) {
		SpringApplication.run(JsonapiprocessorApplication.class, args);
	}

//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}

	@Autowired
	private UserStore userStore;

	@Autowired
	private PostStore postStore;

	private RestTemplate restTemplate = new RestTemplate();

	/**
	 * Stores all the users from the JSON API call to the UserStore.
	 **/
	public void storeAllUsers(){
		User[]user = restTemplate.getForObject(
				"https://jsonplaceholder.typicode.com/users", User[].class);

		for (User userObj : user) {
			this.userStore.save(userObj);
		};

	};

	/**
	 * Stores all the posts from the JSON API call to the PostStore.
	 **/
	public void storeAllPosts(){
		Post[] post = restTemplate.getForObject(
				"https://jsonplaceholder.typicode.com/posts", Post[].class);

		for (Post postObj : post) {
			this.postStore.save(postObj);
		};
	};

	/**
	 * Run method which calls the methods for API calls and storage to repositories.
	 * @param args Default string args from the overriden method.
	 **/
	@Override
	public void run(String...args) throws Exception {

		storeAllUsers();
		storeAllPosts();
//		log.info(user[0].toString());




//		log.info(post[0].toString());

	}
}
