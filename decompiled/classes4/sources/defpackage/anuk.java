package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anuk implements java.lang.Runnable {
    final defpackage.anuj a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ anph c;
    final /* synthetic */ defpackage.anpk d;
    final /* synthetic */ defpackage.aodj e;
    final /* synthetic */ anmb f;
    final /* synthetic */ defpackage.anul g;

    public anuk(defpackage.anul anulVar, java.lang.String str, anph anphVar, defpackage.anpk anpkVar, defpackage.aodj aodjVar, anmb anmbVar) {
        this.b = str;
        this.c = anphVar;
        this.d = anpkVar;
        this.e = aodjVar;
        this.f = anmbVar;
        j$.util.Objects.requireNonNull(anulVar);
        this.g = anulVar;
        this.a = new defpackage.anuj(str, anulVar.a, anulVar.e, anphVar, anulVar, this, anulVar.c, anulVar.f, anpkVar, aodjVar, anmbVar, anulVar.g);
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.anul anulVar = this.g;
        synchronized (anulVar.c) {
            if (anulVar.j) {
                this.a.p.l(anulVar.k, true, new anph());
            } else {
                if (!anulVar.l) {
                    throw new java.lang.AssertionError("Transport is not started");
                }
                defpackage.anuj anujVar = this.a;
                anulVar.d.add(anujVar);
                anujVar.p.h.r = anulVar.i;
            }
        }
    }
}
