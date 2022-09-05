object CeasarCipher extends App{

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    print("Shift by: ")
    var shift = scala.io.StdIn.readInt()

    print("Enter message: ")
    val text = scala.io.StdIn.readLine()

    print("Enter 1 to cipher, 2 to decipher: ")
    var n = scala.io.StdIn.readInt()

    if (n==1){
        print("Ciphered text: " +cipher(text))
    }
    else{
        print("Deciphered text: " +decipher(text))
    }
    
    def cipher(text: String):String = {
    val result = text.map( (c: Char) => { 
        val x = alphabet.indexOf(c.toUpper)
        if (x == -1){
            c
        }
        else{
            alphabet((x + shift) % alphabet.size)
        } 
    })
    return result;
    }

    def decipher(text:String):String = {
    val result = text.map( (c: Char) => { 
		val x = alphabet.indexOf(c.toUpper)
		if (x == -1){
			c
		}
		else{
			alphabet((x - shift) % alphabet.size)
		} 
	});
    return result;
    }

}