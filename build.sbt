name := "sticker-multi-module-sbt"

version := Build.version

scalaVersion := Build.scalaVersion

lazy val `sticker-multi-project-sbt` = project.in(file("."))
  .aggregate(
    `sticker-data-mongodb`,
    `sticker-file-aws`,
    `sticker-service`,
    `sticker-userapi`
  )

lazy val `sticker-data-mongodb` = project in file("sticker-data-mongodb")

lazy val `sticker-file-aws` = project in file("sticker-file-aws")

lazy val `sticker-service` = project in file("sticker-service") dependsOn(`sticker-file-aws`, `sticker-data-mongodb`)

lazy val `sticker-userapi` = project in file("sticker-userapi") dependsOn(`sticker-service`)
