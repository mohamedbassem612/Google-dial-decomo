package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class azs extends dca {
    private final azz a;

    public azs(azz azzVar) {
        this.a = azzVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.azt(this.a);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.azt aztVar = (defpackage.azt) cmvVar;
        azz azzVar = aztVar.a;
        azz azzVar2 = this.a;
        if (aooh.n(azzVar2, azzVar)) {
            return;
        }
        aztVar.a = azzVar2;
        aztVar.d();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.azs) {
            return aooh.n(((defpackage.azs) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
