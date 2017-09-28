var fs = require('fs');

function countLines (file, callback)
{
    fs.readFile(file, function(error, result){
        if (!!error){   // !! to cast it to bool
            callback(error);
            return;
        }

        callback(result.toString().split(/\r\n|\r|\n/).length);
    });
}

countLines(process.argv[2], function (result){
    console.log(result);
});