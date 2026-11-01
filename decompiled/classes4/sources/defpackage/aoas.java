package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoas extends defpackage.anol {
    final /* synthetic */ defpackage.aoat a;
    private final java.util.concurrent.atomic.AtomicBoolean b;

    public aoas(defpackage.aoat aoatVar) {
        j$.util.Objects.requireNonNull(aoatVar);
        this.a = aoatVar;
        this.b = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // defpackage.anol
    public final defpackage.anoh a(defpackage.anoi anoiVar) {
        if (this.b.compareAndSet(false, true)) {
            defpackage.aoat aoatVar = this.a;
            anrc anrcVarC = aoatVar.g.c();
            j$.util.Objects.requireNonNull(aoatVar);
            anrcVarC.execute(new defpackage.aobd(aoatVar, 1));
        }
        return defpackage.anoh.d("pick_first: requesting connection");
    }
}
