package patterns.lesson4.service;

import patterns.lesson4.departmen.Department;

public class HumanResourcesDepartmentService {
    protected Department department;

    public HumanResourcesDepartmentService(Department department) {
        this.department = department;
    }

    public void getResources() {
        for (String resources : department.getEmployees()) {
            System.out.println(resources);
        }
    }

    public void getVacancy() {
        System.out.println(department.getVacancyFree());
    }

    public void getProfileEmployees(int id) {
        System.out.println(department.employeeProfile(id));
    }
}
