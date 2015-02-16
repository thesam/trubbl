Vagrant.configure(2) do |config|
    config.vm.box = "puphpet/ubuntu1404-x64"
    config.vm.define "gui" do |gui|
        gui.vm.hostname = "gui"
        gui.vm.network :private_network, ip: "192.168.48.10"
        gui.vm.network "forwarded_port", guest: 8080, host: 8080
        gui.vm.provision "shell", path: "provision.sh"
        gui.vm.provision "shell", inline: "nohup java -jar /vagrant/trubbl-gui/build/libs/*.jar &", run: "always"
    end
    config.vm.define "discovery" do |discovery|
        discovery.vm.hostname = "discovery"
        discovery.vm.network :private_network, ip: "192.168.48.1"
        discovery.vm.network "forwarded_port", guest: 8761, host: 8761
        discovery.vm.provision "shell", path: "provision.sh"
        discovery.vm.provision "shell", inline: "nohup java -jar /vagrant/trubbl-discovery/build/libs/*.jar &", run: "always"
    end
    config.vm.define "issues" do |issues|
        issues.vm.hostname = "issues"
        issues.vm.network :private_network, ip: "192.168.48.11"
        issues.vm.network "forwarded_port", guest: 8080, host: 8082
        issues.vm.provision "shell", path: "provision.sh"
        issues.vm.provision "shell", inline: "nohup java -jar /vagrant/trubbl-issues/build/libs/*.jar &", run: "always"
    end
end
