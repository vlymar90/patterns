package patterns.lesson3.factory.impl;

import patterns.lesson3.factory.Factory;
import patterns.lesson3.procedure.Procedure;
import patterns.lesson3.procedure.impl.UziProcedure;
import patterns.lesson3.services.Service;
import patterns.lesson3.services.impl.SurgeryService;

public class SurgeryFactory implements Factory {
    @Override
    public Procedure createProcedure() {
        return new UziProcedure();
    }

    @Override
    public Service createService() {
        return new SurgeryService();
    }
}
