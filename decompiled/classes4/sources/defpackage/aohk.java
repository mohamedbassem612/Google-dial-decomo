package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aohk extends ajac {
    public final ajsz a;

    public aohk(ajsz ajszVar) {
        this.a = ajszVar;
    }

    protected final java.lang.String b() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("clientCall", this.a);
        return ahymVarL.toString();
    }

    protected final void l() {
        this.a.dv("GrpcFuture was cancelled", (java.lang.Throwable) null);
    }
}
