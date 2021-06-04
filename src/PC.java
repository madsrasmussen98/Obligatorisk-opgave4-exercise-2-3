//I own a pc company and i want to sell Pc´s with different features that caters to my buyers needs, but to start off
//I first have to make a base pc that has functions that i know all the different pcs will need
public class PC {
private final int ramsize = 16;

    public PC(String modelname){
    }
    //giving the pc simple functions to demonstrate methods
    public static void turnOnPc() {
        System.out.println("Booting system");
    }

    public static void turnOffPc() {
        System.out.println("Shutting down");
    }

    public static void usbConnected() {
        System.out.println("Usb connected");
    }

    public static void usbDisconnected() {
        System.out.println("Usb disconnected");
    }
}