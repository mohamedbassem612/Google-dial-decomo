package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zyh extends aagp {
    public final com.google.android.gms.auth.api.signin.GoogleSignInOptions a;

    public zyh(android.content.Context context, android.os.Looper looper, aagi aagiVar, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions, aadc aadcVar, aadd aaddVar) {
        super(context, looper, 91, aagiVar, aadcVar, aaddVar);
        defpackage.zye zyeVar = googleSignInOptions != null ? new defpackage.zye(googleSignInOptions) : new defpackage.zye();
        zyeVar.b = defpackage.aamy.a();
        if (!aagiVar.c.isEmpty()) {
            java.util.Iterator it = aagiVar.c.iterator();
            while (it.hasNext()) {
                zyeVar.c((com.google.android.gms.common.api.Scope) it.next(), new com.google.android.gms.common.api.Scope[0]);
            }
        }
        this.a = zyeVar.a();
    }

    public final int a() {
        return 12451000;
    }

    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof defpackage.zyr ? (defpackage.zyr) iInterfaceQueryLocalInterface : new defpackage.zyr(iBinder);
    }

    protected final java.lang.String c() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    protected final java.lang.String d() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
