package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adzs implements defpackage.adud {
    public final boolean a;
    private final java.lang.Throwable b;
    private final adty c;

    public adzs(java.lang.Throwable th, adty adtyVar, boolean z) {
        aooh.f(th, "exception");
        this.b = th;
        this.c = adtyVar;
        this.a = z;
    }

    public final adty a() {
        return this.c;
    }

    public final java.lang.Throwable b() {
        return this.b;
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
        if (obj instanceof defpackage.adzs) {
            defpackage.adzs adzsVar = (defpackage.adzs) obj;
            if (aooh.n(this.b, adzsVar.b) && this.c == adzsVar.c && this.a == adzsVar.a) {
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
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + anty.L(this.a);
    }

    public final /* synthetic */ boolean i() {
        return false;
    }

    public final /* synthetic */ boolean j() {
        return true;
    }

    public final java.lang.String toString() {
        return "TokenRegenerationFailure(exception=" + this.b + ", failureType=" + this.c + ", hasDeletedToken=" + this.a + ')';
    }
}
