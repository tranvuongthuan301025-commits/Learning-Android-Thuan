enum class check(val message: String){
    USERNAME_EMPTY("User name rỗng"),
    USERNAME_SUCCESS("Thành Công"),
    USERNAME_FALSE("Lỗi")
}

fun checkLogin(UserName: String? = "thuan", onResult: (check) -> Unit){
    println("nhập tên user")
    val name = readLine()?.trim()
    UserName?.let{ user ->
        val status = when{
            user.isEmpty() ->
                check.USERNAME_EMPTY
            user == name ->
                check.USERNAME_SUCCESS
            else ->
                check.USERNAME_FALSE

        }
        onResult(status)
        return
    }
    onResult(check.USERNAME_EMPTY)
}

fun main(){
    checkLogin() {Status ->
        println(Status.message)
    }
}