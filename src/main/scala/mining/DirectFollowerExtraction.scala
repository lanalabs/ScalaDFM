package mining

import java.io.File
import org.joda.time.DateTime

/**
 * Extracts the direct follower matrix from a log.
 * Parses each line of the log file as an `Event` and builds the `Trace`s from the events.
 * Then counts all direct follower relations and prints them to the command line.
 */
object DirectFollowerExtraction {

  def main(args: Array[String]) = {

    // Get the log file from the resources
    val logFile = new File(getClass.getResource("/IncidentExample.csv").getPath())

    println(s"Please use the events in the log-file located at ${logFile.getAbsolutePath()} to build a direct" +
      s" follower matrix.")

    /////////////////////////////
    /// YOUR WORK STARTS HERE ///
    /////////////////////////////
  }
}
