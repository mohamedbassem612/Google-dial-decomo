package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agom implements emj {
    public final agti a;
    public defpackage.agny b;
    private final java.util.List c;
    private final ahgd d;

    public agom(ahgd ahgdVar) {
        aooh.f(ahgdVar, "fragmentHost");
        this.d = ahgdVar;
        this.a = new agti("KeepStateCallbacksHandler");
        this.c = new java.util.ArrayList();
        ahgdVar.P().c(this);
        ahgdVar.aT().e("tiktok_keep_state_callback_handler", new defpackage.agol(this, 0));
    }

    public final void a(emx emxVar) {
        ahgd ahgdVar = this.d;
        defpackage.agny agnyVar = null;
        android.os.Bundle bundleC = ((gim) ahgdVar.aT().a).b ? ahgdVar.aT().c("tiktok_keep_state_callback_handler") : null;
        if (bundleC != null) {
            this.a.e(bundleC);
            if (bundleC.containsKey("KSCH$AC$callbacks_id")) {
                if (!bundleC.containsKey("KSCH$AC$callbacks_state")) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                agnyVar = new defpackage.agny(bundleC.getInt("KSCH$AC$callbacks_id"), bundleC.getInt("KSCH$AC$callbacks_state"));
            } else if (bundleC.containsKey("KSCH$AC$callbacks_state")) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            this.b = agnyVar;
        }
        java.util.List list = this.c;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.d((defpackage.agok) it.next());
        }
        list.clear();
    }

    public final void g() {
        afec.c();
        defpackage.agny agnyVar = this.b;
        if (agnyVar != null) {
            if (agnyVar.b == 1) {
                ((defpackage.agok) this.a.b(agnyVar.a)).a();
            }
            this.b = null;
        }
    }

    public final void h() {
        afec.c();
        defpackage.agny agnyVar = this.b;
        aooh.c(agnyVar);
        int i = agnyVar.a;
        int i2 = agnyVar.b;
        defpackage.agok agokVar = (defpackage.agok) this.a.b(i);
        if (i2 == 1) {
            agokVar.a();
        }
        agokVar.c();
        this.b = null;
    }

    public final /* synthetic */ void b(emx emxVar) {
    }

    public final /* synthetic */ void c(emx emxVar) {
    }

    public final /* synthetic */ void e(emx emxVar) {
    }

    public final /* synthetic */ void f(emx emxVar) {
    }

    public final /* synthetic */ void fn(emx emxVar) {
    }
}
