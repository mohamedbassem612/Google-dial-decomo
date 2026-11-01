package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apiu implements java.lang.Iterable, defpackage.aoow {
    public static final defpackage.apiu a = new defpackage.apiu(new java.lang.String[0]);
    public final java.lang.String[] b;

    public apiu(java.lang.String[] strArr) {
        if (strArr == null) {
            defpackage.aooh.i("namesAndValues");
        }
        this.b = strArr;
    }

    public final int a() {
        return this.b.length >> 1;
    }

    public final java.lang.String b(java.lang.String str) {
        java.lang.String[] strArr = this.b;
        if (strArr == null) {
            defpackage.aooh.i("namesAndValues");
        }
        int length = strArr.length - 2;
        int iAl = defpackage.ajsz.al(length, 0, -2);
        if (iAl > length) {
            return null;
        }
        while (!defpackage.aoov.s(str, strArr[length], true)) {
            if (length == iAl) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.apiu) && java.util.Arrays.equals(this.b, ((defpackage.apiu) obj).b);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.b);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return defpackage.aoov.bg(this);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iA = a();
        for (int i = 0; i < iA; i++) {
            java.lang.String strBe = defpackage.aoov.be(this, i);
            java.lang.String strBf = defpackage.aoov.bf(this, i);
            sb.append(strBe);
            sb.append(": ");
            if (true == defpackage.apjv.l(strBe)) {
                strBf = "██";
            }
            sb.append(strBf);
            sb.append('\n');
        }
        return sb.toString();
    }
}
