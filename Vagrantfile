Vagrant.configure(2) do |config|
  config.vm.box = "puphpet/ubuntu1404-x64"
  config.vm.define "issues" do |issues|
    issues.vm.hostname = "issues"
    issues.vm.network :private_network, ip: "192.168.48.10"
	issues.vm.network "forwarded_port", guest: 8080, host: 8080
	issues.vm.provision "shell", path: "provision.sh"
	issues.vm.provision "shell", inline: "nohup java -jar /vagrant/trubbl-issues/build/libs/*.jar &", run: "always"
  end
end
