fun search(keyword: String?, items: List<String>, onResult: (SearchStatus) -> Unit){
    keyword?.let { checkKW->
        val status = when{
            checkKW.isEmpty() -> SearchStatus.EMPTY_KEYWORD
            items.any(){ it == checkKW }-> SearchStatus.SEARCH_SUCCESS
            else -> SearchStatus.SEARCH_NO_RESULT
        }
        onResult(status)
        return
    }
    onResult(SearchStatus.SEARCH_NO_RESULT)
}