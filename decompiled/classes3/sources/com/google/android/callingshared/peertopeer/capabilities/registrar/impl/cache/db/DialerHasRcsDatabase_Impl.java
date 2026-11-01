package com.google.android.callingshared.peertopeer.capabilities.registrar.impl.cache.db;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class DialerHasRcsDatabase_Impl extends com.google.android.callingshared.peertopeer.capabilities.registrar.impl.cache.db.DialerHasRcsDatabase {
    private volatile defpackage.zey m;

    protected final gfn a() {
        return new gfn(this, new java.util.HashMap(0), new java.util.HashMap(0), new java.lang.String[]{"dialer_has_rcs_data"});
    }

    protected final /* synthetic */ ggb c() {
        return new defpackage.zfb(this);
    }

    protected final java.util.Map h() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(defpackage.zey.class, java.util.Collections.EMPTY_LIST);
        return map;
    }

    public final java.util.Set j() {
        return new java.util.HashSet();
    }

    public final java.util.List v() {
        return new java.util.ArrayList();
    }

    @Override // com.google.android.callingshared.peertopeer.capabilities.registrar.impl.cache.db.DialerHasRcsDatabase
    public final defpackage.zey x() {
        defpackage.zey zeyVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new defpackage.zfa(this);
            }
            zeyVar = this.m;
        }
        return zeyVar;
    }
}
