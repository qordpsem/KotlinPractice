package com.example.kotlin_practice.domain.member.service

import com.example.kotlin_practice.domain.member.dto.request.LoginRequest
import com.example.kotlin_practice.domain.member.dto.response.LoginResponse
import com.example.kotlin_practice.domain.member.repository.MemberRepository
import com.example.kotlin_practice.global.exception.ModelNotFoundException
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class MemberServiceImpl(
    private val memberRepository: MemberRepository
) : MemberService {

    override fun login (request: LoginRequest) : LoginResponse {
        val member = memberRepository.findByEmail(request.email) ?: throw ModelNotFoundException("Member")
    }

}