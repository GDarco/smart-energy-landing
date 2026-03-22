#!/bin/bash
echo "Starting Smart-Energy Production..."
nohup java -jar target/smart-energy-1.0.0.jar > app.log 2>&1 &
echo "App started in background. Check app.log."
