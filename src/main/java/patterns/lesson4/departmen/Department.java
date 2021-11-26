package patterns.lesson4.departmen;

import java.util.List;

public interface Department {
    List<String> getEmployees();

    int getVacancyFree();

    String employeeProfile(int id);

    List<String> getPatients();

    int getCountPatients();

    int getFreeBeds();

    String getProfilePatients(int id);
}
