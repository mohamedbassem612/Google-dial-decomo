package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adyk implements defpackage.adua {
    public final com.google.android.gms.auth.UserRecoverableAuthException a;
    public final adty b;

    public adyk(com.google.android.gms.auth.UserRecoverableAuthException userRecoverableAuthException, adty adtyVar) {
        aooh.f(userRecoverableAuthException, "exception");
        aooh.f(adtyVar, "failureType");
        this.a = userRecoverableAuthException;
        this.b = adtyVar;
    }

    public final adty a() {
        return this.b;
    }

    public final /* synthetic */ java.lang.Throwable b() {
        return this.a;
    }

    public final /* synthetic */ adty c() {
        return agab.bY(this);
    }

    public final /* synthetic */ java.lang.Object d() {
        return agab.bZ(this);
    }

    public final /* synthetic */ java.lang.String e() {
        return agab.ca(this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.adyk) {
            defpackage.adyk adykVar = (defpackage.adyk) obj;
            if (aooh.n(this.a, adykVar.a) && this.b == adykVar.b) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ java.lang.Throwable f() {
        return agab.cb(this);
    }

    public final /* synthetic */ boolean g() {
        return true;
    }

    public final /* synthetic */ boolean h() {
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final /* synthetic */ boolean i() {
        return false;
    }

    public final /* synthetic */ boolean j() {
        return false;
    }

    public final java.lang.String toString() {
        return "AuthTokenRecoverableFailure(exception=" + this.a + ", failureType=" + this.b + ')';
    }
}
