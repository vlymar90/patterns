package patterns.lesson5.service.impl;

import patterns.lesson5.service.Procedure;
import patterns.lesson5.service.Treatment;

public class SurgeryDepartment extends Procedure implements Treatment {

    @Override
    public void treatment() {
        examinationDoctor();
        getTested();
        mrtService();
        endTreatment();
    }

    @Override
    public void examinationDoctor() {
        System.out.println("Осмотр Хирурга");
    }

    @Override
    public void getTested() {
        System.out.println("Нужно сдать: ОАК, Мочу, Б/Х");
    }
}