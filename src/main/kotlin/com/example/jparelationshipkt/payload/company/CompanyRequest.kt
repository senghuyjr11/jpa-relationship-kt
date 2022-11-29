package com.example.jparelationshipkt.payload.company

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import lombok.NoArgsConstructor

@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
class CompanyRequest {
    var name: String? = null
    var logo: String? = null
    var website: String? = null
    var category: String? = null
    var companySize: String? = null
    var location: String? = null
    var foundedDate: String? = null
}