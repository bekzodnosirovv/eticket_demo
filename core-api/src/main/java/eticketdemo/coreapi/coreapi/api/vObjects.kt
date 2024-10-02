package eticketdemo.coreapi.coreapi.api

import com.fasterxml.jackson.annotation.JsonInclude


@JsonInclude(JsonInclude.Include.NON_NULL)
data class ConstraintError(
    val field: String,
    val value: String,
    val message: String?
) {
    var messageRu: String = ""
    var messageUz: String = ""
    var messageEn: String = ""

    constructor(field: String, value: String, messageRu: String, messageUz: String, messageEn: String)
            : this(field, value, null) {
        this.messageRu = messageRu
        this.messageUz = messageUz
        this.messageEn = messageEn
    }
}

@JsonInclude(JsonInclude.Include.NON_NULL)
data class ValidatorError(
    var message: String,
    val errors: List<ConstraintError>
) {
    var errorCode: String? = "0"

    constructor(message: String, errors: List<ConstraintError>, errorCode: String)
            : this(message, errors) {
        this.errorCode = errorCode
    }
}