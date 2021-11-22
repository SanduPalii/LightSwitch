public class LightSwitch {
    private boolean lightsOn;

    public LightSwitch() {
        this.lightsOn = false;
    }

    public void printInfo(){
        if (lightsOn){
            System.out.println("Lights are on");
        } else System.out.println("Lights are off");
    }
}
