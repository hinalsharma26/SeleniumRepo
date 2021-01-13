package FirstMavenPack;

public class TestNGMavenIntegration {
/*
 To execute all test cases from src/test/java folder using maven: use mvn test command, the classes name must end with 
 keyword 'Test' to be executed. (Here, testNG is not integrated with Maven)
 
Now, How to trigger TestNG xml file using Maven?
> Create a testNG xml file  (Right click on the project > TestNG > Convert to TestNG). 
testng.xml is created under the target folder

> Go to maven surefire documentation (https://maven.apache.org/surefire/maven-surefire-plugin/)
On the left panel, click on 'Using TestNG', on RHS you will see details (dependencies) for Configuring TestNG with Maven.
You need to place this dependency in the maven pom.xml file (which we have did already)
So, we are all set that our Maven recognizes TestNG.

> To provide the TestNG file to maven
On the same documentation (https://maven.apache.org/surefire/maven-surefire-plugin/), scroll down to 
'Using Suite XML Files' section. Here. observe that the GroupID, ArtifactID and version of surefire we've already
provided to the pom.xml. So, we need to now provide the additional <configuration> part to the pom.xml.

Now, copy and paste this <configuration> section to our pom.xml.

Doing this, WILL ONLY RUN THE TESTNG XML FILES. This configuration will override the includes and excludes 
patterns and run all tests in the suite files.

You can give/change the name and location of the testng xml file in <suiteXmlFile> tag. If it is at the project/parent level,
you can directly give the file name here.
<suiteXmlFile>testng.xml</suiteXmlFile>

Maven, using mvn test, will run the pom.xml file. This file contains the testng.xml file, so
it will follow all the instructions given in the testng.xml file and run the test cases accordingly.

Apart from the cmd prompt, you can also run the maven project by right click on Project > Run As > Maven test

If the testng.xml file contains classes that does NOT have the keyword '.Test' at the end, it WILL STILL BE EXECUTED.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
