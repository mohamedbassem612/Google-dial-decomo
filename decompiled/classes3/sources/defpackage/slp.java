package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class slp {
    public final long a;
    public final long b;
    public final int c;
    public final double d;
    public final boolean e;

    public slp(long j, long j2, int i, double d, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = d;
        this.e = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.slp) {
            defpackage.slp slpVar = (defpackage.slp) obj;
            if (this.a == slpVar.a && this.b == slpVar.b && this.c == slpVar.c && java.lang.Double.compare(this.d, slpVar.d) == 0 && this.e == slpVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((int) this.a) * 31) + ((int) this.b)) * 31) + this.c) * 31) + anty.aB(this.d)) * 31) + anty.L(this.e);
    }

    public final java.lang.String toString() {
        return "FontColorUiData(color=" + this.a + ", originalColor=" + this.b + ", contentDescription=" + this.c + ", desiredContrast=" + this.d + ", isSmartColor=" + this.e + ')';
    }
}
