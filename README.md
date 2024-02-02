# FastBurguer

## Installation and Development

## Start FastBurguer-Api on Docker
Go to workspace root and run commands:

**1.** Build Application
 ```bash
 Create Enviroment variable MYSQL_SECRET with your local mysql password
 ```
**2.** build java app
 ```bash
 mvn clean package
 ```

**3.** Build and Up Container
 ```bash
 docker compose up --build -d
 ```

 ## Start FastBurguer-Api on k8s

 **1.** Install k8s on your OS

 **2.** Install and start Minikube
 ```bash
 minikube start
 ```

 **3.** Create k8s resources application on .\k8s\
 ```bash
 kubectl apply -f .\k8s\
 ```

 **4.** Get localhost url tunnel minikube to acess App
 ```bash
 minikube service fastburguer-service --url
 ```

 **5.** Paste url in stress test on .\stressTest\stressTest.sh and Postman Requests

 **6.** Run the stressTest.sh to see infrastructure scaling
 ```bash
 .\stressTest\stressTest.sh
 ```

 **6.** Get Hpa Replicas
 ```bash
kubectl get hpa --watch
 ```

## Video
https://vimeo.com/907283881?share=copy

## Kubernetes Architecture
![image](https://github.com/Agualuza/fastBurguer20/assets/25313322/b3ace2ba-7693-4c5a-a2e5-f0b2cf1e718a)



