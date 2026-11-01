package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jpb implements ahjd {
    public static final aimz a = aimz.i("com/android/dialer/callannouncer/impl/settings/gateway/CallAnnouncerSettingsGateway");
    public final ipc b;
    private final defpackage.jnn c;
    private final aaco d;

    public jpb(defpackage.jnn jnnVar, aaco aacoVar, ipc ipcVar) {
        this.c = jnnVar;
        this.d = aacoVar;
        this.b = ipcVar;
    }

    public final ahjc a(apjb apjbVar) {
        if (!this.c.a()) {
            a.b().l("com/android/dialer/callannouncer/impl/settings/gateway/CallAnnouncerSettingsGateway", "getRedirector", 33, "CallAnnouncerSettingsGateway.kt").v("disabled by enabledfn");
            return null;
        }
        java.lang.Object obj = apjbVar.b;
        if (!aooh.n(obj, "com.google.android.apps.wearables.maestro.companion")) {
            a.b().l("com/android/dialer/callannouncer/impl/settings/gateway/CallAnnouncerSettingsGateway", "getRedirector", 41, "CallAnnouncerSettingsGateway.kt").v("ineligible calling package");
            return null;
        }
        if (this.d.b((java.lang.String) obj)) {
            return new defpackage.iwz(this, 3);
        }
        a.b().l("com/android/dialer/callannouncer/impl/settings/gateway/CallAnnouncerSettingsGateway", "getRedirector", 45, "CallAnnouncerSettingsGateway.kt").v("unsigned");
        return null;
    }
}
