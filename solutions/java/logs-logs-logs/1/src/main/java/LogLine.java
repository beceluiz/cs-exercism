public class LogLine {
    public final String line;
    
    public LogLine(String logLine) {
        this.line = logLine;
    }

    public LogLevel getLogLevel() {
        String lvl = line.substring(1,4);
        String msg = line.substring(6).trim();
        switch(lvl){
                case "TRC":
            return LogLevel.TRACE;
                case "DBG":
            return LogLevel.DEBUG;
                case "INF":
            return LogLevel.INFO;
                case "WRN":
            return LogLevel.WARNING;
                case "ERR":
            return LogLevel.ERROR;
                case "FTL":
           return LogLevel.FATAL;
           default: 
            return LogLevel.UNKNOWN;

        }

    }

    public String getOutputForShortLog() {
        int encodedLogLevel;
        String lvl = line.substring(1,4);
        String msg = line.substring(6).trim();
        
           switch(lvl){
                case "TRC":
            encodedLogLevel = 1;
                break;
                case "DBG":
            encodedLogLevel = 2;
                break;
                case "INF":
            encodedLogLevel = 4;
                break;
                case "WRN":
          encodedLogLevel = 5;
                break;
                case "ERR":
            encodedLogLevel = 6;
                break;
                case "FTL":
        encodedLogLevel = 42;
                break;
               default: 
          encodedLogLevel = 0;
                break;
        }
        return encodedLogLevel + ":" + msg;
        
    }
}
