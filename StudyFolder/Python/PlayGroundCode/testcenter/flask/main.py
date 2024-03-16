from flask import Flask
from flask import render_template

app = Flask(__name__)

@app.route("/")
def hello_world():
    return "<h1>Hello sexy</h1>"

@app.route('/1')
def first():
    return "<h1>Your Husband thinks you have a beautiful smile</h1>"

@app.route('/2')
def second():
    return "<h1>BUT THAT BOoooOoooOooOoOoOTY THOUGH!!!!</H1>"

@app.route('/hello/<name>')
def hello(name=None):
    return render_template('hello.html', name=name)

if __name__ == "__main__":
    app.run(debug=True)


