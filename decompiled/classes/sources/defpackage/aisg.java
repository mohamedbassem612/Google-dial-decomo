package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aisg extends defpackage.aish {
    private volatile defpackage.aish a;
    public final defpackage.aisc b;
    public final java.lang.Character c;
    public volatile defpackage.aish d;

    public aisg(defpackage.aisc aiscVar, java.lang.Character ch) {
        this.b = aiscVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            byte[] bArr = aiscVar.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z = false;
            }
        }
        defpackage.ahvr.bR(z, "Padding character %s was already in alphabet", ch);
        this.c = ch;
    }

    @Override // defpackage.aish
    public int a(byte[] bArr, java.lang.CharSequence charSequence) throws defpackage.aisf {
        int i;
        java.lang.CharSequence charSequenceH = h(charSequence);
        long length = charSequenceH.length();
        defpackage.aisc aiscVar = this.b;
        if (!aiscVar.f(length)) {
            throw new defpackage.aisf("Invalid input length " + charSequenceH.length());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequenceH.length()) {
            long jB = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = aiscVar.e;
                if (i4 >= i) {
                    break;
                }
                jB <<= aiscVar.d;
                if (i2 + i4 < charSequenceH.length()) {
                    jB |= (long) aiscVar.b(charSequenceH.charAt(i5 + i2));
                    i5++;
                }
                i4++;
            }
            int i6 = aiscVar.f;
            int i7 = i5 * aiscVar.d;
            int i8 = (i6 - 1) << 3;
            while (i8 >= (i6 << 3) - i7) {
                bArr[i3] = (byte) ((jB >>> i8) & 255);
                i8 -= 8;
                i3++;
            }
            i2 += i;
        }
        return i3;
    }

    public defpackage.aish b(defpackage.aisc aiscVar, java.lang.Character ch) {
        return new defpackage.aisg(aiscVar, ch);
    }

    @Override // defpackage.aish
    public void c(java.lang.Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        defpackage.ahvr.bX(0, i, bArr.length);
        while (i2 < i) {
            int i3 = this.b.f;
            i(appendable, bArr, i2, java.lang.Math.min(i3, i - i2));
            i2 += i3;
        }
    }

    @Override // defpackage.aish
    public final int d(int i) {
        return (int) (((((long) this.b.d) * ((long) i)) + 7) / 8);
    }

    @Override // defpackage.aish
    public final int e(int i) {
        defpackage.aisc aiscVar = this.b;
        return aiscVar.e * defpackage.aiql.ak(i, aiscVar.f, java.math.RoundingMode.CEILING);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aisg)) {
            return false;
        }
        defpackage.aisg aisgVar = (defpackage.aisg) obj;
        return this.b.equals(aisgVar.b) && j$.util.Objects.equals(this.c, aisgVar.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // defpackage.aish
    public final defpackage.aish f() {
        defpackage.aisc aiscVar;
        defpackage.aish aishVarB = this.a;
        if (aishVarB == null) {
            defpackage.aisc aiscVar2 = this.b;
            if (aiscVar2.e()) {
                defpackage.ahvr.bZ(!aiscVar2.d(), "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr = aiscVar2.b;
                char[] cArr2 = new char[cArr.length];
                for (int i = 0; i < cArr.length; i++) {
                    char c = cArr[i];
                    if (defpackage.ahvr.t(c)) {
                        c ^= 32;
                    }
                    cArr2[i] = (char) c;
                }
                aiscVar = new defpackage.aisc(aiscVar2.a.concat(".lowerCase()"), cArr2);
                if (aiscVar2.h) {
                    aiscVar = aiscVar.c();
                }
            } else {
                aiscVar = aiscVar2;
            }
            aishVarB = aiscVar == aiscVar2 ? this : b(aiscVar, this.c);
            this.a = aishVarB;
        }
        return aishVarB;
    }

    @Override // defpackage.aish
    public final defpackage.aish g() {
        return this.c != null ? b(this.b, null) : this;
    }

    @Override // defpackage.aish
    public final java.lang.CharSequence h(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        java.lang.Character ch = this.c;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ j$.util.Objects.hashCode(this.c);
    }

    final void i(java.lang.Appendable appendable, byte[] bArr, int i, int i2) {
        defpackage.ahvr.bX(i, i + i2, bArr.length);
        defpackage.aisc aiscVar = this.b;
        int i3 = aiscVar.f;
        if (i2 > i3) {
            throw new java.lang.IllegalArgumentException();
        }
        int i4 = 0;
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | ((long) (bArr[i + i5] & 255))) << 8;
        }
        int i6 = (i2 + 1) << 3;
        int i7 = aiscVar.d;
        while (i4 < (i2 << 3)) {
            appendable.append(aiscVar.a(((int) (j >>> ((i6 - i7) - i4))) & aiscVar.c));
            i4 += i7;
        }
        java.lang.Character ch = this.c;
        if (ch != null) {
            while (i4 < (i3 << 3)) {
                ch.charValue();
                appendable.append('=');
                i4 += i7;
            }
        }
    }

    @Override // defpackage.aish
    public final boolean j(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        java.lang.CharSequence charSequenceH = h(charSequence);
        defpackage.aisc aiscVar = this.b;
        if (!aiscVar.f(charSequenceH.length())) {
            return false;
        }
        for (int i = 0; i < charSequenceH.length(); i++) {
            char cCharAt = charSequenceH.charAt(i);
            if (cCharAt > 127 || aiscVar.g[cCharAt] == -1) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BaseEncoding.");
        defpackage.aisc aiscVar = this.b;
        sb.append(aiscVar);
        if (8 % aiscVar.d != 0) {
            java.lang.Character ch = this.c;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public aisg(java.lang.String str, java.lang.String str2, java.lang.Character ch) {
        this(new defpackage.aisc(str, str2.toCharArray()), ch);
    }
}
