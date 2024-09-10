package com.example.kotlin_practice.domain.member.controller

import com.example.kotlin_practice.domain.member.dto.request.LoginRequest
import com.example.kotlin_practice.domain.member.dto.response.LoginResponse
import com.example.kotlin_practice.domain.member.service.MemberService
import io.swagger.v3.oas.annotations.Operation
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/members")
class MemberController (
    private val memberService : MemberService
){
    @Operation(summary="로그인")
    @PostMapping("/login")
    fun login(
        @RequestBody loginRequest: LoginRequest) : ResponseEntity<LoginResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(memberService.login(loginRequest))
    }


}