package com.google.android.callingshared.peertopeer.capabilities.registrar.impl.cache.db;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class DialerCapabilityDatabase_Impl extends com.google.android.callingshared.peertopeer.capabilities.registrar.impl.cache.db.DialerCapabilityDatabase {
    private volatile defpackage.zek m;
    private volatile defpackage.zer n;

    protected final gfn a() {
        return new gfn(this, new java.util.HashMap(0), new java.util.HashMap(0), new java.lang.String[]{"dialer_capability_data", "dialer_contact_status_data"});
    }

    protected final /* synthetic */ ggb c() {
        return new defpackage.zen(this);
    }

    protected final java.util.Map h() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(defpackage.zek.class, java.util.Collections.EMPTY_LIST);
        map.put(defpackage.zer.class, java.util.Collections.EMPTY_LIST);
        return map;
    }

    public final java.util.Set j() {
        return new java.util.HashSet();
    }

    public final java.util.List v() {
        return new java.util.ArrayList();
    }

    @Override // com.google.android.callingshared.peertopeer.capabilities.registrar.impl.cache.db.DialerCapabilityDatabase
    public final defpackage.zek x() {
        defpackage.zek zekVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new defpackage.zem(this);
            }
            zekVar = this.m;
        }
        return zekVar;
    }

    @Override // com.google.android.callingshared.peertopeer.capabilities.registrar.impl.cache.db.DialerCapabilityDatabase
    public final defpackage.zer y() {
        defpackage.zer zerVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new defpackage.zet(this);
            }
            zerVar = this.n;
        }
        return zerVar;
    }
}
