package ogr.mgProject;

public class THenvironment implements Runnable{

    private int temp;
    private int humi;
    private Thread t;

    public THenvironment(){
        this.temp = (int)(Math.random()*40-20);
        this.humi = (int)(Math.random()*100);
    }


    public int getTemp(){
        return this.temp;
    }

    public int getHumi(){
        return this.humi;
    }

    @Override
    public void run() {

        try{
           while(true){
               this.temp += ((int)(Math.random()*3))-1;
               this.humi += ((int)(Math.random()*3))-1;
               //System.out.println("**threading**");
               Thread.sleep(200);
           }
        }

        catch (Exception e){
            System.out.println(e);
        }
    }

    public void start(){
        if(t==null){
            t = new Thread(this, "environmentConditions");
            t.start();
        }
    }
}
