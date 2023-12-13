public  class som  {  

    private int getal1;
    private int getal2;
    private final int overloop = 100;
    private final int onderloop = 0;

    public som() {

    }

    public som(int getal1, int getal2) {
        this.getal1 = getal1;
        this.getal2 = getal2;
    }

    public int berekenSom() throws OnderloopException, BovenloopException {
        int res = getal1 + getal2;

        if (res > overloop) {
            throw new BovenloopException();
        } else if (res < onderloop) {
            throw new OnderloopException(res);
        }
        return res;
    }
}
        
