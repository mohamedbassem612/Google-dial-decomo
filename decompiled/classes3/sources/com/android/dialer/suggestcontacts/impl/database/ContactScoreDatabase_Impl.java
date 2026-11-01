package com.android.dialer.suggestcontacts.impl.database;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ContactScoreDatabase_Impl extends com.android.dialer.suggestcontacts.impl.database.ContactScoreDatabase {
    private volatile defpackage.uqt m;

    protected final gfn a() {
        return new gfn(this, new java.util.HashMap(0), new java.util.HashMap(0), new java.lang.String[]{"ContactScore"});
    }

    protected final /* synthetic */ ggb c() {
        return new defpackage.uqw(this);
    }

    protected final java.util.Map h() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(defpackage.uqt.class, java.util.Collections.EMPTY_LIST);
        return map;
    }

    public final java.util.Set j() {
        return new java.util.HashSet();
    }

    public final java.util.List v() {
        return new java.util.ArrayList();
    }

    @Override // com.android.dialer.suggestcontacts.impl.database.ContactScoreDatabase
    public final defpackage.uqt x() {
        defpackage.uqt uqtVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new defpackage.uqv(this);
            }
            uqtVar = this.m;
        }
        return uqtVar;
    }
}
