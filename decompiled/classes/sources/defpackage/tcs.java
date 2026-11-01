package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tcs {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/rtt/settings/impl/configuration/RttConfigurationCacheImpl");
    private final defpackage.aoin b;
    private final defpackage.rlv c;
    private defpackage.ajcq d = null;

    public tcs(defpackage.aoin aoinVar, defpackage.rlv rlvVar) {
        this.b = aoinVar;
        this.c = rlvVar;
    }

    public final defpackage.tcp a() {
        defpackage.ajcq ajcqVar = this.d;
        if (ajcqVar == null) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/rtt/settings/impl/configuration/RttConfigurationCacheImpl", "getCachedRttConfiguration", '7', "RttConfigurationCacheImpl.java")).v("RTT configuration refresh() must be called first; return UNSUPPORTED");
            this.c.o(defpackage.rmx.RTT_CONFIGURATION_CACHE_RETRIEVED_BEFORE_REFRESH);
            return defpackage.tcp.UNSUPPORTED;
        }
        if (!ajcqVar.isDone()) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/rtt/settings/impl/configuration/RttConfigurationCacheImpl", "getCachedRttConfiguration", 'A', "RttConfigurationCacheImpl.java")).v("RTT configuration is still being fetched; return UNSUPPORTED");
            return defpackage.tcp.UNSUPPORTED;
        }
        try {
            defpackage.tcp tcpVar = (defpackage.tcp) defpackage.aiql.H(this.d);
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/rtt/settings/impl/configuration/RttConfigurationCacheImpl", "getCachedRttConfiguration", 71, "RttConfigurationCacheImpl.java")).y("successfully fetched rtt configuration: %s", tcpVar.name());
            return tcpVar;
        } catch (java.lang.Exception e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/rtt/settings/impl/configuration/RttConfigurationCacheImpl", "getCachedRttConfiguration", 'N', "RttConfigurationCacheImpl.java")).v("exception while fetching RTT configuration; return UNSUPPORTED");
            return defpackage.tcp.UNSUPPORTED;
        }
    }

    public final void b() {
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(871, "RttConfigurationCacheImpl_refresh", defpackage.ahot.a, true);
        try {
            this.d = ((defpackage.tcv) this.b.a()).a();
            ahoqVarX.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
