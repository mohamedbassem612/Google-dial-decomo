package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ahoj implements defpackage.ahpj {
    public final defpackage.ahro a;
    public final defpackage.ahpj b;
    public java.lang.Thread c;
    public defpackage.ahne d;
    private final defpackage.ahrn e;

    private ahoj(defpackage.ahrn ahrnVar, defpackage.ahoj ahojVar, defpackage.ahpe ahpeVar) {
        this.e = ahrnVar;
        this.a = ahojVar.a;
        this.b = ahojVar;
        defpackage.ahne ahneVar = ahpeVar.e;
        if (ahneVar == null) {
            this.d = null;
            this.c = java.lang.Thread.currentThread();
        } else {
            this.d = ahneVar;
            this.c = null;
        }
    }

    @Override // defpackage.ahpj
    public final defpackage.ahne a() {
        return this.d;
    }

    @Override // defpackage.ahpj
    public final defpackage.ahpj b() {
        return this.b;
    }

    public final int c() {
        return this.e.h;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahnp */
    /* JADX INFO: Thrown type has an unknown type hierarchy: ahnq */
    @Override // defpackage.ahpm, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws ahnp, ahnq {
        defpackage.ahns.k(this);
        this.c = null;
        this.d = null;
    }

    @Override // defpackage.ahpj
    public final java.lang.String d() {
        return this.e.c;
    }

    @Override // defpackage.ahpj
    public final java.lang.String e() {
        return this.a.c;
    }

    @Override // defpackage.ahpj
    public final java.lang.Thread f() {
        return this.c;
    }

    @Override // defpackage.ahpj
    public final java.util.UUID g() {
        return this.a.b;
    }

    @Override // defpackage.ahpj
    public final defpackage.ahou j() {
        defpackage.ahrn ahrnVar = this.e;
        return defpackage.ahou.e(ahrnVar.g, ahrnVar.c());
    }

    @Override // defpackage.ahpj
    public final defpackage.ahor k(defpackage.agab agabVar) {
        return defpackage.ahou.j(agabVar, j());
    }

    @Override // defpackage.ahpj
    public final long l() {
        return this.a.a() / 1000000;
    }

    @Override // defpackage.ahpj
    public final defpackage.ahou n() {
        throw null;
    }

    @Override // defpackage.ahpj
    public final void o(int i) {
        defpackage.ahrn ahrnVar = this.e;
        if (ahrnVar.f()) {
            ahrnVar = ahrnVar.b;
        }
        ahrnVar.addAndGet(i);
        ft$.ExternalSyntheticApiModelOutline0.m(this);
    }

    @Override // defpackage.ahpj
    public final void p(boolean z) {
        long jA = this.a.a();
        defpackage.ahrn ahrnVar = this.e;
        long j = jA - ahrnVar.f;
        if (ahrnVar.e()) {
            throw new java.lang.IllegalStateException();
        }
        ahrnVar.k = (true != z ? 0L : 4611686018427387904L) | Long.MIN_VALUE | (j & 4611686018427387903L);
        ft$.ExternalSyntheticApiModelOutline0.m(this);
    }

    @Override // defpackage.ahpj
    public final boolean q() {
        return this.a.d;
    }

    @Override // defpackage.ahpj
    public final defpackage.ahpj r(java.lang.String str, int i, defpackage.ahou ahouVar, defpackage.ahpe ahpeVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        defpackage.ahrn ahrnVar;
        boolean z;
        defpackage.ahro ahroVar = this.a;
        defpackage.ahrn ahrnVar2 = new defpackage.ahrn(this.e, str, i, ahroVar.a(), ahouVar);
        do {
            atomicReference = ahroVar.f;
            ahrnVar = (defpackage.ahrn) atomicReference.get();
            z = true;
            int i2 = ahrnVar.h + 1;
            if (i2 >= ahroVar.a.e) {
                ahrnVar2.d(Integer.MIN_VALUE, null);
                synchronized (ahroVar) {
                    ahroVar.h++;
                }
                break;
            }
            ahrnVar2.d(i2, ahrnVar);
        } while (!defpackage.anty.Q(atomicReference, ahrnVar, ahrnVar2));
        defpackage.ahoj ahojVar = new defpackage.ahoj(ahrnVar2, this, ahpeVar);
        defpackage.ahpj ahpjVar = ahojVar.b;
        boolean z2 = defpackage.ahns.a;
        if (ahpjVar == null) {
            throw new java.lang.NullPointerException("root trace is not a child span.");
        }
        defpackage.ahvr.bZ((ahojVar.c == null && ahojVar.d == null) ? false : true, "isSynchronousChild should not be called if the trace has been closed on its creation thread.");
        defpackage.ahne ahneVar = ahojVar.d;
        defpackage.ahoj ahojVar2 = (defpackage.ahoj) ahpjVar;
        if (ahneVar == null ? ahojVar2.c != ahojVar.c : ahneVar != ahojVar2.d) {
            z = false;
        }
        ahrnVar2.j = z;
        return ahojVar;
    }

    @Override // defpackage.ahpj
    public final void t() {
        this.e.l = 3;
    }

    public final java.lang.String toString() {
        return defpackage.ahns.j(this);
    }

    @Override // defpackage.ahpj
    public final void u(defpackage.agab agabVar, java.lang.Object obj) {
        defpackage.ahrn ahrnVar;
        defpackage.ahrj ahrjVar;
        defpackage.ahrk ahrkVarA;
        defpackage.ahrk ahrkVar = new defpackage.ahrk(agabVar, obj);
        do {
            ahrnVar = this.e;
            ahrjVar = defpackage.ahrn.a;
            ahrkVarA = ahrjVar.a(ahrnVar);
            if (ahrkVarA != null) {
                ahrkVar.b = ahrkVarA;
            }
        } while (!ahrjVar.b(ahrnVar, ahrkVarA, ahrkVar));
        ft$.ExternalSyntheticApiModelOutline0.m(this);
    }

    public ahoj(defpackage.ahrn ahrnVar, defpackage.ahro ahroVar, defpackage.ahpe ahpeVar) {
        this.e = ahrnVar;
        this.a = ahroVar;
        java.lang.Thread threadCurrentThread = null;
        this.b = null;
        defpackage.ahne ahneVar = ahpeVar.e;
        if (ahneVar == null) {
            this.d = null;
            threadCurrentThread = java.lang.Thread.currentThread();
        } else {
            this.d = ahneVar;
        }
        this.c = threadCurrentThread;
    }
}
