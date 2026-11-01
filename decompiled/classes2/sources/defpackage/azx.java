package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class azx extends dca {
    private final cmn a;

    public azx(cmn cmnVar) {
        this.a = cmnVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.azy(this.a, 0);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        ((defpackage.azy) cmvVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.azx azxVar = obj instanceof defpackage.azx ? (defpackage.azx) obj : null;
        if (azxVar == null) {
            return false;
        }
        return aooh.n(this.a, azxVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
