import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Students {
    public String fullName;
    public int schoolnumber;
    public int point;

    public Students(String name, String surname, int schoolnumber) {
        fullName = name + " " + surname;
        this.schoolnumber = schoolnumber;
    }
}
