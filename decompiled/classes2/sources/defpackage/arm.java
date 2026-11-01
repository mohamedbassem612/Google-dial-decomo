package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class arm extends dca {
    private static final aonj a = new apk(5);
    private final defpackage.arr b;
    private final aso d;
    private final boolean e;
    private final boolean f;
    private final aono g;
    private final aono h;
    private final boolean i;
    private final kaw j;

    public arm(defpackage.arr arrVar, aso asoVar, boolean z, kaw kawVar, boolean z2, aono aonoVar, aono aonoVar2, boolean z3) {
        this.b = arrVar;
        this.d = asoVar;
        this.e = z;
        this.j = kawVar;
        this.f = z2;
        this.g = aonoVar;
        this.h = aonoVar2;
        this.i = z3;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.arq(this.b, a, this.d, this.e, this.j, this.f, this.g, this.h, this.i);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        boolean z;
        boolean z2;
        defpackage.arq arqVar = (defpackage.arq) cmvVar;
        aonj aonjVar = a;
        defpackage.arr arrVar = arqVar.a;
        defpackage.arr arrVar2 = this.b;
        if (aooh.n(arrVar, arrVar2)) {
            z = false;
        } else {
            arqVar.a = arrVar2;
            z = true;
        }
        boolean z3 = this.i;
        if (arqVar.j != z3) {
            arqVar.j = z3;
            z2 = true;
        } else {
            z2 = z;
        }
        aono aonoVar = this.h;
        aono aonoVar2 = this.g;
        boolean z4 = this.f;
        kaw kawVar = this.j;
        boolean z5 = this.e;
        aso asoVar = this.d;
        arqVar.c = aonoVar2;
        arqVar.d = aonoVar;
        arqVar.b = z4;
        arqVar.J(aonjVar, z5, kawVar, asoVar, z2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.arm armVar = (defpackage.arm) obj;
            if (aooh.n(this.b, armVar.b) && this.d == armVar.d && this.e == armVar.e && aooh.n(this.j, armVar.j) && this.f == armVar.f && aooh.n(this.g, armVar.g) && aooh.n(this.h, armVar.h) && this.i == armVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() * 31) + this.d.hashCode();
        kaw kawVar = this.j;
        return (((((((((((iHashCode * 31) + (true != this.e ? 1237 : 1231)) * 31) + (kawVar != null ? kawVar.hashCode() : 0)) * 31) + (true != this.f ? 1237 : 1231)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + (true == this.i ? 1231 : 1237);
    }
}
