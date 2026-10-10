package com.gold.vpn

object PayloadFormatter {
    fun formatPayload(rawPayload: String, targetHost: String, targetPort: Int): String {
        var formatted = rawPayload
            .replace("[host_port]", "$targetHost:$targetPort")
            .replace("[host]", targetHost)
            .replace("[port]", targetPort.toString())
            .replace("[crlf]", "\r\n")
        if (!formatted.endsWith("\r\n\r\n")) formatted += "\r\n\r\n"
        return formatted
    }
}