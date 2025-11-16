package businessLogic;

import dataAccess.DataAccess;
import configuration.ConfigXML;

/**
 * Factory para la implementación local de BLFacade
 */
public class BLLocalFactory {
    
    public BLFacade createBLFacade() {
        DataAccess da = new DataAccess();
        return new BLFacadeImplementation(da);
    }
}