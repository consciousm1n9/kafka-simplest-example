# kafka-simplest-example
Simplest kafka example based on docker container.

This example consists in Kafka and zookeeper docker containers and a producer/consumer springboot proyect for test. A simple object model called "User" is produced/consumed using default String-json serialization.

Instruction:
1. For run Kafka and zookeeper containers execute next command into root path of this repository: 
                    docker-compose up
For the first time wait for complete download image and finish execution.


2. Open java proyect with your favorite IDE, execute a 'maven update' for download libraries needed and run application. This will execute too a consumer thread.

3. For produce message to kafka send a post request like this:
                  http://localhost:8080/kafka/first?name=Name&age=40

You will see producer and consumer messages in console.
![image](https://user-images.githubusercontent.com/67773113/162332090-faee582f-aa28-4d95-8f0e-9c880abee509.png)

For GUI view you can use Kafka tool\Offset Explorer (https://www.kafkatool.com/download.html) and connect with next configuration:
![image](https://user-images.githubusercontent.com/67773113/162332572-b2e13564-4449-4110-9dfe-33971bc8fd4e.png)

![image](https://user-images.githubusercontent.com/67773113/162332606-263473bb-af89-4166-bd02-6953690cd411.png)

![image](https://user-images.githubusercontent.com/67773113/162332686-c534bc3f-7a6a-4f0c-8097-90681d038c4c.png)
