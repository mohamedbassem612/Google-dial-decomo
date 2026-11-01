package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ahgy implements emv {
    final /* synthetic */ emp a;
    final /* synthetic */ aoot b;
    final /* synthetic */ aoss c;
    final /* synthetic */ emp d;
    final /* synthetic */ aosb e;
    final /* synthetic */ aonn f;
    final /* synthetic */ apdp g;

    public ahgy(emp empVar, aoot aootVar, aoss aossVar, emp empVar2, aosb aosbVar, apdp apdpVar, aonn aonnVar) {
        this.a = empVar;
        this.b = aootVar;
        this.c = aossVar;
        this.d = empVar2;
        this.e = aosbVar;
        this.g = apdpVar;
        this.f = aonnVar;
    }

    public final void a(emx emxVar, emp empVar) {
        aoub aoubVarAl;
        if (empVar != this.a) {
            if (empVar == this.d) {
                aoot aootVar = this.b;
                aoub aoubVar = (aoub) aootVar.a;
                if (aoubVar != null) {
                    aoubVar.s((java.util.concurrent.CancellationException) null);
                }
                aootVar.a = null;
            }
            if (empVar == emp.ON_DESTROY) {
                this.e.w(aojh.a);
                return;
            }
            return;
        }
        aoot aootVar2 = this.b;
        aoss aossVar = this.c;
        apdp apdpVar = this.g;
        aonn aonnVar = this.f;
        if (ahns.q()) {
            aols aolsVar = aols.a;
            ahre.c(aossVar);
            aoubVarAl = aoov.al(aossVar, afsq.K(aolsVar), 1, new defpackage.ahgx(null, apdpVar, aonnVar, 1, null));
        } else {
            java.util.UUID uuid = ahod.a;
            ahod ahodVar = new ahod("lifecycle state changed", ahod.a, ahod.b, ahot.a, ahns.a());
            ahns.u(ahodVar);
            try {
                aols aolsVar2 = aols.a;
                ahre.c(aossVar);
                aoubVarAl = aoov.al(aossVar, afsq.K(aolsVar2), 1, new defpackage.ahgx((aoln) null, apdpVar, aonnVar, 0));
                ajsz.ak(ahodVar, (java.lang.Throwable) null);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak(ahodVar, th);
                    throw th2;
                }
            }
        }
        aootVar2.a = aoubVarAl;
    }
}
