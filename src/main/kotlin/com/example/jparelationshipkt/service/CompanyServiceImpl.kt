package com.example.jparelationshipkt.service

import com.example.jparelationshipkt.domain.company.Company
import com.example.jparelationshipkt.domain.company.CompanyRepository
import com.example.jparelationshipkt.payload.company.CompanyRequest
import com.example.jparelationshipkt.utils.ResponseError
import com.example.jparelationshipkt.utils.ResponseObject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class CompanyServiceImpl : CompanyService {

    val responseObject = ResponseObject()

    @Autowired
    private var companyRepository: CompanyRepository? = null

    override fun addCompany(companyRequest: CompanyRequest): ResponseEntity<Any?> {
        val company = Company()
        company.name = companyRequest.name
        company.companySize = companyRequest.companySize
        company.location = companyRequest.location
        company.logo = companyRequest.logo
        company.website = companyRequest.website
        company.category = companyRequest.category
        company.foundedDate = companyRequest.foundedDate
        company.createdDate = "today"
        company.modifiedDate = "today"
        company.status = 1

        responseObject.data = companyRepository?.save(company)
        responseObject.message = "Success"
        responseObject.status = true

        return ResponseEntity.ok(responseObject)
    }


}