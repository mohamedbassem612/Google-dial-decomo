package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class byb extends defpackage.bxl {
    private final aomy a;
    private final long b;
    private final long d;
    private final csm e;
    private final csm f;
    private final float g;
    private final aonj h;

    public byb(aomy aomyVar, long j, long j2, csm csmVar, csm csmVar2, float f, aonj aonjVar) {
        this.a = aomyVar;
        this.b = j;
        this.d = j2;
        this.e = csmVar;
        this.f = csmVar2;
        this.g = f;
        this.h = aonjVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.byf(this.a, this.h, this.b, this.d, this.e, this.f, this.g);
    }

    @Override // defpackage.bxl
    public final /* synthetic */ void e(cmv cmvVar) {
        defpackage.byf byfVar = (defpackage.byf) cmvVar;
        long j = byfVar.a;
        long j2 = this.b;
        if (!anty.ah(j, j2)) {
            byfVar.a = j2;
            byfVar.b();
        }
        long j3 = this.d;
        if (!anty.ah(byfVar.b, j3)) {
            byfVar.b = j3;
            byfVar.b();
        }
        csm csmVar = this.e;
        if (!aooh.n(byfVar.c, csmVar)) {
            byfVar.c = csmVar;
            byfVar.d();
        }
        csm csmVar2 = this.f;
        if (!aooh.n(byfVar.d, csmVar2)) {
            byfVar.d = csmVar2;
            byfVar.d();
        }
        float f = this.g;
        if (!dpi.c(byfVar.e, f)) {
            byfVar.e = f;
            byfVar.d();
        }
        if (!dpi.c(byfVar.f, 75.398224f)) {
            byfVar.f = 75.398224f;
            byfVar.e();
        }
        float f2 = byfVar.g;
        if (!dpi.c(0.0f, 0.0f)) {
            byfVar.g = 0.0f;
            byfVar.e();
        }
        aomy aomyVar = byfVar.n;
        aomy aomyVar2 = this.a;
        if (aomyVar == aomyVar2 && byfVar.o == this.h) {
            return;
        }
        byfVar.n = aomyVar2;
        byfVar.o = this.h;
        byfVar.s.b();
    }

    @Override // defpackage.bxl
    public final boolean equals(java.lang.Object obj) {
        if (!super.equals(obj) || !(obj instanceof defpackage.byb)) {
            return false;
        }
        defpackage.byb bybVar = (defpackage.byb) obj;
        return this.a == bybVar.a && this.h == bybVar.h;
    }

    @Override // defpackage.bxl
    public final float f() {
        return this.g;
    }

    @Override // defpackage.bxl
    public final long g() {
        return this.b;
    }

    @Override // defpackage.bxl
    public final long h() {
        return this.d;
    }

    @Override // defpackage.bxl
    public final int hashCode() {
        return (((super.hashCode() * 31) + this.a.hashCode()) * 31) + this.h.hashCode();
    }

    @Override // defpackage.bxl
    public final csm i() {
        return this.e;
    }

    @Override // defpackage.bxl
    public final csm j() {
        return this.f;
    }

    @Override // defpackage.bxl
    public final void k() {
    }

    @Override // defpackage.bxl
    public final void l() {
    }
}
