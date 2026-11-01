package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mki {
    public static final aimz a = aimz.i("com/android/dialer/dialpadview/simselector/service/SimSelectorFlow");
    public static final android.content.IntentFilter b;
    public final android.content.Context c;
    public final aolr d;
    public final defpackage.nvw e;
    public final zjs f;
    public final oko g;
    public final aoss h;
    public final ssq i;
    public final ahpz j;
    public final aoyq k;
    public final aoxh l;
    public final aoxh m;
    public final aoxh n;
    public final aozj o;
    public final aozj p;
    public final aozj q;
    public final rsr r;
    private final okj s;
    private final aolr t;
    private final aoxh u;
    private final aoxh v;
    private final aoxh w;
    private final aoxh x;
    private final aoxh y;

    static {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.telecom.action.PHONE_ACCOUNT_REGISTERED");
        intentFilter.addAction("android.telecom.action.PHONE_ACCOUNT_UNREGISTERED");
        b = intentFilter;
    }

    public mki(defpackage.hli hliVar, android.content.Context context, aolr aolrVar, defpackage.nvw nvwVar, rsr rsrVar, okj okjVar, zjs zjsVar, oko okoVar, aolr aolrVar2, aoss aossVar, ssq ssqVar, ahpz ahpzVar) {
        aooh.f(hliVar, "activeCallsFlow");
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(nvwVar, "canSelectSim");
        aooh.f(zjsVar, "dialerTelecom");
        aooh.f(aolrVar2, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ssqVar, "phoneNumberHelper");
        aooh.f(ahpzVar, "traceCreation");
        this.c = context;
        this.d = aolrVar;
        this.e = nvwVar;
        this.r = rsrVar;
        this.s = okjVar;
        this.f = zjsVar;
        this.g = okoVar;
        this.t = aolrVar2;
        this.h = aossVar;
        this.i = ssqVar;
        this.j = ahpzVar;
        aozj aozjVarA = aozk.a((java.lang.Object) null);
        this.o = aozjVarA;
        aozj aozjVarA2 = aozk.a(java.lang.Boolean.FALSE);
        this.p = aozjVarA2;
        aozj aozjVarA3 = aozk.a(java.lang.Boolean.TRUE);
        this.q = aozjVarA3;
        aoxh aoxhVarC = aoyx.c(0, 1, 0, 5);
        this.k = aoxhVarC;
        aoxh aoxhVarAt = aoov.at(new gdc(new defpackage.hlf((aoln) null, 16, (int[][][]) null), new aoxa(new defpackage.loe(this, (aoln) null, 7, (byte[]) null)), 7), aossVar, new aozg(0L, Long.MAX_VALUE));
        this.u = aoxhVarAt;
        aoxh aoxhVarAC = aoov.aC(aoxo.a(aoov.aD(new defpackage.hlh(aoxhVarAt, this, 8), -1)), aolrVar2);
        this.v = aoxhVarAC;
        this.l = new aoxa(new defpackage.loe(this, (aoln) null, 6));
        defpackage.mkc mkcVar = new defpackage.mkc((aoln) null, this, 1, (byte[]) null);
        int i = aoyc.a;
        gdc gdcVar = new gdc(new defpackage.hlf((aoln) null, 15, (short[][][]) null), new apaa(mkcVar, aoxhVarAC), 7);
        this.w = gdcVar;
        aoxh aoxhVarAC2 = aoov.aC(aoxo.a(new defpackage.hlh(aoov.ap(aoxhVarAC, hliVar.a, gdcVar, new defpackage.mjy(null)), this, 9)), aolrVar2);
        this.x = aoxhVarAC2;
        aoxh aoxhVarAC3 = aoov.aC(aoxo.a(new defpackage.hlh(new aoyp(aoyc.b(new aoxh[]{aoxhVarAt, aoxhVarC}), aozjVarA, new defpackage.aro((aoln) null, 5, (boolean[]) null)), this, 10)), aolrVar2);
        this.y = aoxhVarAC3;
        this.m = aoov.ap(aoxhVarAC2, aoxhVarAC3, aozjVarA, new defpackage.mjt(this, null));
        this.n = aoov.aC(new apaa(new defpackage.mkc((aoln) null, this, 0), aoxo.a(new aoyp(aozjVarA2, aozjVarA3, new defpackage.mkb(null)))), aolrVar2);
    }

    public static final int c(java.util.List list, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        java.util.Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            defpackage.mjs mjsVar = (defpackage.mjs) it.next();
            if (mjsVar.b.a && (phoneAccountHandle == null || aooh.n(mjsVar.a, phoneAccountHandle))) {
                return aooc.t(i, 0);
            }
            i++;
        }
        i = -1;
        return aooc.t(i, 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar) {
        defpackage.mju mjuVar;
        java.lang.String str;
        if (aolnVar instanceof defpackage.mju) {
            mjuVar = (defpackage.mju) aolnVar;
            int i = mjuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mjuVar.c = i - Integer.MIN_VALUE;
            } else {
                mjuVar = new defpackage.mju(this, aolnVar);
            }
        } else {
            mjuVar = new defpackage.mju(this, aolnVar);
        }
        java.lang.Object objK = mjuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mjuVar.c;
        if (i2 == 0) {
            aooc.af(objK);
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                okj okjVar = this.s;
                mjuVar.c = 1;
                objK = okjVar.k(phoneAccountHandle, mjuVar);
                if (objK == aoluVar) {
                    return aoluVar;
                }
            }
            return null;
        }
        if (i2 == 1) {
            aooc.af(objK);
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objK);
        }
        str = (java.lang.String) objK;
        if (str != null && !aoov.H(str)) {
            return str;
        }
        return null;
        int iIntValue = ((java.lang.Number) objK).intValue();
        if (iIntValue != -1) {
            okj okjVar2 = this.s;
            mjuVar.c = 2;
            objK = okjVar2.j(iIntValue, mjuVar);
            if (objK == aoluVar) {
                return aoluVar;
            }
            str = (java.lang.String) objK;
            if (str != null) {
                return str;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar) {
        defpackage.mjv mjvVar;
        if (aolnVar instanceof defpackage.mjv) {
            mjvVar = (defpackage.mjv) aolnVar;
            int i = mjvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mjvVar.c = i - Integer.MIN_VALUE;
            } else {
                mjvVar = new defpackage.mjv(this, aolnVar);
            }
        } else {
            mjvVar = new defpackage.mjv(this, aolnVar);
        }
        java.lang.Object objO = mjvVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mjvVar.c;
        if (i2 == 0) {
            aooc.af(objO);
            zjs zjsVar = this.f;
            mjvVar.c = 1;
            objO = zjsVar.o(phoneAccountHandle, mjvVar);
            if (objO == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objO);
        }
        java.lang.String str = (java.lang.String) objO;
        if (str == null || aoov.H(str)) {
            return null;
        }
        return str;
    }
}
