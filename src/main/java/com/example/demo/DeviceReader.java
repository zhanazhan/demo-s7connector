package com.example.demo;

import com.github.s7connector.api.S7Connector;
import com.github.s7connector.api.S7Serializer;
import com.github.s7connector.api.factory.S7ConnectorFactory;
import com.github.s7connector.api.factory.S7SerializerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeviceReader implements Runnable {
    private final Logger logger = LoggerFactory.getLogger(DeviceReader.class);

    private final S7Connector connector;
    private final int dbNum;
    private final String host;
    private final Class<?> clazz;

    public DeviceReader(String host, int dbNum, Class<?> clazz) {
        this.connector = S7ConnectorFactory
                .buildTCPConnector()
                .withHost(host)
                .withRack(0) //optional
                .withSlot(2) //optional
                .build();
        this.clazz = clazz;
        this.dbNum = dbNum;
        this.host = host;
    }

    @Override
    public void run() {
        if (connector != null) {
            logger.info("Got connection Siemens: {}", this.host);
            S7Serializer serializer = S7SerializerFactory.buildSerializer(connector);

            //dispense bean from DB100 and offset 0
            //Read from DB100 10 bytes
            while (true) {
                try {
                    Object bean1 = serializer.dispense(clazz, dbNum, 0);
                    logger.info("Got output from Siemens: {}", bean1.toString());

                    Thread.sleep(1000);
                } catch (Exception e) {
                    logger.error("Error {}", e.getMessage(), e);
                }
            }
        } else {
            logger.info("No connection to Siemens.");
        }
        logger.info("Done.");
    }
}
