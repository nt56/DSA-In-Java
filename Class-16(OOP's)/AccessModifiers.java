public class AccessModifiers {
    public static void main(String[] args) {
        Pen1 p1 = new Pen1();

        p1.setColor("red");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}

class Pen1{
    public String color;
    private int tip;    //directly not accessible

    void setColor(String newColor){    //accessible only using function
        this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

}
