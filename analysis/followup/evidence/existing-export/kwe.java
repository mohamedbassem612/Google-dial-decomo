package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kwe {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callrecording/impl/geofence/Geofence");
    public final defpackage.kwt b;
    public final defpackage.aoin c;
    public final defpackage.aoin d;
    private final defpackage.aoin e;

    public kwe(defpackage.kwt kwtVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3) {
        this.b = kwtVar;
        this.c = aoinVar;
        this.e = aoinVar2;
        this.d = aoinVar3;
    }

    public final boolean a() {
        if (!((java.lang.Boolean) this.c.a()).booleanValue()) {
            return this.b.c();
        }
        java.lang.Boolean bool = (java.lang.Boolean) this.e.a();
        boolean zBooleanValue = bool.booleanValue();
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/callrecording/impl/geofence/Geofence", "withinCallRecordingGeoFence", 44, "Geofence.java")).y("forced override: %s", bool);
        return zBooleanValue;
    }
}
