package ca.davidpriest.oxygen

import ca.davidpriest.oxygen.AddContextMenuPlugin._
import ro.sync.exml.plugin.{Plugin, PluginDescriptor}

import scala.beans.BeanProperty

object AddContextMenuPlugin {

  @BeanProperty
  var instance: AddContextMenuPlugin = _
}

class AddContextMenuPlugin(descriptor: PluginDescriptor)
  extends Plugin(descriptor) {

  if (instance != null) {
    throw new IllegalStateException("Already instantiated!")
  }

  instance = this
}
