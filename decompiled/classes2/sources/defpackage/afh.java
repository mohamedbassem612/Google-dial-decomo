package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class afh extends dca {
    private final cyb a;
    private final defpackage.afk b;
    private final aonn d;
    private final boolean e = false;

    public afh(cyb cybVar, defpackage.afk afkVar, aonn aonnVar) {
        this.a = cybVar;
        this.b = afkVar;
        this.d = aonnVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.afj(this.a, this.b, this.d);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.afj afjVar = (defpackage.afj) cmvVar;
        afjVar.a = this.a;
        afjVar.b = this.b;
        afjVar.c = this.d;
        afjVar.d = false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.afh) {
            defpackage.afh afhVar = (defpackage.afh) obj;
            if (aooh.n(afhVar.a, this.a) && aooh.n(afhVar.b, this.b) && afhVar.d == this.d) {
                boolean z = afhVar.e;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + 1237;
    }
}
