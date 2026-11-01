package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class bf implements defpackage.gig {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public bf(defpackage.da daVar, int i) {
        this.$cid = i;
        this.a = daVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v13, types: [cjx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.gig
    public final android.os.Bundle a() {
        defpackage.aoiu[] aoiuVarArr;
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.bo) this.a).b();
        }
        if (i == 1) {
            defpackage.az azVar = (defpackage.az) this.a;
            azVar.g();
            azVar.a.f(defpackage.emp.ON_STOP);
            return new android.os.Bundle();
        }
        if (i == 2) {
            android.os.Bundle bundle = new android.os.Bundle();
            ((defpackage.da) this.a).j();
            return bundle;
        }
        if (i == 3) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            defpackage.on onVar = ((defpackage.mp) this.a).g;
            java.util.Map map = onVar.b;
            bundle2.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new java.util.ArrayList<>(map.values()));
            bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new java.util.ArrayList<>(map.keySet()));
            bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new java.util.ArrayList<>(onVar.c));
            bundle2.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new android.os.Bundle(onVar.f));
            return bundle2;
        }
        if (i == 4) {
            java.util.Map mapB = this.a.b();
            android.os.Bundle bundleR = defpackage.dpe.r((defpackage.aoiu[]) java.util.Arrays.copyOf(new defpackage.aoiu[0], 0));
            defpackage.gij.a(bundleR, "androidx.compose.ui.platform.DisposableSaveableStateRegistry", new androidx.compose.ui.platform.ParcelableMapHolder(mapB));
            return bundleR;
        }
        if (i != 5) {
            android.os.Bundle bundle3 = new android.os.Bundle();
            defpackage.agtn agtnVar = (defpackage.agtn) this.a;
            java.util.Set set = agtnVar.c;
            bundle3.putParcelableArray("future_wrappers", (android.os.Parcelable[]) set.toArray(new com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture[set.size()]));
            bundle3.putInt("last_process_id", agtnVar.d);
            agtnVar.b.f(bundle3);
            return bundle3;
        }
        defpackage.gat gatVar = (defpackage.gat) this.a;
        for (java.util.Map.Entry entry : defpackage.ajsz.aS(gatVar.b).entrySet()) {
            gatVar.k((java.lang.String) entry.getKey(), ((defpackage.aozj) entry.getValue()).c());
        }
        for (java.util.Map.Entry entry2 : defpackage.ajsz.aS(gatVar.c).entrySet()) {
            gatVar.k((java.lang.String) entry2.getKey(), ((defpackage.gig) entry2.getValue()).a());
        }
        ?? r5 = gatVar.d;
        if (r5.isEmpty()) {
            aoiuVarArr = new defpackage.aoiu[0];
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(r5.size());
            for (java.util.Map.Entry entry3 : r5.entrySet()) {
                arrayList.add(new defpackage.aoiu((java.lang.String) entry3.getKey(), entry3.getValue()));
            }
            aoiuVarArr = (defpackage.aoiu[]) arrayList.toArray(new defpackage.aoiu[0]);
        }
        return defpackage.dpe.r((defpackage.aoiu[]) java.util.Arrays.copyOf(aoiuVarArr, aoiuVarArr.length));
    }

    public /* synthetic */ bf(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
