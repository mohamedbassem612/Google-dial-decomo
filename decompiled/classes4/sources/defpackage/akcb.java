package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akcb extends defpackage.anne {
    private final java.util.concurrent.atomic.AtomicReference a;

    public akcb(ajsz ajszVar) {
        super(ajszVar);
        this.a = new java.util.concurrent.atomic.AtomicReference(new amwp(1, (java.lang.Object) null));
    }

    @Override // defpackage.annf
    public final void a(anty antyVar, anph anphVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        amwp amwpVar;
        int i;
        do {
            atomicReference = this.a;
            amwpVar = (amwp) atomicReference.get();
            i = amwpVar.a;
        } while (!anty.Q(atomicReference, amwpVar, i == 1 ? new amwp(2, (java.lang.Object) null) : amwpVar));
        if (i == 1) {
            this.d.a(antyVar, anphVar);
        } else if (i == 4) {
            antyVar.a((anqw) amwpVar.b, new anph());
        } else {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Already started");
            this.d.dv("start() called more than once", illegalStateException);
            throw illegalStateException;
        }
    }

    @Override // defpackage.anpz
    public final void dv(java.lang.String str, java.lang.Throwable th) {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        amwp amwpVar;
        amwp amwpVarG;
        anqw anqwVarE = anqw.c;
        if (str != null) {
            anqwVarE = anqwVarE.f(str);
        }
        if (th != null) {
            anqwVarE = anqwVarE.e(th);
        }
        do {
            atomicReference = this.a;
            amwpVar = (amwp) atomicReference.get();
            int i = amwpVar.a;
            if (i == 4 || i == 5 || i == 6) {
                amwpVarG = amwpVar;
            } else if (i == 1) {
                amwpVarG = amwp.g(4, anqwVarE);
            } else {
                amwpVarG = i == 3 ? amwp.g(6, anqwVarE) : amwp.g(5, anqwVarE);
            }
        } while (!anty.Q(atomicReference, amwpVar, amwpVarG));
        this.d.dv(str, th);
    }

    @Override // defpackage.anpz
    public final void dw() {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        amwp amwpVar;
        amwp amwpVarG;
        boolean z;
        do {
            atomicReference = this.a;
            amwpVar = (amwp) atomicReference.get();
            int i = amwpVar.a;
            if (i == 2) {
                amwpVarG = new amwp(3, (java.lang.Object) null);
                z = true;
            } else {
                if (i != 5) {
                    throw new java.lang.IllegalStateException("Call was either not started or already half-closed.");
                }
                amwpVarG = amwp.g(6, (anqw) amwpVar.b);
                z = false;
            }
        } while (!anty.Q(atomicReference, amwpVar, amwpVarG));
        if (z) {
            this.d.dw();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    @Override // defpackage.anpz
    public final void dx(int i) {
        int i2 = ((amwp) this.a.get()).a;
        if (i2 == 1 || i2 == 4) {
            throw new java.lang.IllegalStateException("Not started");
        }
        ahvr.bN((boolean) ((i ^ (-1)) >>> 31), "Number requested must be non-negative");
        this.d.dx(i);
    }

    @Override // defpackage.annf
    public final void dy(java.lang.Object obj) {
        ahvr.cj(obj, "Message must be non-null");
        int i = ((amwp) this.a.get()).a;
        if (i == 2) {
            this.d.dy(obj);
        } else if (i != 5) {
            throw new java.lang.IllegalStateException("Call was either not started or already half-closed.");
        }
    }
}
