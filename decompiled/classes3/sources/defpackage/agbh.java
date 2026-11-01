package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agbh implements java.lang.Runnable {
    int a;
    final /* synthetic */ defpackage.agbj b;

    public agbh(defpackage.agbj agbjVar) {
        j$.util.Objects.requireNonNull(agbjVar);
        this.b = agbjVar;
        this.a = -1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.v(this.a, 4);
    }
}
