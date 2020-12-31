package com.example.demo;

import com.github.s7connector.api.S7Connector;
import com.github.s7connector.api.S7Serializer;
import com.github.s7connector.api.factory.S7ConnectorFactory;
import com.github.s7connector.api.factory.S7SerializerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConnectToSiemens implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(ConnectToSiemens.class);
    private final S7Connector connector;
    private boolean keepPolling = true;

    public ConnectToSiemens() {
        connector = S7ConnectorFactory
                .buildTCPConnector()
                .withHost("192.168.0.1")
                .withRack(0) //optional
                .withSlot(2) //optional
                .build();
    }

    @Override
    public void run(String... args) throws Exception {

        if (connector != null) {
            logger.info("Got connection Siemens: {}", "192.168.0.1");
            S7Serializer serializer = S7SerializerFactory.buildSerializer(connector);

            //dispense bean from DB100 and offset 0
            //Read from DB100 10 bytes
            while (keepPolling) {
                Data bean1 = serializer.dispense(Data.class, 26, 0);
                logger.info("Got output from Siemens: {}", bean1.toString());
                Thread.sleep(1000);
            }
        } else {
            logger.info("No connection to Siemens.");
        }
    }

    public boolean isKeepPolling() {
        return keepPolling;
    }

    public void setKeepPolling(boolean keepPolling) {
        this.keepPolling = keepPolling;
    }
}
