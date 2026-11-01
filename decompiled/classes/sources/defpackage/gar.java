package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class gar implements defpackage.aoxi, defpackage.aood {
    final /* synthetic */ defpackage.gdg a;

    public gar(defpackage.gdg gdgVar) {
        this.a = gdgVar;
    }

    @Override // defpackage.aoxi
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) {
        java.lang.Object objA = this.a.a((defpackage.kgl) obj, aolnVar);
        return objA != defpackage.aolu.a ? defpackage.aojh.a : objA;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof defpackage.aoxi) && (obj instanceof defpackage.aood)) {
            return defpackage.aooh.n(ex(), ((defpackage.aood) obj).ex());
        }
        return false;
    }

    @Override // defpackage.aood
    public final defpackage.aoio ex() {
        return new defpackage.aoof(2, this.a, defpackage.gdg.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        return ex().hashCode();
    }
}
