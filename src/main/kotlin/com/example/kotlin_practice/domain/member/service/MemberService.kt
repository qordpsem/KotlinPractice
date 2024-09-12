package com.example.kotlin_practice.domain.member.service

import com.example.kotlin_practice.domain.member.dto.request.LoginRequest
import com.example.kotlin_practice.domain.member.dto.request.MemberSignUpRequest
import com.example.kotlin_practice.domain.member.dto.response.LoginResponse
import com.example.kotlin_practice.domain.member.dto.response.MemberResponse

interface MemberService {
    fun signUp(request: MemberSignUpRequest): MemberResponse
//    fun login(request: LoginRequest): LoginResponse
}