package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
abstract class fsg implements defpackage.frk {
    private final java.util.ArrayDeque a = new java.util.ArrayDeque();
    public final java.util.ArrayDeque b;
    public long c;
    private final java.util.ArrayDeque d;
    private defpackage.fse e;
    private long f;
    private long g;

    public fsg() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new defpackage.fse());
        }
        this.b = new java.util.ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new defpackage.fsf(new rai(this)));
        }
        this.d = new java.util.ArrayDeque();
        this.g = -9223372036854775807L;
    }

    private final void k(defpackage.fse fseVar) {
        fseVar.dJ();
        this.a.add(fseVar);
    }

    @Override // defpackage.ewr
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        ahvr.bY(this.e == null);
        java.util.ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        defpackage.fse fseVar = (defpackage.fse) arrayDeque.pollFirst();
        this.e = fseVar;
        return fseVar;
    }

    @Override // defpackage.ewr
    public void c() {
        this.f = 0L;
        this.c = 0L;
        while (true) {
            java.util.ArrayDeque arrayDeque = this.d;
            if (arrayDeque.isEmpty()) {
                break;
            }
            defpackage.fse fseVar = (defpackage.fse) arrayDeque.poll();
            java.lang.String str = eum.a;
            k(fseVar);
        }
        defpackage.fse fseVar2 = this.e;
        if (fseVar2 != null) {
            k(fseVar2);
            this.e = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    @Override // defpackage.ewr
    public final /* bridge */ /* synthetic */ void d(java.lang.Object obj) {
        ahvr.bM(obj == this.e);
        defpackage.fse fseVar = (defpackage.fse) obj;
        if (fseVar.dL(4)) {
            long j = this.f;
            this.f = 1 + j;
            fseVar.i = j;
            this.d.add(fseVar);
        } else {
            long j2 = fseVar.f;
            if (j2 != Long.MIN_VALUE) {
                long j3 = this.g;
                if (j3 == -9223372036854775807L || j2 >= j3) {
                    long j4 = this.f;
                    this.f = 1 + j4;
                    fseVar.i = j4;
                    this.d.add(fseVar);
                } else {
                    k(fseVar);
                }
            } else {
                long j5 = this.f;
                this.f = 1 + j5;
                fseVar.i = j5;
                this.d.add(fseVar);
            }
        }
        this.e = null;
    }

    @Override // defpackage.ewr
    public final void f(long j) {
        this.g = j;
    }

    protected abstract defpackage.frj g();

    @Override // defpackage.ewr
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public defpackage.frp b() {
        java.util.ArrayDeque arrayDeque = this.b;
        if (!arrayDeque.isEmpty()) {
            while (true) {
                java.util.ArrayDeque arrayDeque2 = this.d;
                if (!arrayDeque2.isEmpty()) {
                    defpackage.fse fseVar = (defpackage.fse) arrayDeque2.peek();
                    java.lang.String str = eum.a;
                    if (fseVar.f > this.c) {
                        break;
                    }
                    defpackage.fse fseVar2 = (defpackage.fse) arrayDeque2.poll();
                    if (fseVar2.dL(4)) {
                        defpackage.frp frpVar = (defpackage.frp) arrayDeque.pollFirst();
                        frpVar.dK(4);
                        k(fseVar2);
                        return frpVar;
                    }
                    i(fseVar2);
                    if (j()) {
                        defpackage.frj frjVarG = g();
                        defpackage.frp frpVar2 = (defpackage.frp) arrayDeque.pollFirst();
                        frpVar2.f(fseVar2.f, frjVarG, Long.MAX_VALUE);
                        k(fseVar2);
                        return frpVar2;
                    }
                    k(fseVar2);
                } else {
                    break;
                }
            }
        }
        return null;
    }

    protected abstract void i(defpackage.fro froVar);

    protected abstract boolean j();

    @Override // defpackage.frk
    public final void p(long j) {
        this.c = j;
    }

    @Override // defpackage.ewr
    public void e() {
    }
}
