package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vth {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/settings/storage/VoicemailSettingsStore");
    public final android.content.Context b;
    public final defpackage.ojo c;
    public final defpackage.ajct d;
    public final defpackage.afhf e;
    private final defpackage.zth f;

    public vth(android.content.Context context, defpackage.zth zthVar, defpackage.ojo ojoVar, defpackage.ajct ajctVar, defpackage.afhf afhfVar) {
        this.b = context;
        this.f = zthVar;
        this.c = ojoVar;
        this.d = ajctVar;
        this.e = afhfVar;
    }

    public static boolean b(vtf vtfVar, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return vtfVar.d.equals(phoneAccountHandle.getId()) && vtfVar.c.equals(phoneAccountHandle.getComponentName().flattenToString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @java.lang.Deprecated
    public final void a(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/voicemail/settings/storage/VoicemailSettingsStore", "storeVvmEnabledBlocking", 83, "VoicemailSettingsStore.java")).y("set VVM enabled to: %s", java.lang.Boolean.valueOf(z));
        lop lopVarE = new jyn(this.b, phoneAccountHandle).e();
        lopVarE.b("is_enabled", z);
        lopVarE.a();
        defpackage.zth zthVar = this.f;
        defpackage.agsm.i(1009, !((defpackage.zjm) zthVar.a).g().isPresent() ? defpackage.ajcm.a : defpackage.ahrv.g(((defpackage.zjs) zthVar.b).d()).i(new vct(zthVar, 2), zthVar.d), "Failed to refresh using VvmServiceScheduler.", new java.lang.Object[0]);
    }

    public final int c(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        jyn jynVar = new jyn(this.b, phoneAccountHandle);
        if (jynVar.j("is_enabled")) {
            return jynVar.k("is_enabled") ? 1 : 2;
        }
        return 3;
    }
}
