package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tuy {
    public static final aimz a = aimz.i("com/android/dialer/sharpie/impl/wear/SharpieWearRelay");
    public final defpackage.tuw b;
    public defpackage.tth c;
    public final ahda d;
    private final aolr e;

    public tuy(aolr aolrVar, defpackage.tuw tuwVar) {
        aooh.f(aolrVar, "lightweightContext");
        this.e = aolrVar;
        this.b = tuwVar;
        this.d = new ahda((byte[]) null);
        this.c = defpackage.tth.NOT_SET;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.tth tthVar, aoln aolnVar) {
        defpackage.tux tuxVar;
        if (aolnVar instanceof defpackage.tux) {
            tuxVar = (defpackage.tux) aolnVar;
            int i = tuxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tuxVar.c = i - Integer.MIN_VALUE;
            } else {
                tuxVar = new defpackage.tux(this, aolnVar);
            }
        } else {
            tuxVar = new defpackage.tux(this, aolnVar);
        }
        java.lang.Object objAj = tuxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tuxVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objAj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objAj);
            }
            return aojh.a;
        }
        aooc.af(objAj);
        aolr aolrVar = this.e;
        lnb lnbVar = new lnb(this, tthVar, (aoln) null, 13);
        tuxVar.c = 1;
        objAj = aoov.aj(aolrVar, lnbVar, tuxVar);
        if (objAj == aoluVar) {
            return aoluVar;
        }
        tuxVar.c = 2;
        if (((aosy) objAj).a(tuxVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }
}
