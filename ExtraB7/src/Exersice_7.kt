fun download(statusCode: Int?, onResult: (DownloadStatus)-> Unit){
    statusCode?.let{status->
        val StatusCode = when{
            status == 200 -> DownloadStatus.DOWNLOAD_SUCCESS
            status == 408 -> DownloadStatus.DOWNLOAD_TIMEOUT
            status == 503 -> DownloadStatus.DOWNLOAD_ERROR
            else -> DownloadStatus.NETWORK_ERROR
        }
        onResult(StatusCode)
        return
    }
    onResult(DownloadStatus.NETWORK_ERROR)
}