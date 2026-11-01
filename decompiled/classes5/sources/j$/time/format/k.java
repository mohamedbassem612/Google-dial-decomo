package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class k implements j$.time.format.e {
    public final j$.time.format.e a;
    public final int b;
    public final char c;

    public k(j$.time.format.e eVar, int i, char c) {
        this.a = eVar;
        this.b = i;
        this.c = c;
    }

    @Override // j$.time.format.e
    public final boolean h(j$.time.format.w wVar, java.lang.StringBuilder sb) {
        int length = sb.length();
        if (!this.a.h(wVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i = this.b;
        if (length2 <= i) {
            for (int i2 = 0; i2 < i - length2; i2++) {
                sb.insert(length, this.c);
            }
            return true;
        }
        throw new j$.time.DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
    }

    @Override // j$.time.format.e
    public final int k(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i) {
        int i2;
        boolean z = vVar.c;
        if (i > charSequence.length()) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (i != charSequence.length()) {
            int length = this.b + i;
            if (length <= charSequence.length()) {
                i2 = i;
                while (i2 < length && vVar.a(charSequence.charAt(i2), this.c)) {
                    i2++;
                }
                int iK = this.a.k(vVar, charSequence.subSequence(0, length), i2);
                if (iK == length && z) {
                    i += i2;
                }
            } else if (!z) {
                length = charSequence.length();
                i2 = i;
                while (i2 < length) {
                    i2++;
                }
                int iK2 = this.a.k(vVar, charSequence.subSequence(0, length), i2);
                return iK2 == length ? iK2 : iK2;
            }
        }
        return ~i;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String strValueOf = java.lang.String.valueOf(this.a);
        char c = this.c;
        if (c == ' ') {
            str = ")";
        } else {
            str = ",'" + c + "')";
        }
        return "Pad(" + strValueOf + "," + this.b + str;
    }
}
