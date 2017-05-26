# Import the helper gateway class
from africastalking.AfricasTalkingGateway import (AfricasTalkingGateway, AfricasTalkingGatewayException)
gateway = AfricasTalkingGateway("jani", "680fdfa9eae83b8649c7d3884ad0679b827c7393140bc68b85e0e5b0a31dcb68")
# You can provide up to 10 recipients at a time
gateway.mobilePaymentB2CRequest("Nerd Payments", [{"phoneNumber":"+254720726501","currencyCode":"KES","amount":10.50,"metadata":{"name": "Hello","reason" : "World"}}])

        
