package com.example.kafka.consumer.intializer;

import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

public class KafkaJsonDeserializer<T> implements Deserializer
{
    private Class<T> type;
    private Logger logger = LogManager.getLogger(this.getClass());

    public KafkaJsonDeserializer (Class type)
    {
        this.type = type;
    }

    @Override
    public void configure (Map configs, boolean isKey)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public Object deserialize (String topic, byte[] data)
    {

        ObjectMapper mapper = new ObjectMapper();
        T obj = null;
        try {
            obj = mapper.readValue(data, type);
        }
        catch (Exception e) {

            logger.error(e.getMessage());
        }
        return obj;
    }

    @Override
    public void close ()
    {
        // TODO Auto-generated method stub

    }

}
