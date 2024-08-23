package com.dvops.maven.eclipse;

import java.util.ArrayList;
import java.util.List;

public class StaffService {
    private List<Staff> staffList = new ArrayList<>();

    public void addStaff(Staff staff) {
        staffList.add(staff);
    }

    public Staff getStaffById(int id) {
        return staffList.stream()
                .filter(staff -> staff.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Staff> getAllStaff() {
        return new ArrayList<>(staffList);
    }

    public void updateStaff(int id, String name, String department) {
        Staff staff = getStaffById(id);
        if (staff != null) {
            staff.setName(name);
            staff.setDepartment(department);
        }
    }
}
