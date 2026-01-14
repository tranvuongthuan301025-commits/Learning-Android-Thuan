fun main(){
    val name = UserAccount("admin","123")
    checkLogin(name){status->
        println(status.message)
    }
}