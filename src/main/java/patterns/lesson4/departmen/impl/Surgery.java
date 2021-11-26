package patterns.lesson4.departmen.impl;

import patterns.lesson4.departmen.Department;

import java.util.List;

public class Surgery implements Department {
    @Override
    public List<String> getEmployees() {
        return List.of("Еремин Виталий", "Лапшина Юлия");
    }

    @Override
    public int getVacancyFree() {
        return 15;
    }

    @Override
    public String employeeProfile(int id) {
        if (id < 0 || id > getEmployees().size()) {
            throw new IllegalArgumentException(String.valueOf(id));
        }
        return getEmployees().get(id);
    }

    @Override
    public List<String> getPatients() {
        return List.of("Кольков Александр");
    }

    @Override
    public int getCountPatients() {
        if (getPatients() == null) {
            return 0;
        }
        return getPatients().size();
    }

    @Override
    public int getFreeBeds() {
        return 3;
    }

    @Override
    public String getProfilePatients(int id) {
        if (getPatients() == null) {
            return "На данный момент в отделении пациентов нет";
        }

        if (id < 0 || id > getPatients().size() - 1) {
            return "Пациента с id: " + id + " не существует!";
        }
        return getPatients().get(id);
    }
}
