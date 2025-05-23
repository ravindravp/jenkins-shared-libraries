def call() {
    echo "Building the application using Maven..."
    sh 'mvn clean install'
}
