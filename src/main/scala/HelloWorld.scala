import akka.actor.ActorSystem
import akka.util.Timeout
import spray.routing.SimpleRoutingApp

import scala.concurrent.duration._

object HelloWorld extends App with SimpleRoutingApp {

    implicit val actorSystem = ActorSystem()
    implicit val timeout = Timeout(1.second)

    startServer(interface = "localhost", port = 8080) {
        get {
            path("") {
                complete {
                    "Hello World!"
                }
            }
        }
    }

}
