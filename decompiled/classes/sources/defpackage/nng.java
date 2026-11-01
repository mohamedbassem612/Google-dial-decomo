package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class nng implements defpackage.iqj, defpackage.aood {
    final /* synthetic */ defpackage.nni a;

    public nng(defpackage.nni nniVar) {
        this.a = nniVar;
    }

    @Override // defpackage.iqj
    public final /* bridge */ /* synthetic */ java.lang.Object a(defpackage.albh albhVar, defpackage.aoln aolnVar) {
        java.lang.Object objA = this.a.a((defpackage.nok) albhVar, aolnVar);
        return objA != defpackage.aolu.a ? defpackage.aojh.a : objA;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof defpackage.iqj) && (obj instanceof defpackage.aood)) {
            return defpackage.aooh.n(ex(), ((defpackage.aood) obj).ex());
        }
        return false;
    }

    @Override // defpackage.aood
    public final defpackage.aoio ex() {
        return new defpackage.aoof(2, this.a, defpackage.nni.class, "sideEffect", "sideEffect(Lcom/android/dialer/dobby/impl/settings/service/DobbySettingsData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        return ex().hashCode();
    }
}
