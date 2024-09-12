package com.example.kotlin_practice.domain.member.dto.request

import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.Email


data class MemberSignUpRequest (
    var name: String,

    @field:Email(message="올바른 이메일 형식이 아닙니다")
    var email : String,

    var password: String




)