package models

import org.joda.time.DateTime

case class Event(traceId: String, activity: String, start: DateTime)
