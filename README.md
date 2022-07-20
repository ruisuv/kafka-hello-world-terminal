# kafka-hello-world-terminal
> Hello World for using on Terminal Workshop

## Pre requisites 
Docker and Docker compose

1. Linux

    `apt-get install docker`
2. MacOS

   `brew install --cask docker`


## Installation
1. Setup Kafka and Zookeeper

    `cd src/main/resources/ &&  docker-compose up -d && cd -`
2. Build the jar

   `./mvnw clean install`
3. Run the jar

    `java -jar target/*.jar`

