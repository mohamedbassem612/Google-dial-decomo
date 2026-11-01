package com.android.dialer.callclassification.stirshaken.calllog.storage.database;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class StirShakenDatabase_Impl extends com.android.dialer.callclassification.stirshaken.calllog.storage.database.StirShakenDatabase {
    private volatile defpackage.jrd m;

    @Override // defpackage.gfy
    protected final defpackage.gfn a() {
        return new defpackage.gfn(this, new java.util.HashMap(0), new java.util.HashMap(0), "StirShakenEntity");
    }

    @Override // defpackage.gfy
    protected final /* synthetic */ defpackage.ggb c() {
        return new defpackage.jri(this);
    }

    @Override // defpackage.gfy
    protected final java.util.Map h() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(defpackage.jrd.class, java.util.Collections.EMPTY_LIST);
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

    @Override // com.android.dialer.callclassification.stirshaken.calllog.storage.database.StirShakenDatabase
    public final defpackage.jrd x() {
        defpackage.jrd jrdVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new defpackage.jrh(this);
            }
            jrdVar = this.m;
        }
        return jrdVar;
    }
}
