package FirstMavenPack;
/* INTEGRATE JENKINS WITH MAVEN
 To create a new job to recognize our java-maven project, click on New Item > Enter Job name > Select Freestyle project
 (as a common project) > click on OK.
 It opens a job configuration window. Here you need to provide all the information related to the Java-Maven project 
 and to execute this project.
 1. Generic - No details entered
 2. Source Code Management - Select None (If you use Git for pushing code, you can select that)
 3. Build Triggers - Select Build Periodically IF you want to schedule your test cases
 4. Build Environment- None
 5. Build- Select Add build step > Invoke top-level Maven targets > Select 'Maven' in Maven Version drop-down > 
    in Goals, provide the cmd command that we want to perform (mvn test OR mvn clean, etc.)
    Here, we do not need to mention the 'mvn' command, so just 
    enter 'test' OR 'test -PRegression' OR 'clean test'  OR 'clean test -PSmoke'  etc..
    Click on Advanced > and provide the pom.xml path in the POM field.
 6. Post-build action > You can select Email notification/ Publish test result reports after the build action is performed.
 7. Save
 8. Then, Go to the Dashboard > Select this project > Click on Build Now on the LHS panel
 9. This will perform the command that you mentioned in 'Goals' field in maven pom.xml project
 10. Click on the build history date-time > This takes you to build details page
 11. Click on Console Output on the LHS panel to see the output of your build run
 12. The results of the run are stored in the 'target' folder
 */
public class JenkinsWorkspace {

}
