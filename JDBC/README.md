We are starting with JDBC (Java DataBase Connectivity here.

I am using Postgresql as my database.

You can download it from here -> { https://www.postgresql.org/download/ }

Follow the steps shown in the installer and don't forget to set your password to access the databases. 
In general, the password must be strong and difficult to crack, but since this is for practice, you can choose basic ones too. (Like 0000)

Default port number for postgres db is 5432, and don't change it.

Just create one database and a table manually from PgAdmin4 which will be installed from the installer.
Reference to create db and table -> { https://youtu.be/-2foYlnnOVY?si=cTjQBfBEvHMq9DgI }

Your postgres database setup is done.


Coming to IDE, I have used Intellij Idea. Now to establish the connection we need postgres jdbc driver which is a jar file.

Download it from here -> { https://jdbc.postgresql.org/download/ } or you can search it in the mvnrepository -> { https://mvnrepository.com/artifact/org.postgresql/postgresql }

Now, you need to add this into your IDE. Refer this video on how to add them -> { https://youtu.be/jJ9i0Mi3Ryw?si=UKJELn685qnmi0Z0 }
