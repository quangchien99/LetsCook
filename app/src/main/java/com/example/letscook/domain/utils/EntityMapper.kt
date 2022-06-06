/*
 * Copyright (c) 2022 All Rights Reserved, Quang Chien Pham.
 */
package com.example.letscook.domain.utils

/**
 * Define the Mapper class for mapping between network model and domain model.
 */
interface EntityMapper<Entity, DomainModel> {

    /**
     * Handle mapping from [Entity] to [DomainModel].
     * @param entity [Entity] the entity need to map to [DomainModel].
     * @return [DomainModel] DomainModel
     */
    fun mapFromEntity(entity: Entity): DomainModel

    /**
     * Handle mapping from [DomainModel] to [Entity].
     * @param domainModel [DomainModel] the entity need to map to [Entity].
     * @return [Entity] Entity
     */
    fun mapToEntity(domainModel: DomainModel): Entity
}