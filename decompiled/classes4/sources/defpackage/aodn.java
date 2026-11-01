package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aodn {
    public static final defpackage.anqd b;
    public static final defpackage.anqd c;
    public static final defpackage.anqd d;
    public static final defpackage.anqd e;
    public final anpm a;

    static {
        defpackage.anqd anqdVar;
        anpl anplVarA = anpl.a();
        b = anplVarA.d("grpc.subchannel.disconnections", ahvr.aM(new java.lang.String[]{"grpc.target"}), ahvr.aM(new java.lang.String[]{"grpc.lb.backend_service", "grpc.lb.locality", "grpc.disconnect_error"}));
        c = anplVarA.d("grpc.subchannel.connection_attempts_succeeded", ahvr.aM(new java.lang.String[]{"grpc.target"}), ahvr.aM(new java.lang.String[]{"grpc.lb.backend_service", "grpc.lb.locality"}));
        d = anplVarA.d("grpc.subchannel.connection_attempts_failed", ahvr.aM(new java.lang.String[]{"grpc.target"}), ahvr.aM(new java.lang.String[]{"grpc.lb.backend_service", "grpc.lb.locality"}));
        java.util.ArrayList arrayListAM = ahvr.aM(new java.lang.String[]{"grpc.target"});
        java.util.ArrayList arrayListAM2 = ahvr.aM(new java.lang.String[]{"grpc.security_level", "grpc.lb.backend_service", "grpc.lb.locality"});
        ahvr.bN(!ahvr.cp("grpc.subchannel.open_connections"), "missing metric name");
        synchronized (anplVarA.a) {
            java.util.Set set = anplVarA.b;
            if (set.contains("grpc.subchannel.open_connections")) {
                throw new java.lang.IllegalStateException(a.bk("grpc.subchannel.open_connections", "Metric with name ", " already exists"));
            }
            int i = anplVarA.c;
            if (i + 1 == anplVarA.d.length) {
                anplVarA.b();
            }
            anqdVar = new defpackage.anqd(i, "grpc.subchannel.open_connections", arrayListAM, arrayListAM2);
            anplVarA.d[i] = anqdVar;
            set.add("grpc.subchannel.open_connections");
            anplVarA.c++;
        }
        e = anqdVar;
    }

    public aodn(anpm anpmVar) {
        this.a = anpmVar;
    }
}
