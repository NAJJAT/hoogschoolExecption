public interface movable {
        
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();

    default public  void printer (){

        System.out.println("I am movable");
    }
}
