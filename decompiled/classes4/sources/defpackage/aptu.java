package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aptu implements defpackage.aptm {
    public final int a;
    public final java.lang.String b;
    public final defpackage.aptw c;

    public aptu(defpackage.aptw aptwVar, int i, java.lang.String str) {
        this.c = aptwVar;
        this.a = i;
        this.b = str.trim();
    }

    @Override // defpackage.aptm
    public final java.lang.String a() {
        int i = this.a;
        defpackage.aptw aptwVar = this.c;
        int i2 = aptwVar.b;
        int i3 = i + 1;
        int i4 = i + 2;
        if (i2 > i4 && aodc.v((char) (aptwVar.a(i3) & 255))) {
            i3 = i4;
        }
        java.lang.String strT = aodc.t(aptwVar, i3, i2 - i3);
        int length = strT.length();
        int i5 = defpackage.aptz.a;
        int i6 = 0;
        while (i6 < length) {
            char cCharAt = strT.charAt(i6);
            if (cCharAt == '\r' || cCharAt == '\n') {
                int length2 = strT.length();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(length2);
                if (i6 > 0) {
                    sb.append(strT.substring(0, i6));
                }
                while (true) {
                    i6++;
                    if (i6 >= length2) {
                        return sb.toString();
                    }
                    char cCharAt2 = strT.charAt(i6);
                    if (cCharAt2 != '\r' && cCharAt2 != '\n') {
                        sb.append(cCharAt2);
                    }
                }
            } else {
                i6++;
            }
        }
        return strT;
    }

    public final java.lang.String toString() {
        defpackage.aptw aptwVar = this.c;
        return aodc.t(aptwVar, 0, aptwVar.b);
    }
}
