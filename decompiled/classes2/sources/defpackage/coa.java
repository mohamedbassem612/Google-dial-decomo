package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class coa extends dca {
    private final aonj a;

    public coa(aonj aonjVar) {
        this.a = aonjVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.cnv(new defpackage.cnw(), this.a);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.cnv cnvVar = (defpackage.cnv) cmvVar;
        cnvVar.a = this.a;
        cnvVar.b();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.coa) && this.a == ((defpackage.coa) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
