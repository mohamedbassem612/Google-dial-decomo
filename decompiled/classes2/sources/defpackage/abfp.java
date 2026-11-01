package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abfp {
    public final long a;
    public final long b;
    public final long d;
    public final long f;
    public final long g;
    public final long h;
    public final long c = -904674731360256L;
    public final long e = -2556733901766656L;

    public abfp(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.d = j3;
        this.f = j4;
        this.g = j5;
        this.h = j6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abfp) {
            defpackage.abfp abfpVar = (defpackage.abfp) obj;
            if (anty.ah(this.a, abfpVar.a) && anty.ah(this.b, abfpVar.b)) {
                long j = abfpVar.c;
                if (anty.ah(-904674731360256L, -904674731360256L) && anty.ah(this.d, abfpVar.d)) {
                    long j2 = abfpVar.e;
                    if (anty.ah(-2556733901766656L, -2556733901766656L) && anty.ah(this.f, abfpVar.f) && anty.ah(this.g, abfpVar.g) && anty.ah(this.h, abfpVar.h)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = anty.M(this.a) * 31;
        long j = this.h;
        long j2 = this.g;
        long j3 = this.f;
        return ((((((((((((iM + anty.M(this.b)) * 31) + anty.M(-904674731360256L)) * 31) + anty.M(this.d)) * 31) + anty.M(-2556733901766656L)) * 31) + anty.M(j3)) * 31) + anty.M(j2)) * 31) + anty.M(j);
    }

    public final java.lang.String toString() {
        long j = this.h;
        long j2 = this.g;
        long j3 = this.f;
        long j4 = this.d;
        long j5 = this.b;
        return "TextAnnotationColors(linkColor=" + cqg.g(this.a) + ", baseColor=" + cqg.g(j5) + ", searchHighlight=" + cqg.g(-904674731360256L) + ", onSearchHighlight=" + cqg.g(j4) + ", searchHighlightFocused=" + cqg.g(-2556733901766656L) + ", onSearchHighlightFocused=" + cqg.g(j3) + ", tertiaryContainer=" + cqg.g(j2) + ", onTertiaryContainer=" + cqg.g(j) + ')';
    }
}
