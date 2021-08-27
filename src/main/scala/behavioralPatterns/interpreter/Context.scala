// ˅
package behavioralPatterns.interpreter

import java.util.StringTokenizer

// ˄

// Analyze the syntax
class Context(text: String) {
  // ˅

  // ˄

  private val tokenizer: StringTokenizer = new StringTokenizer(text)

  private var currentToken: String = ""

  def nextToken(): String = {
    // ˅
    if (tokenizer.hasMoreTokens) {
      currentToken = tokenizer.nextToken()
    }
    else {
      currentToken = ""
    }
    currentToken
    // ˄
  }

  def getToken(): String = {
    // ˅
    currentToken
    // ˄
  }

  def slideToken(token: String): String = {
    // ˅
    if (token != currentToken) {
      throw new Exception(f"WARNING: $token is expected but $currentToken was found.")
    }
    nextToken()
    // ˄
  }

  def getNumber(): Int = {
    // ˅
    try {
      Integer.parseInt(currentToken)
    }
    catch {
      case e: NumberFormatException => throw new Exception(f"WARNING: $e")
    }
    // ˄
  }

  // ˅
  nextToken()
  // ˄
}

// ˅

// ˄
