package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bpf extends dca {
    private final aiq a;
    private final kaw b;

    public bpf(kaw kawVar, aiq aiqVar) {
        this.b = kawVar;
        this.a = aiqVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.bpk(this.b, this.a);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.bpk bpkVar = (defpackage.bpk) cmvVar;
        kaw kawVar = bpkVar.d;
        kaw kawVar2 = this.b;
        if (!aooh.n(kawVar, kawVar2)) {
            bpkVar.d = kawVar2;
            bpkVar.d();
        }
        bpkVar.a = this.a;
        bpkVar.b = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.bpk bpkVar = obj instanceof defpackage.bpk ? (defpackage.bpk) obj : null;
        return bpkVar != null && aooh.n(this.b, bpkVar.d) && aooh.n(this.a, bpkVar.a) && aooh.n((java.lang.Object) null, (java.lang.Object) null);
    }

    public final int hashCode() {
        return ((this.b.hashCode() * 31) + this.a.hashCode()) * 31;
    }
}
