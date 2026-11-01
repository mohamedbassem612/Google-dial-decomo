package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adej implements qa {
    private final defpackage.addb a;
    private final adde b;
    private final java.util.concurrent.Executor c;

    public adej(defpackage.addb addbVar, adde addeVar, java.util.concurrent.Executor executor) {
        aooh.f(addbVar, "g3GlobalSearchSession");
        aooh.f(addeVar, "readerContext");
        aooh.f(executor, "executor");
        this.a = addbVar;
        this.b = addeVar;
        this.c = executor;
    }

    public final defpackage.qr a(java.lang.String str, qt qtVar) {
        aooh.f(str, "queryExpression");
        aooh.f(qtVar, "searchSpec");
        return new defpackage.adel(this.a.a(str, qtVar, this.b), this.c);
    }

    public final ajcq b(java.lang.String str, java.lang.String str2, px pxVar) {
        aooh.f(str, "packageName");
        aooh.f(str2, "databaseName");
        aooh.f(pxVar, "request");
        return ajan.f(this.a.b(str, str2, pxVar, this.b), new defpackage.adek(new defpackage.acsb(7), 1), this.c);
    }

    public final ajcq c(java.lang.String str, java.lang.String str2) {
        return this.a.c(str, str2);
    }

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
