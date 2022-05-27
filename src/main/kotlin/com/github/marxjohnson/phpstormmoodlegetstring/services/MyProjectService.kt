package com.github.marxjohnson.phpstormmoodlegetstring.services

import com.intellij.openapi.project.Project
import com.github.marxjohnson.phpstormmoodlegetstring.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
