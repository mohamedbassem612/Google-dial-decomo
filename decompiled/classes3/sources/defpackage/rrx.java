package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rrx {
    public final pez a;

    public rrx(pez pezVar) {
        this.a = pezVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.rrx) && aooh.n(this.a, ((defpackage.rrx) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Body(marqueeText=" + this.a + ')';
    }
}
