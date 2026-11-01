package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SignInHubActivity extends az {
    private static boolean p = false;
    public int n;
    public android.content.Intent o;
    private boolean q = false;
    private com.google.android.gms.auth.api.signin.internal.SignInConfiguration r;
    private boolean s;

    private final void i() {
        epc.a(this).e(0, new defpackage.zys(this));
        p = false;
    }

    private final void j(int i) {
        com.google.android.gms.common.api.Status status = new com.google.android.gms.common.api.Status(i, (java.lang.String) null, (android.app.PendingIntent) null, (com.google.android.gms.common.ConnectionResult) null);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("googleSignInStatus", (android.os.Parcelable) status);
        setResult(0, intent);
        finish();
        p = false;
    }

    private final void k(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", (android.os.Parcelable) this.r);
        try {
            startActivityForResult(intent, 40962);
        } catch (android.content.ActivityNotFoundException unused) {
            this.q = true;
            android.util.Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            j(17);
        }
    }

    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.os.Parcelable, com.google.android.gms.auth.api.signin.GoogleSignInAccount] */
    protected final void onActivityResult(int i, int i2, android.content.Intent intent) {
        ?? r0;
        if (this.q) {
            return;
        }
        setResult(0);
        if (i == 40962) {
            if (intent != 0) {
                com.google.android.gms.auth.api.signin.SignInAccount signInAccount = (com.google.android.gms.auth.api.signin.SignInAccount) dvh.c(intent, "signInAccount", com.google.android.gms.auth.api.signin.SignInAccount.class);
                if (signInAccount != null && (r0 = signInAccount.b) != 0) {
                    defpackage.zyo.a(this).c(this.r.b, r0);
                    intent.removeExtra("signInAccount");
                    intent.putExtra("googleSignInAccount", (android.os.Parcelable) r0);
                    this.s = true;
                    this.n = i2;
                    this.o = intent;
                    i();
                    return;
                }
                if (intent.hasExtra("errorCode")) {
                    int intExtra = intent.getIntExtra("errorCode", 8);
                    if (intExtra == 13) {
                        intExtra = 12501;
                    }
                    j(intExtra);
                    return;
                }
            }
            j(8);
        }
    }

    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        java.lang.String action = intent.getAction();
        if (action == null) {
            android.util.Log.e("AuthSignInClient", "Null action");
            j(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            android.util.Log.e("AuthSignInClient", "Action not implemented");
            j(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            android.util.Log.e("AuthSignInClient", "Unknown action: ".concat(java.lang.String.valueOf(intent.getAction())));
            finish();
            return;
        }
        android.os.Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            android.util.Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        com.google.android.gms.auth.api.signin.internal.SignInConfiguration signInConfiguration = (com.google.android.gms.auth.api.signin.internal.SignInConfiguration) dpe.t(bundleExtra, "config", com.google.android.gms.auth.api.signin.internal.SignInConfiguration.class);
        if (signInConfiguration == null) {
            android.util.Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.r = signInConfiguration;
        if (bundle == null) {
            if (p) {
                setResult(0);
                j(12502);
                return;
            } else {
                p = true;
                k(action);
                return;
            }
        }
        boolean z = bundle.getBoolean("signingInGoogleApiClients");
        this.s = z;
        if (z) {
            this.n = bundle.getInt("signInResultCode");
            android.content.Intent intent2 = (android.content.Intent) dpe.t(bundle, "signInResultData", android.content.Intent.class);
            if (intent2 != null) {
                this.o = intent2;
                i();
            } else {
                android.util.Log.e("AuthSignInClient", "Sign in result data cannot be null");
                setResult(0);
                finish();
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        p = false;
    }

    protected final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.s);
        if (this.s) {
            bundle.putInt("signInResultCode", this.n);
            bundle.putParcelable("signInResultData", this.o);
        }
    }
}
