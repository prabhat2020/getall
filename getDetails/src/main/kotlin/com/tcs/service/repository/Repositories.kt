package com.tcs.service.repository

import org.springframework.stereotype.Repository
import com.microsoft.azure.spring.data.cosmosdb.repository.ReactiveCosmosRepository
import com.tcs.service.model.*

/**
 * This file will contain all the repositories interfaces.
 */

@Repository
interface DelivererRepository : ReactiveCosmosRepository<Deliverer, Int>

@Repository
interface DeliverChannelRepository : ReactiveCosmosRepository<DeliveryChannel, Int>

@Repository
interface DeliveryStreamRepository : ReactiveCosmosRepository<DeliveryStream, Int>

@Repository
interface LogisticChannelRepository : ReactiveCosmosRepository<LogisticChannel, Int>