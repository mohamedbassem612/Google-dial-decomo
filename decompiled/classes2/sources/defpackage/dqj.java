package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dqj extends dca {
    private final aonj a;

    public dqj(aonj aonjVar) {
        this.a = aonjVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.dql(this.a);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.dql dqlVar = (defpackage.dql) cmvVar;
        aonj aonjVar = this.a;
        dqlVar.a = aonjVar;
        if (((cmv) dqlVar).D) {
            aonjVar.a(dqlVar.b);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.dqj) && this.a == ((defpackage.dqj) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
