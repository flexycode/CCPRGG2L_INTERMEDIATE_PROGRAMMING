public class App {

    public static void main(String[] args) throws Exception {

        Registration reg = new Registration();

        // Thread 1
        StudentThread student1 = new StudentThread(reg, "Jay");
        // Thread 2
        StudentThread student2 = new StudentThread(reg, "Gab");
        // Thread 2
        StudentThread student3 = new StudentThread(reg, "Ani");

        // Start thread 1
        student1.start();
        // Start thread 2
        student2.start();
        // Start thread 3
        student3.start();
    }

}