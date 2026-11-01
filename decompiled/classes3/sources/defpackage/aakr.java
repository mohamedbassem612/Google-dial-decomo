package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aakr extends defpackage.yrp {
    final /* synthetic */ com.google.android.gms.duokit.LookupRemoteReachabilityRequest a;
    final /* synthetic */ defpackage.aaks b;
    final /* synthetic */ zzx c;

    public aakr(defpackage.aaks aaksVar, com.google.android.gms.duokit.LookupRemoteReachabilityRequest lookupRemoteReachabilityRequest, zzx zzxVar) {
        this.a = lookupRemoteReachabilityRequest;
        this.c = zzxVar;
        j$.util.Objects.requireNonNull(aaksVar);
        this.b = aaksVar;
    }

    @Override // defpackage.yrq
    public final void a(java.util.Map map) {
        com.google.android.gms.duokit.LookupRemoteReachabilityResponse lookupRemoteReachabilityResponse = new com.google.android.gms.duokit.LookupRemoteReachabilityResponse();
        java.util.HashSet hashSet = new java.util.HashSet();
        zzx zzxVar = this.c;
        com.google.android.gms.duokit.LookupRemoteReachabilityRequest lookupRemoteReachabilityRequest = this.a;
        defpackage.aaks aaksVar = this.b;
        if (map == null || map.isEmpty()) {
            aaksVar.l.s(7);
            lookupRemoteReachabilityResponse.a = (com.google.android.gms.duokit.RemoteUserReachability[]) j$.util.DesugarArrays.stream(lookupRemoteReachabilityRequest.a).map(new defpackage.yoz(19)).toArray(new via(2));
            zzxVar.i(lookupRemoteReachabilityResponse);
            return;
        }
        java.util.HashSet<com.google.android.gms.duokit.DuoId> hashSet2 = new java.util.HashSet();
        java.util.Collections.addAll(hashSet2, lookupRemoteReachabilityRequest.a);
        for (java.util.Map.Entry entry : map.entrySet()) {
            com.google.android.gms.duokit.RemoteUserReachability remoteUserReachability = new com.google.android.gms.duokit.RemoteUserReachability();
            java.lang.String str = (java.lang.String) entry.getKey();
            boolean zMatches = str.matches("^\\+?\\d{1,15}$");
            com.google.android.gms.duokit.DuoId duoId = new com.google.android.gms.duokit.DuoId();
            duoId.b = str;
            duoId.a = zMatches ? 1 : 0;
            remoteUserReachability.a = duoId;
            remoteUserReachability.b = ((android.os.Bundle) entry.getValue()).getInt("IS_USER_REACHABLE", 0);
            int i = ((android.os.Bundle) entry.getValue()).getInt("IS_USER_MEET_REACHABLE", 0);
            int i2 = ((android.os.Bundle) entry.getValue()).getInt("IS_USER_MEET_HANDOVER_CAPABLE", 0);
            remoteUserReachability.c = i;
            remoteUserReachability.d = i2;
            hashSet.add(remoteUserReachability);
            hashSet2.remove(duoId);
        }
        for (com.google.android.gms.duokit.DuoId duoId2 : hashSet2) {
            com.google.android.gms.duokit.RemoteUserReachability remoteUserReachability2 = new com.google.android.gms.duokit.RemoteUserReachability();
            remoteUserReachability2.a = duoId2;
            remoteUserReachability2.b = 0;
            hashSet.add(remoteUserReachability2);
        }
        com.google.android.gms.duokit.RemoteUserReachability[] remoteUserReachabilityArr = (com.google.android.gms.duokit.RemoteUserReachability[]) hashSet.toArray(new com.google.android.gms.duokit.RemoteUserReachability[0]);
        if (j$.util.Collection.-EL.stream(hashSet).anyMatch(new defpackage.zun(2))) {
            aaksVar.l.s(8);
        } else {
            com.google.android.gms.duokit.RemoteUserReachability remoteUserReachability3 = remoteUserReachabilityArr[0];
            acxg acxgVar = aaksVar.l;
            akzx akzxVarM = ammc.a.m();
            int i3 = remoteUserReachability3.b;
            akzxVarM.u();
            akzxVarM.b.b = i3;
            int i4 = remoteUserReachability3.c;
            akzxVarM.u();
            akzxVarM.b.c = i4;
            int i5 = remoteUserReachability3.d;
            akzxVarM.u();
            akzxVarM.b.d = i5;
            acxgVar.n(akzxVarM.p());
        }
        lookupRemoteReachabilityResponse.a = remoteUserReachabilityArr;
        zzxVar.i(lookupRemoteReachabilityResponse);
    }
}
