package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class awz extends dca {
    private final aonj a;

    public awz(aonj aonjVar) {
        this.a = aonjVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.axa(this.a);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.axa axaVar = (defpackage.axa) cmvVar;
        aonj aonjVar = axaVar.a;
        aonj aonjVar2 = this.a;
        if (aonjVar2 != aonjVar) {
            axaVar.a = aonjVar2;
            axaVar.d();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.awz) && ((defpackage.awz) obj).a == this.a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
