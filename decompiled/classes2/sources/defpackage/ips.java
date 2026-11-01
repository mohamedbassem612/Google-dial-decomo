package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ips implements iox {
    public final android.content.Context a;
    public final android.content.pm.PackageManager b;
    private final aolr c;

    public ips(android.content.Context context, android.content.pm.PackageManager packageManager, aazc aazcVar, aolr aolrVar) {
        aooh.f(context, "appContext");
        aooh.f(packageManager, "packageManager");
        aooh.f(aazcVar, "clock");
        aooh.f(aolrVar, "blockingContext");
        this.a = context;
        this.b = packageManager;
        this.c = aolrVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.ipp ippVar;
        defpackage.jhw jhwVar;
        if (aolnVar instanceof defpackage.ipp) {
            ippVar = (defpackage.ipp) aolnVar;
            int i = ippVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ippVar.c = i - Integer.MIN_VALUE;
            } else {
                ippVar = new defpackage.ipp(this, aolnVar);
            }
        } else {
            ippVar = new defpackage.ipp(this, aolnVar);
        }
        java.lang.Object obj = ippVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ippVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            akzx akzxVarM = ioy.a.m();
            aooh.f(akzxVarM, "builder");
            defpackage.jhw jhwVar2 = new defpackage.jhw(akzxVarM);
            j$.time.Instant instantNow = j$.time.Instant.now();
            aooh.e(instantNow, "instant(...)");
            alcf alcfVarAu = aooc.au(instantNow);
            aooh.f(alcfVarAu, "value");
            akzx akzxVar = (akzx) jhwVar2.a;
            akzxVar.u();
            ioy ioyVar = akzxVar.b;
            j$.util.Objects.requireNonNull(alcfVarAu);
            ioyVar.d = alcfVarAu;
            ioyVar.b |= 2;
            aolr aolrVar = this.c;
            defpackage.fyn fynVar = new defpackage.fyn(jhwVar2, this, (aoln) null, 10);
            ippVar.d = jhwVar2;
            ippVar.c = 1;
            if (aoov.aj(aolrVar, fynVar, ippVar) == aoluVar) {
                return aoluVar;
            }
            jhwVar = jhwVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jhwVar = ippVar.d;
            aooc.af(obj);
        }
        ioy ioyVarP = ((akzx) jhwVar.a).p();
        aooh.e(ioyVarP, "build(...)");
        return ioyVarP;
    }

    public final iot c() {
        return new iot(defpackage.ipq.a, defpackage.ipr.a, new defpackage.jot(1), owv.b);
    }
}
