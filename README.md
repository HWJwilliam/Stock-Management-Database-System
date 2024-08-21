# Stock-Management-Database-System

👋 Hello! This is a command line application coded in Java with back end data processed and stored in PostgreSQL (we did not include a GUI because of the time limitation qwq).

🎯 The goal of this project is to let users manage and record stocks they bought or interested, access relevant statistics or share related stock informations to other user by making friends with other users.

🧐 Features such as requesting/managing friends, creating/modifying/sharing stock lists containing stocks, buying/selling stock on portfolio and generating statistics (beta, COV, covariance and correlation matrices) are implemented with mostly SQL in the backend instead of pulling them to Java for efficiency.

### 🔧 How to use

1. Before running, create a database on any platform you like (cloud platform/local postgreSQL application) called "mydb". 
2. Create all the tables required to store data using the code in the document "main/create.sql".
3. Go to the file "main/pgsample/src/main/java/cs/toronto/edu/utils/Helper.java", change the line "**conn = DriverManager.getConnection("jdbc:postgresql://34.122.21.19:5432/mydb", "postgres", "postgres");**" with the correct IP address and the port number.
4. Run the program, you can do this by running the file "main/BuildAndRun.sh". If you are running your database locally, you can also do this by running the file "main/pgsample/src/main/java/cs/toronto/edu/Main.java".

### 🤓 Techniques used

* ER design
* Relational Schema Design
* Normalisation
* SQL Implementation
* Software Design Principles

### 📦 Java Packages

* JavaFX
