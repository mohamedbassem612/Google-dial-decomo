package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aakm implements defpackage.aaui {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ defpackage.zzx c;

    public /* synthetic */ aakm(defpackage.aakn aaknVar, defpackage.aakh aakhVar, defpackage.zzx zzxVar, int i) {
        this.$cid = i;
        this.a = aaknVar;
        this.b = aakhVar;
        this.c = zzxVar;
    }

    @Override // defpackage.aaui
    public final void d(java.lang.Object obj) {
        defpackage.aauq aauqVar;
        java.lang.Object obj2;
        int i;
        if (this.$cid != 0) {
            defpackage.aakj aakjVar = (defpackage.aakj) obj;
            int i2 = defpackage.aakc.b;
            android.content.Intent flags = new android.content.Intent("com.google.android.apps.tachyon.intent.INSTALL").setPackage("com.google.android.apps.tachyon").setFlags(32);
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = defpackage.aakc.a;
            if (!atomicBoolean.get()) {
                java.lang.Object obj3 = this.b;
                if (android.os.Build.VERSION.SDK_INT < 34) {
                    ((android.content.Context) obj3).sendBroadcast(flags);
                } else {
                    aabo$.ExternalSyntheticApiModelOutline0.m((android.content.Context) obj3, flags, (java.lang.String) null, aabo$.ExternalSyntheticApiModelOutline0.m(aabo$.ExternalSyntheticApiModelOutline0.m(aabo$.ExternalSyntheticApiModelOutline0.m(), true)));
                }
                atomicBoolean.compareAndSet(false, true);
            }
            int iA = aakjVar.a();
            if (iA == 1) {
                i = 3;
            } else if (iA != 2) {
                i = iA != 3 ? 7 : 5;
            } else {
                i = 4;
            }
            ((defpackage.acxg) this.a).p(i);
            com.google.android.gms.duokit.GetApiAvailabilityResponse getApiAvailabilityResponse = new com.google.android.gms.duokit.GetApiAvailabilityResponse();
            int iA2 = aakjVar.b() ? 3 : aakjVar.a();
            defpackage.zzx zzxVar = this.c;
            getApiAvailabilityResponse.a = iA2;
            zzxVar.i(getApiAvailabilityResponse);
            return;
        }
        java.lang.Object obj4 = this.b;
        defpackage.zzx zzxVar2 = this.c;
        final defpackage.yro yroVar = (defpackage.yro) obj;
        try {
            android.os.Parcel parcelEQ = yroVar.eQ(1, yroVar.eP());
            byte[] bArrCreateByteArray = parcelEQ.createByteArray();
            parcelEQ.recycle();
            defpackage.alad aladVarE = defpackage.alad.E(defpackage.ajdo.b, bArrCreateByteArray, 0, bArrCreateByteArray.length, defpackage.akzq.a());
            defpackage.alad.V(aladVarE);
            defpackage.ajdo ajdoVar = (defpackage.ajdo) aladVarE;
            final boolean zB = defpackage.aakn.b(ajdoVar, defpackage.ajdn.DUO_KIT_REQUESTS);
            final boolean zB2 = defpackage.aakn.b(ajdoVar, defpackage.ajdn.MEET_API_REQUESTS);
            if (defpackage.aakn.b(ajdoVar, defpackage.ajdn.SERVICE_API_GET_REGISTERED_ID_TYPE)) {
                defpackage.zzx zzxVar3 = new defpackage.zzx((char[]) null);
                try {
                    defpackage.aatd aatdVar = new defpackage.aatd(zzxVar3, 1);
                    android.os.Parcel parcelEP = yroVar.eP();
                    java.lang.ClassLoader classLoader = defpackage.yld.a;
                    parcelEP.writeStrongBinder(aatdVar);
                    yroVar.eR(3, parcelEP);
                } catch (android.os.RemoteException e) {
                    if (!zzxVar3.h(e)) {
                        android.util.Log.e("DuoStateFetcher", "Error setting exception--task is already complete.", e);
                    }
                }
                obj2 = zzxVar3.a;
            } else {
                android.accounts.AccountManager accountManager = android.accounts.AccountManager.get(((defpackage.aakn) this.a).a);
                defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1242, "AccountManager.getAccounts", defpackage.ahot.a, true);
                try {
                    android.accounts.Account[] accounts = accountManager.getAccounts();
                    ahoqVarX.close();
                    int length = accounts.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            java.lang.Boolean bool = java.lang.Boolean.FALSE;
                            aauqVar = new defpackage.aauq();
                            aauqVar.s(bool);
                            break;
                        }
                        android.accounts.Account account = accounts[i3];
                        if ("Duo".equals(account.name) && "com.google.android.apps.tachyon".equals(account.type)) {
                            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                            aauqVar = new defpackage.aauq();
                            aauqVar.s(bool2);
                            break;
                        }
                        i3++;
                    }
                    obj2 = aauqVar;
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarX.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            defpackage.aaum aaumVarC = ((defpackage.aaum) obj2).c(defpackage.aaup.a, new defpackage.aaua() { // from class: aakk
                @Override // defpackage.aaua
                public final java.lang.Object a(defpackage.aaum aaumVar) {
                    defpackage.yro yroVar2 = yroVar;
                    if (!aaumVar.k()) {
                        return defpackage.aazc.r((java.lang.Exception) j$.util.Objects.requireNonNull(aaumVar.f()));
                    }
                    boolean z = aaumVar.k() && ((java.lang.Boolean) aaumVar.g()).booleanValue();
                    if (!z || !zB2) {
                        defpackage.aakj aakjVar2 = new defpackage.aakj(zB, z, false);
                        defpackage.aauq aauqVar2 = new defpackage.aauq();
                        aauqVar2.s(aakjVar2);
                        return aauqVar2;
                    }
                    defpackage.zzx zzxVar4 = new defpackage.zzx((char[]) null);
                    try {
                        ylo yloVar = new ylo(zzxVar4, 6);
                        android.os.Parcel parcelEP2 = yroVar2.eP();
                        defpackage.yld.f(parcelEP2, yloVar);
                        yroVar2.eR(4, parcelEP2);
                    } catch (android.os.RemoteException e2) {
                        android.util.Log.e("DuoStateFetcher", "Error getting Meet registered.", e2);
                        zzxVar4.i(new defpackage.aakj(true, true, false));
                    }
                    return zzxVar4.a;
                }
            });
            j$.util.Objects.requireNonNull(zzxVar2);
            aaumVarC.a(new defpackage.ajxh(zzxVar2, 1));
            aaumVarC.q(new defpackage.aakl(obj4, zzxVar2, 0));
        } catch (defpackage.alaz | android.os.RemoteException | java.lang.NullPointerException e2) {
            android.util.Log.e("DuoStateFetcher", "Error getting features.", e2);
            ((defpackage.aakh) obj4).initCause(e2);
            zzxVar2.h((java.lang.Exception) obj4);
        }
    }

    public /* synthetic */ aakm(defpackage.zzx zzxVar, android.content.Context context, defpackage.acxg acxgVar, int i) {
        this.$cid = i;
        this.c = zzxVar;
        this.b = context;
        this.a = acxgVar;
    }
}
