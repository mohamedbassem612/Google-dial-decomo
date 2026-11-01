package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajza implements defpackage.ajzx {
    private static final defpackage.aiof a = defpackage.aiof.i("xRPC");
    private final defpackage.aoin b;

    @java.lang.Deprecated
    public ajza(defpackage.aoin aoinVar) {
        aoinVar.getClass();
        this.b = aoinVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    /* JADX WARN: Code duplicated, block: B:29:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:33:0x0103  */
    /* JADX WARN: Code duplicated, block: B:34:0x0105  */
    /* JADX WARN: Code duplicated, block: B:37:0x0121  */
    /* JADX WARN: Code duplicated, block: B:40:0x0141  */
    /* JADX WARN: Code duplicated, block: B:43:0x014c  */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    @Override // defpackage.ajzx
    public final defpackage.anmc a(defpackage.ajzw ajzwVar) throws afeb {
        defpackage.aofa aofaVar;
        java.util.concurrent.Executor executor;
        long j;
        boolean z;
        long jMax;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
        java.lang.String str;
        defpackage.afec.b();
        defpackage.akcg akcgVar = ajzwVar.n;
        try {
            org.chromium.net.CronetEngine cronetEngine = (org.chromium.net.CronetEngine) this.b.a();
            java.lang.String defaultUserAgent = ajzwVar.g;
            if (defaultUserAgent == null) {
                defaultUserAgent = new org.chromium.net.CronetEngine.Builder(ajzwVar.b).getDefaultUserAgent();
            }
            anue anueVarH = anue.h(ajzwVar.b(), ajzwVar.a(), cronetEngine);
            anueVarH.g(defaultUserAgent);
            anueVarH.c(ajzwVar.e);
            anueVarH.f(ajzwVar.d);
            anueVarH.d(ajzwVar.k, java.util.concurrent.TimeUnit.MILLISECONDS);
            int i = ajzwVar.l;
            defpackage.ahvr.bN((i ^ (-1)) >>> 31, "maxMessageSize must be >= 0");
            anueVarH.c = i;
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = ajzwVar.f;
            if (scheduledExecutorService2 != null) {
                anueVarH.a = scheduledExecutorService2;
            }
            java.lang.Integer num = ajzwVar.i;
            if (num != null) {
                int iIntValue = num.intValue();
                anueVarH.f = true;
                anueVarH.g = iIntValue;
            }
            java.lang.Integer num2 = ajzwVar.j;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                anueVarH.d = true;
                anueVarH.e = iIntValue2;
            }
            defpackage.anmc anmcVarDt = defpackage.ajsz.dt(anueVarH.a(), abzl.a(ajzwVar.h));
            if (cronetEngine.getClass().getName().equals("org.chromium.net.impl.JavaCronetEngine")) {
                akcgVar.c(akcj.c, akci.e);
                return anmcVarDt;
            }
            akcgVar.c(akcj.c, akci.a);
            return anmcVarDt;
        } catch (java.lang.IllegalStateException e) {
            e = e;
            ((defpackage.aiob) ((defpackage.aiob) ((defpackage.aiob) a.c()).k(e)).l("com/google/frameworks/client/data/android/CronetWithOkHttpFallbackTransport", "getTransportChannel", 108, "CronetWithOkHttpFallbackTransport.java")).v("Failed to load Cronet using legacy Provider<CronetEngine>, falling back on OkHttp implementation");
            akcgVar.c(akcj.c, akci.c);
            aofaVar = new defpackage.aofa(ajzwVar.b(), ajzwVar.a());
            aofaVar.c(ajzwVar.e);
            executor = ajzwVar.d;
            if (executor == null) {
                aofaVar.e = defpackage.aofa.d;
            } else {
                aofaVar.e = new defpackage.aodg(executor, 1);
            }
            aofaVar.f(executor);
            aofaVar.d(ajzwVar.k, java.util.concurrent.TimeUnit.MILLISECONDS);
            j = ajzwVar.m;
            if (j > 0) {
                z = true;
            } else {
                z = false;
            }
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
            defpackage.ahvr.bN(z, "keepalive time must be positive");
            long nanos = timeUnit.toNanos(j);
            aofaVar.h = nanos;
            jMax = java.lang.Math.max(nanos, anyk.a);
            aofaVar.h = jMax;
            if (jMax >= defpackage.aofa.c) {
                aofaVar.h = Long.MAX_VALUE;
            }
            java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MILLISECONDS;
            defpackage.ahvr.bN(z, "keepalive timeout must be positive");
            long nanos2 = timeUnit2.toNanos(j);
            aofaVar.i = nanos2;
            aofaVar.i = java.lang.Math.max(nanos2, anyk.b);
            scheduledExecutorService = ajzwVar.f;
            if (scheduledExecutorService != null) {
                aofaVar.f = new defpackage.aodg(scheduledExecutorService, 1);
            }
            str = ajzwVar.g;
            if (str != null) {
                aofaVar.g(str);
            }
            return defpackage.ajsz.dt(aofaVar.a(), new abzq(ajzwVar.h));
        } catch (java.lang.UnsatisfiedLinkError e2) {
            e = e2;
            ((defpackage.aiob) ((defpackage.aiob) ((defpackage.aiob) a.c()).k(e)).l("com/google/frameworks/client/data/android/CronetWithOkHttpFallbackTransport", "getTransportChannel", 108, "CronetWithOkHttpFallbackTransport.java")).v("Failed to load Cronet using legacy Provider<CronetEngine>, falling back on OkHttp implementation");
            akcgVar.c(akcj.c, akci.c);
            aofaVar = new defpackage.aofa(ajzwVar.b(), ajzwVar.a());
            aofaVar.c(ajzwVar.e);
            executor = ajzwVar.d;
            if (executor == null) {
                aofaVar.e = defpackage.aofa.d;
            } else {
                aofaVar.e = new defpackage.aodg(executor, 1);
            }
            aofaVar.f(executor);
            aofaVar.d(ajzwVar.k, java.util.concurrent.TimeUnit.MILLISECONDS);
            j = ajzwVar.m;
            if (j > 0) {
                z = true;
            } else {
                z = false;
            }
            java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.MILLISECONDS;
            defpackage.ahvr.bN(z, "keepalive time must be positive");
            long nanos3 = timeUnit3.toNanos(j);
            aofaVar.h = nanos3;
            jMax = java.lang.Math.max(nanos3, anyk.a);
            aofaVar.h = jMax;
            if (jMax >= defpackage.aofa.c) {
                aofaVar.h = Long.MAX_VALUE;
            }
            java.util.concurrent.TimeUnit timeUnit4 = java.util.concurrent.TimeUnit.MILLISECONDS;
            defpackage.ahvr.bN(z, "keepalive timeout must be positive");
            long nanos4 = timeUnit4.toNanos(j);
            aofaVar.i = nanos4;
            aofaVar.i = java.lang.Math.max(nanos4, anyk.b);
            scheduledExecutorService = ajzwVar.f;
            if (scheduledExecutorService != null) {
                aofaVar.f = new defpackage.aodg(scheduledExecutorService, 1);
            }
            str = ajzwVar.g;
            if (str != null) {
                aofaVar.g(str);
            }
            return defpackage.ajsz.dt(aofaVar.a(), new abzq(ajzwVar.h));
        } catch (java.lang.Throwable th) {
            akcgVar.c(akcj.c, akci.b);
            throw th;
        }
    }
}
