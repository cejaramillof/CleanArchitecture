package app.demo.config;

import app.demo.domain.common.SecretsModel;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JpaConfig {
    @Value("${db.secret.name}")
    private String secretName;

    @Value("${db.secret.region}")
    private String secretRegion;

    @Value("${db.driver}")
    private String dbDriver;

    @Value("${db.connection.url}")
    private String dbConnectionString;

    @Bean
    public BasicDataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        try {
            dataSource.setDriverClassName(this.dbDriver);
            SecretsModel model = this.getSecretModel();
            dataSource.setUrl(this.getDbConnectionString(model));
            dataSource.setUsername(model.getUser());
            dataSource.setPassword(model.getPassword());
        } catch (Exception ex) {
        }

        return dataSource;
    }

    private String getDbConnectionString(SecretsModel secretsModel) {
        return String.format(this.dbConnectionString, secretsModel.getHost(), secretsModel.getPort(), secretsModel.getDbName());
    }

    private SecretsModel getSecretModel() {
        //SecretManagerUseCase secrets = new SecretManagerUseCase(consumer);
        //SecretsModel model = (SecretsModel) secrets.getSecrets(this.secretRegion, this.secretName);
        return SecretsModel.builder()
                .dbName("CleanArchitecture")
                .host("localhost")
                .password("!QAZxsw2")
                .port("1433")
                .user("sa")
                .build();
    }
}
