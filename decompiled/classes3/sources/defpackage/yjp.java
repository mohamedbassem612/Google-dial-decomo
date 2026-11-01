package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yjp {
    protected java.lang.String a;
    protected int b;
    protected int c;
    private defpackage.ygs d;

    public yjp(java.lang.String str) {
        this.b = 0;
        this.c = 0;
        this.d = new defpackage.ygs();
        java.lang.String strTrim = str.trim();
        this.a = strTrim;
        this.c = strTrim.length();
    }

    protected static final boolean r(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public final float a(float f) {
        if (java.lang.Float.isNaN(f)) {
            return Float.NaN;
        }
        o();
        return b();
    }

    public final float b() {
        float fA = this.d.a(this.a, this.b, this.c);
        if (!java.lang.Float.isNaN(fA)) {
            this.b = this.d.a;
        }
        return fA;
    }

    public final float c() {
        o();
        float fA = this.d.a(this.a, this.b, this.c);
        if (!java.lang.Float.isNaN(fA)) {
            this.b = this.d.a;
        }
        return fA;
    }

    protected final int d() {
        int i = this.b;
        int i2 = this.c;
        if (i != i2) {
            int i3 = i + 1;
            this.b = i3;
            if (i3 < i2) {
                return this.a.charAt(i3);
            }
        }
        return -1;
    }

    public final defpackage.yhh e() {
        float fB = b();
        if (java.lang.Float.isNaN(fB)) {
            return null;
        }
        int iP = p();
        return iP == 0 ? new defpackage.yhh(fB, 1) : new defpackage.yhh(fB, iP);
    }

    public final java.lang.Boolean f(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        o();
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        char cCharAt = this.a.charAt(i);
        if (cCharAt != '0') {
            if (cCharAt != '1') {
                return null;
            }
            cCharAt = '1';
        }
        this.b++;
        return java.lang.Boolean.valueOf(cCharAt == '1');
    }

    public final java.lang.Integer g() {
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        java.lang.String str = this.a;
        this.b = i + 1;
        return java.lang.Integer.valueOf(str.charAt(i));
    }

    public final java.lang.String h() {
        if (m()) {
            return null;
        }
        int i = this.b;
        char cCharAt = this.a.charAt(i);
        if (cCharAt != '\'') {
            if (cCharAt != '\"') {
                return null;
            }
            cCharAt = '\"';
        }
        int iD = d();
        while (iD != -1) {
            if (iD == cCharAt) {
                int i2 = this.b;
                this.b = i2 + 1;
                return this.a.substring(i + 1, i2);
            }
            iD = d();
        }
        this.b = i;
        return null;
    }

    public final java.lang.String i(char c) {
        if (!m()) {
            char cCharAt = this.a.charAt(this.b);
            if (!r(cCharAt) && cCharAt != c) {
                int i = this.b;
                int iD = d();
                while (iD != -1 && iD != c && !r(iD)) {
                    iD = d();
                }
                return this.a.substring(i, this.b);
            }
        }
        return null;
    }

    public final void j() {
        while (true) {
            int i = this.b;
            if (i >= this.c || !r(this.a.charAt(i))) {
                return;
            } else {
                this.b++;
            }
        }
    }

    public final boolean k(char c) {
        int i = this.b;
        boolean z = false;
        if (i < this.c && this.a.charAt(i) == c) {
            z = true;
        }
        if (z) {
            this.b++;
        }
        return z;
    }

    public final boolean l(java.lang.String str) {
        int i = this.b;
        int i2 = this.c;
        int length = str.length();
        boolean z = false;
        if (i <= i2 - length && this.a.substring(i, i + length).equals(str)) {
            z = true;
        }
        if (z) {
            this.b += length;
        }
        return z;
    }

    public final boolean m() {
        return this.b == this.c;
    }

    public final boolean n() {
        int i = this.b;
        if (i == this.c) {
            return false;
        }
        char cCharAt = this.a.charAt(i);
        return (cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z');
    }

    public final boolean o() {
        j();
        int i = this.b;
        if (i == this.c || this.a.charAt(i) != ',') {
            return false;
        }
        this.b++;
        j();
        return true;
    }

    public final int p() {
        if (m()) {
            return 0;
        }
        char cCharAt = this.a.charAt(this.b);
        int i = this.b;
        if (cCharAt == '%') {
            this.b = i + 1;
            return 9;
        }
        if (i > this.c - 2) {
            return 0;
        }
        try {
            int iR = defpackage.xfh.r(this.a.substring(i, i + 2).toLowerCase(java.util.Locale.US));
            this.b += 2;
            return iR;
        } catch (java.lang.IllegalArgumentException unused) {
            return 0;
        }
    }

    public final java.lang.String q() {
        int i;
        boolean zM = m();
        int i2 = this.b;
        if (zM) {
            i = i2;
        } else {
            int iCharAt = this.a.charAt(i2);
            if (iCharAt == 45) {
                iCharAt = d();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i = i2;
            } else {
                int iD = d();
                while (true) {
                    if ((iD < 65 || iD > 90) && ((iD < 97 || iD > 122) && !((iD >= 48 && iD <= 57) || iD == 45 || iD == 95))) {
                        break;
                    }
                    iD = d();
                }
                i = this.b;
            }
            this.b = i2;
        }
        if (i == i2) {
            return null;
        }
        java.lang.String strSubstring = this.a.substring(i2, i);
        this.b = i;
        return strSubstring;
    }

    public yjp(java.lang.String str, byte[] bArr) {
        this(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }
}
