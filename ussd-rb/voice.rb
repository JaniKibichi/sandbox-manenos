require './AfricasTalkingGateway'
require 'dotenv'
Dotenv.load

#instantiate gateway
gateway = AfricasTalkingGateway.new(ENV['AT_API_USERNAME'], ENV['AT_API_KEY_LIVE'])

callFrom = "+254711082300"

callTo   = "+254787235065"

results = gateway.call(callFrom, callTo)

puts results