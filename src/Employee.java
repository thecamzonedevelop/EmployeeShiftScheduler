import java.util.List;

public class Employee {
    private String name;
    private List<String> skills;
    private int maxWeeklyHours;

    public Employee(String name, List<String> skills, int maxWeeklyHours) {
        this.name = name;
        this.skills = skills;
        this.maxWeeklyHours = maxWeeklyHours;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public int getMaxWeeklyHours() {
        return maxWeeklyHours;
    }
}
