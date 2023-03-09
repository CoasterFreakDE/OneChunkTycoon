package nxt.extensions

import de.fruxz.ascend.extension.logging.getItsLogger
import nxt.base.extensions.types.NxTExtension

class OneChunkTycoon : NxTExtension() {

    override fun onLoad() {
        getItsLogger().info("OneChunkTycoon ${pluginInfo.version} loaded")
    }

    override fun onEnable() {
        getItsLogger().info("OneChunkTycoon ${pluginInfo.version} enabled")
    }

    override fun onDisable() {
        getItsLogger().info("OneChunkTycoon ${pluginInfo.version} disabled")
    }
}