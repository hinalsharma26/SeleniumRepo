package FirstMavenPack;

public class MavenProfiling {
/*
 If you have multiple testng xml files say, one for Smoke tests and other for Regression test, there can be different req to
 run these test suites at different times.
 How do you manage those in Maven?
 We will build profiles in Maven pom.xml file. Use <profiles> 	<profile>  <id> tag
 <profiles> is a parent, under which you can have multiple <profile>
 Place the complete <build> code inside the profile tag. Example:
<profiles>
  <profile>
   <id> Regression </id>
     <build> .....
     ......						// inside the build tag, enter the testng xml file that refers to the regression test suite
     </build>
   </profile>
   
   <profile>
   <id> Smoke </id>
     <build> .....
     ......						// inside the build tag, enter the testng xml file that refers to the Smoke test suite
     </build>	
   </profile>
</profiles>

 The command for profiling is:
 mvn test -P				// Write the profile name next to P
 mvn test -PRegression
 mvn test -PSmoke
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
