package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kre implements defpackage.krj {
    public final int a;

    public kre(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.kre) && this.a == ((defpackage.kre) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "ActionClicked(actionType=" + ((java.lang.Object) defpackage.hgz.J(this.a)) + ')';
    }
}
