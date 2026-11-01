package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sqh implements defpackage.ajcb {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public sqh(defpackage.onw onwVar, defpackage.aenj aenjVar, int i) {
        this.$cid = i;
        this.a = aenjVar;
        j$.util.Objects.requireNonNull(onwVar);
        this.b = onwVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ahpj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [ajcb, java.lang.Object] */
    @Override // defpackage.ajcb
    public final void a(java.lang.Throwable th) {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.sqi) this.b).f.m((defpackage.aenj) this.a);
            return;
        }
        if (i == 1) {
            ((defpackage.onw) this.b).f.m((defpackage.aenj) this.a);
            return;
        }
        if (th == null) {
            defpackage.aooh.i("t");
        }
        ?? r0 = this.b;
        ?? r2 = this.a;
        defpackage.ahpe ahpeVar = (defpackage.ahpe) defpackage.ahns.d.get();
        defpackage.ahpj ahpjVarD = defpackage.ahns.d(ahpeVar, r0);
        try {
            r2.a(th);
            defpackage.ahns.d(ahpeVar, ahpjVarD);
        } catch (java.lang.Throwable th2) {
            try {
                ahnn.b(th2);
                throw th2;
            } catch (java.lang.Throwable th3) {
                defpackage.ahns.d(ahpeVar, ahpjVarD);
                throw th3;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ahpj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [ajcb, java.lang.Object] */
    @Override // defpackage.ajcb
    public final void b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.sqi) this.b).f.m((defpackage.aenj) this.a);
            return;
        }
        if (i == 1) {
            ((defpackage.onw) this.b).f.m((defpackage.aenj) this.a);
            return;
        }
        defpackage.ahpe ahpeVar = (defpackage.ahpe) defpackage.ahns.d.get();
        defpackage.ahpj ahpjVarD = defpackage.ahns.d(ahpeVar, this.b);
        try {
            this.a.b(obj);
            defpackage.ahns.d(ahpeVar, ahpjVarD);
        } catch (java.lang.Throwable th) {
            try {
                ahnn.b(th);
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ahns.d(ahpeVar, ahpjVarD);
                throw th2;
            }
        }
    }

    public sqh(defpackage.ahpj ahpjVar, defpackage.ajcb ajcbVar, int i) {
        this.$cid = i;
        this.b = ahpjVar;
        this.a = ajcbVar;
    }

    public sqh(defpackage.sqi sqiVar, defpackage.aenj aenjVar, int i) {
        this.$cid = i;
        this.a = aenjVar;
        j$.util.Objects.requireNonNull(sqiVar);
        this.b = sqiVar;
    }
}
