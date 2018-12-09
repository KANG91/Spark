{
  "paragraphs": [
    {
      "text": "%md\n#### Chapter 4. 구조적 API 개요",
      "user": "dskang",
      "dateUpdated": "2018-12-09 16:11:34.880",
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
            "data": "\u003cdiv class\u003d\"markdown-body\"\u003e\n\u003ch4\u003eChapter 4. 구조적 API 개요\u003c/h4\u003e\n\u003c/div\u003e"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544339481149_-332466945",
      "id": "20181209-161121_1638530692",
      "dateCreated": "2018-12-09 16:11:21.149",
      "dateStarted": "2018-12-09 16:11:34.896",
      "dateFinished": "2018-12-09 16:11:34.947",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval df \u003d spark.range(500).toDF(\"number\")\ndf.select(df.col(\"number\") + 10) // 스파크에서 덧셈 연산이 수행되는 이유는 스파크가 지원하는 언어를 이용해 작성된 표현식을 카탈리스트 엔진에서 스파크의 데이터 타입을 변환해 명령을 처리하기 때문..??",
      "user": "dskang",
      "dateUpdated": "2018-12-09 16:17:52.248",
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
            "data": "df: org.apache.spark.sql.DataFrame \u003d [number: bigint]\nres187: org.apache.spark.sql.DataFrame \u003d [(number + 10): bigint]\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544339476002_-220217831",
      "id": "20181209-161116_882271738",
      "dateCreated": "2018-12-09 16:11:16.002",
      "dateStarted": "2018-12-09 16:17:18.087",
      "dateFinished": "2018-12-09 16:17:19.873",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//구조적 API : DataFrame(비타입형), Dataset(타입형)\n// Dataset은 JVM 기반의 언어인 스칼라와 자바에서만 지원.\n// DataFrame 사용 시, 스파크의 최적화된 내부 포멧이 사용 가능함.\n\nspark.range(2).toDF().collect()",
      "user": "dskang",
      "dateUpdated": "2018-12-09 16:20:32.358",
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
            "data": "res192: Array[org.apache.spark.sql.Row] \u003d Array([0], [1])\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d7819"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544339838062_-1231374775",
      "id": "20181209-161718_1756988699",
      "dateCreated": "2018-12-09 16:17:18.062",
      "dateStarted": "2018-12-09 16:20:32.398",
      "dateFinished": "2018-12-09 16:20:34.128",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//스파크 데이터 타입 확인\nimport org.apache.spark.sql.types._\nval b \u003d ByteType",
      "user": "dskang",
      "dateUpdated": "2018-12-09 16:21:21.053",
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
            "data": "import org.apache.spark.sql.types._\nb: org.apache.spark.sql.types.ByteType.type \u003d ByteType\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544340032358_1967944319",
      "id": "20181209-162032_651397322",
      "dateCreated": "2018-12-09 16:20:32.358",
      "dateStarted": "2018-12-09 16:21:21.062",
      "dateFinished": "2018-12-09 16:21:22.347",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%md\n#### Chapter 5. 구조적 API 기본 연산\n",
      "user": "dskang",
      "dateUpdated": "2018-12-09 16:28:09.694",
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
            "data": "\u003cdiv class\u003d\"markdown-body\"\u003e\n\u003ch4\u003eChapter 5. 구조적 API 기본 연산\u003c/h4\u003e\n\u003c/div\u003e"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544340471461_1087329096",
      "id": "20181209-162751_472419680",
      "dateCreated": "2018-12-09 16:27:51.461",
      "dateStarted": "2018-12-09 16:28:09.704",
      "dateFinished": "2018-12-09 16:28:09.713",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//DataFrame 생성\nval df \u003d spark.read.format(\"json\").load(\"/home/dskangu/git_KANG91/Spark-The-Definitive-Guide/data/flight-data/json/2015-summary.json\")\n",
      "user": "dskang",
      "dateUpdated": "2018-12-09 16:29:35.902",
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
            "data": "df: org.apache.spark.sql.DataFrame \u003d [DEST_COUNTRY_NAME: string, ORIGIN_COUNTRY_NAME: string ... 1 more field]\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d8431"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544340468662_504109565",
      "id": "20181209-162748_1429118182",
      "dateCreated": "2018-12-09 16:27:48.662",
      "dateStarted": "2018-12-09 16:29:35.917",
      "dateFinished": "2018-12-09 16:29:37.142",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.printSchema()",
      "user": "dskang",
      "dateUpdated": "2018-12-09 16:29:46.454",
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
            "data": "root\n |-- DEST_COUNTRY_NAME: string (nullable \u003d true)\n |-- ORIGIN_COUNTRY_NAME: string (nullable \u003d true)\n |-- count: long (nullable \u003d true)\n\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544340081054_550258888",
      "id": "20181209-162121_2097586850",
      "dateCreated": "2018-12-09 16:21:21.054",
      "dateStarted": "2018-12-09 16:29:46.464",
      "dateFinished": "2018-12-09 16:29:47.798",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//스키마는 DataFrame의 컬럼명과 데이터 타입을 정의.\nspark.read.format(\"json\").load(\"/home/dskangu/git_KANG91/Spark-The-Definitive-Guide/data/flight-data/json/2015-summary.json\").schema",
      "user": "dskang",
      "dateUpdated": "2018-12-09 16:32:45.727",
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
            "data": "res205: org.apache.spark.sql.types.StructType \u003d StructType(StructField(DEST_COUNTRY_NAME,StringType,true), StructField(ORIGIN_COUNTRY_NAME,StringType,true), StructField(count,LongType,true))\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d8633"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544340586454_-417283738",
      "id": "20181209-162946_1812557546",
      "dateCreated": "2018-12-09 16:29:46.454",
      "dateStarted": "2018-12-09 16:32:45.760",
      "dateFinished": "2018-12-09 16:32:48.175",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//스키마는 여러 개의 StructField 타입 필드로 구성된 StructType 객체\nimport org.apache.spark.sql.types.{StructField, StructType, StringType, LongType}\nimport org.apache.spark.sql.types.Metadata\n\nval myManualSchema \u003d StructType(Array(\n    StructField(\"DEST_COUNTRY_NAME\", StringType, true),\n    StructField(\"ORIGIN_COUNTRY_NAME\", StringType, true),\n    StructField(\"count\", LongType, false,\n    Metadata.fromJson(\"{\\\"hello\\\" : \\\"world\\\"}\")\n    )))\n    \nval df \u003d spark.read.format(\"json\").schema(myManualSchema).load(\"/home/dskangu/git_KANG91/Spark-The-Definitive-Guide/data/flight-data/json/2015-summary.json\")",
      "user": "dskang",
      "dateUpdated": "2018-12-09 16:42:16.374",
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
            "data": "import org.apache.spark.sql.types.{StructField, StructType, StringType, LongType}\nimport org.apache.spark.sql.types.Metadata\nmyManualSchema: org.apache.spark.sql.types.StructType \u003d StructType(StructField(DEST_COUNTRY_NAME,StringType,true), StructField(ORIGIN_COUNTRY_NAME,StringType,true), StructField(count,LongType,false))\ndf: org.apache.spark.sql.DataFrame \u003d [DEST_COUNTRY_NAME: string, ORIGIN_COUNTRY_NAME: string ... 1 more field]\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544340734482_-1563774999",
      "id": "20181209-163214_1050246488",
      "dateCreated": "2018-12-09 16:32:14.482",
      "dateStarted": "2018-12-09 16:40:57.629",
      "dateFinished": "2018-12-09 16:41:00.219",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%md\n스파크의 컬럼과 표현식",
      "user": "dskang",
      "dateUpdated": "2018-12-09 16:43:25.211",
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
            "data": "\u003cdiv class\u003d\"markdown-body\"\u003e\n\u003cp\u003e스파크의 컬럼과 표현식\u003c/p\u003e\n\u003c/div\u003e"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544341396391_1179460603",
      "id": "20181209-164316_680613669",
      "dateCreated": "2018-12-09 16:43:16.391",
      "dateStarted": "2018-12-09 16:43:25.234",
      "dateFinished": "2018-12-09 16:43:25.269",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//col, column 함수를 이용해 컬럼을 생성.(컬럼명을 인수로 받음))\nimport org.apache.spark.sql.functions.{col, column}\n\ncol(\"someColumeName\")\ncolumn(\"some\")",
      "user": "dskang",
      "dateUpdated": "2018-12-09 16:44:23.040",
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
            "data": "import org.apache.spark.sql.functions.{col, column}\nres209: org.apache.spark.sql.Column \u003d someColumeName\nres210: org.apache.spark.sql.Column \u003d some\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544341065663_-1135749726",
      "id": "20181209-163745_147070600",
      "dateCreated": "2018-12-09 16:37:45.663",
      "dateStarted": "2018-12-09 16:44:23.107",
      "dateFinished": "2018-12-09 16:44:24.920",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//DataFrame의 컬럼은 col 메서드로 참조.\ndf.col(\"count\")",
      "user": "dskang",
      "dateUpdated": "2018-12-09 16:48:45.508",
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
            "data": "res212: org.apache.spark.sql.Column \u003d count\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544341463040_-1097297082",
      "id": "20181209-164423_1290216581",
      "dateCreated": "2018-12-09 16:44:23.040",
      "dateStarted": "2018-12-09 16:45:03.276",
      "dateFinished": "2018-12-09 16:45:04.313",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//스파크에서 DataFrame의 각 로우는 하나의 레코드. 레코드를 Row 객체로 표현.\ndf.first()",
      "user": "dskang",
      "dateUpdated": "2018-12-09 17:00:12.964",
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
            "data": "res215: org.apache.spark.sql.Row \u003d [United States,Romania,15]\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d10487"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544341503204_-1889659105",
      "id": "20181209-164503_1157848940",
      "dateCreated": "2018-12-09 16:45:03.204",
      "dateStarted": "2018-12-09 17:00:12.992",
      "dateFinished": "2018-12-09 17:00:14.547",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//로우 생성하기\nimport org.apache.spark.sql.Row\n\nval myRow \u003d Row(\"hello\", null, 1, false)",
      "user": "dskang",
      "dateUpdated": "2018-12-09 17:01:18.093",
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
            "data": "import org.apache.spark.sql.Row\nmyRow: org.apache.spark.sql.Row \u003d [hello,null,1,false]\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544342412964_338753264",
      "id": "20181209-170012_1884754667",
      "dateCreated": "2018-12-09 17:00:12.964",
      "dateStarted": "2018-12-09 17:01:00.025",
      "dateFinished": "2018-12-09 17:01:01.194",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nmyRow(0) // Any타입\nmyRow(0).asInstanceOf[String] // String 타입\nmyRow.getString(0) // String타입\nmyRow.getInt(2) // Int타입",
      "user": "dskang",
      "dateUpdated": "2018-12-09 17:02:21.227",
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
            "data": "res221: Any \u003d hello\nres222: String \u003d hello\nres223: String \u003d hello\nres224: Int \u003d 1\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544342448615_-1979137423",
      "id": "20181209-170048_325900462",
      "dateCreated": "2018-12-09 17:00:48.615",
      "dateStarted": "2018-12-09 17:02:21.265",
      "dateFinished": "2018-12-09 17:02:23.418",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//dataframe 생성\nval df \u003d spark.read.format(\"json\").\nload(\"/home/dskangu/git_KANG91/Spark-The-Definitive-Guide/data/flight-data/json/2015-summary.json\")",
      "user": "dskang",
      "dateUpdated": "2018-12-09 17:06:07.642",
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
            "data": "df: org.apache.spark.sql.DataFrame \u003d [DEST_COUNTRY_NAME: string, ORIGIN_COUNTRY_NAME: string ... 1 more field]\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d10836"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544342527151_399653368",
      "id": "20181209-170207_1759153235",
      "dateCreated": "2018-12-09 17:02:07.151",
      "dateStarted": "2018-12-09 17:06:07.724",
      "dateFinished": "2018-12-09 17:06:09.671",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n\n//DataFrame 생성\nimport org.apache.spark.sql.Row\nimport org.apache.spark.sql.types.{StructField, StructType, StringType, LongType}\n\nval myManualSchema \u003d new StructType(Array(\n    new StructField(\"some\", StringType, true),\n    new StructField(\"col\", StringType, true),\n    new StructField(\"names\", LongType, false)))\n    \n    \nval myRows \u003d Seq(Row(\"Hello\", null, 1L))\nval myRDD \u003d spark.sparkContext.parallelize(myRows)\nval myDf \u003d spark.createDataFrame(myRDD, myManualSchema)\n\nmyDf.show()",
      "user": "dskang",
      "dateUpdated": "2018-12-09 17:10:37.953",
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
            "data": "import org.apache.spark.sql.Row\nimport org.apache.spark.sql.types.{StructField, StructType, StringType, LongType}\nmyManualSchema: org.apache.spark.sql.types.StructType \u003d StructType(StructField(some,StringType,true), StructField(col,StringType,true), StructField(names,LongType,false))\nmyRows: Seq[org.apache.spark.sql.Row] \u003d List([Hello,null,1])\nmyRDD: org.apache.spark.rdd.RDD[org.apache.spark.sql.Row] \u003d ParallelCollectionRDD[37290] at parallelize at \u003cconsole\u003e:67\nmyDf: org.apache.spark.sql.DataFrame \u003d [some: string, col: string ... 1 more field]\n+-----+----+-----+\n| some| col|names|\n+-----+----+-----+\n|Hello|null|    1|\n+-----+----+-----+\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d10989",
            "http://10.0.2.15:4040/jobs/job?id\u003d10990"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544342767642_-1334083076",
      "id": "20181209-170607_1530678302",
      "dateCreated": "2018-12-09 17:06:07.642",
      "dateStarted": "2018-12-09 17:08:55.939",
      "dateFinished": "2018-12-09 17:09:01.269",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nval myDF \u003d Seq((\"hello\", 2, 1L)).toDF(\"col1\", \"col2\", \"col3\")\n\nmyDF.show()",
      "user": "dskang",
      "dateUpdated": "2018-12-09 17:10:44.282",
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
            "data": "myDF: org.apache.spark.sql.DataFrame \u003d [col1: string, col2: int ... 1 more field]\n+-----+----+----+\n| col1|col2|col3|\n+-----+----+----+\n|hello|   2|   1|\n+-----+----+----+\n\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544342907810_579799527",
      "id": "20181209-170827_1021390564",
      "dateCreated": "2018-12-09 17:08:27.810",
      "dateStarted": "2018-12-09 17:10:44.317",
      "dateFinished": "2018-12-09 17:10:46.938",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n// when you use select, be able to use SQL query like using SQL query at DataFrame \ndf.select(\"DEST_COUNTRY_NAME\").show(2)",
      "user": "dskang",
      "dateUpdated": "2018-12-09 17:13:16.658",
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
            "data": "+-----------------+\n|DEST_COUNTRY_NAME|\n+-----------------+\n|    United States|\n|    United States|\n+-----------------+\nonly showing top 2 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d11238"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544343004233_517700596",
      "id": "20181209-171004_1760430540",
      "dateCreated": "2018-12-09 17:10:04.233",
      "dateStarted": "2018-12-09 17:13:16.718",
      "dateFinished": "2018-12-09 17:13:18.535",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n// select columns more than one\ndf.select(\"DEST_COUNTRY_NAME\", \"ORIGIN_COUNTRY_NAME\").show(2)",
      "user": "dskang",
      "dateUpdated": "2018-12-09 17:13:51.785",
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
            "data": "+-----------------+-------------------+\n|DEST_COUNTRY_NAME|ORIGIN_COUNTRY_NAME|\n+-----------------+-------------------+\n|    United States|            Romania|\n|    United States|            Croatia|\n+-----------------+-------------------+\nonly showing top 2 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d11270"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544343196658_-1037735664",
      "id": "20181209-171316_433447622",
      "dateCreated": "2018-12-09 17:13:16.658",
      "dateStarted": "2018-12-09 17:13:51.860",
      "dateFinished": "2018-12-09 17:13:55.612",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//many ways to select columns\nimport org.apache.spark.sql.functions.{expr, col, column}\n\ndf.select(\n    df.col(\"DEST_COUNTRY_NAME\"),\n    col(\"DEST_COUNTRY_NAME\"),\n    column(\"DEST_COUNTRY_NAME\"),\n    \u0027DEST_COUNTRY_NAME, \n    $\"DEST_COUNTRY_NAME\",\n    expr(\"DEST_COUNTRY_NAME\")).show(2)\n",
      "user": "dskang",
      "dateUpdated": "2018-12-09 17:17:34.726",
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
            "data": "import org.apache.spark.sql.functions.{expr, col, column}\n+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------+\n|DEST_COUNTRY_NAME|DEST_COUNTRY_NAME|DEST_COUNTRY_NAME|DEST_COUNTRY_NAME|DEST_COUNTRY_NAME|DEST_COUNTRY_NAME|\n+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------+\n|    United States|    United States|    United States|    United States|    United States|    United States|\n|    United States|    United States|    United States|    United States|    United States|    United States|\n+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------+\nonly showing top 2 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d11362"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544343231785_-1470777428",
      "id": "20181209-171351_41092218",
      "dateCreated": "2018-12-09 17:13:51.785",
      "dateStarted": "2018-12-09 17:15:29.672",
      "dateFinished": "2018-12-09 17:15:32.312",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n// change column names using alias \ndf.select(expr(\"DEST_COUNTRY_NAME AS destination\")).show(2)",
      "user": "dskang",
      "dateUpdated": "2018-12-09 17:18:57.185",
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
            "data": "+-------------+\n|  destination|\n+-------------+\n|United States|\n|United States|\n+-------------+\nonly showing top 2 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d11542"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544343316873_1844721477",
      "id": "20181209-171516_699816207",
      "dateCreated": "2018-12-09 17:15:16.873",
      "dateStarted": "2018-12-09 17:18:35.265",
      "dateFinished": "2018-12-09 17:18:37.946",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.select(expr(\"DEST_COUNTRY_NAME as destination\").alias(\"DEST_COUNTRY_NAME\")).show(2)",
      "user": "dskang",
      "dateUpdated": "2018-12-09 17:20:08.497",
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
            "data": "+-----------------+\n|DEST_COUNTRY_NAME|\n+-----------------+\n|    United States|\n|    United States|\n+-----------------+\nonly showing top 2 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d11624"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544343413704_-1189349888",
      "id": "20181209-171653_1622905977",
      "dateCreated": "2018-12-09 17:16:53.704",
      "dateStarted": "2018-12-09 17:20:08.548",
      "dateFinished": "2018-12-09 17:20:10.996",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.selectExpr(\"DEST_COUNTRY_NAME as newColumnName\", \"DEST_COUNTRY_NAME\").show(2)",
      "user": "dskang",
      "dateUpdated": "2018-12-09 17:20:52.720",
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
            "data": "+-------------+-----------------+\n|newColumnName|DEST_COUNTRY_NAME|\n+-------------+-----------------+\n|United States|    United States|\n|United States|    United States|\n+-------------+-----------------+\nonly showing top 2 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d11663"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544343608497_-1623525293",
      "id": "20181209-172008_1678289507",
      "dateCreated": "2018-12-09 17:20:08.497",
      "dateStarted": "2018-12-09 17:20:52.754",
      "dateFinished": "2018-12-09 17:20:54.835",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//add new columns to DataFrame which means place where person does start and arrive\ndf.selectExpr(\n    \"*\", // all origin column included\n    \"(DEST_COUNTRY_NAME \u003d ORIGIN_COUNTRY_NAME) as withinCountry\").show(2)\n",
      "user": "dskang",
      "dateUpdated": "2018-12-09 21:35:13.268",
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
            "data": "+-----------------+-------------------+-----+-------------+\n|DEST_COUNTRY_NAME|ORIGIN_COUNTRY_NAME|count|withinCountry|\n+-----------------+-------------------+-----+-------------+\n|    United States|            Romania|   15|        false|\n|    United States|            Croatia|    1|        false|\n+-----------------+-------------------+-----+-------------+\nonly showing top 2 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d17347"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544343648745_1900313655",
      "id": "20181209-172048_1703860527",
      "dateCreated": "2018-12-09 17:20:48.745",
      "dateStarted": "2018-12-09 21:35:13.331",
      "dateFinished": "2018-12-09 21:35:15.674",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.show(5)",
      "user": "dskang",
      "dateUpdated": "2018-12-09 21:36:28.877",
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
            "data": "+-----------------+-------------------+-----+\n|DEST_COUNTRY_NAME|ORIGIN_COUNTRY_NAME|count|\n+-----------------+-------------------+-----+\n|    United States|            Romania|   15|\n|    United States|            Croatia|    1|\n|    United States|            Ireland|  344|\n|            Egypt|      United States|   15|\n|    United States|              India|   62|\n+-----------------+-------------------+-----+\nonly showing top 5 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d17423"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544358984526_633728195",
      "id": "20181209-213624_1446353543",
      "dateCreated": "2018-12-09 21:36:24.526",
      "dateStarted": "2018-12-09 21:36:28.942",
      "dateFinished": "2018-12-09 21:36:29.864",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.selectExpr(\"avg(count)\", \"count(distinct(DEST_COUNTRY_NAME))\").show(2)",
      "user": "dskang",
      "dateUpdated": "2018-12-09 21:37:16.372",
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
            "data": "+-----------+---------------------------------+\n| avg(count)|count(DISTINCT DEST_COUNTRY_NAME)|\n+-----------+---------------------------------+\n|1770.765625|                              132|\n+-----------+---------------------------------+\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d17474"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544358897892_2116099035",
      "id": "20181209-213457_1602511658",
      "dateCreated": "2018-12-09 21:34:57.892",
      "dateStarted": "2018-12-09 21:37:16.420",
      "dateFinished": "2018-12-09 21:37:17.993",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n// use literal for delivering implicit value to Spark\nimport org.apache.spark.sql.functions.lit\n\ndf.select(expr(\"*\"), lit(2).as(\"Two\")).show(2)",
      "user": "dskang",
      "dateUpdated": "2018-12-09 21:42:13.838",
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
            "data": "import org.apache.spark.sql.functions.lit\n+-----------------+-------------------+-----+---+\n|DEST_COUNTRY_NAME|ORIGIN_COUNTRY_NAME|count|Two|\n+-----------------+-------------------+-----+---+\n|    United States|            Romania|   15|  2|\n|    United States|            Croatia|    1|  2|\n+-----------------+-------------------+-----+---+\nonly showing top 2 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d17796"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544358964390_332982917",
      "id": "20181209-213604_921783949",
      "dateCreated": "2018-12-09 21:36:04.390",
      "dateStarted": "2018-12-09 21:42:13.893",
      "dateFinished": "2018-12-09 21:42:15.342",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n// add new Column\ndf.withColumn(\"numberOne\", lit(1)).show(2)",
      "user": "dskang",
      "dateUpdated": "2018-12-09 21:41:56.309",
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
            "data": "+-----------------+-------------------+-----+---------+\n|DEST_COUNTRY_NAME|ORIGIN_COUNTRY_NAME|count|numberOne|\n+-----------------+-------------------+-----+---------+\n|    United States|            Romania|   15|        1|\n|    United States|            Croatia|    1|        1|\n+-----------------+-------------------+-----+---------+\nonly showing top 2 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d17778"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544359237668_-2108584350",
      "id": "20181209-214037_706741341",
      "dateCreated": "2018-12-09 21:40:37.668",
      "dateStarted": "2018-12-09 21:41:56.361",
      "dateFinished": "2018-12-09 21:41:57.985",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//see if Origin country name and destination country name are same\ndf.withColumn(\"withinCountry\", expr(\"ORIGIN_COUNTRY_NAME \u003d\u003d DEST_COUNTRY_NAME\")).show(2)",
      "user": "dskang",
      "dateUpdated": "2018-12-09 21:43:15.029",
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
            "data": "+-----------------+-------------------+-----+-------------+\n|DEST_COUNTRY_NAME|ORIGIN_COUNTRY_NAME|count|withinCountry|\n+-----------------+-------------------+-----+-------------+\n|    United States|            Romania|   15|        false|\n|    United States|            Croatia|    1|        false|\n+-----------------+-------------------+-----+-------------+\nonly showing top 2 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d17856"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544359316309_288494932",
      "id": "20181209-214156_1222916959",
      "dateCreated": "2018-12-09 21:41:56.309",
      "dateStarted": "2018-12-09 21:43:15.137",
      "dateFinished": "2018-12-09 21:43:16.490",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.withColumn(\"Destination\", expr(\"DEST_COUNTRY_NAME\")).columns",
      "user": "dskang",
      "dateUpdated": "2018-12-09 21:44:57.365",
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
            "data": "res298: Array[String] \u003d Array(DEST_COUNTRY_NAME, ORIGIN_COUNTRY_NAME, count, Destination)\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544359395029_-2098124615",
      "id": "20181209-214315_2124986840",
      "dateCreated": "2018-12-09 21:43:15.029",
      "dateStarted": "2018-12-09 21:44:57.430",
      "dateFinished": "2018-12-09 21:44:57.906",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//change column name\ndf.withColumnRenamed(\"DEST_COUNTRY_NAME\", \"dest\").columns",
      "user": "dskang",
      "dateUpdated": "2018-12-09 21:46:05.862",
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
            "data": "res301: Array[String] \u003d Array(dest, ORIGIN_COUNTRY_NAME, count)\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544359447757_664850405",
      "id": "20181209-214407_1722945658",
      "dateCreated": "2018-12-09 21:44:07.757",
      "dateStarted": "2018-12-09 21:46:05.938",
      "dateFinished": "2018-12-09 21:46:06.680",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n// use escaping(\u0027) for using hy.....\n// don\u0027t have to use backtic\nimport org.apache.spark.sql.functions.expr\n\nval dfWithLongColName \u003d df.withColumn(\n    \"This Long Column-Name\", expr(\"ORIGIN_COUNTRY_NAME\"))",
      "user": "dskang",
      "dateUpdated": "2018-12-09 22:05:56.282",
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
            "data": "import org.apache.spark.sql.functions.expr\ndfWithLongColName: org.apache.spark.sql.DataFrame \u003d [DEST_COUNTRY_NAME: string, ORIGIN_COUNTRY_NAME: string ... 2 more fields]\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544359454406_-261914443",
      "id": "20181209-214414_119332149",
      "dateCreated": "2018-12-09 21:44:14.406",
      "dateStarted": "2018-12-09 21:47:58.095",
      "dateFinished": "2018-12-09 21:47:59.060",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//drop column\ndf.drop(\"ORIGIN_COUNTRY_NAME\").columns",
      "user": "dskang",
      "dateUpdated": "2018-12-09 22:31:58.981",
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
            "data": "res339: Array[String] \u003d Array(DEST_COUNTRY_NAME, count)\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544360819732_824048931",
      "id": "20181209-220659_1219733623",
      "dateCreated": "2018-12-09 22:06:59.732",
      "dateStarted": "2018-12-09 22:31:59.052",
      "dateFinished": "2018-12-09 22:31:59.993",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n// drop multi columns\ndfWithLongColName.drop(\"ORIGIN_COUNTRY_NAME\", \"DEST_COUNTRY_NAME\").show()",
      "user": "dskang",
      "dateUpdated": "2018-12-09 22:33:22.516",
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
            "data": "+-----+---------------------+\n|count|This Long Column-Name|\n+-----+---------------------+\n|   15|              Romania|\n|    1|              Croatia|\n|  344|              Ireland|\n|   15|        United States|\n|   62|                India|\n|    1|            Singapore|\n|   62|              Grenada|\n|  588|        United States|\n|   40|        United States|\n|    1|        United States|\n|  325|         Sint Maarten|\n|   39|     Marshall Islands|\n|   64|        United States|\n|    1|        United States|\n|   41|        United States|\n|   30|        United States|\n|    6|             Paraguay|\n|    4|        United States|\n|  230|        United States|\n|    1|            Gibraltar|\n+-----+---------------------+\nonly showing top 20 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d21009"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544362318981_-815208797",
      "id": "20181209-223158_332040187",
      "dateCreated": "2018-12-09 22:31:58.981",
      "dateStarted": "2018-12-09 22:33:22.578",
      "dateFinished": "2018-12-09 22:33:24.296",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//change dtype of column\ndf.withColumn(\"count2\", col(\"count\").cast(\"string\"))",
      "user": "dskang",
      "dateUpdated": "2018-12-09 22:34:02.700",
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
            "data": "res351: org.apache.spark.sql.DataFrame \u003d [DEST_COUNTRY_NAME: string, ORIGIN_COUNTRY_NAME: string ... 2 more fields]\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544362395965_-1021911948",
      "id": "20181209-223315_1585931510",
      "dateCreated": "2018-12-09 22:33:15.965",
      "dateStarted": "2018-12-09 22:34:02.778",
      "dateFinished": "2018-12-09 22:34:04.464",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.filter(col(\"count\") \u003c 2).show(2)\ndf.where(\"count \u003c 2\").show(2)",
      "user": "dskang",
      "dateUpdated": "2018-12-09 22:34:46.483",
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
            "data": "+-----------------+-------------------+-----+\n|DEST_COUNTRY_NAME|ORIGIN_COUNTRY_NAME|count|\n+-----------------+-------------------+-----+\n|    United States|            Croatia|    1|\n|    United States|          Singapore|    1|\n+-----------------+-------------------+-----+\nonly showing top 2 rows\n\n+-----------------+-------------------+-----+\n|DEST_COUNTRY_NAME|ORIGIN_COUNTRY_NAME|count|\n+-----------------+-------------------+-----+\n|    United States|            Croatia|    1|\n|    United States|          Singapore|    1|\n+-----------------+-------------------+-----+\nonly showing top 2 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d21093",
            "http://10.0.2.15:4040/jobs/job?id\u003d21095"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544362427332_-844679990",
      "id": "20181209-223347_1559366743",
      "dateCreated": "2018-12-09 22:33:47.332",
      "dateStarted": "2018-12-09 22:34:46.568",
      "dateFinished": "2018-12-09 22:34:50.061",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//use multiple filter\ndf.where(col(\"count\") \u003c 2).where(col(\"ORIGIN_COUNTRY_NAME\") \u003d!\u003d \"Croatia\").show(2)",
      "user": "dskang",
      "dateUpdated": "2018-12-09 22:36:46.277",
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
            "data": "+-----------------+-------------------+-----+\n|DEST_COUNTRY_NAME|ORIGIN_COUNTRY_NAME|count|\n+-----------------+-------------------+-----+\n|    United States|          Singapore|    1|\n|          Moldova|      United States|    1|\n+-----------------+-------------------+-----+\nonly showing top 2 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d21198"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544362475441_-1702078629",
      "id": "20181209-223435_696312156",
      "dateCreated": "2018-12-09 22:34:35.441",
      "dateStarted": "2018-12-09 22:36:46.427",
      "dateFinished": "2018-12-09 22:36:47.394",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.select(\"ORIGIN_COUNTRY_NAME\", \"DEST_COUNTRY_NAME\").distinct().count()",
      "user": "dskang",
      "dateUpdated": "2018-12-09 22:37:11.307",
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
            "data": "res361: Long \u003d 256\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d21224"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544362606278_-476942294",
      "id": "20181209-223646_712839992",
      "dateCreated": "2018-12-09 22:36:46.278",
      "dateStarted": "2018-12-09 22:37:11.417",
      "dateFinished": "2018-12-09 22:37:13.761",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.select(\"ORIGIN_COUNTRY_NAME\").distinct().count()",
      "user": "dskang",
      "dateUpdated": "2018-12-09 22:38:03.018",
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
            "data": "res363: Long \u003d 125\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d21272"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544362631307_-211511628",
      "id": "20181209-223711_299927458",
      "dateCreated": "2018-12-09 22:37:11.307",
      "dateStarted": "2018-12-09 22:38:03.147",
      "dateFinished": "2018-12-09 22:38:06.505",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//make random sample\nval seed \u003d 5\nval withReplacement \u003d false\nval fraction \u003d 0.5\ndf.sample(withReplacement, fraction, seed).count()",
      "user": "dskang",
      "dateUpdated": "2018-12-09 22:38:42.050",
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
            "data": "seed: Int \u003d 5\nwithReplacement: Boolean \u003d false\nfraction: Double \u003d 0.5\nres366: Long \u003d 126\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d21308"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544362683018_1515493335",
      "id": "20181209-223803_1982049289",
      "dateCreated": "2018-12-09 22:38:03.018",
      "dateStarted": "2018-12-09 22:38:42.227",
      "dateFinished": "2018-12-09 22:38:45.896",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//split data to train and test\nval dataFrames \u003d df.randomSplit(Array(0.25, 0.75), seed)\ndataFrames(0).count() \u003e dataFrames(1).count()",
      "user": "dskang",
      "dateUpdated": "2018-12-09 22:40:27.782",
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
            "data": "dataFrames: Array[org.apache.spark.sql.Dataset[org.apache.spark.sql.Row]] \u003d Array([DEST_COUNTRY_NAME: string, ORIGIN_COUNTRY_NAME: string ... 1 more field], [DEST_COUNTRY_NAME: string, ORIGIN_COUNTRY_NAME: string ... 1 more field])\nres370: Boolean \u003d false\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d21418",
            "http://10.0.2.15:4040/jobs/job?id\u003d21420"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544362722050_1048437557",
      "id": "20181209-223842_567233721",
      "dateCreated": "2018-12-09 22:38:42.050",
      "dateStarted": "2018-12-09 22:40:27.847",
      "dateFinished": "2018-12-09 22:40:30.954",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.schema",
      "user": "dskang",
      "dateUpdated": "2018-12-09 22:43:22.752",
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
            "data": "res372: org.apache.spark.sql.types.StructType \u003d StructType(StructField(DEST_COUNTRY_NAME,StringType,true), StructField(ORIGIN_COUNTRY_NAME,StringType,true), StructField(count,LongType,true))\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544362999017_-1292983219",
      "id": "20181209-224319_1511224960",
      "dateCreated": "2018-12-09 22:43:19.017",
      "dateStarted": "2018-12-09 22:43:22.846",
      "dateFinished": "2018-12-09 22:43:23.912",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//DataFrame is immutable, adding row to DataFrame is needed to union new DataFrame\n\nimport org.apache.spark.sql.Row\n\nval schema \u003d df.schema\n\nval newRows \u003d Seq(\n    Row(\"New Country\", \"Other Counter\", 5L),\n    Row(\"New Country 2\", \"Other Country 3\", 1L))\n    \nval parallelizedRows \u003d spark.sparkContext.parallelize(newRows)\nval newDF \u003d spark.createDataFrame(parallelizedRows, schema)\n\ndf.union(newDF).\nwhere(\"count \u003d 1\").\nwhere($\"ORIGIN_COUNTRY_NAME\" \u003d!\u003d \"United States\" ).\nshow()\n",
      "user": "dskang",
      "dateUpdated": "2018-12-09 22:45:20.928",
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
            "data": "import org.apache.spark.sql.Row\nschema: org.apache.spark.sql.types.StructType \u003d StructType(StructField(DEST_COUNTRY_NAME,StringType,true), StructField(ORIGIN_COUNTRY_NAME,StringType,true), StructField(count,LongType,true))\nnewRows: Seq[org.apache.spark.sql.Row] \u003d List([New Country,Other Counter,5], [New Country 2,Other Country 3,1])\nparallelizedRows: org.apache.spark.rdd.RDD[org.apache.spark.sql.Row] \u003d ParallelCollectionRDD[69508] at parallelize at \u003cconsole\u003e:79\nnewDF: org.apache.spark.sql.DataFrame \u003d [DEST_COUNTRY_NAME: string, ORIGIN_COUNTRY_NAME: string ... 1 more field]\n+-----------------+-------------------+-----+\n|DEST_COUNTRY_NAME|ORIGIN_COUNTRY_NAME|count|\n+-----------------+-------------------+-----+\n|    United States|            Croatia|    1|\n|    United States|          Singapore|    1|\n|    United States|          Gibraltar|    1|\n|    United States|             Cyprus|    1|\n|    United States|            Estonia|    1|\n|    United States|          Lithuania|    1|\n|    United States|           Bulgaria|    1|\n|    United States|            Georgia|    1|\n|    United States|            Bahrain|    1|\n|    United States|   Papua New Guinea|    1|\n|    United States|         Montenegro|    1|\n|    United States|            Namibia|    1|\n|    New Country 2|    Other Country 3|    1|\n+-----------------+-------------------+-----+\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d21713",
            "http://10.0.2.15:4040/jobs/job?id\u003d21714",
            "http://10.0.2.15:4040/jobs/job?id\u003d21715"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544362819571_-1906961713",
      "id": "20181209-224019_1139183750",
      "dateCreated": "2018-12-09 22:40:19.571",
      "dateStarted": "2018-12-09 22:45:21.014",
      "dateFinished": "2018-12-09 22:45:25.056",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n// row sorting\ndf.sort(\"count\").show(5)\ndf.orderBy(\"count\", \"DEST_COUNTRY_NAME\").show(5)\ndf.orderBy(col(\"count\"), col(\"DEST_COUNTRY_NAME\")).show(5)",
      "user": "dskang",
      "dateUpdated": "2018-12-09 22:46:09.823",
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
            "data": "+--------------------+-------------------+-----+\n|   DEST_COUNTRY_NAME|ORIGIN_COUNTRY_NAME|count|\n+--------------------+-------------------+-----+\n|               Malta|      United States|    1|\n|Saint Vincent and...|      United States|    1|\n|       United States|            Croatia|    1|\n|       United States|          Gibraltar|    1|\n|       United States|          Singapore|    1|\n+--------------------+-------------------+-----+\nonly showing top 5 rows\n\n+-----------------+-------------------+-----+\n|DEST_COUNTRY_NAME|ORIGIN_COUNTRY_NAME|count|\n+-----------------+-------------------+-----+\n|     Burkina Faso|      United States|    1|\n|    Cote d\u0027Ivoire|      United States|    1|\n|           Cyprus|      United States|    1|\n|         Djibouti|      United States|    1|\n|        Indonesia|      United States|    1|\n+-----------------+-------------------+-----+\nonly showing top 5 rows\n\n+-----------------+-------------------+-----+\n|DEST_COUNTRY_NAME|ORIGIN_COUNTRY_NAME|count|\n+-----------------+-------------------+-----+\n|     Burkina Faso|      United States|    1|\n|    Cote d\u0027Ivoire|      United States|    1|\n|           Cyprus|      United States|    1|\n|         Djibouti|      United States|    1|\n|        Indonesia|      United States|    1|\n+-----------------+-------------------+-----+\nonly showing top 5 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d21759",
            "http://10.0.2.15:4040/jobs/job?id\u003d21761",
            "http://10.0.2.15:4040/jobs/job?id\u003d21763"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544363072871_-125653807",
      "id": "20181209-224432_1221078628",
      "dateCreated": "2018-12-09 22:44:32.871",
      "dateStarted": "2018-12-09 22:46:09.917",
      "dateFinished": "2018-12-09 22:46:14.405",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\nimport org.apache.spark.sql.functions.{desc, asc}\n\ndf.orderBy(expr(\"count desc\")).show(2)\ndf.orderBy(desc(\"count\"), asc(\"DEST_COUNTRY_NAME\")).show(2)",
      "user": "dskang",
      "dateUpdated": "2018-12-09 22:49:51.549",
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
            "data": "import org.apache.spark.sql.functions.{desc, asc}\n+-----------------+-------------------+-----+\n|DEST_COUNTRY_NAME|ORIGIN_COUNTRY_NAME|count|\n+-----------------+-------------------+-----+\n|          Moldova|      United States|    1|\n|    United States|            Croatia|    1|\n+-----------------+-------------------+-----+\nonly showing top 2 rows\n\n+-----------------+-------------------+------+\n|DEST_COUNTRY_NAME|ORIGIN_COUNTRY_NAME| count|\n+-----------------+-------------------+------+\n|    United States|      United States|370002|\n|    United States|             Canada|  8483|\n+-----------------+-------------------+------+\nonly showing top 2 rows\n\n"
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
            "http://10.0.2.15:4040/jobs/job?id\u003d22001",
            "http://10.0.2.15:4040/jobs/job?id\u003d22003"
          ],
          "interpreterSettingId": "spark"
        }
      },
      "apps": [],
      "jobName": "paragraph_1544363169823_-361383913",
      "id": "20181209-224609_544871948",
      "dateCreated": "2018-12-09 22:46:09.823",
      "dateStarted": "2018-12-09 22:49:51.640",
      "dateFinished": "2018-12-09 22:49:56.932",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//repartition\ndf.rdd.getNumPartitions\n\ndf.repartition(5)",
      "user": "dskang",
      "dateUpdated": "2018-12-09 22:51:07.933",
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
            "data": "res393: Int \u003d 1\nres394: org.apache.spark.sql.Dataset[org.apache.spark.sql.Row] \u003d [DEST_COUNTRY_NAME: string, ORIGIN_COUNTRY_NAME: string ... 1 more field]\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544363391549_-1558119974",
      "id": "20181209-224951_1624837559",
      "dateCreated": "2018-12-09 22:49:51.549",
      "dateStarted": "2018-12-09 22:51:08.012",
      "dateFinished": "2018-12-09 22:51:10.009",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.repartition(col(\"DEST_COUNTRY_NAME\"))",
      "user": "dskang",
      "dateUpdated": "2018-12-09 22:51:45.485",
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
            "data": "res396: org.apache.spark.sql.Dataset[org.apache.spark.sql.Row] \u003d [DEST_COUNTRY_NAME: string, ORIGIN_COUNTRY_NAME: string ... 1 more field]\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544363467933_994032450",
      "id": "20181209-225107_1370494312",
      "dateCreated": "2018-12-09 22:51:07.933",
      "dateStarted": "2018-12-09 22:51:45.631",
      "dateFinished": "2018-12-09 22:51:46.670",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\ndf.repartition(5, col(\"DEST_COUNTRY_NAME\"))",
      "user": "dskang",
      "dateUpdated": "2018-12-09 22:52:13.638",
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
            "data": "res399: org.apache.spark.sql.Dataset[org.apache.spark.sql.Row] \u003d [DEST_COUNTRY_NAME: string, ORIGIN_COUNTRY_NAME: string ... 1 more field]\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544363505485_-686093619",
      "id": "20181209-225145_317102399",
      "dateCreated": "2018-12-09 22:51:45.485",
      "dateStarted": "2018-12-09 22:52:13.766",
      "dateFinished": "2018-12-09 22:52:14.927",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n//merge partition without shuffling\ndf.repartition(5, col(\"DEST_COUNTRY_NAME\")).coalesce(2)",
      "user": "dskang",
      "dateUpdated": "2018-12-09 22:53:36.829",
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
            "data": "res402: org.apache.spark.sql.Dataset[org.apache.spark.sql.Row] \u003d [DEST_COUNTRY_NAME: string, ORIGIN_COUNTRY_NAME: string ... 1 more field]\n"
          }
        ]
      },
      "apps": [],
      "jobName": "paragraph_1544363528060_-154184479",
      "id": "20181209-225208_1770986950",
      "dateCreated": "2018-12-09 22:52:08.060",
      "dateStarted": "2018-12-09 22:53:36.951",
      "dateFinished": "2018-12-09 22:53:38.037",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 500
    },
    {
      "text": "%spark\n",
      "user": "dskang",
      "dateUpdated": "2018-12-09 22:53:36.829",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "apps": [],
      "jobName": "paragraph_1544363616829_-1697859420",
      "id": "20181209-225336_254803051",
      "dateCreated": "2018-12-09 22:53:36.829",
      "status": "READY",
      "progressUpdateIntervalMs": 500
    }
  ],
  "name": "SparkTheDefiniteGuide",
  "id": "2DXGGXRJ6",
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