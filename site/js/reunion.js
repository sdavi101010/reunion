function sayHello() {
   alert("Hello");
}


function showImage(src, height, width, alt) {
	var img = document.createElement("img");

	img.src = src;
	img.height = height;
	img.width = width;
	img.alt = alt;

	// Add the image to the body
	document.body.appendChild(img);
}

function iAmHere() {
	alert("I am here ...");
}