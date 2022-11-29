package com.example.jparelationshipkt.service

import com.example.jparelationshipkt.payload.company.CompanyRequest
import org.springframework.http.ResponseEntity

interface CompanyService {
    fun addCompany(companyRequest: CompanyRequest): ResponseEntity<Any?>
}