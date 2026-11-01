package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahrr extends defpackage.afqs {
    final /* synthetic */ defpackage.afqs a;
    final /* synthetic */ defpackage.uzx b;

    public ahrr(defpackage.uzx uzxVar, defpackage.afqs afqsVar) {
        this.a = afqsVar;
        j$.util.Objects.requireNonNull(uzxVar);
        this.b = uzxVar;
    }

    @Override // defpackage.afqs
    public final void a(android.view.View view, int i) {
        if (ahns.q()) {
            this.a.a(view, i);
            return;
        }
        ahok ahokVarF = ((ahpz) this.b.a).f(1466, "onStateChanged");
        try {
            this.a.a(view, i);
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.afqs
    public final void b(android.view.View view) {
        if (ahns.q()) {
            return;
        }
        ((ahpz) this.b.a).f(1465, "onSlide").close();
    }
}
