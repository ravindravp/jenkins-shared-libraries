def call() {
    echo "Deploying the application using Docker..."
    sh 'docker build -t sample-java-app .'
    sh 'docker run -d -p 8080:8080 sample-java-app'
}
