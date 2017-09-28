var http = require('http');

http.get(process.argv[2], function(response){
    var finalResult = '';

    response.setEncoding('utf8');
    response.on('data', function(result){
        finalResult += result + ' ';
    });
    response.on('end', function(result){
        console.log(finalResult);
    });
    response.on("error", function(error){
        console.error(error);
    });
});

// http.get(process.argv[2], function(response){
//     response.pipe(process.stdout)
// });