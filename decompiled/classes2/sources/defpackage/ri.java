package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ri implements qr {
    public final defpackage.qt a;
    public final android.content.Context b;
    public final defpackage.rf c;
    private final android.app.appsearch.SearchResults d;
    private final java.util.concurrent.Executor e;

    public ri(android.app.appsearch.SearchResults searchResults, defpackage.qt qtVar, java.util.concurrent.Executor executor, android.content.Context context, defpackage.rf rfVar) {
        dzk.x(searchResults);
        this.d = searchResults;
        dzk.x(qtVar);
        this.a = qtVar;
        this.e = executor;
        this.b = context;
        this.c = rfVar;
    }

    public final ajcq a() {
        dsj dsjVar = new dsj();
        mp$.ExternalSyntheticApiModelOutline0.m(this.d, this.e, new defpackage.rh(this, dsjVar, 0));
        return dsjVar;
    }

    public final void b(defpackage.pv pvVar, defpackage.pw pwVar, java.lang.String str, java.util.Set set) {
        acc accVar = new acc(0);
        acb acbVar = new acb((acc) set);
        while (acbVar.hasNext()) {
            java.lang.String str2 = (java.lang.String) acbVar.next();
            if (str2.startsWith(java.lang.String.valueOf(str).concat("."))) {
                accVar.add(str2.substring(str.length() + 1));
            }
        }
        if (accVar.isEmpty()) {
            return;
        }
        defpackage.pv pvVar2 = new defpackage.pv(pwVar);
        for (java.lang.String str3 : pwVar.l()) {
            defpackage.pw pwVarC = pwVar.c(str3);
            if (pwVarC != null) {
                b(pvVar2, pwVarC, str3, accVar);
            } else if (!accVar.contains(str3)) {
                pvVar2.b(str3);
            }
        }
        pvVar.c(str, pvVar2.a());
    }

    public final void close() {
        mp$.ExternalSyntheticApiModelOutline0.m(this.d);
    }
}
