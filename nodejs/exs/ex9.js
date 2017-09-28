var net = require('net');

var server = net.createServer(function(socket) {
	socket.write(new Date() + '\n');
	socket.end();
	// socket.pipe(socket);
});

server.listen(process.argv[2]);

// on test en appelant "nc localhost 'port'" depuis un autre terminal