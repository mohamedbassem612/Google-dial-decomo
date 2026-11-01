package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uhs {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/spam/settings/SpamSettingsImpl");
    public final defpackage.aoin b;
    public final defpackage.aoin c;
    public final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean();
    public final defpackage.ipc f;
    private final android.content.Context g;
    private final java.util.concurrent.ScheduledExecutorService h;
    private final defpackage.ajct i;
    private final defpackage.aoin j;
    private final defpackage.oki k;
    private final defpackage.tcc l;
    private final defpackage.zjm m;

    public uhs(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.ajct ajctVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.ipc ipcVar, defpackage.oki okiVar, defpackage.tcc tccVar, defpackage.zjm zjmVar) {
        this.g = context;
        this.h = scheduledExecutorService;
        this.i = ajctVar;
        this.b = aoinVar;
        this.c = aoinVar2;
        this.j = aoinVar3;
        this.f = ipcVar;
        this.k = okiVar;
        this.l = tccVar;
        this.m = zjmVar;
    }

    private final android.os.PersistableBundle f() {
        j$.util.Optional optionalEmpty;
        defpackage.aify aifyVar = defpackage.zqz.a;
        if (defpackage.dvx.c(this.g, "android.permission.READ_PHONE_STATE") != 0) {
            return new android.os.PersistableBundle();
        }
        try {
            android.telephony.CarrierConfigManager carrierConfigManager = (android.telephony.CarrierConfigManager) this.k.b.getSystemService("carrier_config");
            optionalEmpty = j$.util.Optional.ofNullable(carrierConfigManager != null ? carrierConfigManager.getConfig() : null);
            if (optionalEmpty == null) {
                defpackage.aooh.g();
            }
        } catch (java.lang.SecurityException e) {
            ((defpackage.aimw) ((defpackage.aimw) defpackage.oki.a.d()).k(e).l("com/android/dialer/externals/androidapis/telephony/DialerCarrierConfigManager", "getConfigLegacy", 48, "DialerCarrierConfigManager.kt")).v("CarrierConfigManager.getConfig called without permission.");
            optionalEmpty = j$.util.Optional.empty();
            if (optionalEmpty == null) {
                defpackage.aooh.g();
            }
        }
        return (android.os.PersistableBundle) optionalEmpty.orElse(new android.os.PersistableBundle());
    }

    public final defpackage.ajcq a() {
        defpackage.ajcq ajcqVarC = c();
        defpackage.ajcq ajcqVarB = b();
        return new defpackage.ahda(new defpackage.anpu(true, defpackage.aify.o(new defpackage.ajcq[]{ajcqVarC, ajcqVarB})), (byte[]) null).o(new defpackage.nyf(ajcqVarC, ajcqVarB, 4), this.i);
    }

    public final defpackage.ajcq b() {
        android.os.PersistableBundle persistableBundleF = f();
        if (!persistableBundleF.getBoolean("com.google.android.dialer.spam_blocking_controlled_by_carrier")) {
            defpackage.tcc tccVar = this.l;
            return defpackage.aosv.F(tccVar.a, 0, new defpackage.unj(tccVar, (defpackage.aoln) null, 1), 3);
        }
        j$.util.Optional optionalG = this.m.g();
        if (true == optionalG.isPresent()) {
            defpackage.met metVar = (defpackage.met) optionalG.get();
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/spam/settings/SpamSettingsImpl", "isAapmEnabled", 260, "SpamSettingsImpl.java")).v("Darpa is present");
            optionalG = j$.util.Optional.ofNullable(defpackage.aosv.F(metVar.d, 0, new lve(metVar, (defpackage.aoln) null, 7), 3));
        }
        defpackage.ajcq ajcqVar = (defpackage.ajcq) optionalG.orElse(new defpackage.ajcm(java.lang.Boolean.FALSE));
        tzs tzsVar = new tzs(this, persistableBundleF, 14);
        defpackage.ajct ajctVar = this.i;
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), tzsVar);
        int i = defpackage.ajan.c;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVar, ahqvVar);
        ajcqVar.c(ajamVar, defpackage.aiql.t(ajctVar, ajamVar));
        return ajamVar;
    }

    public final defpackage.ajcq c() {
        return defpackage.abyl.h(this.g) ? this.l.a() : new defpackage.ajcm(java.lang.Boolean.FALSE);
    }

    public final void d(boolean z, ucs ucsVar) {
        if (!e()) {
            this.l.b(z);
            ucsVar.a(true);
            return;
        }
        defpackage.aoin aoinVar = this.j;
        if (((java.lang.Long) aoinVar.a()).longValue() > 0) {
            this.d.set(true);
            this.e.set(z);
            this.h.schedule((java.lang.Runnable) new sxq(this, 17), ((java.lang.Long) aoinVar.a()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        android.content.BroadcastReceiver uhrVar = new uhr(this, ucsVar);
        android.content.Intent intent = new android.content.Intent("com.google.android.apps.tycho.ACTION_MODIFY_SPAM_BLOCKING_SETTING").setPackage("com.google.android.apps.tycho");
        intent.putExtra("com.google.android.apps.tycho.EXTRA_SPAM_BLOCKING_ENABLED", z);
        this.g.sendOrderedBroadcast(intent, null, uhrVar, null, 0, null, null);
    }

    public final boolean e() {
        return f().getBoolean("com.google.android.dialer.spam_blocking_controlled_by_carrier");
    }
}
