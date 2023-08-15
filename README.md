
<h1> Chat Application </h1>

Your goal for this assignment will be to build an interacting chat application that allows multiple users to talk with each other via chat text messages. This will be just like a simple version of Slack.

To get started, visit start.spring.io and create a Java 11 Spring Boot application with Spring Web + Thymeleaf dependencies.

For this assignment, it is not required to implement a MySQL database as a repository for all the data. You can just store any data inside of Java Collections (within concrete Repository classes).

The UI for this application is going to be simple and will consist of two HTML files:

1.       A Welcome page where a user will be prompted to enter their name (if not already specified), and a list of Channels will be shown for them to “join” and chat with others

2.       A Channel page where the actual chats will take place. Note that there can be multiple channels, and messages sent inside of each channel should only be displayed in their respective channels (just like Slack channels)
