package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amgt {
    private static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/utils/CallbacksHandler");
    private final defpackage.alip b;

    private amgt(defpackage.alip alipVar) {
        this.b = alipVar;
    }

    public static synchronized defpackage.amgt a(defpackage.alip alipVar) {
        return new defpackage.amgt(alipVar);
    }

    private final synchronized void d(java.lang.Exception exc, java.lang.String str, java.lang.String str2) {
        a.c().k(exc).l("com/google/quality/views/extraction/kcube/bg/ondevice/utils/CallbacksHandler", "handleCallbackException", 61, "CallbacksHandler.java").I("%s(): %s", str2, str);
        try {
            this.b.m(new defpackage.alio(str, defpackage.alti.CALLBACK_HANDLING_FAILURE, exc));
        } catch (java.lang.Exception e) {
            a.c().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/utils/CallbacksHandler", "handleCallbackException", 67, "CallbacksHandler.java").y("%s(): Error while reporting an exception thrown from the listener.", str2);
        }
    }

    public final synchronized void b(java.util.function.Consumer consumer) {
        try {
            consumer.accept(this.b);
        } catch (java.lang.Exception e) {
            d(e, "Error while calling to to the listener.", "safeCallListener");
        }
    }

    public final synchronized void c(defpackage.alit alitVar, java.lang.String str) {
        try {
            j$.util.Optional.of(alitVar.a(str));
        } catch (java.lang.Exception e) {
            d(e, "Error while playing audio.", "safePlayAudio");
            j$.util.Optional.empty();
        }
    }
}
