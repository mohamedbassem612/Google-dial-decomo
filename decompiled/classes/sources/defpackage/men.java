package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class men {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/darpa/impl/DarpaComponentEnabledStateUpdater");
    public final android.content.Context b;
    public final defpackage.aolr c;
    private final defpackage.zzx d;

    public men(android.content.Context context, defpackage.aolr aolrVar, defpackage.zzx zzxVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        this.b = context;
        this.c = aolrVar;
        this.d = zzxVar;
    }

    public final int a(defpackage.meg megVar) {
        return this.d.e().contains(megVar) ? 1 : 2;
    }
}
