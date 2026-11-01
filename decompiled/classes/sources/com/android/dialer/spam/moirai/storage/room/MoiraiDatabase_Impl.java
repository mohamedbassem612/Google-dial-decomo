package com.android.dialer.spam.moirai.storage.room;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class MoiraiDatabase_Impl extends com.android.dialer.spam.moirai.storage.room.MoiraiDatabase {
    private volatile defpackage.uha m;

    @Override // defpackage.gfy
    protected final defpackage.gfn a() {
        return new defpackage.gfn(this, new java.util.HashMap(0), new java.util.HashMap(0), "moirai_data");
    }

    @Override // defpackage.gfy
    protected final /* synthetic */ defpackage.ggb c() {
        return new defpackage.uhe(this);
    }

    @Override // defpackage.gfy
    protected final java.util.Map h() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(defpackage.uha.class, java.util.Collections.EMPTY_LIST);
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

    @Override // com.android.dialer.spam.moirai.storage.room.MoiraiDatabase
    public final defpackage.uha x() {
        defpackage.uha uhaVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new defpackage.uhc(this);
            }
            uhaVar = this.m;
        }
        return uhaVar;
    }
}
