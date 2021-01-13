package FirstMavenPack;

public class JenkinsInstall {
/*
 Go to https://www.jenkins.io/download/ and download Generic Java package (.war) file.
 To start Jenkins server into your Windows machine, you need to give a command to cmd
 
C:\Users\hinal>cd C:\Program Files\Jenkins		//First go to the path/folder where the .war file is located

C:\Program Files\Jenkins>java -jar jenkins.war -httpPort=8080	//then give this command so Jenkins can be up and running
					// you can use any Port number, here I provided the http port number as 8080

If you have given 8080 as port, you can simply hit the url localhost:8080 in the browser

In real-time, we need to worry about Jenkins installation. The organization would already have it.

What all you need in Jenkins: java and Maven. (Since selenium and testNG jars are taken care by <dependencies> in Maven only)
In Jenkins > go to Manage Jenkins > Global Tool Configuration > Click on JDK installations > Copy the JDK path and paste in 
JAVA_HOME, also provide the name of java [Uncheck Install Automatically checkbox]

Do the same for Maven. THUS, we successfully configured Java and Maven in Jenkins.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
