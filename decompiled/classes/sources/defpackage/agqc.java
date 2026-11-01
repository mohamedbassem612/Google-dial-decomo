package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agqc extends defpackage.ajby {
    final /* synthetic */ defpackage.aogc a;
    private final defpackage.ajcq b;

    public agqc(defpackage.aogc aogcVar, defpackage.ajcq ajcqVar) {
        j$.util.Objects.requireNonNull(aogcVar);
        this.a = aogcVar;
        this.b = ajcqVar;
    }

    @Override // defpackage.ajby, defpackage.ajcq
    public final void c(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        if (isDone()) {
            this.b.c(runnable, executor);
        }
        this.b.c(runnable, new defpackage.agqe(this.a, executor, 1));
    }

    @Override // defpackage.ajby
    protected final defpackage.ajcq eW() {
        return this.b;
    }

    @Override // defpackage.ajby
    protected final /* synthetic */ java.util.concurrent.Future eX() {
        return this.b;
    }

    @Override // defpackage.aiey
    protected final /* synthetic */ java.lang.Object fp() {
        return this.b;
    }
}
