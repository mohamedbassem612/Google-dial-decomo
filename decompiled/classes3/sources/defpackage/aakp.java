package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aakp implements defpackage.aaul {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ aakp(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.aaul
    public final aaum a(java.lang.Object obj) {
        aaum aaumVarW;
        int i = this.$cid;
        int i2 = 3;
        if (i == 0) {
            boolean zB = ((aakj) obj).b();
            java.lang.Object obj2 = this.a;
            if (!zB) {
                ((defpackage.aaks) obj2).l.s(4);
                return aazc.r(new java.lang.IllegalStateException("API provider not available"));
            }
            java.lang.Object obj3 = this.b;
            defpackage.rix rixVar = new defpackage.rix(obj2, 4);
            defpackage.aakp aakpVar = new defpackage.aakp(obj2, obj3, i2);
            if (!((com.google.android.gms.duokit.LookupRemoteReachabilityRequest) obj3).c) {
                aaum aaumVarA = ((defpackage.aaks) obj2).a();
                aaumVarA.q(rixVar);
                return aaumVarA.d(aakpVar);
            }
            defpackage.aaks aaksVar = (defpackage.aaks) obj2;
            aaum aaumVarA2 = aaksVar.a();
            ahzi ahziVar = aaksVar.a;
            aaumVarA2.o((java.util.concurrent.Executor) ahziVar.eZ(), rixVar);
            return aaumVarA2.e((java.util.concurrent.Executor) ahziVar.eZ(), aakpVar);
        }
        int i3 = 2;
        if (i == 1) {
            final defpackage.aakb aakbVar = (defpackage.aakb) obj;
            boolean z = aakbVar.c.a;
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = aakbVar.d;
            final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (atomicBoolean.get()) {
                aaumVarW = aazc.r(new aacw(new com.google.android.gms.common.api.Status(10, "DroidGuard handle is closed", (android.app.PendingIntent) null, (com.google.android.gms.common.ConnectionResult) null)));
            } else {
                int i4 = true != z ? 2 : 1;
                final ?? r15 = this.b;
                aaumVarW = aakbVar.e.w(i4, 2, new defpackage.aajq() { // from class: aaka
                    @Override // defpackage.aajq
                    public final java.lang.Object a(aagp aagpVar) {
                        return aakbVar.b(aagpVar, r15);
                    }
                });
            }
            java.lang.Object obj4 = this.a;
            final int i5 = 2;
            aaumVarW.n(aakbVar.a, new aaug() { // from class: aajw
                public final void a(aaum aaumVar) {
                    int i6 = i5;
                    if (i6 == 0) {
                        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                        long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - jElapsedRealtime;
                        ((aaju) ((ahbq) aakbVar).b).a(35502, aaumVar, jCurrentTimeMillis, jCurrentTimeMillis2, jElapsedRealtime2);
                        return;
                    }
                    if (i6 != 1) {
                        ((defpackage.aakb) aakbVar).b.a(35503, aaumVar, jCurrentTimeMillis, java.lang.System.currentTimeMillis(), android.os.SystemClock.elapsedRealtime() - jElapsedRealtime);
                    } else {
                        long jCurrentTimeMillis3 = java.lang.System.currentTimeMillis();
                        long jElapsedRealtime3 = android.os.SystemClock.elapsedRealtime() - jElapsedRealtime;
                        ((aaju) ((ahbq) aakbVar).b).a(35501, aaumVar, jCurrentTimeMillis, jCurrentTimeMillis3, jElapsedRealtime3);
                    }
                }
            });
            aaumVarW.n((java.util.concurrent.Executor) ((ahbq) obj4).c, new defpackage.aadq(aakbVar, 3));
            return aaumVarW;
        }
        if (i == 2) {
            defpackage.yrr yrrVar = (defpackage.yrr) obj;
            zzx zzxVar = new zzx((char[]) null);
            java.lang.Object obj5 = this.b;
            java.lang.Object obj6 = this.a;
            try {
                yrrVar.a(aify.p(((com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest) obj5).a.b), new defpackage.aakq((defpackage.aaks) obj6, (com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest) obj5, zzxVar));
            } catch (android.os.RemoteException unused) {
                ((defpackage.aaks) obj6).l.s(6);
                zzxVar.h(new java.lang.IllegalStateException("Failed to query Duo reachability service"));
            }
            return (aaum) zzxVar.a;
        }
        if (i == 3) {
            defpackage.yrr yrrVar2 = (defpackage.yrr) obj;
            zzx zzxVar2 = new zzx((char[]) null);
            java.lang.Object obj7 = this.b;
            java.lang.Object obj8 = this.a;
            try {
                aift aiftVar = new aift(4);
                for (com.google.android.gms.duokit.DuoId duoId : ((com.google.android.gms.duokit.LookupRemoteReachabilityRequest) obj7).a) {
                    aiftVar.i(duoId.b);
                }
                yrrVar2.a(aiftVar.h(), new defpackage.aakr((defpackage.aaks) obj8, (com.google.android.gms.duokit.LookupRemoteReachabilityRequest) obj7, zzxVar2));
            } catch (android.os.RemoteException unused2) {
                ((defpackage.aaks) obj8).l.s(6);
                zzxVar2.h(new java.lang.IllegalStateException("Failed to query Duo reachability service"));
            }
            return (aaum) zzxVar2.a;
        }
        boolean zB2 = ((aakj) obj).b();
        java.lang.Object obj9 = this.a;
        if (!zB2) {
            ((defpackage.aaks) obj9).l.s(4);
            return aazc.r(new java.lang.IllegalStateException("API provider not available"));
        }
        java.lang.Object obj10 = this.b;
        defpackage.rix rixVar2 = new defpackage.rix(obj9, 3);
        defpackage.aakp aakpVar2 = new defpackage.aakp(obj9, obj10, i3);
        if (!((com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest) obj10).c) {
            aaum aaumVarA3 = ((defpackage.aaks) obj9).a();
            aaumVarA3.q(rixVar2);
            return aaumVarA3.d(aakpVar2);
        }
        defpackage.aaks aaksVar2 = (defpackage.aaks) obj9;
        aaum aaumVarA4 = aaksVar2.a();
        ahzi ahziVar2 = aaksVar2.a;
        aaumVarA4.o((java.util.concurrent.Executor) ahziVar2.eZ(), rixVar2);
        return aaumVarA4.e((java.util.concurrent.Executor) ahziVar2.eZ(), aakpVar2);
    }
}
