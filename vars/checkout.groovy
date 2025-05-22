def call(Map scmConfig) {
    if (!scmConfig) {
        error "SCM configuration is required for checkout"
    }
    // Use Jenkins' built-in checkout step
    checkout scmConfig
}
