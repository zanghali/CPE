var filesByExt = require ('./ex5.js');

filesByExt.getFilesByExt(process.argv[2], process.argv[3], (error, result) => {
    console.log(result);
});