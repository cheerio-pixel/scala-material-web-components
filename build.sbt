val scala3Version = "3.6.4"

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "material_web_components",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    scalaJSLinkerConfig ~= (_.withModuleKind(ModuleKind.ESModule)),
    libraryDependencies ++= Seq(
      "com.raquo" %%% "laminar" % "17.0.0" % Provided
    ),
  )
