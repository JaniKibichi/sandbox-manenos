# Be sure to import helper gateway class
from africastalking.AfricasTalkingGateway import (AfricasTalkingGateway, AfricasTalkingGatewayException)

# Specify your login credentials
username = "jani"
apikey   = "937d7d123463ebb47b6513f271c4e7ec7611fd92d3546599e36607637f256381"

callFrom = "+254722000000"
callTo   = "+254712534532"

# Create a new instance of our awesome gateway class
gateway  = AfricasTalkingGateway(username, apikey, "sandbox")

try:
	# Make the call
	results = gateway.call(callFrom, callTo)
	
	for result in results:
		# Only status "Queued" means the call was successfully placed
		print "Status : %s; phoneNumber : %s " % (result['status'], 
								result['phoneNumber'])
	
	# Our API will now contact your callback URL once recipient answers the call!
except AfricasTalkingGatewayException, e:
	print 'Encountered an error while making the call: %s' % str(e)