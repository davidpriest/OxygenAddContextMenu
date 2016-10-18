package ca.davidpriest.addcontextmenu

import javax.swing.text.Document

import ro.sync.exml.plugin.document._

class ContextMenu extends DocumentPluginExtension {
  override def process(context: DocumentPluginContext): DocumentPluginResult = {
    val doc = context.getDocument
    val fdoc = testThePlugin(doc.getText(0, doc.getLength))
    doc.remove(0, doc.getLength)
    doc.insertString(0, fdoc, null)

    new DocumentPluginResult {
      def getProcessedDocument: Document = doc
    }
  }

  def testThePlugin(doc: String): String = {
    doc + "Testing!"
  }
}
