package com.android.dialer.sharpie.impl.storage.database;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class SharpieDatabase_Impl extends com.android.dialer.sharpie.impl.storage.database.SharpieDatabase {
    private volatile defpackage.ttx m;

    @Override // defpackage.gfy
    protected final defpackage.gfn a() {
        return new defpackage.gfn(this, new java.util.HashMap(0), new java.util.HashMap(0), "sharpie_data");
    }

    @Override // defpackage.gfy
    protected final /* synthetic */ defpackage.ggb c() {
        return new defpackage.tui(this);
    }

    @Override // defpackage.gfy
    protected final java.util.Map h() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(defpackage.ttx.class, java.util.Collections.EMPTY_LIST);
        return map;
    }

    @Override // defpackage.gfy
    public final java.util.Set j() {
        return new java.util.HashSet();
    }

    @Override // defpackage.gfy
    public final java.util.List v() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new defpackage.tuh());
        return arrayList;
    }

    @Override // com.android.dialer.sharpie.impl.storage.database.SharpieDatabase
    public final defpackage.ttx x() {
        defpackage.ttx ttxVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new defpackage.tuc(this);
            }
            ttxVar = this.m;
        }
        return ttxVar;
    }
}
