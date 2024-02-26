package ogr.mgProject;

public class tempSensor extends sensor {

    public tempSensor(ogr.mgProject.THenvironment e) {
        super(e);
    }

    public int getValue(){
        return e.getTemp();
    }

}
