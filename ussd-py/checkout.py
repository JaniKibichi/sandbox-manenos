# Import the helper gateway class
from africastalking.AfricasTalkingGateway import (AfricasTalkingGateway, AfricasTalkingGatewayException)
#create a gateway instance
gateway = AfricasTalkingGateway("jani","680fdfa9eae83b8649c7d3884ad0679b827c7393140bc68b85e0e5b0a31dcb68")

productName  = "Nerd Payments"
phoneNumber  = "+254708415904,+254702456399"
currencyCode = "KES"
amount       = 10.50
metadata     = {"agentId"   : "654", "productId" : "321"}

gateway.initiateMobilePaymentCheckout("Nerd Payments","+254727487476","KES",10.50,{"agentId"   : "654", "productId" : "321"})



