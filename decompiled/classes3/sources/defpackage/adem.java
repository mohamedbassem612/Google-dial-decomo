package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adem implements java.io.Closeable {
    private final qa a;

    public adem(qa qaVar) {
        aooh.f(qaVar, "session");
        this.a = qaVar;
    }

    public final defpackage.qr a(java.lang.String str, qt qtVar) {
        aooh.f(str, "queryExpression");
        aooh.f(qtVar, "searchSpec");
        return this.a.a(str, qtVar);
    }

    public final ajcq b(java.lang.String str, java.lang.String str2, px pxVar) {
        aooh.f(str, "packageName");
        aooh.f(str2, "databaseName");
        aooh.f(pxVar, "request");
        return this.a.b(str, str2, pxVar);
    }

    public final ajcq c(java.lang.String str, java.lang.String str2) {
        return this.a.c(str, str2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final void d(java.lang.String str, qz qzVar, java.util.concurrent.Executor executor, qy qyVar) {
        aooh.f(str, "targetPackageName");
        aooh.f(qzVar, "spec");
        aooh.f(executor, "executor");
        aooh.f(qyVar, "observer");
        this.a.d(str, qzVar, executor, qyVar);
    }

    public final void e(java.lang.String str, qy qyVar) {
        aooh.f(str, "targetPackageName");
        aooh.f(qyVar, "observer");
        this.a.e(str, qyVar);
    }

    public final oq f() {
        return this.a.f();
    }
}
