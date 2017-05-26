require 'sinatra'
require './AfricasTalkingGateway'
require 'dotenv'
Dotenv.load

#instantiate gateway
gateway = AfricasTalkingGateway.new(ENV['AT_API_USERNAME'], ENV['AT_API_KEY_LIVE'])

post '/ussd' do
 @sessionId = params[:sessionId]
 @serviceCode = params[:serviceCode]
 @phoneNumber = params[:phoneNumber]
 @text = params[:text]

 puts "text -#{@text} on - #{@phoneNumber}"

 if( @text == "" )
  # This is the first request. Note how we start the response with CON
  response  = "CON What would you like to do? \n"
  response += "1. is the value of happiness \n"
  response += "2. is the formula of laughing"

 elsif(@text=="1")
  # Your business logic to determine the account number goes here
  accountNumber  = "ACC1001"
  # This is a terminal request. Note how we start the response with END
  response = "END Your account number is $accountNumber"

 elsif(@text =="2")
  # Your business logic to determine the balance goes here
  balance  = "KES 1,000"
  # This is a terminal request. Note how we start the response with END
  response = "END Your balance is $balance"

 end
 # Print the response onto the page so that our gateway can read it
 body response
 status 200
end

get '/voice' do
  results = gateway.call("+254711082300","+254787235065")
  puts results
end
