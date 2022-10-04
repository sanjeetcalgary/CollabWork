job('DSL-job') {
    description("This is my first DSL job at ${new Date()}")

    scm{
        git("https://github.com/sanjeetcalgary/CollabWork.git",'main')
    }

    triggers{
        scm('* * * * *')
    }

    steps{
        maven('clean install test package','Simple-JavaMavenProject/pom.xml')
    }

    publishers{
        archiveJunit('Simple-JavaMavenProject/target/surefire-reports/*.xml')
    }

    publishers{
        archiveArtifacts '**/*.jar'
    }
}