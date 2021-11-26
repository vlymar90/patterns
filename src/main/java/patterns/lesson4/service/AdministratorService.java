package patterns.lesson4.service;

import patterns.lesson4.departmen.Department;

public class AdministratorService extends HumanResourcesDepartmentService {
    public AdministratorService(Department department) {
        super(department);
    }

    public void totalPatients() {
        System.out.println(department.getCountPatients());
    }

    public void totalFreeBeds() {
        System.out.println(department.getFreeBeds());
    }

    public void getInfoPatients(int id) {
        System.out.println(department.getProfilePatients(id));
    }

    public void getAllPatients() {
        for (String patients : department.getPatients()) {
            System.out.println(patients);
        }
    }
}
