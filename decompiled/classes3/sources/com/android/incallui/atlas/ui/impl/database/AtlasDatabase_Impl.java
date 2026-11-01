package com.android.incallui.atlas.ui.impl.database;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class AtlasDatabase_Impl extends com.android.incallui.atlas.ui.impl.database.AtlasDatabase {
    private volatile defpackage.wyw m;

    protected final gfn a() {
        return new gfn(this, new java.util.HashMap(0), new java.util.HashMap(0), new java.lang.String[]{"AtlasData"});
    }

    protected final /* synthetic */ ggb c() {
        return new defpackage.wzb(this);
    }

    protected final java.util.Map h() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(defpackage.wyw.class, java.util.Collections.EMPTY_LIST);
        return map;
    }

    public final java.util.Set j() {
        return new java.util.HashSet();
    }

    public final java.util.List v() {
        return new java.util.ArrayList();
    }

    @Override // com.android.incallui.atlas.ui.impl.database.AtlasDatabase
    public final defpackage.wyw x() {
        defpackage.wyw wywVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new defpackage.wyw(this);
            }
            wywVar = this.m;
        }
        return wywVar;
    }
}
