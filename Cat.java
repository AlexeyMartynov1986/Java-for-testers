public class Cat implements CanRun, CanBounce {
    private String name;
    private int maxSpeed;
    private int maxBounce;

    public Cat(String name, int maxSpeed, int maxBounce) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.maxBounce = maxBounce;
    }

    @Override
    public int bounce(int height) {
        System.out.println("Кот прыгает");
        if (height > 3) {
            System.out.println("Кот не перепрыгнул");
        } else System.out.println("Кот перепрыгнул");
        System.out.println("-------------");
        return height;
    }


    @Override
    public void run(int length) {
        System.out.println("Кот бежит");
    }
}

