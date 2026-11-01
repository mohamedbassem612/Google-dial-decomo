package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wtc extends defpackage.aftt {
    final /* synthetic */ defpackage.wtk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtc(defpackage.wtk wtkVar) {
        super(null);
        j$.util.Objects.requireNonNull(wtkVar);
        this.a = wtkVar;
    }

    @Override // defpackage.aftt
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, int i) {
        defpackage.wtk wtkVar = this.a;
        ahok ahokVarF = wtkVar.i.f(1108, "onDismissed endingXatuSnackbar");
        try {
            wtkVar.e(defpackage.wre.ERROR);
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
