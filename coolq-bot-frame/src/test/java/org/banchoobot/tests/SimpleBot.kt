package org.banchoobot.tests

import org.banchoobot.frame.qq.Bot
import org.banchoobot.frame.qq.configs.BotConfig
import org.banchoobot.frame.qq.deserializer.events.Event
import org.banchoobot.frame.qq.deserializer.events.Message

/**
 * Test Bot
 */
object Bootstrapper {
    @JvmStatic
    fun main(args: Array<String>) {
        val bot = SimpleBot()
        bot.start()
    }
}

class SimpleBot : Bot(BotConfig()) {
    override fun onMessage(message: Message) {
        message.reply(message.message)
        // 超级无敌服毒 bot
    }

    override fun onEvent(event: Event) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}