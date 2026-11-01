package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ktd {
    public final abko a;
    public final java.lang.String b;
    private final boolean c = true;

    public ktd(abko abkoVar, java.lang.String str) {
        this.a = abkoVar;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ktd) {
            defpackage.ktd ktdVar = (defpackage.ktd) obj;
            if (aooh.n(this.a, ktdVar.a) && aooh.n(this.b, ktdVar.b)) {
                boolean z = ktdVar.c;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + 1231;
    }

    public final java.lang.String toString() {
        return "CallOptionsHeaderUiData(logo=" + this.a + ", businessName=" + this.b + ", isVerified=true)";
    }
}
