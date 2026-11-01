package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dkd implements defpackage.djd {
    public final int a;
    public final int b;
    public final long c;
    public final defpackage.dpa d;
    public final defpackage.dkg e;
    public final defpackage.dos f;
    public final int g;
    public final int h;
    public final defpackage.dpc i;

    public dkd(int i, int i2, long j, defpackage.dpa dpaVar, defpackage.dkg dkgVar, defpackage.dos dosVar, int i3, int i4, defpackage.dpc dpcVar) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = dpaVar;
        this.e = dkgVar;
        this.f = dosVar;
        this.g = i3;
        this.h = i4;
        this.i = dpcVar;
        defpackage.dpt[] dptVarArr = defpackage.dps.a;
        if (j == 2143289344 || java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) >= 0.0f) {
            return;
        }
        dnv.c("lineHeight can't be negative (" + java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + ')');
    }

    public final defpackage.dkd a(defpackage.dkd dkdVar) {
        return dkdVar != null ? defpackage.dke.a(this, dkdVar.a, dkdVar.b, dkdVar.c, dkdVar.d, dkdVar.e, dkdVar.f, dkdVar.g, dkdVar.h, dkdVar.i) : this;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dkd) {
            defpackage.dkd dkdVar = (defpackage.dkd) obj;
            if (this.a == dkdVar.a && this.b == dkdVar.b) {
                long j = this.c;
                long j2 = dkdVar.c;
                defpackage.dpt[] dptVarArr = defpackage.dps.a;
                if (j == j2 && defpackage.aooh.n(this.d, dkdVar.d) && defpackage.aooh.n(this.e, dkdVar.e) && defpackage.aooh.n(this.f, dkdVar.f) && this.g == dkdVar.g && this.h == dkdVar.h && defpackage.aooh.n(this.i, dkdVar.i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.dpt[] dptVarArr = defpackage.dps.a;
        defpackage.dpa dpaVar = this.d;
        int iHashCode = dpaVar != null ? dpaVar.hashCode() : 0;
        long j = this.c;
        int i = this.a;
        int i2 = this.b;
        defpackage.dkg dkgVar = this.e;
        int iHashCode2 = dkgVar != null ? dkgVar.hashCode() : 0;
        int i3 = (((((i * 31) + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + iHashCode;
        defpackage.dos dosVar = this.f;
        int iHashCode3 = ((((((((i3 * 31) + iHashCode2) * 31) + (dosVar != null ? dosVar.hashCode() : 0)) * 31) + this.g) * 31) + this.h) * 31;
        defpackage.dpc dpcVar = this.i;
        return iHashCode3 + (dpcVar != null ? dpcVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        int i = this.g;
        return "ParagraphStyle(textAlign=" + defpackage.dot.a(this.a) + ", textDirection=" + defpackage.dov.a(this.b) + ", lineHeight=" + defpackage.dps.c(this.c) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + defpackage.doo.a(i) + ", hyphens=" + defpackage.don.a(this.h) + ", textMotion=" + this.i + ')';
    }

    public dkd() {
        this(0, null, 511);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dkd(int i, defpackage.dpa dpaVar, int i2) {
        long j;
        if ((i2 & 4) != 0) {
            defpackage.dpt[] dptVarArr = defpackage.dps.a;
            j = 2143289344;
        } else {
            j = 0;
        }
        this(1 == (i2 & 1) ? 0 : i, 0, j, (i2 & 8) != 0 ? null : dpaVar, null, null, 0, 0, null);
    }
}
