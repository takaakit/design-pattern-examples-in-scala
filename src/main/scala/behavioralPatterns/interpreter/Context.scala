// ˅
package behavioralPatterns.interpreter

import java.util.StringTokenizer

// ˄

// Analyze the syntax
class Context(text: String) {
  // ˅

  // ˄

  private val tokenizer: StringTokenizer = new StringTokenizer(text)

  private var currentToken: String = null

  def nextToken(): String = {
    // ˅
    if (tokenizer.hasMoreTokens()) {
      currentToken = tokenizer.nextToken()
    }
    else {
      currentToken = null
    }
    currentToken
    // ˄
  }

  def getToken(): String = {
    // ˅
    currentToken
    // ˄
  }

  def slideToken(token: String) = {
    // ˅
    if (token != currentToken) {
      throw new Exception(f"WARNING: $token is expected but $currentToken was found.")
    }
    nextToken()
    // ˄
  }

  def getNumber(): Int = {
    // ˅
    var number = 0
    try {
      number = Integer.parseInt(currentToken)
    }
    catch {
      case e: NumberFormatException => throw new Exception(f"WARNING: $e")
    }

    number
    // ˄
  }

  // ˅
  nextToken()
  // ˄
}

// ˅

// ˄
