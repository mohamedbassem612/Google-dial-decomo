package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class wgt implements defpackage.zta {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/wirelesspriorityservice/impl/WpsWarningDialogPrecallIntegration");
    private static final java.lang.String[] b = {"*272", "#31#*272", "*31#*272"};
    private final defpackage.oko c;
    private final defpackage.aoss d;

    public wgt(defpackage.oko okoVar, defpackage.aoss aossVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.c = okoVar;
        this.d = aossVar;
    }

    @Override // defpackage.zta
    public final al a(zrx zrxVar) {
        defpackage.aooh.f(zrxVar, "callParameter");
        wgp wgpVar = new wgp();
        defpackage.amxr.g(wgpVar);
        defpackage.ahgl.b(wgpVar, zrxVar);
        return wgpVar;
    }

    @Override // defpackage.zta
    public final defpackage.ajcq b(zrx zrxVar) {
        defpackage.aooh.f(zrxVar, "callParameter");
        java.lang.String schemeSpecificPart = android.net.Uri.parse(zrxVar.e).getSchemeSpecificPart();
        if (schemeSpecificPart != null) {
            java.lang.String[] strArr = b;
            for (int i = 0; i < 3; i++) {
                if (defpackage.aoov.ad(schemeSpecificPart, strArr[i])) {
                    return defpackage.aosv.F(this.d, 0, new vjf(this, zrxVar, (defpackage.aoln) null, 11), 3);
                }
            }
        }
        return defpackage.aiql.z(zsz.b);
    }

    @Override // defpackage.zta
    public final /* synthetic */ defpackage.ajcq c(zrx zrxVar) {
        return defpackage.aiql.z(zrxVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.aoln aolnVar) throws java.lang.Throwable {
        wgs wgsVar;
        defpackage.oko okoVar;
        int i;
        int i2;
        java.lang.Integer num;
        boolean z;
        boolean z2;
        if (aolnVar instanceof wgs) {
            wgsVar = (wgs) aolnVar;
            int i3 = wgsVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wgsVar.d = i3 - Integer.MIN_VALUE;
            } else {
                wgsVar = new wgs(this, aolnVar);
            }
        } else {
            wgsVar = new wgs(this, aolnVar);
        }
        java.lang.Object objD = wgsVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i4 = wgsVar.d;
        boolean z3 = false;
        if (i4 != 0) {
            if (i4 == 1) {
                defpackage.aooc.af(objD);
            } else if (i4 == 2) {
                okoVar = wgsVar.e;
                defpackage.aooc.af(objD);
                if (((java.lang.Number) objD).intValue() == 13) {
                    i = 1;
                } else {
                    i = 0;
                }
                wgsVar.e = null;
                wgsVar.a = i;
                wgsVar.d = 3;
                objD = defpackage.aoov.aj(okoVar.e, new defpackage.ohg(okoVar, (defpackage.aoln) null, 18, (byte[]) null), wgsVar);
                if (objD != aoluVar) {
                    return aoluVar;
                }
                i2 = i;
            } else {
                if (i4 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = wgsVar.a;
                defpackage.aooc.af(objD);
            }
            num = (java.lang.Integer) objD;
            if (num == null && num.intValue() == 2) {
                z = true;
            } else {
                z = false;
            }
            if (1 != i2) {
                z2 = false;
            } else {
                z2 = true;
            }
            ((defpackage.aimw) a.b().l("com/android/dialer/wirelesspriorityservice/impl/WpsWarningDialogPrecallIntegration", "hasBackgroundVolteCall", 69, "WpsWarningDialogPrecallIntegration.kt")).L("checking background call: isOnVolte: %b, hasCurrentActiveCall: %b", z2, z);
            if (i2 != 0 && z) {
                z3 = true;
            }
            return java.lang.Boolean.valueOf(z3);
        }
        defpackage.aooc.af(objD);
        defpackage.ajcq ajcqVarN = this.c.n(phoneAccountHandle);
        wgsVar.d = 1;
        objD = defpackage.aosv.D(ajcqVarN, wgsVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        okoVar = (defpackage.oko) objD;
        wgsVar.e = okoVar;
        wgsVar.d = 2;
        objD = defpackage.aoov.aj(okoVar.e, new defpackage.okl(okoVar, (defpackage.aoln) null, 10, (int[][]) null), wgsVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Number) objD).intValue() == 13) {
            i = 1;
        } else {
            i = 0;
        }
        wgsVar.e = null;
        wgsVar.a = i;
        wgsVar.d = 3;
        objD = defpackage.aoov.aj(okoVar.e, new defpackage.ohg(okoVar, (defpackage.aoln) null, 18, (byte[]) null), wgsVar);
        if (objD != aoluVar) {
            return aoluVar;
        }
        i2 = i;
        num = (java.lang.Integer) objD;
        if (num == null) {
            z = false;
        } else {
            z = false;
        }
        if (1 != i2) {
            z2 = false;
        } else {
            z2 = true;
        }
        ((defpackage.aimw) a.b().l("com/android/dialer/wirelesspriorityservice/impl/WpsWarningDialogPrecallIntegration", "hasBackgroundVolteCall", 69, "WpsWarningDialogPrecallIntegration.kt")).L("checking background call: isOnVolte: %b, hasCurrentActiveCall: %b", z2, z);
        if (i2 != 0) {
            z3 = true;
        }
        return java.lang.Boolean.valueOf(z3);
    }
}
