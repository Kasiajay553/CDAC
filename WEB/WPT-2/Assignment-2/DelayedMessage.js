function showMessage(callback) {
    console.log("Processing...");

    setTimeout(callback, 2000);
}

showMessage(function() {
    console.log("Completed!");
});