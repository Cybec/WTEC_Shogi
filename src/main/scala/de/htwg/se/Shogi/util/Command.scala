package de.htwg.se.Shogi.util

/**
 * The Command used for do/undo/redo
 */
trait Command {
  /**
   * Undo Step
   */
  def undoStep(): Unit

  /**
   * Redo Step (after undo)
   */
  def redoStep(): Unit
}

