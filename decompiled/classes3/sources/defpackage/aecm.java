package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aecm implements defpackage.adud, defpackage.aeck {
    private final java.lang.Throwable a;
    private final boolean b;
    private final adty c;

    public aecm(java.lang.Throwable th, boolean z, adty adtyVar) {
        aooh.f(th, "exception");
        this.a = th;
        this.b = z;
        this.c = adtyVar;
    }

    public final adty a() {
        return this.c;
    }

    public final java.lang.Throwable b() {
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
        if (obj instanceof defpackage.aecm) {
            defpackage.aecm aecmVar = (defpackage.aecm) obj;
            if (aooh.n(this.a, aecmVar.a) && this.b == aecmVar.b && this.c == aecmVar.c) {
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
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + anty.L(this.b)) * 31) + this.c.hashCode();
    }

    public final /* synthetic */ boolean i() {
        return false;
    }

    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // defpackage.aeck
    public final boolean k() {
        return this.b;
    }

    public final java.lang.String toString() {
        return "RegistrationTransientAuthFailure(exception=" + this.a + ", isRegistrationStoredInBackend=" + this.b + ", failureType=" + this.c + ')';
    }
}
