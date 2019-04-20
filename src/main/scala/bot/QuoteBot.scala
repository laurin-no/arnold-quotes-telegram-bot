package bot

import com.bot4s.telegram.api.declarative.Commands
import com.bot4s.telegram.api.{Polling, RequestHandler, TelegramBot}
import com.bot4s.telegram.clients.ScalajHttpClient

import scala.io.Source

class QuoteBot extends TelegramBot with Polling with Commands {
  override val client: RequestHandler = new ScalajHttpClient(token)

  onCommand("/start") { implicit msg =>
    reply("Get to da choppa!\nUse /arnold to get a Schwarzenegger quote.")
  }

  onCommand("/arnold") { implicit msg =>
    reply("Come with me, if you want to lift")
  }

  private lazy val token = scala.util.Properties
    .envOrNone("BOT_TOKEN")
    .getOrElse("")
}
