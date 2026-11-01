package com.android.dialer.beesly.impl.data.database;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class BeeslyDatabase_Impl extends com.android.dialer.beesly.impl.data.database.BeeslyDatabase {
    private volatile defpackage.iue m;

    @Override // defpackage.gfy
    protected final defpackage.gfn a() {
        return new defpackage.gfn(this, new java.util.HashMap(0), new java.util.HashMap(0), "beesly_data");
    }

    @Override // defpackage.gfy
    protected final /* synthetic */ defpackage.ggb c() {
        return new defpackage.iuq(this);
    }

    @Override // defpackage.gfy
    protected final java.util.Map h() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(defpackage.iue.class, java.util.Collections.EMPTY_LIST);
        return map;
    }

    @Override // defpackage.gfy
    public final java.util.Set j() {
        return new java.util.HashSet();
    }

    @Override // defpackage.gfy
    public final java.util.List v() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new defpackage.iuk());
        arrayList.add(new defpackage.iul());
        arrayList.add(new defpackage.ium());
        arrayList.add(new defpackage.iun());
        arrayList.add(new defpackage.iuo());
        arrayList.add(new defpackage.iup());
        return arrayList;
    }

    @Override // com.android.dialer.beesly.impl.data.database.BeeslyDatabase
    public final defpackage.iue x() {
        defpackage.iue iueVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new defpackage.iui(this);
            }
            iueVar = this.m;
        }
        return iueVar;
    }
}
