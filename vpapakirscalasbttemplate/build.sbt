val scala3Version = "3.3.1"

lazy val vpapakirscalasbttemplateCli = project
  .in(file("vpapakirscalasbttemplate-cli"))
  .settings(
    name := "vpapakirscalasbttemplate-cli",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )

lazy val vpapakirscalasbttemplateCommon = project
  .in(file("vpapakirscalasbttemplate-common"))
  .settings(
    name := "vpapakirscalasbttemplate-common",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )

enablePlugins(GhpagesPlugin)

git.remoteRepo := "git@github.com:vpapakir/vpapakir-template-scala-sbt.git"
