package bot

import scala.concurrent.Await
import scala.concurrent.duration.Duration

object BotInitializer extends App {

  val bot = new QuoteBot
  val eol = bot.run()

  Await.result(eol, Duration.Inf)
}
