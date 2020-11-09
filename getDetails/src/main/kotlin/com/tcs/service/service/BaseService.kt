package com.tcs.service.service

import com.tcs.service.error.customexception.DataNotFoundException
import com.tcs.service.model.*
import com.tcs.service.repository.DeliverChannelRepository
import com.tcs.service.repository.DelivererRepository
import com.tcs.service.repository.DeliveryStreamRepository
import com.tcs.service.repository.LogisticChannelRepository
//import com.tcs.service.repository.TemplateContainerRepository
import org.springframework.stereotype.Service

@Service
class BaseService(private val deliverer: DelivererRepository,
                  private val deliverchannel: DeliverChannelRepository,
                  private val deliveryStream: DeliveryStreamRepository,
                  private val logistic: LogisticChannelRepository) {

    val ndf = "No Data Found"

    fun getdeliverer(): List<Deliverer> {
        return deliverer.findAll().collectList().block()?: throw DataNotFoundException(ndf)
    }

    fun getdeliverchannel(): List<DeliveryChannel> {
        return deliverchannel.findAll().collectList().block()?: throw DataNotFoundException(ndf)
    }

    fun getdeliveryStream(): List<DeliveryStream> {
        return deliveryStream.findAll().collectList().block()?: throw DataNotFoundException(ndf)
    }

    fun getlogistic(): List<LogisticChannel> {
        return logistic.findAll().collectList().block()?: throw DataNotFoundException(ndf)
    }
//    fun getBaseModel(): BaseModel {
//        val result: TemplateContainer = templateContainerRepository.findById(101).block()
//                ?: throw DataNotFoundException(ndf)
//        return BaseModel().copy(modId = result.id.toString(), modDesc = result.name);
//    }
//
//    fun saveModel(model: BaseModel) {
//        templateContainerRepository.save(TemplateContainer(id = model.modId.toInt(), name = model.modDesc))
//
//    }


}