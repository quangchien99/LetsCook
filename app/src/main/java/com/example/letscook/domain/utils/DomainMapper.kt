/*
 * Copyright (c) 2022 All Rights Reserved, Quang Chien Pham.
 */
package com.example.letscook.domain.utils

/**
 * Define the Mapper class for mapping between network model and domain model.
 */
interface DomainMapper<T, DomainModel> {

    /**
     * Handle mapping from [T] to [DomainModel].
     * @param model [T] the entity need to map to [DomainModel].
     * @return [DomainModel] DomainModel
     */
    fun mapToDomainModel(model: T): DomainModel

    /**
     * Handle mapping from [DomainModel] to [T].
     * @param domainModel [DomainModel] the entity need to map to [T].
     * @return [T] T
     */
    fun mapFromDomainModel(domainModel: DomainModel): T
}
