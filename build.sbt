 resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)

lazy val root = (project in file(".")).
  settings(
    name := "FizzBuzz",
    version := "1.0",
    scalaVersion := "2.11.5"
  )
  
libraryDependencies ++= Seq(
    "org.specs2" %% "specs2-core" % "2.4.15" % "test"
  )
  
scalacOptions ++= Seq("-feature", "-language:implicitConversions","-language:postfixOps")

mainClass in (Compile,run) := Some("FizzBuzz")