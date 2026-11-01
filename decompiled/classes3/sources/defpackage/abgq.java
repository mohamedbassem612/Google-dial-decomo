package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abgq {
    public final aoss a;
    public final bry b;
    public final defpackage.abfs c;
    public final apy d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public boolean i;
    public final aii j;
    public final aii k;
    public final aii l;
    public final aii m;
    public final aii n;
    public final aii o;
    public final aii p;
    public final aii q;
    public final aii r;
    public final aii s;
    public final aii t;
    public final defpackage.abgi u;
    public final kaw v;
    private final cer w;
    private final ccp x;

    public abgq(aoss aossVar, bry bryVar, kaw kawVar, cer cerVar, defpackage.abfs abfsVar, apy apyVar, long j, long j2, long j3, long j4, boolean z) {
        aooh.f(aossVar, "scope");
        aooh.f(kawVar, "puckDraggableInteractionSource");
        aooh.f(cerVar, "isDraggingState");
        this.a = aossVar;
        this.b = bryVar;
        this.v = kawVar;
        this.w = cerVar;
        this.c = abfsVar;
        this.d = apyVar;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = z;
        this.j = aij.a(0.0f);
        this.k = aij.a(0.0f);
        dpi dpiVar = new dpi(0.0f);
        nf nfVar = alo.c;
        this.l = new aii(dpiVar, nfVar, (java.lang.Object) null, "Animatable");
        this.m = new aii(new dpi(0.0f), nfVar, (java.lang.Object) null, "Animatable");
        this.n = aij.a(true != this.i ? 0.0f : 135.0f);
        cqg cqgVar = new cqg(j);
        aonj aonjVar = afn.a;
        float[] fArr = crp.a;
        this.o = new aii(cqgVar, (nf) aonjVar.a(crp.y[(int) (j & 63)]), (java.lang.Object) null, "Animatable");
        this.p = aij.a(0.0f);
        this.q = aij.a(0.0f);
        this.r = aij.a(0.0f);
        this.s = aij.a(0.0f);
        this.x = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, cdu.c);
        this.t = new aii(new dpi(abfsVar.d), nfVar, (java.lang.Object) null, "Animatable");
        defpackage.abgi abgiVar = new defpackage.abgi(aossVar);
        this.u = abgiVar;
        defpackage.abgd abgdVar = new defpackage.abgd(this, 10);
        defpackage.abgd abgdVar2 = new defpackage.abgd(this, 11);
        defpackage.abgd abgdVar3 = new defpackage.abgd(this, 12);
        defpackage.abgd abgdVar4 = new defpackage.abgd(this, 13);
        defpackage.abgd abgdVar5 = new defpackage.abgd(this, 14);
        abgiVar.b(ajsz.bT(abgiVar.a(), ajsz.bb(new defpackage.abhg[]{new defpackage.abhf(abgdVar, abgdVar2, false), new defpackage.abhe(abgdVar4, abgdVar5, false), new defpackage.abhd(abgdVar4, abgdVar5, false), new defpackage.abhe(new defpackage.abgd(abgdVar3, 8), 2), new defpackage.abhd(new defpackage.abgd(abgdVar3, 9), 2)})));
    }

    public final float a() {
        return this.d.c() / this.c.g;
    }

    public final void b(boolean z) {
        this.x.b(java.lang.Boolean.valueOf(z));
    }

    public final boolean c() {
        if (((java.lang.Boolean) this.x.a()).booleanValue()) {
            apy apyVar = this.d;
            if (!apyVar.o() && !((java.lang.Boolean) this.w.a()).booleanValue() && apyVar.k() == defpackage.abgy.b && a() == 0.0f) {
                return true;
            }
        }
        return false;
    }
}
