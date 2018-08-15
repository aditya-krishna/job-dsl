package com.harman.jenkins.dsl

class SpringBootJob {
    public void createJob() {
        job('DSL-Tutorial') {
            scm { git('git://github.com/aditya-krishna/training.git') }
            triggers { scm('H/15 * * * *') }
            steps { maven('-e clean test') }
        }
    }
}
