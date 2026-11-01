package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aakq extends defpackage.yrp {
    final /* synthetic */ com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest a;
    final /* synthetic */ defpackage.aaks b;
    final /* synthetic */ zzx c;

    public aakq(defpackage.aaks aaksVar, com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest lookupSingleRemoteReachabilityRequest, zzx zzxVar) {
        this.a = lookupSingleRemoteReachabilityRequest;
        this.c = zzxVar;
        j$.util.Objects.requireNonNull(aaksVar);
        this.b = aaksVar;
    }

    @Override // defpackage.yrq
    public final void a(java.util.Map map) {
        com.google.android.gms.duokit.LookupSingleRemoteReachabilityResponse lookupSingleRemoteReachabilityResponse = new com.google.android.gms.duokit.LookupSingleRemoteReachabilityResponse();
        zzx zzxVar = this.c;
        com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest lookupSingleRemoteReachabilityRequest = this.a;
        defpackage.aaks aaksVar = this.b;
        if (map == null || map.isEmpty()) {
            aaksVar.l.s(7);
            com.google.android.gms.duokit.RemoteUserReachability remoteUserReachability = new com.google.android.gms.duokit.RemoteUserReachability();
            remoteUserReachability.a = lookupSingleRemoteReachabilityRequest.a;
            remoteUserReachability.b = 0;
            lookupSingleRemoteReachabilityResponse.a = remoteUserReachability;
            zzxVar.i(lookupSingleRemoteReachabilityResponse);
            return;
        }
        android.os.Bundle bundle = (android.os.Bundle) map.values().iterator().next();
        if (bundle.isEmpty()) {
            aaksVar.l.s(8);
            com.google.android.gms.duokit.RemoteUserReachability remoteUserReachability2 = new com.google.android.gms.duokit.RemoteUserReachability();
            remoteUserReachability2.a = lookupSingleRemoteReachabilityRequest.a;
            remoteUserReachability2.b = 0;
            remoteUserReachability2.c = 0;
            lookupSingleRemoteReachabilityResponse.a = remoteUserReachability2;
            zzxVar.i(lookupSingleRemoteReachabilityResponse);
            return;
        }
        com.google.android.gms.duokit.RemoteUserReachability remoteUserReachability3 = new com.google.android.gms.duokit.RemoteUserReachability();
        remoteUserReachability3.a = lookupSingleRemoteReachabilityRequest.a;
        int i = bundle.getInt("IS_USER_REACHABLE", 0);
        remoteUserReachability3.b = i;
        int i2 = bundle.getInt("IS_USER_MEET_REACHABLE", 0);
        remoteUserReachability3.c = i2;
        int i3 = bundle.getInt("IS_USER_MEET_HANDOVER_CAPABLE", 0);
        remoteUserReachability3.d = i3;
        acxg acxgVar = aaksVar.l;
        akzx akzxVarM = ammc.a.m();
        akzxVarM.u();
        akzxVarM.b.b = i;
        akzxVarM.u();
        akzxVarM.b.c = i2;
        akzxVarM.u();
        akzxVarM.b.d = i3;
        acxgVar.n(akzxVarM.p());
        lookupSingleRemoteReachabilityResponse.a = remoteUserReachability3;
        zzxVar.i(lookupSingleRemoteReachabilityResponse);
    }
}
