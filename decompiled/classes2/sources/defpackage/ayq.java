package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ayq extends dca {
    private final aonj a;
    private final boolean b;

    public ayq(aonj aonjVar, boolean z) {
        this.a = aonjVar;
        this.b = z;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.ayr(this.a, this.b);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.ayr ayrVar = (defpackage.ayr) cmvVar;
        aonj aonjVar = ayrVar.a;
        boolean z = this.b;
        aonj aonjVar2 = this.a;
        if (aonjVar != aonjVar2 || ayrVar.b != z) {
            cfo.A(ayrVar).V(false);
        }
        ayrVar.a = aonjVar2;
        ayrVar.b = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.ayq ayqVar = obj instanceof defpackage.ayq ? (defpackage.ayq) obj : null;
        return ayqVar != null && this.a == ayqVar.a && this.b == ayqVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        return "OffsetPxModifier(offset=" + this.a + ", rtlAware=" + this.b + ')';
    }
}
