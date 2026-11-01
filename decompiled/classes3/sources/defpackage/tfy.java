package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tfy implements defpackage.tfz {
    public final defpackage.tfj a;
    public final defpackage.abvz b;
    public final boolean c;

    public tfy(defpackage.tfj tfjVar, defpackage.abvz abvzVar, boolean z) {
        this.a = tfjVar;
        this.b = abvzVar;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.tfy) {
            defpackage.tfy tfyVar = (defpackage.tfy) obj;
            if (aooh.n(this.a, tfyVar.a) && aooh.n(this.b, tfyVar.b) && this.c == tfyVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.abvz abvzVar = this.b;
        return ((iHashCode + (abvzVar == null ? 0 : abvzVar.hashCode())) * 31) + anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "VoiceCall(actionContext=" + this.a + ", calleeId=" + this.b + ", isWifi=" + this.c + ')';
    }
}
