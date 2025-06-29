import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class ParameterizedLogging {
	private static final Logger logger = LoggerFactory.getLogger(ParameterizedLogging.class);
    public static void main(String[] args) {
        String userName = "Manoj";
        int age = 25;

        logger.info("User {} has logged in", userName);
        logger.warn("User {} is {} years old and attempted an outdated operation", userName, age);
        logger.error("User {} encountered error code: {}", userName, 404);
    }
}
