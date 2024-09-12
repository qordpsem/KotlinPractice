package com.example.kotlin_practice.domain.member.dto.response

data class MemberResponse (
    var id: Long,
    var name: String,
    var email: String,
    var role: String
)