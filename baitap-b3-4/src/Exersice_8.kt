enum class server(val message: String){
    DOWNLOAD_ERROR("Tải xuống bị lỗi"),
    DOWNLOAD_TIMEOUT("Hết thời gian tải xuống"),
    DOWNLOAD_SUCCESS("Tải xuống Thành Công"),
    NETWORK_ERROR("Mã khác đã bị lỗi")
}
fun status(statusCode: Int): server{
    if(statusCode == 200){
        return server.DOWNLOAD_SUCCESS
    }else if(statusCode == 408){
        return server.DOWNLOAD_TIMEOUT
    }else if(statusCode == 503){
        return server.DOWNLOAD_ERROR
    }
    return server.NETWORK_ERROR
}

fun main(){
    val user = status(300)
    val result = when(user){
        server.NETWORK_ERROR -> server.NETWORK_ERROR.message
        server.DOWNLOAD_ERROR -> server.DOWNLOAD_ERROR.message
        server.DOWNLOAD_TIMEOUT -> server.DOWNLOAD_TIMEOUT.message
        server.DOWNLOAD_SUCCESS -> server.DOWNLOAD_SUCCESS.message
    }
    println(result)
}