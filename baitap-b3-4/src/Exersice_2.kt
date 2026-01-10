
enum class Check{
    REGISTER_ERROR,
    INVALID_INPUT,
    PASSWORD_NOT_MATCH,
    EMAIL_EXIST,
    REGISTER_SUCCESS,
}
fun register(email: String?, password: String?, confirmPassword: String?): Check{
    val user1: String = "thuan@gmail.com"
    if(email.isNullOrBlank() || password.isNullOrBlank() || confirmPassword.isNullOrBlank()){
        return Check.INVALID_INPUT
    }
    if(password != confirmPassword){
        return Check.PASSWORD_NOT_MATCH
    }
    if(email == user1){
        return Check.EMAIL_EXIST
    }
    return Check.REGISTER_SUCCESS
}
fun main(){
    print("nhập email của bạn: ")
    val email = readLine()?.trim()
    print("nhập password: ")
    val password = readLine()?.trim()
    print("nhập lại password: ")
    val confirmPassword = readLine()?.trim()

    val user2 = register(email,password,confirmPassword)

    val result = when (user2){
        Check.INVALID_INPUT -> println("email,password hoặc confirmPassword không được để trống")
        Check.PASSWORD_NOT_MATCH ->println("Nhập lại mật khẩu không khớp ! ")
        Check.EMAIL_EXIST -> println("Email này đã tồn tại vui lòng dùng email khác")
        Check.REGISTER_SUCCESS -> println("Đăng Kí thành công")
        else -> println("lỗi")

    }
}
