package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class drx {
    static final defpackage.drx a = new defpackage.drx(null, null);
    final java.lang.Runnable b;
    final java.util.concurrent.Executor c;
    defpackage.drx next;

    public drx(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
