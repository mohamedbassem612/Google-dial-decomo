package com.google.android.libraries.notifications.platform.internal.room;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class GnpRoomDatabase_Impl extends com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase {
    private volatile defpackage.aeeh n;

    @Override // defpackage.gfy
    protected final defpackage.gfn a() {
        return new defpackage.gfn(this, new java.util.HashMap(0), new java.util.HashMap(0), "gnp_accounts");
    }

    @Override // defpackage.gfy
    protected final /* synthetic */ defpackage.ggb c() {
        return new defpackage.aedf(this);
    }

    @Override // defpackage.gfy
    protected final java.util.Map h() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(defpackage.aeeh.class, java.util.Collections.EMPTY_LIST);
        return map;
    }

    @Override // defpackage.gfy
    public final java.util.Set j() {
        return new java.util.HashSet();
    }

    @Override // defpackage.gfy
    public final java.util.List v() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new defpackage.aecx());
        arrayList.add(new defpackage.aecy());
        arrayList.add(new defpackage.aecz());
        arrayList.add(new defpackage.aeda());
        arrayList.add(new defpackage.aedb());
        arrayList.add(new defpackage.aedc());
        arrayList.add(new defpackage.aedd());
        arrayList.add(new defpackage.aede());
        arrayList.add(new defpackage.aecw());
        return arrayList;
    }

    @Override // com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase
    public final defpackage.aeeh x() {
        defpackage.aeeh aeehVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new defpackage.aeel(this);
            }
            aeehVar = this.n;
        }
        return aeehVar;
    }
}
