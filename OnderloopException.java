
public class OnderloopException extends Exception {

    public  OnderloopException(int  uitkomst) {
        super("De som van " + uitkomst + " is onderloop");
    
    }
}
