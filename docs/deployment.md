# Production Deployment Guide

## Hardware Requirements
- **CPU:** 2 Cores (min), 4 Cores (recommended)
- **RAM:** 4GB (min), 8GB (recommended)
- **Disk:** 10GB SSD for logs and DB.

## Software Stack
- Ubuntu Server 22.04 LTS
- OpenJDK 17 JRE
- PostgreSQL 14

## Network Setup
- Port **8080** (Internal App)
- Port **80** / **443** (Nginx Reverse Proxy)

## Health Check
Open `http://your-server-ip:8080/actuator/health`. 
Status `UP` means everything is fine.
