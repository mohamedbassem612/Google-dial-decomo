package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anra implements java.lang.Runnable {
    final /* synthetic */ defpackage.anrb a;
    final /* synthetic */ java.lang.Runnable b;
    final /* synthetic */ anrc c;

    public anra(anrc anrcVar, defpackage.anrb anrbVar, java.lang.Runnable runnable) {
        this.a = anrbVar;
        this.b = runnable;
        j$.util.Objects.requireNonNull(anrcVar);
        this.c = anrcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.execute(this.a);
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.b.toString()).concat("(scheduled in SynchronizationContext)");
    }
}
