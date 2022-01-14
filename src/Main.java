import org.apache.log4j.Logger;
public class Main {
    private static final Logger LOGGER = Logger.getLogger("Example.log");
    public static void main( String[] args) {
        LOGGER.info("Example output");
        LOGGER.error("Example output");
    }
}
