# Be sure to import helper gateway class
from africastalking.AfricasTalkingGateway import (AfricasTalkingGateway, AfricasTalkingGatewayException)
# Create a new instance of our awesome gateway class
gateway  = AfricasTalkingGateway("jani", "680fdfa9eae83b8649c7d3884ad0679b827c7393140bc68b85e0e5b0a31dcb68")
# Make the call
results = gateway.call("+254711082300", "+254702456399,+254727487476,+254725033453")
