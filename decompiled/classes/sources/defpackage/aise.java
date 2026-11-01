package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aise extends defpackage.aisg {
    private aise(defpackage.aisc aiscVar, java.lang.Character ch) {
        super(aiscVar, ch);
        if (aiscVar.b.length != 64) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    @Override // defpackage.aisg, defpackage.aish
    public final int a(byte[] bArr, java.lang.CharSequence charSequence) throws defpackage.aisf {
        java.lang.CharSequence charSequenceH = h(charSequence);
        long length = charSequenceH.length();
        defpackage.aisc aiscVar = this.b;
        if (!aiscVar.f(length)) {
            throw new defpackage.aisf("Invalid input length " + charSequenceH.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceH.length()) {
            int i3 = i2 + 1;
            int iB = (aiscVar.b(charSequenceH.charAt(i)) << 18) | (aiscVar.b(charSequenceH.charAt(i + 1)) << 12);
            bArr[i2] = (byte) (iB >>> 16);
            int i4 = i + 2;
            if (i4 < charSequenceH.length()) {
                int i5 = i + 3;
                int iB2 = iB | (aiscVar.b(charSequenceH.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((iB2 >>> 8) & 255);
                if (i5 < charSequenceH.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iB2 | aiscVar.b(charSequenceH.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i = i4;
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.aisg
    public final defpackage.aish b(defpackage.aisc aiscVar, java.lang.Character ch) {
        return new defpackage.aise(aiscVar, ch);
    }

    @Override // defpackage.aisg, defpackage.aish
    public final void c(java.lang.Appendable appendable, byte[] bArr, int i) throws java.io.IOException {
        int i2 = 0;
        defpackage.ahvr.bX(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = bArr[i2] & 255;
            int i5 = bArr[i2 + 1] & 255;
            int i6 = bArr[i2 + 2] & 255;
            defpackage.aisc aiscVar = this.b;
            int i7 = (i4 << 16) | (i5 << 8) | i6;
            appendable.append(aiscVar.a(i7 >>> 18));
            appendable.append(aiscVar.a((i7 >>> 12) & 63));
            appendable.append(aiscVar.a((i7 >>> 6) & 63));
            appendable.append(aiscVar.a(i7 & 63));
            i2 += 3;
        }
        if (i2 < i) {
            i(appendable, bArr, i2, i - i2);
        }
    }

    public aise(java.lang.String str, java.lang.String str2, java.lang.Character ch) {
        this(new defpackage.aisc(str, str2.toCharArray()), ch);
    }
}
