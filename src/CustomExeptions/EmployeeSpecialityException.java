package CustomExeptions;

import java.security.PublicKey;

public class EmployeeSpecialityException extends Exception{
    public EmployeeSpecialityException(String message){
        super(message);
    }
}
