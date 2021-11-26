package patterns.lesson4.departmen.impl;

import patterns.lesson4.departmen.Department;

import java.util.List;

public class Therapy implements Department {

    @Override
    public List<String> getEmployees() {
        return List.of("Петров Иван", "Аксенов Олег", "Гагарина Полина");
    }

    @Override
    public int getVacancyFree() {
        return 10;
    }

    @Override
    public String employeeProfile(int id) {
        if(id < 0 || id > getEmployees().size()) {
            throw new IllegalArgumentException();
        }
        return getEmployees().get(id);
    }

    @Override
    public List<String> getPatients() {
        return List.of("Иванов Сергей");
    }

    @Override
    public int getCountPatients() {
        return getPatients().size();
    }

    @Override
    public int getFreeBeds() {
        return 5;
    }

    @Override
    public String getProfilePatients(int id) {
        if(id < 0 || id > getPatients().size() -1) {
            throw new IllegalArgumentException();
        }
        return getPatients().get(id);
    }
}
