package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final /* synthetic */ class dec implements dgb, aood {
    final /* synthetic */ caz a;

    public dec(caz cazVar) {
        this.a = cazVar;
    }

    public final defpackage.cal a(aomy aomyVar) {
        return this.a.b(aomyVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof dgb) && (obj instanceof aood)) {
            return aooh.n(ex(), ((aood) obj).ex());
        }
        return false;
    }

    public final aoio ex() {
        return new aoof(1, this.a, caz.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }

    public final int hashCode() {
        return ex().hashCode();
    }
}
