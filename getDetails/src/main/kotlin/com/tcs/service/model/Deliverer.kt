package com.tcs.service.model

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document

@Document(collection = "deliverer")
data class Deliverer (
val delivererNumber:Long?,
val supplierNumber:Long?,
val siteNumber: Int?,
val id:String?,
val _rid:String
)