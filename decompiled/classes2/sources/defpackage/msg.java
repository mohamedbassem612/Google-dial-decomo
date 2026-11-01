package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class msg {
    public final udj a;
    public final udl b;
    public final int c;

    public msg(udj udjVar, int i, udl udlVar) {
        aooh.f(udjVar, "spamStatus");
        this.a = udjVar;
        this.c = i;
        this.b = udlVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.msg) {
            defpackage.msg msgVar = (defpackage.msg) obj;
            if (this.a == msgVar.a && this.c == msgVar.c && this.b == msgVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "DobbySpamStatusLog(spamStatus=" + this.a + ", suspiciousStatus=" + ((java.lang.Object) java.lang.Integer.toString(this.c - 1)) + ", verdictSource=" + this.b + ')';
    }
}
