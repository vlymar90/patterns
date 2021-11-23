package patterns.lesson3.factory;

import patterns.lesson3.procedure.Procedure;
import patterns.lesson3.services.Service;

public interface Factory {
    Procedure createProcedure();
    Service createService();
}
