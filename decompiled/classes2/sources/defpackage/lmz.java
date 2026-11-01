package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lmz {
    public final boolean a;
    public final defpackage.lnk b;

    public lmz(boolean z, defpackage.lnk lnkVar) {
        this.a = z;
        this.b = lnkVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lmz) {
            defpackage.lmz lmzVar = (defpackage.lmz) obj;
            if (this.a == lmzVar.a && aooh.n(this.b, lmzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.lnk lnkVar = this.b;
        return (anty.L(this.a) * 31) + (lnkVar == null ? 0 : lnkVar.hashCode());
    }

    public final java.lang.String toString() {
        return "CallInfoBasedScreeningVerdictWithCause(shouldReject=" + this.a + ", featureCause=" + this.b + ')';
    }
}
