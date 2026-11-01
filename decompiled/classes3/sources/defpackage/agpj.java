package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agpj {
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ agpj(android.os.Bundle bundle, android.app.Activity activity) {
        this.a = "com.google";
        this.b = "oauthlogin";
        this.c = bundle;
        this.d = activity;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object a(android.accounts.Account account) {
        defpackage.afmt afmtVar = defpackage.afmt.a;
        java.lang.String strZ = aoov.Z("oauth2:https://www.googleapis.com/auth/peopleapi.readwrite", 7);
        akmg akmgVar = akmg.o;
        aooh.e(akmgVar, "getInstance(...)");
        return new defpackage.zoe(new defpackage.afpl(new defpackage.ahdv((aonj) afmtVar, this.a, strZ, (ajyz) this.d, (apnt) this.c, (ajzt) akmgVar, account), (aolr) this.b), (byte[]) null);
    }

    public /* synthetic */ agpj(java.lang.String str, ajyz ajyzVar, apnt apntVar, aolr aolrVar) {
        this.a = str;
        this.d = ajyzVar;
        this.c = apntVar;
        this.b = aolrVar;
    }
}
