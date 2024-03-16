from flask import Flask, request, render_template

app = Flask(__name__)

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/write_file', methods=['POST'])
def write_file():
    content = request.form['content']

    # Specify the full path to the file
    file_path = './test'

    # Write content to the specified file path
    with open(file_path, 'w') as file:
        file.write(content)

    return 'Content written to file successfully.'

if __name__ == '__main__':
    app.run(debug=True)
