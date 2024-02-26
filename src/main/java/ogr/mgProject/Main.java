package ogr.mgProject;

public class Main {
    public static void main(String[] args) {

        THenvironment e = new THenvironment();
        e.start();

        sensor temp = new tempSensor(e);
        sensor humi = new humiSensor(e);

        sensor sensors[] = new sensor[2];
        sensors[0] = temp;
        sensors[1] = humi;

        for(int i=0;i<sensors.length;i++){
            System.out.println(sensors[i].getValue());
        }


        multiTHchecker ch = new multiTHchecker(temp,humi);
        ch.start();

        while(true){
            System.out.println("temperature is: " + temp.getValue());
            System.out.println("humidity is: " + humi.getValue());
            System.out.println("---------------------------------------");

            try{
                Thread.sleep(1000);
            }
            catch (Exception ex){
                System.out.println(ex);
            }
        }
    }
}