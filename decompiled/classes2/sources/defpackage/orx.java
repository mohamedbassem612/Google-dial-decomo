package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class orx {
    public static final aimz a = aimz.i("com/android/dialer/imageprocessor/DialerImageProcessor");
    public final android.content.Context b;
    public final aolr c;
    public final aoin d;

    public orx(android.content.Context context, aolr aolrVar, ojo ojoVar, aazc aazcVar, aoin aoinVar) {
        aooh.f(context, "context");
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(ojoVar, "dialerContentResolver");
        aooh.f(aazcVar, "clock");
        this.b = context;
        this.c = aolrVar;
        this.d = aoinVar;
    }

    public static final afaw a(android.net.Uri uri) {
        if (aoov.s(uri.getHost(), "com.google.android.gms.fileprovider", false)) {
            afaw afawVar = afaw.a;
            aooh.e(afawVar, "EXTERNAL_ONLY");
            return afawVar;
        }
        afaw afawVar2 = afaw.b;
        aooh.e(afawVar2, "INTERNAL_ONLY");
        return afawVar2;
    }
}
