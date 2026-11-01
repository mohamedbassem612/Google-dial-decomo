package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pex implements defpackage.zjf {
    private static final aimz a = aimz.i("com/android/dialer/incall/background/impl/wear/datasync/impl/CallBackgroundDataSyncProvider");
    private final orx b;
    private final rlv c;
    private final android.content.Context d;
    private final zpm e;

    public pex(zpm zpmVar, orx orxVar, rlv rlvVar, android.content.Context context) {
        aooh.f(zpmVar, "callScopes");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(context, "context");
        this.e = zpmVar;
        this.b = orxVar;
        this.c = rlvVar;
        this.d = context;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x011e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0133  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // defpackage.zjf
    public final java.lang.Object a(defpackage.zjd zjdVar, aoln aolnVar) {
        defpackage.pew pewVar;
        defpackage.zjb zjbVar;
        defpackage.pdu pduVarC;
        byte[] bArr;
        if (aolnVar instanceof defpackage.pew) {
            pewVar = (defpackage.pew) aolnVar;
            int i = pewVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pewVar.c = i - Integer.MIN_VALUE;
            } else {
                pewVar = new defpackage.pew(this, aolnVar);
            }
        } else {
            pewVar = new defpackage.pew(this, aolnVar);
        }
        java.lang.Object objB = pewVar.a;
        aolu aoluVar = aolu.a;
        int i2 = pewVar.c;
        if (i2 == 0) {
            aooc.af(objB);
            this.c.o(rmx.yR);
            aooh.f(zjdVar, "<this>");
            if ((zjdVar.b & 1) != 0) {
                zjbVar = zjdVar.c;
                if (zjbVar == null) {
                    zjbVar = defpackage.zjb.a;
                }
            } else {
                zjbVar = null;
            }
            java.lang.String str = zjbVar != null ? zjbVar.e : null;
            if (str == null || str.length() == 0) {
                a.d().l("com/android/dialer/incall/background/impl/wear/datasync/impl/CallBackgroundDataSyncProvider", "onDataSyncRequest", 47, "CallBackgroundDataSyncProvider.kt").v("Data sync failed: synthetic call id was null or empty.");
            } else {
                a.b().l("com/android/dialer/incall/background/impl/wear/datasync/impl/CallBackgroundDataSyncProvider", "onDataSyncRequest", 50, "CallBackgroundDataSyncProvider.kt").v("Data sync requested for call background.");
                pewVar.c = 1;
                objB = b(str, pewVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
            }
            return null;
        }
        if (i2 == 1) {
            aooc.af(objB);
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objB);
        }
        bArr = (byte[]) objB;
        if (bArr != null) {
            a.d().l("com/android/dialer/incall/background/impl/wear/datasync/impl/CallBackgroundDataSyncProvider", "onDataSyncRequest", 72, "CallBackgroundDataSyncProvider.kt").v("Data sync failed: Bitmap unable to crop.");
            return null;
        }
        akzc akzcVarU = akzc.u(bArr);
        akzx akzxVarM = defpackage.zje.a.m();
        aooh.f(akzxVarM, "builder");
        aooh.c(akzcVarU);
        aooh.f(akzcVarU, "value");
        akzxVarM.u();
        defpackage.zje zjeVar = (defpackage.zje) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzcVarU);
        zjeVar.b |= 1;
        zjeVar.c = akzcVarU;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        a.b().l("com/android/dialer/incall/background/impl/wear/datasync/impl/CallBackgroundDataSyncProvider", "onDataSyncRequest", 77, "CallBackgroundDataSyncProvider.kt").v("Call background data sync successfully prepared.");
        return ((defpackage.zje) aladVarP).i();
        defpackage.pdv pdvVar = (defpackage.pdv) objB;
        java.lang.String str2 = (pdvVar == null || (pduVarC = pez.c(pdvVar)) == null) ? null : pduVarC.f;
        if (str2 == null) {
            a.d().l("com/android/dialer/incall/background/impl/wear/datasync/impl/CallBackgroundDataSyncProvider", "onDataSyncRequest", 54, "CallBackgroundDataSyncProvider.kt").v("Data sync failed: image uri is null.");
        } else {
            android.content.Context context = this.d;
            int iMin = java.lang.Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
            orx orxVar = this.b;
            android.net.Uri uri = android.net.Uri.parse(str2);
            aooh.e(uri, "parse(...)");
            defpackage.pdu pduVarC2 = pez.c(pdvVar);
            java.lang.Float f = pduVarC2 != null ? new java.lang.Float(pduVarC2.c) : null;
            defpackage.pdu pduVarC3 = pez.c(pdvVar);
            java.lang.Float f2 = pduVarC3 != null ? new java.lang.Float(pduVarC3.d) : null;
            defpackage.pdu pduVarC4 = pez.c(pdvVar);
            java.lang.Float f3 = pduVarC4 != null ? new java.lang.Float(pduVarC4.e) : null;
            pewVar.c = 2;
            objB = aoov.aj(orxVar.c, new orw(orxVar, uri, f, f2, f3, iMin, iMin, (aoln) null), pewVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            bArr = (byte[]) objB;
            if (bArr != null) {
                akzc akzcVarU2 = akzc.u(bArr);
                akzx akzxVarM2 = defpackage.zje.a.m();
                aooh.f(akzxVarM2, "builder");
                aooh.c(akzcVarU2);
                aooh.f(akzcVarU2, "value");
                akzxVarM2.u();
                defpackage.zje zjeVar2 = (defpackage.zje) akzxVarM2.b;
                j$.util.Objects.requireNonNull(akzcVarU2);
                zjeVar2.b |= 1;
                zjeVar2.c = akzcVarU2;
                alad aladVarP2 = akzxVarM2.p();
                aooh.e(aladVarP2, "build(...)");
                a.b().l("com/android/dialer/incall/background/impl/wear/datasync/impl/CallBackgroundDataSyncProvider", "onDataSyncRequest", 77, "CallBackgroundDataSyncProvider.kt").v("Call background data sync successfully prepared.");
                return ((defpackage.zje) aladVarP2).i();
            }
            a.d().l("com/android/dialer/incall/background/impl/wear/datasync/impl/CallBackgroundDataSyncProvider", "onDataSyncRequest", 72, "CallBackgroundDataSyncProvider.kt").v("Data sync failed: Bitmap unable to crop.");
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if (r11 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a7 -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r10, aoln r11) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pex.b(java.lang.String, aoln):java.lang.Object");
    }
}
