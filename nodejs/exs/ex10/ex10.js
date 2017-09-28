var fs = require('fs');
var http = require('http');
var url = require('url');
var CONFIG = require('./config.json');

var server = http.createServer((request, response) => {
    var filePath = url.parse(request.url).pathname;
    
    filePath = path.join(CONFIG.publicDir, filePath);

    fs.access(filePath, fs.R_OK, (error) => {   // On vérifie si on a accès au fichier
        if (!!error){
            response.writeHead(404);
            response.end('Not found !!');
        }

        fs.readFile(filePath, (error, data) => {
            if (!!error){
                response.writeHead(500);
                response.end('ERROR 500 !!');
            }

            response.writeHead(200);
            response.end(data);
        })
    })
});

server.listen(CONFIG.port, (error) => {
    if (!!error){
        console.error(error);
        return;
    }

    console.log('Server Started');
});

