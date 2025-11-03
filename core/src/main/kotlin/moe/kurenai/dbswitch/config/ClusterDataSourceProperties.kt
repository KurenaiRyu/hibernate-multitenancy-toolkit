package moe.kurenai.dbswitch.config

data class ClusterDataSourceProperties(
    val jdbcUrl: String,
    val username: String? = null,
    val password: String? = null,
)