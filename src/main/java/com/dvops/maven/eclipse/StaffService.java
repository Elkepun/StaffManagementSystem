package com.dvops.maven.eclipse;

import java.util.ArrayList;
import java.util.List;

public class StaffService {
    private List<staff> staffList = new ArrayList<>();

    public void addStaff(staff staff) {
        staffList.add(staff);
    }

    public staff getStaffById(int id) {
        return staffList.stream()
                .filter(staff -> staff.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<staff> getAllStaff() {
        return new ArrayList<>(staffList);
    }

    public void updateStaff(int id, String name, String department) {
        staff staff = getStaffById(id);
        if (staff != null) {
            staff.setName(name);
            staff.setDepartment(department);
        }
    }
}