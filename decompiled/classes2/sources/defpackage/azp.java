package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class azp extends dca {
    private final aonj a;

    public azp(aonj aonjVar) {
        this.a = aonjVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.azq(this.a);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.azq azqVar = (defpackage.azq) cmvVar;
        aonj aonjVar = azqVar.a;
        aonj aonjVar2 = this.a;
        if (aonjVar != aonjVar2) {
            azqVar.a = aonjVar2;
            defpackage.baa baaVar = azqVar.d;
            if (baaVar != null) {
                azqVar.g((azz) azqVar.a.a(baaVar));
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.azp) && this.a == ((defpackage.azp) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
