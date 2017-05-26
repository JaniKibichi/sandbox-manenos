# Import the helper gateway class
from africastalking.AfricasTalkingGateway import (AfricasTalkingGateway, AfricasTalkingGatewayException)
#create a gateway instance
gateway = AfricasTalkingGateway("jani","680fdfa9eae83b8649c7d3884ad0679b827c7393140bc68b85e0e5b0a31dcb68")
#send airtime
gateway.sendAirtime([{"phoneNumber":"+254708415904", "amount":"KES 10" }])
