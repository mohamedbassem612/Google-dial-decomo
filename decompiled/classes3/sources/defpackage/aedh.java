package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aedh implements defpackage.adua {
    private final java.lang.Throwable a;
    private final com.google.android.libraries.notifications.platform.registration.AccountRepresentation b;
    private final adty c;

    public aedh(java.lang.Throwable th, com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, adty adtyVar) {
        aooh.f(th, "exception");
        aooh.f(accountRepresentation, "account");
        aooh.f(adtyVar, "failureType");
        this.a = th;
        this.b = accountRepresentation;
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
        if (obj instanceof defpackage.aedh) {
            defpackage.aedh aedhVar = (defpackage.aedh) obj;
            if (aooh.n(this.a, aedhVar.a) && aooh.n(this.b, aedhVar.b) && this.c == aedhVar.c) {
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
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final /* synthetic */ boolean i() {
        return false;
    }

    public final /* synthetic */ boolean j() {
        return false;
    }

    public final java.lang.String toString() {
        return "AuthPermanentFailure(exception=" + this.a + ", account=" + this.b + ", failureType=" + this.c + ')';
    }
}
