package com.example.demo;

import com.github.s7connector.api.S7Connector;
import com.github.s7connector.api.S7Serializer;
import com.github.s7connector.api.factory.S7ConnectorFactory;
import com.github.s7connector.api.factory.S7SerializerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

@Component
public class ConnectToSiemens implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(ConnectToSiemens.class);

    private boolean keepPolling = true;
    private static final String THREAD_NAME_PREFIX = "CONNECTORS";
    private static final int THREAD_POOL_SIZE = 8;

    private final ExecutorService executor;
    private final Map<String, Runnable> connections = new ConcurrentHashMap<>();

    public ConnectToSiemens() {
        this.executor = new ThreadPoolFactory(THREAD_POOL_SIZE, THREAD_NAME_PREFIX).createExecutor();
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            DeviceReader tns1Reader = new DeviceReader("192.168.0.201", 163, DataTNS1.class);
            this.executor.submit(tns1Reader);
            DeviceReader tns2Reader = new DeviceReader("192.168.0.1", 26, DataTNS2.class);
            this.executor.submit(tns2Reader);
        } catch (Exception e) {
            logger.error("Exception: {}", e.getMessage(), e);
        } catch (Error e) {
            logger.error("Error: {}", e.getMessage(), e);
        }
    }

    public boolean isKeepPolling() {
        return keepPolling;
    }

    public void setKeepPolling(boolean keepPolling) {
        this.keepPolling = keepPolling;
    }
}
