import java.sql.Connection

interface SQLDBConnector
{
    fun connect()
    fun disconnect()
    val isConnected: Boolean
    val connection: Connection?
}
