package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class re implements defpackage.qa {
    public final defpackage.rf a;
    private final android.app.appsearch.GlobalSearchSession b;
    private final java.util.concurrent.Executor c;
    private final android.content.Context d;
    private final java.util.Map e = new aca();
    private final defpackage.oq f;

    public re(android.app.appsearch.GlobalSearchSession globalSearchSession, java.util.concurrent.Executor executor, android.content.Context context, defpackage.rf rfVar) {
        dzk.x(globalSearchSession);
        this.b = globalSearchSession;
        this.c = executor;
        this.d = context;
        this.f = new defpackage.oq(context);
        this.a = rfVar;
    }

    @Override // defpackage.qi
    public final qr a(java.lang.String str, defpackage.qt qtVar) {
        dzk.x(str);
        dzk.x(qtVar);
        android.content.Context context = this.d;
        defpackage.rf rfVar = this.a;
        return new defpackage.ri(mp$.ExternalSyntheticApiModelOutline0.m(this.b, str, defpackage.rl.c(context, qtVar, rfVar)), qtVar, this.c, context, rfVar);
    }

    @Override // defpackage.qi
    public final ajcq b(java.lang.String str, java.lang.String str2, defpackage.px pxVar) {
        if (android.os.Build.VERSION.SDK_INT < 33) {
            throw new java.lang.UnsupportedOperationException("GLOBAL_SEARCH_SESSION_GET_BY_ID is not supported on this AppSearch implementation.");
        }
        dzk.x(str);
        dzk.x(str2);
        dzk.x(pxVar);
        dsj dsjVar = new dsj();
        android.app.appsearch.GlobalSearchSession globalSearchSession = this.b;
        dzk.x(pxVar);
        android.app.appsearch.GetByDocumentIdRequest.Builder builderM = mp$.ExternalSyntheticApiModelOutline0.m(new android.app.appsearch.GetByDocumentIdRequest.Builder(pxVar.a), pxVar.b());
        for (java.util.Map.Entry entry : pxVar.a().entrySet()) {
            mp$.ExternalSyntheticApiModelOutline0.m(builderM, (java.lang.String) entry.getKey(), (java.util.Collection) entry.getValue());
        }
        rd.a(globalSearchSession, str, str2, mp$.ExternalSyntheticApiModelOutline0.m(builderM), this.c, new defpackage.sc(dsjVar, new defpackage.jil(this, 1)));
        return dsjVar;
    }

    @Override // defpackage.qi
    public final ajcq c(java.lang.String str, java.lang.String str2) {
        if (android.os.Build.VERSION.SDK_INT < 33) {
            throw new java.lang.UnsupportedOperationException("GLOBAL_SEARCH_SESSION_GET_SCHEMA is not supported on this AppSearch implementation.");
        }
        dsj dsjVar = new dsj();
        rd.b(this.b, str, str2, this.c, new defpackage.fcg(dsjVar, 1));
        return dsjVar;
    }

    @Override // defpackage.qa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mp$.ExternalSyntheticApiModelOutline0.m(this.b);
    }

    @Override // defpackage.qi
    public final void d(java.lang.String str, defpackage.qz qzVar, java.util.concurrent.Executor executor, defpackage.qy qyVar) {
        dzk.x(str);
        dzk.x(qzVar);
        dzk.x(executor);
        dzk.x(qyVar);
        if (android.os.Build.VERSION.SDK_INT < 33) {
            throw new java.lang.UnsupportedOperationException("GLOBAL_SEARCH_SESSION_REGISTER_OBSERVER_CALLBACK is not supported on this AppSearch implementation");
        }
        java.util.Map map = this.e;
        synchronized (map) {
            aca acaVar = (java.util.Map) map.get(str);
            android.app.appsearch.observer.ObserverCallback observerCallbackM = acaVar != null ? ae$.ExternalSyntheticApiModelOutline0.m(acaVar.get(qyVar)) : null;
            if (observerCallbackM == null) {
                observerCallbackM = new defpackage.rc(qyVar);
            }
            try {
                android.app.appsearch.GlobalSearchSession globalSearchSession = this.b;
                dzk.x(qzVar);
                android.app.appsearch.observer.ObserverSpec.Builder builder = new android.app.appsearch.observer.ObserverSpec.Builder();
                if (qzVar.b == null) {
                    qzVar.b = j$.util.DesugarCollections.unmodifiableSet(new acc(qzVar.a));
                }
                rd.c(globalSearchSession, str, ae$.ExternalSyntheticApiModelOutline0.m(ae$.ExternalSyntheticApiModelOutline0.m(builder, qzVar.b)), executor, observerCallbackM);
                if (acaVar == null) {
                    acaVar = new aca();
                    this.e.put(str, acaVar);
                }
                acaVar.put(qyVar, observerCallbackM);
            } catch (android.app.appsearch.exceptions.AppSearchException e) {
                throw new defpackage.qv(mp$.ExternalSyntheticApiModelOutline0.m(e), mp$.ExternalSyntheticApiModelOutline0.m(e), mp$.ExternalSyntheticApiModelOutline0.m(e));
            }
        }
    }

    @Override // defpackage.qi
    public final void e(java.lang.String str, defpackage.qy qyVar) {
        dzk.x(str);
        dzk.x(qyVar);
        if (android.os.Build.VERSION.SDK_INT < 33) {
            throw new java.lang.UnsupportedOperationException("GLOBAL_SEARCH_SESSION_REGISTER_OBSERVER_CALLBACK is not supported on this AppSearch implementation");
        }
        java.util.Map map = this.e;
        synchronized (map) {
            java.util.Map map2 = (java.util.Map) map.get(str);
            if (map2 == null) {
                return;
            }
            android.app.appsearch.observer.ObserverCallback observerCallbackM = ae$.ExternalSyntheticApiModelOutline0.m(map2.get(qyVar));
            if (observerCallbackM == null) {
                return;
            }
            try {
                rd.d(this.b, str, observerCallbackM);
                map2.remove(qyVar);
                if (map2.isEmpty()) {
                    this.e.remove(str);
                }
            } catch (android.app.appsearch.exceptions.AppSearchException e) {
                throw new defpackage.qv(mp$.ExternalSyntheticApiModelOutline0.m(e), mp$.ExternalSyntheticApiModelOutline0.m(e), mp$.ExternalSyntheticApiModelOutline0.m(e));
            }
        }
    }

    @Override // defpackage.qi
    public final defpackage.oq f() {
        return this.f;
    }
}
