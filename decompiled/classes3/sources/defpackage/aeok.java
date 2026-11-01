package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeok {
    public boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public aeok(zpz zpzVar, aoss aossVar) {
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(aossVar, "lightweightScope");
        this.c = zpzVar;
        this.d = aossVar;
        this.b = new ahda((byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aoss, java.lang.Object] */
    public final java.lang.Object a(aonj aonjVar, aoln aolnVar) {
        return ahvr.ag((aoss) this.d, (ahda) this.b, new defpackage.sge(aonjVar, (aoln) null, 6)).a(aolnVar);
    }

    public final java.lang.Object b(boolean z, aoln aolnVar) {
        java.lang.Object objA = a(new defpackage.shf(this, z, (aoln) null, 0), aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    public aeok(ahbz ahbzVar, aoin aoinVar, aoin aoinVar2) {
        this.a = false;
        this.d = ahbzVar;
        this.b = aoinVar;
        this.c = aoinVar2;
    }

    public aeok(defpackage.yfw yfwVar, defpackage.ydi ydiVar) {
        this.c = new defpackage.ydx(this);
        this.d = yfwVar;
        this.b = ydiVar;
    }
}
