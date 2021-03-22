public class Robot implements CanRun, CanBounce {
    private String name;
    private int maxSpeed;
    private int maxBounce;

    public Robot(String name, int maxSpeed, int maxBounce) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.maxBounce = maxBounce;
    }

    @Override
    public int bounce(int height) {
        System.out.println("Робот прыгает");
        if (height > 5) {
            System.out.println("Робот не перепрыгнул"); }
        else {System.out.println("Робот перепрыгнул");}
        System.out.println("-------------");
        return height;
    }

    @Override
    public void run(int length) {
        System.out.println("Робот бежит");
    }
}