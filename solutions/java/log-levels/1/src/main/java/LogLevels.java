public class LogLevels {
    
    public static String message(String logLine) {
        String regex = "^\\[.+?\\]:";
        return logLine.replaceAll(regex," ").trim();
    }

    public static String logLevel(String logLine) {
        String level = "";

            if(logLine.contains("ERROR")) {
                level = "error";
            } else if (logLine.contains("WARNING")) {
                level = "warning";
            } else if (logLine.contains("INFO")) {
                level = "info";
            }
        
        return level;
    }

    public static String reformat(String logLine) {
      return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
