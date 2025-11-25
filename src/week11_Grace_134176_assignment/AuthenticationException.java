package week11_Grace_134176_assignment;

public class AuthenticationException extends Exception {
    public AuthenticationException() {
        super("Autentikasi gagal!");
    }

    public AuthenticationException(String msg) {
        super(msg);
    }
}