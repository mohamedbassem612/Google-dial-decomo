package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hyp {
    public static final aimz a = aimz.i("com/android/dialer/audio/audioinjector/fileprovider/StaticFileProvider");
    public final android.content.Context b;
    public final aolr c;

    public hyp(android.content.Context context, aolr aolrVar, aoss aossVar) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(aossVar, "lightweightScope");
        this.b = context;
        this.c = aolrVar;
    }

    public final java.lang.String a(defpackage.hxy hxyVar) {
        java.lang.String resourceEntryName = this.b.getResources().getResourceEntryName(hxyVar.a);
        aooh.e(resourceEntryName, "getResourceEntryName(...)");
        return resourceEntryName;
    }
}
