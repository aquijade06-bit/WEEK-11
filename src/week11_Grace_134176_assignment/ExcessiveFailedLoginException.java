package week11_Grace_134176_assignment;

public class ExcessiveFailedLoginException extends Exception {
    public ExcessiveFailedLoginException() {
        super("Anda telah mencapai jumlah batas login");
    }

    public ExcessiveFailedLoginException(String msg) {
        super(msg);
    }
}