// ˅
package structuralPatterns.facade

import java.io.Writer

// ˄

class HtmlWriter(_writer: Writer) {
  // ˅
  
  // ˄

  private val writer: Writer = _writer

  // Write a title
  def heading(title: String): Unit = {
    // ˅
    val lineSep = System.getProperty("line.separator")
    writer.write("<html>")
    writer.write(f"<head><title>$title</title></head>")
    writer.write(f"<body>$lineSep")
    writer.write(f"<h1>$title</h1>$lineSep")
    // ˄
  }

  // Write a paragraph
  def paragraph(message: String): Unit = {
    // ˅
    val lineSep = System.getProperty("line.separator")
    writer.write(f"<p>$message</p>$lineSep")
    // ˄
  }

  // Write a link
  def anchor(url: String, text: String): Unit = {
    // ˅
    paragraph("<a href=\"" + url + "\">" + text + "</a>")
    // ˄
  }

  // Write a mail address
  def mailto(mailAddress: String, userName: String): Unit = {
    // ˅
    anchor(f"mailto:$mailAddress", userName)
    // ˄
  }

  def close(): Unit = {
    // ˅
    val lineSep = System.getProperty("line.separator")
    writer.write("</body>")
    writer.write(f"</html>$lineSep")
    writer.close()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
