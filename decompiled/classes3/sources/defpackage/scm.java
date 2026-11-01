package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class scm extends snl {
    public final java.util.List a;

    public scm(java.util.List list) {
        aooh.f(list, "verificationStatusList");
        this.a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.scm) && aooh.n(this.a, ((defpackage.scm) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "VerificationStatusList(verificationStatusList=" + this.a + ')';
    }
}
