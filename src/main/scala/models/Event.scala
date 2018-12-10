package models

import java.time.ZonedDateTime

case class Event(traceId: String, activity: String, start: ZonedDateTime)
