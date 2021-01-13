package FirstMavenPack;

public class JenkinsTestNGReportPlugin {
/*
 Refresh the maven project, go to target folder > surefire-reports > index.html > copy the location and paste in browser to view report.
 There is also another file called testng-results.xml that contains reports in xml format.
 
 First, we need to install the testng reporting plugin to Jenkins.
 Go to Manage Jenkins > Manage Plugins > Click on Available plugins tab > Search for TestNG Results > Select the plugin and install
 > Once installed, you can see the plugin in Install tab.
 
 Then, go to dashboard> select the project > Configure (on LHS) > Scroll down to Post-build Action > (The TestNG plugin will
 be a part of the Post-build Action) > Select 'Publish TestNG Results' > automatically the testng.results.xml file
 will be prepopulated here.
 
 IMPORTANT: Configure project > General > Advanced > Custom Workspace > Provide complete path of Maven project
 Then, in Post-build action > Publish TestNG Results > provide the path **///target/surefire-reports/testng-results.xml
/*Thus, from now on reports will be generated when you run the build.
 After Build Now, when the build is run and completed, you will see 'TestNG Results' link.
 
 Click on the link to see the report. Then, click on the build number to see further report. package wise.
 Click on the package name > gives details of the classes and methods test run/status > If you click on a particular class>
 gives details of the methods inside the class
 
 You can also see the trends/graphs of the last builds, 'TestNG Results Trend'
 
 To Schedule a job:
 In Configure > Build Triggers > Build periodically > Schedule > 15	6	*	*	*
 Jenkins expects 5 parameters sequentially.
 MINUTES, HOURS, DAY, MONTH, DAYWEEK
 0	6	*	*	*  //If you do not want to specify any parameter, give a * (here, run the build at 6:00 AM)
 15	8	*	*	*  // run the build daily at 8:15 AM (Any Day, any Month, any Dayweek)
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
