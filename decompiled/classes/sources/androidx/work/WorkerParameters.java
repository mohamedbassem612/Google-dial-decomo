package androidx.work;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class WorkerParameters {
    public final java.util.UUID a;
    public final defpackage.grp b;
    public final java.util.Set c;
    public final int d;
    public final java.util.concurrent.Executor e;
    public final defpackage.aolr f;
    public final defpackage.gta g;
    public final defpackage.grw h;
    public final defpackage.gou i;

    public WorkerParameters(java.util.UUID uuid, defpackage.grp grpVar, java.util.Collection collection, int i, java.util.concurrent.Executor executor, defpackage.aolr aolrVar, defpackage.gou gouVar, defpackage.gta gtaVar, defpackage.grw grwVar) {
        this.a = uuid;
        this.b = grpVar;
        this.c = new java.util.HashSet(collection);
        this.d = i;
        this.e = executor;
        this.f = aolrVar;
        this.i = gouVar;
        this.g = gtaVar;
        this.h = grwVar;
    }
}
