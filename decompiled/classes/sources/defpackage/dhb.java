package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final /* synthetic */ class dhb implements defpackage.dgb, defpackage.aood {
    final /* synthetic */ defpackage.caz a;

    public dhb(defpackage.caz cazVar) {
        this.a = cazVar;
    }

    @Override // defpackage.dgb
    public final cal a(defpackage.aomy aomyVar) {
        return this.a.b(aomyVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof defpackage.dgb) && (obj instanceof defpackage.aood)) {
            return defpackage.aooh.n(ex(), ((defpackage.aood) obj).ex());
        }
        return false;
    }

    @Override // defpackage.aood
    public final defpackage.aoio ex() {
        return new defpackage.aoof(1, this.a, defpackage.caz.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }

    public final int hashCode() {
        return ex().hashCode();
    }
}
