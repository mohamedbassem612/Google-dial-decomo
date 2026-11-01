package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alut implements defpackage.aluw {
    public final java.lang.String a;

    public alut(java.lang.String str) {
        aooh.f(str, "summary");
        this.a = str;
    }

    @Override // defpackage.aluw
    public final int a() {
        return 2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.alut) && aooh.n(this.a, ((defpackage.alut) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Block(summary=" + this.a + ')';
    }
}
