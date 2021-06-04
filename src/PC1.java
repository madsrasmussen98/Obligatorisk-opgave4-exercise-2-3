public class PC1 extends PC {
    public PC1(String modelname){
        super(modelname);
    }

    //this pc´s special feature is that it is able to change colors inside the casing
    public void ambientLighting(String color){
        System.out.println("changing ambient lighting to " + color);
    }
}

