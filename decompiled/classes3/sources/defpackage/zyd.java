package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zyd extends aada {
    static int a = 1;

    public zyd(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        acxg acxgVar = defpackage.zxt.a;
        aacy aacyVar = new aacy();
        aacyVar.b = new aais();
        super(context, (android.app.Activity) null, acxgVar, googleSignInOptions, aacyVar.a());
    }

    public final synchronized int a() {
        int i;
        i = a;
        if (i == 1) {
            android.content.Context context = ((aada) this).b;
            aabx aabxVar = aabx.a;
            int iL = aabxVar.l(context, 12451000);
            if (iL == 0) {
                i = 4;
                a = 4;
            } else if (aabxVar.m(context, iL, (java.lang.String) null) != null || aalm.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                i = 2;
                a = 2;
            } else {
                i = 3;
                a = 3;
            }
        }
        return i;
    }
}
