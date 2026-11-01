package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agfb extends defpackage.ageu {
    final /* synthetic */ defpackage.adsq a;

    public agfb(defpackage.adsq adsqVar) {
        j$.util.Objects.requireNonNull(adsqVar);
        this.a = adsqVar;
    }

    @Override // defpackage.ageu
    public final void a() {
        defpackage.agfc agfcVar = (defpackage.agfc) this.a.a;
        agfcVar.m.E("unlinkToDeath", new java.lang.Object[0]);
        agfcVar.l.a.unlinkToDeath(agfcVar.i, 0);
        agfcVar.l = null;
        agfcVar.f = false;
    }
}
