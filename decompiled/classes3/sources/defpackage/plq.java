package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class plq {
    public final j$.util.Optional a;
    public final int b;

    public plq(j$.util.Optional optional, int i) {
        aooh.f(optional, "name");
        this.a = optional;
        this.b = i;
    }

    public static final defpackage.plq a(j$.util.Optional optional, int i) {
        aooh.f(optional, "name");
        return new defpackage.plq(optional, i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.plq) {
            defpackage.plq plqVar = (defpackage.plq) obj;
            if (aooh.n(this.a, plqVar.a) && this.b == plqVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "DisplayNameResult(name=" + this.a + ", nameType=" + ((java.lang.Object) java.lang.Integer.toString(this.b - 1)) + ')';
    }
}
