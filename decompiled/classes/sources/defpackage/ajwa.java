package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajwa {
    public final java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    private int d;

    public ajwa(defpackage.aw awVar) {
        this.d = 0;
        this.a = awVar;
    }

    private final android.content.pm.PackageInfo m(java.lang.String str) {
        try {
            return ((android.content.Context) this.a).getPackageManager().getPackageInfo(str, 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.w("FirebaseInstanceId", "Failed to find package ".concat(e.toString()));
            return null;
        }
    }

    private final synchronized void n() {
        android.content.pm.PackageInfo packageInfoM = m(((android.content.Context) this.a).getPackageName());
        if (packageInfoM != null) {
            this.b = java.lang.Integer.toString(packageInfoM.versionCode);
            this.c = packageInfoM.versionName;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void o(defpackage.ahqz ahqzVar, defpackage.aw awVar, boolean z) {
        if (awVar.z() != null) {
            for (defpackage.aw awVar2 : awVar.I().k()) {
                if (awVar2 instanceof defpackage.ahph) {
                    ((defpackage.ahph) awVar2).ba(ahqzVar, z);
                } else {
                    o(ahqzVar, awVar2, z);
                }
            }
        }
    }

    public final synchronized int a() {
        android.content.pm.PackageInfo packageInfoM;
        if (this.d == 0 && (packageInfoM = m("com.google.android.gms")) != null) {
            this.d = packageInfoM.versionCode;
        }
        return this.d;
    }

    public final synchronized java.lang.String b() {
        if (this.b == null) {
            n();
        }
        return (java.lang.String) this.b;
    }

    public final synchronized java.lang.String c() {
        if (this.c == null) {
            n();
        }
        return (java.lang.String) this.c;
    }

    public final defpackage.ahpm d() {
        try {
            return e();
        } finally {
            this.b = null;
            this.c = null;
            this.d = 0;
        }
    }

    public final defpackage.ahpm e() {
        java.lang.Object obj = this.c;
        if (obj != null) {
            return ((defpackage.ahqz) obj).a();
        }
        java.lang.Object obj2 = this.b;
        if (obj2 != null) {
            return ((defpackage.ahqz) obj2).a();
        }
        defpackage.ahns.m(false);
        return new defpackage.ahno(1);
    }

    public final defpackage.ahpm f() {
        defpackage.ahns.m(false);
        defpackage.ahno ahnoVar = new defpackage.ahno(1);
        if (this.d > 0) {
            h(defpackage.ahqz.b(), false);
        }
        return ahnoVar;
    }

    public final defpackage.ahpm g(java.lang.String str) {
        defpackage.ahns.n();
        return new ahmt(defpackage.ahns.g(), defpackage.ahns.q() ? defpackage.ahvr.W(1424, str) : ((defpackage.ahnm) defpackage.agab.aH(((defpackage.aw) this.a).z(), defpackage.ahnm.class)).fh().f(1423, str), 6);
    }

    public final void h(defpackage.ahqz ahqzVar, boolean z) {
        if (z) {
            int i = this.d;
            if (ahqzVar == null) {
                int i2 = i - 1;
                if (i2 < 0) {
                    i2 = 0;
                }
                this.d = i2;
                if (i2 == 0) {
                    this.b = null;
                    return;
                }
                return;
            }
            this.d = i + 1;
        }
        this.b = ahqzVar;
        o(ahqzVar, (defpackage.aw) this.a, z);
    }

    public final defpackage.ahpm i(int i, int i2) {
        defpackage.ahpm ahpmVarF = defpackage.ahns.f();
        if (i != 0 || i2 != 0) {
            h(defpackage.ahqz.b(), true);
        }
        return ahpmVarF;
    }

    public final void j() {
        defpackage.ahns.m(true);
        if (this.d > 0) {
            h(defpackage.ahqz.b(), false);
        }
    }

    public final void k() {
        h(defpackage.ahqz.b(), true);
    }

    public final defpackage.ahpm l() {
        if (defpackage.ahns.q()) {
            return defpackage.ahvr.W(1422, "Fragment:onActivityResult");
        }
        defpackage.az azVarG = ((defpackage.aw) this.a).G();
        defpackage.ahvr.cj(azVarG, "called before fragment was attached to an Activity");
        return defpackage.ahvr.ab(azVarG).f(1421, "Fragment:onActivityResult");
    }

    public ajwa(android.content.Context context) {
        this.a = context;
    }
}
