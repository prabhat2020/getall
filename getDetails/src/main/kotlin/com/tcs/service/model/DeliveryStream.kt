package com.tcs.service.model

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document
import java.time.chrono.ChronoLocalDateTime
import java.util.*

@Document(collection = "delivery-stream")
data class DeliveryStream(
        val deliveryStreamNumber: Int?,
        val deliveryStreamName: String?,
        val replenishmentUsedFlag: String?,
        val createdBy: String?,
        val creationDateTime: Date,
        val updatedBy:String?,
        val updatedDateTime: Date,
        val id:String?,
        val _rid:String
)