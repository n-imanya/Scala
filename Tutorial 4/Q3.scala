object Q3 extends App{

    def toLower(word:String):String = word.toLowerCase()
    def toUpper(word:String):String = word.toUpperCase()

    def onetwoUpper(word: String): String =
        toUpper(word.substring(0,2)) + toLower(word.substring(2, word.length()))

    def firstLastUpper(word: String): String =
        toUpper(word.substring(0, 1)) + toLower(word.substring(1, word.length() - 1)) +
        toUpper(word.substring(word.length() - 1, word.length()))

    def formatName(word: String, format: String => String): String = format(word)

    println(formatName("Benny",toUpper))
    println(formatName("Niroshan",onetwoUpper))
    println(formatName("Saman",toLower))
    println(formatName("Kumara",firstLastUpper))

}