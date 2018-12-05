{
  "paragraphs": [
    {
      "text": "%spark\nval trainData \u003d \"/home/dskangu/다운로드/train.csv\"",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:17:03.239",
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
            "data": "trainData: String \u003d /home/dskangu/다운로드/train.csv\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1543800286818_45935029",
      "id": "20181203-102446_1179082965",
      "dateCreated": "2018-12-03 10:24:46.818",
      "dateStarted": "2018-12-05 21:17:03.393",
      "dateFinished": "2018-12-05 21:17:22.132",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval rawData \u003d sc.textFile(trainData)\nval columns \u003d rawData.first().split(\",\")",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:17:22.158",
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
            "data": "rawData: org.apache.spark.rdd.RDD[String] \u003d /home/dskangu/다운로드/train.csv MapPartitionsRDD[1] at textFile at \u003cconsole\u003e:27\ncolumns: Array[String] \u003d Array(PassengerId, Survived, Pclass, Name, Sex, Age, SibSp, Parch, Ticket, Fare, Cabin, Embarked)\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d0"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1543800527577_164899850",
      "id": "20181203-102847_1583885311",
      "dateCreated": "2018-12-03 10:28:47.577",
      "dateStarted": "2018-12-05 21:17:22.482",
      "dateFinished": "2018-12-05 21:17:25.861",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval sqlContext \u003d new org.apache.spark.sql.SQLContext(sc)\nimport org.apache.spark.sql.functions._\nimport sqlContext.implicits._",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:17:25.911",
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
            "data": "warning: there was one deprecation warning; re-run with -deprecation for details\nsqlContext: org.apache.spark.sql.SQLContext \u003d org.apache.spark.sql.SQLContext@62a837e9\nimport org.apache.spark.sql.functions._\nimport sqlContext.implicits._\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1543800554020_-2021673250",
      "id": "20181203-102914_1912389649",
      "dateCreated": "2018-12-03 10:29:14.020",
      "dateStarted": "2018-12-05 21:17:26.246",
      "dateFinished": "2018-12-05 21:17:28.440",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nvar tmpdf \u003d sqlContext.read.format(\"com.databricks.spark.csv\").\noption(\"header\", \"true\").\noption(\"inferSchema\", \"true\").\nload(trainData).\ntoDF(columns : _*).\ncache()",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:17:28.461",
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
            "data": "tmpdf: org.apache.spark.sql.Dataset[org.apache.spark.sql.Row] \u003d [PassengerId: int, Survived: int ... 10 more fields]\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d1",
            "http://10.0.2.15:4040/jobs/job?id\u003d2",
            "http://10.0.2.15:4040/jobs/job?id\u003d3"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1543800745292_-1564143519",
      "id": "20181203-103225_1568246065",
      "dateCreated": "2018-12-03 10:32:25.292",
      "dateStarted": "2018-12-05 21:17:28.702",
      "dateFinished": "2018-12-05 21:17:33.126",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ntmpdf.printSchema()",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:17:33.138",
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
            "data": "root\n |-- PassengerId: integer (nullable \u003d true)\n |-- Survived: integer (nullable \u003d true)\n |-- Pclass: integer (nullable \u003d true)\n |-- Name: string (nullable \u003d true)\n |-- Sex: string (nullable \u003d true)\n |-- Age: double (nullable \u003d true)\n |-- SibSp: integer (nullable \u003d true)\n |-- Parch: integer (nullable \u003d true)\n |-- Ticket: string (nullable \u003d true)\n |-- Fare: double (nullable \u003d true)\n |-- Cabin: string (nullable \u003d true)\n |-- Embarked: string (nullable \u003d true)\n\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1543841681043_-652769149",
      "id": "20181203-215441_32847832",
      "dateCreated": "2018-12-03 21:54:41.043",
      "dateStarted": "2018-12-05 21:17:33.354",
      "dateFinished": "2018-12-05 21:17:33.844",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ntmpdf.show(20)",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:17:33.845",
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
            "data": "+-----------+--------+------+--------------------+------+----+-----+-----+----------------+-------+-----+--------+\n|PassengerId|Survived|Pclass|                Name|   Sex| Age|SibSp|Parch|          Ticket|   Fare|Cabin|Embarked|\n+-----------+--------+------+--------------------+------+----+-----+-----+----------------+-------+-----+--------+\n|          1|       0|     3|Braund, Mr. Owen ...|  male|22.0|    1|    0|       A/5 21171|   7.25| null|       S|\n|          2|       1|     1|Cumings, Mrs. Joh...|female|38.0|    1|    0|        PC 17599|71.2833|  C85|       C|\n|          3|       1|     3|Heikkinen, Miss. ...|female|26.0|    0|    0|STON/O2. 3101282|  7.925| null|       S|\n|          4|       1|     1|Futrelle, Mrs. Ja...|female|35.0|    1|    0|          113803|   53.1| C123|       S|\n|          5|       0|     3|Allen, Mr. Willia...|  male|35.0|    0|    0|          373450|   8.05| null|       S|\n|          6|       0|     3|    Moran, Mr. James|  male|null|    0|    0|          330877| 8.4583| null|       Q|\n|          7|       0|     1|McCarthy, Mr. Tim...|  male|54.0|    0|    0|           17463|51.8625|  E46|       S|\n|          8|       0|     3|Palsson, Master. ...|  male| 2.0|    3|    1|          349909| 21.075| null|       S|\n|          9|       1|     3|Johnson, Mrs. Osc...|female|27.0|    0|    2|          347742|11.1333| null|       S|\n|         10|       1|     2|Nasser, Mrs. Nich...|female|14.0|    1|    0|          237736|30.0708| null|       C|\n|         11|       1|     3|Sandstrom, Miss. ...|female| 4.0|    1|    1|         PP 9549|   16.7|   G6|       S|\n|         12|       1|     1|Bonnell, Miss. El...|female|58.0|    0|    0|          113783|  26.55| C103|       S|\n|         13|       0|     3|Saundercock, Mr. ...|  male|20.0|    0|    0|       A/5. 2151|   8.05| null|       S|\n|         14|       0|     3|Andersson, Mr. An...|  male|39.0|    1|    5|          347082| 31.275| null|       S|\n|         15|       0|     3|Vestrom, Miss. Hu...|female|14.0|    0|    0|          350406| 7.8542| null|       S|\n|         16|       1|     2|Hewlett, Mrs. (Ma...|female|55.0|    0|    0|          248706|   16.0| null|       S|\n|         17|       0|     3|Rice, Master. Eugene|  male| 2.0|    4|    1|          382652| 29.125| null|       Q|\n|         18|       1|     2|Williams, Mr. Cha...|  male|null|    0|    0|          244373|   13.0| null|       S|\n|         19|       0|     3|Vander Planke, Mr...|female|31.0|    1|    0|          345763|   18.0| null|       S|\n|         20|       1|     3|Masselmani, Mrs. ...|female|null|    0|    0|            2649|  7.225| null|       C|\n+-----------+--------+------+--------------------+------+----+-----+-----+----------------+-------+-----+--------+\nonly showing top 20 rows\n\n"
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
      "jobName": "paragraph_1543842433776_539023731",
      "id": "20181203-220713_1269259812",
      "dateCreated": "2018-12-03 22:07:13.776",
      "dateStarted": "2018-12-05 21:17:34.058",
      "dateFinished": "2018-12-05 21:17:35.202",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n\ntmpdf.describe().show()",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:17:35.248",
      "config": {
        "colWidth": 12.0,
        "fontSize": 9.0,
        "enabled": true,
        "results": {
          "0": {
            "graph": {
              "mode": "table",
              "height": 142.8,
              "optionOpen": false
            }
          }
        },
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
            "data": "+-------+-----------------+-------------------+------------------+------------------+------------------+-------------------+-----------------+\n|summary|      PassengerId|           Survived|            Pclass|               Age|             SibSp|              Parch|             Fare|\n+-------+-----------------+-------------------+------------------+------------------+------------------+-------------------+-----------------+\n|  count|              891|                891|               891|               714|               891|                891|              891|\n|   mean|            446.0| 0.3838383838383838| 2.308641975308642| 29.69911764705882|0.5230078563411896|0.38159371492704824| 32.2042079685746|\n| stddev|257.3538420152301|0.48659245426485753|0.8360712409770491|14.526497332334035|1.1027434322934315| 0.8060572211299488|49.69342859718089|\n|    min|                1|                  0|                 1|              0.42|                 0|                  0|              0.0|\n|    max|              891|                  1|                 3|              80.0|                 8|                  6|         512.3292|\n+-------+-----------------+-------------------+------------------+------------------+------------------+-------------------+-----------------+\n\n"
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
      "jobName": "paragraph_1543842440587_2047477920",
      "id": "20181203-220720_1339768921",
      "dateCreated": "2018-12-03 22:07:20.587",
      "dateStarted": "2018-12-05 21:17:35.472",
      "dateFinished": "2018-12-05 21:17:37.736",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ntmpdf.filter(tmpdf(\"Sex\") \u003d\u003d\u003d \"male\").count() + tmpdf.filter(tmpdf(\"Sex\") \u003d\u003d\u003d \"female\").count()",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:17:37.793",
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
            "data": "res14: Long \u003d 891\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d6",
            "http://10.0.2.15:4040/jobs/job?id\u003d7"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1543842478533_1848785587",
      "id": "20181203-220758_1692425155",
      "dateCreated": "2018-12-03 22:07:58.533",
      "dateStarted": "2018-12-05 21:17:37.952",
      "dateFinished": "2018-12-05 21:17:39.018",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ntmpdf.select(\"Fare\").orderBy(asc(\"Fare\")).map(row \u003d\u003e row(0).asInstanceOf[Double]).collect()",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:17:39.041",
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
            "data": "res16: Array[Double] \u003d Array(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0125, 5.0, 6.2375, 6.4375, 6.45, 6.4958, 6.4958, 6.75, 6.75, 6.8583, 6.95, 6.975, 6.975, 7.0458, 7.05, 7.05, 7.05, 7.05, 7.05, 7.05, 7.05, 7.0542, 7.0542, 7.125, 7.125, 7.125, 7.125, 7.1417, 7.225, 7.225, 7.225, 7.225, 7.225, 7.225, 7.225, 7.225, 7.225, 7.225, 7.225, 7.225, 7.2292, 7.2292, 7.2292, 7.2292, 7.2292, 7.2292, 7.2292, 7.2292, 7.2292, 7.2292, 7.2292, 7.2292, 7.2292, 7.2292, 7.2292, 7.25, 7.25, 7.25, 7.25, 7.25, 7.25, 7.25, 7.25, 7.25, 7.25, 7.25, 7.25, 7.25, 7.3125, 7.4958, 7.4958, 7.4958, 7.5208, 7.55, 7.55, 7.55, 7.55, 7.6292, 7.65, 7.65, 7.65, 7.65, 7.725, 7.7292, 7.7333, 7.7333, 7.7333, 7.7333, 7.7375, 7.7375, 7.7417, 7.75, 7.75, 7.75, 7.75, 7.75, 7.75, 7.75, 7.75, 7.7..."
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
            "http://10.0.2.15:4040/jobs/job?id\u003d8",
            "http://10.0.2.15:4040/jobs/job?id\u003d9"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1543842996726_1234569816",
      "id": "20181203-221636_1032559712",
      "dateCreated": "2018-12-03 22:16:36.726",
      "dateStarted": "2018-12-05 21:17:39.121",
      "dateFinished": "2018-12-05 21:17:42.127",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ntmpdf.registerTempTable(\"tmpdf\")",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:17:42.236",
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
            "data": "warning: there was one deprecation warning; re-run with -deprecation for details\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1543843629559_432661447",
      "id": "20181203-222709_1720499988",
      "dateCreated": "2018-12-03 22:27:09.559",
      "dateStarted": "2018-12-05 21:17:42.388",
      "dateFinished": "2018-12-05 21:17:43.581",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%md\n## 데이터 준비\n",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:17:43.586",
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
            "data": "\u003cdiv class\u003d\"markdown-body\"\u003e\n\u003ch2\u003e데이터 준비\u003c/h2\u003e\n\u003c/div\u003e"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1543844547867_-1748849838",
      "id": "20181203-224227_1791638852",
      "dateCreated": "2018-12-03 22:42:27.867",
      "dateStarted": "2018-12-05 21:17:43.693",
      "dateFinished": "2018-12-05 21:17:46.609",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval avgAge \u003d tmpdf.select(mean(\"Age\")).first()(0).asInstanceOf[Double]\ntmpdf \u003d tmpdf.na.fill(avgAge, Seq(\"Age\"))",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:17:46.692",
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
            "data": "avgAge: Double \u003d 29.69911764705882\ntmpdf: org.apache.spark.sql.Dataset[org.apache.spark.sql.Row] \u003d [PassengerId: int, Survived: int ... 10 more fields]\n"
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
      "jobName": "paragraph_1543844296600_-603110009",
      "id": "20181203-223816_708218890",
      "dateCreated": "2018-12-03 22:38:16.600",
      "dateStarted": "2018-12-05 21:17:46.843",
      "dateFinished": "2018-12-05 21:17:48.310",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ntmpdf.describe().show()",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:17:48.341",
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
            "data": "+-------+-----------------+-------------------+------------------+------------------+------------------+-------------------+-----------------+\n|summary|      PassengerId|           Survived|            Pclass|               Age|             SibSp|              Parch|             Fare|\n+-------+-----------------+-------------------+------------------+------------------+------------------+-------------------+-----------------+\n|  count|              891|                891|               891|               891|               891|                891|              891|\n|   mean|            446.0| 0.3838383838383838| 2.308641975308642|29.699117647058763|0.5230078563411896|0.38159371492704824| 32.2042079685746|\n| stddev|257.3538420152301|0.48659245426485753|0.8360712409770491|13.002015226002891|1.1027434322934315| 0.8060572211299488|49.69342859718089|\n|    min|                1|                  0|                 1|              0.42|                 0|                  0|              0.0|\n|    max|              891|                  1|                 3|              80.0|                 8|                  6|         512.3292|\n+-------+-----------------+-------------------+------------------+------------------+------------------+-------------------+-----------------+\n\n"
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
      "jobName": "paragraph_1543844629713_2083395157",
      "id": "20181203-224349_746794943",
      "dateCreated": "2018-12-03 22:43:49.713",
      "dateStarted": "2018-12-05 21:17:48.464",
      "dateFinished": "2018-12-05 21:17:49.454",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval toDouble \u003d sqlContext.udf.register(\"toDouble\", ((n : Int) \u003d\u003e {n.toDouble}))\nval df \u003d tmpdf.drop(\"Name\").drop(\"Cabin\").drop(\"Ticket\").drop(\"Embarked\").withColumn(\"Survived\", toDouble(tmpdf(\"Survived\")))",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:17:49.539",
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
            "data": "toDouble: org.apache.spark.sql.expressions.UserDefinedFunction \u003d UserDefinedFunction(\u003cfunction1\u003e,DoubleType,Some(List(IntegerType)))\ndf: org.apache.spark.sql.DataFrame \u003d [PassengerId: int, Survived: double ... 6 more fields]\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1543844673180_1705406310",
      "id": "20181203-224433_588776081",
      "dateCreated": "2018-12-03 22:44:33.180",
      "dateStarted": "2018-12-05 21:17:49.661",
      "dateFinished": "2018-12-05 21:17:51.287",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.show()",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:17:51.381",
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
            "data": "+-----------+--------+------+------+-----------------+-----+-----+-------+\n|PassengerId|Survived|Pclass|   Sex|              Age|SibSp|Parch|   Fare|\n+-----------+--------+------+------+-----------------+-----+-----+-------+\n|          1|     0.0|     3|  male|             22.0|    1|    0|   7.25|\n|          2|     1.0|     1|female|             38.0|    1|    0|71.2833|\n|          3|     1.0|     3|female|             26.0|    0|    0|  7.925|\n|          4|     1.0|     1|female|             35.0|    1|    0|   53.1|\n|          5|     0.0|     3|  male|             35.0|    0|    0|   8.05|\n|          6|     0.0|     3|  male|29.69911764705882|    0|    0| 8.4583|\n|          7|     0.0|     1|  male|             54.0|    0|    0|51.8625|\n|          8|     0.0|     3|  male|              2.0|    3|    1| 21.075|\n|          9|     1.0|     3|female|             27.0|    0|    2|11.1333|\n|         10|     1.0|     2|female|             14.0|    1|    0|30.0708|\n|         11|     1.0|     3|female|              4.0|    1|    1|   16.7|\n|         12|     1.0|     1|female|             58.0|    0|    0|  26.55|\n|         13|     0.0|     3|  male|             20.0|    0|    0|   8.05|\n|         14|     0.0|     3|  male|             39.0|    1|    5| 31.275|\n|         15|     0.0|     3|female|             14.0|    0|    0| 7.8542|\n|         16|     1.0|     2|female|             55.0|    0|    0|   16.0|\n|         17|     0.0|     3|  male|              2.0|    4|    1| 29.125|\n|         18|     1.0|     2|  male|29.69911764705882|    0|    0|   13.0|\n|         19|     0.0|     3|female|             31.0|    1|    0|   18.0|\n|         20|     1.0|     3|female|29.69911764705882|    0|    0|  7.225|\n+-----------+--------+------+------+-----------------+-----+-----+-------+\nonly showing top 20 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d12"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1543844873025_1470051400",
      "id": "20181203-224753_655917009",
      "dateCreated": "2018-12-03 22:47:53.025",
      "dateStarted": "2018-12-05 21:17:51.517",
      "dateFinished": "2018-12-05 21:17:52.363",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.ml.feature.StringIndexer\n\nval sexIndexer \u003d new StringIndexer().setInputCol(\"Sex\").setOutputCol(\"SexIndex\")",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:17:52.422",
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
            "data": "import org.apache.spark.ml.feature.StringIndexer\nsexIndexer: org.apache.spark.ml.feature.StringIndexer \u003d strIdx_97fafb262e77\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1543844881001_540656327",
      "id": "20181203-224801_1085423922",
      "dateCreated": "2018-12-03 22:48:01.001",
      "dateStarted": "2018-12-05 21:17:52.543",
      "dateFinished": "2018-12-05 21:17:53.531",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nvar demonModel \u003d sexIndexer.fit(df)\ndemonModel.transform(df).select(\"Sex\", \"SexIndex\").show(5)",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:17:53.531",
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
            "data": "demonModel: org.apache.spark.ml.feature.StringIndexerModel \u003d strIdx_97fafb262e77\n+------+--------+\n|   Sex|SexIndex|\n+------+--------+\n|  male|     0.0|\n|female|     1.0|\n|female|     1.0|\n|female|     1.0|\n|  male|     0.0|\n+------+--------+\nonly showing top 5 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d13",
            "http://10.0.2.15:4040/jobs/job?id\u003d14"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1543845003839_12441082",
      "id": "20181203-225003_619873208",
      "dateCreated": "2018-12-03 22:50:03.839",
      "dateStarted": "2018-12-05 21:17:53.681",
      "dateFinished": "2018-12-05 21:17:55.587",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.ml.feature.Bucketizer\n\nval fareSplits \u003d Array(0.0, 50.0, 100.0, 150.0, 200.0, Double.PositiveInfinity)\nval fareBucket \u003d new Bucketizer().setInputCol(\"Fare\").setOutputCol(\"FareBucket\").setSplits(fareSplits)",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:17:55.685",
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
            "data": "import org.apache.spark.ml.feature.Bucketizer\nfareSplits: Array[Double] \u003d Array(0.0, 50.0, 100.0, 150.0, 200.0, Infinity)\nfareBucket: org.apache.spark.ml.feature.Bucketizer \u003d bucketizer_9e1162f1014c\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1543929499831_-563543240",
      "id": "20181204-221819_1132019742",
      "dateCreated": "2018-12-04 22:18:19.831",
      "dateStarted": "2018-12-05 21:17:55.751",
      "dateFinished": "2018-12-05 21:17:57.060",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nfareBucket.transform(df).select(\"Fare\", \"FareBucket\").show(30)",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:17:57.156",
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
            "data": "+-------+----------+\n|   Fare|FareBucket|\n+-------+----------+\n|   7.25|       0.0|\n|71.2833|       1.0|\n|  7.925|       0.0|\n|   53.1|       1.0|\n|   8.05|       0.0|\n| 8.4583|       0.0|\n|51.8625|       1.0|\n| 21.075|       0.0|\n|11.1333|       0.0|\n|30.0708|       0.0|\n|   16.7|       0.0|\n|  26.55|       0.0|\n|   8.05|       0.0|\n| 31.275|       0.0|\n| 7.8542|       0.0|\n|   16.0|       0.0|\n| 29.125|       0.0|\n|   13.0|       0.0|\n|   18.0|       0.0|\n|  7.225|       0.0|\n|   26.0|       0.0|\n|   13.0|       0.0|\n| 8.0292|       0.0|\n|   35.5|       0.0|\n| 21.075|       0.0|\n|31.3875|       0.0|\n|  7.225|       0.0|\n|  263.0|       4.0|\n| 7.8792|       0.0|\n| 7.8958|       0.0|\n+-------+----------+\nonly showing top 30 rows\n\n"
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
      "jobName": "paragraph_1543929842825_640167030",
      "id": "20181204-222402_124996783",
      "dateCreated": "2018-12-04 22:24:02.825",
      "dateStarted": "2018-12-05 21:17:57.229",
      "dateFinished": "2018-12-05 21:17:58.117",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.ml.feature.VectorAssembler\n\nval assembler \u003d new VectorAssembler().setInputCols(Array(\"Pclass\", \"SexIndex\", \"Age\", \"SibSp\", \"Parch\", \"FareBucket\")).setOutputCol(\"tmpFeatures\")\n",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:31:11.394",
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
            "data": "import org.apache.spark.ml.feature.VectorAssembler\nassembler: org.apache.spark.ml.feature.VectorAssembler \u003d vecAssembler_95d643263f40\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1543929957807_-400793079",
      "id": "20181204-222557_650072894",
      "dateCreated": "2018-12-04 22:25:57.807",
      "dateStarted": "2018-12-05 21:31:11.460",
      "dateFinished": "2018-12-05 21:31:12.106",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.ml.feature.Normalizer\n\nval normalizer \u003d new Normalizer().setInputCol(\"tmpFeatures\").setOutputCol(\"features\")",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:31:12.156",
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
            "data": "import org.apache.spark.ml.feature.Normalizer\nnormalizer: org.apache.spark.ml.feature.Normalizer \u003d normalizer_a6489203dc29\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1543930041660_271128313",
      "id": "20181204-222721_1297452786",
      "dateCreated": "2018-12-04 22:27:21.660",
      "dateStarted": "2018-12-05 21:31:12.237",
      "dateFinished": "2018-12-05 21:31:13.109",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.ml.classification.LogisticRegression\n\nval logreg \u003d new LogisticRegression().setMaxIter(10)\nlogreg.setLabelCol(\"Survived\")",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:31:13.149",
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
            "data": "import org.apache.spark.ml.classification.LogisticRegression\nlogreg: org.apache.spark.ml.classification.LogisticRegression \u003d logreg_fb32e858e2ea\nres42: org.apache.spark.ml.classification.LogisticRegression \u003d logreg_fb32e858e2ea\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1543930108358_-687234513",
      "id": "20181204-222828_672478658",
      "dateCreated": "2018-12-04 22:28:28.358",
      "dateStarted": "2018-12-05 21:31:13.258",
      "dateFinished": "2018-12-05 21:31:14.026",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.ml.Pipeline\n\nval pipeline \u003d new Pipeline().setStages(Array(fareBucket, sexIndexer, assembler, normalizer, logreg))",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:31:14.051",
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
            "data": "import org.apache.spark.ml.Pipeline\npipeline: org.apache.spark.ml.Pipeline \u003d pipeline_f07691cd6975\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1543930260620_-1148895417",
      "id": "20181204-223100_453737508",
      "dateCreated": "2018-12-04 22:31:00.620",
      "dateStarted": "2018-12-05 21:31:14.217",
      "dateFinished": "2018-12-05 21:31:14.964",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval splits \u003d df.randomSplit(Array(0.7, 0.3), seed \u003d 9L)\nval train \u003d splits(0).cache()\nval test \u003d splits(1).cache",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:31:15.031",
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
            "data": "splits: Array[org.apache.spark.sql.Dataset[org.apache.spark.sql.Row]] \u003d Array([PassengerId: int, Survived: double ... 6 more fields], [PassengerId: int, Survived: double ... 6 more fields])\ntrain: org.apache.spark.sql.Dataset[org.apache.spark.sql.Row] \u003d [PassengerId: int, Survived: double ... 6 more fields]\ntest: org.apache.spark.sql.Dataset[org.apache.spark.sql.Row] \u003d [PassengerId: int, Survived: double ... 6 more fields]\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1543930477177_1478335947",
      "id": "20181204-223437_375029705",
      "dateCreated": "2018-12-04 22:34:37.177",
      "dateStarted": "2018-12-05 21:31:15.121",
      "dateFinished": "2018-12-05 21:31:16.035",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval model \u003d pipeline.fit(train)\nval result \u003d model.transform(test)",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:31:16.132",
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
            "data": "model: org.apache.spark.ml.PipelineModel \u003d pipeline_f07691cd6975\nresult: org.apache.spark.sql.DataFrame \u003d [PassengerId: int, Survived: double ... 13 more fields]\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d17",
            "http://10.0.2.15:4040/jobs/job?id\u003d18",
            "http://10.0.2.15:4040/jobs/job?id\u003d19",
            "http://10.0.2.15:4040/jobs/job?id\u003d20",
            "http://10.0.2.15:4040/jobs/job?id\u003d21",
            "http://10.0.2.15:4040/jobs/job?id\u003d22",
            "http://10.0.2.15:4040/jobs/job?id\u003d23",
            "http://10.0.2.15:4040/jobs/job?id\u003d24",
            "http://10.0.2.15:4040/jobs/job?id\u003d25",
            "http://10.0.2.15:4040/jobs/job?id\u003d26",
            "http://10.0.2.15:4040/jobs/job?id\u003d27",
            "http://10.0.2.15:4040/jobs/job?id\u003d28",
            "http://10.0.2.15:4040/jobs/job?id\u003d29",
            "http://10.0.2.15:4040/jobs/job?id\u003d30"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1543930592613_820007235",
      "id": "20181204-223632_108107590",
      "dateCreated": "2018-12-04 22:36:32.613",
      "dateStarted": "2018-12-05 21:31:16.212",
      "dateFinished": "2018-12-05 21:31:18.766",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.mllib.evaluation.BinaryClassificationMetrics\n\nval predictionAndLabel \u003d result.select(\"prediction\", \"Survived\").map(row \u003d\u003e (row.get(0).asInstanceOf[(Double, Double)])).rdd\nval metrics \u003d new BinaryClassificationMetrics(predictionAndLabel)\n\nprintln(\"Area Under ROC \u003d ${metrics.areaUnderROC()}\\n\")",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:52:05.431",
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
            "data": "import org.apache.spark.mllib.evaluation.BinaryClassificationMetrics\npredictionAndLabel: org.apache.spark.rdd.RDD[(Double, Double)] \u003d MapPartitionsRDD[153] at rdd at \u003cconsole\u003e:86\nmetrics: org.apache.spark.mllib.evaluation.BinaryClassificationMetrics \u003d org.apache.spark.mllib.evaluation.BinaryClassificationMetrics@2ab100cc\nArea Under ROC \u003d ${metrics.areaUnderROC()}\n\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544013130725_-914701213",
      "id": "20181205-213210_656188249",
      "dateCreated": "2018-12-05 21:32:10.725",
      "dateStarted": "2018-12-05 21:52:05.484",
      "dateFinished": "2018-12-05 21:52:06.674",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nvar model \u003d pipeline.fit(df)",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:56:57.174",
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
            "data": "model: org.apache.spark.ml.PipelineModel \u003d pipeline_f07691cd6975\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d43",
            "http://10.0.2.15:4040/jobs/job?id\u003d44",
            "http://10.0.2.15:4040/jobs/job?id\u003d45",
            "http://10.0.2.15:4040/jobs/job?id\u003d46",
            "http://10.0.2.15:4040/jobs/job?id\u003d47",
            "http://10.0.2.15:4040/jobs/job?id\u003d48",
            "http://10.0.2.15:4040/jobs/job?id\u003d49",
            "http://10.0.2.15:4040/jobs/job?id\u003d50",
            "http://10.0.2.15:4040/jobs/job?id\u003d51",
            "http://10.0.2.15:4040/jobs/job?id\u003d52",
            "http://10.0.2.15:4040/jobs/job?id\u003d53",
            "http://10.0.2.15:4040/jobs/job?id\u003d54",
            "http://10.0.2.15:4040/jobs/job?id\u003d55",
            "http://10.0.2.15:4040/jobs/job?id\u003d56"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544014491751_1663098344",
      "id": "20181205-215451_155516742",
      "dateCreated": "2018-12-05 21:54:51.751",
      "dateStarted": "2018-12-05 21:56:57.212",
      "dateFinished": "2018-12-05 21:56:58.763",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nvar testdf \u003d sqlContext.read.format(\"com.databricks.spark.csv\").\noption(\"header\", \"true\").\noption(\"inferSchema\", \"true\").\nload(\"/home/dskangu/다운로드/test.csv\").\ntoDF().\ncache()\n",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:58:21.621",
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
            "data": "testdf: org.apache.spark.sql.Dataset[org.apache.spark.sql.Row] \u003d [PassengerId: int, Pclass: int ... 9 more fields]\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d57",
            "http://10.0.2.15:4040/jobs/job?id\u003d58",
            "http://10.0.2.15:4040/jobs/job?id\u003d59"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544014617174_-1001282779",
      "id": "20181205-215657_1703659463",
      "dateCreated": "2018-12-05 21:56:57.174",
      "dateStarted": "2018-12-05 21:58:21.650",
      "dateFinished": "2018-12-05 21:58:22.197",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ntestdf.describe().show()",
      "user": "dskang",
      "dateUpdated": "2018-12-05 21:59:25.934",
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
            "data": "+-------+------------------+------------------+------------------+------------------+------------------+------------------+\n|summary|       PassengerId|            Pclass|               Age|             SibSp|             Parch|              Fare|\n+-------+------------------+------------------+------------------+------------------+------------------+------------------+\n|  count|               418|               418|               332|               418|               418|               417|\n|   mean|            1100.5|2.2655502392344498|30.272590361445783|0.4473684210526316|0.3923444976076555|  35.6271884892086|\n| stddev|120.81045760473994|0.8418375519640503|14.181209235624424|0.8967595611217135|0.9814288785371694|55.907576179973844|\n|    min|               892|                 1|              0.17|                 0|                 0|               0.0|\n|    max|              1309|                 3|              76.0|                 8|                 9|          512.3292|\n+-------+------------------+------------------+------------------+------------------+------------------+------------------+\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d61"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544014692007_1960465926",
      "id": "20181205-215812_746179036",
      "dateCreated": "2018-12-05 21:58:12.007",
      "dateStarted": "2018-12-05 21:59:25.968",
      "dateFinished": "2018-12-05 21:59:26.656",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ntestdf \u003d testdf.withColumn(\"Survived\", toDouble(testdf(\"PassengerId\"))).drop(\"Name\").drop(\"Ticket\").drop(\"Cabin\").drop(\"Embarked\")\ntestdf.show",
      "user": "dskang",
      "dateUpdated": "2018-12-05 22:00:16.230",
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
            "data": "testdf: org.apache.spark.sql.Dataset[org.apache.spark.sql.Row] \u003d [PassengerId: int, Pclass: int ... 6 more fields]\n+-----------+------+------+----+-----+-----+-------+--------+\n|PassengerId|Pclass|   Sex| Age|SibSp|Parch|   Fare|Survived|\n+-----------+------+------+----+-----+-----+-------+--------+\n|        892|     3|  male|34.5|    0|    0| 7.8292|   892.0|\n|        893|     3|female|47.0|    1|    0|    7.0|   893.0|\n|        894|     2|  male|62.0|    0|    0| 9.6875|   894.0|\n|        895|     3|  male|27.0|    0|    0| 8.6625|   895.0|\n|        896|     3|female|22.0|    1|    1|12.2875|   896.0|\n|        897|     3|  male|14.0|    0|    0|  9.225|   897.0|\n|        898|     3|female|30.0|    0|    0| 7.6292|   898.0|\n|        899|     2|  male|26.0|    1|    1|   29.0|   899.0|\n|        900|     3|female|18.0|    0|    0| 7.2292|   900.0|\n|        901|     3|  male|21.0|    2|    0|  24.15|   901.0|\n|        902|     3|  male|null|    0|    0| 7.8958|   902.0|\n|        903|     1|  male|46.0|    0|    0|   26.0|   903.0|\n|        904|     1|female|23.0|    1|    0|82.2667|   904.0|\n|        905|     2|  male|63.0|    1|    0|   26.0|   905.0|\n|        906|     1|female|47.0|    1|    0| 61.175|   906.0|\n|        907|     2|female|24.0|    1|    0|27.7208|   907.0|\n|        908|     2|  male|35.0|    0|    0|  12.35|   908.0|\n|        909|     3|  male|21.0|    0|    0|  7.225|   909.0|\n|        910|     3|female|27.0|    1|    0|  7.925|   910.0|\n|        911|     3|female|45.0|    0|    0|  7.225|   911.0|\n+-----------+------+------+----+-----+-----+-------+--------+\nonly showing top 20 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d62"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544014711220_-421582419",
      "id": "20181205-215831_1104018236",
      "dateCreated": "2018-12-05 21:58:31.220",
      "dateStarted": "2018-12-05 22:00:16.275",
      "dateFinished": "2018-12-05 22:00:16.888",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nvar testAvgAge \u003d testdf.select(mean(\"Age\")).first()(0).asInstanceOf[Double]\ntestdf \u003d testdf.na.fill(testAvgAge, Seq(\"Age\"))",
      "user": "dskang",
      "dateUpdated": "2018-12-05 22:01:57.061",
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
            "data": "testAvgAge: Double \u003d 30.272590361445783\ntestdf: org.apache.spark.sql.Dataset[org.apache.spark.sql.Row] \u003d [PassengerId: int, Pclass: int ... 6 more fields]\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d65"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544014816230_1833859759",
      "id": "20181205-220016_938065416",
      "dateCreated": "2018-12-05 22:00:16.230",
      "dateStarted": "2018-12-05 22:01:57.117",
      "dateFinished": "2018-12-05 22:01:57.920",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nvar testAvgFare \u003d testdf.select(mean(\"Fare\")).first()(0).asInstanceOf[Double]\ntestdf \u003d testdf.na.fill(testAvgFare, Seq(\"Fare\"))",
      "user": "dskang",
      "dateUpdated": "2018-12-05 22:03:09.695",
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
            "data": "testAvgFare: Double \u003d 35.6271884892086\ntestdf: org.apache.spark.sql.Dataset[org.apache.spark.sql.Row] \u003d [PassengerId: int, Pclass: int ... 6 more fields]\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d66"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544014901990_-1001573762",
      "id": "20181205-220141_284114095",
      "dateCreated": "2018-12-05 22:01:41.991",
      "dateStarted": "2018-12-05 22:03:09.747",
      "dateFinished": "2018-12-05 22:03:10.620",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ntestdf.describe().show()",
      "user": "dskang",
      "dateUpdated": "2018-12-05 22:03:51.142",
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
            "data": "+-------+------------------+------------------+------------------+------------------+------------------+------------------+------------------+\n|summary|       PassengerId|            Pclass|               Age|             SibSp|             Parch|              Fare|          Survived|\n+-------+------------------+------------------+------------------+------------------+------------------+------------------+------------------+\n|  count|               418|               418|               418|               418|               418|               418|               418|\n|   mean|            1100.5|2.2655502392344498|30.272590361445815|0.4473684210526316|0.3923444976076555|  35.6271884892086|            1100.5|\n| stddev|120.81045760473994|0.8418375519640503|12.634534168325061|0.8967595611217135|0.9814288785371694|55.840500479541056|120.81045760473994|\n|    min|               892|                 1|              0.17|                 0|                 0|               0.0|             892.0|\n|    max|              1309|                 3|              76.0|                 8|                 9|          512.3292|            1309.0|\n+-------+------------------+------------------+------------------+------------------+------------------+------------------+------------------+\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d67"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544014998862_-37783908",
      "id": "20181205-220318_1825410243",
      "dateCreated": "2018-12-05 22:03:18.862",
      "dateStarted": "2018-12-05 22:03:51.188",
      "dateFinished": "2018-12-05 22:03:52.064",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval submit_result \u003d model.transform(testdf)",
      "user": "dskang",
      "dateUpdated": "2018-12-05 22:04:12.462",
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
            "data": "submit_result: org.apache.spark.sql.DataFrame \u003d [PassengerId: int, Pclass: int ... 13 more fields]\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544015031142_549107844",
      "id": "20181205-220351_897490816",
      "dateCreated": "2018-12-05 22:03:51.142",
      "dateStarted": "2018-12-05 22:04:12.509",
      "dateFinished": "2018-12-05 22:04:13.086",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nsubmit_result.select(\"PassengerId\", \"prediction\").show(20)",
      "user": "dskang",
      "dateUpdated": "2018-12-05 22:04:42.895",
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
            "data": "+-----------+----------+\n|PassengerId|prediction|\n+-----------+----------+\n|        892|       0.0|\n|        893|       0.0|\n|        894|       0.0|\n|        895|       0.0|\n|        896|       1.0|\n|        897|       0.0|\n|        898|       1.0|\n|        899|       0.0|\n|        900|       1.0|\n|        901|       0.0|\n|        902|       0.0|\n|        903|       0.0|\n|        904|       1.0|\n|        905|       0.0|\n|        906|       0.0|\n|        907|       1.0|\n|        908|       0.0|\n|        909|       0.0|\n|        910|       0.0|\n|        911|       0.0|\n+-----------+----------+\nonly showing top 20 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d68"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544015052462_1101009539",
      "id": "20181205-220412_740093131",
      "dateCreated": "2018-12-05 22:04:12.462",
      "dateStarted": "2018-12-05 22:04:42.932",
      "dateFinished": "2018-12-05 22:04:43.537",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval testRdd \u003d submit_result.select(\"PassengerId\", \"prediction\").rdd",
      "user": "dskang",
      "dateUpdated": "2018-12-05 22:05:10.478",
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
            "data": "testRdd: org.apache.spark.rdd.RDD[org.apache.spark.sql.Row] \u003d MapPartitionsRDD[257] at rdd at \u003cconsole\u003e:82\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544015079687_-948426969",
      "id": "20181205-220439_1696826721",
      "dateCreated": "2018-12-05 22:04:39.687",
      "dateStarted": "2018-12-05 22:05:10.518",
      "dateFinished": "2018-12-05 22:05:10.942",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval header \u003d sc.parallelize(Array(\"passengerId,Survived\"))\nval body \u003d testRdd.map(row \u003d\u003e row(0).asInstanceOf[Int] + \",\" + row(1).asInstanceOf[Double].toInt)",
      "user": "dskang",
      "dateUpdated": "2018-12-05 22:06:13.964",
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
            "data": "header: org.apache.spark.rdd.RDD[String] \u003d ParallelCollectionRDD[258] at parallelize at \u003cconsole\u003e:50\nbody: org.apache.spark.rdd.RDD[String] \u003d MapPartitionsRDD[259] at map at \u003cconsole\u003e:84\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544015110478_527560876",
      "id": "20181205-220510_107541302",
      "dateCreated": "2018-12-05 22:05:10.479",
      "dateStarted": "2018-12-05 22:06:14.012",
      "dateFinished": "2018-12-05 22:06:14.842",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nheader.union(body).saveAsTextFile(\"home/dskangu/다운로드/result.csv\")",
      "user": "dskang",
      "dateUpdated": "2018-12-05 22:11:25.762",
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
            "data": "org.apache.hadoop.mapred.FileAlreadyExistsException: Output directory file:/home/dskangu/home/dskangu/다운로드/result.csv already exists\n  at org.apache.hadoop.mapred.FileOutputFormat.checkOutputSpecs(FileOutputFormat.java:131)\n  at org.apache.spark.rdd.PairRDDFunctions$$anonfun$saveAsHadoopDataset$1.apply$mcV$sp(PairRDDFunctions.scala:1184)\n  at org.apache.spark.rdd.PairRDDFunctions$$anonfun$saveAsHadoopDataset$1.apply(PairRDDFunctions.scala:1161)\n  at org.apache.spark.rdd.PairRDDFunctions$$anonfun$saveAsHadoopDataset$1.apply(PairRDDFunctions.scala:1161)\n  at org.apache.spark.rdd.RDDOperationScope$.withScope(RDDOperationScope.scala:151)\n  at org.apache.spark.rdd.RDDOperationScope$.withScope(RDDOperationScope.scala:112)\n  at org.apache.spark.rdd.RDD.withScope(RDD.scala:358)\n  at org.apache.spark.rdd.PairRDDFunctions.saveAsHadoopDataset(PairRDDFunctions.scala:1161)\n  at org.apache.spark.rdd.PairRDDFunctions$$anonfun$saveAsHadoopFile$4.apply$mcV$sp(PairRDDFunctions.scala:1064)\n  at org.apache.spark.rdd.PairRDDFunctions$$anonfun$saveAsHadoopFile$4.apply(PairRDDFunctions.scala:1030)\n  at org.apache.spark.rdd.PairRDDFunctions$$anonfun$saveAsHadoopFile$4.apply(PairRDDFunctions.scala:1030)\n  at org.apache.spark.rdd.RDDOperationScope$.withScope(RDDOperationScope.scala:151)\n  at org.apache.spark.rdd.RDDOperationScope$.withScope(RDDOperationScope.scala:112)\n  at org.apache.spark.rdd.RDD.withScope(RDD.scala:358)\n  at org.apache.spark.rdd.PairRDDFunctions.saveAsHadoopFile(PairRDDFunctions.scala:1030)\n  at org.apache.spark.rdd.PairRDDFunctions$$anonfun$saveAsHadoopFile$1.apply$mcV$sp(PairRDDFunctions.scala:956)\n  at org.apache.spark.rdd.PairRDDFunctions$$anonfun$saveAsHadoopFile$1.apply(PairRDDFunctions.scala:956)\n  at org.apache.spark.rdd.PairRDDFunctions$$anonfun$saveAsHadoopFile$1.apply(PairRDDFunctions.scala:956)\n  at org.apache.spark.rdd.RDDOperationScope$.withScope(RDDOperationScope.scala:151)\n  at org.apache.spark.rdd.RDDOperationScope$.withScope(RDDOperationScope.scala:112)\n  at org.apache.spark.rdd.RDD.withScope(RDD.scala:358)\n  at org.apache.spark.rdd.PairRDDFunctions.saveAsHadoopFile(PairRDDFunctions.scala:955)\n  at org.apache.spark.rdd.RDD$$anonfun$saveAsTextFile$1.apply$mcV$sp(RDD.scala:1459)\n  at org.apache.spark.rdd.RDD$$anonfun$saveAsTextFile$1.apply(RDD.scala:1438)\n  at org.apache.spark.rdd.RDD$$anonfun$saveAsTextFile$1.apply(RDD.scala:1438)\n  at org.apache.spark.rdd.RDDOperationScope$.withScope(RDDOperationScope.scala:151)\n  at org.apache.spark.rdd.RDDOperationScope$.withScope(RDDOperationScope.scala:112)\n  at org.apache.spark.rdd.RDD.withScope(RDD.scala:358)\n  at org.apache.spark.rdd.RDD.saveAsTextFile(RDD.scala:1438)\n  ... 56 elided\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544015173964_-1801933017",
      "id": "20181205-220613_1187973146",
      "dateCreated": "2018-12-05 22:06:13.964",
      "dateStarted": "2018-12-05 22:11:25.826",
      "dateFinished": "2018-12-05 22:11:26.298",
      "status": "ERROR",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ntestRdd.map(row \u003d\u003e row(0).asInstanceOf[Int] + \",\" + row(1).asInstanceOf[Double].toInt).foreach(println)",
      "user": "dskang",
      "dateUpdated": "2018-12-05 22:07:53.735",
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
        "msg": []
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "SPARK JOB",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "http://10.0.2.15:4040/jobs/job?id\u003d70"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544015203175_1856464070",
      "id": "20181205-220643_1164797055",
      "dateCreated": "2018-12-05 22:06:43.175",
      "dateStarted": "2018-12-05 22:07:53.793",
      "dateFinished": "2018-12-05 22:07:54.403",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2018-12-05 22:07:53.736",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1544015273735_-1480774711",
      "id": "20181205-220753_305556212",
      "dateCreated": "2018-12-05 22:07:53.735",
      "status": "READY",
      "progressUpdateIntervalMs": 500
    }
  ],
  "name": "TitanicML",
  "id": "2DWXBEBHP",
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