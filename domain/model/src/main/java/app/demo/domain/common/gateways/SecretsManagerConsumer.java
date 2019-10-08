package app.demo.domain.common.gateways;

public interface SecretsManagerConsumer<T> {
    T getSecrets(Class<T> cls, String secretRegion, String secretName) throws Exception;
}