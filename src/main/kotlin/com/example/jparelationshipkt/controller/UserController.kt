package com.example.jparelationshipkt.controller

import com.example.jparelationshipkt.payload.company.CompanyRequest
import com.example.jparelationshipkt.service.CompanyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/user")
class UserController {

    @Autowired
    private var companyService: CompanyService? = null

    @PostMapping
    fun addCompany(@RequestBody companyRequest: CompanyRequest): ResponseEntity<Any?>? {
        return companyService?.addCompany(companyRequest)
    }

}