# Automation Selenium Challenge Naaven

# DAY 1

# Firstly it is necessary to install docker and after execute the command for Selenium Grid, on the main project path run:

```
docker-compose up
```

To stop the grid and cleanup the created containers, run:

```
docker-compose down
```

## Selenium Grid Hub index:
```
http://localhost:4444/ui/index.html#/
```

## Selenium Grid Hub endpoint (you need to add this endpoint on you RemoteDriver):

```
http://localhost:4444/wd/hub
```

## Selenium Grid Hub Status

```
http://localhost:4444/wd/hub/status
```

## You can see your tests executing from Chrome

Password: secret

Chrome:

```
localhost:7900
```

## For execute this automation testing project

```
mvn clean install
```
