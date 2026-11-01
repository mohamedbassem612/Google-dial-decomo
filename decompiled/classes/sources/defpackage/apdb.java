package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class apdb extends defpackage.aott {
    private final java.lang.String a;
    private final defpackage.apcy b;

    public apdb(int i, int i2, long j, java.lang.String str) {
        this.a = str;
        this.b = new defpackage.apcy(i, i2, j, str);
    }

    @Override // defpackage.aosp
    public final void a(defpackage.aolr aolrVar, java.lang.Runnable runnable) {
        this.b.a(runnable, false, false);
    }

    public final void c(java.lang.Runnable runnable, boolean z) {
        this.b.a(runnable, true, z);
    }

    public void close() {
        this.b.f();
    }

    @Override // defpackage.aott
    public final java.util.concurrent.Executor h() {
        return this.b;
    }

    @Override // defpackage.aosp
    public final void i(defpackage.aolr aolrVar, java.lang.Runnable runnable) {
        this.b.a(runnable, false, true);
    }
}
