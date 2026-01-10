enum class loginStatus(val message: String){
    STATE_LOGIN("Màn Hình Đăng Nhập"),
    STATE_LIST("Màn Hình Danh Sách "),
    STATE_SEARCH("Màn Hình Tìm Kiếm")
}
fun check(screemName: String): loginStatus?{
    if(screemName == "login"){
        return loginStatus.STATE_LOGIN
    }else if(screemName == "list"){
        return loginStatus.STATE_LIST
    }else if(screemName == "search"){
        return loginStatus.STATE_SEARCH
    }
    return null
}

fun main(){
    print("chọn màn hình login / list / search (vui lòng ghi bằng chữ thường! ) : ")
    val screenName : String = readln().trim()

    val result = when(check(screenName)){
        loginStatus.STATE_LOGIN -> loginStatus.STATE_LOGIN.message
        loginStatus.STATE_LIST -> loginStatus.STATE_LIST.message
        loginStatus.STATE_SEARCH -> loginStatus.STATE_SEARCH.message
        else -> "lỗi"
    }
    println(result)
}
