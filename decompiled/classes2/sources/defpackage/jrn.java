package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jrn implements defpackage.meh {
    public final defpackage.jrp a;
    public final tcc b;
    private final aogc c;

    public jrn(defpackage.jrp jrpVar, tcc tccVar, aogc aogcVar) {
        aooh.f(aogcVar, "resultPropagator");
        this.a = jrpVar;
        this.b = tccVar;
        this.c = aogcVar;
    }

    public static /* synthetic */ void e(defpackage.jrn jrnVar) {
        jrnVar.d(ajcm.a);
    }

    public final ajcq a(boolean z, boolean z2) {
        tcc tccVar = this.b;
        ajcq ajcqVarF = aosv.F(tccVar.a, 0, new defpackage.jbu(tccVar, z, (aoln) null, 13), 3);
        if (z2) {
            d(ajcqVarF);
        }
        return ajcm.a;
    }

    public final ajcq b(boolean z, boolean z2) {
        ajcq ajcqVarB = this.b.b(z);
        if (z2) {
            d(ajcqVarB);
        }
        return ajcm.a;
    }

    @Override // defpackage.meh
    public final java.lang.Object c(boolean z, aoln aolnVar) {
        e(this);
        return aojh.a;
    }

    public final void d(ajcq ajcqVar) {
        aooh.f(ajcqVar, "future");
        this.c.s(ajcqVar, defpackage.jrp.a);
    }
}
