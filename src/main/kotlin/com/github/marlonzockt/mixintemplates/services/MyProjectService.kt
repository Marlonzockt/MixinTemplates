package com.github.marlonzockt.mixintemplates.services

import com.github.marlonzockt.mixintemplates.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
