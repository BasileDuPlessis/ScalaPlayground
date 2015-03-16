resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)
resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"

lazy val root = (project in file(".")).
  settings(
    name := "ScalaPlayground",
    version := "1.0",
    scalaVersion := "2.11.6-SNAPSHOT"
  )
  
libraryDependencies ++= Seq(
    "org.specs2" %% "specs2-core" % "2.4.16" % "test",
    "org.specs2" %% "specs2-html" % "2.4.16" % "test"
  )
  
scalacOptions ++= Seq("-feature", "-language:implicitConversions","-language:postfixOps")

mainClass in (Compile,run) := Some("fizzbuzz.Fizzbuzz")