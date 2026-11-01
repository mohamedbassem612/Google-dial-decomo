package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class tzo implements defpackage.ahzi {
    private final /* synthetic */ int $cid;

    public /* synthetic */ tzo(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ahzi
    public final java.lang.Object eZ() {
        switch (this.$cid) {
            case 0:
                return tzm.a;
            case 1:
                java.lang.System.loadLibrary("audio_resampler_jni");
                return null;
            case 2:
                return java.lang.Double.valueOf(defpackage.andl.a.eZ().a());
            case 3:
                int i = defpackage.aaip.a;
                return java.util.regex.Pattern.compile("\\((?:eng-)?(\\d+)-(.+?)[-)$]");
            case 4:
                int i2 = defpackage.abqk.a;
                return defpackage.aimz.i("com/google/android/libraries/concurrent/ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable");
            case 5:
                int i3 = defpackage.abri.e;
                return defpackage.aimz.i("com/google/android/libraries/concurrent/monitoring/ThreadMonitoring");
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return new java.util.zip.CRC32();
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.aehj.l();
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.aetl.a();
            case 9:
                java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.aewq.a;
                return defpackage.aiql.s(java.util.concurrent.Executors.newSingleThreadScheduledExecutor(new ibm(4)));
            case 10:
                return java.lang.Boolean.FALSE;
            case 11:
                return java.lang.Boolean.FALSE;
            case 12:
                java.util.logging.Logger logger = defpackage.anoq.a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                try {
                    arrayList.add(java.lang.Class.forName("aoau"));
                    break;
                } catch (java.lang.ClassNotFoundException e) {
                    defpackage.anoq.a.logp(java.util.logging.Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (java.lang.Throwable) e);
                }
                try {
                    arrayList.add(java.lang.Class.forName("aoii"));
                    break;
                } catch (java.lang.ClassNotFoundException e2) {
                    defpackage.anoq.a.logp(java.util.logging.Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (java.lang.Throwable) e2);
                }
                return j$.util.DesugarCollections.unmodifiableList(arrayList);
            case 13:
                java.util.logging.Logger logger2 = defpackage.anox.a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                try {
                    arrayList2.add(java.lang.Class.forName("aofb"));
                    break;
                } catch (java.lang.ClassNotFoundException e3) {
                    defpackage.anox.a.logp(java.util.logging.Level.FINE, "io.grpc.ManagedChannelRegistry", "getHardCodedClasses", "Unable to find OkHttpChannelProvider", (java.lang.Throwable) e3);
                }
                try {
                    arrayList2.add(java.lang.Class.forName("io.grpc.netty.NettyChannelProvider"));
                    break;
                } catch (java.lang.ClassNotFoundException e4) {
                    defpackage.anox.a.logp(java.util.logging.Level.FINE, "io.grpc.ManagedChannelRegistry", "getHardCodedClasses", "Unable to find NettyChannelProvider", (java.lang.Throwable) e4);
                }
                try {
                    arrayList2.add(java.lang.Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
                    break;
                } catch (java.lang.ClassNotFoundException e5) {
                    defpackage.anox.a.logp(java.util.logging.Level.FINE, "io.grpc.ManagedChannelRegistry", "getHardCodedClasses", "Unable to find UdsNettyChannelProvider", (java.lang.Throwable) e5);
                }
                return j$.util.DesugarCollections.unmodifiableList(arrayList2);
            default:
                java.util.logging.Logger logger3 = defpackage.anpy.a;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                try {
                    arrayList3.add(java.lang.Class.forName("anww"));
                    break;
                } catch (java.lang.ClassNotFoundException e6) {
                    defpackage.anpy.a.logp(java.util.logging.Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (java.lang.Throwable) e6);
                }
                try {
                    arrayList3.add(java.lang.Class.forName("ansx"));
                    break;
                } catch (java.lang.ClassNotFoundException e7) {
                    defpackage.anpy.a.logp(java.util.logging.Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find IntentNameResolverProvider", (java.lang.Throwable) e7);
                }
                return j$.util.DesugarCollections.unmodifiableList(arrayList3);
        }
    }
}
