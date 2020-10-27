import java.io.IOException;
public enum CarState {
    DRIVING , WAITING ,PARKING;
    public static CarState from(String state) 
    {
        switch(state)
        {
            case "DRIVING":
                return DRIVING;
            case "WAITING":s
                return WAITING;
            case "PARKING":
                return PARKING;
            default:
                throw new RuntimeException("Unknown state " + state);
            
        }
    }

}