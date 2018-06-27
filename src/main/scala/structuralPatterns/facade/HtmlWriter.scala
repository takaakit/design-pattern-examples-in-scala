// ˅
package structuralPatterns.facade

import java.io.Writer

// ˄

class HtmlWriter(_writer: Writer) {
  // ˅
  
  // ˄

  private val writer: Writer = _writer

  // Write a title
  def heading(title: String) = {
    // ˅
    writer.write("<html>")
    writer.write(f"<head><title>$title</title></head>")
    writer.write("<body>\n")
    writer.write(f"<h1>$title</h1>\n")
    // ˄
  }

  // Write a paragraph
  def paragraph(message: String) = {
    // ˅
    writer.write(f"<p>$message</p>\n")
    // ˄
  }

  // Write a link
  def anchor(url: String, text: String) = {
    // ˅
    paragraph("<a href=\"" + url + "\">" + text + "</a>")
    // ˄
  }

  // Write a mail address
  def mailto(mailAddress: String, userName: String) = {
    // ˅
    anchor(f"mailto:$mailAddress", userName)
    // ˄
  }

  def close() = {
    // ˅
    writer.write("</body>")
    writer.write("</html>\n")
    writer.close()
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
