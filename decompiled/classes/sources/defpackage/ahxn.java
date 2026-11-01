package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class ahxn implements defpackage.ahyp {
    protected ahxn() {
    }

    public static defpackage.ahxn m(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return defpackage.ahxk.a;
        }
        if (length != 1) {
            return length != 2 ? new defpackage.ahwy(charSequence) : new defpackage.ahxe(charSequence.charAt(0), charSequence.charAt(1));
        }
        return new defpackage.ahxd(charSequence.charAt(0));
    }

    public static defpackage.ahxn n(java.lang.CharSequence charSequence) {
        return m(charSequence).f();
    }

    public static java.lang.String p(char c) {
        char[] cArr = new char[6];
        int i = 0;
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i2 = c;
        while (i < 4) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(i2 & 15);
            i++;
            i2 >>= 4;
        }
        return java.lang.String.copyValueOf(cArr);
    }

    private static defpackage.ahxn r(int i, java.util.BitSet bitSet, java.lang.String str) {
        int i2;
        if (i == 0) {
            return defpackage.ahxk.a;
        }
        if (i == 1) {
            return new defpackage.ahxd((char) bitSet.nextSetBit(0));
        }
        int iHighestOneBit = 2;
        if (i == 2) {
            char cNextSetBit = (char) bitSet.nextSetBit(0);
            return new defpackage.ahxe(cNextSetBit, (char) bitSet.nextSetBit(cNextSetBit + 1));
        }
        int length = bitSet.length();
        if (i > 1023 || length <= (i << 6)) {
            return new defpackage.ahxa(bitSet, str);
        }
        int iCardinality = bitSet.cardinality();
        boolean z = bitSet.get(0);
        if (iCardinality != 1) {
            iHighestOneBit = java.lang.Integer.highestOneBit(iCardinality - 1) << 1;
            while (((double) iHighestOneBit) * 0.5d < iCardinality) {
                iHighestOneBit <<= 1;
            }
        }
        char[] cArr = new char[iHighestOneBit];
        int i3 = iHighestOneBit - 1;
        int iNextSetBit = bitSet.nextSetBit(0);
        long j = 0;
        while (iNextSetBit != -1) {
            long j2 = (1 << iNextSetBit) | j;
            int iRotateLeft = java.lang.Integer.rotateLeft((-862048943) * iNextSetBit, 15) * 461845907;
            while (true) {
                i2 = iRotateLeft & i3;
                if (cArr[i2] == 0) {
                    break;
                }
                iRotateLeft = i2 + 1;
            }
            cArr[i2] = (char) iNextSetBit;
            iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
            j = j2;
        }
        return new ahyx(cArr, j, z, str);
    }

    @Override // defpackage.ahyp
    @java.lang.Deprecated
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj) {
        return c(((java.lang.Character) obj).charValue());
    }

    public void b(java.util.BitSet bitSet) {
        for (int i = 65535; i >= 0; i--) {
            if (c((char) i)) {
                bitSet.set(i);
            }
        }
    }

    public abstract boolean c(char c);

    public int d(java.lang.CharSequence charSequence) {
        return e(charSequence, 0);
    }

    public int e(java.lang.CharSequence charSequence, int i) {
        int length = charSequence.length();
        defpackage.ahvr.cm(i, length);
        while (i < length) {
            if (c(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public defpackage.ahxn f() {
        return new ahxi(this);
    }

    public java.lang.String g(java.lang.CharSequence charSequence) {
        java.lang.String string = charSequence.toString();
        int iD = d(string);
        if (iD == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i = 1;
        while (true) {
            iD++;
            while (iD != charArray.length) {
                if (c(charArray[iD])) {
                    i++;
                } else {
                    charArray[iD - i] = charArray[iD];
                    iD++;
                }
            }
            return new java.lang.String(charArray, 0, iD - i);
        }
    }

    public boolean h(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return true;
            }
        } while (c(charSequence.charAt(length)));
        return false;
    }

    public boolean i(java.lang.CharSequence charSequence) {
        return d(charSequence) == -1;
    }

    public java.lang.String j(java.lang.CharSequence charSequence) {
        java.lang.String string = charSequence.toString();
        int iD = d(string);
        if (iD == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iD] = '.';
        while (true) {
            iD++;
            if (iD >= charArray.length) {
                return new java.lang.String(charArray);
            }
            if (c(charArray[iD])) {
                charArray[iD] = '.';
            }
        }
    }

    public defpackage.ahxn k() {
        return o();
    }

    public final int l(java.lang.CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (c(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    public final defpackage.ahxn o() {
        java.util.BitSet bitSet = new java.util.BitSet();
        b(bitSet);
        int iCardinality = bitSet.cardinality();
        if ((iCardinality << 1) <= 65536) {
            return r(iCardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i = 65536 - iCardinality;
        java.lang.String string = toString();
        return new ahwv(this, r(i, bitSet, string.endsWith(".negate()") ? string.substring(0, string.length() - 9) : java.lang.String.valueOf(string).concat(".negate()")), string);
    }

    public final java.lang.String q(java.lang.CharSequence charSequence, int i, int i2, java.lang.StringBuilder sb, boolean z) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (!c(cCharAt)) {
                sb.append(cCharAt);
                z = false;
            } else if (!z) {
                sb.append(' ');
                z = true;
            }
            i++;
        }
        return sb.toString();
    }
}
