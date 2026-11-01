package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xyl implements java.util.concurrent.ThreadFactory {
    private final /* synthetic */ int $cid;

    public xyl(int i) {
        this.$cid = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return this.$cid != 0 ? new java.lang.Thread(new defpackage.vet(this, runnable, 16), "glide-active-resources") : new defpackage.xyk(this, runnable);
    }
}
