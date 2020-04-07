package example

import org.scalajs.dom
import org.scalajs.dom.document
import scalajs.js
import scala.scalajs.js.annotation.JSExportTopLevel

object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello World.")
    println("Make sure Lewis isn't lying.")
    println("Lewis isn't lying...much.")

    document.getElementById("title").innerHTML = "Scala.js"
    document.getElementById("content").innerHTML = "No more dealing with straight JavaScript!"
    document.getElementById("inclass").innerHTML = "More text"
    appendPar(document.body, "Hello World")
  }

  @JSExportTopLevel("addClickedMessage")
  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button!")
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }

}
