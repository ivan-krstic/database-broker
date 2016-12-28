# Database Broker REST WS Project

This is project to produce REST service for CRUD procedure.

## Introduction


## How to use

Database BrokerREST WS methods:

### Method for get WS status
GET	http://host:port/dbbroker/status


### Method for set XML document in DB
Request:
POST	http://host:port/dbbroker/create

Body:
	{
	    "data": "//Base64 of Client XML document"
	}


### Method for set PDF document in DB
Request:
PUT	http://host:port/dbbroker/update

Body:
	{
	    "id": 38,
	    "type": "pdf",
	    "data": "//Base64 of PDF document"
	}