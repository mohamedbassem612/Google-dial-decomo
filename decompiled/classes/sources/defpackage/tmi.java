package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tmi {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/sharpie/impl/scamdetection/config/DialerSharpieConfigProvider");
    private final defpackage.aoin b;
    private final defpackage.aoin c;
    private final defpackage.aoin d;
    private final defpackage.aoin e;
    private final defpackage.aoin f;
    private final defpackage.aoin g;
    private final defpackage.oko h;
    private final defpackage.tlb i;
    private final defpackage.aonj j;
    private final defpackage.aogc k;

    public tmi(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, defpackage.aoin aoinVar6, defpackage.oko okoVar, defpackage.tlb tlbVar, defpackage.aogc aogcVar) {
        defpackage.aooh.f(aoinVar, "enableAiCoreInferencePixel9");
        defpackage.aooh.f(aoinVar2, "enableAiCoreInferenceOnOem");
        defpackage.aooh.f(aoinVar3, "enableSharpieIdP9Plus");
        defpackage.aooh.f(aoinVar4, "enableSharpiePlP9Plus");
        defpackage.aooh.f(aoinVar5, "enableSharpiePtP9Plus");
        defpackage.aooh.f(aoinVar6, "enableSharpieBrP9Plus");
        defpackage.aooh.f(aogcVar, "sharpieSettings");
        this.b = aoinVar;
        this.c = aoinVar2;
        this.d = aoinVar3;
        this.e = aoinVar4;
        this.f = aoinVar5;
        this.g = aoinVar6;
        this.h = okoVar;
        this.i = tlbVar;
        this.k = aogcVar;
        this.j = new defpackage.aiuo(new defpackage.edt(this, (defpackage.aoln) null, 6));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        tme tmeVar;
        java.lang.Object obj;
        java.lang.Object obj2;
        yur yurVar;
        java.lang.Object objC;
        yur yurVar2;
        java.lang.Object obj3;
        if (aolnVar instanceof tme) {
            tmeVar = (tme) aolnVar;
            int i = tmeVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tmeVar.e = i - Integer.MIN_VALUE;
            } else {
                tmeVar = new tme(this, aolnVar);
            }
        } else {
            tmeVar = new tme(this, aolnVar);
        }
        java.lang.Object objE = tmeVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = tmeVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(objE);
            } else if (i2 == 2) {
                obj2 = (yuu) tmeVar.b;
                obj = tmeVar.a;
                defpackage.aooc.af(objE);
                yurVar = (yur) objE;
                tmeVar.a = obj2;
                tmeVar.b = yurVar;
                tmeVar.e = 3;
                objC = c((yuu) obj, tmeVar);
                if (objC != aoluVar) {
                    return aoluVar;
                }
                objE = objC;
                yurVar2 = yurVar;
                obj3 = obj2;
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yurVar2 = (yur) tmeVar.b;
                obj3 = tmeVar.a;
                defpackage.aooc.af(objE);
            }
            yuw yuwVar = new yuw((yuu) obj3, yurVar2, (yuq) objE);
            ((defpackage.aimw) a.b().l("com/android/dialer/sharpie/impl/scamdetection/config/DialerSharpieConfigProvider", "createConfig$<anonymous>", 63, "DialerSharpieConfigProvider.kt")).y("Providing config: [%s]", yuwVar);
            return yuwVar;
        }
        defpackage.aooc.af(objE);
        tmeVar.e = 1;
        objE = e(tmeVar);
        if (objE == aoluVar) {
            return aoluVar;
        }
        yuu yuuVar = (yuu) objE;
        tmeVar.a = yuuVar;
        tmeVar.b = yuuVar;
        tmeVar.e = 2;
        java.lang.Object objD = d(tmeVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        obj = yuuVar;
        objE = objD;
        obj2 = obj;
        yurVar = (yur) objE;
        tmeVar.a = obj2;
        tmeVar.b = yurVar;
        tmeVar.e = 3;
        objC = c((yuu) obj, tmeVar);
        if (objC != aoluVar) {
            return aoluVar;
        }
        objE = objC;
        yurVar2 = yurVar;
        obj3 = obj2;
        yuw yuwVar2 = new yuw((yuu) obj3, yurVar2, (yuq) objE);
        ((defpackage.aimw) a.b().l("com/android/dialer/sharpie/impl/scamdetection/config/DialerSharpieConfigProvider", "createConfig$<anonymous>", 63, "DialerSharpieConfigProvider.kt")).y("Providing config: [%s]", yuwVar2);
        return yuwVar2;
    }

    public final java.lang.Object b(defpackage.aoln aolnVar) {
        return this.j.a(aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(yuu yuuVar, defpackage.aoln aolnVar) {
        tmf tmfVar;
        java.lang.Object obj;
        if (aolnVar instanceof tmf) {
            tmfVar = (tmf) aolnVar;
            int i = tmfVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tmfVar.d = i - Integer.MIN_VALUE;
            } else {
                tmfVar = new tmf(this, aolnVar);
            }
        } else {
            tmfVar = new tmf(this, aolnVar);
        }
        java.lang.Object objAw = tmfVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = tmfVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objAw);
            defpackage.aogc aogcVar = this.k;
            tmfVar.a = yuuVar;
            tmfVar.d = 1;
            objAw = aogcVar.aw(tmfVar);
            if (objAw == aoluVar) {
                obj = yuuVar;
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj2 = tmfVar.a;
            defpackage.aooc.af(objAw);
            obj = obj2;
        }
        obj = yuuVar;
        return new yuq(((java.lang.Boolean) objAw).booleanValue() && (obj instanceof yus));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.aoln aolnVar) {
        tmg tmgVar;
        java.util.List list;
        if (aolnVar instanceof tmg) {
            tmgVar = (tmg) aolnVar;
            int i = tmgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tmgVar.c = i - Integer.MIN_VALUE;
            } else {
                tmgVar = new tmg(this, aolnVar);
            }
        } else {
            tmgVar = new tmg(this, aolnVar);
        }
        java.lang.Object obj = tmgVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = tmgVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.aokv aokvVar = new defpackage.aokv(10);
            aokvVar.add(defpackage.akfg.US);
            aokvVar.add(defpackage.akfg.CA);
            aokvVar.add(defpackage.akfg.AU);
            aokvVar.add(defpackage.akfg.GB);
            aokvVar.add(defpackage.akfg.IN);
            aokvVar.add(defpackage.akfg.IE);
            aokvVar.add(defpackage.akfg.DE);
            aokvVar.add(defpackage.akfg.JP);
            aokvVar.add(defpackage.akfg.FR);
            aokvVar.add(defpackage.akfg.MX);
            aokvVar.add(defpackage.akfg.ES);
            aokvVar.add(defpackage.akfg.IT);
            aokvVar.add(defpackage.akfg.SG);
            if (((java.lang.Boolean) this.d.a()).booleanValue()) {
                aokvVar.add(defpackage.akfg.ID);
            }
            if (((java.lang.Boolean) this.e.a()).booleanValue()) {
                aokvVar.add(defpackage.akfg.PL);
            }
            if (((java.lang.Boolean) this.f.a()).booleanValue()) {
                aokvVar.add(defpackage.akfg.PT);
            }
            if (((java.lang.Boolean) this.g.a()).booleanValue()) {
                aokvVar.add(defpackage.akfg.BR);
            }
            java.util.List listAX = defpackage.ajsz.aX(aokvVar);
            defpackage.oko okoVar = this.h;
            tmgVar.d = (defpackage.aokv) listAX;
            tmgVar.c = 1;
            java.lang.Object objI = okoVar.I(tmgVar);
            if (objI == aoluVar) {
                return aoluVar;
            }
            obj = objI;
            list = listAX;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = tmgVar.d;
            defpackage.aooc.af(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        if (str == null) {
            str = "";
        }
        return new yur(list, defpackage.akfg.b(str));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.aoln aolnVar) {
        tmh tmhVar;
        if (aolnVar instanceof tmh) {
            tmhVar = (tmh) aolnVar;
            int i = tmhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tmhVar.c = i - Integer.MIN_VALUE;
            } else {
                tmhVar = new tmh(this, aolnVar);
            }
        } else {
            tmhVar = new tmh(this, aolnVar);
        }
        java.lang.Object objA = tmhVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = tmhVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objA);
            if (((java.lang.Boolean) this.b.a()).booleanValue()) {
                if (android.os.Build.VERSION.SDK_INT >= 35) {
                    return new yus((byte[]) null);
                }
            } else if (((java.lang.Boolean) this.c.a()).booleanValue()) {
                java.lang.String str = android.os.Build.BRAND;
                defpackage.aooh.e(str, "BRAND");
                java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
                defpackage.aooh.e(lowerCase, "toLowerCase(...)");
                if (!defpackage.aooh.n(lowerCase, "google")) {
                    if (android.os.Build.VERSION.SDK_INT >= 35) {
                        return new yus((byte[]) null);
                    }
                }
            }
            defpackage.tlb tlbVar = this.i;
            tmhVar.c = 1;
            objA = tlbVar.a(tmhVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objA);
        }
        return new yut((java.util.Locale) objA);
    }
}
