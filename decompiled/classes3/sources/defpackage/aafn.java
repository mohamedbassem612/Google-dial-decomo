package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aafn extends defpackage.aatu implements aadc, aadd {
    private static final aais h = aats.b;
    public final android.content.Context a;
    public final android.os.Handler b;
    public final java.util.Set c;
    public final aagi d;
    public defpackage.aatw e;
    public aaeq f;
    public final aais g;

    public aafn(android.content.Context context, android.os.Handler handler, aagi aagiVar) {
        aais aaisVar = h;
        this.a = context;
        this.b = handler;
        this.d = aagiVar;
        this.c = aagiVar.b;
        this.g = aaisVar;
    }

    public final void a(android.os.Bundle bundle) {
        defpackage.aatw aatwVar = this.e;
        try {
            android.accounts.Account account = aatwVar.a.a;
            if (account == null) {
                account = new android.accounts.Account("<<default account>>", "com.google");
            }
            com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccountA = "<<default account>>".equals(account.name) ? defpackage.zyt.c(((aagf) aatwVar).b).a() : null;
            java.lang.Integer num = aatwVar.v;
            aais.as(num);
            com.google.android.gms.common.internal.ResolveAccountRequest resolveAccountRequest = new com.google.android.gms.common.internal.ResolveAccountRequest(2, account, num.intValue(), googleSignInAccountA);
            defpackage.aatv aatvVar = (defpackage.aatv) aatwVar.v();
            com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable signInRequest = new com.google.android.gms.signin.internal.SignInRequest(1, resolveAccountRequest);
            android.os.Parcel parcelEP = aatvVar.eP();
            yld.d(parcelEP, signInRequest);
            yld.f(parcelEP, this);
            aatvVar.eR(12, parcelEP);
        } catch (android.os.RemoteException e) {
            android.util.Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                c(new com.google.android.gms.signin.internal.SignInResponse(1, new com.google.android.gms.common.ConnectionResult(1, 8, (android.app.PendingIntent) null, (java.lang.String) null, (java.lang.Integer) null, (android.os.Bundle) null), null));
            } catch (android.os.RemoteException unused) {
                android.util.Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    public final void b(int i) {
        aaeq aaeqVar = this.f;
        aaeo aaeoVar = (aaeo) aaeqVar.e.l.get(aaeqVar.b);
        if (aaeoVar != null) {
            if (aaeoVar.h) {
                aaeoVar.l(new com.google.android.gms.common.ConnectionResult(1, 17, (android.app.PendingIntent) null, (java.lang.String) null, (java.lang.Integer) null, (android.os.Bundle) null));
            } else {
                aaeoVar.b(i);
            }
        }
    }

    @Override // defpackage.aatu
    public final void c(com.google.android.gms.signin.internal.SignInResponse signInResponse) {
        this.b.post(new defpackage.wdm(this, signInResponse, 16));
    }

    public final void i(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.f.b(connectionResult);
    }
}
