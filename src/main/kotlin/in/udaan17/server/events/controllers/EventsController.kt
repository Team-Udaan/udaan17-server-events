package `in`.udaan17.server.events.controllers

import `in`.udaan17.server.events.database.DatabaseHelper
import `in`.udaan17.server.events.exceptions.DuplicateItemException
import `in`.udaan17.server.events.model.Event
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Creator: vbarad
 * Date: 2017-02-26
 * Project: events-server
 */

@RestController
class EventsController {
    @Autowired
    private lateinit var database: DatabaseHelper

    @RequestMapping("/api/events", method = arrayOf(RequestMethod.GET), produces = arrayOf(MediaType.APPLICATION_JSON_UTF8_VALUE))
    fun getAllEvents() = database.getEvents()

    @RequestMapping("/api/events", method = arrayOf(RequestMethod.POST), produces = arrayOf(MediaType.APPLICATION_JSON_UTF8_VALUE))
    fun addEvent(@RequestBody event: Event) =
            if (database.addEvent(event)) event
            else throw DuplicateItemException()
}
