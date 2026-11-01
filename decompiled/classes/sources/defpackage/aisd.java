package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aisd extends defpackage.aisg {
    final char[] a;

    public aisd(defpackage.aisc aiscVar) {
        super(aiscVar, null);
        this.a = new char[512];
        if (aiscVar.b.length != 16) {
            throw new java.lang.IllegalArgumentException();
        }
        for (int i = 0; i < 256; i++) {
            this.a[i] = aiscVar.a(i >>> 4);
            this.a[i | 256] = aiscVar.a(i & 15);
        }
    }

    @Override // defpackage.aisg, defpackage.aish
    public final int a(byte[] bArr, java.lang.CharSequence charSequence) throws defpackage.aisf {
        if (charSequence.length() % 2 == 1) {
            throw new defpackage.aisf("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            defpackage.aisc aiscVar = this.b;
            bArr[i2] = (byte) ((aiscVar.b(charSequence.charAt(i)) << 4) | aiscVar.b(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // defpackage.aisg
    public final defpackage.aish b(defpackage.aisc aiscVar, java.lang.Character ch) {
        return new defpackage.aisd(aiscVar);
    }

    @Override // defpackage.aisg, defpackage.aish
    public final void c(java.lang.Appendable appendable, byte[] bArr, int i) throws java.io.IOException {
        defpackage.ahvr.bX(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.a;
            appendable.append(cArr[i3]);
            appendable.append(cArr[i3 | 256]);
        }
    }
}
