package app.demo.domain.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class SecretsModel {

    private final String user;

    private final String password;

    private final String host;

    private final String dbName;

    private final String port;
}
