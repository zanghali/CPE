var fs = require('fs');
var path = require('path');

module.exports = {
    getFilesByExt : function (folder, ext, callback)
    {
        var result = [];

        fs.readdir(folder, (error, files) => {
            if (!!error){   // !! to cast it to bool
                return callback(error);
            }

            for(var file in files){
                if(path.extname(file) === '.' + ext)
                    result.push(file);
            };
            
            callback(null, result);
        })
    }
}
