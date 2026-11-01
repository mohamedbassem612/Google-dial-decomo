package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uav {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/sonic/impl/settings/SonicSettings");
    public final defpackage.zzx b;
    public final defpackage.kaw c;
    public final defpackage.aogc d;
    private final defpackage.ajct e;

    public uav(defpackage.aogc aogcVar, defpackage.kaw kawVar, defpackage.ajct ajctVar, defpackage.zzx zzxVar) {
        this.d = aogcVar;
        this.c = kawVar;
        this.e = ajctVar;
        this.b = zzxVar;
    }

    public static defpackage.ajcq a() {
        return defpackage.aiql.y(new java.lang.IllegalStateException("Attempting to read or write into Sonic ProtoDataStore while in direct boot mode"));
    }

    public final defpackage.ajcq b() {
        if (!this.b.m()) {
            return defpackage.ahvr.H(this.d.bk(), new defpackage.ubc(1), this.e);
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).g(10, java.util.concurrent.TimeUnit.MINUTES)).m(defpackage.aioa.MEDIUM)).l("com/android/dialer/sonic/impl/settings/SonicSettings", "getIsSonicTurnedOn", 42, "SonicSettings.java")).v("getIsSonicTurnedOn called in direct boot mode");
        return a();
    }
}
