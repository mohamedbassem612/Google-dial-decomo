package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iyw implements ahth {
    public final java.lang.String a;
    public final java.lang.String b;

    public iyw(java.lang.String str, java.lang.String str2) {
        aooh.f(str, "greetingId");
        aooh.f(str2, "newName");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.iyw) {
            defpackage.iyw iywVar = (defpackage.iyw) obj;
            if (aooh.n(this.a, iywVar.a) && aooh.n(this.b, iywVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "GreetingRenameConfirmedEvent(greetingId=" + this.a + ", newName=" + this.b + ')';
    }
}
