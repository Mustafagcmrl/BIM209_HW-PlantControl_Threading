package ogr.mgProject;

public class humiSensor extends sensor {

    public humiSensor(ogr.mgProject.THenvironment e) {
        super(e);
    }

    public int getValue(){
        return e.getHumi();
    }

}
