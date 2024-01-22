package EmployeeDetails;
import java.util.List;


public class Employee {
    private String name;
    private List<String> skills;
    private List<String> preferences;
    private int maxWeeklyHours;

    public Employee(String name, List<String> skills, List<String> preferences, int maxWeeklyHours) {
        this.name = name;
        this.skills = skills;
        this.preferences = preferences;
        this.maxWeeklyHours = maxWeeklyHours;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public List<String> getPreferences() {
        return preferences;
    }

    public int getMaxWeeklyHours() {
        return maxWeeklyHours;
    }
}


