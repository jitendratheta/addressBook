# Address Book, Add and Search

Add contacts in address boook and search over it

## Introduction

This project simply takes input of name and create a address book which can be searched on first name or last name with string match.

### Prerequisites

One need to have Java 8 installed on the their system. It can be checked on console by command.

```
java -version
```

## Building and Running

[Maven](https://maven.apache.org/) is used as a build tool for the project. 
Jar from the project can be created by running following command from root directory of the project. 

```
mvn clean install
```
This will generate jar file at path ./target/addressBook-1.0-SNAPSHOT.jar

And for running the project one can run following from root directory

```
mvn exec:java -Dexec.mainClass="com.test.App"
```
Or can be run through jar as below from root directory

```
java -jar ./target/addressBook-1.0-SNAPSHOT.jar
```

Alternatively, if Maven is not present then go the directory src/main/java/com/test.
Compile and run using following command

```
javac -d . *.java
java com.test.App
```

###Sample run
```
➜  addressBook git:(master) ✗ java -jar ./target/addressBook-1.0-SNAPSHOT.jar
1) Add Contact 2) Search 3) Exit
1
Enter Name: chris
1) Add Contact 2) Search 3) Exit
1
Enter Name: Harry Potter
1) Add Contact 2) Search 3) Exit
1
Enter Name: chris harris
1) Add Contact 2) Search 3) Exit
2
Enter Name: har
chris harris
Harry Potter
1) Add Contact 2) Search 3) Exit
2
Enter Name: chrs
1) Add Contact 2) Search 3) Exit
2
Enter Name: chr
chris
chris harris
1) Add Contact 2) Search 3) Exit
3
Happy Searching
```

## Built With

* [Maven](https://maven.apache.org/) - Java project build tool

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests.


## Authors

* **Jitendra Kushwaha** - *jitendra.theta@gmail.com* 


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

