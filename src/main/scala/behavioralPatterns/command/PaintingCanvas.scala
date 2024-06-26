// ˅
package behavioralPatterns.command

import javafx.scene.canvas.Canvas
import javafx.scene.paint.Color

// ˄

class PaintingCanvas(_width: Double, _height: Double) extends Canvas with PaintingTarget {
  // ˅
  setWidth(_width)
  setHeight(_height)
  // ˄

  private val paintingColor: Color = Color.LIGHTGREEN

  // Radius of the painting point
  private val pointRadius: Double = 6.0

  override def paint(paintingPosX: Double, paintingPosY: Double): Unit = {
    // ˅
    getGraphicsContext2D.setFill(paintingColor)
    getGraphicsContext2D.fillOval(paintingPosX - pointRadius, paintingPosY - pointRadius, pointRadius * 3, pointRadius * 3)
    // ˄
  }

  override def clear(): Unit = {
    // ˅
    getGraphicsContext2D.clearRect(0.0, 0.0, _width, _height)
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
