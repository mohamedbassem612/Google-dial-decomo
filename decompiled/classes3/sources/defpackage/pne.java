package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pne {
    public final java.lang.String a;
    public final java.lang.Integer b;
    private final int c;

    public pne(java.lang.String str, java.lang.Integer num) {
        aooh.f(str, "text");
        this.a = str;
        this.b = num;
        this.c = Integer.MAX_VALUE;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.pne) {
            defpackage.pne pneVar = (defpackage.pne) obj;
            if (aooh.n(this.a, pneVar.a) && aooh.n(this.b, pneVar.b)) {
                int i = pneVar.c;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Integer.MAX_VALUE;
    }

    public final java.lang.String toString() {
        return "IncomingMessage(text=" + this.a + ", rawLottieRes=" + this.b + ", repeatCount=2147483647)";
    }
}
