package com.example.kotlin_practice.domain.member.model

import jakarta.persistence.*

@Entity
@Table(name = "member")
class Member (
    @Column(name="name", nullable = false)
    var name: String,

    @Column(name="email", nullable = false)
    var email: String,

    @Column(name="password", nullable = false)
    var password: String,

    @Enumerated(EnumType.STRING)
    @Column(name="role", nullable = false)
    var role: Role = Role.MEMBER


) {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq")
    @SequenceGenerator(name = "member_seq", sequenceName = "member_sequence", initialValue = 1, allocationSize = 1)
    var id: Long? = null
}