package midterm.giorgi_kharatishvili_4.task1;

import java.util.ArrayList;
import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    private String studentName;

    public Fantasy() {
        this.studentName = "Giorgi Kharatishvili";
    }

    @Override
    public String getWhisker1() {
        return "Whisker1";
    }

    @Override
    public String getHospitality2() {
        return "Hospitality2";
    }

    @Override
    public String methodWrench3(String argJazz5) {
        return "Wrench3 Jazz5";
    }

    @Override
    public List<String> methodBatumi4(String argComputing6) {
        List<String> result = new ArrayList<>();
        result.add("Batumi4");
        result.add("Computing6");
        return result;
    }

    @Override
    public String toString() {
        return "Fantasy by " + studentName;
    }
}
