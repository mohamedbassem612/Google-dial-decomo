package com.android.dialer.duo.data.database;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class MeetInfoDatabase_Impl extends com.android.dialer.duo.data.database.MeetInfoDatabase {
    private volatile defpackage.nxh m;

    @Override // defpackage.gfy
    protected final defpackage.gfn a() {
        return new defpackage.gfn(this, new java.util.HashMap(0), new java.util.HashMap(0), "meet_reachability_data");
    }

    @Override // defpackage.gfy
    protected final /* synthetic */ defpackage.ggb c() {
        return new defpackage.nxo(this);
    }

    @Override // defpackage.gfy
    protected final java.util.Map h() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(defpackage.nxh.class, java.util.Collections.EMPTY_LIST);
        return map;
    }

    @Override // defpackage.gfy
    public final java.util.Set j() {
        return new java.util.HashSet();
    }

    @Override // defpackage.gfy
    public final java.util.List v() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new defpackage.nxn());
        return arrayList;
    }

    @Override // com.android.dialer.duo.data.database.MeetInfoDatabase
    public final defpackage.nxh x() {
        defpackage.nxh nxhVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new defpackage.nxm(this);
            }
            nxhVar = this.m;
        }
        return nxhVar;
    }
}
