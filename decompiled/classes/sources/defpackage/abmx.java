package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abmx {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final long l;
    private final long m;

    public abmx(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abmx) {
            defpackage.abmx abmxVar = (defpackage.abmx) obj;
            if (defpackage.anty.ah(this.a, abmxVar.a) && defpackage.anty.ah(this.b, abmxVar.b) && defpackage.anty.ah(this.c, abmxVar.c) && defpackage.anty.ah(this.d, abmxVar.d) && defpackage.anty.ah(this.e, abmxVar.e) && defpackage.anty.ah(this.f, abmxVar.f) && defpackage.anty.ah(this.g, abmxVar.g) && defpackage.anty.ah(this.h, abmxVar.h) && defpackage.anty.ah(this.i, abmxVar.i) && defpackage.anty.ah(this.j, abmxVar.j) && defpackage.anty.ah(this.k, abmxVar.k) && defpackage.anty.ah(this.l, abmxVar.l) && defpackage.anty.ah(this.m, abmxVar.m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = defpackage.anty.M(this.a) * 31;
        long j = this.m;
        long j2 = this.l;
        long j3 = this.k;
        long j4 = this.j;
        long j5 = this.i;
        long j6 = this.h;
        long j7 = this.g;
        long j8 = this.f;
        long j9 = this.e;
        long j10 = this.d;
        return ((((((((((((((((((((((iM + defpackage.anty.M(this.b)) * 31) + defpackage.anty.M(this.c)) * 31) + defpackage.anty.M(j10)) * 31) + defpackage.anty.M(j9)) * 31) + defpackage.anty.M(j8)) * 31) + defpackage.anty.M(j7)) * 31) + defpackage.anty.M(j6)) * 31) + defpackage.anty.M(j5)) * 31) + defpackage.anty.M(j4)) * 31) + defpackage.anty.M(j3)) * 31) + defpackage.anty.M(j2)) * 31) + defpackage.anty.M(j);
    }

    public final java.lang.String toString() {
        long j = this.m;
        long j2 = this.l;
        long j3 = this.k;
        long j4 = this.j;
        long j5 = this.i;
        long j6 = this.h;
        long j7 = this.g;
        long j8 = this.f;
        long j9 = this.e;
        long j10 = this.d;
        long j11 = this.c;
        long j12 = this.b;
        return "AbcBubbleColors(incomingXms=" + defpackage.cqg.g(this.a) + ", onIncomingXms=" + defpackage.cqg.g(j12) + ", outgoingXms=" + defpackage.cqg.g(j11) + ", onOutgoingXms=" + defpackage.cqg.g(j10) + ", incomingRcs=" + defpackage.cqg.g(j9) + ", onIncomingRcs=" + defpackage.cqg.g(j8) + ", outgoingRcsStart=" + defpackage.cqg.g(j7) + ", outgoingRcsEnd=" + defpackage.cqg.g(j6) + ", onOutgoingRcs=" + defpackage.cqg.g(j5) + ", selected=" + defpackage.cqg.g(j4) + ", onSelected=" + defpackage.cqg.g(j3) + ", selectedTextHandle=" + defpackage.cqg.g(j2) + ", selectedTextBackground=" + defpackage.cqg.g(j) + ')';
    }
}
