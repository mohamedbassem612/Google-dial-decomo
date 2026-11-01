package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class whj implements defpackage.kfh {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/xatu/impl/calllog/XatuCallLogDataSource");
    public final defpackage.ajct b;
    public final defpackage.wqr c;
    public final java.util.concurrent.atomic.AtomicLong d = new java.util.concurrent.atomic.AtomicLong(0);
    public final defpackage.rsr e;
    public final defpackage.aogc f;
    private final defpackage.kaw g;

    public whj(defpackage.ajct ajctVar, defpackage.aogc aogcVar, defpackage.kaw kawVar, defpackage.wqr wqrVar, defpackage.rsr rsrVar) {
        this.b = ajctVar;
        this.f = aogcVar;
        this.g = kawVar;
        this.c = wqrVar;
        this.e = rsrVar;
    }

    @Override // defpackage.kfh
    public final defpackage.aenj a() {
        return new defpackage.aenj("XatuDataSource");
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq b(defpackage.kfj kfjVar) {
        defpackage.ajcq ajcqVarO;
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/xatu/impl/calllog/XatuCallLogDataSource", "fill", 72, "XatuCallLogDataSource.java")).v("fill");
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/xatu/impl/calllog/XatuCallLogDataSource", "handleInsertsAndUpdates", 100, "XatuCallLogDataSource.java")).v("handle inserts and updates");
        defpackage.kfk kfkVar = (defpackage.kfk) kfjVar;
        java.util.Map map = kfkVar.a;
        boolean zIsEmpty = map.isEmpty();
        java.util.Map map2 = kfkVar.b;
        if (zIsEmpty && map2.isEmpty()) {
            ajcqVarO = defpackage.ajcm.a;
        } else {
            byte[] bArr = null;
            defpackage.vms vmsVar = new defpackage.vms(map, map2, 16, bArr);
            defpackage.ajct ajctVar = this.b;
            defpackage.ajcq ajcqVarF = defpackage.ahvr.F(vmsVar, ajctVar);
            defpackage.ajcq ajcqVarI = defpackage.ahvr.I(ajcqVarF, new defpackage.vuu(this, 11), ajctVar);
            ajcqVarO = defpackage.ahvr.ak(ajcqVarF, ajcqVarI).o(new defpackage.vms(ajcqVarF, ajcqVarI, 17, bArr), ajctVar);
        }
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(ajcqVarO);
        defpackage.vmv vmvVar = new defpackage.vmv(this, kfjVar, 19);
        defpackage.ajct ajctVar2 = this.b;
        return ahrvVarG.i(vmvVar, ajctVar2).i(new defpackage.vmv(this, kfjVar, 20), ajctVar2);
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq d() {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq e() {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.d;
        if (atomicLong.get() <= 0) {
            return defpackage.ajcm.a;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/xatu/impl/calllog/XatuCallLogDataSource", "onSuccessfulFill", 85, "XatuCallLogDataSource.java")).x("lastSyncedXatuDataTimestamp %d", atomicLong.get());
        return this.g.p(this.f.bl(new tbd(this, 6)));
    }
}
