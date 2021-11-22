public class Main {
    public static void main(String[] args) {
        LightSwitch lightSwitch = new LightSwitch();
        lightSwitch.printInfo();

        Dimmer dimmer1 = new Dimmer();
        dimmer1.setBrightness(80);
        dimmer1.printInfo();
    }
}
