package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class wyo implements defpackage.kfh {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/incallui/atlas/ui/impl/calllog/AtlasCallLogDataSource");
    public final defpackage.ajct b;
    public final defpackage.wzd c;
    public final java.util.concurrent.atomic.AtomicLong d = new java.util.concurrent.atomic.AtomicLong(0);
    public final defpackage.rsr e;
    public final defpackage.aogc f;
    private final defpackage.kaw g;

    public wyo(defpackage.ajct ajctVar, defpackage.aogc aogcVar, defpackage.kaw kawVar, defpackage.wzd wzdVar, defpackage.rsr rsrVar) {
        this.b = ajctVar;
        this.f = aogcVar;
        this.g = kawVar;
        this.c = wzdVar;
        this.e = rsrVar;
    }

    @Override // defpackage.kfh
    public final defpackage.aenj a() {
        return new defpackage.aenj("AtlasDataSource");
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq b(defpackage.kfj kfjVar) {
        defpackage.ajcq ajcqVarO;
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/incallui/atlas/ui/impl/calllog/AtlasCallLogDataSource", "fill", 76, "AtlasCallLogDataSource.java")).v("fill");
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/incallui/atlas/ui/impl/calllog/AtlasCallLogDataSource", "handleInsertsAndUpdates", 86, "AtlasCallLogDataSource.java")).v("handle inserts and updates");
        defpackage.kfk kfkVar = (defpackage.kfk) kfjVar;
        java.util.Map map = kfkVar.a;
        boolean zIsEmpty = map.isEmpty();
        java.util.Map map2 = kfkVar.b;
        if (zIsEmpty && map2.isEmpty()) {
            ajcqVarO = defpackage.ajcm.a;
        } else {
            defpackage.ajct ajctVar = this.b;
            defpackage.ajcq ajcqVarSubmit = ajctVar.submit(defpackage.ahqx.i(new whv(map, map2, 19)));
            defpackage.ahrv ahrvVarI = defpackage.ahrv.g(ajcqVarSubmit).i(new wkv(this, 17), defpackage.ajbm.INSTANCE);
            ajcqVarO = defpackage.ahvr.ak(ajcqVarSubmit, ahrvVarI).o(new whv(ajcqVarSubmit, ahrvVarI, 20), ajctVar);
        }
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(ajcqVarO);
        whr whrVar = new whr(this, kfjVar, 19, (byte[]) null);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        return ahrvVarG.i(whrVar, ajbmVar).i(new whr(this, kfjVar, 20, (byte[]) null), ajbmVar);
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq d() {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq e() {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.d;
        if (atomicLong.get() <= 0) {
            return defpackage.aiql.z(null);
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/incallui/atlas/ui/impl/calllog/AtlasCallLogDataSource", "onSuccessfulFill", 232, "AtlasCallLogDataSource.java")).x("lastSyncedAtlasDataTimestamp %d", atomicLong.get());
        return this.g.p(this.f.bl(new tbd(this, 11)));
    }
}
