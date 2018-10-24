#!/usr/bin/env bash
kubectl apply -f ./kubernetes/service.yml
sed 's/BUILD_NUMBER/'"$BUILD_NUMBER"'/' kubernetes/deployment.yml | kubectl apply -f -