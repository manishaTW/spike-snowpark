name := "snowpark"

version := "0.1"

scalaVersion := "2.12.9"

idePackagePrefix := Some("org.example.snowpark")

resolvers += "OSGeo Release Repository" at "https://repo.osgeo.org/repository/release/"
libraryDependencies += "com.snowflake" % "snowpark" % "0.8.0"