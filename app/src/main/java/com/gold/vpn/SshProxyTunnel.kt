package com.gold.vpn

import java.net.Socket

class SshProxyTunnel(private val config: VpnConfig, private val logCallback: (String) -> Unit) {
    fun connect(): Boolean {
        logCallback("[TUNNEL] Conectando ao Proxy: ${config.proxyHost}:${config.proxyPort}")
        return true
    }
}