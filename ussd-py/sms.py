from africastalking.AfricasTalkingGateway import (AfricasTalkingGateway, AfricasTalkingGatewayException)

#create a gateway instance
gateway = AfricasTalkingGateway("jani","d46192b5e6c1bdf6e24ae3760f5d49cde42e8b09d53f01fc929eec205996f5ce","sandbox")
#send message
gateway.sendMessage("+254708415904","Hello......")
