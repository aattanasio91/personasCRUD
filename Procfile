web: java -jar target/PersonasCRUD-0.0.1-SNAPSHOT.war --server.port=$PORT -Dspring.profiles.active=uat
release: ./mvnw flyway:clean && flyway:migrate -Dflyway.url=jdbc:postgresql://ec2-54-208-104-27.compute-1.amazonaws.com:5432/dagg0a691buav6 -Dflyway.user=xngeremwzvzwee -Dflyway.password=fd99d638f206f04bf73a69904cfde1673628d01cef1c86c147ff3e2daa46b42d
