# Import the helper gateway class
from AfricasTalkingGateway import AfricasTalkingGateway, AfricasTalkingGatewayException
#create a gateway instance
gateway = AfricasTalkingGateway("jani","e880c35360e9fba107c480365f3094eb836e01167096495bc4e4b0d6c71058ee","sandbox")
#send airtime
gateway.sendAirtime([{"phoneNumber":"+254787235065", "amount":"KES 20" }])
