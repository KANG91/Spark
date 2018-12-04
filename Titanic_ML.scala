{
  "paragraphs": [
    {
      "text": "%spark\nval trainData \u003d \"/home/dskangu/다운로드/train.csv\"",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:16:39.517",
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
      "dateStarted": "2018-12-04 22:16:39.872",
      "dateFinished": "2018-12-04 22:17:01.536",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval rawData \u003d sc.textFile(trainData)\nval columns \u003d rawData.first().split(\",\")",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:17:01.595",
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
      "dateStarted": "2018-12-04 22:17:01.959",
      "dateFinished": "2018-12-04 22:17:05.818",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval sqlContext \u003d new org.apache.spark.sql.SQLContext(sc)\nimport org.apache.spark.sql.functions._\nimport sqlContext.implicits._",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:17:05.897",
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
            "data": "warning: there was one deprecation warning; re-run with -deprecation for details\nsqlContext: org.apache.spark.sql.SQLContext \u003d org.apache.spark.sql.SQLContext@43e99fc2\nimport org.apache.spark.sql.functions._\nimport sqlContext.implicits._\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1543800554020_-2021673250",
      "id": "20181203-102914_1912389649",
      "dateCreated": "2018-12-03 10:29:14.020",
      "dateStarted": "2018-12-04 22:17:06.236",
      "dateFinished": "2018-12-04 22:17:08.428",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nvar tmpdf \u003d sqlContext.read.format(\"com.databricks.spark.csv\").\noption(\"header\", \"true\").\noption(\"inferSchema\", \"true\").\nload(trainData).\ntoDF(columns : _*).\ncache()",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:17:08.451",
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
      "dateStarted": "2018-12-04 22:17:08.637",
      "dateFinished": "2018-12-04 22:17:12.592",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ntmpdf.printSchema()",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:17:12.663",
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
      "dateStarted": "2018-12-04 22:17:12.912",
      "dateFinished": "2018-12-04 22:17:13.602",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ntmpdf.show(20)",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:17:13.605",
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
      "dateStarted": "2018-12-04 22:17:13.804",
      "dateFinished": "2018-12-04 22:17:15.101",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n\ntmpdf.describe().show()",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:17:15.197",
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
      "dateStarted": "2018-12-04 22:17:15.315",
      "dateFinished": "2018-12-04 22:17:17.158",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ntmpdf.filter(tmpdf(\"Sex\") \u003d\u003d\u003d \"male\").count() + tmpdf.filter(tmpdf(\"Sex\") \u003d\u003d\u003d \"female\").count()",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:17:17.224",
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
      "dateStarted": "2018-12-04 22:17:17.388",
      "dateFinished": "2018-12-04 22:17:18.495",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ntmpdf.select(\"Fare\").orderBy(asc(\"Fare\")).map(row \u003d\u003e row(0).asInstanceOf[Double]).collect()",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:17:18.576",
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
      "dateStarted": "2018-12-04 22:17:18.685",
      "dateFinished": "2018-12-04 22:17:21.361",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ntmpdf.registerTempTable(\"tmpdf\")",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:17:21.400",
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
      "dateStarted": "2018-12-04 22:17:21.584",
      "dateFinished": "2018-12-04 22:17:22.524",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%md\n## 데이터 준비\n",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:17:22.600",
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
      "dateStarted": "2018-12-04 22:17:22.760",
      "dateFinished": "2018-12-04 22:17:24.542",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval avgAge \u003d tmpdf.select(mean(\"Age\")).first()(0).asInstanceOf[Double]\ntmpdf \u003d tmpdf.na.fill(avgAge, Seq(\"Age\"))",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:17:24.548",
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
      "dateStarted": "2018-12-04 22:17:24.665",
      "dateFinished": "2018-12-04 22:17:26.185",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ntmpdf.describe().show()",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:17:26.272",
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
      "dateStarted": "2018-12-04 22:17:26.360",
      "dateFinished": "2018-12-04 22:17:27.448",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval toDouble \u003d sqlContext.udf.register(\"toDouble\", ((n : Int) \u003d\u003e {n.toDouble}))\nval df \u003d tmpdf.drop(\"Name\").drop(\"Cabin\").drop(\"Ticket\").drop(\"Embarked\").withColumn(\"Survived\", toDouble(tmpdf(\"Survived\")))",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:17:27.449",
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
      "dateStarted": "2018-12-04 22:17:27.529",
      "dateFinished": "2018-12-04 22:17:29.008",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.show()",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:17:29.017",
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
      "dateStarted": "2018-12-04 22:17:29.108",
      "dateFinished": "2018-12-04 22:17:29.934",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.ml.feature.StringIndexer\n\nval sexIndexer \u003d new StringIndexer().setInputCol(\"Sex\").setOutputCol(\"SexIndex\")",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:17:29.994",
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
            "data": "import org.apache.spark.ml.feature.StringIndexer\nsexIndexer: org.apache.spark.ml.feature.StringIndexer \u003d strIdx_ede5a71f0493\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1543844881001_540656327",
      "id": "20181203-224801_1085423922",
      "dateCreated": "2018-12-03 22:48:01.001",
      "dateStarted": "2018-12-04 22:17:30.066",
      "dateFinished": "2018-12-04 22:17:30.744",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nvar demonModel \u003d sexIndexer.fit(df)\ndemonModel.transform(df).select(\"Sex\", \"SexIndex\").show(5)",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:19:33.711",
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
            "data": "demonModel: org.apache.spark.ml.feature.StringIndexerModel \u003d strIdx_ede5a71f0493\n+------+--------+\n|   Sex|SexIndex|\n+------+--------+\n|  male|     0.0|\n|female|     1.0|\n|female|     1.0|\n|female|     1.0|\n|  male|     0.0|\n+------+--------+\nonly showing top 5 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d15",
            "http://10.0.2.15:4040/jobs/job?id\u003d16"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1543845003839_12441082",
      "id": "20181203-225003_619873208",
      "dateCreated": "2018-12-03 22:50:03.839",
      "dateStarted": "2018-12-04 22:19:33.755",
      "dateFinished": "2018-12-04 22:19:35.383",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.ml.feature.Bucketizer\n\nval fareSplits \u003d Array(0.0, 50.0, 100.0, 150.0, 200.0, Double.PositiveInfinity)\nval fareBucket \u003d new Bucketizer().setInputCol(\"Fare\").setOutputCol(\"FareBucket\").setSplits(fareSplits)",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:40:14.319",
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
            "data": "import org.apache.spark.ml.feature.Bucketizer\nfareSplits: Array[Double] \u003d Array(0.0, 50.0, 100.0, 150.0, 200.0, Infinity)\nfareBucket: org.apache.spark.ml.feature.Bucketizer \u003d bucketizer_d5073e5559c2\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1543929499831_-563543240",
      "id": "20181204-221819_1132019742",
      "dateCreated": "2018-12-04 22:18:19.831",
      "dateStarted": "2018-12-04 22:40:14.381",
      "dateFinished": "2018-12-04 22:40:15.513",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nfareBucket.transform(df).select(\"Fare\", \"FareBucket\").show(30)",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:40:15.590",
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
            "http://10.0.2.15:4040/jobs/job?id\u003d21"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1543929842825_640167030",
      "id": "20181204-222402_124996783",
      "dateCreated": "2018-12-04 22:24:02.825",
      "dateStarted": "2018-12-04 22:40:15.668",
      "dateFinished": "2018-12-04 22:40:16.493",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.ml.feature.VectorAssembler\n\nval assembler \u003d new VectorAssembler().setInputCols(Array(\"Pclass\", \"SexIndex\", \"Age\", \"SibSp\", \"Parch\", \"FareBucekt\")).setOutputCol(\"tmpFeatures\")\n",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:40:16.559",
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
            "data": "import org.apache.spark.ml.feature.VectorAssembler\nassembler: org.apache.spark.ml.feature.VectorAssembler \u003d vecAssembler_e51b2f517330\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1543929957807_-400793079",
      "id": "20181204-222557_650072894",
      "dateCreated": "2018-12-04 22:25:57.807",
      "dateStarted": "2018-12-04 22:40:16.654",
      "dateFinished": "2018-12-04 22:40:17.436",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.ml.feature.Normalizer\n\nval normalizer \u003d new Normalizer().setInputCol(\"tmpFeatures\").setOutputCol(\"features\")",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:40:17.451",
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
            "data": "import org.apache.spark.ml.feature.Normalizer\nnormalizer: org.apache.spark.ml.feature.Normalizer \u003d normalizer_604d769cec3a\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1543930041660_271128313",
      "id": "20181204-222721_1297452786",
      "dateCreated": "2018-12-04 22:27:21.660",
      "dateStarted": "2018-12-04 22:40:17.572",
      "dateFinished": "2018-12-04 22:40:18.173",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.ml.classification.LogisticRegression\n\nval logreg \u003d new LogisticRegression().setMaxIter(10)\nlogreg.setLabelCol(\"Survived\")",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:40:18.263",
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
            "data": "import org.apache.spark.ml.classification.LogisticRegression\nlogreg: org.apache.spark.ml.classification.LogisticRegression \u003d logreg_8061469527e3\nres76: org.apache.spark.ml.classification.LogisticRegression \u003d logreg_8061469527e3\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1543930108358_-687234513",
      "id": "20181204-222828_672478658",
      "dateCreated": "2018-12-04 22:28:28.358",
      "dateStarted": "2018-12-04 22:40:18.327",
      "dateFinished": "2018-12-04 22:40:19.275",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.ml.Pipeline\n\nval pipeline \u003d new Pipeline().setStages(Array(fareBucket, sexIndexer, assembler, normalizer, logreg))",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:40:19.333",
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
            "data": "import org.apache.spark.ml.Pipeline\npipeline: org.apache.spark.ml.Pipeline \u003d pipeline_b0f034907fe2\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1543930260620_-1148895417",
      "id": "20181204-223100_453737508",
      "dateCreated": "2018-12-04 22:31:00.620",
      "dateStarted": "2018-12-04 22:40:19.384",
      "dateFinished": "2018-12-04 22:40:20.048",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval splits \u003d df.randomSplit(Array(0.7, 0.3), seed \u003d 9L)\nval train \u003d splits(0).cache()\nval test \u003d splits(1).cache",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:40:20.087",
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
      "dateStarted": "2018-12-04 22:40:20.159",
      "dateFinished": "2018-12-04 22:40:20.938",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval model \u003d pipeline.fit(train)\nval result \u003d model.transform(test)",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:40:20.967",
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
            "data": "java.lang.IllegalArgumentException: Field \"FareBucekt\" does not exist.\n  at org.apache.spark.sql.types.StructType$$anonfun$apply$1.apply(StructType.scala:228)\n  at org.apache.spark.sql.types.StructType$$anonfun$apply$1.apply(StructType.scala:228)\n  at scala.collection.MapLike$class.getOrElse(MapLike.scala:128)\n  at scala.collection.AbstractMap.getOrElse(Map.scala:59)\n  at org.apache.spark.sql.types.StructType.apply(StructType.scala:227)\n  at org.apache.spark.ml.feature.VectorAssembler$$anonfun$5.apply(VectorAssembler.scala:116)\n  at org.apache.spark.ml.feature.VectorAssembler$$anonfun$5.apply(VectorAssembler.scala:116)\n  at scala.collection.TraversableLike$$anonfun$map$1.apply(TraversableLike.scala:234)\n  at scala.collection.TraversableLike$$anonfun$map$1.apply(TraversableLike.scala:234)\n  at scala.collection.IndexedSeqOptimized$class.foreach(IndexedSeqOptimized.scala:33)\n  at scala.collection.mutable.ArrayOps$ofRef.foreach(ArrayOps.scala:186)\n  at scala.collection.TraversableLike$class.map(TraversableLike.scala:234)\n  at scala.collection.mutable.ArrayOps$ofRef.map(ArrayOps.scala:186)\n  at org.apache.spark.ml.feature.VectorAssembler.transformSchema(VectorAssembler.scala:116)\n  at org.apache.spark.ml.Pipeline$$anonfun$transformSchema$4.apply(Pipeline.scala:180)\n  at org.apache.spark.ml.Pipeline$$anonfun$transformSchema$4.apply(Pipeline.scala:180)\n  at scala.collection.IndexedSeqOptimized$class.foldl(IndexedSeqOptimized.scala:57)\n  at scala.collection.IndexedSeqOptimized$class.foldLeft(IndexedSeqOptimized.scala:66)\n  at scala.collection.mutable.ArrayOps$ofRef.foldLeft(ArrayOps.scala:186)\n  at org.apache.spark.ml.Pipeline.transformSchema(Pipeline.scala:180)\n  at org.apache.spark.ml.PipelineStage.transformSchema(Pipeline.scala:70)\n  at org.apache.spark.ml.Pipeline.fit(Pipeline.scala:132)\n  ... 56 elided\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1543930592613_820007235",
      "id": "20181204-223632_108107590",
      "dateCreated": "2018-12-04 22:36:32.613",
      "dateStarted": "2018-12-04 22:40:21.001",
      "dateFinished": "2018-12-04 22:40:21.434",
      "status": "ERROR",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2018-12-04 22:36:47.831",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1543930607831_1296045766",
      "id": "20181204-223647_1919775528",
      "dateCreated": "2018-12-04 22:36:47.831",
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