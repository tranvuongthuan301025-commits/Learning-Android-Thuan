fun register(input: RegisterInput?, existingEmail: List<String>, onResult: (RegisterStatus) -> Unit){
    input?.let{checkEmail->
        val email = checkEmail.email
        val pass = checkEmail.password
        val confirm = checkEmail.confirmPassword

        val status = when{
            email.isEmpty() || pass.isEmpty() || confirm.isEmpty() -> RegisterStatus.INVALID_INPUT
            pass != confirm -> RegisterStatus.PASSWORD_NOT_MATCH
            existingEmail.any(){ it == "a@gmail.com" } -> RegisterStatus.EMAIL_EXIST
            else -> RegisterStatus.SUCCESS
        }
        onResult(status)
        return
    }
    onResult(RegisterStatus.PASSWORD_NOT_MATCH)
}
