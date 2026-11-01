package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adtx implements defpackage.adud {
    private final java.lang.Throwable a;
    private final adty b;

    public adtx(java.lang.Throwable th, adty adtyVar) {
        aooh.f(th, "exception");
        aooh.f(adtyVar, "failureType");
        this.a = th;
        this.b = adtyVar;
    }

    public final adty a() {
        return this.b;
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
        if (obj instanceof defpackage.adtx) {
            defpackage.adtx adtxVar = (defpackage.adtx) obj;
            if (aooh.n(this.a, adtxVar.a) && this.b == adtxVar.b) {
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
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final /* synthetic */ boolean i() {
        return false;
    }

    public final /* synthetic */ boolean j() {
        return true;
    }

    public final java.lang.String toString() {
        return "GenericTransientFailure(exception=" + this.a + ", failureType=" + this.b + ')';
    }

    public adtx(java.lang.String str, adty adtyVar) {
        this(new java.lang.Exception(str), adtyVar);
    }
}
