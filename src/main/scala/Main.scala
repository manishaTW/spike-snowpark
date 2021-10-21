package org.example.snowpark

import com.snowflake.snowpark._
import com.snowflake.snowpark.functions._

object Main {
  def main(args: Array[String]): Unit = {
    // Replace the <placeholders> below.
    val configs = Map (
      "URL" -> "https://xr72588.ap-south-1.aws.snowflakecomputing.com:443",
      "USER" -> "manisha",
      "PASSWORD" -> "Welcome@123",
      "ROLE" -> "SYSADMIN",
      "WAREHOUSE" -> "",
      "DB" -> "DEMO_DB",
      "SCHEMA" -> "PUBLIC"
    )
    val session = Session.builder.configs(configs).create
    session.sql("show tables").show()
    val dfTable = session.table("emp")
//    dfTable.join(dfTable).show(100)
    dfTable.filter(col("id")===1).show
  }
}
