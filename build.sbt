name := "SearchLogsApp"
version := "1.0"
scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.0.0" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.0.0" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.0.0" % "provided"
libraryDependencies += "org.apache.hadoop" % "hadoop-azure" % "2.7.3"
libraryDependencies += "com.microsoft.azure" % "azure-storage" % "2.0.0"
