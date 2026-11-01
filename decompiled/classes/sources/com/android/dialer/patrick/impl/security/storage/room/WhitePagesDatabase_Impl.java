package com.android.dialer.patrick.impl.security.storage.room;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class WhitePagesDatabase_Impl extends com.android.dialer.patrick.impl.security.storage.room.WhitePagesDatabase {
    private volatile defpackage.sdg m;

    @Override // defpackage.gfy
    protected final defpackage.gfn a() {
        return new defpackage.gfn(this, new java.util.HashMap(0), new java.util.HashMap(0), "white_pages_data");
    }

    @Override // defpackage.gfy
    protected final /* synthetic */ defpackage.ggb c() {
        return new defpackage.sdm(this);
    }

    @Override // defpackage.gfy
    protected final java.util.Map h() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(defpackage.sdg.class, java.util.Collections.EMPTY_LIST);
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

    @Override // com.android.dialer.patrick.impl.security.storage.room.WhitePagesDatabase
    public final defpackage.sdg x() {
        defpackage.sdg sdgVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new defpackage.sdk(this);
            }
            sdgVar = this.m;
        }
        return sdgVar;
    }
}
