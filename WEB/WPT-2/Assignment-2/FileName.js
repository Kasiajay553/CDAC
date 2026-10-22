function downloadFile(filename, callback) {
    console.log("Downloading " + filename + "...");

    setTimeout(() => {
        callback("Download complete!");
    }, 2000);
}

downloadFile("nikhil", (message) => {
    console.log(message);
});