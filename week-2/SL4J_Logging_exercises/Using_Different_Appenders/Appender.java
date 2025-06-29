import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Appender {
	private static final Logger logger = LoggerFactory.getLogger(Appender.class);

    public static void main(String[] args) {
        logger.debug("Debug message – visible in both console and file");
        logger.info ("Info  message – visible in both console and file");
        logger.warn ("Warn  message – visible in both console and file");
        logger.error("Error message – visible in both console and file");
    }
}
