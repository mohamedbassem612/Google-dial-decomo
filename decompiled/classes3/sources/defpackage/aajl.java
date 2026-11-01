package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aajl {
    private final defpackage.aajk a;
    private long b;
    private final aaim c;
    private final akzx d;

    private aajl(defpackage.aajl aajlVar) {
        this.a = aajlVar.a;
        this.c = aajlVar.c;
        this.d = aajlVar.d.o();
        this.b = aajlVar.b;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized defpackage.aajl clone() {
        return new defpackage.aajl(this);
    }

    public final synchronized defpackage.ahwm b() {
        return (defpackage.ahwm) this.d.p();
    }

    public final void c(int i, defpackage.aajk aajkVar) {
        if (aajkVar == defpackage.aajk.a) {
            throw new java.lang.IllegalArgumentException("Cannot record an event with granularity NOTHING");
        }
        if (aajkVar.compareTo(this.a) <= 0) {
            synchronized (this) {
                akzx akzxVarM = defpackage.ahwl.a.m();
                akzxVarM.u();
                defpackage.ahwl ahwlVar = (defpackage.ahwl) akzxVarM.b;
                ahwlVar.c = i - 1;
                ahwlVar.b |= 1;
                long jNanoTime = java.lang.System.nanoTime();
                long j = this.b;
                if (j >= 0) {
                    long millis = j$.time.Duration.ofNanos(jNanoTime - j).toMillis();
                    akzxVarM.u();
                    defpackage.ahwl ahwlVar2 = (defpackage.ahwl) akzxVarM.b;
                    ahwlVar2.b |= 2;
                    ahwlVar2.d = millis;
                }
                this.b = jNanoTime;
                akzx akzxVar = this.d;
                akzxVar.u();
                defpackage.ahwm ahwmVar = (defpackage.ahwm) akzxVar.b;
                defpackage.ahwl ahwlVar3 = (defpackage.ahwl) akzxVarM.p();
                defpackage.ahwm ahwmVar2 = defpackage.ahwm.a;
                j$.util.Objects.requireNonNull(ahwlVar3);
                alat alatVar = ahwmVar.b;
                if (!alatVar.c()) {
                    ahwmVar.b = alad.J(alatVar);
                }
                ahwmVar.b.add(ahwlVar3);
            }
        }
    }

    public aajl(defpackage.aajk aajkVar) {
        aaim aaimVar = aaim.a;
        this.a = aajkVar;
        this.c = aaimVar;
        this.d = defpackage.ahwm.a.m();
        this.b = -1L;
    }
}
