package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rjb {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/joyball/impl/consenttransfer/JoyballConsentStatusNotifier");
    public final android.content.Context b;
    private final defpackage.aolr c;
    private final defpackage.aolr d;
    private final android.content.pm.PackageManager e;
    private java.lang.Long f;
    private final defpackage.apdp g;
    private final defpackage.abce h;

    public rjb(android.content.Context context, defpackage.aolr aolrVar, defpackage.abce abceVar, defpackage.aolr aolrVar2, android.content.pm.PackageManager packageManager) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        if (aolrVar2 == null) {
            defpackage.aooh.i("lightweightContext");
        }
        if (packageManager == null) {
            defpackage.aooh.i("packageManager");
        }
        this.b = context;
        this.c = aolrVar;
        this.h = abceVar;
        this.d = aolrVar2;
        this.e = packageManager;
        this.g = new defpackage.apdp();
    }

    public final rio a(rim rimVar) {
        android.content.Context context = this.b;
        defpackage.aooh.f(context, "<this>");
        java.lang.Object obj = ((defpackage.riy) defpackage.agab.aH(context, defpackage.riy.class)).hd().get(rimVar);
        if (obj != null) {
            return (rio) obj;
        }
        java.util.Objects.toString(rimVar);
        throw new java.lang.IllegalStateException("Integration not found for feature: ".concat(java.lang.String.valueOf(rimVar)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(android.content.pm.PackageManager packageManager, defpackage.aoln aolnVar) throws java.lang.Throwable {
        riz rizVar;
        defpackage.apdp apdpVar;
        defpackage.apdp apdpVar2;
        long jLongValue;
        if (aolnVar instanceof riz) {
            rizVar = (riz) aolnVar;
            int i = rizVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rizVar.d = i - Integer.MIN_VALUE;
            } else {
                rizVar = new riz(this, aolnVar);
            }
        } else {
            rizVar = new riz(this, aolnVar);
        }
        java.lang.Object obj = rizVar.b;
        java.lang.Object l = defpackage.aolu.a;
        int i2 = rizVar.d;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                apdpVar = this.g;
                rizVar.a = packageManager;
                rizVar.e = apdpVar;
                rizVar.d = 1;
                if (apdpVar.b(rizVar) != l) {
                }
                return l;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = (defpackage.apdp) rizVar.a;
                try {
                    defpackage.aooc.af(obj);
                    long jLongValue2 = ((java.lang.Number) obj).longValue();
                    this.f = new java.lang.Long(jLongValue2);
                    apdpVar = apdpVar2;
                    jLongValue = jLongValue2;
                    l = new java.lang.Long(jLongValue);
                    apdpVar.d();
                    return l;
                } catch (java.lang.Throwable th) {
                    th = th;
                    apdpVar2.d();
                    throw th;
                }
            }
            defpackage.apdp apdpVar3 = rizVar.e;
            android.content.pm.PackageManager packageManager2 = (android.content.pm.PackageManager) rizVar.a;
            defpackage.aooc.af(obj);
            apdpVar = apdpVar3;
            packageManager = packageManager2;
            java.lang.Long l2 = this.f;
            if (l2 != null) {
                jLongValue = l2.longValue();
                l = new java.lang.Long(jLongValue);
                apdpVar.d();
            } else {
                defpackage.aolr aolrVar = this.c;
                defpackage.roz rozVar = new defpackage.roz(packageManager, this, (defpackage.aoln) null, 1);
                rizVar.a = apdpVar;
                rizVar.e = null;
                rizVar.d = 2;
                java.lang.Object objAj = defpackage.aoov.aj(aolrVar, rozVar, rizVar);
                if (objAj != l) {
                    defpackage.apdp apdpVar4 = apdpVar;
                    obj = objAj;
                    apdpVar2 = apdpVar4;
                    long jLongValue3 = ((java.lang.Number) obj).longValue();
                    this.f = new java.lang.Long(jLongValue3);
                    apdpVar = apdpVar2;
                    jLongValue = jLongValue3;
                    l = new java.lang.Long(jLongValue);
                    apdpVar.d();
                }
            }
            return l;
        } catch (java.lang.Throwable th2) {
            th = th2;
            apdpVar2 = apdpVar;
            apdpVar2.d();
            throw th;
        }
    }

    public final java.lang.Object c(rim rimVar, defpackage.aoln aolnVar) {
        java.lang.Object objAj = defpackage.aoov.aj(this.d, new rir(this, rimVar, (defpackage.aoln) null, 2), aolnVar);
        return objAj != defpackage.aolu.a ? defpackage.aojh.a : objAj;
    }

    public final java.lang.Object d(rim rimVar, boolean z, defpackage.aoln aolnVar) {
        java.lang.Object objAj = defpackage.aoov.aj(this.d, new hyg(this, rimVar, z, (defpackage.aoln) null, 8), aolnVar);
        return objAj != defpackage.aolu.a ? defpackage.aojh.a : objAj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(rio rioVar, boolean z, defpackage.aoln aolnVar) throws java.lang.Throwable {
        rja rjaVar;
        java.lang.Object obj;
        uzx uzxVar;
        uzx uzxVar2;
        if (aolnVar instanceof rja) {
            rjaVar = (rja) aolnVar;
            int i = rjaVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rjaVar.d = i - Integer.MIN_VALUE;
            } else {
                rjaVar = new rja(this, aolnVar);
            }
        } else {
            rjaVar = new rja(this, aolnVar);
        }
        java.lang.Object objB = rjaVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = rjaVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objB);
            defpackage.akzx akzxVarM = aaqe.a.m();
            defpackage.aooh.f(akzxVarM, "builder");
            uzx uzxVar3 = new uzx(akzxVarM);
            java.lang.String strE = rioVar.e();
            defpackage.akzx akzxVar = (defpackage.akzx) uzxVar3.a;
            akzxVar.u();
            aaqe aaqeVar = akzxVar.b;
            j$.util.Objects.requireNonNull(strE);
            aaqeVar.b |= 1;
            aaqeVar.c = strE;
            java.lang.String strValueOf = java.lang.String.valueOf(z);
            defpackage.aooh.f(strValueOf, "value");
            akzxVar.u();
            aaqe aaqeVar2 = akzxVar.b;
            j$.util.Objects.requireNonNull(strValueOf);
            aaqeVar2.b |= 2;
            aaqeVar2.d = strValueOf;
            android.content.pm.PackageManager packageManager = this.e;
            rjaVar.a = rioVar;
            rjaVar.e = uzxVar3;
            rjaVar.f = uzxVar3;
            rjaVar.d = 1;
            objB = b(packageManager, rjaVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            obj = rioVar;
            uzxVar = uzxVar3;
            uzxVar2 = uzxVar;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uzxVar = rjaVar.f;
            uzxVar2 = rjaVar.e;
            obj = rjaVar.a;
            defpackage.aooc.af(objB);
        }
        long jLongValue = ((java.lang.Number) objB).longValue();
        defpackage.akzx akzxVar2 = (defpackage.akzx) uzxVar.a;
        akzxVar2.u();
        aaqe aaqeVar3 = akzxVar2.b;
        aaqe aaqeVar4 = aaqe.a;
        aaqeVar3.b |= 4;
        aaqeVar3.e = jLongValue;
        aaqe aaqeVarR = ((defpackage.akzx) uzxVar2.a).r();
        defpackage.aooh.e(aaqeVarR, "build(...)");
        defpackage.aaum aaumVarN = this.h.n(aaqeVarR);
        aaumVarN.a(new riw(new qji(obj, 12), 0));
        aaumVarN.q(new rix(obj, 0));
        return defpackage.aojh.a;
    }
}
