package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ola extends aomh implements aonn {
    int a;
    final /* synthetic */ olc b;
    final /* synthetic */ java.util.List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ola(olc olcVar, java.util.List list, aoln aolnVar) {
        super(2, aolnVar);
        this.b = olcVar;
        this.c = list;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [ahzi, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        aigf aigfVar;
        aaum aaumVarS;
        aolu aoluVar = aolu.a;
        try {
            try {
                if (this.a != 0) {
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                    olc olcVar = this.b;
                    java.util.List<java.lang.String> list = this.c;
                    mgv mgvVar = mgv.eQ;
                    kaw kawVarAQ = gus.aQ(mhc.a.m());
                    boolean z = !list.isEmpty();
                    akzx akzxVar = (akzx) kawVarAQ.a;
                    akzxVar.u();
                    mhc mhcVar = akzxVar.b;
                    mhcVar.b = 1;
                    mhcVar.c = java.lang.Boolean.valueOf(z);
                    zjv.i(olcVar.g, mgvVar, ajsz.aY(kawVarAQ.L()), (mhc) null, 0, 28);
                    if (list.isEmpty()) {
                        return aikj.b;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
                    for (java.lang.String str : list) {
                        com.google.android.gms.duokit.DuoId duoId = new com.google.android.gms.duokit.DuoId();
                        duoId.b = str;
                        duoId.a = 1;
                        arrayList.add(duoId);
                    }
                    com.google.android.gms.duokit.DuoId[] duoIdArr = (com.google.android.gms.duokit.DuoId[]) arrayList.toArray(new com.google.android.gms.duokit.DuoId[0]);
                    com.google.android.gms.duokit.LookupRemoteReachabilityRequest lookupRemoteReachabilityRequest = new com.google.android.gms.duokit.LookupRemoteReachabilityRequest();
                    lookupRemoteReachabilityRequest.a = duoIdArr;
                    java.lang.Object objA = olcVar.f.a();
                    aooh.e(objA, "get(...)");
                    lookupRemoteReachabilityRequest.c = ((java.lang.Boolean) objA).booleanValue();
                    gat gatVarE = olcVar.e();
                    ((acxg) gatVarE.a.eZ()).o(14, ahyn.g(lookupRemoteReachabilityRequest.b));
                    aaks aaksVar = (aaks) gatVarE.d.eZ();
                    aaum aaumVarA = ((aakn) gatVarE.e).a();
                    com.google.android.gms.duokit.DuoId[] duoIdArr2 = lookupRemoteReachabilityRequest.a;
                    if (duoIdArr2 == null || duoIdArr2.length == 0) {
                        aaksVar.l.n(ammc.a);
                        aaumVarS = aazc.s(new com.google.android.gms.duokit.LookupRemoteReachabilityResponse());
                    } else {
                        rix rixVar = new rix(aaksVar, 2);
                        aakp aakpVar = new aakp(aaksVar, lookupRemoteReachabilityRequest, 0);
                        if (lookupRemoteReachabilityRequest.c) {
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
                com.google.android.gms.duokit.RemoteUserReachability[] remoteUserReachabilityArr = ((com.google.android.gms.duokit.LookupRemoteReachabilityResponse) obj).a;
                aooh.e(remoteUserReachabilityArr, "getRemoteUserReachabilities(...)");
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(remoteUserReachabilityArr.length), 16));
                for (com.google.android.gms.duokit.RemoteUserReachability remoteUserReachability : remoteUserReachabilityArr) {
                    java.lang.String str2 = remoteUserReachability.a.b;
                    aooh.c(remoteUserReachability);
                    aoiu aoiuVar = new aoiu(str2, gus.ak(remoteUserReachability));
                    linkedHashMap.put(aoiuVar.a, aoiuVar.b);
                }
                return ahvr.bw(linkedHashMap);
            } catch (aovk | aacw unused) {
                aigfVar = aikj.b;
                return aigfVar;
            }
        } catch (java.lang.Exception e) {
            j$.util.Objects.checkIndex(0, 3);
            if (e instanceof aakh) {
                olc.d(e);
            } else if (e instanceof java.lang.IllegalStateException) {
                olc.a.b().k(e).l("com/android/dialer/externals/meet/impl/DialerMeetLibraryImpl", "getDuoKitReachabilitiesInternal$<anonymous>", 189, "DialerMeetLibraryImpl.kt").v("failed to get Meet reachability due to remote illegal state exception");
            } else {
                olc.a.d().k(e).l("com/android/dialer/externals/meet/impl/DialerMeetLibraryImpl", "getDuoKitReachabilitiesInternal$<anonymous>", 194, "DialerMeetLibraryImpl.kt").v("failed to get Meet reachability due to unknown reason");
            }
            aigfVar = aikj.b;
            return aigfVar;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.ola(this.b, this.c, aolnVar);
    }
}
