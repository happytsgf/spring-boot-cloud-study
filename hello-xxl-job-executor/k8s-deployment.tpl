apiVersion: v1
kind: Service
metadata:
  labels:
    app: {APP_NAME}
  name: {APP_NAME}
spec:
  ports:
  - port: 49088
    protocol: TCP
    targetPort: 8088
    nodePort: 30088
  selector:
    app: {APP_NAME}
  type: NodePort
---
apiVersion: apps/v1
kind: Deployment
metadata:
  name: {APP_NAME}-deployment
  labels:
    app: {APP_NAME}
spec:
  replicas: 1
  selector:
    matchLabels:
      app: {APP_NAME}
  template:
    metadata:
      labels:
        app: {APP_NAME}
    spec:
      imagePullSecrets:
      - name: registry-harbor
      containers:
      - name: {APP_NAME}
        image: {IMAGE_URL}:{IMAGE_TAG}
        ports:
        - containerPort: 8088
        env:
          - name: SPRING_PROFILES_ACTIVE
            value: {SPRING_PROFILE}
#          - name: SERVER_ADDRESS
#            value: 192.168.82.106