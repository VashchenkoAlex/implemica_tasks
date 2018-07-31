package tasks_with_tests;


import tasks_with_tests.changer.VarsChanger;

/**
 * Start class for Vars Changer app
 */
public class App
{
    /**
     * Start method for Vars Changer app
     * @param args - run parameters
     */
    public static void main( String[] args ) {
        VarsChanger changer = new VarsChanger();
        changer.run();
    }
}
