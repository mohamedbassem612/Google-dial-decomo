package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nqi {
    public final udj a;
    public final udl b;
    public final int c;

    public nqi(udj udjVar, int i, udl udlVar) {
        aooh.f(udjVar, "spamStatus");
        this.a = udjVar;
        this.c = i;
        this.b = udlVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.nqi) {
            defpackage.nqi nqiVar = (defpackage.nqi) obj;
            if (this.a == nqiVar.a && this.c == nqiVar.c && this.b == nqiVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "DobbySpamStatus(spamStatus=" + this.a + ", suspiciousStatus=" + ((java.lang.Object) java.lang.Integer.toString(this.c - 1)) + ", verdictSource=" + this.b + ')';
    }
}
