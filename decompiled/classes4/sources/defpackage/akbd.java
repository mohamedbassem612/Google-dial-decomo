package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class akbd implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public akbd(defpackage.anur anurVar, int i, int i2) {
        this.$cid = i2;
        this.a = i;
        j$.util.Objects.requireNonNull(anurVar);
        this.b = anurVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                ((akbf) this.b).c().dx(this.a);
                return;
            case 1:
                ((akbb) this.b).c().dx(this.a);
                return;
            case 2:
                ((akbj) this.b).d.dx(this.a);
                return;
            case 3:
                akbw akbwVar = (akbw) this.b;
                if (akbwVar.j) {
                    return;
                }
                int i = this.a;
                if (akbwVar.e.e == 4) {
                    akbwVar.l.dx(i);
                    return;
                } else {
                    akbwVar.d += i;
                    return;
                }
            case 4:
                try {
                    int i2 = defpackage.aoik.a;
                    defpackage.anwf anwfVar = ((defpackage.anur) this.b).j;
                    int i3 = this.a;
                    ahvr.bN(i3 > 0, "numMessages must be > 0");
                    if (((defpackage.anzz) anwfVar).b()) {
                        return;
                    }
                    ((defpackage.anzz) anwfVar).e += (long) i3;
                    ((defpackage.anzz) anwfVar).a();
                    return;
                } catch (java.lang.Throwable th) {
                    ((defpackage.anur) this.b).b(th);
                    return;
                }
            case 5:
                ((defpackage.anwl) this.b).g.dx(this.a);
                return;
            case 6:
                ((defpackage.anwq) this.b).f.g(this.a);
                return;
            case 7:
                ((defpackage.anwq) this.b).f.k(this.a);
                return;
            case 8:
                ((defpackage.anwq) this.b).f.l(this.a);
                return;
            default:
                ((defpackage.apwz) this.b).onStatus(this.a);
                return;
        }
    }

    public /* synthetic */ akbd(java.lang.Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }

    public akbd(defpackage.anwl anwlVar, int i, int i2) {
        this.$cid = i2;
        this.a = i;
        j$.util.Objects.requireNonNull(anwlVar);
        this.b = anwlVar;
    }

    public akbd(defpackage.anwq anwqVar, int i, int i2) {
        this.$cid = i2;
        this.a = i;
        j$.util.Objects.requireNonNull(anwqVar);
        this.b = anwqVar;
    }

    public akbd(defpackage.anwq anwqVar, int i, int i2, byte[] bArr) {
        this.$cid = i2;
        this.a = i;
        j$.util.Objects.requireNonNull(anwqVar);
        this.b = anwqVar;
    }

    public akbd(defpackage.anwq anwqVar, int i, int i2, char[] cArr) {
        this.$cid = i2;
        this.a = i;
        j$.util.Objects.requireNonNull(anwqVar);
        this.b = anwqVar;
    }
}
