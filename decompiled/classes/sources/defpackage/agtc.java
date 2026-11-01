package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agtc {
    public final defpackage.ajdd c;
    public final defpackage.ajcd d;
    private final java.util.concurrent.Executor f;
    public final java.util.concurrent.atomic.AtomicLong a = new java.util.concurrent.atomic.AtomicLong(-9223372034707292160L);
    public final java.util.concurrent.atomic.AtomicReference b = new java.util.concurrent.atomic.AtomicReference(null);
    private final java.util.concurrent.atomic.AtomicReference e = new java.util.concurrent.atomic.AtomicReference(null);

    public agtc(defpackage.ajas ajasVar, java.util.concurrent.Executor executor) {
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        this.f = new defpackage.ajdc(ajbmVar);
        defpackage.ajdd ajddVar = new defpackage.ajdd();
        this.c = ajddVar;
        defpackage.ajcd ajcdVar = new defpackage.ajcd(ajasVar, executor, 1);
        this.d = ajcdVar;
        ajddVar.c(ajcdVar, ajbmVar);
    }

    public final defpackage.ajcq a() {
        java.util.concurrent.atomic.AtomicLong atomicLong;
        long j;
        int i;
        defpackage.ajcq ajcqVar;
        defpackage.ajdd ajddVar = this.c;
        if (ajddVar.isDone()) {
            return ajddVar;
        }
        do {
            atomicLong = this.a;
            j = atomicLong.get();
            i = (int) (j >>> 32);
        } while (!atomicLong.compareAndSet(j, (((long) i) << 32) | (((long) (((int) j) + 1)) & 4294967295L)));
        final defpackage.ajdd ajddVar2 = new defpackage.ajdd();
        defpackage.ajcq ajcqVar2 = (defpackage.ajcq) this.e.getAndSet(ajddVar2);
        int i2 = 0;
        if (ajcqVar2 == null) {
            defpackage.agsx agsxVar = new defpackage.agsx(this, i, i2);
            long j2 = defpackage.ahqx.a;
            defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ahqt(defpackage.ahns.c(false), agsxVar, 0));
            ajdkVar.run();
            ajcqVar = ajdkVar;
        } else {
            defpackage.agsy agsyVar = new defpackage.agsy(this, i, i2);
            long j3 = defpackage.ahqx.a;
            defpackage.ajax ajaxVar = new defpackage.ajax(defpackage.ahns.c(false), agsyVar, 1);
            java.util.concurrent.Executor executor = this.f;
            int i3 = defpackage.aizu.d;
            defpackage.aizs aizsVar = new defpackage.aizs(ajcqVar2, java.lang.Throwable.class, ajaxVar);
            ajcqVar2.c(aizsVar, defpackage.aiql.t(executor, aizsVar));
            ajcqVar = aizsVar;
        }
        ajddVar2.q(ajcqVar);
        final defpackage.agta agtaVar = new defpackage.agta(this, i);
        ajddVar2.c(new java.lang.Runnable() { // from class: agsz
            @Override // java.lang.Runnable
            public final void run() {
                defpackage.agta agtaVar2 = agtaVar;
                defpackage.ajdd ajddVar3 = ajddVar2;
                try {
                    defpackage.ahvr.cc(ajddVar3.isDone(), "Future was expected to be done: %s", ajddVar3);
                    java.lang.Object objH = defpackage.a.h(ajddVar3);
                    defpackage.ajdd ajddVar4 = this.a.c;
                    ajddVar4.o(objH);
                    agtaVar2.q(ajddVar4);
                } catch (java.lang.Throwable unused) {
                    agtaVar2.q(ajddVar3);
                }
            }
        }, defpackage.ajbm.INSTANCE);
        return agtaVar;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq b(int i) {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        defpackage.agtb agtbVar;
        java.util.concurrent.atomic.AtomicLong atomicLong = this.a;
        if (((int) (atomicLong.get() >>> 32)) > i) {
            defpackage.ajcl ajclVar = defpackage.ajcl.a;
            return ajclVar == null ? new defpackage.ajcl() : ajclVar;
        }
        defpackage.agtb agtbVar2 = new defpackage.agtb(i);
        do {
            atomicReference = this.b;
            agtbVar = (defpackage.agtb) atomicReference.get();
            if (agtbVar != null && agtbVar.a > i) {
                defpackage.ajcl ajclVar2 = defpackage.ajcl.a;
                return ajclVar2 == null ? new defpackage.ajcl() : ajclVar2;
            }
        } while (!defpackage.anty.Q(atomicReference, agtbVar, agtbVar2));
        if (((int) (atomicLong.get() >>> 32)) > i) {
            agtbVar2.cancel(true);
            defpackage.anty.Q(atomicReference, agtbVar2, null);
        } else {
            defpackage.ajcd ajcdVar = this.d;
            java.lang.Object obj = ajcdVar.a;
            ?? r7 = ajcdVar.b;
            if (obj == null || r7 == 0) {
                agtbVar2.q(this.c);
            } else {
                long j = defpackage.ahqx.a;
                defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ahqt(defpackage.ahns.c(false), obj, 0));
                r7.execute(ajdkVar);
                agtbVar2.q(ajdkVar);
            }
        }
        return agtbVar2;
    }

    public final boolean c() {
        return this.c.isDone();
    }
}
