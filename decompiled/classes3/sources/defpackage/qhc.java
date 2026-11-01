package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class qhc extends na {
    final /* synthetic */ defpackage.qhj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhc(defpackage.qhj qhjVar) {
        super(false);
        j$.util.Objects.requireNonNull(qhjVar);
        this.a = qhjVar;
    }

    public final void b() {
        defpackage.qhj qhjVar = this.a;
        if (qhjVar.e().e) {
            j$.util.Optional optionalF = qhjVar.f();
            if (true == optionalF.isPresent()) {
                ((defpackage.qfj) optionalF.get()).a();
            }
        }
    }
}
