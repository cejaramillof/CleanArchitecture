package app.demo.secretsmanager;

import app.demo.domain.common.gateways.SecretsManagerConsumer;
import co.com.bancolombia.commons.secretsmanager.connector.AbstractConnector;
import co.com.bancolombia.commons.secretsmanager.connector.clients.AWSSecretManagerConnector;
import co.com.bancolombia.commons.secretsmanager.exceptions.SecretException;
import co.com.bancolombia.commons.secretsmanager.manager.GenericManager;
import org.springframework.stereotype.Repository;


@Repository
public class SecretsManager implements SecretsManagerConsumer {


    public SecretsManager() {
    }

    @Override
    public Object getSecrets(Class cls, String secretRegion, String secretName) throws SecretException {
        AbstractConnector connector = new AWSSecretManagerConnector(secretRegion);
        GenericManager manager = new GenericManager(connector);
        return manager.getSecretModel(secretName, cls);
    }
}
