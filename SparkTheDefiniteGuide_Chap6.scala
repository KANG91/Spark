{
  "paragraphs": [
    {
      "text": "%spark\nval absolute_path \u003d \"/home/dskangu/git_KANG91/Spark-The-Definitive-Guide/data/retail-data/by-day\"",
      "user": "dskang",
      "dateUpdated": "2019-01-05 23:31:28.354",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "absolute_path: String \u003d /home/dskangu/git_KANG91/Spark-The-Definitive-Guide/data/retail-data/by-day\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546698668038_-1362347375",
      "id": "20190105-233108_1191391346",
      "dateCreated": "2019-01-05 23:31:08.038",
      "dateStarted": "2019-01-05 23:31:28.435",
      "dateFinished": "2019-01-05 23:31:57.998",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval df \u003d spark.read.format(\"csv\").\n    option(\"header\", \"true\").\n    option(\"inferSchema\", \"true\").\n    load(absolute_path)\ndf.printSchema()\ndf.createOrReplaceTempView(\"dfTable\")",
      "user": "dskang",
      "dateUpdated": "2019-01-05 23:32:50.608",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "df: org.apache.spark.sql.DataFrame \u003d [InvoiceNo: string, StockCode: string ... 6 more fields]\nroot\n |-- InvoiceNo: string (nullable \u003d true)\n |-- StockCode: string (nullable \u003d true)\n |-- Description: string (nullable \u003d true)\n |-- Quantity: integer (nullable \u003d true)\n |-- InvoiceDate: timestamp (nullable \u003d true)\n |-- UnitPrice: double (nullable \u003d true)\n |-- CustomerID: double (nullable \u003d true)\n |-- Country: string (nullable \u003d true)\n\n"
          }
        ]
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "SPARK JOB",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "http://10.0.2.15:4040/jobs/job?id\u003d0",
            "http://10.0.2.15:4040/jobs/job?id\u003d1",
            "http://10.0.2.15:4040/jobs/job?id\u003d2"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546698212341_-1607758210",
      "id": "20190105-232332_725680307",
      "dateCreated": "2019-01-05 23:23:32.341",
      "dateStarted": "2019-01-05 23:32:50.642",
      "dateFinished": "2019-01-05 23:33:08.156",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%md\n#### Change it to spark data type",
      "user": "dskang",
      "dateUpdated": "2019-01-05 23:40:21.289",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "markdown",
          "editOnDblClick": true,
          "completionKey": "TAB",
          "completionSupport": false
        },
        "editorMode": "ace/mode/markdown",
        "editorHide": true,
        "tableHide": false
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "HTML",
            "data": "\u003cdiv class\u003d\"markdown-body\"\u003e\n\u003ch4\u003eChange it to spark data type\u003c/h4\u003e\n\u003c/div\u003e"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546699201241_-445938375",
      "id": "20190105-234001_1709631178",
      "dateCreated": "2019-01-05 23:40:01.241",
      "dateStarted": "2019-01-05 23:40:21.301",
      "dateFinished": "2019-01-05 23:40:22.993",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.lit\n\ndf.select(lit(5), lit(\"five\"), lit(5.0)) //lit function - change data type for spark data type",
      "user": "dskang",
      "dateUpdated": "2019-01-05 23:39:48.302",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "import org.apache.spark.sql.functions.lit\nres8: org.apache.spark.sql.DataFrame \u003d [5: int, five: string ... 1 more field]\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546698770608_196725343",
      "id": "20190105-233250_98187223",
      "dateCreated": "2019-01-05 23:32:50.608",
      "dateStarted": "2019-01-05 23:39:48.338",
      "dateFinished": "2019-01-05 23:39:49.611",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%md\n#### Change it to booliean data type",
      "user": "dskang",
      "dateUpdated": "2019-01-05 23:40:46.333",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "markdown",
          "editOnDblClick": true,
          "completionKey": "TAB",
          "completionSupport": false
        },
        "editorMode": "ace/mode/markdown",
        "editorHide": true,
        "tableHide": false
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "HTML",
            "data": "\u003cdiv class\u003d\"markdown-body\"\u003e\n\u003ch4\u003eChange it to booliean data type\u003c/h4\u003e\n\u003c/div\u003e"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546699228567_284371738",
      "id": "20190105-234028_428027595",
      "dateCreated": "2019-01-05 23:40:28.567",
      "dateStarted": "2019-01-05 23:40:46.342",
      "dateFinished": "2019-01-05 23:40:46.382",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n\nimport org.apache.spark.sql.functions.col\n\ndf.where(col(\"InvoiceNo\").equalTo(536365)). // check if value is 536365 from column named \"InvoiceNo\" \nselect(\"InvoiceNo\", \"Description\").\nshow(5, false)",
      "user": "dskang",
      "dateUpdated": "2019-01-05 23:42:58.405",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "import org.apache.spark.sql.functions.col\n+---------+-----------------------------------+\n|InvoiceNo|Description                        |\n+---------+-----------------------------------+\n|536365   |WHITE HANGING HEART T-LIGHT HOLDER |\n|536365   |WHITE METAL LANTERN                |\n|536365   |CREAM CUPID HEARTS COAT HANGER     |\n|536365   |KNITTED UNION FLAG HOT WATER BOTTLE|\n|536365   |RED WOOLLY HOTTIE WHITE HEART.     |\n+---------+-----------------------------------+\nonly showing top 5 rows\n\n"
          }
        ]
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "SPARK JOB",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "http://10.0.2.15:4040/jobs/job?id\u003d3"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546699188302_1527670170",
      "id": "20190105-233948_789012432",
      "dateCreated": "2019-01-05 23:39:48.302",
      "dateStarted": "2019-01-05 23:41:56.870",
      "dateFinished": "2019-01-05 23:41:59.536",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//better way to handling booliean type than above\ndf.where(\"InvoiceNo \u003d 536365\").\nshow(5, false)",
      "user": "dskang",
      "dateUpdated": "2019-01-05 23:44:11.353",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "+---------+---------+-----------------------------------+--------+---------------------+---------+----------+--------------+\n|InvoiceNo|StockCode|Description                        |Quantity|InvoiceDate          |UnitPrice|CustomerID|Country       |\n+---------+---------+-----------------------------------+--------+---------------------+---------+----------+--------------+\n|536365   |85123A   |WHITE HANGING HEART T-LIGHT HOLDER |6       |2010-12-01 08:26:00.0|2.55     |17850.0   |United Kingdom|\n|536365   |71053    |WHITE METAL LANTERN                |6       |2010-12-01 08:26:00.0|3.39     |17850.0   |United Kingdom|\n|536365   |84406B   |CREAM CUPID HEARTS COAT HANGER     |8       |2010-12-01 08:26:00.0|2.75     |17850.0   |United Kingdom|\n|536365   |84029G   |KNITTED UNION FLAG HOT WATER BOTTLE|6       |2010-12-01 08:26:00.0|3.39     |17850.0   |United Kingdom|\n|536365   |84029E   |RED WOOLLY HOTTIE WHITE HEART.     |6       |2010-12-01 08:26:00.0|3.39     |17850.0   |United Kingdom|\n+---------+---------+-----------------------------------+--------+---------------------+---------+----------+--------------+\nonly showing top 5 rows\n\n"
          }
        ]
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "SPARK JOB",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "http://10.0.2.15:4040/jobs/job?id\u003d6"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546699316823_-59417560",
      "id": "20190105-234156_967070155",
      "dateCreated": "2019-01-05 23:41:56.823",
      "dateStarted": "2019-01-05 23:44:11.394",
      "dateFinished": "2019-01-05 23:44:13.032",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval priceFilter \u003d col(\"UnitPrice\") \u003e 600\nval descripFilter \u003d col(\"Description\").contains(\"POSTAGE\")\ndf.where(col(\"StockCode\").isin(\"DOT\")).where(priceFilter.or(descripFilter)).show(5)",
      "user": "dskang",
      "dateUpdated": "2019-01-05 23:50:34.388",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "priceFilter: org.apache.spark.sql.Column \u003d (UnitPrice \u003e 600)\ndescripFilter: org.apache.spark.sql.Column \u003d contains(Description, POSTAGE)\n+---------+---------+--------------+--------+--------------------+---------+----------+--------------+\n|InvoiceNo|StockCode|   Description|Quantity|         InvoiceDate|UnitPrice|CustomerID|       Country|\n+---------+---------+--------------+--------+--------------------+---------+----------+--------------+\n|   580610|      DOT|DOTCOM POSTAGE|       1|2011-12-05 11:48:...|  2196.67|      null|United Kingdom|\n|   580612|      DOT|DOTCOM POSTAGE|       1|2011-12-05 11:58:...|   2114.0|      null|United Kingdom|\n|   580727|      DOT|DOTCOM POSTAGE|       1|2011-12-05 17:17:...|  1599.26|   14096.0|United Kingdom|\n|   580729|      DOT|DOTCOM POSTAGE|       1|2011-12-05 17:24:...|   1172.1|      null|United Kingdom|\n|   580730|      DOT|DOTCOM POSTAGE|       1|2011-12-05 17:28:...|   845.23|      null|United Kingdom|\n+---------+---------+--------------+--------+--------------------+---------+----------+--------------+\nonly showing top 5 rows\n\n"
          }
        ]
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "SPARK JOB",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "http://10.0.2.15:4040/jobs/job?id\u003d10"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546699433017_-451403808",
      "id": "20190105-234353_1808344201",
      "dateCreated": "2019-01-05 23:43:53.017",
      "dateStarted": "2019-01-05 23:50:34.438",
      "dateFinished": "2019-01-05 23:50:35.753",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval DOTCodeFilter \u003d col(\"StockCode\") \u003d\u003d\u003d \"DOT\"\nval priceFilter \u003d col(\"UnitPrice\") \u003e 600\nval descripFilter \u003d col(\"Description\").contains(\"POSTAGE\")\n\ndf.withColumn(\"IsExpensive\", DOTCodeFilter.and(priceFilter.or(descripFilter))).\nwhere(\"isExpensive\").\nselect(\"unitPrice\", \"isExpensive\").show(5)",
      "user": "dskang",
      "dateUpdated": "2019-01-05 23:51:12.956",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "DOTCodeFilter: org.apache.spark.sql.Column \u003d (StockCode \u003d DOT)\npriceFilter: org.apache.spark.sql.Column \u003d (UnitPrice \u003e 600)\ndescripFilter: org.apache.spark.sql.Column \u003d contains(Description, POSTAGE)\n+---------+-----------+\n|unitPrice|isExpensive|\n+---------+-----------+\n|  2196.67|       true|\n|   2114.0|       true|\n|  1599.26|       true|\n|   1172.1|       true|\n|   845.23|       true|\n+---------+-----------+\nonly showing top 5 rows\n\n"
          }
        ]
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "SPARK JOB",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "http://10.0.2.15:4040/jobs/job?id\u003d11"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546699553554_822220274",
      "id": "20190105-234553_877524390",
      "dateCreated": "2019-01-05 23:45:53.554",
      "dateStarted": "2019-01-05 23:51:13.002",
      "dateFinished": "2019-01-05 23:51:14.483",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.{expr, not, col}\n\ndf.withColumn(\"isExpensive\", not(col(\"UnitPrice\").leq(250))).\nfilter(\"isExpensive\").\nselect(\"Description\", \"UnitPrice\").show(5)\n\ndf.withColumn(\"isExpensive\", expr(\"NOT UnitPrice \u003c\u003d 250\")).\nfilter(\"isExpensive\").\nselect(\"Description\", \"UnitPrice\").show(5)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 00:00:16.384",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "import org.apache.spark.sql.functions.{expr, not, col}\n+--------------+---------+\n|   Description|UnitPrice|\n+--------------+---------+\n|    AMAZON FEE|  11586.5|\n|    AMAZON FEE| 17836.46|\n|DOTCOM POSTAGE|  2196.67|\n|DOTCOM POSTAGE|   2114.0|\n|DOTCOM POSTAGE|  1599.26|\n+--------------+---------+\nonly showing top 5 rows\n\n+--------------+---------+\n|   Description|UnitPrice|\n+--------------+---------+\n|    AMAZON FEE|  11586.5|\n|    AMAZON FEE| 17836.46|\n|DOTCOM POSTAGE|  2196.67|\n|DOTCOM POSTAGE|   2114.0|\n|DOTCOM POSTAGE|  1599.26|\n+--------------+---------+\nonly showing top 5 rows\n\n"
          }
        ]
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "SPARK JOB",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "http://10.0.2.15:4040/jobs/job?id\u003d12",
            "http://10.0.2.15:4040/jobs/job?id\u003d13"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546699872956_1042159543",
      "id": "20190105-235112_702361812",
      "dateCreated": "2019-01-05 23:51:12.956",
      "dateStarted": "2019-01-06 00:00:16.419",
      "dateFinished": "2019-01-06 00:00:18.117",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval crime \u003d spark.read.format(\"csv\").\noption(\"header\", \"true\").\noption(\"inferSchema\", \"true\").\nload(\"/home/dskangu/crime.csv\")",
      "user": "dskang",
      "dateUpdated": "2019-01-06 00:02:06.063",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "crime: org.apache.spark.sql.DataFrame \u003d [ID: int, Case Number: string ... 20 more fields]\n"
          }
        ]
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "SPARK JOB",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "http://10.0.2.15:4040/jobs/job?id\u003d14",
            "http://10.0.2.15:4040/jobs/job?id\u003d15",
            "http://10.0.2.15:4040/jobs/job?id\u003d16"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546700416384_-1971226120",
      "id": "20190106-000016_1760314233",
      "dateCreated": "2019-01-06 00:00:16.384",
      "dateStarted": "2019-01-06 00:02:06.096",
      "dateFinished": "2019-01-06 00:02:24.258",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ncrime.show(5)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 00:02:16.675",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "+--------+-----------+--------------------+--------------------+----+-------------+--------------------+--------------------+------+--------+----+--------+----+--------------+--------+------------+------------+----+--------------------+------------+-------------+--------------------+\n|      ID|Case Number|                Date|               Block|IUCR| Primary Type|         Description|Location Description|Arrest|Domestic|Beat|District|Ward|Community Area|FBI Code|X Coordinate|Y Coordinate|Year|          Updated On|    Latitude|    Longitude|            Location|\n+--------+-----------+--------------------+--------------------+----+-------------+--------------------+--------------------+------+--------+----+--------+----+--------------+--------+------------+------------+----+--------------------+------------+-------------+--------------------+\n|10000092|   HY189866|03/18/2015 07:44:...|     047XX W OHIO ST|041A|      BATTERY| AGGRAVATED: HANDGUN|              STREET| false|   false|1111|      11|  28|            25|     04B|     1144606|     1903566|2015|02/10/2018 03:50:...|41.891398861|-87.744384567|(41.891398861, -8...|\n|10000094|   HY190059|03/18/2015 11:00:...|066XX S MARSHFIEL...|4625|OTHER OFFENSE|    PAROLE VIOLATION|              STREET|  true|   false| 725|       7|  15|            67|      26|     1166468|     1860715|2015|02/10/2018 03:50:...|41.773371528|-87.665319468|(41.773371528, -8...|\n|10000095|   HY190052|03/18/2015 10:45:...|044XX S LAKE PARK...|0486|      BATTERY|DOMESTIC BATTERY ...|           APARTMENT| false|    true| 222|       2|   4|            39|     08B|     1185075|     1875622|2015|02/10/2018 03:50:...| 41.81386068|-87.596642837|(41.81386068, -87...|\n|10000096|   HY190054|03/18/2015 10:30:...|051XX S MICHIGAN AVE|0460|      BATTERY|              SIMPLE|           APARTMENT| false|   false| 225|       2|   3|            40|     08B|     1178033|     1870804|2015|02/10/2018 03:50:...|41.800802415|-87.622619343|(41.800802415, -8...|\n|10000097|   HY189976|03/18/2015 09:00:...|    047XX W ADAMS ST|031A|      ROBBERY|      ARMED: HANDGUN|            SIDEWALK| false|   false|1113|      11|  28|            25|      03|     1144920|     1898709|2015|02/10/2018 03:50:...|41.878064761|-87.743354013|(41.878064761, -8...|\n+--------+-----------+--------------------+--------------------+----+-------------+--------------------+--------------------+------+--------+----+--------+----+--------------+--------+------------+------------+----+--------------------+------------+-------------+--------------------+\nonly showing top 5 rows\n\n"
          }
        ]
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "SPARK JOB",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "http://10.0.2.15:4040/jobs/job?id\u003d17"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546700519912_-1891831215",
      "id": "20190106-000159_1491472863",
      "dateCreated": "2019-01-06 00:01:59.912",
      "dateStarted": "2019-01-06 00:02:16.895",
      "dateFinished": "2019-01-06 00:02:25.107",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%md\n#### Handling with numeric data",
      "user": "dskang",
      "dateUpdated": "2019-01-06 00:11:09.280",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "markdown",
          "editOnDblClick": true,
          "completionKey": "TAB",
          "completionSupport": false
        },
        "editorMode": "ace/mode/markdown",
        "editorHide": true,
        "tableHide": false
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "HTML",
            "data": "\u003cdiv class\u003d\"markdown-body\"\u003e\n\u003ch4\u003eHandling with numeric data\u003c/h4\u003e\n\u003c/div\u003e"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546700876671_-1533110496",
      "id": "20190106-000756_600934440",
      "dateCreated": "2019-01-06 00:07:56.671",
      "dateStarted": "2019-01-06 00:11:09.292",
      "dateFinished": "2019-01-06 00:11:09.356",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.{expr, pow}\n\nval fabricatedQuantity \u003d pow(col(\"Quantity\") * col(\"UnitPrice\"), 2) + 5\ndf.select(expr(\"CustomerId\"), fabricatedQuantity.alias(\"realQuantity\")).show(2)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 00:12:44.960",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "import org.apache.spark.sql.functions.{expr, pow}\nfabricatedQuantity: org.apache.spark.sql.Column \u003d (POWER((Quantity * UnitPrice), 2.0) + 5)\n+----------+------------+\n|CustomerId|realQuantity|\n+----------+------------+\n|   14075.0|   7387.2464|\n|   14075.0|       630.0|\n+----------+------------+\nonly showing top 2 rows\n\n"
          }
        ]
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "SPARK JOB",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "http://10.0.2.15:4040/jobs/job?id\u003d19"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546700536675_1836399909",
      "id": "20190106-000216_40686673",
      "dateCreated": "2019-01-06 00:02:16.675",
      "dateStarted": "2019-01-06 00:12:45.003",
      "dateFinished": "2019-01-06 00:12:46.696",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.selectExpr(\n    \"CustomerId\",\n    \"(POWER((Quantity * UnitPrice), 2.0) + 5 as realQauntity\").show(2)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 00:15:15.000",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "ERROR",
        "msg": [
          {
            "type": "TEXT",
            "data": "org.apache.spark.sql.catalyst.parser.ParseException:\nno viable alternative at input \u0027(POWER((Quantity * UnitPrice), 2.0) + 5 as\u0027(line 1, pos 40)\n\n\u003d\u003d SQL \u003d\u003d\n(POWER((Quantity * UnitPrice), 2.0) + 5 as realQauntity\n----------------------------------------^^^\n\n  at org.apache.spark.sql.catalyst.parser.ParseException.withCommand(ParseDriver.scala:197)\n  at org.apache.spark.sql.catalyst.parser.AbstractSqlParser.parse(ParseDriver.scala:99)\n  at org.apache.spark.sql.execution.SparkSqlParser.parse(SparkSqlParser.scala:45)\n  at org.apache.spark.sql.catalyst.parser.AbstractSqlParser.parseExpression(ParseDriver.scala:43)\n  at org.apache.spark.sql.Dataset$$anonfun$selectExpr$1.apply(Dataset.scala:1005)\n  at org.apache.spark.sql.Dataset$$anonfun$selectExpr$1.apply(Dataset.scala:1004)\n  at scala.collection.TraversableLike$$anonfun$map$1.apply(TraversableLike.scala:234)\n  at scala.collection.TraversableLike$$anonfun$map$1.apply(TraversableLike.scala:234)\n  at scala.collection.IndexedSeqOptimized$class.foreach(IndexedSeqOptimized.scala:33)\n  at scala.collection.mutable.WrappedArray.foreach(WrappedArray.scala:35)\n  at scala.collection.TraversableLike$class.map(TraversableLike.scala:234)\n  at scala.collection.AbstractTraversable.map(Traversable.scala:104)\n  at org.apache.spark.sql.Dataset.selectExpr(Dataset.scala:1004)\n  ... 52 elided\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546700563064_-2126362897",
      "id": "20190106-000243_2072251383",
      "dateCreated": "2019-01-06 00:02:43.064",
      "dateStarted": "2019-01-06 00:15:15.051",
      "dateFinished": "2019-01-06 00:15:15.712",
      "status": "ERROR",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.{round, bround}\n\ndf.select(round(col(\"UnitPrice\"), 1).alias(\"rounded\"), col(\"UnitPrice\")).show(5)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 00:21:27.554",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "import org.apache.spark.sql.functions.{round, bround}\n+-------+---------+\n|rounded|UnitPrice|\n+-------+---------+\n|    1.8|     1.79|\n|    1.3|     1.25|\n|    1.7|     1.65|\n|    1.3|     1.25|\n|    2.6|     2.55|\n+-------+---------+\nonly showing top 5 rows\n\n"
          }
        ]
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "SPARK JOB",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "http://10.0.2.15:4040/jobs/job?id\u003d20"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546701223808_-1742559978",
      "id": "20190106-001343_1058008318",
      "dateCreated": "2019-01-06 00:13:43.808",
      "dateStarted": "2019-01-06 00:21:27.608",
      "dateFinished": "2019-01-06 00:21:29.235",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.lit\n\ndf.select(round(lit(\"2.5\")), bround(lit(\"2.5\"))).show(2)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 00:39:43.760",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "import org.apache.spark.sql.functions.lit\n+-------------+--------------+\n|round(2.5, 0)|bround(2.5, 0)|\n+-------------+--------------+\n|          3.0|           2.0|\n|          3.0|           2.0|\n+-------------+--------------+\nonly showing top 2 rows\n\n"
          }
        ]
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "SPARK JOB",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "http://10.0.2.15:4040/jobs/job?id\u003d27"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546702536346_-921516045",
      "id": "20190106-003536_1281484893",
      "dateCreated": "2019-01-06 00:35:36.347",
      "dateStarted": "2019-01-06 00:39:43.787",
      "dateFinished": "2019-01-06 00:39:44.427",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%md\n#### Get Correlation ",
      "user": "dskang",
      "dateUpdated": "2019-01-06 00:40:18.789",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "markdown",
          "editOnDblClick": true,
          "completionKey": "TAB",
          "completionSupport": false
        },
        "editorMode": "ace/mode/markdown",
        "editorHide": true,
        "tableHide": false
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "HTML",
            "data": "\u003cdiv class\u003d\"markdown-body\"\u003e\n\u003ch4\u003eGet Correlation\u003c/h4\u003e\n\u003c/div\u003e"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546702807002_493870979",
      "id": "20190106-004007_1433074792",
      "dateCreated": "2019-01-06 00:40:07.002",
      "dateStarted": "2019-01-06 00:40:18.790",
      "dateFinished": "2019-01-06 00:40:18.810",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.{corr}\n\ndf.stat.corr(\"Quantity\", \"UnitPrice\")\ndf.select(corr(\"Quantity\", \"UnitPrice\")).show()",
      "user": "dskang",
      "dateUpdated": "2019-01-06 00:43:42.622",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "import org.apache.spark.sql.functions.corr\nres70: Double \u003d -0.0012349245448702957\n+-------------------------+\n|corr(Quantity, UnitPrice)|\n+-------------------------+\n|     -0.00123492454487...|\n+-------------------------+\n\n"
          }
        ]
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "SPARK JOB",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "http://10.0.2.15:4040/jobs/job?id\u003d30",
            "http://10.0.2.15:4040/jobs/job?id\u003d31"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546702550468_-960549844",
      "id": "20190106-003550_2110175928",
      "dateCreated": "2019-01-06 00:35:50.468",
      "dateStarted": "2019-01-06 00:43:42.654",
      "dateFinished": "2019-01-06 00:43:45.444",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.describe().show()",
      "user": "dskang",
      "dateUpdated": "2019-01-06 00:46:30.655",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "+-------+-----------------+-----------------+------------------+\n|summary|         Quantity|        UnitPrice|        CustomerID|\n+-------+-----------------+-----------------+------------------+\n|  count|           541909|           541909|            406829|\n|   mean| 9.55224954743324|4.611113626089641|15287.690570239585|\n| stddev|218.0811578502335|96.75985306117963| 1713.600303321597|\n|    min|           -80995|        -11062.06|           12346.0|\n|    max|            80995|          38970.0|           18287.0|\n+-------+-----------------+-----------------+------------------+\n\n"
          }
        ]
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "SPARK JOB",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "http://10.0.2.15:4040/jobs/job?id\u003d33"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546703172725_457158659",
      "id": "20190106-004612_2097912276",
      "dateCreated": "2019-01-06 00:46:12.725",
      "dateStarted": "2019-01-06 00:46:30.685",
      "dateFinished": "2019-01-06 00:46:32.934",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.{count, mean, stddev_pop, min, max}",
      "user": "dskang",
      "dateUpdated": "2019-01-06 00:47:10.525",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "import org.apache.spark.sql.functions.{count, mean, stddev_pop, min, max}\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546703173028_172895782",
      "id": "20190106-004613_736838888",
      "dateCreated": "2019-01-06 00:46:13.028",
      "dateStarted": "2019-01-06 00:47:10.558",
      "dateFinished": "2019-01-06 00:47:10.847",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval colName \u003d \"UnitPrice\"\nval quantileProbs \u003d Array(0.5)\nval relError \u003d 0.05\n\ndf.stat.approxQuantile(\"UnitPrice\", quantileProbs, relError)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 00:50:28.990",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "colName: String \u003d UnitPrice\nquantileProbs: Array[Double] \u003d Array(0.5)\nrelError: Double \u003d 0.05\nres85: Array[Double] \u003d Array(2.08)\n"
          }
        ]
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "SPARK JOB",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "http://10.0.2.15:4040/jobs/job?id\u003d34"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546702551068_2028738043",
      "id": "20190106-003551_774348696",
      "dateCreated": "2019-01-06 00:35:51.068",
      "dateStarted": "2019-01-06 00:50:29.014",
      "dateFinished": "2019-01-06 00:50:32.316",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.stat.crosstab(\"StockCode\", \"Quantity\").show()",
      "user": "dskang",
      "dateUpdated": "2019-01-06 00:50:52.525",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "+------------------+---+---+----+-----+----+----+----+----+----+-----+----+-----+----+----+-----+---+----+-----+----+----+-----+-----+----+-----+----+----+-----+----+----+----+---+----+-----+-----+----+----+----+----+-----+-----+----+-----+---+----+-----+----+----+----+-----+----+----+---+----+-----+-----+----+-----+----+----+-----+----+---+----+----+-----+-----+-----+----+----+----+----+----+-----+----+---+----+----+----+----+-----+----+-----+----+---+----+----+----+----+----+----+---+----+----+----+----+-----+---+----+-----+----+----+---+---+----+-----+-----+----+----+----+----+----+----+---+----+----+----+---+----+----+----+----+---+----+----+----+----+----+-----+---+----+----+----+-----+---+----+----+----+----+----+---+-----+-----+----+---+----+----+----+----+----+----+---+----+-----+----+-----+---+----+---+---+----+-----+----+----+---+----+-----+-----+----+----+-----+----+---+----+----+----+----+---+----+----+----+----+---+----+----+----+----+---+----+---+----+----+-----+---+---+----+----+---+----+----+----+---+---+----+----+---+----+---+----+----+---+----+----+----+---+----+---+----+----+----+---+----+---+----+---+----+-----+----+---+---+---+----+----+---+---+----+---+----+-----+---+----+---+----+----+---+---+----+---+---+----+---+---+----+---+----+---+----+----+---+----+---+---+----+---+----+---+----+----+----+---+----+---+----+----+---+---+----+---+---+----+----+---+---+----+------+---+----+----+----+---+---+---+----+---+---+---+----+------+---+---+----+---+---+----+---+---+----+---+---+---+---+----+----+-----+---+---+---+-----+----+---+---+---+----+-----+----+---+----+---+---+----+---+---+---+----+----+---+----+---+----+---+---+----+---+---+---+---+---+---+---+---+----+---+----+---+---+----+---+---+---+---+---+----+---+---+---+---+---+-----+---+---+----+----+---+----+---+---+----+---+---+---+---+----+----+---+---+---+---+----+---+---+----+----+---+----+---+----+---+---+----+---+---+---+---+----+---+---+---+----+---+----+---+---+----+---+---+---+---+---+---+----+---+---+---+---+---+---+---+---+---+---+----+---+---+---+----+---+---+---+---+----+----+---+---+---+----+---+---+----+---+---+----+----+---+---+---+---+----+---+---+---+----+---+----+---+---+---+---+---+----+---+---+---+---+---+----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+----+---+---+---+---+---+---+---+---+---+---+---+---+----+---+---+----+---+---+---+---+---+---+---+----+---+---+---+---+---+---+---+---+----+---+---+---+---+---+----+---+---+---+---+----+----+---+---+----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+----+---+---+---+---+---+----+---+---+---+---+---+---+---+---+---+---+---+---+---+----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+-----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+-----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n|StockCode_Quantity| -1|-10|-100|-1000|-101|-102|-103|-104|-105|-1050|-106|-1060|-108|-109|-1092|-11|-110|-1100|-111|-112|-1121|-1128|-113|-1131|-114|-115|-1158|-116|-117|-118|-12|-120|-1200|-1206|-121|-124|-125|-126|-1277|-1284|-129|-1296|-13|-130|-1300|-131|-132|-135|-1350|-138|-139|-14|-140|-1400|-1430|-144|-1440|-145|-147|-1479|-149|-15|-150|-151|-1510|-1512|-1515|-152|-153|-154|-155|-156|-1560|-158|-16|-160|-161|-162|-164|-1671|-168|-1681|-169|-17|-170|-173|-175|-177|-178|-179|-18|-180|-184|-186|-188|-1897|-19|-192|-1930|-194|-197| -2|-20|-200|-2000|-2003|-201|-203|-204|-206|-207|-209|-21|-210|-212|-217|-22|-220|-223|-224|-227|-23|-230|-231|-232|-234|-235|-2376|-24|-240|-242|-244|-2472|-25|-250|-251|-252|-256|-259|-26|-2600|-2618|-267|-27|-270|-271|-272|-275|-276|-278|-28|-280|-2834|-288|-2880|-29|-290| -3|-30|-300|-3000|-304|-306|-31|-310|-3100|-3114|-312|-313|-3167|-318|-32|-320|-323|-324|-327|-33|-334|-335|-337|-338|-34|-342|-343|-345|-346|-35|-355|-36|-360|-365|-3667|-37|-38|-380|-384|-39|-390|-391|-398| -4|-40|-400|-408|-41|-413|-42|-420|-428|-43|-430|-432|-434|-44|-443|-45|-450|-455|-458|-46|-468|-47|-472|-48|-480|-4830|-484|-49| -5|-50|-500|-504|-51|-52|-524|-53|-530|-5368|-54|-541|-55|-550|-553|-56|-57|-576|-58|-59|-590| -6|-60|-600|-61|-618|-62|-620|-624|-63|-635|-64|-65|-657|-66|-664|-67|-670|-674|-675|-68|-682|-69|-690|-696| -7|-70|-701|-71|-72|-720|-723|-73|-74|-741|-74215|-75|-750|-752|-756|-76|-77|-78|-786|-79| -8|-80|-800|-80995|-81|-82|-828|-83|-84|-840|-85|-86|-864|-87|-88| -9|-90|-900|-905|-9058|-91|-92|-93|-9360|-939|-94|-95|-96|-960|-9600|-967|-97|-975|-98|-99|-990|  1| 10|100|1000|1008|101|1010|102|1020|104|105|1056|106|107|108|109| 11|110|111|112|1120|113|1130|114|115|1152|116|117|118| 12|120|1200|121|122|123|124|125|12540|126|128|1284|1287|129|1296| 13|130|1300|131|132|133|135|1350|1356|136|137|138|139|1394| 14|140|1400|1404|141|1412|142|1428|143|144|1440|145|146|147|148|1488|149| 15|150|1500|151|1515|152|153|1540|155|156|157|158| 16|160|1600|162|163|164|165|167|168| 17|170|171|172|1728|175|176|177|1788|179| 18|180|181|1820|1824|183|184|186|1878|188| 19|1900|192|193|1930|1944|196|197|198|199|1992|  2| 20|200|2000|204|2040|205|207|208| 21|210|2100|211|212|213|215|216|2160|219| 22|220|222|224|225|227|228| 23|230|232|234|236| 24|240|2400|242|244|245|246|248|249| 25|250|252|253|255|256|2560|257|258|2592| 26|261|264|267|268| 27|270|2700|272|273|276|279| 28|280|281|288|2880| 29|291|  3| 30|300|3000|304|306| 31|310|3100|3114|312|314|3186| 32|320|323|324|326| 33|330|335|336| 34|342|344|348| 35|350|352| 36|360| 37|370|374|375|378| 38|384|388| 39|3906|392|396|  4| 40|400|4000|402|404|407|408| 41|410|416| 42|420|425|428| 43|430|4300|432| 44|448| 45|450|456| 46|460|462|468| 47|478| 48|480|4800|484| 49|490|492|494|496|  5| 50|500|504| 51|512| 52|528| 53| 54|540| 55|552|5568| 56|560| 57|576| 58|588| 59|  6| 60|600|608| 61|612| 62|620|624|628| 63|630|637| 64|640|648| 65|654| 66|660|666| 67|670|672| 68|682|684|688| 69|696|698|  7| 70|700|701|708| 71| 72|720| 73|738| 74|74215|744| 75|750|752|756| 76|760|768| 77|774| 78| 79|  8| 80|800|80995| 81| 82|824|828| 83|832| 84|840| 85|852| 86|860|864| 87| 88|888| 89|  9| 90|900|906| 91|912| 92| 93| 94| 95| 96|960|968| 97|972| 98| 99|992|\n+------------------+---+---+----+-----+----+----+----+----+----+-----+----+-----+----+----+-----+---+----+-----+----+----+-----+-----+----+-----+----+----+-----+----+----+----+---+----+-----+-----+----+----+----+----+-----+-----+----+-----+---+----+-----+----+----+----+-----+----+----+---+----+-----+-----+----+-----+----+----+-----+----+---+----+----+-----+-----+-----+----+----+----+----+----+-----+----+---+----+----+----+----+-----+----+-----+----+---+----+----+----+----+----+----+---+----+----+----+----+-----+---+----+-----+----+----+---+---+----+-----+-----+----+----+----+----+----+----+---+----+----+----+---+----+----+----+----+---+----+----+----+----+----+-----+---+----+----+----+-----+---+----+----+----+----+----+---+-----+-----+----+---+----+----+----+----+----+----+---+----+-----+----+-----+---+----+---+---+----+-----+----+----+---+----+-----+-----+----+----+-----+----+---+----+----+----+----+---+----+----+----+----+---+----+----+----+----+---+----+---+----+----+-----+---+---+----+----+---+----+----+----+---+---+----+----+---+----+---+----+----+---+----+----+----+---+----+---+----+----+----+---+----+---+----+---+----+-----+----+---+---+---+----+----+---+---+----+---+----+-----+---+----+---+----+----+---+---+----+---+---+----+---+---+----+---+----+---+----+----+---+----+---+---+----+---+----+---+----+----+----+---+----+---+----+----+---+---+----+---+---+----+----+---+---+----+------+---+----+----+----+---+---+---+----+---+---+---+----+------+---+---+----+---+---+----+---+---+----+---+---+---+---+----+----+-----+---+---+---+-----+----+---+---+---+----+-----+----+---+----+---+---+----+---+---+---+----+----+---+----+---+----+---+---+----+---+---+---+---+---+---+---+---+----+---+----+---+---+----+---+---+---+---+---+----+---+---+---+---+---+-----+---+---+----+----+---+----+---+---+----+---+---+---+---+----+----+---+---+---+---+----+---+---+----+----+---+----+---+----+---+---+----+---+---+---+---+----+---+---+---+----+---+----+---+---+----+---+---+---+---+---+---+----+---+---+---+---+---+---+---+---+---+---+----+---+---+---+----+---+---+---+---+----+----+---+---+---+----+---+---+----+---+---+----+----+---+---+---+---+----+---+---+---+----+---+----+---+---+---+---+---+----+---+---+---+---+---+----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+----+---+---+---+---+---+---+---+---+---+---+---+---+----+---+---+----+---+---+---+---+---+---+---+----+---+---+---+---+---+---+---+---+----+---+---+---+---+---+----+---+---+---+---+----+----+---+---+----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+----+---+---+---+---+---+----+---+---+---+---+---+---+---+---+---+---+---+---+---+----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+-----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+-----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\n|             20778|  0|  0|   0|    0|   0|   0|   0|   0|   0|    0|   0|    0|   0|   0|    0|  0|   0|    0|   0|   0|    0|    0|   0|    0|   0|   0|    0|   0|   0|   0|  0|   0|    0|    0|   0|   0|   0|   0|    0|    0|   0|    0|  0|   0|    0|   0|   0|   0|    0|   0|   0|  0|   0|    0|    0|   0|    0|   0|   0|    0|   0|  0|   0|   0|    0|    0|    0|   0|   0|   0|   0|   0|    0|   0|  0|   0|   0|   0|   0|    0|   0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|   0|    0|  0|   0|    0|   0|   0|  0|  0|   0|    0|    0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|   0|    0|  0|   0|   0|   0|    0|  0|   0|   0|   0|   0|   0|  0|    0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|    0|   0|    0|  0|   0|  0|  0|   0|    0|   0|   0|  0|   0|    0|    0|   0|   0|    0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|  0|   0|   0|    0|  0|  0|   0|   0|  0|   0|   0|   0|  0|  0|   0|   0|  0|   0|  0|   0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|  0|   0|    0|   0|  0|  0|  0|   0|   0|  0|  0|   0|  0|   0|    0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|  1|  0|   0|  0|   0|  0|   0|   0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|   0|     0|  0|   0|   0|   0|  0|  0|  0|   0|  0|  0|  0|   0|     0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|    0|  0|  0|  0|    0|   0|  0|  0|  0|   0|    0|   0|  0|   0|  0|  0|   0|  3|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|    0|  0|  0|   0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  4|  0|  0|   0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  2|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|\n|            90011E|  0|  0|   0|    0|   0|   0|   0|   0|   0|    0|   0|    0|   0|   0|    0|  0|   0|    0|   0|   0|    0|    0|   0|    0|   0|   0|    0|   0|   0|   0|  0|   0|    0|    0|   0|   0|   0|   0|    0|    0|   0|    0|  0|   0|    0|   0|   0|   0|    0|   0|   0|  0|   0|    0|    0|   0|    0|   0|   0|    0|   0|  0|   0|   0|    0|    0|    0|   0|   0|   0|   0|   0|    0|   0|  0|   0|   0|   0|   0|    0|   0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|   0|    0|  0|   0|    0|   0|   0|  0|  0|   0|    0|    0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|   0|    0|  0|   0|   0|   0|    0|  0|   0|   0|   0|   0|   0|  0|    0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|    0|   0|    0|  0|   0|  0|  0|   0|    0|   0|   0|  0|   0|    0|    0|   0|   0|    0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|  0|   0|   0|    0|  0|  0|   0|   0|  0|   0|   0|   0|  0|  0|   0|   0|  0|   0|  0|   0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|  0|   0|    0|   0|  0|  0|  0|   0|   0|  0|  0|   0|  0|   0|    0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|   0|     0|  0|   0|   0|   0|  0|  0|  0|   0|  0|  0|  0|   0|     0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|    0|  0|  0|  0|    0|   0|  0|  0|  0|   0|    0|   0|  0|   0|  0|  0|   0|  3|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|    0|  0|  0|   0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|\n|             22578|  1|  0|   0|    0|   0|   0|   0|   0|   0|    1|   0|    0|   0|   0|    0|  0|   0|    0|   0|   0|    0|    0|   0|    0|   0|   0|    0|   0|   0|   0|  0|   0|    0|    0|   0|   0|   0|   0|    0|    0|   0|    0|  0|   0|    0|   0|   0|   0|    0|   0|   0|  0|   0|    0|    0|   0|    0|   0|   0|    0|   0|  0|   0|   0|    0|    0|    0|   0|   0|   0|   0|   0|    0|   0|  0|   0|   0|   0|   0|    0|   0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|   0|    0|  0|   0|    0|   0|   0|  0|  0|   0|    0|    0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|   0|    0|  0|   0|   0|   0|    0|  0|   0|   0|   0|   0|   0|  0|    0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|    0|   0|    0|  0|   0|  0|  0|   0|    0|   0|   0|  0|   0|    0|    0|   0|   0|    0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|  1|   0|   0|    0|  0|  0|   0|   0|  0|   0|   0|   0|  0|  0|   0|   0|  0|   0|  0|   0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|  0|   0|    0|   0|  0|  0|  0|   0|   0|  0|  0|   0|  0|   0|    0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|   0|     0|  0|   0|   0|   0|  0|  0|  0|   0|  0|  0|  0|   0|     0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|    0|  0|  0|  0|    0|   0|  0|  0|  1|   0|    0|   0|  0|   0|  0|  0|   0| 38| 31|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  7|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0| 37|  1|   0|  0|  0|  0|  0|  0|    0|  0|  0|   0|   0|  0|   0|  5|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  1|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|  0| 10|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  4|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|  3|  0|  0|   0|   0|  0|  0|  0|   0|  0|  3|   0|  1|  0|   0|   0|  0|  0|  0|  0|   0| 33| 22|  0|   0|  0|   0|  0|  0|  0|  2|  0|   0|  0|  0|  0|  0|  0|   0|  0|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|172|  4|   0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|   0|  0|  0|   0|  3|  0|  1|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  1|  0| 16|  3|  0|   0|  0|  0|  0|  0|   0|   0|  1|  0|   0|  1|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0| 21|  3|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0| 22|  0|   0|  0|  1|  0|  0|  0|  0| 21|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0| 23|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  9|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0| 16|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  4|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|\n|             21476|  0|  0|   0|    0|   0|   0|   0|   0|   0|    0|   0|    0|   0|   0|    0|  0|   0|    0|   0|   0|    0|    0|   0|    0|   0|   0|    0|   0|   0|   0|  0|   0|    0|    0|   0|   0|   0|   0|    0|    0|   0|    0|  0|   0|    0|   0|   0|   0|    0|   0|   0|  0|   0|    0|    0|   0|    0|   0|   0|    0|   0|  0|   0|   0|    0|    0|    0|   0|   0|   0|   0|   0|    0|   0|  0|   0|   0|   0|   0|    0|   0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|   0|    0|  0|   0|    0|   0|   0|  0|  0|   0|    0|    0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|   0|    0|  0|   0|   0|   0|    0|  0|   0|   0|   0|   0|   0|  0|    0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|    0|   0|    0|  0|   0|  0|  0|   0|    0|   0|   0|  0|   0|    0|    0|   0|   0|    0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|  0|   0|   0|    0|  0|  0|   0|   0|  0|   0|   0|   0|  0|  0|   0|   0|  0|   0|  0|   0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|  0|   0|    0|   0|  0|  0|  0|   0|   0|  0|  0|   0|  0|   0|    0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|   0|     0|  0|   0|   0|   0|  0|  0|  0|   0|  0|  0|  0|   0|     0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|    0|  0|  0|  0|    0|   0|  0|  0|  0|   0|    0|   0|  0|   0|  0|  0|   0| 14|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|    0|  0|  0|   0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  6|  0|  0|   0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  2|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  1|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|\n|             21327|  0|  0|   0|    0|   0|   0|   0|   0|   0|    0|   0|    0|   0|   0|    0|  0|   0|    0|   0|   0|    0|    0|   0|    0|   0|   0|    0|   0|   0|   0|  0|   0|    0|    0|   0|   0|   0|   0|    0|    0|   0|    0|  0|   0|    0|   0|   0|   0|    0|   0|   0|  0|   0|    0|    0|   0|    0|   0|   0|    0|   0|  0|   0|   0|    0|    0|    0|   0|   0|   0|   0|   0|    0|   0|  0|   0|   0|   0|   0|    0|   0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|   0|    0|  0|   0|    0|   0|   0|  0|  0|   0|    0|    0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|   0|    0|  0|   0|   0|   0|    0|  0|   0|   0|   0|   0|   0|  0|    0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|    0|   0|    0|  0|   0|  0|  0|   0|    0|   0|   0|  0|   0|    0|    0|   0|   0|    0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|  0|   0|   0|    0|  0|  0|   0|   0|  0|   0|   0|   0|  0|  0|   0|   0|  0|   0|  0|   0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|  0|   0|    0|   0|  0|  0|  0|   0|   0|  0|  0|   0|  0|   0|    0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|   0|     0|  0|   0|   0|   0|  0|  0|  0|   0|  0|  0|  0|   0|     0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|    0|  0|  0|  0|    0|   0|  0|  0|  0|   0|    0|   0|  0|   0|  0|  0|   0| 92|  3|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0| 17|  0|   0|  0|  0|  0|  0|  0|    0|  0|  0|   0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  1|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|  0|  2|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|   0|  0|  1|   0|  0|  0|   0|   0|  0|  0|  0|  0|   0| 72|  0|  0|   0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0| 37|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0| 10|  1|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  8|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  6|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  3|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|\n|             22064|  8|  0|   0|    0|   0|   0|   0|   0|   0|    0|   0|    0|   0|   0|    0|  0|   0|    0|   0|   0|    0|    0|   0|    0|   0|   0|    0|   0|   0|   0|  0|   0|    0|    0|   0|   0|   0|   0|    0|    0|   0|    0|  1|   0|    0|   0|   0|   0|    0|   0|   0|  0|   0|    0|    0|   0|    0|   0|   0|    0|   0|  0|   0|   0|    0|    0|    0|   0|   0|   0|   0|   0|    0|   0|  0|   0|   0|   0|   0|    0|   0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|   0|    0|  0|   0|    0|   0|   0|  4|  0|   0|    0|    0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|   0|    0|  0|   0|   0|   0|    0|  0|   0|   0|   0|   0|   0|  0|    0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|    0|   0|    0|  0|   0|  1|  0|   0|    0|   0|   0|  0|   0|    0|    0|   0|   0|    0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|  0|   0|   0|    0|  0|  0|   0|   0|  0|   0|   0|   0|  1|  0|   0|   0|  0|   0|  0|   0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|  0|   0|    0|   0|  0|  0|  0|   0|   0|  0|  0|   0|  0|   0|    0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|   0|     0|  0|   0|   0|   0|  0|  0|  0|   0|  0|  0|  0|   0|     0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|    0|  0|  0|  0|    0|   0|  0|  0|  0|   0|    0|   0|  0|   0|  0|  0|   0| 74|  4|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  1|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0| 54|  0|   0|  0|  0|  0|  0|  0|    0|  0|  0|   0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  1|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|  0|  0|   0| 56|  0|  0|   0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  5|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  6|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0| 24|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  8|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  7|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  2|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  8|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|\n|             21080|  0|  0|   0|    0|   0|   0|   0|   0|   0|    0|   0|    0|   0|   0|    0|  0|   0|    0|   0|   0|    0|    0|   0|    0|   0|   0|    0|   0|   0|   0|  1|   0|    0|    0|   0|   0|   0|   0|    0|    0|   0|    0|  0|   0|    0|   0|   0|   0|    0|   0|   0|  0|   0|    0|    0|   0|    0|   0|   0|    0|   0|  0|   0|   0|    0|    0|    0|   0|   0|   0|   0|   0|    0|   0|  0|   0|   0|   0|   0|    0|   0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|   0|    0|  0|   0|    0|   0|   0|  0|  0|   0|    0|    0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|   0|    0|  0|   0|   0|   0|    0|  0|   0|   0|   0|   0|   0|  0|    0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|    0|   0|    0|  0|   0|  0|  0|   0|    0|   0|   0|  0|   0|    0|    0|   0|   0|    0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|  0|   0|   0|    0|  0|  0|   0|   0|  0|   0|   0|   0|  0|  0|   0|   0|  0|   0|  0|   0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|  0|   0|    0|   0|  0|  1|  0|   0|   0|  0|  0|   0|  0|   0|    0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|   0|     0|  0|   0|   0|   0|  0|  0|  0|   0|  0|  0|  0|   0|     0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|    0|  0|  0|  0|    0|   0|  0|  0|  0|   0|    0|   0|  0|   0|  0|  0|   0|175| 13|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  1|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|265|  1|   0|  0|  0|  0|  0|  0|    0|  0|  0|   0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  2|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|  0|  3|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  3|  0|   0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|   0|  0|  0|  0|   0|  0|  1|  0|  0|   0|   0|  0|  0|  0|   0|  0|  0|   0|  3|  0|   0|   0|  0|  0|  0|  0|   0|152|  4|  0|   0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0| 54|  0|   0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  1|  0|  0|  0|   0|  0|  0| 88|  1|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|   0|  1|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  8|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0| 67|  1|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  8|  0|   0|  0|  0|  0|  0|  0|  0| 21|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0| 53|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  9|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0| 13|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  7|  0|  0|  0|  0|  0|  0|  0|  0|  0| 52|  0|  0|  0|  0|  0|  0|  0|\n|            90179A|  0|  0|   0|    0|   0|   0|   0|   0|   0|    0|   0|    0|   0|   0|    0|  0|   0|    0|   0|   0|    0|    0|   0|    0|   0|   0|    0|   0|   0|   0|  0|   0|    0|    0|   0|   0|   0|   0|    0|    0|   0|    0|  0|   0|    0|   0|   0|   0|    0|   0|   0|  0|   0|    0|    0|   0|    0|   0|   0|    0|   0|  0|   0|   0|    0|    0|    0|   0|   0|   0|   0|   0|    0|   0|  0|   0|   0|   0|   0|    0|   0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|   0|    0|  0|   0|    0|   0|   0|  0|  0|   0|    0|    0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|   0|    0|  0|   0|   0|   0|    0|  0|   0|   0|   0|   0|   0|  0|    0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|    0|   0|    0|  0|   0|  0|  0|   0|    0|   0|   0|  0|   0|    0|    0|   0|   0|    0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|  0|   0|   0|    0|  0|  0|   0|   0|  0|   0|   0|   0|  0|  0|   0|   0|  0|   0|  0|   0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|  0|   0|    0|   0|  0|  0|  0|   0|   0|  0|  0|   0|  0|   0|    0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|   0|     0|  0|   0|   0|   0|  0|  0|  0|   0|  0|  0|  0|   0|     0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|    0|  0|  0|  0|    0|   0|  0|  0|  0|   0|    0|   0|  0|   0|  0|  0|   0|  4|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|    0|  0|  0|   0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  1|  0|  0|   0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|\n|             22219|  0|  0|   0|    0|   0|   0|   0|   0|   0|    0|   0|    0|   0|   0|    0|  0|   0|    0|   0|   0|    0|    0|   0|    0|   0|   0|    0|   0|   0|   0|  2|   0|    0|    0|   0|   0|   0|   0|    0|    0|   0|    0|  0|   0|    0|   0|   0|   0|    0|   0|   0|  0|   0|    0|    0|   0|    0|   0|   0|    0|   0|  0|   0|   0|    0|    0|    0|   0|   0|   0|   0|   0|    0|   0|  0|   0|   0|   0|   0|    0|   0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|   0|    0|  0|   0|    0|   0|   0|  1|  0|   0|    0|    0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|   0|    0|  0|   0|   0|   0|    0|  0|   0|   0|   0|   0|   0|  0|    0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|    0|   0|    0|  0|   0|  0|  0|   0|    0|   0|   0|  0|   0|    0|    0|   0|   0|    0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|  0|   0|   0|    0|  0|  0|   0|   0|  0|   0|   0|   0|  0|  0|   0|   0|  0|   0|  0|   0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|  0|   0|    0|   0|  0|  0|  0|   0|   0|  0|  0|   0|  0|   0|    0|  0|   0|  0|   1|   0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|   0|     0|  0|   0|   0|   0|  0|  0|  0|   0|  0|  0|  0|   0|     0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|    0|  0|  0|  0|    0|   0|  0|  0|  0|   0|    0|   0|  0|   0|  0|  0|   0|145| 15|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  2|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|104|  2|   0|  0|  0|  0|  0|  0|    0|  0|  0|   0|   0|  0|   0|  5|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  1|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|  0|  1|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|  2|  0|  0|   0|   0|  0|  0|  0|   0|  0|  1|   0|  0|  0|   0|   0|  0|  0|  0|  0|   0| 80|  3|  0|   0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0| 19|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  1|   0|  0|  0| 51|  0|  0|   0|  0|  0|  1|  0|   0|   0|  0|  0|   0|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  3|  0|  1|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0| 31|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  3|  0|   0|  0|  0|  0|  0|  0|  0| 26|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0| 36|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  7|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0| 11|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  4|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|\n|             84452|  0|  0|   0|    0|   0|   0|   0|   0|   0|    0|   0|    0|   0|   0|    0|  0|   0|    0|   0|   0|    0|    0|   0|    0|   0|   0|    0|   0|   0|   0|  0|   0|    0|    0|   0|   0|   0|   0|    0|    0|   0|    0|  0|   0|    0|   0|   0|   0|    0|   0|   0|  0|   0|    0|    0|   0|    0|   0|   0|    0|   0|  0|   0|   0|    0|    0|    0|   0|   0|   0|   0|   0|    0|   0|  0|   0|   0|   0|   0|    0|   0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|   0|    0|  0|   0|    0|   0|   0|  0|  0|   0|    0|    0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|   0|    0|  0|   0|   0|   0|    0|  0|   0|   0|   0|   0|   0|  0|    0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|    0|   0|    0|  0|   0|  0|  0|   0|    0|   0|   0|  0|   0|    0|    0|   0|   0|    0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|  0|   0|   0|    0|  0|  0|   0|   0|  0|   0|   0|   0|  1|  0|   0|   0|  0|   0|  0|   0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|  0|   0|    0|   0|  0|  0|  0|   0|   0|  0|  0|   0|  0|   0|    0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|   0|     0|  0|   0|   0|   0|  0|  0|  0|   0|  0|  0|  0|   0|     0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|    0|  0|  0|  0|    0|   0|  0|  0|  0|   0|    0|   0|  0|   0|  0|  0|   0|  3|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  3|  0|   0|  0|  0|  0|  0|  0|    0|  0|  0|   0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  3|  0|  0|   0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  2|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  3|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|\n|             37447|  2|  0|   0|    0|   0|   0|   0|   0|   0|    0|   0|    0|   0|   0|    0|  0|   0|    0|   0|   0|    0|    0|   0|    0|   0|   0|    0|   0|   0|   0|  0|   0|    0|    0|   0|   0|   0|   0|    0|    0|   0|    0|  0|   0|    0|   0|   0|   0|    0|   0|   0|  0|   0|    0|    0|   0|    0|   0|   0|    0|   0|  0|   0|   0|    0|    0|    0|   0|   0|   0|   0|   0|    0|   0|  0|   0|   0|   0|   0|    0|   0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|   0|    0|  0|   0|    0|   0|   0|  1|  0|   0|    0|    0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|   0|    0|  0|   0|   0|   0|    0|  0|   0|   0|   0|   0|   0|  0|    0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|    0|   0|    0|  0|   0|  0|  0|   0|    0|   0|   0|  0|   0|    0|    0|   0|   0|    0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|  0|   0|   0|    0|  0|  0|   0|   0|  0|   0|   0|   0|  2|  0|   0|   0|  0|   0|  0|   0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|  0|   0|    0|   0|  0|  1|  0|   0|   0|  0|  0|   0|  0|   0|    0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|   0|     0|  0|   0|   0|   0|  0|  0|  0|   0|  0|  0|  0|   0|     0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|    0|  0|  0|  0|    0|   0|  0|  0|  0|   0|    0|   0|  0|   0|  0|  0|   0| 30|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0| 39|  0|   0|  0|  0|  0|  0|  0|    0|  0|  0|   0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  2|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  9|  0|  0|   0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  2|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  6|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0| 21|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  2|  0|   0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|\n|             21908|  0|  0|   0|    0|   0|   0|   0|   0|   0|    0|   0|    0|   0|   0|    0|  0|   0|    0|   0|   0|    0|    0|   0|    0|   0|   0|    0|   0|   0|   0|  2|   0|    0|    0|   0|   0|   0|   0|    0|    0|   0|    0|  0|   0|    0|   0|   0|   0|    0|   0|   0|  0|   0|    0|    0|   0|    0|   0|   0|    0|   0|  0|   0|   0|    0|    0|    0|   0|   0|   0|   0|   0|    0|   0|  0|   0|   0|   0|   0|    0|   0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|   0|    0|  0|   0|    0|   0|   0|  1|  0|   0|    0|    0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|   0|    0|  0|   0|   0|   0|    0|  0|   0|   0|   0|   0|   0|  0|    0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|    0|   0|    0|  0|   0|  0|  0|   0|    0|   0|   0|  0|   0|    0|    0|   0|   0|    0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|  0|   0|   0|    0|  0|  0|   0|   0|  0|   0|   0|   0|  0|  0|   0|   0|  0|   0|  0|   0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|  0|   0|    0|   0|  0|  0|  0|   0|   0|  0|  0|   0|  0|   0|    0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|   0|     0|  0|   0|   0|   0|  0|  0|  0|   0|  0|  0|  0|   0|     0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|    0|  0|  0|  0|    0|   0|  0|  0|  0|   0|    0|   0|  0|   0|  0|  0|   0|154|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  1|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|123|  0|   0|  0|  0|  0|  0|  0|    0|  0|  0|   0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  0|  0|   0|   0|  0|   0|  0|   0|  0|  3|   0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|  0|  0|   0| 84|  0|  0|   0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  9|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0| 37|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  2|  0|  0|  0|  0|  0|  0|  0|  1|  0|  0|   0|  0|  0| 22|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  8|  0|   0|  0|  0|  0|  0|  0|  0|  9|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0| 14|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  4|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  3|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|\n|            90067B|  0|  0|   0|    0|   0|   0|   0|   0|   0|    0|   0|    0|   0|   0|    0|  0|   0|    0|   0|   0|    0|    0|   0|    0|   0|   0|    0|   0|   0|   0|  0|   0|    0|    0|   0|   0|   0|   0|    0|    0|   0|    0|  0|   0|    0|   0|   0|   0|    0|   0|   0|  0|   0|    0|    0|   0|    0|   0|   0|    0|   0|  0|   0|   0|    0|    0|    0|   0|   0|   0|   0|   0|    0|   0|  0|   0|   0|   0|   0|    0|   0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|   0|    0|  0|   0|    0|   0|   0|  0|  0|   0|    0|    0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|   0|    0|  0|   0|   0|   0|    0|  0|   0|   0|   0|   0|   0|  0|    0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|    0|   0|    0|  0|   0|  0|  0|   0|    0|   0|   0|  0|   0|    0|    0|   0|   0|    0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|  0|   0|   0|    0|  0|  0|   0|   0|  0|   0|   0|   0|  0|  0|   0|   0|  0|   0|  0|   0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|  0|   0|    0|   0|  0|  0|  0|   0|   0|  0|  0|   0|  0|   0|    0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|   0|     0|  0|   0|   0|   0|  0|  0|  0|   0|  0|  0|  0|   0|     0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|    0|  0|  0|  0|    0|   0|  0|  0|  0|   0|    0|   0|  0|   0|  0|  0|   0|  2|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|    0|  0|  0|   0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|\n|             23398|  1|  0|   0|    0|   0|   0|   0|   0|   0|    0|   0|    0|   0|   0|    0|  0|   0|    0|   0|   0|    0|    0|   0|    0|   0|   0|    0|   0|   0|   0|  0|   0|    0|    0|   0|   0|   0|   0|    0|    0|   0|    0|  0|   0|    0|   0|   0|   0|    0|   0|   0|  0|   0|    0|    0|   0|    0|   0|   0|    0|   0|  0|   0|   0|    0|    0|    0|   0|   0|   0|   0|   0|    0|   0|  0|   0|   0|   0|   0|    0|   0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|   0|    0|  0|   0|    0|   0|   0|  0|  0|   0|    0|    0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|   0|    0|  0|   0|   0|   0|    0|  0|   0|   0|   0|   0|   0|  0|    0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|    0|   0|    0|  0|   0|  0|  0|   0|    0|   0|   0|  0|   0|    0|    0|   0|   0|    0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|  0|   0|   0|    0|  0|  0|   0|   0|  0|   0|   0|   0|  0|  0|   0|   0|  0|   0|  0|   0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|  0|   0|    0|   0|  0|  0|  0|   0|   0|  0|  0|   0|  0|   0|    0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|   0|     0|  0|   0|   0|   0|  0|  0|  0|   0|  0|  0|  0|   0|     0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|    0|  0|  0|  0|    0|   0|  0|  0|  0|   0|    0|   0|  0|   0|  0|  0|   0| 22|  3|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0| 19|  0|   0|  0|  0|  0|  0|  0|    0|  0|  0|   0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|  0|  0|   0| 11|  0|  0|   0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  6|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  5|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  3|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  2|  0|   0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  6|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|\n|             22818|  0|  0|   0|    0|   0|   0|   0|   0|   0|    0|   0|    0|   0|   0|    0|  0|   0|    0|   0|   0|    0|    0|   0|    0|   0|   0|    0|   0|   0|   0|  2|   0|    0|    0|   0|   0|   0|   0|    0|    0|   0|    0|  0|   0|    0|   0|   0|   0|    0|   0|   0|  0|   0|    0|    0|   0|    0|   0|   0|    0|   0|  0|   0|   0|    0|    0|    0|   0|   0|   0|   0|   0|    0|   0|  0|   0|   0|   0|   0|    0|   0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|   0|    0|  0|   0|    0|   0|   0|  0|  0|   0|    0|    0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|   0|    0|  0|   0|   0|   0|    0|  0|   0|   0|   0|   0|   0|  0|    0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|    0|   0|    0|  0|   0|  0|  0|   0|    0|   0|   0|  0|   0|    0|    0|   0|   0|    0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|  0|   0|   0|    0|  0|  0|   0|   0|  0|   0|   0|   0|  0|  0|   0|   0|  0|   0|  0|   0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|  0|   0|    0|   0|  0|  0|  0|   0|   0|  0|  0|   0|  0|   0|    0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  1|   0|   0|  0|  0|   0|     0|  0|   0|   0|   0|  0|  0|  0|   0|  0|  0|  0|   0|     0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|    0|  0|  0|  0|    0|   0|  0|  0|  0|   0|    0|   0|  0|   0|  0|  0|   0| 20|  5|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  2|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|108|  0|   0|  0|  0|  0|  0|  0|    0|  0|  0|   0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  4|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|   0|  0|  1|   0|  0|  0|   0|   0|  0|  0|  0|  0|   0| 11|  2|  0|   0|  0|   0|  0|  0|  0|  3|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0| 39|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  4|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  5|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0| 12|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  9|  0|   0|  0|  0|  0|  0|  0|  0|  2|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  5|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  4|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  6|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  2|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|\n|             22285|  0|  0|   0|    0|   0|   0|   0|   0|   0|    0|   0|    0|   0|   0|    0|  0|   0|    0|   0|   0|    0|    0|   0|    0|   0|   0|    0|   0|   0|   0|  0|   0|    0|    0|   0|   0|   0|   0|    0|    0|   0|    0|  0|   0|    0|   0|   0|   0|    0|   0|   0|  0|   0|    0|    0|   0|    0|   0|   0|    0|   0|  0|   0|   0|    0|    0|    0|   0|   0|   0|   0|   0|    0|   0|  0|   0|   0|   0|   0|    0|   0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|   0|    0|  0|   0|    0|   0|   0|  0|  0|   0|    0|    0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|   0|    0|  0|   0|   0|   0|    0|  0|   0|   0|   0|   0|   0|  0|    0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|    0|   0|    0|  0|   0|  0|  0|   0|    0|   0|   0|  0|   0|    0|    0|   0|   0|    0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|  0|   0|   0|    0|  0|  0|   0|   0|  0|   0|   0|   0|  0|  0|   0|   0|  0|   0|  0|   0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|  0|   0|    0|   0|  0|  0|  0|   0|   0|  0|  0|   0|  0|   0|    0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|   0|     0|  0|   0|   0|   0|  0|  0|  0|   0|  0|  0|  0|   0|     0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|    0|  0|  0|  0|    0|   0|  0|  0|  0|   0|    0|   0|  0|   0|  0|  0|   0| 37|  1|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0| 39|  0|   0|  0|  0|  0|  0|  0|    0|  0|  0|   0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|  0|  0|   0| 16|  0|  0|   0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  7|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  6|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  8|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|   0|  0|  0|  0|  0|  0|  0|  2|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  5|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  2|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|\n|             23268|  0|  0|   0|    0|   0|   0|   0|   0|   0|    0|   0|    0|   0|   0|    0|  0|   0|    0|   0|   0|    0|    0|   0|    0|   0|   0|    0|   0|   0|   0|  1|   0|    0|    0|   0|   0|   0|   0|    0|    0|   0|    0|  0|   0|    0|   0|   0|   0|    0|   0|   0|  0|   0|    0|    0|   0|    1|   0|   0|    0|   0|  0|   0|   0|    0|    0|    0|   0|   0|   0|   0|   0|    0|   0|  0|   0|   0|   0|   0|    0|   0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|   0|    0|  0|   0|    0|   0|   0|  0|  0|   0|    0|    0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|   0|    0|  0|   0|   0|   0|    0|  0|   0|   0|   0|   0|   0|  0|    0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|    0|   0|    0|  0|   0|  0|  0|   0|    0|   0|   0|  0|   0|    0|    0|   0|   0|    0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|  0|   0|   0|    0|  0|  0|   0|   0|  0|   0|   0|   0|  0|  0|   0|   0|  0|   0|  0|   0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|  0|   0|    0|   0|  0|  0|  0|   0|   0|  0|  0|   0|  0|   0|    0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|   0|     0|  0|   0|   0|   0|  0|  0|  0|   0|  0|  0|  0|   0|     0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|    0|  0|  0|  0|    0|   0|  0|  0|  0|   0|    0|   0|  0|   0|  0|  0|   0| 20|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  1|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0| 42|  0|   0|  0|  0|  0|  0|  0|    0|  0|  0|   0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|   0|  0|  0|   0|  3|  0|   0|   0|  0|  0|  0|  0|   0|  9|  0|  0|   0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  5|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  2|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|  0|   0|  0|  0|  1|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|   0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  8|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|\n|           15056BL|  2|  0|   0|    0|   0|   0|   0|   0|   0|    0|   0|    0|   0|   0|    0|  0|   0|    0|   0|   0|    0|    0|   0|    0|   0|   0|    0|   0|   0|   0|  0|   1|    0|    0|   0|   0|   0|   0|    0|    0|   0|    0|  0|   0|    0|   0|   0|   0|    0|   0|   0|  0|   0|    0|    0|   0|    0|   0|   0|    0|   0|  0|   0|   0|    0|    0|    0|   0|   0|   0|   0|   0|    0|   0|  0|   0|   0|   0|   0|    0|   0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|   0|    0|  0|   0|    0|   0|   0|  1|  0|   0|    0|    0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|   0|    0|  0|   0|   0|   0|    0|  0|   0|   0|   0|   0|   0|  0|    0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|    0|   0|    0|  0|   0|  0|  0|   0|    0|   0|   0|  0|   0|    0|    0|   0|   0|    0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|  0|   0|   0|    0|  0|  0|   0|   0|  0|   0|   0|   0|  0|  0|   0|   0|  0|   0|  0|   0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|  0|   0|    0|   0|  0|  0|  0|   0|   0|  0|  0|   0|  0|   0|    0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|  1|  0|   0|  0|   0|  0|   0|   0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|   0|     0|  0|   0|   0|   0|  0|  0|  0|   0|  0|  0|  0|   0|     0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|    0|  0|  0|  0|    0|   0|  0|  0|  0|   0|    0|   0|  0|   0|  0|  0|   0| 77|  1|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0| 15|  2|   0|  0|  0|  0|  0|  0|    0|  0|  0|   0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|  0|  3|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  1|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|  2|  1|  0|   0|   0|  0|  0|  0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|  0|  0|   0| 49|  0|  0|   0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0| 13|  0|   0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  1|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0| 83|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|   0|  1|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  6|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0| 10|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|   0|  0|  0|  0|  0|  0|  0|  5|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0| 28| 12|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  2|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  5|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|\n|             72817|  0|  0|   0|    0|   0|   0|   0|   0|   0|    0|   0|    0|   0|   0|    0|  0|   0|    0|   0|   0|    0|    0|   0|    0|   0|   0|    0|   0|   0|   0|  0|   0|    0|    0|   0|   0|   0|   0|    0|    0|   0|    0|  0|   0|    0|   0|   0|   0|    0|   0|   0|  0|   0|    0|    0|   0|    0|   0|   0|    0|   0|  0|   0|   0|    0|    0|    0|   0|   0|   0|   0|   0|    0|   0|  0|   0|   0|   0|   0|    0|   0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|   0|    0|  0|   0|    0|   0|   0|  0|  0|   0|    0|    0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|   0|    0|  1|   0|   0|   0|    0|  0|   0|   0|   0|   0|   0|  0|    0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|    0|   0|    0|  0|   0|  0|  0|   0|    0|   0|   0|  0|   0|    0|    0|   0|   0|    0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|  0|   0|   0|    0|  0|  0|   0|   0|  0|   0|   0|   0|  0|  0|   0|   0|  0|   0|  0|   0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|  0|   0|    0|   0|  0|  0|  0|   0|   0|  0|  0|   0|  0|   0|    0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|  0|   0|  0|  0|   0|  0|   0|  1|   0|   0|   0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|   0|     0|  0|   0|   0|   0|  0|  0|  0|   0|  0|  0|  0|   0|     0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|    0|  0|  0|  0|    0|   0|  0|  0|  0|   0|    0|   0|  0|   0|  0|  0|   0| 36|  1|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0| 16|  0|   0|  0|  0|  0|  0|  0|    0|  0|  0|   0|   0|  0|   0|  1|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  1|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|  1|  0|  0|   0|   0|  0|  0|  0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|  0|  0|   0| 29|  0|  0|   0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0| 25|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  1|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0| 20|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0| 14|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|   0|  0|  0|  0|  0|  0|  0|  9|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  5|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  3|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  2|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|\n|             22545|  1|  0|   0|    0|   0|   0|   0|   0|   0|    0|   0|    0|   0|   0|    0|  0|   0|    0|   0|   0|    0|    0|   0|    0|   0|   0|    0|   0|   0|   0|  0|   0|    0|    0|   0|   0|   0|   0|    0|    0|   0|    0|  0|   0|    0|   0|   0|   0|    0|   0|   0|  0|   0|    0|    0|   0|    0|   0|   0|    0|   0|  0|   0|   0|    0|    0|    0|   0|   0|   0|   0|   0|    0|   0|  0|   0|   0|   0|   0|    0|   0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|   0|    0|  0|   0|    0|   0|   0|  0|  0|   0|    0|    0|   0|   0|   0|   0|   0|   0|  0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|   0|    0|  0|   0|   0|   0|    0|  0|   0|   0|   0|   0|   0|  0|    0|    0|   0|  0|   0|   0|   0|   0|   0|   0|  0|   0|    0|   0|    0|  0|   0|  0|  0|   0|    0|   0|   0|  0|   0|    0|    0|   0|   0|    0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|   0|   0|   0|  0|   0|  0|   0|   0|    0|  0|  0|   0|   0|  0|   0|   0|   0|  0|  0|   0|   0|  0|   0|  0|   0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|  0|   0|    0|   0|  0|  0|  0|   0|   0|  0|  0|   0|  0|   0|    0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|  0|   0|  0|  0|   0|  0|   0|  0|   0|   0|   0|  0|   0|  0|   0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|   0|     0|  0|   0|   0|   0|  0|  0|  0|   0|  0|  0|  0|   0|     0|  0|  0|   0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|    0|  0|  0|  0|    0|   0|  0|  0|  0|   0|    0|   0|  0|   0|  0|  0|   0| 31|  3|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  1|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  2|  0|   0|  0|  0|  0|  0|  0|    0|  0|  0|   0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  0|  0|   0|   0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|  0|   0|  0|  0|   0|  0|  0|   0|   0|  0|  0|  0|  0|   0|  8|  0|  0|   0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0| 14|  2|   0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  5|  0|  0|   0|  0|  0|  0|  0|   0|   0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  5|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|   0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|   0|  0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|    0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  0|  1|  0|  0|  0|  0|  0|  0|  0|\n+------------------+---+---+----+-----+----+----+----+----+----+-----+----+-----+----+----+-----+---+----+-----+----+----+-----+-----+----+-----+----+----+-----+----+----+----+---+----+-----+-----+----+----+----+----+-----+-----+----+-----+---+----+-----+----+----+----+-----+----+----+---+----+-----+-----+----+-----+----+----+-----+----+---+----+----+-----+-----+-----+----+----+----+----+----+-----+----+---+----+----+----+----+-----+----+-----+----+---+----+----+----+----+----+----+---+----+----+----+----+-----+---+----+-----+----+----+---+---+----+-----+-----+----+----+----+----+----+----+---+----+----+----+---+----+----+----+----+---+----+----+----+----+----+-----+---+----+----+----+-----+---+----+----+----+----+----+---+-----+-----+----+---+----+----+----+----+----+----+---+----+-----+----+-----+---+----+---+---+----+-----+----+----+---+----+-----+-----+----+----+-----+----+---+----+----+----+----+---+----+----+----+----+---+----+----+----+----+---+----+---+----+----+-----+---+---+----+----+---+----+----+----+---+---+----+----+---+----+---+----+----+---+----+----+----+---+----+---+----+----+----+---+----+---+----+---+----+-----+----+---+---+---+----+----+---+---+----+---+----+-----+---+----+---+----+----+---+---+----+---+---+----+---+---+----+---+----+---+----+----+---+----+---+---+----+---+----+---+----+----+----+---+----+---+----+----+---+---+----+---+---+----+----+---+---+----+------+---+----+----+----+---+---+---+----+---+---+---+----+------+---+---+----+---+---+----+---+---+----+---+---+---+---+----+----+-----+---+---+---+-----+----+---+---+---+----+-----+----+---+----+---+---+----+---+---+---+----+----+---+----+---+----+---+---+----+---+---+---+---+---+---+---+---+----+---+----+---+---+----+---+---+---+---+---+----+---+---+---+---+---+-----+---+---+----+----+---+----+---+---+----+---+---+---+---+----+----+---+---+---+---+----+---+---+----+----+---+----+---+----+---+---+----+---+---+---+---+----+---+---+---+----+---+----+---+---+----+---+---+---+---+---+---+----+---+---+---+---+---+---+---+---+---+---+----+---+---+---+----+---+---+---+---+----+----+---+---+---+----+---+---+----+---+---+----+----+---+---+---+---+----+---+---+---+----+---+----+---+---+---+---+---+----+---+---+---+---+---+----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+----+---+---+---+---+---+---+---+---+---+---+---+---+----+---+---+----+---+---+---+---+---+---+---+----+---+---+---+---+---+---+---+---+----+---+---+---+---+---+----+---+---+---+---+----+----+---+---+----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+----+---+---+---+---+---+----+---+---+---+---+---+---+---+---+---+---+---+---+---+----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+-----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+-----+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+\nonly showing top 20 rows\n\n"
          }
        ]
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "SPARK JOB",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "http://10.0.2.15:4040/jobs/job?id\u003d35",
            "http://10.0.2.15:4040/jobs/job?id\u003d36"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546703398685_-2069644574",
      "id": "20190106-004958_1653857448",
      "dateCreated": "2019-01-06 00:49:58.685",
      "dateStarted": "2019-01-06 00:50:52.563",
      "dateFinished": "2019-01-06 00:51:00.058",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.monotonically_increasing_id\n\ndf.select(monotonically_increasing_id()).show(2)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 00:51:54.334",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "import org.apache.spark.sql.functions.monotonically_increasing_id\n+-----------------------------+\n|monotonically_increasing_id()|\n+-----------------------------+\n|                            0|\n|                            1|\n+-----------------------------+\nonly showing top 2 rows\n\n"
          }
        ]
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "SPARK JOB",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "http://10.0.2.15:4040/jobs/job?id\u003d37"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546703452525_1007033063",
      "id": "20190106-005052_1460611487",
      "dateCreated": "2019-01-06 00:50:52.525",
      "dateStarted": "2019-01-06 00:51:54.369",
      "dateFinished": "2019-01-06 00:51:54.996",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%md\n#### Handling string data",
      "user": "dskang",
      "dateUpdated": "2019-01-06 00:55:03.081",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "markdown",
          "editOnDblClick": true,
          "completionKey": "TAB",
          "completionSupport": false
        },
        "editorMode": "ace/mode/markdown",
        "editorHide": true,
        "tableHide": false
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "HTML",
            "data": "\u003cdiv class\u003d\"markdown-body\"\u003e\n\u003ch4\u003eHandling string data\u003c/h4\u003e\n\u003c/div\u003e"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546703514334_435129559",
      "id": "20190106-005154_1991637277",
      "dateCreated": "2019-01-06 00:51:54.334",
      "dateStarted": "2019-01-06 00:55:03.089",
      "dateFinished": "2019-01-06 00:55:03.108",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.{initcap}\n\ndf.select(initcap(col(\"Description\"))).show(2, false)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 00:55:43.541",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "import org.apache.spark.sql.functions.initcap\n+--------------------+\n|initcap(Description)|\n+--------------------+\n|Rabbit Night Light  |\n|Doughnut Lip Gloss  |\n+--------------------+\nonly showing top 2 rows\n\n"
          }
        ]
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "SPARK JOB",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "http://10.0.2.15:4040/jobs/job?id\u003d38"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546703654817_1759027691",
      "id": "20190106-005414_601173826",
      "dateCreated": "2019-01-06 00:54:14.817",
      "dateStarted": "2019-01-06 00:55:43.567",
      "dateFinished": "2019-01-06 00:55:44.133",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.{lower, upper}\n\ndf.select(col(\"Description\"), lower(col(\"Description\")), upper(lower(col(\"Description\")))).show(2)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 00:58:11.219",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "import org.apache.spark.sql.functions.{lower, upper}\n+-------------------+-------------------+-------------------------+\n|        Description| lower(Description)|upper(lower(Description))|\n+-------------------+-------------------+-------------------------+\n| RABBIT NIGHT LIGHT| rabbit night light|       RABBIT NIGHT LIGHT|\n|DOUGHNUT LIP GLOSS |doughnut lip gloss |      DOUGHNUT LIP GLOSS |\n+-------------------+-------------------+-------------------------+\nonly showing top 2 rows\n\n"
          }
        ]
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "SPARK JOB",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "http://10.0.2.15:4040/jobs/job?id\u003d39"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546703654707_-1133203286",
      "id": "20190106-005414_369278579",
      "dateCreated": "2019-01-06 00:54:14.707",
      "dateStarted": "2019-01-06 00:58:11.243",
      "dateFinished": "2019-01-06 00:58:11.921",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.{lit, ltrim, rtrim, rpad, lpad, trim}\n\ndf.select(\n    ltrim(lit(\"     HELLO     \")).as(\"ltrim\"),\n    rtrim(lit(\"     HELLO     \")).as(\"rtrim\"),\n    trim(lit(\"     HELLO     \")).as(\"trim\"),\n    lpad(lit(\"HELLO\"), 3, \" \").as(\"lp\"),\n    rpad(lit(\"HELLO\"), 10, \" \").as(\"rp\")).show(2)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 01:00:11.837",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "import org.apache.spark.sql.functions.{lit, ltrim, rtrim, rpad, lpad, trim}\n+----------+----------+-----+---+----------+\n|     ltrim|     rtrim| trim| lp|        rp|\n+----------+----------+-----+---+----------+\n|HELLO     |     HELLO|HELLO|HEL|HELLO     |\n|HELLO     |     HELLO|HELLO|HEL|HELLO     |\n+----------+----------+-----+---+----------+\nonly showing top 2 rows\n\n"
          }
        ]
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "SPARK JOB",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "http://10.0.2.15:4040/jobs/job?id\u003d40"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546703654514_233755821",
      "id": "20190106-005414_409110661",
      "dateCreated": "2019-01-06 00:54:14.515",
      "dateStarted": "2019-01-06 01:00:11.860",
      "dateFinished": "2019-01-06 01:00:12.486",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//Regular Expression\nimport org.apache.spark.sql.functions.regexp_replace\n\nval simpleColors \u003d Seq(\"black\", \"white\", \"red\", \"green\", \"blue\")\nval regexString \u003d simpleColors.map(_.toUpperCase).mkString(\"|\")\n\n//파이프 문자(|)는 정규 표현식에서 OR를 의미\n\ndf.select(\n    regexp_replace(col(\"Description\"), regexString, \"COLOR\").alias(\"color_clean\"), col(\"Description\")).show(2)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 01:02:54.324",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {},
        "editorSetting": {
          "language": "scala",
          "editOnDblClick": false,
          "completionKey": "TAB",
          "completionSupport": true
        },
        "editorMode": "ace/mode/scala"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "results": {
        "code": "SUCCESS",
        "msg": [
          {
            "type": "TEXT",
            "data": "import org.apache.spark.sql.functions.regexp_replace\nsimpleColors: Seq[String] \u003d List(black, white, red, green, blue)\nregexString: String \u003d BLACK|WHITE|RED|GREEN|BLUE\n+-------------------+-------------------+\n|        color_clean|        Description|\n+-------------------+-------------------+\n| RABBIT NIGHT LIGHT| RABBIT NIGHT LIGHT|\n|DOUGHNUT LIP GLOSS |DOUGHNUT LIP GLOSS |\n+-------------------+-------------------+\nonly showing top 2 rows\n\n"
          }
        ]
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "SPARK JOB",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "http://10.0.2.15:4040/jobs/job?id\u003d41"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546703994996_172806108",
      "id": "20190106-005954_1295063465",
      "dateCreated": "2019-01-06 00:59:54.996",
      "dateStarted": "2019-01-06 01:02:54.347",
      "dateFinished": "2019-01-06 01:02:56.171",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 01:02:12.140",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1546704132140_-1875669589",
      "id": "20190106-010212_1888740200",
      "dateCreated": "2019-01-06 01:02:12.140",
      "status": "READY",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 01:02:11.335",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1546704131334_466157415",
      "id": "20190106-010211_995425219",
      "dateCreated": "2019-01-06 01:02:11.334",
      "status": "READY",
      "progressUpdateIntervalMs": 500
    }
  ],
  "name": "Spark-the definite Guide.Chap6",
  "id": "2DZZJ4WMC",
  "noteParams": {},
  "noteForms": {},
  "angularObjects": {
    "md:shared_process": [],
    "spark:shared_process": []
  },
  "config": {
    "isZeppelinNotebookCronEnable": false
  },
  "info": {}
}