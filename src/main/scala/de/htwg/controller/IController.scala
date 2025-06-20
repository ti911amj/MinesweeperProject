package de.htwg.controller

import de.htwg.controller.controllerComponent.controllerBase.Command
import de.htwg.utility.*
import de.htwg.model.*
import de.htwg.factory.BoardFactory

import scala.collection.mutable
import scala.util.Try
import scala.collection.mutable
import scala.util.Try

trait IController {
  def getBoard: IBoard
  def setBoard(board: IBoard): Unit
  def createNewBoard(factory: BoardFactory): Unit
  def revealCell(row: Int, col: Int): Boolean
  def flagCell(row: Int, col: Int): Unit
  def checkWin(): Boolean
  def resetGame(): String
  def displayBoardToString(revealAll: Boolean = false): String
  def copyBoard(): IBoard
  def doAndStore(cmd: Command): Unit
  def undo(): Unit
  def redo(): Unit
  def remainingFlags(): Int
  def getElapsedTime: Int
  def undoStackSize: Int
  def redoStackSize: Int
  def add(observer: Observer): Unit
  def remove(observer: Observer): Unit
}
