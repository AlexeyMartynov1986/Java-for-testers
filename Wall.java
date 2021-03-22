public class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public double whoJumped (CanBounce jumper){
       return jumper.bounce(height);
    }
}
