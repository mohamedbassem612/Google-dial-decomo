package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class olb extends aomh implements aonn {
    int a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ olc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olb(java.lang.String str, olc olcVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = str;
        this.c = olcVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [ahzi, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        aaum aaumVarS;
        java.lang.String str;
        aolu aoluVar = aolu.a;
        int i = 4;
        try {
            if (this.a == 0) {
                aooc.af(obj);
                java.lang.String str2 = this.b;
                if (str2.length() != 0) {
                    com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest lookupSingleRemoteReachabilityRequest = new com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest();
                    com.google.android.gms.duokit.DuoId duoId = new com.google.android.gms.duokit.DuoId();
                    duoId.b = str2;
                    duoId.a = 1;
                    lookupSingleRemoteReachabilityRequest.a = duoId;
                    olc olcVar = this.c;
                    java.lang.Object objA = olcVar.f.a();
                    aooh.e(objA, "get(...)");
                    lookupSingleRemoteReachabilityRequest.c = ((java.lang.Boolean) objA).booleanValue();
                    gat gatVarE = olcVar.e();
                    ((acxg) gatVarE.a.eZ()).o(14, ahyn.g(lookupSingleRemoteReachabilityRequest.b));
                    aaks aaksVar = (aaks) gatVarE.d.eZ();
                    aaum aaumVarA = ((aakn) gatVarE.e).a();
                    com.google.android.gms.duokit.DuoId duoId2 = lookupSingleRemoteReachabilityRequest.a;
                    if (duoId2 == null || (str = duoId2.b) == null || str.isEmpty()) {
                        aaksVar.l.n(ammc.a);
                        aaumVarS = aazc.s(new com.google.android.gms.duokit.LookupSingleRemoteReachabilityResponse());
                    } else {
                        rix rixVar = new rix(aaksVar, 5);
                        aakp aakpVar = new aakp(aaksVar, lookupSingleRemoteReachabilityRequest, 4);
                        if (lookupSingleRemoteReachabilityRequest.c) {
                            ahzi ahziVar = aaksVar.a;
                            aaumVarA.o((java.util.concurrent.Executor) ahziVar.eZ(), rixVar);
                            aaumVarS = aaumVarA.e((java.util.concurrent.Executor) ahziVar.eZ(), aakpVar);
                        } else {
                            aaumVarA.q(rixVar);
                            aaumVarS = aaumVarA.d(aakpVar);
                        }
                    }
                    this.a = 1;
                    obj = aooh.Y(aaumVarS, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                }
                return null;
            }
            aooc.af(obj);
            com.google.android.gms.duokit.RemoteUserReachability remoteUserReachability = ((com.google.android.gms.duokit.LookupSingleRemoteReachabilityResponse) obj).a;
            aooh.e(remoteUserReachability, "getRemoteUserReachability(...)");
            aooh.f(remoteUserReachability, "<this>");
            kaw kawVarAN = gus.aN(nwy.a.m());
            kawVarAN.z(gus.ak(remoteUserReachability));
            int i2 = remoteUserReachability.d;
            if (i2 == 1) {
                i = 3;
            } else if (i2 != 2) {
                i = 2;
            }
            kawVarAN.A(i);
            boolean z = remoteUserReachability.b == 2 && remoteUserReachability.c != 2;
            java.lang.Object obj2 = kawVarAN.a;
            ((akzx) obj2).u();
            nwy nwyVar = ((akzx) obj2).b;
            nwyVar.b |= 16;
            nwyVar.g = z;
            return kawVarAN.x();
        } catch (java.lang.Exception e) {
            j$.util.Objects.checkIndex(0, 5);
            if (e instanceof aacw) {
                olc.a.b().k(e).l("com/android/dialer/externals/meet/impl/DialerMeetLibraryImpl", "getDuoKitReachabilityAndHandoverCapability$<anonymous>", 217, "DialerMeetLibraryImpl.kt").v("failed to get Meet info due to api exception");
            } else if (e instanceof aovk) {
                olc.a.b().k(e).l("com/android/dialer/externals/meet/impl/DialerMeetLibraryImpl", "getDuoKitReachabilityAndHandoverCapability$<anonymous>", 224, "DialerMeetLibraryImpl.kt").v("failed to get Meet info due to timeout cancellation exception");
            } else if (e instanceof aakh) {
                olc.d(e);
            } else if (e instanceof java.lang.IllegalStateException) {
                olc.a.b().k(e).l("com/android/dialer/externals/meet/impl/DialerMeetLibraryImpl", "getDuoKitReachabilityAndHandoverCapability$<anonymous>", 231, "DialerMeetLibraryImpl.kt").v("failed to get Meet info due to remote illegal state exception");
            } else {
                olc.a.d().k(e).l("com/android/dialer/externals/meet/impl/DialerMeetLibraryImpl", "getDuoKitReachabilityAndHandoverCapability$<anonymous>", 233, "DialerMeetLibraryImpl.kt").v("failed to get Meet info due to unknown reason");
            }
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.olb(this.b, this.c, aolnVar);
    }
}
