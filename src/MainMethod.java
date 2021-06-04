public class MainMethod {
    public static void main(String[] args) {
        //Instantiating the pc´s and demonstrating their special ability
        PC1 pc1variable = new PC1("ahxz345");
        pc1variable.turnOnPc();
        pc1variable.ambientLighting("purple");

        PC2 pc2variable = new PC2("Balexa");
        pc2variable.turnOnPc();
        pc2variable.voiceactivation();

        PC3 pc3variable = new PC3("smoothtooth");
        pc3variable.turnOnPc();
        pc3variable.bluetooth();
    }

}
