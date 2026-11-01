package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ayz extends dca {
    private final ayy a;

    public ayz(ayy ayyVar) {
        this.a = ayyVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.aza(this.a);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.aza azaVar = (defpackage.aza) cmvVar;
        ayy ayyVar = azaVar.a;
        ayy ayyVar2 = this.a;
        if (aooh.n(ayyVar2, ayyVar)) {
            return;
        }
        azaVar.a = ayyVar2;
        azaVar.d();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ayz) {
            return aooh.n(((defpackage.ayz) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
