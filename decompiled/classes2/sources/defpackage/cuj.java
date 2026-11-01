package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cuj extends dca {
    private final aonj a;
    private final aonj b;

    public cuj(aonj aonjVar, aonj aonjVar2) {
        this.a = aonjVar;
        this.b = aonjVar2;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.cul(this.a, this.b);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.cul culVar = (defpackage.cul) cmvVar;
        culVar.a = this.a;
        culVar.b = this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.cuj) {
            defpackage.cuj cujVar = (defpackage.cuj) obj;
            if (this.a == cujVar.a && this.b == cujVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        aonj aonjVar = this.a;
        int iHashCode = aonjVar != null ? aonjVar.hashCode() : 0;
        aonj aonjVar2 = this.b;
        return (iHashCode * 31) + (aonjVar2 != null ? aonjVar2.hashCode() : 0);
    }
}
