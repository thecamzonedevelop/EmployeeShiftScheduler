import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Schedule {
    private final Map<String, List<Employee>> shiftAssignments;

    public Schedule() {
        this.shiftAssignments = new HashMap<>();
    }

    public void assignEmployeeToShift(String shiftName, Employee employee) {
        shiftAssignments.computeIfAbsent(shiftName, k -> new ArrayList<>()).add(employee);
    }

    public Map<String, List<Employee>> getShiftAssignments() {
        return shiftAssignments;
    }
}
