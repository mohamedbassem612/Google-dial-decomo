package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agrw implements emj {
    final /* synthetic */ aw a;
    final /* synthetic */ defpackage.abtr b;

    public agrw(defpackage.abtr abtrVar, aw awVar) {
        this.a = awVar;
        j$.util.Objects.requireNonNull(abtrVar);
        this.b = abtrVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final void a(emx emxVar) {
        defpackage.abtr abtrVar = this.b;
        synchronized (abtrVar.d) {
            ?? r1 = abtrVar.b;
            for (java.util.Map.Entry entry : r1.entrySet()) {
                abtrVar.e((java.lang.String) entry.getKey(), (defpackage.agrv) entry.getValue());
            }
            r1.clear();
        }
        this.a.P().d(this);
    }

    public final /* synthetic */ void b(emx emxVar) {
    }

    public final /* synthetic */ void c(emx emxVar) {
    }

    public final /* synthetic */ void e(emx emxVar) {
    }

    public final /* synthetic */ void f(emx emxVar) {
    }

    public final /* synthetic */ void fn(emx emxVar) {
    }
}
