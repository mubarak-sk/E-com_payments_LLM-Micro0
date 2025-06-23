// cd/vars/pipelineParams.groovy or cd/scripts/pipelineParams.groovy
return [
    string(name: 'IMAGE_TAG', defaultValue: '', description: 'Docker image tag to deploy'),
    string(name: 'ECR_REPO', defaultValue: '', description: 'ECR repo to pull from'),
    choice(name: 'ENVIRONMENT', choices: ['staging', 'uat', 'production'], description: 'Target environment'),
    string(name: 'JIRA_TICKET_ID', defaultValue: '', description: 'Jira ticket ID')
]
