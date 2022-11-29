package com.example.jparelationshipkt.domain.company

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import jakarta.persistence.*
import lombok.NoArgsConstructor

@Entity
@Table(name = "company")
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int? = null
    var name: String? = null
    var logo: String? = null
    var website: String? = null
    var category: String? = null
    var companySize: String? = null
    var location: String? = null
    var foundedDate: String? = null
    var createdDate: String? = null
    var modifiedDate: String? = null
    var status: Int? = null
}