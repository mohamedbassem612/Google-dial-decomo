package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jsv implements qub {
    public final aoss a;
    public qtz b;
    public final zpz c;
    public final ahda d;
    private final apni e;

    public jsv(zpz zpzVar, aoss aossVar, apni apniVar) {
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(apniVar, "androidJobs");
        this.c = zpzVar;
        this.a = aossVar;
        this.e = apniVar;
        this.d = new ahda((byte[]) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(qtz qtzVar, aoln aolnVar) {
        defpackage.jsu jsuVar;
        if (aolnVar instanceof defpackage.jsu) {
            jsuVar = (defpackage.jsu) aolnVar;
            int i = jsuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jsuVar.c = i - Integer.MIN_VALUE;
            } else {
                jsuVar = new defpackage.jsu(this, aolnVar);
            }
        } else {
            jsuVar = new defpackage.jsu(this, aolnVar);
        }
        java.lang.Object obj = jsuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jsuVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            aosy aosyVarAg = ahvr.ag(this.a, this.d, new defpackage.fyn((aoln) null, this, qtzVar, 20));
            jsuVar.c = 1;
            if (aosyVarAg.a(jsuVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    public final void b(android.view.View view) {
        aooh.f(view, "view");
    }

    public final void c() {
        this.e.i(aoov.an(this.a, (aolr) null, 0, new defpackage.jlk(this, (aoln) null, 10), 3));
    }
}
