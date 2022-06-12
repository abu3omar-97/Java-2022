package Week13.Excel;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws InterruptedException {
        WorkBook w1 = new WorkBook("Salaries", "Yaman");
//        System.out.println(w1.title);
//        System.out.println(w1.author);
//        System.out.println(w1.path);
//        System.out.println(w1.dateCreated);
//        System.out.println(w1.dateEdited);
//
//        TimeUnit.SECONDS.sleep(3);
//
//
//        w1.createSheet();
//        System.out.println(w1.dateCreated);
//        System.out.println(w1.dateEdited);

        w1.createSheet();
        w1.saveFile("sdfsdfsdf");
        w1.saveFile("sdfsdfsdf");
    }
}
