public class Main {
    public static void main (String[] args){
        Men men = new Men("Alex",15,1);
        Cat cat = new Cat("Ada", 20, 3);
        Robot robot = new Robot("Z1", 30, 5);

        Treadmill[] treadmills ={ new Treadmill(100), new Treadmill(100),
                                 new Treadmill(100), new Treadmill(100),
                                 new Treadmill(100)};

        Wall[] walls ={ new Wall(1), new Wall(3), new Wall(5),
                       new Wall(3), new Wall(1)};

        for (Wall wall : walls){
            System.out.println(wall.whoJumped(men));
            System.out.println(wall.whoJumped(cat));
            System.out.println(wall.whoJumped(robot));
            System.out.println("---------------------");

        }
    }
}
