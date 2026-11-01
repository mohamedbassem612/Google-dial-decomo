package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alqa extends aosp {
    final /* synthetic */ ajcu a;

    public alqa(ajcu ajcuVar) {
        this.a = ajcuVar;
    }

    public final void a(aolr aolrVar, java.lang.Runnable runnable) {
        aooh.f(aolrVar, "context");
        aooh.f(runnable, "block");
        this.a.execute(runnable);
    }
}
