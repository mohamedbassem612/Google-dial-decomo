package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alqf {
    private static final aimz b = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/utils/runtime/RuntimeTimerManager");
    public final java.util.Map a = new j$.util.concurrent.ConcurrentHashMap();
    private final defpackage.amac c;

    public alqf(defpackage.amac amacVar) {
        this.c = amacVar;
    }

    public final j$.util.Optional a(java.lang.String str) {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((defpackage.alqe) this.a.remove(str));
        if (true == optionalOfNullable.isPresent() && true != ((defpackage.alqe) optionalOfNullable.get()).b.cancel(false)) {
            optionalOfNullable = j$.util.Optional.empty();
        }
        return true == optionalOfNullable.isPresent() ? j$.util.Optional.ofNullable(((defpackage.alqe) optionalOfNullable.get()).a) : optionalOfNullable;
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [ajcu, java.lang.Object] */
    public final java.lang.String b(java.lang.Runnable runnable, j$.time.Duration duration) throws defpackage.aljs {
        java.lang.String string = java.util.UUID.randomUUID().toString();
        if (duration.isNegative() || duration.isZero()) {
            b.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/utils/runtime/RuntimeTimerManager", "schedule", 50, "RuntimeTimerManager.java").I("Timer %s was called with a non-positive delay %s, running immediately.", string, duration);
            runnable.run();
        } else {
            defpackage.amac amacVar = this.c;
            wwx wwxVar = new wwx(this, string, runnable, 17, (int[]) null);
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            amacVar.e();
            ajcs ajcsVarC = ((j$.util.Optional) amacVar.b).get().c(new afgu(amacVar, wwxVar, 19, (byte[]) null), duration.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
            amacVar.d(ajcsVarC, optionalEmpty, false);
            if (!ajcsVarC.isDone()) {
                this.a.put(string, new defpackage.alqe(runnable, ajcsVarC));
            }
        }
        return string;
    }

    public final /* synthetic */ java.lang.String c(final java.util.function.Consumer consumer, final java.lang.Object obj, j$.time.Duration duration) {
        return b(new java.lang.Runnable() { // from class: alps
            @Override // java.lang.Runnable
            public final void run() {
                consumer.accept(obj);
            }
        }, duration);
    }

    public final /* synthetic */ void d(java.lang.String str) {
        j$.util.Optional optionalA = a(str);
        if (true == optionalA.isPresent()) {
            ((java.lang.Runnable) optionalA.get()).run();
        }
    }
}
