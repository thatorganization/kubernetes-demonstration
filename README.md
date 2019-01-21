mvn clean install
docker build -t demos-image .
docker tag demoa-image milindad/demoa-image
docker push milindad/demoa-image


kubectl run aa-container --image=aa-image --image-pull-policy=Never

kubectl delete service demoa
kubectl delete deployment demoa-v1
istioctl delete virtualservice demoa





kubectl apply -f <(istioctl kube-inject -f ~/Downloads/services.yml)
kubectl apply -f ~/Downloads/gateway.yml