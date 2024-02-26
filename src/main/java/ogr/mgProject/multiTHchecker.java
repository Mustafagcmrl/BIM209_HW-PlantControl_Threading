package ogr.mgProject;

import java.util.Objects;
import java.util.Scanner;

public class multiTHchecker implements Runnable{

    Scanner sc = new Scanner(System.in);
    private Thread t;
    private sensor temp;
    private sensor humi;

    public multiTHchecker(sensor temp, sensor humi){
        this.temp = temp;
        this.humi = humi;
    }

    @Override
    public void run() {
        String st = "";
        while (true) {
            System.out.println(st);
            st = sc.next();
            if (st.equals("stop")) {
                System.out.println("Thread has been stopped by user.");
                this.t.stop();
            }
        }
    }
    public void start(){
        if(t==null){
            t = new Thread(this,"checker");
            t.start();
        }
    }
}
