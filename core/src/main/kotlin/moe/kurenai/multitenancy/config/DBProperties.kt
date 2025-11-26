package moe.kurenai.multitenancy.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "spring")
data class DBProperties(
    val datasource: Map<String, DBConfig>
) {
    data class DBConfig(
        val driverClassName: String? = null,
        val cluster: Map<String, ClusterDataSourceProperties> = emptyMap()
    )
}