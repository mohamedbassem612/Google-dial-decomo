package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aluu implements defpackage.aluw {
    public final java.lang.String a;

    public aluu(java.lang.String str) {
        aooh.f(str, "summary");
        this.a = str;
    }

    @Override // defpackage.aluw
    public final int a() {
        return 3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.aluu) && aooh.n(this.a, ((defpackage.aluu) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Ring(summary=" + this.a + ')';
    }
}
