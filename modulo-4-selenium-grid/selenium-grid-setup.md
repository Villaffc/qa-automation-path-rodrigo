
```yaml
version: '3'
services:
  selenium-hub:
    image: selenium/hub
    ports:
      - "4444:4444"
  firefox:
    image: selenium/node-firefox
    depends_on:
      - selenium-hub
    environment:
      - HUB_HOST=selenium-hub
```
