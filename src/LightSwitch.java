public class LightSwitch {
    protected boolean lightsOn;

    public LightSwitch() {
        this.lightsOn = lightsOn;
    }

    public void printInfo(){
        if (lightsOn){
            System.out.println("Lights are on.");
        } else System.out.println("Lights are off.");
    }
}

class Dimmer extends LightSwitch{
    int brightness;

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        lightsOn = brightness > 0;
    }

    @Override
    public void printInfo() {
        if (lightsOn)
            System.out.println("Brightness is " + brightness + ".");
        else
            System.out.println("Lights are off.");
    }
}

class Utils{
    private int width;
    private int lenght;

    static void printTitle(){
        System.out.println("*******");
        System.out.println("* OOP *");
        System.out.println("*******");
    }

    static int areaCalc(int width, int lenght){
        return width * lenght;
    }
}