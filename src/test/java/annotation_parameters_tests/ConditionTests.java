package annotation_parameters_tests;

import org.testng.annotations.*;

public class ConditionTests {

    @BeforeSuite(alwaysRun = true)
    public void test1() {
        System.out.println("I'm before suite");
    }

    @BeforeTest(alwaysRun = true)
    public void test2() {
        System.out.println("I'm before Test");
    }

    @BeforeClass(alwaysRun = true)
    public void test3() {
        System.out.println("I'm before class");
    }

    @BeforeGroups({"test1", "test2"})
    public void test4() {
        System.out.println("I'm before groups");
    }

    @BeforeMethod(alwaysRun = true)
    public void test5() {
        System.out.println("I'm before method");
    }

    @AfterSuite(alwaysRun = true)
    public void test6() {
        System.out.println("I'm after suite");
    }

    @AfterTest(alwaysRun = true)
    public void test7() {
        System.out.println("I'm after Test");
    }

    @AfterClass(alwaysRun = true)
    public void test8() {
        System.out.println("I'm After class");
    }

    @AfterGroups({"test1", "test2"})
    public void test9() {
        System.out.println("I'm After groups");
    }

    @AfterMethod(alwaysRun = true)
    public void test10() {
        System.out.println("I'm After method");
    }

    @Test(groups = {"test1"})
    public void test11() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("I'm IN test 1 ");
    }

    @Test(groups = {"test2"})
    public void test12() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("I'm IN test 2 ");
    }

}
