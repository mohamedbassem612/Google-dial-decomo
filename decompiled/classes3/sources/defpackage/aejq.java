package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aejq {
    public final defpackage.aekm a;
    public final defpackage.aekp b;
    private final boolean c = true;

    public aejq(defpackage.aekm aekmVar, defpackage.aekp aekpVar) {
        this.a = aekmVar;
        this.b = aekpVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aejq) {
            defpackage.aejq aejqVar = (defpackage.aejq) obj;
            if (aooh.n(this.a, aejqVar.a) && aooh.n(this.b, aejqVar.b)) {
                boolean z = aejqVar.c;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + 1231;
    }

    public final java.lang.String toString() {
        return "ComposableEapConfiguration(expressSignInManager=" + this.a + ", expressSignInSpec=" + this.b + ", isDynamicColorsEnabled=true)";
    }
}
