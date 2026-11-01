package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cog extends dca {
    public final crd b;
    public final boolean d;
    public final float a = 3.0f;
    public final long e = -72057594037927936L;
    public final long f = -72057594037927936L;

    public cog(crd crdVar, boolean z) {
        this.b = crdVar;
        this.d = z;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new cqc(new clc(this, 5));
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        cqc cqcVar = (cqc) cmvVar;
        cqcVar.a = new clc(this, 5);
        cqcVar.d();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.cog) {
            defpackage.cog cogVar = (defpackage.cog) obj;
            float f = cogVar.a;
            if (dpi.c(3.0f, 3.0f) && aooh.n(this.b, cogVar.b) && this.d == cogVar.d) {
                long j = cogVar.e;
                if (anty.ah(-72057594037927936L, -72057594037927936L)) {
                    long j2 = cogVar.f;
                    if (anty.ah(-72057594037927936L, -72057594037927936L)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((-943718400) + this.b.hashCode()) * 31) + anty.L(this.d)) * 31) + anty.M(-72057594037927936L)) * 31) + anty.M(-72057594037927936L);
    }

    public final java.lang.String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + dpi.b(3.0f) + ", shape=" + this.b + ", clip=" + this.d + ", ambientColor=" + cqg.g(-72057594037927936L) + ", spotColor=" + cqg.g(-72057594037927936L) + ')';
    }
}
