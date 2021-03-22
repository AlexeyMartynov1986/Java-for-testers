public class Men implements CanRun, CanBounce{
    private String name;
    private int maxSpeed;
    private int maxBounce;

    public Men(String name, int maxSpeed, int maxBounce) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.maxBounce = maxBounce;
    }

    @Override
    public void run(int length) {
        System.out.println("Человек бежит");
    }

    @Override
    public int bounce(int height) {
            System.out.println("Человек прыгает");
            if (height > 1) {
                System.out.println("Человек не перепрыгнул");
            }
            else {System.out.println("Человек перепрыгнул");}
        System.out.println("-------------");
        return height;
    }
}
