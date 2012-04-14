Quick template for Scalatron bot projects: see http://scalatron.wordpress.com/

How to do stuff:

Build

    ./sbt package # produces target/scala-2.9.1/scalatron-bot_2.9.1-0.1.jar

Continuous build (handy to leave running while you edit)

    ./sbt ~compile

Load code in a Scala interpreter

    ./sbt console

Delete compiled output

    ./sbt clean
