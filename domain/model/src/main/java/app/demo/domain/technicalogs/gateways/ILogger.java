package app.demo.domain.technicalogs.gateways;

public interface ILogger {

    /// <summary>
    /// Debugs the specified message.
    /// </summary>
    /// <param name="message">The message.</param>
    void Debug(String message);

    /// <summary>
    /// Errors the specified message.
    /// </summary>
    /// <param name="message">The message.</param>
    /// <param name="ex">The ex.</param>
    void Error(String message, Exception ex);

    /// <summary>
    /// Errors the specified message.
    /// </summary>
    /// <param name="message">The message.</param>
    void Error(String message);

    /// <summary>
    /// Info the specified message.
    /// </summary>
    /// <param name="message">The message.</param>
    void Info(String message);

    /// <summary>
    /// Warns the specified message.
    /// </summary>
    /// <param name="message">The message.</param>
    /// <param name="ex">The ex.</param>
    void Warn(String message, Exception ex);

    /// <summary>
    /// Warns the specified message.
    /// </summary>
    /// <param name="message">The message.</param>
    void Warn(String message);

    /// <summary>
    /// Fatal the specified message.
    /// </summary>
    /// <param name="message">The message.</param>
    void Fatal(String message);

    /// <summary>
    /// Fatal the specified message.
    /// </summary>
    /// <param name="message">The message.</param>
    /// <param name="ex">The ex.</param>
    void Fatal(String message, Exception ex);

    /// <summary>
    /// Gets the current method.
    /// </summary>
    /// <returns></returns>
}
