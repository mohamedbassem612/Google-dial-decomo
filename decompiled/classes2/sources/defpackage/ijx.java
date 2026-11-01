package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ijx {
    public final defpackage.igm a;
    public final vqf b;

    public ijx(vqf vqfVar, defpackage.igm igmVar) {
        aooh.f(igmVar, "config");
        this.b = vqfVar;
        this.a = igmVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ijx) {
            defpackage.ijx ijxVar = (defpackage.ijx) obj;
            if (aooh.n(this.b, ijxVar.b) && aooh.n(this.a, ijxVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "RunningState(listener=" + this.b + ", config=" + this.a + ')';
    }
}
