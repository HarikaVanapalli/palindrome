FROM openjdk:13

WORKDIR /app

ADD Palindrome.jar /app/Palindrome.jar

CMD ["java","-jar", "Palindrome.jar" ]