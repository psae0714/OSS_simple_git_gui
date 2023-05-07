package jgitmanager;

import org.eclipse.jgit.api.errors.GitAPIException;

import java.io.File;
import java.io.IOException;

public class JGitTester {
    public static String testPathDotGit = "C:\\Users\\BAEKSE~1\\AppData\\Local\\Temp\\TestGitRepo7066676561043817265\\.git";
    public static String testPath = "C:\\Users\\BAEKSE~1\\AppData\\Local\\Temp\\TestGitRepo7066676561043817265";
    public static String testFile = testPath+"\\src\\src\\a.txt";

    public static void main(String args[]) {
        System.out.println("Hello World from JGitTester");
        JGitTester tester = new JGitTester();
        JGitManager jGitManager = new JGitManager();
        //tester.gitInitTest(jGitManager);
        tester.gitRestoreStagedTest(jGitManager);
        //tester.gitRestoreTest(jGitManager);
        //tester.gitMvTest(jGitManager);
    }

    public void gitInitTest(JGitManager jGitManager) {
        File tempPath;
        try {
            tempPath = jGitManager.createTempPath();
            jGitManager.gitInit(tempPath);
        } catch (IOException e) {
            System.out.println("Cannot create temp path: " + e.toString());
            return;
        }catch (GitAPIException e){
            System.out.println("Cannot git init temp path: " + e.toString());
        }
    }

    public void gitRestoreTest(JGitManager jGitManager){
        try {
            //jGitManager.gitRestore(new File(testPath+"\\test.txt"),new File(testPathDotGit));
            jGitManager.gitRestore(new File(testFile),new File(testPathDotGit));

        } catch (Exception e) {
            System.out.println("An error ocurred: " + e.toString());
        }
    }

    public void gitRestoreStagedTest(JGitManager jGitManager){
        try {
            //git restore --staged
            jGitManager.gitRestoreStaged(new File(testFile),new File(testPathDotGit));

        } catch (Exception e) {
            System.out.println("An error ocurred: " + e.toString());
        }
    }

    public void gitMvTest(JGitManager jGitManager){
        try {
            //git restore --staged
            //jGitManager.gitMv(new File(testPath+"\\test.txt"),"k.txt",new File(testPathDotGit));
            jGitManager.gitMv(new File(testFile),"b.txt",new File(testPathDotGit));

        } catch (Exception e) {
            System.out.println("An error ocurred: " + e.toString());
        }
    }
}
