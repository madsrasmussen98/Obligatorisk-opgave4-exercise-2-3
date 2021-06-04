public class PC2 extends PC {


    public PC2(String modelname){
        super(modelname);
    }


    //this pc´s special feature is that it can respond to voice commands
    public void voiceactivation(){
        System.out.println("Voice activation initiated!");
    }
}
