package Tests;

import Controller.Controller;

public class AllTests
{
    /**
     * Runs all tests and menu
     */
    public void run()
    {
        runPart1();
        runPart2();
        runPart3();
        runController();
    }

    /**
     * Runs method from TestPart1 class
     */
    private void runPart1()
    {
        new TestPart1().run();
    }

    /**
     * Runs method from TestPart2 class
     */
    private void runPart2()
    {
        new TestPart2().run();
    }

    /**
     * Runs method from TestPart3 class
     */
    private void runPart3()
    {
        new TestPart3().run();
    }

    /**
     * Runs method from Controller class
     */
    private void runController()
    {
        new Controller().run();
    }
}
