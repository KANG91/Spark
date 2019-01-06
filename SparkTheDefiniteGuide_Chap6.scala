{
  "paragraphs": [
    {
      "text": "%spark\nval absolute_path \u003d \"/home/dskangu/git_KANG91/Spark-The-Definitive-Guide/data/retail-data/by-day\"",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:42:44.793",
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
      "dateStarted": "2019-01-06 18:42:44.983",
      "dateFinished": "2019-01-06 18:43:05.247",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval df \u003d spark.read.format(\"csv\").\n    option(\"header\", \"true\").\n    option(\"inferSchema\", \"true\").\n    load(absolute_path)\ndf.printSchema()\ndf.createOrReplaceTempView(\"dfTable\")",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:43:05.304",
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
      "dateStarted": "2019-01-06 18:43:05.684",
      "dateFinished": "2019-01-06 18:43:18.329",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%md\n#### Change it to spark data type",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:43:18.404",
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
      "dateStarted": "2019-01-06 18:43:18.677",
      "dateFinished": "2019-01-06 18:43:20.477",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.lit\n\ndf.select(lit(5), lit(\"five\"), lit(5.0)) //lit function - change data type for spark data type",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:43:20.480",
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
      "dateStarted": "2019-01-06 18:43:20.703",
      "dateFinished": "2019-01-06 18:43:22.338",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%md\n#### Change it to booliean data type",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:43:22.426",
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
      "dateStarted": "2019-01-06 18:43:22.634",
      "dateFinished": "2019-01-06 18:43:22.661",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n\nimport org.apache.spark.sql.functions.col\n\ndf.where(col(\"InvoiceNo\").equalTo(536365)). // check if value is 536365 from column named \"InvoiceNo\" \nselect(\"InvoiceNo\", \"Description\").\nshow(5, false)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:43:22.705",
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
      "dateStarted": "2019-01-06 18:43:22.990",
      "dateFinished": "2019-01-06 18:43:25.456",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//better way to handling booliean type than above\ndf.where(\"InvoiceNo \u003d 536365\").\nshow(5, false)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:43:25.514",
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
            "http://10.0.2.15:4040/jobs/job?id\u003d4"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546699316823_-59417560",
      "id": "20190105-234156_967070155",
      "dateCreated": "2019-01-05 23:41:56.823",
      "dateStarted": "2019-01-06 18:43:25.677",
      "dateFinished": "2019-01-06 18:43:28.092",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval priceFilter \u003d col(\"UnitPrice\") \u003e 600\nval descripFilter \u003d col(\"Description\").contains(\"POSTAGE\")\ndf.where(col(\"StockCode\").isin(\"DOT\")).where(priceFilter.or(descripFilter)).show(5)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:43:28.188",
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
            "http://10.0.2.15:4040/jobs/job?id\u003d5"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546699433017_-451403808",
      "id": "20190105-234353_1808344201",
      "dateCreated": "2019-01-05 23:43:53.017",
      "dateStarted": "2019-01-06 18:43:28.398",
      "dateFinished": "2019-01-06 18:43:30.378",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval DOTCodeFilter \u003d col(\"StockCode\") \u003d\u003d\u003d \"DOT\"\nval priceFilter \u003d col(\"UnitPrice\") \u003e 600\nval descripFilter \u003d col(\"Description\").contains(\"POSTAGE\")\n\ndf.withColumn(\"IsExpensive\", DOTCodeFilter.and(priceFilter.or(descripFilter))).\nwhere(\"isExpensive\").\nselect(\"unitPrice\", \"isExpensive\").show(5)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:43:30.408",
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
            "http://10.0.2.15:4040/jobs/job?id\u003d6"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546699553554_822220274",
      "id": "20190105-234553_877524390",
      "dateCreated": "2019-01-05 23:45:53.554",
      "dateStarted": "2019-01-06 18:43:30.673",
      "dateFinished": "2019-01-06 18:43:32.263",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.{expr, not, col}\n\ndf.withColumn(\"isExpensive\", not(col(\"UnitPrice\").leq(250))).\nfilter(\"isExpensive\").\nselect(\"Description\", \"UnitPrice\").show(5)\n\ndf.withColumn(\"isExpensive\", expr(\"NOT UnitPrice \u003c\u003d 250\")).\nfilter(\"isExpensive\").\nselect(\"Description\", \"UnitPrice\").show(5)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:43:32.267",
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
            "http://10.0.2.15:4040/jobs/job?id\u003d7",
            "http://10.0.2.15:4040/jobs/job?id\u003d8"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546699872956_1042159543",
      "id": "20190105-235112_702361812",
      "dateCreated": "2019-01-05 23:51:12.956",
      "dateStarted": "2019-01-06 18:43:32.442",
      "dateFinished": "2019-01-06 18:43:34.182",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%md\n#### Handling with numeric data",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:43:34.233",
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
      "dateStarted": "2019-01-06 18:43:34.416",
      "dateFinished": "2019-01-06 18:43:34.431",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.{expr, pow}\n\nval fabricatedQuantity \u003d pow(col(\"Quantity\") * col(\"UnitPrice\"), 2) + 5\ndf.select(expr(\"CustomerId\"), fabricatedQuantity.alias(\"realQuantity\")).show(2)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:43:34.510",
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
            "http://10.0.2.15:4040/jobs/job?id\u003d9"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546700536675_1836399909",
      "id": "20190106-000216_40686673",
      "dateCreated": "2019-01-06 00:02:16.675",
      "dateStarted": "2019-01-06 18:43:34.627",
      "dateFinished": "2019-01-06 18:43:35.982",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.selectExpr(\n    \"CustomerId\",\n    \"(POWER((Quantity * UnitPrice), 2.0) + 5 as realQauntity\").show(2)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:43:36.029",
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
      "dateStarted": "2019-01-06 18:43:36.173",
      "dateFinished": "2019-01-06 18:43:36.832",
      "status": "ERROR",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.{round, bround}\n\ndf.select(round(col(\"UnitPrice\"), 1).alias(\"rounded\"), col(\"UnitPrice\")).show(5)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:44:23.322",
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
            "http://10.0.2.15:4040/jobs/job?id\u003d10"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546701223808_-1742559978",
      "id": "20190106-001343_1058008318",
      "dateCreated": "2019-01-06 00:13:43.808",
      "dateStarted": "2019-01-06 18:44:23.374",
      "dateFinished": "2019-01-06 18:44:24.206",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.lit\n\ndf.select(round(lit(\"2.5\")), bround(lit(\"2.5\"))).show(2)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:44:24.278",
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
            "http://10.0.2.15:4040/jobs/job?id\u003d11"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546702536346_-921516045",
      "id": "20190106-003536_1281484893",
      "dateCreated": "2019-01-06 00:35:36.347",
      "dateStarted": "2019-01-06 18:44:24.443",
      "dateFinished": "2019-01-06 18:44:25.331",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%md\n#### Get Correlation ",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:44:25.337",
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
      "dateStarted": "2019-01-06 18:44:25.495",
      "dateFinished": "2019-01-06 18:44:25.526",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.{corr}\n\ndf.stat.corr(\"Quantity\", \"UnitPrice\")\ndf.select(corr(\"Quantity\", \"UnitPrice\")).show()",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:44:25.588",
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
            "data": "import org.apache.spark.sql.functions.corr\nres29: Double \u003d -0.0012349245448702955\n+-------------------------+\n|corr(Quantity, UnitPrice)|\n+-------------------------+\n|     -0.00123492454487...|\n+-------------------------+\n\n"
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
      "jobName": "paragraph_1546702550468_-960549844",
      "id": "20190106-003550_2110175928",
      "dateCreated": "2019-01-06 00:35:50.468",
      "dateStarted": "2019-01-06 18:44:25.666",
      "dateFinished": "2019-01-06 18:44:29.523",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.describe().show()",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:44:29.613",
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
            "http://10.0.2.15:4040/jobs/job?id\u003d14"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546703172725_457158659",
      "id": "20190106-004612_2097912276",
      "dateCreated": "2019-01-06 00:46:12.725",
      "dateStarted": "2019-01-06 18:44:29.773",
      "dateFinished": "2019-01-06 18:44:32.975",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.{count, mean, stddev_pop, min, max}",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:44:33.031",
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
      "dateStarted": "2019-01-06 18:44:33.175",
      "dateFinished": "2019-01-06 18:44:33.663",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval colName \u003d \"UnitPrice\"\nval quantileProbs \u003d Array(0.5)\nval relError \u003d 0.05\n\ndf.stat.approxQuantile(\"UnitPrice\", quantileProbs, relError)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:44:33.663",
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
            "data": "colName: String \u003d UnitPrice\nquantileProbs: Array[Double] \u003d Array(0.5)\nrelError: Double \u003d 0.05\nres35: Array[Double] \u003d Array(2.25)\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d15"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546702551068_2028738043",
      "id": "20190106-003551_774348696",
      "dateCreated": "2019-01-06 00:35:51.068",
      "dateStarted": "2019-01-06 18:44:33.846",
      "dateFinished": "2019-01-06 18:44:38.504",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.stat.crosstab(\"StockCode\", \"Quantity\").show()",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:44:38.570",
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
            "http://10.0.2.15:4040/jobs/job?id\u003d16",
            "http://10.0.2.15:4040/jobs/job?id\u003d17"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546703398685_-2069644574",
      "id": "20190106-004958_1653857448",
      "dateCreated": "2019-01-06 00:49:58.685",
      "dateStarted": "2019-01-06 18:44:38.777",
      "dateFinished": "2019-01-06 18:44:49.611",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.monotonically_increasing_id\n\ndf.select(monotonically_increasing_id()).show(2)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:44:49.700",
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
            "http://10.0.2.15:4040/jobs/job?id\u003d18"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546703452525_1007033063",
      "id": "20190106-005052_1460611487",
      "dateCreated": "2019-01-06 00:50:52.525",
      "dateStarted": "2019-01-06 18:44:49.800",
      "dateFinished": "2019-01-06 18:44:50.808",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%md\n#### Handling string data",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:44:50.811",
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
      "apps": [],
      "jobName": "paragraph_1546703514334_435129559",
      "id": "20190106-005154_1991637277",
      "dateCreated": "2019-01-06 00:51:54.334",
      "dateStarted": "2019-01-06 18:44:50.997",
      "dateFinished": "2019-01-06 18:44:51.043",
      "status": "FINISHED",
      "errorMessage": "",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.{initcap}\n\ndf.select(initcap(col(\"Description\"))).show(2, false)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:44:51.167",
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
            "http://10.0.2.15:4040/jobs/job?id\u003d19"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546703654817_1759027691",
      "id": "20190106-005414_601173826",
      "dateCreated": "2019-01-06 00:54:14.817",
      "dateStarted": "2019-01-06 18:44:51.339",
      "dateFinished": "2019-01-06 18:44:52.204",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.{lower, upper}\n\ndf.select(col(\"Description\"), lower(col(\"Description\")), upper(lower(col(\"Description\")))).show(2)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:44:52.240",
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
            "http://10.0.2.15:4040/jobs/job?id\u003d20"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546703654707_-1133203286",
      "id": "20190106-005414_369278579",
      "dateCreated": "2019-01-06 00:54:14.707",
      "dateStarted": "2019-01-06 18:44:52.395",
      "dateFinished": "2019-01-06 18:44:53.204",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.{lit, ltrim, rtrim, rpad, lpad, trim}\n\ndf.select(\n    ltrim(lit(\"     HELLO     \")).as(\"ltrim\"),\n    rtrim(lit(\"     HELLO     \")).as(\"rtrim\"),\n    trim(lit(\"     HELLO     \")).as(\"trim\"),\n    lpad(lit(\"HELLO\"), 3, \" \").as(\"lp\"),\n    rpad(lit(\"HELLO\"), 10, \" \").as(\"rp\")).show(2)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:44:53.291",
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
            "http://10.0.2.15:4040/jobs/job?id\u003d21"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546703654514_233755821",
      "id": "20190106-005414_409110661",
      "dateCreated": "2019-01-06 00:54:14.515",
      "dateStarted": "2019-01-06 18:44:53.435",
      "dateFinished": "2019-01-06 18:44:54.306",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//Regular Expression\nimport org.apache.spark.sql.functions.regexp_replace\n\nval simpleColors \u003d Seq(\"black\", \"white\", \"red\", \"green\", \"blue\")\nval regexString \u003d simpleColors.map(_.toUpperCase).mkString(\"|\")\n\n//파이프 문자(|)는 정규 표현식에서 OR를 의미\n\ndf.select(\n    regexp_replace(col(\"Description\"), regexString, \"COLOR\").alias(\"color_clean\"), col(\"Description\")).show(2)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:44:54.316",
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
            "http://10.0.2.15:4040/jobs/job?id\u003d22"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546703994996_172806108",
      "id": "20190106-005954_1295063465",
      "dateCreated": "2019-01-06 00:59:54.996",
      "dateStarted": "2019-01-06 18:44:54.488",
      "dateFinished": "2019-01-06 18:44:56.666",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//주어진 문자를 다른 문자로 치환해야 할 때\n\nimport org.apache.spark.sql.functions.translate\n\ndf.select(translate(col(\"Description\"), \"LEET\", \"1337\"), col(\"Description\")).show(2)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:46:32.666",
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
            "data": "import org.apache.spark.sql.functions.translate\n+----------------------------------+-------------------+\n|translate(Description, LEET, 1337)|        Description|\n+----------------------------------+-------------------+\n|                RABBI7 NIGH7 1IGH7| RABBIT NIGHT LIGHT|\n|               DOUGHNU7 1IP G1OSS |DOUGHNUT LIP GLOSS |\n+----------------------------------+-------------------+\nonly showing top 2 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d23"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546704132140_-1875669589",
      "id": "20190106-010212_1888740200",
      "dateCreated": "2019-01-06 01:02:12.140",
      "dateStarted": "2019-01-06 18:46:32.719",
      "dateFinished": "2019-01-06 18:46:33.577",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.regexp_extract\n\nval regexString \u003d simpleColors.map(_.toUpperCase).mkString(\"(\", \"|\", \")\")\n\ndf.select(\n    regexp_extract(col(\"Description\"), regexString, 1).alias(\"color_clean\"), col(\"Description\")).show(2)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:48:41.254",
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
            "data": "import org.apache.spark.sql.functions.regexp_extract\nregexString: String \u003d (BLACK|WHITE|RED|GREEN|BLUE)\n+-----------+-------------------+\n|color_clean|        Description|\n+-----------+-------------------+\n|           | RABBIT NIGHT LIGHT|\n|           |DOUGHNUT LIP GLOSS |\n+-----------+-------------------+\nonly showing top 2 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d24"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546704131334_466157415",
      "id": "20190106-010211_995425219",
      "dateCreated": "2019-01-06 01:02:11.334",
      "dateStarted": "2019-01-06 18:48:41.303",
      "dateFinished": "2019-01-06 18:48:42.254",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n// check value exists\n\nval containsBlack \u003d col(\"Description\").contains(\"BLACK\")\nval containsWhite \u003d col(\"DESCRIPTION\").contains(\"WHITE\")\ndf.withColumn(\"hasSimpleColor\", containsBlack.or(containsWhite)).\nwhere(\"hasSimpleColor\").\nselect(\"Description\").show(3, false)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:51:29.332",
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
            "data": "containsBlack: org.apache.spark.sql.Column \u003d contains(Description, BLACK)\ncontainsWhite: org.apache.spark.sql.Column \u003d contains(DESCRIPTION, WHITE)\n+------------------------------+\n|Description                   |\n+------------------------------+\n|WHITE SKULL HOT WATER BOTTLE  |\n|BLACK TEA TOWEL CLASSIC DESIGN|\n|BLACK RECORD COVER FRAME      |\n+------------------------------+\nonly showing top 3 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d26"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546768088420_-1224508150",
      "id": "20190106-184808_1832085335",
      "dateCreated": "2019-01-06 18:48:08.421",
      "dateStarted": "2019-01-06 18:51:29.389",
      "dateFinished": "2019-01-06 18:51:30.533",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.show(2)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 18:53:34.058",
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
            "data": "+---------+---------+-------------------+--------+--------------------+---------+----------+--------------+\n|InvoiceNo|StockCode|        Description|Quantity|         InvoiceDate|UnitPrice|CustomerID|       Country|\n+---------+---------+-------------------+--------+--------------------+---------+----------+--------------+\n|   580538|    23084| RABBIT NIGHT LIGHT|      48|2011-12-05 08:38:...|     1.79|   14075.0|United Kingdom|\n|   580538|    23077|DOUGHNUT LIP GLOSS |      20|2011-12-05 08:38:...|     1.25|   14075.0|United Kingdom|\n+---------+---------+-------------------+--------+--------------------+---------+----------+--------------+\nonly showing top 2 rows\n\n"
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
      "jobName": "paragraph_1546768086134_1922513986",
      "id": "20190106-184806_1340270175",
      "dateCreated": "2019-01-06 18:48:06.134",
      "dateStarted": "2019-01-06 18:53:34.122",
      "dateFinished": "2019-01-06 18:53:34.423",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval simpleColors \u003d Seq(\"Black\", \"white\", \"red\", \"green\", \"blue\")\n\nval selectedColumns \u003d simpleColors.map(color \u003d\u003e {\n    col(\"Description\").contains(color.toUpperCase).alias(s\"is_$color\")\n}):+expr(\"*\")\n\ndf.select(selectedColumns:_*).where(col(\"is_white\").or(col(\"is_red\"))).select(\"Description\").show(3, false)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 19:07:56.687",
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
            "data": "simpleColors: Seq[String] \u003d List(Black, white, red, green, blue)\nselectedColumns: Seq[org.apache.spark.sql.Column] \u003d List(contains(Description, BLACK) AS `is_Black`, contains(Description, WHITE) AS `is_white`, contains(Description, RED) AS `is_red`, contains(Description, GREEN) AS `is_green`, contains(Description, BLUE) AS `is_blue`, unresolvedstar())\n+-----------------------------+\n|Description                  |\n+-----------------------------+\n|WHITE SKULL HOT WATER BOTTLE |\n|GINGHAM HEART  DOORSTOP RED  |\n|12 COLOURED PARTY BALLOONS   |\n+-----------------------------+\nonly showing top 3 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d28"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546768085573_41574351",
      "id": "20190106-184805_1257302820",
      "dateCreated": "2019-01-06 18:48:05.573",
      "dateStarted": "2019-01-06 19:07:56.736",
      "dateFinished": "2019-01-06 19:07:57.942",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%md\n#### 날짜와 타임스태프 데이터 타입 다루기",
      "user": "dskang",
      "dateUpdated": "2019-01-06 19:08:30.342",
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
            "data": "\u003cdiv class\u003d\"markdown-body\"\u003e\n\u003ch4\u003e날짜와 타임스태프 데이터 타입 다루기\u003c/h4\u003e\n\u003c/div\u003e"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546769298208_-833160913",
      "id": "20190106-190818_40652801",
      "dateCreated": "2019-01-06 19:08:18.208",
      "dateStarted": "2019-01-06 19:08:30.343",
      "dateFinished": "2019-01-06 19:08:30.399",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.printSchema()",
      "user": "dskang",
      "dateUpdated": "2019-01-06 19:09:37.493",
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
            "data": "root\n |-- InvoiceNo: string (nullable \u003d true)\n |-- StockCode: string (nullable \u003d true)\n |-- Description: string (nullable \u003d true)\n |-- Quantity: integer (nullable \u003d true)\n |-- InvoiceDate: timestamp (nullable \u003d true)\n |-- UnitPrice: double (nullable \u003d true)\n |-- CustomerID: double (nullable \u003d true)\n |-- Country: string (nullable \u003d true)\n\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546768084971_-1445503982",
      "id": "20190106-184804_451789213",
      "dateCreated": "2019-01-06 18:48:04.972",
      "dateStarted": "2019-01-06 19:09:37.547",
      "dateFinished": "2019-01-06 19:09:37.827",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.{current_date, current_timestamp}\n\nval dateDF \u003d spark.range(10).\n    withColumn(\"today\", current_date()).\n    withColumn(\"now\", current_timestamp())\n    \ndateDF.createOrReplaceTempView(\"dataTable\")",
      "user": "dskang",
      "dateUpdated": "2019-01-06 19:13:04.659",
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
            "data": "import org.apache.spark.sql.functions.{current_date, current_timestamp}\ndateDF: org.apache.spark.sql.DataFrame \u003d [id: bigint, today: date ... 1 more field]\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546768084865_-1574496423",
      "id": "20190106-184804_1713847123",
      "dateCreated": "2019-01-06 18:48:04.865",
      "dateStarted": "2019-01-06 19:13:04.721",
      "dateFinished": "2019-01-06 19:13:05.403",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.{date_add, date_sub}\n\ndateDF.select(date_sub(col(\"today\"), 5), date_add(col(\"today\"), 5)).show(1)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 19:15:05.451",
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
            "data": "import org.apache.spark.sql.functions.{date_add, date_sub}\n+------------------+------------------+\n|date_sub(today, 5)|date_add(today, 5)|\n+------------------+------------------+\n|        2019-01-01|        2019-01-11|\n+------------------+------------------+\nonly showing top 1 row\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d32"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546769479864_-1282301884",
      "id": "20190106-191119_235259731",
      "dateCreated": "2019-01-06 19:11:19.864",
      "dateStarted": "2019-01-06 19:15:05.498",
      "dateFinished": "2019-01-06 19:15:06.179",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.{datediff, months_between, to_date}\n\ndateDF.withColumn(\"week_ago\", date_sub(col(\"today\"), 7)).select(datediff(col(\"week_ago\"), col(\"today\"))).show(1)\n\ndateDF.select(\n    to_date(lit(\"2016-01-01\")).alias(\"start\"),\n    to_date(lit(\"2017-05-22\")).alias(\"end\")).\n    select(months_between(col(\"start\"), col(\"end\"))).show(1)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 19:20:39.250",
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
            "data": "import org.apache.spark.sql.functions.{datediff, months_between, to_date}\n+-------------------------+\n|datediff(week_ago, today)|\n+-------------------------+\n|                       -7|\n+-------------------------+\nonly showing top 1 row\n\n+--------------------------+\n|months_between(start, end)|\n+--------------------------+\n|              -16.67741935|\n+--------------------------+\nonly showing top 1 row\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d39",
            "http://10.0.2.15:4040/jobs/job?id\u003d40"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546768084089_489773292",
      "id": "20190106-184804_74610655",
      "dateCreated": "2019-01-06 18:48:04.089",
      "dateStarted": "2019-01-06 19:20:39.307",
      "dateFinished": "2019-01-06 19:20:40.167",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n// 스파크에서 날짜를 파싱할 수 없을 경우, null 값을 반환함\n\ndateDF.select(to_date(lit(\"2016-20-12\")), to_date(lit(\"2017-12-11\"))).show(1) \n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 19:40:13.090",
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
            "data": "+-------------------+-------------------+\n|to_date(2016-20-12)|to_date(2017-12-11)|\n+-------------------+-------------------+\n|               null|         2017-12-11|\n+-------------------+-------------------+\nonly showing top 1 row\n\n"
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
      "jobName": "paragraph_1546768083979_-740324606",
      "id": "20190106-184803_1266837761",
      "dateCreated": "2019-01-06 18:48:03.979",
      "dateStarted": "2019-01-06 19:25:28.421",
      "dateFinished": "2019-01-06 19:25:28.890",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//위 문제 해결방법\n//1. 자바의 SimpleDateFormat 표준에 맞춰 날짜 포맷을 지정.\n\nimport org.apache.spark.sql.functions.to_date\n\nval dateFormat \u003d \"yyyy-dd-MM\"\nval cleanDateDF \u003d spark.range(1).select(\n    to_date(lit(\"2017-12-11\"), dateFormat).alias(\"date\"),\n    to_date(lit(\"2017-20-12\"), dateFormat).alias(\"date2\"))\n    \ncleanDateDF.createOrReplaceTempView(\"dateTable2\")\n\n\n//에러 발생 - to_date 함수가 2개인데, 이중 현재 사용하는 스파크(2.0.2)보다 최신 버전(2.2.0)의 함수를 사용하여 함수를 사용할 수 없음.\n// 해당 함수 사용을 위해선, 제플린 내 스파크의 버전을 업그레이드해야할 듯.",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:04:52.471",
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
            "data": "import org.apache.spark.sql.functions.to_date\ndateFormat: String \u003d yyyy-dd-MM\n\u003cconsole\u003e:52: error: too many arguments for method to_date: (e: org.apache.spark.sql.Column)org.apache.spark.sql.Column\n           to_date(lit(\"2017-12-11\"), dateFormat).alias(\"date\"),\n                  ^\n\u003cconsole\u003e:53: error: too many arguments for method to_date: (e: org.apache.spark.sql.Column)org.apache.spark.sql.Column\n           to_date(lit(\"2017-20-12\"), dateFormat).alias(\"date2\"))\n                  ^\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546768083897_1498727979",
      "id": "20190106-184803_1153218111",
      "dateCreated": "2019-01-06 18:48:03.897",
      "dateStarted": "2019-01-06 19:41:59.494",
      "dateFinished": "2019-01-06 19:41:59.791",
      "status": "ERROR",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%md\n#### null 값 다루기",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:08:29.105",
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
            "data": "\u003cdiv class\u003d\"markdown-body\"\u003e\n\u003ch4\u003enull 값 다루기\u003c/h4\u003e\n\u003c/div\u003e"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546768083833_-360642028",
      "id": "20190106-184803_671802421",
      "dateCreated": "2019-01-06 18:48:03.833",
      "dateStarted": "2019-01-06 20:08:29.125",
      "dateFinished": "2019-01-06 20:08:29.194",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.coalesce\n\n// coalesce - 여러 컬럼 중 null 값이 아닌 첫 번째 값을 반환\n\ndf.select(coalesce(col(\"Description\"), col(\"CustomerId\"))).show()",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:10:09.009",
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
            "data": "import org.apache.spark.sql.functions.coalesce\n+---------------------------------+\n|coalesce(Description, CustomerId)|\n+---------------------------------+\n|               RABBIT NIGHT LIGHT|\n|              DOUGHNUT LIP GLOSS |\n|             12 MESSAGE CARDS ...|\n|             BLUE HARMONICA IN...|\n|                GUMBALL COAT RACK|\n|             SKULLS  WATER TRA...|\n|             FELTCRAFT GIRL AM...|\n|             CAMOUFLAGE LED TORCH|\n|             WHITE SKULL HOT W...|\n|             ENGLISH ROSE HOT ...|\n|             HOT WATER BOTTLE ...|\n|             SCOTTIE DOG HOT W...|\n|             ROSE CARAVAN DOOR...|\n|             GINGHAM HEART  DO...|\n|             STORAGE TIN VINTA...|\n|             SET OF 4 KNICK KN...|\n|                   POPCORN HOLDER|\n|             GROW A FLYTRAP OR...|\n|             AIRLINE BAG VINTA...|\n|             AIRLINE BAG VINTA...|\n+---------------------------------+\nonly showing top 20 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d42"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546768083771_1048064253",
      "id": "20190106-184803_291142314",
      "dateCreated": "2019-01-06 18:48:03.771",
      "dateStarted": "2019-01-06 20:09:39.630",
      "dateFinished": "2019-01-06 20:09:40.302",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//drop - null값을 가진 로우를 제거\n\ndf.na.drop()\ndf.na.drop(\"any\") //any 부여시 로우의 컬럼값 중 하나라도 null 값을 가지면 해당 로우 제거, all 부여 시 로우의 컬럼값이 모두 null, nan 값을 가지면 해당로우 제거\ndf.na.drop(\"all\", Seq(\"StockCode\", \"InvoiceNo\")) // 배열 형태의 컬럼을 인수로 전달할 수도 있음\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:14:35.412",
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
            "data": "res121: org.apache.spark.sql.DataFrame \u003d [InvoiceNo: string, StockCode: string ... 6 more fields]\nres122: org.apache.spark.sql.DataFrame \u003d [InvoiceNo: string, StockCode: string ... 6 more fields]\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546768083261_-1209072212",
      "id": "20190106-184803_664127684",
      "dateCreated": "2019-01-06 18:48:03.261",
      "dateStarted": "2019-01-06 20:13:52.187",
      "dateFinished": "2019-01-06 20:13:52.754",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//fill - 하나 이상의 컬럼을 특정값으로 채울 수 있음\n\ndf.na.fill(\"All Null values become this string\")",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:15:35.230",
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
            "data": "res125: org.apache.spark.sql.DataFrame \u003d [InvoiceNo: string, StockCode: string ... 6 more fields]\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546768083143_1751567488",
      "id": "20190106-184803_2049736478",
      "dateCreated": "2019-01-06 18:48:03.143",
      "dateStarted": "2019-01-06 20:15:35.270",
      "dateFinished": "2019-01-06 20:15:35.574",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.na.fill(5, Seq(\"StockCode\", \"InvocieNo\")) //Integer 데이터 타입의 컬럼에 존재한 null 값을 다른 값으로",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:19:04.664",
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
            "data": "res127: org.apache.spark.sql.DataFrame \u003d [InvoiceNo: string, StockCode: string ... 6 more fields]\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546768082984_-380333717",
      "id": "20190106-184802_47553056",
      "dateCreated": "2019-01-06 18:48:02.984",
      "dateStarted": "2019-01-06 20:19:04.742",
      "dateFinished": "2019-01-06 20:19:05.259",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//Map을 이용하여 다수의 컬럼에 fill 메소드 적용\nval fillColValues \u003d Map(\"StockCode\" -\u003e 5, \"Description\" -\u003e \"No value\")\ndf.na.fill(fillColValues)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:20:11.789",
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
            "data": "fillColValues: scala.collection.immutable.Map[String,Any] \u003d Map(StockCode -\u003e 5, Description -\u003e No value)\nres130: org.apache.spark.sql.DataFrame \u003d [InvoiceNo: string, StockCode: string ... 6 more fields]\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546768082646_-1953142995",
      "id": "20190106-184802_1686138847",
      "dateCreated": "2019-01-06 18:48:02.646",
      "dateStarted": "2019-01-06 20:20:11.830",
      "dateFinished": "2019-01-06 20:20:12.822",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n// drop, fill 이외에 null 값을 처리하는 방법 -\u003e replace(단, 변경하고자 하는 값과 원래 값의 데이터 타입이 같아야 함)\ndf.na.replace(\"Description\", Map(\"\" -\u003e \"UNKNOWN\"))",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:21:22.253",
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
            "data": "res133: org.apache.spark.sql.DataFrame \u003d [InvoiceNo: string, StockCode: string ... 6 more fields]\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546768082199_-679078318",
      "id": "20190106-184802_1544094496",
      "dateCreated": "2019-01-06 18:48:02.199",
      "dateStarted": "2019-01-06 20:21:22.299",
      "dateFinished": "2019-01-06 20:21:22.885",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%md\n#### 복합 데이터 타입 다루기\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:40:43.147",
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
            "data": "\u003cdiv class\u003d\"markdown-body\"\u003e\n\u003ch4\u003e복합 데이터 타입 다루기\u003c/h4\u003e\n\u003c/div\u003e"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546768081649_-681039268",
      "id": "20190106-184801_259002772",
      "dateCreated": "2019-01-06 18:48:01.649",
      "dateStarted": "2019-01-06 20:40:43.147",
      "dateFinished": "2019-01-06 20:40:43.171",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//struct(구조체) - dataframe 내부의 dataframe 정도로 생각할 수 있음.\n\nimport org.apache.spark.sql.functions.struct\n\nval complexDF \u003d df.select(struct(\"Description\", \"InvoiceNo\").alias(\"complex\"))\ncomplexDF.createOrReplaceTempView(\"complexDF\")\n\ndf.selectExpr(\"(Description, InvoiceNo) as complex\")\n\ndf.selectExpr(\"struct(Description, InvoiceNo) as complex\") ",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:50:02.329",
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
            "data": "import org.apache.spark.sql.functions.struct\ncomplexDF: org.apache.spark.sql.DataFrame \u003d [complex: struct\u003cDescription: string, InvoiceNo: string\u003e]\nres148: org.apache.spark.sql.DataFrame \u003d [complex: struct\u003cDescription: string, InvoiceNo: string\u003e]\nres149: org.apache.spark.sql.DataFrame \u003d [complex: struct\u003cDescription: string, InvoiceNo: string\u003e]\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546768081109_-1245058950",
      "id": "20190106-184801_1333547051",
      "dateCreated": "2019-01-06 18:48:01.109",
      "dateStarted": "2019-01-06 20:50:02.378",
      "dateFinished": "2019-01-06 20:50:03.381",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ncomplexDF.select(\"complex.Description\").show(3)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:51:46.664",
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
            "data": "+--------------------+\n|         Description|\n+--------------------+\n|  RABBIT NIGHT LIGHT|\n| DOUGHNUT LIP GLOSS |\n|12 MESSAGE CARDS ...|\n+--------------------+\nonly showing top 3 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d44"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546768080562_-1232870957",
      "id": "20190106-184800_1622257105",
      "dateCreated": "2019-01-06 18:48:00.562",
      "dateStarted": "2019-01-06 20:51:46.716",
      "dateFinished": "2019-01-06 20:51:47.114",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.split\n\ncomplexDF.select(\"complex.*\").count()",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:53:00.825",
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
            "data": "import org.apache.spark.sql.functions.split\nres163: Long \u003d 541909\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d46"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546768080031_-1018530790",
      "id": "20190106-184800_680525339",
      "dateCreated": "2019-01-06 18:48:00.031",
      "dateStarted": "2019-01-06 20:53:00.872",
      "dateFinished": "2019-01-06 20:53:02.406",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//array(배열)\nimport org.apache.spark.sql.functions.split\n\ndf.select(split(col(\"Description\"), \" \")).show(2)\n\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:53:53.896",
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
            "data": "import org.apache.spark.sql.functions.split\n+---------------------+\n|split(Description,  )|\n+---------------------+\n| [RABBIT, NIGHT, L...|\n| [DOUGHNUT, LIP, G...|\n+---------------------+\nonly showing top 2 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d47"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546768079423_2005530107",
      "id": "20190106-184759_1483017575",
      "dateCreated": "2019-01-06 18:47:59.423",
      "dateStarted": "2019-01-06 20:53:53.943",
      "dateFinished": "2019-01-06 20:53:54.505",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//split\ndf.select(split(col(\"Description\"), \" \").alias(\"array_col\")).\nselectExpr(\"array_col[0]\").show(2)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 21:06:25.318",
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
            "data": "+------------+\n|array_col[0]|\n+------------+\n|      RABBIT|\n|    DOUGHNUT|\n+------------+\nonly showing top 2 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d48"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546768078269_-1011605238",
      "id": "20190106-184758_1374250369",
      "dateCreated": "2019-01-06 18:47:58.269",
      "dateStarted": "2019-01-06 20:55:40.986",
      "dateFinished": "2019-01-06 20:55:41.377",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//배열의 길이 조회\nimport org.apache.spark.sql.functions.size\n\ndf.select(size(split(col(\"Description\"), \" \"))).show(2)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 21:06:57.379",
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
            "data": "import org.apache.spark.sql.functions.size\n+---------------------------+\n|size(split(Description,  ))|\n+---------------------------+\n|                          3|\n|                          4|\n+---------------------------+\nonly showing top 2 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d49"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546775680442_-1633501082",
      "id": "20190106-205440_784182024",
      "dateCreated": "2019-01-06 20:54:40.442",
      "dateStarted": "2019-01-06 21:06:57.439",
      "dateFinished": "2019-01-06 21:06:57.937",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//array_contains - 배열에 특정값이 존재하는지 확인 가능\n\nimport org.apache.spark.sql.functions.array_contains\n\ndf.select(array_contains(split(col(\"Description\"), \" \"), \"WHITE\")).show(2)",
      "user": "dskang",
      "dateUpdated": "2019-01-06 21:08:58.386",
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
            "data": "import org.apache.spark.sql.functions.array_contains\n+--------------------------------------------+\n|array_contains(split(Description,  ), WHITE)|\n+--------------------------------------------+\n|                                       false|\n|                                       false|\n+--------------------------------------------+\nonly showing top 2 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d50"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1546775680359_-1597553161",
      "id": "20190106-205440_98515073",
      "dateCreated": "2019-01-06 20:54:40.359",
      "dateStarted": "2019-01-06 21:08:58.444",
      "dateFinished": "2019-01-06 21:08:58.963",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//explode - 배열 타입의 컬럼을 입력 받아, 입력된 컬럼의 배열값에 포함된 모든 값을 로우로 변환\n\ndf.withColumn(\"splitted\", split(col(\"Description\", \" \")).\nwithColumn(\"exploded\", explode(col(\"splitted\"))).\nselect(\"Description\", \"InvoiceNo\", \"exploded\")",
      "user": "dskang",
      "dateUpdated": "2019-01-06 21:14:37.619",
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
            "data": "\u003cconsole\u003e:65: error: type mismatch;\n found   : String(\"Hello World\")\n required: org.apache.spark.sql.Column\n       split(\"Hello World\", \" \")\n             ^\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1546775677504_1370047628",
      "id": "20190106-205437_1337298405",
      "dateCreated": "2019-01-06 20:54:37.504",
      "dateStarted": "2019-01-06 21:13:03.482",
      "dateFinished": "2019-01-06 21:13:03.581",
      "status": "ERROR",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:54:37.362",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1546775677361_209125020",
      "id": "20190106-205437_1386938415",
      "dateCreated": "2019-01-06 20:54:37.361",
      "status": "READY",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:54:37.267",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1546775677266_-1897614410",
      "id": "20190106-205437_1019877197",
      "dateCreated": "2019-01-06 20:54:37.266",
      "status": "READY",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:54:37.183",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1546775677183_2105319080",
      "id": "20190106-205437_231768836",
      "dateCreated": "2019-01-06 20:54:37.183",
      "status": "READY",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:54:36.739",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1546775676739_1239881991",
      "id": "20190106-205436_1063584597",
      "dateCreated": "2019-01-06 20:54:36.739",
      "status": "READY",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:54:36.648",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1546775676648_99109937",
      "id": "20190106-205436_417312652",
      "dateCreated": "2019-01-06 20:54:36.648",
      "status": "READY",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:54:36.487",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1546775676487_2045477815",
      "id": "20190106-205436_190529630",
      "dateCreated": "2019-01-06 20:54:36.487",
      "status": "READY",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:54:36.389",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1546775676389_-603840386",
      "id": "20190106-205436_1713706629",
      "dateCreated": "2019-01-06 20:54:36.389",
      "status": "READY",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:54:36.299",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1546775676298_1882088256",
      "id": "20190106-205436_1262895814",
      "dateCreated": "2019-01-06 20:54:36.298",
      "status": "READY",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:54:36.223",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1546775676223_-349999271",
      "id": "20190106-205436_749738354",
      "dateCreated": "2019-01-06 20:54:36.223",
      "status": "READY",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:54:36.151",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1546775676151_-520954588",
      "id": "20190106-205436_1436784515",
      "dateCreated": "2019-01-06 20:54:36.151",
      "status": "READY",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:54:36.064",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1546775676063_766451874",
      "id": "20190106-205436_1737628657",
      "dateCreated": "2019-01-06 20:54:36.063",
      "status": "READY",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:54:35.978",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1546775675978_154713805",
      "id": "20190106-205435_1789599706",
      "dateCreated": "2019-01-06 20:54:35.978",
      "status": "READY",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:54:35.877",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1546775675877_-370095150",
      "id": "20190106-205435_1709888950",
      "dateCreated": "2019-01-06 20:54:35.877",
      "status": "READY",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:54:35.162",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1546775675162_350763958",
      "id": "20190106-205435_1015875837",
      "dateCreated": "2019-01-06 20:54:35.162",
      "status": "READY",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:54:35.064",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1546775675064_1557284198",
      "id": "20190106-205435_208780240",
      "dateCreated": "2019-01-06 20:54:35.064",
      "status": "READY",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:54:34.984",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1546775674984_951706952",
      "id": "20190106-205434_1185438139",
      "dateCreated": "2019-01-06 20:54:34.984",
      "status": "READY",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2019-01-06 20:54:34.695",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1546775674695_1373510099",
      "id": "20190106-205434_1019475727",
      "dateCreated": "2019-01-06 20:54:34.695",
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