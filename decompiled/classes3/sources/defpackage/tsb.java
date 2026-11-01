package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tsb implements iqj, aood {
    final /* synthetic */ tsc a;

    public tsb(tsc tscVar) {
        this.a = tscVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(albh albhVar, aoln aolnVar) {
        java.lang.Object objA = this.a.a((tru) albhVar, aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof iqj) && (obj instanceof aood)) {
            return aooh.n(ex(), ((aood) obj).ex());
        }
        return false;
    }

    public final aoio ex() {
        return new aoof(2, this.a, tsc.class, "applySideEffect", "applySideEffect(Lcom/android/dialer/sharpie/impl/settings/datastore/SharpieSettingsData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        return ex().hashCode();
    }
}
