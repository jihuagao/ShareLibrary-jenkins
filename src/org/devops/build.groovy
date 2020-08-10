package org.devops


//构建类型
def Build(buildType,buildShell){
    def buildTools = ["mvn":"M3","npm":"NPM"]
    
    println("当前选择的构建类型为 ${buildType}")
    buildHome= tool buildTools[buildType]
    
    if ("${buildType}" == "npm"){
        sh  "${buildHome}/bin/${buildType} ${buildShell}"
    } else {
        sh "${buildHome}/bin/${buildType} ${buildShell}"
    }
}
