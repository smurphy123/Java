class Block {
    int a, b, c;
    int volume;
    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    // Return true if ob defined same block
    boolean sameBlock(Block ob) {
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) {
            return true;
        } else {
            return false;
        }
    }

    // Return true if ob has the same volume
    boolean sameVolume(Block ob) {
        if(ob.volume == volume) {
            return true;
        } else {
            return false;
        }
    }
    
}
