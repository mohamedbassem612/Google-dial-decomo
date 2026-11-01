package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anah {
    private static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.anah.class.getName());

    private anah() {
    }

    public static defpackage.anaa a(aoin aoinVar, aoin aoinVar2) {
        defpackage.amzz anafVar;
        try {
            java.util.Collection collection = (java.util.Collection) aoinVar2.a();
            if (collection.isEmpty()) {
                anafVar = defpackage.amzz.b;
            } else {
                anafVar = collection.size() == 1 ? new defpackage.anaf((defpackage.amzz) ahvr.bm(collection)) : new defpackage.anac(collection);
            }
            return anafVar.a(((amyw) aoinVar).b);
        } catch (java.lang.RuntimeException e) {
            a.logp(java.util.logging.Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "createMonitorForComponent", "RuntimeException while constructing monitor factories.", (java.lang.Throwable) e);
            return defpackage.anaa.b;
        }
    }

    public static void b(java.lang.RuntimeException runtimeException, defpackage.amzz amzzVar, java.lang.Object obj) {
        a.logp(java.util.logging.Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "logCreateException", a.bi(obj, amzzVar, "RuntimeException while calling ProductionComponentMonitor.Factory.create on factory ", " with component "), (java.lang.Throwable) runtimeException);
    }

    public static void c(java.lang.RuntimeException runtimeException, defpackage.amzv amzvVar, java.lang.String str, java.lang.Object obj) {
        a.logp(java.util.logging.Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorArgMethodException", "RuntimeException while calling ProducerMonitor." + str + " on monitor " + amzvVar + " with " + obj, (java.lang.Throwable) runtimeException);
    }

    public static void d(java.lang.RuntimeException runtimeException, defpackage.anaa anaaVar, amzw amzwVar) {
        a.logp(java.util.logging.Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorForException", a.bi(amzwVar, anaaVar, "RuntimeException while calling ProductionComponentMonitor.producerMonitorFor on monitor ", " with token "), (java.lang.Throwable) runtimeException);
    }

    public static void e(java.lang.RuntimeException runtimeException, defpackage.amzv amzvVar, java.lang.String str) {
        a.logp(java.util.logging.Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorMethodException", a.bo(amzvVar, str, "RuntimeException while calling ProducerMonitor.", " on monitor "), (java.lang.Throwable) runtimeException);
    }
}
