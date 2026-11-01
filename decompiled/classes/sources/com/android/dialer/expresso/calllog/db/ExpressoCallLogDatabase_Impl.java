package com.android.dialer.expresso.calllog.db;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ExpressoCallLogDatabase_Impl extends com.android.dialer.expresso.calllog.db.ExpressoCallLogDatabase {
    private volatile defpackage.oef m;
    private volatile defpackage.oem n;

    @Override // defpackage.gfy
    protected final defpackage.gfn a() {
        return new defpackage.gfn(this, new java.util.HashMap(0), new java.util.HashMap(0), "expresso_call_log_data", "expresso_handshake_data");
    }

    @Override // defpackage.gfy
    protected final /* synthetic */ defpackage.ggb c() {
        return new defpackage.oek(this);
    }

    @Override // defpackage.gfy
    protected final java.util.Map h() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(defpackage.oef.class, java.util.Collections.EMPTY_LIST);
        map.put(defpackage.oem.class, java.util.Collections.EMPTY_LIST);
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

    @Override // com.android.dialer.expresso.calllog.db.ExpressoCallLogDatabase
    public final defpackage.oef x() {
        defpackage.oef oefVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new defpackage.oej(this);
            }
            oefVar = this.m;
        }
        return oefVar;
    }

    @Override // com.android.dialer.expresso.calllog.db.ExpressoCallLogDatabase
    public final defpackage.oem y() {
        defpackage.oem oemVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new defpackage.oer(this);
            }
            oemVar = this.n;
        }
        return oemVar;
    }
}
