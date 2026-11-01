package com.android.dialer.spam.call.database;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class SpamCallDatabase_Impl extends com.android.dialer.spam.call.database.SpamCallDatabase {
    private volatile defpackage.ucw m;

    @Override // defpackage.gfy
    protected final defpackage.gfn a() {
        return new defpackage.gfn(this, new java.util.HashMap(0), new java.util.HashMap(0), "SpamCall");
    }

    @Override // defpackage.gfy
    protected final /* synthetic */ defpackage.ggb c() {
        return new defpackage.ucz(this);
    }

    @Override // defpackage.gfy
    protected final java.util.Map h() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(defpackage.ucw.class, java.util.Collections.EMPTY_LIST);
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

    @Override // com.android.dialer.spam.call.database.SpamCallDatabase
    public final defpackage.ucw x() {
        defpackage.ucw ucwVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new defpackage.ucy(this);
            }
            ucwVar = this.m;
        }
        return ucwVar;
    }
}
