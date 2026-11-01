package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mja implements defpackage.mjb {
    public final defpackage.mit a;

    public mja(defpackage.mit mitVar) {
        aooh.f(mitVar, "proto");
        this.a = mitVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.mja) && aooh.n(this.a, ((defpackage.mja) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "PreCallDialpadModelProto(proto=" + this.a + ')';
    }
}
