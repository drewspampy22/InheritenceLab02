import org.example.Person;
import org.example.SalaryWorker;
import org.example.Worker;

import java.util.ArrayList;

public class InheritenceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workerArrayList = new ArrayList<Worker>();
        Worker w1 = new Worker("Drew", "Spampinato", "000001", "Mr.", 2002, 40.50);
        Worker w2 = new Worker("Louis", "Nagy", "000002", "Mr.", 2005, 40.40);
        Worker w3 = new Worker("Nick", "Beavan", "000003", "Mr.", 2007, 40.00);
        SalaryWorker sw1 = new SalaryWorker("Chunyu", "Ye", "000004", "Ms.", 2008, 0, 120000);
        SalaryWorker sw2 = new SalaryWorker("Sean", "Gue", "000005", "Mr.", 2010, 0, 1000000000);
        SalaryWorker sw3 = new SalaryWorker("Ever", "Clear", "000006", "Dr.", 2011, 0, 1300030);

        workerArrayList.add(w1);
        workerArrayList.add(w2);
        workerArrayList.add(w3);
        workerArrayList.add(sw1);
        workerArrayList.add(sw2);
        workerArrayList.add(sw3);

        for (int i=0; i < workerArrayList.size(); i++)
        {

            if (!(workerArrayList.get(i) instanceof SalaryWorker))

            {
                Worker worker = (Worker) workerArrayList.get(i);
                System.out.println(worker.getFormalName());
                System.out.println(worker.displayWeeklyPay(50));
                System.out.println("\n");
                System.out.println(worker.displayWeeklyPay(70));
                System.out.println("\n");
                System.out.println(worker.displayWeeklyPay(100));
            }
            System.out.println("\n");
        }

    }
}