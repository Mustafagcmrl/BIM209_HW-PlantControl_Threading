package ogr.mgProject;

public abstract class sensor {

    private int environment;
    THenvironment e;

    public sensor(THenvironment e){
        this.e = e;
    }

    public int getValue(){
        //Must be overridden in the class that extends sensor
        return 0;
    }
}
