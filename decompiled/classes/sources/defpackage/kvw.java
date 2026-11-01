package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kvw {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callrecording/impl/canrecord/CanRecord");
    public final defpackage.kwe b;
    private final android.content.Context c;
    private final defpackage.kwt d;
    private final defpackage.aoin e;
    private final defpackage.aoin f;
    private final defpackage.aoin g;
    private final defpackage.aoin h;
    private final defpackage.aoin i;
    private final defpackage.omv j;

    public kvw(android.content.Context context, defpackage.kwt kwtVar, defpackage.kwe kweVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, defpackage.omv omvVar) {
        this.c = context;
        this.d = kwtVar;
        this.b = kweVar;
        this.e = aoinVar;
        this.f = aoinVar2;
        this.g = aoinVar3;
        this.h = aoinVar4;
        this.i = aoinVar5;
        this.j = omvVar;
    }

    public final boolean a() {
        boolean zC;
        if (((java.lang.Boolean) this.h.a()).booleanValue()) {
            java.lang.Boolean bool = (java.lang.Boolean) this.i.a();
            zC = bool.booleanValue();
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callrecording/impl/canrecord/CanRecord", "withinCallRecordingGeofence", 154, "CanRecord.java")).y("forced override: %s", bool);
        } else {
            zC = this.d.c();
        }
        if (zC) {
            boolean zContains = ((defpackage.ypv) this.g.a()).b.contains(android.os.Build.DEVICE);
            defpackage.aimz aimzVar = a;
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callrecording/impl/canrecord/CanRecord", "forceOverrideDeviceModel", 146, "CanRecord.java")).J("Device %s matches ForceEnableDeviceModels %s", android.os.Build.DEVICE, zContains);
            if (zContains) {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callrecording/impl/canrecord/CanRecord", "canRecordCall", 97, "CanRecord.java")).v("Call recording is enabled by OEM override");
            } else if (((java.lang.Boolean) this.f.a()).booleanValue() && this.c.getPackageManager().hasSystemFeature("com.google.android.apps.dialer.call_recording_audio")) {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callrecording/impl/canrecord/CanRecord", "canRecordCall", 109, "CanRecord.java")).v("Call recording is enabled by call_recording_audio system feature");
            } else if (this.j.a()) {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callrecording/impl/canrecord/CanRecord", "canRecordCall", 114, "CanRecord.java")).v("Call recording disabled by fermat");
            } else if (((java.lang.Boolean) this.e.a()).booleanValue()) {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callrecording/impl/canrecord/CanRecord", "canRecordCall", 119, "CanRecord.java")).v("Call recording is supported");
            } else {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callrecording/impl/canrecord/CanRecord", "canRecordCall", 123, "CanRecord.java")).v("Call recording is disabled by the call recording flag");
            }
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callrecording/impl/canrecord/CanRecord", "canRecordCall", 87, "CanRecord.java")).v("Call recording is disabled in the current country");
        return false;
    }
}
