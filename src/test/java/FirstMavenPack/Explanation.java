package FirstMavenPack;
//IMPORTANT: If you want Maven to recognize your tests under src/test/java folder, then all your java class files should end with
//  Test keyword...
public class Explanation {
/*
 Before executing test cases in maven project, you need to configure all the dependencies (of the test cases) in pom.xml file.
 1. For that, go to mvnrespository.com, type Selenium in the search box, > Select Selenium Java
 Click on the version number link > copy the <dependency> xml from the bottom, paste it in the pom.xml file >
 Under the parent tag <dependencies> . The dependencies tag will have all the dependency.
 
 2. We can remove the Junit <dependency> fromt he pom.xml if we are not going to work on it.
 
 3. Now, again go to mvnrespository.com, type testNG in the search box, > Select TestNG > Click on version no. link >
 copy the <dependency> tag from the bottom and paste it in the pom.xml file under the parent tag <dependencies> 
 
 4. Also, change the url in url tag to http://maven.apache.org in pom.xml
 From:  <url>http://www.example.com</url>
 To:    <url>http://maven.apache.org</url>
 
 5.  Now, how to execute test cases in Maven project?
 Maven surefire plugin is used to execute all your test cases in Maven project, in test folder (src/test/java)
 You need to dump the surefire Plugin in pom.xml file.
 How? : Go to google > type maven surefire plugin > click on https://maven.apache.org/surefire/maven-surefire-plugin/ >
 click on 'usage' on the left panel > you will see the plugin information on the RHS > Copy the information from <build> tag >
 and paste it in the pom.xml file above the <dependencies> parent tag
 
 6. If you want to define multiple plugins, add them under parent tag <plugins>. Example:
<plugins> 	
 	<plugin>
          <artifactId>maven-compiler-plugin</artifactId>
          <version>3.8.0</version>
    </plugin>
        
    <plugin>
          <artifactId>maven-install-plugin</artifactId>
          <version>2.5.2</version>
    </plugin>
</plugins>
 */

}
