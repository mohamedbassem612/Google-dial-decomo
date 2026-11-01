package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class auh extends dca {
    private final aonj a;
    private final defpackage.bhm b;

    public auh(defpackage.bhm bhmVar, aonj aonjVar) {
        this.b = bhmVar;
        this.a = aonjVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.aul(this.b, this.a);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.aul aulVar = (defpackage.aul) cmvVar;
        aulVar.a = this.a;
        defpackage.bhm bhmVar = aulVar.g;
        defpackage.bhm bhmVar2 = this.b;
        if (aooh.n(bhmVar, bhmVar2) && aulVar.c && aulVar.b) {
            return;
        }
        aulVar.g = bhmVar2;
        aulVar.c = true;
        aulVar.b = true;
        aulVar.f.v();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.auh auhVar = (defpackage.auh) obj;
            if (aooh.n(this.b, auhVar.b) && this.a == auhVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.a.hashCode()) * 31) + 1231) * 31) + 1231;
    }
}
