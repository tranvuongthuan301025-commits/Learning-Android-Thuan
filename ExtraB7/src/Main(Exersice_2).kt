fun main(){
    val user1 = RegisterInput("a@gmail", "thuan", "thuan")
    val listEmail = listOf(
        "a@gmail.com",
        "b@gmail.com"
    )
    register(user1, listEmail){ status->
        println(status.message)
    }
}