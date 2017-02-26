package `in`.udaan17.server.events.util

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import org.bson.types.ObjectId

/**
 * Creator: vbarad
 * Date: 2017-02-25
 * Project: events-server
 */

class ObjectIdSerializer : JsonSerializer<ObjectId>() {
    override fun serialize(value: ObjectId?, gen: JsonGenerator?, serializers: SerializerProvider?) {
        if (value != null) {
            gen?.writeString(value.toHexString())
        }
    }
}
