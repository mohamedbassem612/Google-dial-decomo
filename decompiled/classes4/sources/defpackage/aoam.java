package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoam extends defpackage.anol {
    final /* synthetic */ defpackage.aoap a;
    private final defpackage.aoap b;
    private final java.util.concurrent.atomic.AtomicBoolean c;

    public aoam(defpackage.aoap aoapVar, defpackage.aoap aoapVar2) {
        j$.util.Objects.requireNonNull(aoapVar);
        this.a = aoapVar;
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.b = aoapVar2;
    }

    @Override // defpackage.anol
    public final defpackage.anoh a(defpackage.anoi anoiVar) {
        if (this.c.compareAndSet(false, true)) {
            defpackage.aoap aoapVar = this.a;
            defpackage.aoap aoapVar2 = this.b;
            anrc anrcVarC = aoapVar.i.c();
            j$.util.Objects.requireNonNull(aoapVar2);
            anrcVarC.execute(new defpackage.aoai(aoapVar2, 3, (char[]) null));
        }
        return defpackage.anoh.d("pick_first: requesting connection");
    }
}
