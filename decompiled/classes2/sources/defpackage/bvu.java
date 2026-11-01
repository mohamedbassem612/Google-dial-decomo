package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class bvu extends dca {
    private final boolean a;
    private final ajl b;
    private final kaw d;

    public bvu(kaw kawVar, boolean z, ajl ajlVar) {
        this.d = kawVar;
        this.a = z;
        this.b = ajlVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.bvx(this.d, this.a, this.b);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.bvx bvxVar = (defpackage.bvx) cmvVar;
        bvxVar.h = this.d;
        boolean z = bvxVar.a;
        boolean z2 = this.a;
        if (z != z2) {
            cfo.u(bvxVar);
        }
        bvxVar.a = z2;
        bvxVar.b = this.b;
        if (bvxVar.e == null && !java.lang.Float.isNaN(bvxVar.g)) {
            bvxVar.e = aij.a(bvxVar.g);
        }
        if (bvxVar.d != null || java.lang.Float.isNaN(bvxVar.f)) {
            return;
        }
        bvxVar.d = aij.a(bvxVar.f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bvu) {
            defpackage.bvu bvuVar = (defpackage.bvu) obj;
            if (aooh.n(this.d, bvuVar.d) && this.a == bvuVar.a && aooh.n(this.b, bvuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.d.hashCode() * 31) + anty.L(this.a)) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ThumbElement(interactionSource=" + this.d + ", checked=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
