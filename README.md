Application was build with Java 11, Spring Boot, Maven 3.6.2, IntelliJ, H2 Database

Manual:
1. Clone git repository to your folder
2. Open command line
3. Go to the folder of the project
4. Use command "mvnw spring-boot:run	

Application is running :)

To fully test REST API, I suggest to use Postman
(You can use any other platform that You like)

Methods and endpoints to check:

GET - http://localhost:8080/words - to see the collection of words.

GET - http://localhost:8080/words/unique - to receive unique words from collection.

GET - http://localhost:8080/words/check/Limitless - to receive the number of appearances of the word
						Use any other word in place of "Limitless" to check if
						it exists in collection.

DELETE - http://localhost:8080/words/5 - to delete word by it's ID number.

POST  - http://localhost:8080/words - and You need to add JSON code to Body.
For example:
{
     "word": "Limitless"
}

