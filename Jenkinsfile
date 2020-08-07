#!groovy

@Library('jenkinslibrary') _

def tools = new org.devops.tools()

pipeline{
    agent any

    options{
        timestamp()//日志会有时间
    }
    stages{
        //下载代码
        stage("GetCode"){
            steps{
                timeout(time:5,unit:"MINUTES"){
                    script{
                        println('获取代码')
                    }
                }
            }
        }

        //构建
        stage("Build"){
            steps{
                timeout(time:20,unit:"MINUTES"){
                    script{
                        println('应用打包')
                    }
                }
            }


        }

        //代码扫描
        stage("CodeScan"){
            steps{
                timeout(time:30,unit:"MINUTES"){
                    script{
                        println('代码扫描')
                        tools.PrintMes("This is my library!")
                    }
                }
            }
        }
    }

}
