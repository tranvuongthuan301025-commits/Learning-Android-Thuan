import kotlin.inc

fun executeLogin(username: String?, password: String?): String{
    val security = mapOf(
        "thuan" to "12345",
        "hung" to "1234567"
    )
    if(username.isNullOrBlank()){
        return "null name"
    }
    if(password.isNullOrBlank()){
        return "null password"
    }
    val realPassword = security[username]
    if (realPassword != null && realPassword == password) {
        return "Success"
    }else if(realPassword == null && realPassword != password){
        return "login error"
    }
    return "Error"
}
fun main() {
    var count = 0
    do{
        print("Nhập tài khoản: ")
        val usernames = readLine()?.trim()
        print("Nhập mật khẩu: ")
        val passwords = readLine()?.trim()
        val user1 = executeLogin(usernames,passwords)
        val result = when (user1){
            "null name" -> "Chưa nhập tên hoặc sai tài khoản"
            "null password" -> "Chưa nhập mật khẩu hoặc sai mật khẩu"
            "login error" -> "Tài khoản hoặc mật khẩu bị sai"
            "Success" -> "Đăng nhập thành công"
            "Error" -> "Đăng nhập không thành công"
            else -> "Không hợp lệ"
        }
        println(result)
        count++
        println("Sai tài khoản hoặc mật khẩu (lần $count/3)")
    }while (count < 3)
    println("Tài khoản của bạn đã bị khóa")
}
