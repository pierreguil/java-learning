import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {



        List<Developer> developers = new ArrayList<>();
        Developer pierre = new Developer("Pierre", 46, true);
        Designer designer = new Designer();
        List<Worker> workers = new ArrayList<>();
        workers.add(pierre);
        workers.add(designer);
        for (Worker worker : workers){
            System.out.println(worker.work());
        }

        Person personne = new Developer("Paul", 35, true);

        Payable payable = pierre;
        System.out.println(payable.getSalary());




    }


}