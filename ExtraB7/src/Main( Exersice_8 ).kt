fun main(){
    val studens: List<String> = listOf(
        "abc",
        "thuan",
        "Hung"
    )
    search("sdvsdv", studens){status->
        println(status.message)
    }
}