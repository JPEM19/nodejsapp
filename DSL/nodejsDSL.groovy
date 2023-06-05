job('Aplicacion Node.js DSL') {
    description('Aplicación Node JS DSL para el curso de Jenkins')
    scm {
        git('https://github.com/JPEM19/nodejsapp.git', 'master') { node ->
            node / gitConfigName('JPEM19')
            node / gitConfigEmail('juanpablo-escobedo@hotmail.com')
        }
    }
    triggers {
        scm('H/7 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        shell("npm install")
    }
}
