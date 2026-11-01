package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aoq extends dca {
    private final defpackage.aon a;
    private final boolean b = false;
    private final boolean d;

    public aoq(defpackage.aon aonVar, boolean z) {
        this.a = aonVar;
        this.d = z;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.aom(this.a, this.d);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.aom aomVar = (defpackage.aom) cmvVar;
        aomVar.a = this.a;
        aomVar.b = false;
        aomVar.c = this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aoq)) {
            return false;
        }
        defpackage.aoq aoqVar = (defpackage.aoq) obj;
        if (!aooh.n(this.a, aoqVar.a)) {
            return false;
        }
        boolean z = aoqVar.b;
        return this.d == aoqVar.d;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 1237) * 31) + (true != this.d ? 1237 : 1231);
    }
}
