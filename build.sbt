lazy val root = (project in file("."))
    .settings(scalaVersion := "2.11.8")
    .settings(gensomecode := genSomeCodeTask.value)
    .settings(unmanagedSourceDirectories in Compile += baseDirectory.value / "target/scala-2.11/src_managed/")

lazy val gensomecode = taskKey[Seq[File]]("gen-code")
lazy val genSomeCodeTask = Def.task {
  val file = (sourceManaged in Compile).value / "SomeGenCode.scala"
  println("file: " + file)
  IO.write(file, """object SomeGenCode {
                   |  def doSomething() {
                   |    println("Hi!")
                   |  }
                   |}""".stripMargin)
  Seq(file)
}
