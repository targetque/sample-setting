package com.fassto.godomallorderapi.gloabl.config

import com.zaxxer.hikari.HikariConfig
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
class DBConfiguration : HikariConfig() {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    fun dataSource () : DataSource {
        val dataSourceBuilder = DataSourceBuilder.create().build()
        return dataSourceBuilder
    }

}