package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaus implements defpackage.aaui, defpackage.aauh, defpackage.aaue {
    public final java.util.concurrent.CountDownLatch a = new java.util.concurrent.CountDownLatch(1);

    @Override // defpackage.aauh
    public final void a(java.lang.Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.aaue
    public final void b() {
        this.a.countDown();
    }

    @Override // defpackage.aaui
    public final void d(java.lang.Object obj) {
        this.a.countDown();
    }
}
