import com.sun.security.auth.UserPrincipal

enum class Status(val message: String){
    LOGIN_EMPTY("Đăng nhập sai chưa đúng thông tin Hoặc mật khẩu!"),
    LOGIN_ERROR("Đăng nhập thành công"),
    LOGIN_SUCCESS("Đăng nhập thất Bại"),
}
fun login(username: String?, password: String?): Status{
    val account: Map<String, String?> = mapOf(
        "thuan" to "12345",
        "Hung" to "56789"
    )

    if(username.isNullOrBlank() || password.isNullOrBlank()){
        return Status.LOGIN_ERROR
    }

    val checkLogin = account[username]
    if(checkLogin !=null && checkLogin == password){
        return Status.LOGIN_SUCCESS
    }else if((checkLogin ==null && checkLogin != password)){
        return Status.LOGIN_ERROR
    }

    return Status.LOGIN_EMPTY
}

fun main(){
    print("Nhập User Name: ")
    val userName = readLine()?.trim()
    print("Nhập Password: ")
    val password = readLine()?.trim()

    val user1 = login(userName, password)

    val message = when (user1){
        Status.LOGIN_ERROR -> Status.LOGIN_ERROR.message
        Status.LOGIN_SUCCESS -> Status.LOGIN_SUCCESS.message
        Status.LOGIN_EMPTY -> Status.LOGIN_EMPTY.message
        else -> println("Lỗi")
    }

}