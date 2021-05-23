# sarvesh-fm-api-consumer

A Spring Boot + React application which consumes data from https://jsonplaceholder.typicode.com/.

The application can be accessed at the following URL:
http://sarvesh-fm-api-consumer.s3-website-ap-southeast-2.amazonaws.com/

The application documentation can be viewed here:
http://sarvesh-fm-api-user-documentation.s3-website-ap-southeast-2.amazonaws.com/index.html
Documentation is powered by Javadoc

The APIs ("/users", "/posts") - are first consumed by the Spring application which maps the JSON object returned to Java objects.

The Java objects are then accessible as a part of a repository/store using Spring Boot API calls - "/api/users", and "/api/posts"

The React Frontend then makes the above mentioned API calls and the Users and their respective Posts are then mapped, rendered, and displayed in a user friendly way.

The Spring Application is hosted with AWS Beanstalk, and the React application + Documentation are hosted with AWS S3.

As mentioned earlier, the applicaiton is directly accessible, but if you need to run it in local - please follow the following steps:

1. Install Intellij IDEA IDE
2. Open jsonapiprocessor as a Project
3. ![image](https://user-images.githubusercontent.com/35260770/119262758-845be880-bc30-11eb-8f37-278d6f948c6e.png)

   Edit Configurations and add Build and Run configs as follows:
   
   ![image](https://user-images.githubusercontent.com/35260770/119262885-e74d7f80-bc30-11eb-84e2-7372cfb5b248.png)
   
   ![image](https://user-images.githubusercontent.com/35260770/119262927-13690080-bc31-11eb-9590-6b51e63c1c40.png)
   
4. Make sure that nothing else is running on Port 8080 of localhost
5. Build
6. Run

For React Frontend:

1. Install Node.js and npm - https://nodejs.org/dist/v14.17.0/node-v14.17.0-x86.msi
2. Switch to the jsonapiprocessor/src/main/ui folder
3. cmd - Open terminal in this folder and type and click enter - npm start

Go to localhost:3000 to access the application.

Thank you.
