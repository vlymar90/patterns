package patterns;


import patterns.lesson4.departmen.impl.Surgery;
import patterns.lesson4.departmen.impl.Therapy;
import patterns.lesson4.service.AdministratorService;
import patterns.lesson4.service.HumanResourcesDepartmentService;

/**
Реализация паттерна МОСТ
 */
public class Main {
    public static void main(String[] args) {
        HumanResourcesDepartmentService humanResourcesDepartmentService = new HumanResourcesDepartmentService(new Therapy());
        humanResourcesDepartmentService.getProfileEmployees(1);
        humanResourcesDepartmentService.getVacancy();
        humanResourcesDepartmentService.getResources();

        AdministratorService administratorService = new AdministratorService(new Surgery());
        administratorService.getInfoPatients(1);
        administratorService.totalFreeBeds();
        administratorService.totalPatients();
        administratorService.getAllPatients();
    }
}
