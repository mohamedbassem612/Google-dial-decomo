package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
abstract class anxd implements defpackage.anvr {
    @Override // defpackage.anvr
    public void a(anqw anqwVar, defpackage.anvq anvqVar, anph anphVar) {
        throw null;
    }

    protected abstract defpackage.anvr b();

    @Override // defpackage.anvr
    public final void c(anph anphVar) {
        b().c(anphVar);
    }

    @Override // defpackage.aodm
    public final void d(defpackage.aodl aodlVar) {
        b().d(aodlVar);
    }

    @Override // defpackage.aodm
    public final void e() {
        b().e();
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("delegate", b());
        return ahymVarL.toString();
    }
}
