curl -d '{"switch": "00:00:00:00:00:00:00:01", "name":"flow-mod-1", "cookie":"0", "priority":"32768", "eth_type":"0x0800", "ipv4_dst":"11.11.11.2","active":"true", "actions":"set_eth_dst=00:00:00:00:00:01,output=3"}' http://localhost:8080/wm/staticflowpusher/json
curl -d '{"switch": "00:00:00:00:00:00:00:02", "name":"flow-mod-2", "cookie":"0", "priority":"32768", "eth_type":"0x0800", "ipv4_dst":"22.22.22.2","active":"true", "actions":"set_eth_dst=00:00:00:00:00:02,output=3"}' http://localhost:8082/wm/staticflowpusher/json
curl -d '{"switch": "00:00:00:00:00:00:00:03", "name":"flow-mod-3", "cookie":"0", "priority":"32768", "eth_type":"0x0800", "ipv4_dst":"33.33.33.2","active":"true", "actions":"set_eth_dst=00:00:00:00:00:03,output=3"}' http://localhost:8084/wm/staticflowpusher/json