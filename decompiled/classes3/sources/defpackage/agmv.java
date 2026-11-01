package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agmv implements defpackage.agna {
    private final aw a;
    private final ahyn b;
    private ok c;
    private ok d;
    private final android.content.Intent e;
    private final boolean f;
    private final boolean g;
    private final ahgd h;

    public agmv(aw awVar, ahgd ahgdVar, ahyn ahynVar) {
        aooh.f(ahgdVar, "fragmentHost");
        this.a = awVar;
        this.h = ahgdVar;
        this.b = ahynVar;
        this.e = (android.content.Intent) ahynVar.a(new defpackage.adek(new defpackage.agkh(5), 18)).c(new fed(15));
        this.f = ((java.lang.Boolean) ahynVar.a(new defpackage.adek(new defpackage.agkh(6), 19)).c(new fed(16))).booleanValue();
        ((java.lang.Boolean) ahynVar.a(new defpackage.adek(new defpackage.agkh(7), 20)).c(new fed(17))).booleanValue();
        this.g = ahgdVar.a().ac();
    }

    @Override // defpackage.agna
    public final android.content.Intent a() {
        return this.e;
    }

    @Override // defpackage.agna
    public final ok b() {
        if (!this.b.f()) {
            throw new java.lang.UnsupportedOperationException("@ScreenFragment in FragmentHost cannot start Activities");
        }
        ok okVar = this.d;
        if (okVar != null) {
            return okVar;
        }
        aooh.j("_requirementActivityLauncher");
        return null;
    }

    @Override // defpackage.agna
    public final ok c() {
        if (!this.b.f()) {
            throw new java.lang.UnsupportedOperationException("@ScreenFragment in FragmentHost cannot start Activities");
        }
        ok okVar = this.c;
        if (okVar != null) {
            return okVar;
        }
        aooh.j("_switchAccountActivityLauncher");
        return null;
    }

    @Override // defpackage.agna
    public final void d(oi oiVar, oi oiVar2) {
        if (this.b.f()) {
            aw awVar = this.a;
            this.c = awVar.O(new pb(), oiVar);
            this.d = awVar.O(new pb(), oiVar2);
        }
    }

    @Override // defpackage.agna
    public final boolean e() {
        return this.b.f();
    }

    @Override // defpackage.agna
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.agna
    public final boolean g() {
        return this.g;
    }
}
