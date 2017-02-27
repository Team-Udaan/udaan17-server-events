package `in`.udaan17.server.events.database

import `in`.udaan17.server.events.model.Event
import com.mongodb.MongoClient
import com.mongodb.ServerAddress
import com.mongodb.client.MongoDatabase
import org.bson.types.ObjectId
import org.litote.kmongo.KMongo
import org.litote.kmongo.getCollection
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

/**
 * Creator: vbarad
 * Date: 2017-02-26
 * Project: events-server
 */

@Component
class DatabaseHelper {
    private val events = mutableListOf<Event>()

    private val mongoClient: MongoClient
    private val mongoDatabase: MongoDatabase

    init {
        mongoClient = KMongo.createClient(ServerAddress(
                System.getenv("MONGO_HOST_UDAAN17_EVENTS"),
                System.getenv("MONGO_PORT_UDAAN17_EVENTS").toInt()
        ))
        mongoDatabase = mongoClient.getDatabase("udaan17-events")
    }

    fun getEvents(): List<Event> {
        return mongoDatabase
                .getCollection<Event>("events")
                .find()
                .toMutableList()
    }

    fun addEvent(event: Event): Boolean {
        events.firstOrNull { it.id == event.id }?.let {
            return false
        }

        events.add(event)
        return true
    }

    @PostConstruct
    private fun init() {
        events.add(Event(
                ObjectId(),
                "Kudi Kamaal Di",
                "Try your luck - perform, decode and design",
                "1",
                "40",
                "krushajani2611@gmail.com",
                "Each participant have to perform one of the pre-decided four 'Minute to win it' games to get to the second round",
                "Decode the vent with your partner - the team of two girls will cross the parth by remembering the different codes to complete it",
                "Surprise"
        ))
        events.add(Event(
                ObjectId(),
                "Subway surfers",
                "Surf your way through the hurdles!!",
                "1",
                "10",
                "dras.rajpura@gmail.com",
                "Participants will have to play Subway Surfers. Participating featuring in the top 20 highest scores will be qualified for the next round.(Mobile handsets will be provided)",
                "The player with highest score will win.",
                ""
        ))
        events.add(Event(
                ObjectId(),
                "Dhinchak Damsells",
                "Solve crossword show your creative skills and see whats left out!Q",
                "1",
                "30",
                "evakhakkhkhar@gmail.com",
                "Participants will have to solve a crossword puzzle using the given clues",
                "Participants will have to show their creative skills and do a makeover. There will be a twist",
                "Surprise"
        ))
    }
}
