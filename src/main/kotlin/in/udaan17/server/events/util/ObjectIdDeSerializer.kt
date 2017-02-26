package `in`.udaan17.server.events.util

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import org.bson.types.ObjectId

/**
 * Creator: vbarad
 * Date: 2017-02-26
 * Project: events-server
 */
class ObjectIdDeSerializer : JsonDeserializer<ObjectId>() {
    override fun deserialize(parser: JsonParser?, context: DeserializationContext?): ObjectId {
        val hexId: String = parser!!.readValueAs(String::class.java)
        return ObjectId(hexId)
    }
}
