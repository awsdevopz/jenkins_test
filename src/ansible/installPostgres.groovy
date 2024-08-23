package ansible

def installPostgres(String server_ip) {
    sh """
        ansible-playbook -i ${server_ip}, \
        playbook.yml --tags "postgres"
    """
}
