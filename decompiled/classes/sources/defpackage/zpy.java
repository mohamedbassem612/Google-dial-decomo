package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zpy {
    private static final defpackage.aimz d = defpackage.aimz.i("com/google/android/dialershared/incall/core/dataservice/impl/InCallProductionComponentAuthorityImpl");
    public final defpackage.aoin a;
    public final java.util.concurrent.atomic.AtomicReference b = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
    public final defpackage.zzx c;

    public zpy(defpackage.aoin aoinVar, defpackage.zzx zzxVar) {
        this.a = aoinVar;
        this.c = zzxVar;
    }

    public final j$.util.Optional a() {
        j$.util.Optional optional = (j$.util.Optional) this.b.get();
        if (optional.isEmpty()) {
            ((defpackage.aimw) ((defpackage.aimw) d.b()).l("com/google/android/dialershared/incall/core/dataservice/impl/InCallProductionComponentAuthorityImpl", "getPrimaryCallGraph", 45, "InCallProductionComponentAuthorityImpl.java")).v("Primary call graph not present.");
        }
        return optional;
    }
}
