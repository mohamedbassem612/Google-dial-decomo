package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hcq {
    public static defpackage.aosp a;

    static {
        defpackage.aosp aospVar = defpackage.aoth.a;
        a = defpackage.apcz.a;
    }

    public static final hci a(defpackage.ccp ccpVar) {
        return (hci) ccpVar.a();
    }

    public static final java.lang.String b(java.lang.String str) {
        if (str == null || defpackage.aoov.H(str)) {
            return null;
        }
        return !defpackage.aoov.K(str, '/') ? str.concat("/") : str;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object c(android.content.Context context, hcj hcjVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, defpackage.aoln aolnVar) {
        hco hcoVar;
        android.content.Context context2;
        gzh gzhVar;
        java.lang.Object objAj;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.Object objAj2;
        if (aolnVar instanceof hco) {
            hcoVar = (hco) aolnVar;
            int i = hcoVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hcoVar.d = i - Integer.MIN_VALUE;
            } else {
                hcoVar = new hco(aolnVar);
            }
        } else {
            hcoVar = new hco(aolnVar);
        }
        java.lang.Object objK = hcoVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = hcoVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                str3 = (java.lang.String) hcoVar.b;
                str2 = hcoVar.f;
                str = hcoVar.e;
                context = (android.content.Context) hcoVar.a;
                defpackage.aooc.af(objK);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gzh gzhVar2 = (gzh) hcoVar.a;
                    defpackage.aooc.af(objK);
                    return gzhVar2;
                }
                gzh gzhVar3 = (gzh) hcoVar.b;
                java.lang.String str7 = hcoVar.f;
                java.lang.String str8 = hcoVar.e;
                android.content.Context context3 = (android.content.Context) hcoVar.a;
                defpackage.aooc.af(objK);
                str5 = str8;
                context2 = context3;
                str6 = str7;
                gzhVar = gzhVar3;
            }
            hcoVar.a = gzhVar;
            hcoVar.e = null;
            hcoVar.f = null;
            hcoVar.b = null;
            hcoVar.d = 3;
            if (!gzhVar.d.isEmpty() || (objAj2 = defpackage.aoov.aj(a, new isf(gzhVar, context2, str5, str6, (defpackage.aoln) null, 1), hcoVar)) != aoluVar) {
            }
            if (objAj2 != aoluVar) {
                return gzhVar;
            }
            return aoluVar;
        }
        defpackage.aooc.af(objK);
        defpackage.haa haaVarE = e(context, hcjVar, str4);
        hcoVar.a = context;
        hcoVar.e = str;
        hcoVar.f = str2;
        hcoVar.b = str3;
        hcoVar.d = 1;
        defpackage.aosc aoscVar = new defpackage.aosc(defpackage.ajsz.ap(hcoVar), 1);
        aoscVar.z();
        haaVarE.d(new hcl(aoscVar));
        haaVarE.c(new hcm(aoscVar));
        objK = aoscVar.k();
        if (objK == aoluVar) {
            return aoluVar;
        }
        java.lang.String str9 = str;
        context2 = context;
        java.lang.Object obj = objK;
        java.lang.String str10 = str2;
        java.lang.String str11 = str3;
        gzhVar = (gzh) obj;
        hcoVar.a = context2;
        hcoVar.e = str10;
        hcoVar.f = str11;
        hcoVar.b = gzhVar;
        hcoVar.d = 2;
        if (gzhVar.b.isEmpty() || (objAj = defpackage.aoov.aj(a, new defpackage.hcn(gzhVar, context2, str9, (defpackage.aoln) null, 0), hcoVar)) != aoluVar) {
            objAj = defpackage.aojh.a;
        }
        if (objAj == aoluVar) {
            return aoluVar;
        }
        str5 = str10;
        str6 = str11;
        hcoVar.a = gzhVar;
        hcoVar.e = null;
        hcoVar.f = null;
        hcoVar.b = null;
        hcoVar.d = 3;
        objAj2 = !gzhVar.d.isEmpty() ? defpackage.aojh.a : defpackage.aojh.a;
        if (objAj2 != aoluVar) {
            return gzhVar;
        }
        return aoluVar;
    }

    public static final hci d(hcj hcjVar, defpackage.cav cavVar) {
        hcj hcjVar2;
        java.lang.Object objG = cavVar.g();
        java.lang.Object obj = defpackage.cau.a;
        if (objG == obj) {
            objG = new aro((defpackage.aoln) null, 3, (short[]) null);
            cavVar.w(objG);
        }
        defpackage.aono aonoVar = (defpackage.aono) objG;
        android.content.Context context = (android.content.Context) cavVar.e(defpackage.dep.b);
        boolean zB = cavVar.B(hcjVar);
        java.lang.Object objG2 = cavVar.g();
        if (zB || objG2 == obj) {
            java.lang.Object parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(new hci(), defpackage.cdu.c);
            cavVar.w(parcelableSnapshotMutableState);
            objG2 = parcelableSnapshotMutableState;
        }
        defpackage.ccp ccpVar = (defpackage.ccp) objG2;
        boolean zB2 = cavVar.B(hcjVar) | cavVar.B("__LottieInternalDefaultCacheKey__");
        java.lang.Object objG3 = cavVar.g();
        if (zB2 || objG3 == obj) {
            cavVar.w(e(context, hcjVar, "__LottieInternalDefaultCacheKey__"));
        }
        boolean zB3 = cavVar.B(ccpVar) | cavVar.D(aonoVar) | cavVar.D(context) | cavVar.D(hcjVar) | cavVar.B(null) | cavVar.B("fonts/") | cavVar.B(".ttf") | cavVar.B("__LottieInternalDefaultCacheKey__");
        java.lang.Object objG4 = cavVar.g();
        if (zB3 || objG4 == obj) {
            hcjVar2 = hcjVar;
            java.lang.Object hcpVar = new hcp(aonoVar, context, hcjVar2, ccpVar, (defpackage.aoln) null);
            cavVar.w(hcpVar);
            objG4 = hcpVar;
        } else {
            hcjVar2 = hcjVar;
        }
        defpackage.cbp.f(hcjVar2, "__LottieInternalDefaultCacheKey__", (defpackage.aonn) objG4, cavVar);
        return a(ccpVar);
    }

    private static final defpackage.haa e(android.content.Context context, hcj hcjVar, java.lang.String str) {
        j$.util.Objects.checkIndex(0, 7);
        if (hcjVar == null) {
            throw new defpackage.aois();
        }
        if (!defpackage.aooh.n(str, "__LottieInternalDefaultCacheKey__")) {
            return gzl.e(context, hcjVar.a, str);
        }
        int i = hcjVar.a;
        return gzl.e(context, i, gzl.g(context, i));
    }
}
