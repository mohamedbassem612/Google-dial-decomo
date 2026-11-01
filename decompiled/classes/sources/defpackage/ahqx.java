package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahqx {
    public static long a = ((long) java.lang.Math.abs(new java.util.Random().nextInt())) << 30;
    public static final java.util.HashMap b = new java.util.HashMap();
    public static final java.lang.Object c = new java.lang.Object();
    public static defpackage.ahpm d;

    public static final defpackage.ahyc a(defpackage.ahyc ahycVar) {
        return new defpackage.ahqv(defpackage.ahns.c(false), ahycVar);
    }

    public static final defpackage.ajas b(defpackage.ajas ajasVar) {
        return new defpackage.ahqt(defpackage.ahns.c(false), ajasVar, 0);
    }

    public static final defpackage.ajat c(defpackage.ajat ajatVar) {
        return new defpackage.ajax(defpackage.ahns.c(false), ajatVar, 1);
    }

    public static final defpackage.ajba d(defpackage.ajba ajbaVar) {
        return new defpackage.ahqo(defpackage.ahns.c(false), ajbaVar);
    }

    public static final defpackage.ajbc e(defpackage.ajbc ajbcVar) {
        return new defpackage.ahqn(defpackage.ahns.c(false), ajbcVar);
    }

    public static final defpackage.ajcb f(defpackage.ajcb ajcbVar) {
        return new defpackage.sqh(defpackage.ahns.c(false), ajcbVar, 2);
    }

    public static final java.lang.Runnable g(java.lang.Runnable runnable) {
        if (runnable == null) {
            defpackage.aooh.i("runnable");
        }
        return new defpackage.abqu(s(), runnable, 16);
    }

    public static final java.lang.Runnable h(java.lang.Runnable runnable) {
        if (runnable == null) {
            defpackage.aooh.i("runnable");
        }
        return new defpackage.ahqw(new defpackage.aoot(), defpackage.ahns.c(false), runnable);
    }

    public static final java.util.concurrent.Callable i(java.util.concurrent.Callable callable) {
        return new defpackage.ajav(defpackage.ahns.c(false), callable, 1);
    }

    public static final java.util.concurrent.Callable j(java.util.concurrent.Callable callable) {
        defpackage.aooh.f(callable, "callable");
        return new ahqu(s(), callable);
    }

    public static final void k(android.content.Intent intent) {
        defpackage.aooh.f(intent, "intent");
        if (defpackage.ahow.a != 1 && !intent.hasExtra("tracing_intent_id")) {
            throw new java.lang.IllegalStateException("Was supposed to propagate trace for startActivity - did you forget to propagate it? See http://go/tiktok-conformance-violations/TRACE_PROPAGATION_FOR_START_ACTIVITY for more details.");
        }
    }

    public static final void l(android.content.Context context, android.content.Intent intent) throws java.io.IOException {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(intent, "intent");
        android.content.Intent intent2 = new android.content.Intent(intent);
        ahqq ahqqVarN = n(intent2);
        try {
            context.startActivity(intent2);
            defpackage.ajsz.ak(ahqqVarN, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahqqVarN, th);
                throw th2;
            }
        }
    }

    public static final defpackage.aonj m(defpackage.aonj aonjVar) {
        return new defpackage.nxi(defpackage.ahns.c(false), aonjVar, 11);
    }

    public static final ahqq n(android.content.Intent intent) {
        long j;
        defpackage.ahpj ahpjVarC = defpackage.ahns.c(false);
        defpackage.ahpj ahpjVarB = defpackage.ahns.b();
        if (ahpjVarB != null) {
            defpackage.ahou ahouVar = ahnb.a;
            defpackage.agab agabVar = ahnb.c;
            if (!ahpjVarB.k(agabVar).b()) {
                synchronized (ahpjVarB) {
                    if (!ahpjVarB.k(agabVar).b()) {
                        ahpjVarB.u(agabVar, java.lang.Boolean.TRUE);
                    }
                }
            }
        }
        java.util.HashMap map = b;
        synchronized (map) {
            j = a;
            a = 1 + j;
        }
        intent.putExtra("tracing_intent_id", j);
        return new ahqq(j);
    }

    public static final boolean o() {
        defpackage.ahpe ahpeVar = (defpackage.ahpe) defpackage.ahns.d.get();
        defpackage.ahpj ahpjVar = ahpeVar.c;
        return ((ahpjVar == null || defpackage.aooh.n(ahpjVar, defpackage.ahoo.a)) && ahpeVar.d == null) ? false : true;
    }

    public static final defpackage.ahpj p(android.content.Intent intent) {
        if (intent == null) {
            defpackage.aooh.i("intent");
        }
        return r(intent, false);
    }

    public static final defpackage.ahpj q(android.content.Intent intent) {
        if (intent == null) {
            defpackage.aooh.i("intent");
        }
        return r(intent, true);
    }

    private static final defpackage.ahpj r(android.content.Intent intent, boolean z) {
        defpackage.ahpj ahpjVar;
        try {
            if (intent.hasExtra("tracing_intent_id")) {
                long longExtra = intent.getLongExtra("tracing_intent_id", -1L);
                java.util.HashMap map = b;
                synchronized (map) {
                    try {
                        ahpjVar = (defpackage.ahpj) (z ? map.remove(java.lang.Long.valueOf(longExtra)) : map.get(java.lang.Long.valueOf(longExtra)));
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                return ahpjVar;
            }
        } catch (android.os.BadParcelableException unused) {
        }
        return null;
    }

    private static final defpackage.ahpj s() {
        defpackage.ahpe ahpeVar = (defpackage.ahpe) defpackage.ahns.d.get();
        defpackage.ahpj ahpjVar = ahpeVar.c;
        if (ahpjVar == null || defpackage.aooh.n(ahpjVar, defpackage.ahoo.a)) {
            defpackage.ahpj ahpjVar2 = ahpeVar.d;
            if (ahpjVar2 != null) {
                return ahpjVar2;
            }
            throw new java.lang.IllegalStateException("This is not reachable if guarded by shouldPropagateExecutorTrace.");
        }
        defpackage.ahpj ahpjVar3 = ahpeVar.c;
        if (ahpjVar3 != null) {
            return ahpjVar3;
        }
        defpackage.aooh.g();
        return null;
    }
}
