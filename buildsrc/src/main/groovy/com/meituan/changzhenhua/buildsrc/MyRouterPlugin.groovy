package com.meituan.changzhenhua.buildsrc

import org.gradle.api.Plugin
import org.gradle.api.Project


class MyRouterPlugin implements Plugin<Project> {

    @Override
     void apply(Project project) {
        print("================")
        print("hello gradle plugin")
        print("================")
        project.tasks.create('cleanTest', CleanTestTask)
    }

}
