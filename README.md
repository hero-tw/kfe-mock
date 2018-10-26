# KFE Mock
This project exposes a /score endpoint which returns:
 - "0" if the supplied date of birth is less than 18 years from the current date 
 - "100" otherwise.
 
### Sample Request
{"dateOfBirth": "1999-10-24"}

### Building and running application
* To build and run the application locally:
  * `./gradlew bootRun`
* To build and have a docker image be built:
  * `./graldew build docker`
  * This will produce a docker images tagged with '<docker.name in build.gradle>/com.hero/kfe-mock'

