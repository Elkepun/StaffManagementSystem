/**
 * 
 */
package com.dvops.maven.eclipse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StaffServiceTest {

    private StaffService staffService;

    @BeforeEach
    public void setUp() {
        staffService = new StaffService();
    }

    @Test
    public void testAddStaff() {
        Staff staff = new Staff(1, "John Doe", "HR");
        staffService.addStaff(staff);

        Staff retrievedStaff = staffService.getStaffById(1);
        assertNotNull(retrievedStaff, "Staff should not be null");
        assertEquals("John Doe", retrievedStaff.getName(), "Staff name should be 'John Doe'");
        assertEquals("HR", retrievedStaff.getDepartment(), "Staff department should be 'HR'");
    }

    @Test
    public void testGetAllStaff() {
        staffService.addStaff(new Staff(1, "John Doe", "HR"));
        staffService.addStaff(new Staff(2, "Jane Doe", "IT"));

        List<Staff> staffList = staffService.getAllStaff();
        assertEquals(2, staffList.size(), "There should be 2 staff members in the list");
    }

    @Test
    public void testUpdateStaff() {
        Staff staff = new Staff(1, "John Doe", "HR");
        staffService.addStaff(staff);

        staffService.updateStaff(1, "John Smith", "Finance");
        Staff updatedStaff = staffService.getStaffById(1);

        assertNotNull(updatedStaff, "Updated staff should not be null");
        assertEquals("John Smith", updatedStaff.getName(), "Staff name should be updated to 'John Smith'");
        assertEquals("Finance", updatedStaff.getDepartment(), "Staff department should be updated to 'Finance'");
    }
}
