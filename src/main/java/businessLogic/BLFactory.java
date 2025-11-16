package businessLogic;

/**
 * Factory principal que decide qué factory concreta usar
 */
public class BLFactory {
    
    public BLFacade getBusinessLogicFactory(boolean isLocal) {
        if (isLocal) {
            return new BLLocalFactory().createBLFacade();
        } else {
            return new BLRemoteFactory().createBLFacade();
        }
    }
}