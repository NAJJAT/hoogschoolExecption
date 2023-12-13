public class Car implements movable, selfDrivabel{



    private int x,y ;
    private int numveridpassenger ;

        public Car( int x, int y) {
            this.x = x;
            this.y = y;
        
        }
    public Car(){}


    @Override
    public void moveUp() {
        // TODO Auto-generated method stub
        y--;
    }

    @Override
    public void moveDown() {
        // TODO Auto-generated method stub
        y++;
    }

    @Override
    public void moveLeft() {
        // TODO Auto-generated method stub
        x--;
    }

    @Override
    public void moveRight() {
        // TODO Auto-generated method stub
      x++;
    }


    @Override
    public void destination(String d) {
        // TODO Auto-generated method stub
        System.out.println("Destination: " + d);
    }


    @Override
    public void drive() {
        // TODO Auto-generated method stub
            System.out.println("Car is driving");
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
}
    

    