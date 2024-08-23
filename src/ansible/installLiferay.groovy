package ansible

def installLiferay(String server_ip, String liferay_login, String liferay_password) {
    sh """
        ansible-playbook -i ${server_ip}, \
        -e liferay_login=${liferay_login} \
        -e liferay_password=${liferay_password} \
        playbook.yml --tags "liferay"
    """
}