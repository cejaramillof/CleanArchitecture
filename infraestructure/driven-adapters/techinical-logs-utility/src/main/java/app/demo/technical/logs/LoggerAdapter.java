package app.demo.technical.logs;

import app.demo.domain.technicalogs.gateways.ILogger;
import com.google.gson.Gson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public class LoggerAdapter implements ILogger {

    private final static Logger logger = LogManager.getLogger(LoggerAdapter.class);

    public LoggerAdapter() {

    }

    @Override
    public void Debug(String message) {
        if (logger.isDebugEnabled()) {
            logger.debug(message);
        }
    }

    @Override
    public void Error(String message, Exception ex) {
        if (logger.isErrorEnabled()) {
            logger.error(getLogger(message, ex));
        }
    }

    @Override
    public void Error(String message) {
        if (logger.isErrorEnabled()) {
            logger.error(getLogger(message));
        }
    }

    @Override
    public void Info(String message) {
        if (logger.isInfoEnabled()) {
            logger.info(getLogger(message));
        }
    }

    @Override
    public void Warn(String message, Exception ex) {
        if (logger.isWarnEnabled()) {
            logger.warn(getLogger(message, ex));
        }
    }

    @Override
    public void Warn(String message) {
        if (logger.isWarnEnabled()) {
            logger.fatal(getLogger(message));
        }
    }

    @Override
    public void Fatal(String message) {
        if (logger.isFatalEnabled()) {
            logger.fatal(getLogger(message));
        }
    }

    @Override
    public void Fatal(String message, Exception ex) {
        if (logger.isFatalEnabled()) {
            logger.fatal(getLogger(message, ex));
        }
    }

    private String getLogger(String message) {
        Gson gson = new Gson();
        LoggerModel log = new LoggerModel(
                message,
                "application",
                "service",
                "name"
        );
        return gson.toJson(log);
    }

    private String getLogger(String message, Exception ex) {
        Gson gson = new Gson();
        LoggerModel log = new LoggerModel(
                "",
                "",
                "", ex
        );
        return gson.toJson(log);
    }
}
