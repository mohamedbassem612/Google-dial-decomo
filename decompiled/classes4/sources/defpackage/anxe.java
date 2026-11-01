package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
abstract class anxe implements defpackage.anwc {
    protected abstract defpackage.anwc a();

    public defpackage.anvp b(defpackage.anpk anpkVar, anph anphVar, anmb anmbVar, anmg[] anmgVarArr) {
        throw null;
    }

    public final anns c() {
        return a().c();
    }

    public final java.lang.Runnable d(anzt anztVar) {
        return a().d(anztVar);
    }

    public void q(anqw anqwVar) {
        a().q(anqwVar);
    }

    public void r(anqw anqwVar) {
        a().r(anqwVar);
    }

    @Override // defpackage.anwc
    public final defpackage.anlw t() {
        return a().t();
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("delegate", a());
        return ahymVarL.toString();
    }
}
