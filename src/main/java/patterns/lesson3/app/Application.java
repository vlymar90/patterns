package patterns.lesson3.app;

import patterns.lesson3.factory.Factory;
import patterns.lesson3.procedure.Procedure;
import patterns.lesson3.services.Service;

public class Application {
    private Procedure procedure;
    private Service service;

    public Application(Factory factory) {
        this.procedure = factory.createProcedure();
        this.service = factory.createService();
    }

    public void treatment() {
        service.run();
        procedure.startProcedure();
    }
}
