enum class LoginStatus(val message: String){
    LOGIN_EMPTY("Email Hoặc Password Rỗng"),
    LOGIN_ERROR("Email Hoặc Password Lỗi"),
    LOGIN_SUCCESS("Đăng Nhập Thành Công"),
}
enum class RegisterStatus(val message: String){
    INVALID_INPUT("email hoặc password hoặc confirmPassword Rỗng"),
    PASSWORD_NOT_MATCH("password không giống với confirmPassword"),
    EMAIL_EXIST("Email đã tồn tại"),
    SUCCESS("Thành Công")
}
enum class StudentListStatus(val message: String){
    STUDENT_LIST_EMPTY("Rỗng"),
    STUDENT_LIST_SUCCESS("có dữ liệu")

}
enum class StudentDetailStatus(val message: String){
    DETAIL_FOUND("Tìm Thấy"),
    DETAIL_NOT_FOUND("Không Tìm thấy")
}
enum class ResultStatus(val message: String){
    RESULT_PASS("Thành Công"),
    RESULT_FAIL("Lỗi"),
    RESULT_INVALID("Rỗng"),
}
enum class CourseListStatus(val message: String){
    COURSE_LIST_EMPTY("Rỗng"),
    COURSE_LIST_SUCCESS("Có Dữ Liệu")
}
enum class DownloadStatus(val message: String){
    DOWNLOAD_ERROR("Lỗi"),
    NETWORK_ERROR("Mạng Lỗi"),
    DOWNLOAD_TIMEOUT("Hệ thống đang Lỗi"),
    DOWNLOAD_SUCCESS("Thành Công"),
}
enum class SearchStatus(val message: String){
    EMPTY_KEYWORD("Keyword rỗng"),
    SEARCH_SUCCESS("Thành Công"),
    SEARCH_NO_RESULT("Lỗi, không tìm thấy Keyword")
}
