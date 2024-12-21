package com.leelaland.chatapp.data


data class Message(
    val message: String,
    val time: String,
    val isMe: Boolean
)

val listOfMessages = listOf(

    Message("Hey! How are you?", "9:00 AM", true),
    Message("I'm good. How about you?", "9:01 AM", false),
    Message(
        """
        Just trying to stay productive.
        There’s so much to do these days,
        and it feels like I’m always running out of time.
        """.trimIndent(), "9:02 AM", true
    ),
    Message("I totally get that. Life gets super busy sometimes.", "9:03 AM", false),
    Message(
        """
        By the way, did you finish the project you mentioned earlier?
        I was curious about how that went.
        """.trimIndent(), "9:04 AM", true
    ),
    Message("Yes, finally wrapped it up last night.", "9:05 AM", false),
    Message("Congrats! That must feel like a huge relief.", "9:06 AM", true),
    Message(
        """
        Absolutely!
        I was so stressed about meeting the deadline.
        I can finally breathe a little now.
        """.trimIndent(), "9:07 AM", false
    ),
    Message("Have you had a chance to celebrate yet?", "9:08 AM", true),
    Message("Not yet. Maybe this weekend.", "9:09 AM", false),
    Message(
        """
        That sounds like a good plan.
        You should do something fun and relaxing.
        """.trimIndent(), "9:10 AM", true
    ),
    Message("Any recommendations?", "9:11 AM", false),
    Message(
        """
        Well, you could go for a nice dinner,
        or maybe watch that movie you've been waiting to see.
        """.trimIndent(), "9:12 AM", true
    ),
    Message(
        """
        A dinner sounds nice.
        I haven’t been out in a while.
        """.trimIndent(), "9:13 AM", false
    ),
    Message("Perfect! You deserve it.", "9:14 AM", true),
    Message(
        """
        By the way, did you hear about the new café that opened downtown?
        It’s supposed to have amazing desserts.
        """.trimIndent(), "9:15 AM", true
    ),
    Message("No, I haven’t. Is it any good?", "9:16 AM", false),
    Message(
        """
        I haven’t been there yet either,
        but a friend was raving about it.
        We should check it out sometime.
        """.trimIndent(), "9:17 AM", true
    ),
    Message("That sounds great. Let’s plan for next week.", "9:18 AM", false),
    Message("Next week works for me!", "9:19 AM", true),
    Message(
        """
        By the way, I started reading that book you recommended.
        It's so interesting!
        """.trimIndent(), "9:20 AM", true
    ),
    Message(
        """
        Oh, which one?
        I’ve recommended a few lately!
        """.trimIndent(), "9:21 AM", false
    ),
    Message("The one about personal growth and habits.", "9:22 AM", true),
    Message(
        """
        Oh, Atomic Habits!
        Such a good read.
        What part are you on now?
        """.trimIndent(), "9:23 AM", false
    ),
    Message(
        """
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        """.trimIndent(), "9:24 AM", true
    ),
    Message("That’s one of my favorite chapters. So insightful!", "9:25 AM", false),
    Message(
        """
        I agree.
        I’m already trying to implement some of the ideas.
        """.trimIndent(), "9:26 AM", true
    ),
    Message(
        """
        That’s awesome!
        Let me know if you see results.
        I’d love to hear about it.
        """.trimIndent(), "9:27 AM", false
    ),
    Message("I definitely will!", "9:28 AM", true),
    Message(
        """
        Oh, which one?
        I’ve recommended a few lately!
        """.trimIndent(), "9:21 AM", false
    ),
    Message("The one about personal growth and habits.", "9:22 AM", true),
    Message(
        """
        Oh, Atomic Habits!
        Such a good read.
        What part are you on now?
        """.trimIndent(), "9:23 AM", false
    ),
    Message(
        """
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        """.trimIndent(), "9:24 AM", true
    ),
    Message("That’s one of my favorite chapters. So insightful!", "9:25 AM", false),
    Message(
        """
        I agree.
        I’m already trying to implement some of the ideas.
        """.trimIndent(), "9:26 AM", true
    ),
    Message(
        """
        That’s awesome!
        Let me know if you see results.
        I’d love to hear about it.
        """.trimIndent(), "9:27 AM", false
    ),
    Message("I definitely will!", "9:28 AM", true),

    Message("Yes, finally wrapped it up last night.", "9:05 AM", false),
    Message("Congrats! That must feel like a huge relief.", "9:06 AM", true),
    Message(
        """
        Absolutely!
        I was so stressed about meeting the deadline.
        I can finally breathe a little now.
        """.trimIndent(), "9:07 AM", false
    ),
    Message("Have you had a chance to celebrate yet?", "9:08 AM", true),
    Message("Not yet. Maybe this weekend.", "9:09 AM", false),
    Message(
        """
        That sounds like a good plan.
        You should do something fun and relaxing.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        """.trimIndent(), "9:10 AM", true
    ),
    Message("Any recommendations?", "9:11 AM", false),
    Message(
        """
        Well, you could go for a nice dinner,
        or maybe watch that movie you've been waiting to see.
        """.trimIndent(), "9:12 AM", true
    ),

    Message(
        """
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        """.trimIndent(), "9:24 AM", true
    ),
    Message("That’s one of my favorite chapters. So insightful!", "9:25 AM", false),
    Message(
        """
        I agree.
        I’m already trying to implement some of the ideas.
        """.trimIndent(), "9:26 AM", true
    ),
    Message(
        """
        That’s awesome!
        Let me know if you see results.
        I’d love to hear about it.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        """.trimIndent(), "9:27 AM", false
    ),

    Message(
        """
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        """.trimIndent(), "9:24 AM", true
    ),
    Message("That’s one of my favorite chapters. So insightful!", "9:25 AM", false),
    Message(
        """
        I agree.
        I’m already trying to implement some of the ideas.
        """.trimIndent(), "9:26 AM", true
    ),
    Message(
        """
        That’s awesome!
        Let me know if you see results.
        I’d love to hear about it.
        """.trimIndent(), "9:27 AM", false
    ),
    Message("I definitely will!", "9:28 AM", true),
// Add more messages to fill up to 150 lines, varying lengths as required.
    Message("Let’s talk later.", "9:29 AM", true),
    Message("Sure. Take care!", "9:30 AM", false)


).reversed()