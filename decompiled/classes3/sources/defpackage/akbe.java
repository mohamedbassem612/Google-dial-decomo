package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akbe extends defpackage.anqa {
    final /* synthetic */ defpackage.akbf a;
    private anph b;
    private boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akbe(defpackage.akbf akbfVar, anty antyVar) {
        super(antyVar);
        aooh.f(antyVar, "listener");
        this.a = akbfVar;
    }

    @Override // defpackage.anqa
    public final void a(anqw anqwVar, anph anphVar) {
        boolean z;
        aooh.f(anqwVar, "status");
        aooh.f(anphVar, "metadata");
        defpackage.akbf akbfVar = this.a;
        defpackage.akbg akbgVar = akbfVar.g;
        synchronized (akbfVar.a) {
            z = false;
            if (!this.c && ((java.lang.Boolean) akbgVar.a.a(anqwVar, anphVar)).booleanValue()) {
                z = true;
            }
        }
        if (!z) {
            anph anphVar2 = this.b;
            if (anphVar2 != null) {
                this.f.c(anphVar2);
                this.b = null;
            }
            this.f.a(anqwVar, anphVar);
            return;
        }
        defpackage.akbf akbfVar2 = this.a;
        anmb anmbVar = akbfVar2.e;
        defpackage.akbg akbgVar2 = akbfVar2.g;
        anmv anmvVar = akbfVar2.f;
        anmc anmcVar = akbfVar2.c;
        anpk anpkVar = akbfVar2.d;
        synchronized (akbfVar2.a) {
            akbfVar2.j = defpackage.agwm.w(anmvVar, anmcVar, anpkVar, (anmb) akbgVar2.b.a(anmbVar));
            for (java.lang.Object obj : akbfVar2.b) {
                aooh.e(obj, "next(...)");
                ((java.lang.Runnable) obj).run();
            }
        }
    }

    @Override // defpackage.anqa
    public final void c(anph anphVar) {
        aooh.f(anphVar, "metadata");
        this.b = anphVar;
    }

    @Override // defpackage.anqa
    public final void d(java.lang.Object obj) {
        anph anphVar = this.b;
        if (anphVar != null) {
            this.f.c(anphVar);
            this.b = null;
            this.c = true;
        }
        this.f.d(obj);
    }
}
