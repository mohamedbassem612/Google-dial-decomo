package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class arq extends ark {
    public defpackage.arr a;
    public boolean b;
    public aono c;
    public aono d;
    public boolean j;

    public arq(defpackage.arr arrVar, aonj aonjVar, aso asoVar, boolean z, kaw kawVar, boolean z2, aono aonoVar, aono aonoVar2, boolean z3) {
        super(aonjVar, z, kawVar, asoVar);
        this.a = arrVar;
        this.b = z2;
        this.c = aonoVar;
        this.d = aonoVar2;
        this.j = z3;
    }

    public final java.lang.Object cR(aonn aonnVar, aoln aolnVar) {
        java.lang.Object objA;
        aso asoVar = ((ark) this).e;
        return (asoVar == null || (objA = this.a.a(defpackage.aoc.b, new defpackage.hty(aonnVar, this, asoVar, (aoln) null, 1), aolnVar)) != aolu.a) ? aojh.a : objA;
    }

    public final void cS(defpackage.aqw aqwVar) {
        aso asoVar;
        if (!((cmv) this).D || aooh.n(this.d, defpackage.arp.b) || (asoVar = ((ark) this).e) == null) {
            return;
        }
        aoov.an(M(), (aolr) null, 4, new defpackage.fxp(this, aqwVar, asoVar, (aoln) null, 1), 1);
    }

    public final void h(long j) {
        if (!((cmv) this).D || aooh.n(this.c, defpackage.arp.a)) {
            return;
        }
        aoov.an(M(), (aolr) null, 4, new defpackage.kjb(this, j, (aoln) null, 1), 1);
    }

    public final boolean i() {
        return this.b;
    }
}
