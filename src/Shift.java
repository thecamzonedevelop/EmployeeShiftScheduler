import java.util.List;

public class Shift {
    private String shiftName;
    private List<String> requiredSkills;

    public Shift(String shiftName, List<String> requiredSkills) {
        this.shiftName = shiftName;
        this.requiredSkills = requiredSkills;
    }

    public String getShiftName() {
        return shiftName;
    }

    public List<String> getRequiredSkills() {
        return requiredSkills;
    }
    public String toString() {
        return "Shift{" +
                "shiftName='" + shiftName + '\'' +
                ", requiredSkills=" + requiredSkills +
                '}';
    }
}
