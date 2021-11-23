package patterns.lesson3.factory.impl;

import patterns.lesson3.factory.Factory;
import patterns.lesson3.procedure.Procedure;
import patterns.lesson3.procedure.impl.MrtProcedure;
import patterns.lesson3.services.Service;
import patterns.lesson3.services.impl.TherapyService;

public class TherapyFactory implements Factory {
    @Override
    public Procedure createProcedure() {
        return new MrtProcedure();
    }

    @Override
    public Service createService() {
        return new TherapyService();
    }
}
