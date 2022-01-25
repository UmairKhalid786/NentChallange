package com.techlad.nentchallange.di

import com.techlad.nentchallange.feature_sections.domain.datasource.SectionsDataSource
import com.techlad.nentchallange.feature_sections.data.repository.SectionsRepositoryImp
import com.techlad.nentchallange.feature_sections.domain.repository.SectionsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Created by umair.khalid on 25,January,2022
 **/

@Module
@InstallIn(SingletonComponent::class)
class RepositoriesModule {

    @Provides
    fun provideDevicesRepository(dataSourceModule: SectionsDataSource): SectionsRepository =
        SectionsRepositoryImp(dataSource = dataSourceModule)
}