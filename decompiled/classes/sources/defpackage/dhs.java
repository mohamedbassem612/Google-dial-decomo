package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dhs extends defpackage.dca implements defpackage.dif {
    private final boolean a;
    private final defpackage.aonj b;

    public dhs(boolean z, defpackage.aonj aonjVar) {
        this.a = z;
        this.b = aonjVar;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.dhv(this.a, false, this.b);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        defpackage.dhv dhvVar = (defpackage.dhv) cmvVar;
        dhvVar.a = this.a;
        dhvVar.b = this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dhs) {
            defpackage.dhs dhsVar = (defpackage.dhs) obj;
            if (this.a == dhsVar.a && this.b == dhsVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dif
    public final defpackage.die f() {
        defpackage.die dieVar = new defpackage.die();
        dieVar.a = this.a;
        this.b.a(dieVar);
        return dieVar;
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }
}
