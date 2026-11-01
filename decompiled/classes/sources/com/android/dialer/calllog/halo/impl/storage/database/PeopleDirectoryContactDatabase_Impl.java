package com.android.dialer.calllog.halo.impl.storage.database;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class PeopleDirectoryContactDatabase_Impl extends com.android.dialer.calllog.halo.impl.storage.database.PeopleDirectoryContactDatabase {
    private volatile defpackage.khw m;

    @Override // defpackage.gfy
    protected final defpackage.gfn a() {
        return new defpackage.gfn(this, new java.util.HashMap(0), new java.util.HashMap(0), "PeopleDirectoryContactEntity");
    }

    @Override // defpackage.gfy
    protected final /* synthetic */ defpackage.ggb c() {
        return new defpackage.kic(this);
    }

    @Override // defpackage.gfy
    protected final java.util.Map h() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(defpackage.khw.class, java.util.Collections.EMPTY_LIST);
        return map;
    }

    @Override // defpackage.gfy
    public final java.util.Set j() {
        return new java.util.HashSet();
    }

    @Override // defpackage.gfy
    public final java.util.List v() {
        return new java.util.ArrayList();
    }

    @Override // com.android.dialer.calllog.halo.impl.storage.database.PeopleDirectoryContactDatabase
    public final defpackage.khw x() {
        defpackage.khw khwVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new defpackage.kib(this);
            }
            khwVar = this.m;
        }
        return khwVar;
    }
}
