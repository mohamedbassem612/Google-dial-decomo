package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abud {
    public final defpackage.abuf a;
    public final defpackage.abtw b;
    private final long c;

    public abud(long j, defpackage.abuf abufVar, defpackage.abtw abtwVar) {
        this.c = j;
        this.a = abufVar;
        this.b = abtwVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abud) {
            defpackage.abud abudVar = (defpackage.abud) obj;
            if (this.c == abudVar.c && this.a == abudVar.a && aooh.n(this.b, abudVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = (anty.M(this.c) * 31) + this.a.hashCode();
        defpackage.abtw abtwVar = this.b;
        return (iM * 31) + (abtwVar == null ? 0 : abtwVar.hashCode());
    }

    public final java.lang.String toString() {
        return "CallingCardGetResponseData(callingCardId=" + this.c + ", status=" + this.a + ", callingCardCpgData=" + this.b + ')';
    }
}
