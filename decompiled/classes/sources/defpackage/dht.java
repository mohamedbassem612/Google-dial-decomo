package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dht extends defpackage.dca implements defpackage.dif {
    private final defpackage.aonj a;

    public dht(defpackage.aonj aonjVar) {
        this.a = aonjVar;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.dhv(false, true, this.a);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        ((defpackage.dhv) cmvVar).b = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.dht) && this.a == ((defpackage.dht) obj).a;
        }
        return true;
    }

    @Override // defpackage.dif
    public final defpackage.die f() {
        defpackage.die dieVar = new defpackage.die();
        dieVar.a = false;
        dieVar.b = true;
        this.a.a(dieVar);
        return dieVar;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
