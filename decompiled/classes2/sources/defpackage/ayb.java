package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ayb extends dca {
    private final azz a;

    public ayb(azz azzVar) {
        this.a = azzVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.ayd(this.a);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        ((defpackage.ayd) cmvVar).g(this.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ayb) {
            return aooh.n(((defpackage.ayb) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
