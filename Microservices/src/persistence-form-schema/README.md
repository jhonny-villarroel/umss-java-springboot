#  Project Social Chat

## Build artifact

For build the artifact you need execute the console commands:

+ __Execute the following command to remove the target directory with all the build data before starting so that it is fresh__: 
```
mvn clean
```

+ __Execute the following command to compile your application sources__: 
```
mvn compile
```


+ __Execute the following command to make a JAR file of project__: 
```
mvn package
```

## Registry in EUREKA server
You can registry the service into EUREKA server but is necessary to run first this server on:
```
 http://localhost:8761/eureka/
```


## Run Project
To run mock.persistence.chat-1.0-SNAPSHOT.jar. you can use two console commands:

+ __Run the project with port default 8898__: 

```
 java -jar  mock.persistence.chat-1.0-SNAPSHOT.jar
```

+ __Run the project with port assigned__: 

```
 java -Dserver.port=9090 -jar  mock.persistence.chat-1.0-SNAPSHOT.jar
```

## Swagger Browser Url
The Swagger browser is available on:

```
http://localhost:8898/swagger-ui.html/
```
