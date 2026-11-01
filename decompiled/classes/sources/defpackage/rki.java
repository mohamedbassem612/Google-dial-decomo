package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rki {
    public final boolean a;
    public final boolean b;

    public rki(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.rki) {
            defpackage.rki rkiVar = (defpackage.rki) obj;
            if (this.a == rkiVar.a && this.b == rkiVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (defpackage.anty.L(this.a) * 31) + defpackage.anty.L(this.b);
    }

    public final java.lang.String toString() {
        return "DialerSplitInfo(isEmbedded=" + this.a + ", hasSplit=" + this.b + ')';
    }
}
