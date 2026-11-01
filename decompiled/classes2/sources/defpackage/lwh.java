package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lwh implements defpackage.lwj {
    public final tin a;
    public final defpackage.lwi b;

    public lwh(tin tinVar, defpackage.lwi lwiVar) {
        aooh.f(lwiVar, "directory");
        this.a = tinVar;
        this.b = lwiVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lwh) {
            defpackage.lwh lwhVar = (defpackage.lwh) obj;
            if (aooh.n(this.a, lwhVar.a) && aooh.n(this.b, lwhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Contact(cp2PhoneEntry=" + this.a + ", directory=" + this.b + ')';
    }
}
