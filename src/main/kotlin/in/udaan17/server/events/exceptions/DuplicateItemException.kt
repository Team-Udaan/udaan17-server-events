package `in`.udaan17.server.events.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

/**
 * Creator: vbarad
 * Date: 2017-02-26
 * Project: events-server
 */

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Duplicate item")
class DuplicateItemException : RuntimeException()
