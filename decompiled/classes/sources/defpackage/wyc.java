package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class wyc implements defpackage.zcr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/incallui/atlas/ui/impl/AtlasEnabledFn");
    private final defpackage.aoin b;
    private final defpackage.zzx c;

    public wyc(defpackage.aoin aoinVar, defpackage.zzx zzxVar) {
        this.b = aoinVar;
        this.c = zzxVar;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        if (this.c.m()) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/incallui/atlas/ui/impl/AtlasEnabledFn", "isEnabled", '!', "AtlasEnabledFn.java")).v("disabled due to direct boot");
            return false;
        }
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/incallui/atlas/ui/impl/AtlasEnabledFn", "isEnabled", '&', "AtlasEnabledFn.java")).v("atlas disabled");
        return false;
    }
}
