package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cnx extends dca {
    private final aonj a;

    public cnx(aonj aonjVar) {
        this.a = aonjVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.coc(this.a, 1);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        ((defpackage.coc) cmvVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.cnx) && this.a == ((defpackage.cnx) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
