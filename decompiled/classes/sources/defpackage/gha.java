package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gha implements defpackage.ghe, defpackage.gfs {
    public final defpackage.gjh a;
    private final defpackage.aonn b;
    private final java.util.concurrent.atomic.AtomicInteger c;
    private defpackage.ggg d;

    public gha(defpackage.aonn aonnVar, defpackage.gjh gjhVar) {
        if (gjhVar == null) {
            defpackage.aooh.i("delegate");
        }
        this.b = aonnVar;
        this.a = gjhVar;
        this.c = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [aonj] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // defpackage.gfs
    public final java.lang.Object a(java.lang.String str, defpackage.aonj aonjVar, defpackage.aoln aolnVar) throws java.lang.Exception {
        defpackage.ggx ggxVar;
        ?? r7;
        if (aolnVar instanceof defpackage.ggx) {
            ggxVar = (defpackage.ggx) aolnVar;
            int i = ggxVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ggxVar.d = i - Integer.MIN_VALUE;
            } else {
                ggxVar = new defpackage.ggx(this, aolnVar);
            }
        } else {
            ggxVar = new defpackage.ggx(this, aolnVar);
        }
        java.lang.Object objE = ggxVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ggxVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objE);
            ggxVar.e = str;
            ggxVar.a = aonjVar;
            ggxVar.d = 1;
            objE = e();
            if (objE != aoluVar) {
            }
            r7 = aonjVar;
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objE);
            return objE;
        }
        java.lang.Object obj = ggxVar.a;
        str = ggxVar.e;
        defpackage.aooc.af(objE);
        r7 = obj;
        r7 = aonjVar;
        if (((java.lang.Boolean) objE).booleanValue()) {
            defpackage.aonn aonnVar = this.b;
            defpackage.ggy ggyVar = new defpackage.ggy(this, str, r7, null);
            ggxVar.e = null;
            ggxVar.a = null;
            ggxVar.d = 2;
            java.lang.Object objA = aonnVar.a(ggyVar, ggxVar);
            if (objA != aoluVar) {
                return objA;
            }
            r7 = aonjVar;
            return aoluVar;
        }
        defpackage.gin ginVarA = this.a.a(str);
        try {
            java.lang.Object objA2 = r7.a(ginVarA);
            ginVarA.close();
            return objA2;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    ginVarA.close();
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.ghe
    public final defpackage.gjh b() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a8 A[Catch: SQLException -> 0x00b0, TryCatch #2 {SQLException -> 0x00b0, blocks: (B:50:0x00a0, B:52:0x00a8, B:53:0x00aa), top: B:64:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.ggg gggVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        defpackage.ggw ggwVar;
        java.lang.Throwable th;
        if (aolnVar instanceof defpackage.ggw) {
            ggwVar = (defpackage.ggw) aolnVar;
            int i = ggwVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ggwVar.d = i - Integer.MIN_VALUE;
            } else {
                ggwVar = new defpackage.ggw(this, aolnVar);
            }
        } else {
            ggwVar = new defpackage.ggw(this, aolnVar);
        }
        java.lang.Object objA = ggwVar.b;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = ggwVar.d;
        int i3 = 1;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objA);
                int iOrdinal = gggVar.ordinal();
                if (iOrdinal == 0) {
                    defpackage.dzk.M(this.a, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    defpackage.dzk.M(this.a, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new defpackage.aois();
                    }
                    defpackage.dzk.M(this.a, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (this.c.incrementAndGet() > 0) {
                    this.d = gggVar;
                }
                java.lang.Object ggvVar = new defpackage.ggv(this);
                ggwVar.a = 1;
                ggwVar.d = 1;
                objA = aonnVar.a(ggvVar, ggwVar);
                if (objA == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = ggwVar.a;
                defpackage.aooc.af(objA);
            }
            if (this.c.decrementAndGet() == 0) {
                this.d = null;
            }
            defpackage.gjh gjhVar = this.a;
            if (i3 != 0) {
                defpackage.dzk.M(gjhVar, "END TRANSACTION");
            } else {
                defpackage.dzk.M(gjhVar, "ROLLBACK TRANSACTION");
            }
            return objA;
        } catch (java.lang.Throwable th2) {
            th = th2;
            try {
                if (th instanceof ggr) {
                    ggr ggrVar = th;
                    throw null;
                }
                try {
                    throw th;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    if (this.c.decrementAndGet() == 0) {
                        this.d = null;
                    }
                    defpackage.dzk.M(this.a, "ROLLBACK TRANSACTION");
                    throw th;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                th = null;
            }
            try {
                if (this.c.decrementAndGet() == 0) {
                    this.d = null;
                }
                defpackage.dzk.M(this.a, "ROLLBACK TRANSACTION");
            } catch (android.database.SQLException e) {
                if (th == null) {
                    throw e;
                }
                aoil.b(th, e);
            }
            throw th;
        }
    }

    public final java.lang.Object d(defpackage.ggg gggVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        return this.b.a(new defpackage.ggz(this, gggVar, aonnVar, null), aolnVar);
    }

    public final java.lang.Object e() {
        boolean z = true;
        if (this.d == null && !this.a.a.l()) {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }
}
