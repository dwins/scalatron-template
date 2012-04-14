
class ControlFunctionFactory {
  def create = new Bot().respond _
}

class Bot {
  def respond(input: String) = "Status(text=Hello World)"
}
