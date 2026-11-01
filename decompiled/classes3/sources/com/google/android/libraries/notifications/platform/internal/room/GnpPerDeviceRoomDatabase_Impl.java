package com.google.android.libraries.notifications.platform.internal.room;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class GnpPerDeviceRoomDatabase_Impl extends com.google.android.libraries.notifications.platform.internal.room.GnpPerDeviceRoomDatabase {
    private volatile defpackage.aeeo m;

    protected final gfn a() {
        return new gfn(this, new java.util.HashMap(0), new java.util.HashMap(0), new java.lang.String[]{"gnp_experiments"});
    }

    protected final /* synthetic */ ggb c() {
        return new defpackage.aecu(this);
    }

    protected final java.util.Map h() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(defpackage.aeeo.class, java.util.Collections.EMPTY_LIST);
        return map;
    }

    public final java.util.Set j() {
        return new java.util.HashSet();
    }

    public final java.util.List v() {
        return new java.util.ArrayList();
    }

    @Override // com.google.android.libraries.notifications.platform.internal.room.GnpPerDeviceRoomDatabase
    public final defpackage.aeeo x() {
        defpackage.aeeo aeeoVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new defpackage.aeeq(this);
            }
            aeeoVar = this.m;
        }
        return aeeoVar;
    }
}
