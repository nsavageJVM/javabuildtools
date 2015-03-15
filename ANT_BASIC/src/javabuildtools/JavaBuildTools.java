package javabuildtools;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;

/**
 * Created by ubu on 15.03.15.
 */
public class JavaBuildTools {

    private static final Logger logger_ = LoggerFactory.getLogger(JavaBuildTools.class);

    public static void main(String[] args) {

        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();

        logger_.debug("Project complies and builds with ant ");


    }
}
