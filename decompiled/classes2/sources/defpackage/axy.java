package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class axy extends dca {
    private final cmi a;

    public axy(cmi cmiVar) {
        this.a = cmiVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.azy(this.a, 1);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        ((defpackage.azy) cmvVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.axy axyVar = obj instanceof defpackage.axy ? (defpackage.axy) obj : null;
        if (axyVar == null) {
            return false;
        }
        return aooh.n(this.a, axyVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
