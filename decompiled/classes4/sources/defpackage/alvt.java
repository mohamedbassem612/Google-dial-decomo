package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alvt {
    public final defpackage.alss a;
    public final int b;

    public alvt(defpackage.alss alssVar, int i) {
        this.a = alssVar;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.alvt) {
            defpackage.alvt alvtVar = (defpackage.alvt) obj;
            if (this.a.equals(alvtVar.a)) {
                int i = this.b;
                int i2 = alvtVar.b;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ a.aq(this.b);
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.a);
        int i = this.b;
        return "ScoobySpamSignalData{spamStatus=" + strValueOf + ", spamVerdictSource=" + (i != 0 ? java.lang.Integer.toString(i - 1) : "null") + '}';
    }

    public alvt() {
        throw null;
    }
}
