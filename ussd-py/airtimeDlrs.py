import sys
from flask import Flask
app = Flask(__name__)

@app.route('/api/airtime/dlr', methods=['POST'])
def airtimeReport():
	#reads the variables sent via POST from our gateway
	status = request.values.get('status', None)
	transactionId = request.values.get('transactionId', None)

	#update db etc
	print(status, transactionId, file=sys.stderr)

	resp = make_response('OK', 200)
	resp.headers['Content-Type'] ='text/plain'
	return resp

if __name__ == "__main__":
	app.run()
