package FirstMavenPack;

public class JenkinsIntro {
/*
 Jenkins is a Continuous Integration tool developed for automating all the daily tasks.
 Jenkins runs on its own server/environment, we need to set up java, maven and testNG versions on which we want to run.
 Thus, the versions on our local machine and the versions on Jenkins may be different.
 May be updated the versions on our local machine but Jenkins versions remain same.
 
 You have 500 test cases with you, to run them you need to manually run the testNG or Maven commands.
 This is also a manual task.
 We need a scenario where tests are triggered automatically without manual intervention. We should not even give any
 command or run any file from eclipse.
 Example: I can schedule my test cases to run at 2:00 AM in the morning daily.
 My scripts may take 7 hrs. So by the time I reach office at 9 AM, they are completed.
 
 In Jenkins, we can create a job to trigger these test cases at 2:00 AM.
 Jenkins has nothing to do with the test cases, it hits the maven command at the scheduled time.
 Jenkins only know to execute given scripts, using Jenkins Job.
 
Also, if business wants to know about the progress/status of test case execution, they can just login to the jenkins
and see the status of the related Jenkins job > Click on Build Now
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
