package patterns.lesson5.service;

public abstract class Procedure {

    public void mrtService() {
        System.out.println("Началось МРТ исследование.");
    }

    public void uziService() {
        System.out.println("УЗИ исследование началось.");
    }

    public abstract void examinationDoctor();

    public abstract void getTested();

    public void endTreatment() {
        System.out.println("Пациент здоров");
    }
}
