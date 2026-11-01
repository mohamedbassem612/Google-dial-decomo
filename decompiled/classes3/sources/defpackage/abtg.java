package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abtg implements abta {
    public static volatile defpackage.abtg a;
    public static final java.lang.Object b = new java.lang.Object();
    public final android.content.Context c;
    private ahyn d = ahwt.a;
    private final java.lang.Object e = new java.lang.Object();
    private final defpackage.vaa f;

    public abtg(android.content.Context context, defpackage.vaa vaaVar) {
        this.c = context.getApplicationContext();
        this.f = vaaVar;
    }

    public final boolean a() {
        boolean zBooleanValue;
        synchronized (this.e) {
            zBooleanValue = this.d.f() ? ((java.lang.Boolean) this.d.b()).booleanValue() : b();
        }
        return zBooleanValue;
    }

    public final boolean b() {
        boolean z;
        boolean z2;
        synchronized (this.e) {
            z = false;
            try {
                z2 = android.provider.Settings.Global.getInt(((android.content.Context) this.f.a).getContentResolver(), "multi_cb") == 1;
                this.d = ahyn.h(java.lang.Boolean.valueOf(z2));
            } catch (android.provider.Settings.SettingNotFoundException unused) {
            }
        }
        z = z2;
        return z;
    }
}
