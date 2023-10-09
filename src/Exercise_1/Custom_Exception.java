package Exercise_1;

public class Custom_Exception extends RuntimeException {
    public Custom_Exception () {
        super("il numero inserito non rientra nel range");
    }
}
