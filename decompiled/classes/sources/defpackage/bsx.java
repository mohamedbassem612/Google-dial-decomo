package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class bsx implements defpackage.any {
    public final long a;
    private final boolean b;
    private final float c;
    private final defpackage.cqi d;
    private final defpackage.crd e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    public bsx(boolean z, float f, long j, defpackage.crd crdVar, boolean z2, boolean z3) {
        if (crdVar == null) {
            defpackage.dpi dpiVar = new defpackage.dpi(f);
            dpiVar = java.lang.Float.compare(dpiVar.a, Float.NaN) == 0 ? null : dpiVar;
            if (dpiVar != null) {
                float f2 = dpiVar.a;
                defpackage.bgc bgcVar = defpackage.bge.a;
                defpackage.bfz bfzVar = new defpackage.bfz(f2);
                crdVar = new defpackage.bgc(bfzVar, bfzVar, bfzVar, bfzVar);
            } else {
                crdVar = null;
            }
            if (crdVar == null) {
                crdVar = defpackage.cqz.a;
            }
        }
        this.b = z;
        this.c = f;
        this.d = null;
        this.a = j;
        this.e = crdVar;
        this.f = z2;
        this.g = z3;
        this.h = true;
        this.i = true;
    }

    @Override // defpackage.ans
    public final /* synthetic */ aog a(defpackage.cav cavVar) {
        return rk.e(cavVar);
    }

    @Override // defpackage.any
    public final defpackage.dao b(defpackage.kaw kawVar) {
        defpackage.bpb bpbVar = new defpackage.bpb(this, 2);
        return new defpackage.bpc(kawVar, this.b, this.c, bpbVar, this.f, this.g);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bsx) {
            defpackage.bsx bsxVar = (defpackage.bsx) obj;
            if (this.b == bsxVar.b && defpackage.dpi.c(this.c, bsxVar.c)) {
                defpackage.cqi cqiVar = bsxVar.d;
                if (defpackage.aooh.n(null, null) && defpackage.anty.ah(this.a, bsxVar.a) && defpackage.aooh.n(this.e, bsxVar.e) && this.f == bsxVar.f && this.g == bsxVar.g) {
                    boolean z = bsxVar.h;
                    boolean z2 = bsxVar.i;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.any
    public final int hashCode() {
        return (((((((((((((defpackage.anty.L(this.b) * 31) + java.lang.Float.floatToIntBits(this.c)) * 961) + defpackage.anty.M(this.a)) * 31) + this.e.hashCode()) * 31) + defpackage.anty.L(this.f)) * 31) + defpackage.anty.L(this.g)) * 31) + defpackage.anty.L(true)) * 31) + defpackage.anty.L(true);
    }
}
