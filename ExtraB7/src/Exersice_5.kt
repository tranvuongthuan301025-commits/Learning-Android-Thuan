fun evaluateScore(score: Double?, onResult: (ResultStatus) -> Unit){
    score?.run {
        val status = when{
            score < 0 || score>10 -> ResultStatus.RESULT_INVALID
            score>= 5 -> ResultStatus.RESULT_PASS
            score< 5 -> ResultStatus.RESULT_FAIL
            else -> ResultStatus.RESULT_FAIL
        }
        onResult(status)
        return
    }
    onResult(ResultStatus.RESULT_FAIL)
}

