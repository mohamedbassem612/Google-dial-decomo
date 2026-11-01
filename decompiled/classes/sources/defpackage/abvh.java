package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abvh {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/libraries/contacts/callingcard/impl/CallingCardRepositoryImpl");
    public final android.content.Context b;
    public final defpackage.aarf c;
    public final defpackage.aolr d;
    public final defpackage.aabx e;
    public final defpackage.aoir f;

    public abvh(android.content.Context context, defpackage.aarf aarfVar, defpackage.aolr aolrVar, defpackage.aabx aabxVar) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        if (aabxVar == null) {
            defpackage.aooh.i("googleApiAvailability");
        }
        this.b = context;
        this.c = aarfVar;
        this.d = aolrVar;
        this.e = aabxVar;
        this.f = new defpackage.aoiy(new defpackage.uob(this, 17));
    }
}
