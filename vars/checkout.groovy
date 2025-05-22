def call() {
    echo "Shared library checkout function is being called."
    // Use the built-in Jenkins checkout scm step
    checkout scm
}
