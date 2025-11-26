package moe.kurenai.multitenancy.config

data class ClusterDataSourceProperties(
    val jdbcUrl: String,
    val username: String? = null,
    val password: String? = null,
)