package com.fassto.godomallorderapi.gloabl.config

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.util.StringUtils


@Configuration
class DBConfiguration : HikariConfig() {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    fun dataSourceProperties(): DataSourceProperties {
        return DataSourceProperties()
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    fun dataSource(dataSourceProperties: DataSourceProperties): HikariDataSource {
        // HikariDataSource를 사용하기 위해 Hikari 설정 객체를 생성자로 넣은 HikariDataSource 객체 반환
        val dataSource: HikariDataSource =
            dataSourceProperties.initializeDataSourceBuilder().type(HikariDataSource::class.java).build()
        if (StringUtils.hasText(dataSourceProperties.name)) {
            dataSource.poolName = dataSourceProperties.name
        }
        return dataSource
    }

}