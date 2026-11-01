package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahqt implements defpackage.ajas {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public ahqt(defpackage.ajwr ajwrVar, defpackage.ajbt ajbtVar, defpackage.ajas ajasVar, int i) {
        this.$cid = i;
        this.b = ajbtVar;
        this.a = ajasVar;
        j$.util.Objects.requireNonNull(ajwrVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ahpj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ajaz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ajas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [ajas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [ajas, java.lang.Object] */
    @Override // defpackage.ajas
    public final defpackage.ajcq a() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.ahpe ahpeVar = (defpackage.ahpe) defpackage.ahns.d.get();
            defpackage.ahpj ahpjVarD = defpackage.ahns.d(ahpeVar, this.a);
            try {
                defpackage.ajcq ajcqVarA = this.b.a();
                defpackage.ahns.d(ahpeVar, ahpjVarD);
                defpackage.aooh.e(ajcqVarA, "wrapInTrace(...)");
                return ajcqVarA;
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
        if (i == 1) {
            return this.a.a();
        }
        if (i != 2) {
            if (((defpackage.ajbt) this.b).compareAndSet(defpackage.ajbs.a, defpackage.ajbs.c)) {
                return this.a.a();
            }
            defpackage.ajcl ajclVar = defpackage.ajcl.a;
            return ajclVar == null ? new defpackage.ajcl() : ajclVar;
        }
        defpackage.ajbb ajbbVar = new defpackage.ajbb();
        try {
            defpackage.ajbg ajbgVarA = this.a.a();
            ajbgVarA.f((defpackage.ajbb) this.b);
            return ajbgVarA.c.c;
        } finally {
            ((defpackage.ajbb) this.b).b(ajbbVar, defpackage.ajbm.INSTANCE);
        }
    }

    public final java.lang.String toString() {
        int i = this.$cid;
        if (i == 0) {
            return "propagating=[" + this.b + ']';
        }
        if (i != 1) {
            java.lang.Object obj = this.a;
            return i != 2 ? obj.toString() : obj.toString();
        }
        java.lang.Object obj2 = this.a;
        java.lang.Object obj3 = this.b;
        return obj2.toString() + ", input=[" + java.lang.String.valueOf(obj3) + ']';
    }

    public ahqt(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
