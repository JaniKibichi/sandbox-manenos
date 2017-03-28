# Import the helper gateway class
from africastalking.AfricasTalkingGateway import (AfricasTalkingGateway, AfricasTalkingGatewayException)
#create a gateway instance
gateway = AfricasTalkingGateway("jani","d46192b5e6c1bdf6e24ae3760f5d49cde42e8b09d53f01fc929eec205996f5ce","sandbox")

productName  = "Good Morning"
phoneNumber  = "+254708415904"
currencyCode = "KES"
amount       = 100.50
metadata     = {"agentId"   : "654", "productId" : "321"}

gateway.initiateMobilePaymentCheckout(productName,phoneNumber,currencyCode,amount,metadata)



