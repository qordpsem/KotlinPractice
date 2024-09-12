package com.example.kotlin_practice.domain.member.service

import com.example.kotlin_practice.domain.member.dto.request.LoginRequest
import com.example.kotlin_practice.domain.member.dto.request.MemberSignUpRequest
import com.example.kotlin_practice.domain.member.dto.response.LoginResponse
import com.example.kotlin_practice.domain.member.dto.response.MemberResponse
import com.example.kotlin_practice.domain.member.model.Member
import com.example.kotlin_practice.domain.member.model.Role
import com.example.kotlin_practice.domain.member.repository.MemberRepository
import com.example.kotlin_practice.global.exception.ModelNotFoundException
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class MemberServiceImpl(
    private val memberRepository: MemberRepository
) : MemberService {

    @Transactional
    override fun signUp(request: MemberSignUpRequest): MemberResponse {
        if(memberRepository.existsByEmail(request.email)){
            throw IllegalArgumentException("Email already exists")
        }
        val member = memberRepository.save(
            Member(
                name=request.name,
                email=request.email,
                password=request.password,
                role = Role.MEMBER
            )
        )
        return MemberResponse(
            id=member.id!!,
            name=member.name,
            email=member.email,
            role= member.role.name
        )


    }

}