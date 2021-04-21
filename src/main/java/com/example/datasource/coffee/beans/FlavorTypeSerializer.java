package com.example.datasource.coffee.beans;

import com.example.datasource.coffee.entity.Flavor;

import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;

public class FlavorTypeSerializer implements JsonbSerializer<Flavor> {

    @Override
    public void serialize(Flavor flavor, JsonGenerator generator, SerializationContext ctx) {
        generator.write(flavor.description);
    }

}