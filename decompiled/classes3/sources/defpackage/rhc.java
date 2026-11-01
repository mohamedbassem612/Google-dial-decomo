package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rhc {
    public final java.lang.String a;
    public final defpackage.rea b;
    public final int c;

    public rhc(java.lang.String str, int i, defpackage.rea reaVar) {
        this.a = str;
        this.c = i;
        this.b = reaVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rhc) {
            defpackage.rhc rhcVar = (defpackage.rhc) obj;
            if (this.a.equals(rhcVar.a)) {
                int i = this.c;
                int i2 = rhcVar.c;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(rhcVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.c;
        anty.aJ(i);
        return (((iHashCode * 1000003) ^ i) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ReturnToCallButtonConfig{callId=" + this.a + ", style=" + pez.bn(this.c) + ", featureControllerKey=" + java.lang.String.valueOf(this.b) + '}';
    }

    public rhc() {
        throw null;
    }
}
