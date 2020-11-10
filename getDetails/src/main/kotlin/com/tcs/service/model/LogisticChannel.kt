package com.tcs.service.model

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document

@Document(collection = "logistic-channel")
data class LogisticChannel (
        val logisticGroupNumber: Int?,
        val storeNumber: Long?,
        val startDate: String?,
        val deliveryStream: Int?,
        val warehouseNumber: Int?,
        val endDate: String?,
        val id:String?
)
