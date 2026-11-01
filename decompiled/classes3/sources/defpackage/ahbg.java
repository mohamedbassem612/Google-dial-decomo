package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahbg implements agou {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ahbg(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [aoin, java.lang.Object] */
    public final ajcq b(defpackage.agos agosVar) {
        int i = this.$cid;
        if (i != 0) {
            ?? r7 = this.a;
            if (i != 1) {
                return ((ahlt) r7.a()).e();
            }
            ajcq ajcqVarZ = aiql.z((java.lang.Object) null);
            ((aogc) r7).s(ajcqVarZ, "com.google.apps.tiktok.account.data.AllAccounts");
            return ajcqVarZ;
        }
        ahoq ahoqVarX = ahvr.X(1345, "AccountEnabled: updateConfigurationsForAllPackages", ahot.a, true);
        java.lang.Object obj = this.a;
        try {
            com.google.apps.tiktok.account.AccountId accountId = agosVar.a;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            ailj ailjVarK = ((aikj) ((ahbz) obj).b).e().k();
            while (ailjVarK.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
                if (((ahav) entry.getValue()) == ahav.b) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            java.util.Set setKeySet = linkedHashMap.keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : setKeySet) {
                if (((ahbz) obj).f()) {
                    arrayList.add(obj2);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((apnt) ((ahbz) obj).e).c((java.lang.String) it.next()));
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(ajsz.bl(arrayList2, 10));
            java.util.Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((ahbz) obj).e((java.lang.String) it2.next(), accountId));
            }
            ajcq ajcqVarAL = agab.aL(arrayList3);
            ahoqVarX.a(ajcqVarAL);
            ajsz.ak(ahoqVarX, (java.lang.Throwable) null);
            return ajcqVarAL;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarX, th);
                throw th2;
            }
        }
    }
}
