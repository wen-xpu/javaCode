package airFun;

public class TestFun {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setColor("yellow");
        fan1.setRadius(10.0);
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setColor("blue");
        fan2.setRadius(5);
        fan2.setOn(false);
        System.out.println("该风扇的速度，颜色和半径分别为："  + fan1.toString());
        System.out.println("该风扇的颜色和半径分别为："  + fan2.toString());
    }
}
