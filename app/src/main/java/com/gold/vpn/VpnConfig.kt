package com.gold.vpn

data class VpnConfig(
    val payload: String,
    val proxyHost: String,
    val proxyPort: Int,
    val username: String,
    val password: String
)