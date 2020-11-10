package com.tcs.service.model

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document

@Document(collection="delivery-channel")
data class DeliveryChannel (
      val deliveryStream: Int?,
      val storeNumber:Long?,
      val startDate: String?,
      val endDate: String?,
      val delivererNumber: Int,
      val id:String?
      
     
      
)
