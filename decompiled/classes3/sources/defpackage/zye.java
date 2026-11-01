package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@java.lang.Deprecated
public final class zye {
    public java.util.Set a;
    public java.lang.String b;
    private boolean c;
    private boolean d;
    private boolean e;
    private java.lang.String f;
    private android.accounts.Account g;
    private java.lang.String h;
    private java.util.Map i;

    public zye(com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        this.a = new java.util.HashSet();
        this.i = new java.util.HashMap();
        this.a = new java.util.HashSet(googleSignInOptions.h);
        this.c = googleSignInOptions.k;
        this.d = googleSignInOptions.l;
        this.e = googleSignInOptions.j;
        this.f = googleSignInOptions.m;
        this.g = googleSignInOptions.i;
        this.h = googleSignInOptions.n;
        this.i = com.google.android.gms.auth.api.signin.GoogleSignInOptions.b(googleSignInOptions.o);
        this.b = googleSignInOptions.p;
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInOptions a() {
        if (this.a.contains(com.google.android.gms.auth.api.signin.GoogleSignInOptions.d)) {
            java.util.Set set = this.a;
            com.google.android.gms.common.api.Scope scope = com.google.android.gms.auth.api.signin.GoogleSignInOptions.c;
            if (set.contains(scope)) {
                this.a.remove(scope);
            }
        }
        if (this.e && (this.g == null || !this.a.isEmpty())) {
            b();
        }
        return new com.google.android.gms.auth.api.signin.GoogleSignInOptions(3, new java.util.ArrayList(this.a), this.g, this.e, this.c, this.d, this.f, this.h, this.i, this.b);
    }

    public final void b() {
        this.a.add(com.google.android.gms.auth.api.signin.GoogleSignInOptions.b);
    }

    public final void c(com.google.android.gms.common.api.Scope scope, com.google.android.gms.common.api.Scope... scopeArr) {
        this.a.add(scope);
        this.a.addAll(java.util.Arrays.asList(scopeArr));
    }

    public zye() {
        this.a = new java.util.HashSet();
        this.i = new java.util.HashMap();
    }
}
