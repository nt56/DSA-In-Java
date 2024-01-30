public class Demo {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setColor("red");
        p.setTip(5);
        System.out.println(p.color);
        System.out.println(p.tip);
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}
