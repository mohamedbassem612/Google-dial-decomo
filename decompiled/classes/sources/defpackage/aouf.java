package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aouf extends defpackage.aosc {
    private final defpackage.aoul f;

    public aouf(defpackage.aoln aolnVar, defpackage.aoul aoulVar) {
        super(aolnVar, 1);
        this.f = aoulVar;
    }

    @Override // defpackage.aosc
    protected final java.lang.String o() {
        return "AwaitContinuation";
    }

    @Override // defpackage.aosc
    public final java.lang.Throwable p(defpackage.aoub aoubVar) {
        java.lang.Throwable thD;
        java.lang.Object objE = this.f.E();
        if (!(objE instanceof defpackage.aouh) || (thD = ((defpackage.aouh) objE).d()) == null) {
            return objE instanceof defpackage.aosk ? ((defpackage.aosk) objE).b : aoubVar.o();
        }
        return thD;
    }
}
