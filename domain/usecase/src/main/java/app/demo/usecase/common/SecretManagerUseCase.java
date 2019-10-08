package app.demo.usecase.common;

import app.demo.domain.common.SecretsModel;
import app.demo.domain.common.gateways.SecretsManagerConsumer;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SecretManagerUseCase {

    private final SecretsManagerConsumer consumer;

    public Object getSecrets(String secretRegion, String secretName) throws Exception {
        return consumer.getSecrets(SecretsModel.class, secretRegion, secretName);
    }
}
