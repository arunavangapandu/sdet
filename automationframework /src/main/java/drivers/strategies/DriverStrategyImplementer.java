package drivers.strategies;

import utils.Constants;

public class DriverStrategyImplementer {

    public static DriverStrategy getDriver(String driverName) {

        switch(driverName) {
            case Constants.CHROME:
                return new Chrome();
            case Constants.FIREFOX:
                return new Firefox();
            case Constants.PHANTOMJS:
                return new PhantomJs();
            default:
                return null;
        }
    }
}
