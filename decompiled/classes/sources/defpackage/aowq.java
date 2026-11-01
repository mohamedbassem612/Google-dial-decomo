package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aowq extends defpackage.aowe {
    private final int g;
    private final int h;

    public aowq(int i, int i2, defpackage.aonj aonjVar) {
        super(i, aonjVar);
        this.g = i;
        this.h = i2;
        if (i2 != 1) {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bs(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            }
            return;
        }
        defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
        throw new java.lang.IllegalArgumentException("This implementation does not support suspension for senders, use " + new defpackage.aooa(defpackage.aowe.class).c() + " instead");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: apcv */
    private final java.lang.Object C(java.lang.Object obj, boolean z) throws apcv {
        defpackage.aown aownVar;
        defpackage.aonj aonjVar;
        apcv apcvVarD;
        if (this.h == 3) {
            java.lang.Object objB = super.b(obj);
            if (!(objB instanceof defpackage.aowl) || (objB instanceof defpackage.aowk)) {
                return objB;
            }
            if (!z || (aonjVar = this.a) == null || (apcvVarD = aoil.d(aonjVar, obj, (apcv) null)) == null) {
                return defpackage.aojh.a;
            }
            throw apcvVarD;
        }
        java.lang.Object obj2 = obj;
        defpackage.aorq aorqVar = this.d;
        defpackage.apcm apcmVar = defpackage.aowg.d;
        defpackage.aown aownVar2 = (defpackage.aown) aorqVar.a;
        while (true) {
            long jB = this.b.b();
            long j = 1152921504606846975L & jB;
            boolean zX = super.x(jB, false);
            long j2 = defpackage.aowg.b;
            long j3 = j / j2;
            int i = (int) (j % j2);
            if (aownVar2.b != j3) {
                defpackage.aown aownVarT = super.t(j3, aownVar2);
                if (aownVarT != null) {
                    aownVar = aownVarT;
                } else if (zX) {
                    return new defpackage.aowk(q());
                }
            } else {
                aownVar = aownVar2;
            }
            int iC = super.c(aownVar, i, obj2, j, apcmVar, zX);
            defpackage.aown aownVar3 = aownVar;
            if (iC == 0) {
                aownVar3.o();
                return defpackage.aojh.a;
            }
            if (iC != 1) {
                if (iC != 2) {
                    if (iC == 3) {
                        throw new java.lang.IllegalStateException("unexpected");
                    }
                    if (iC == 4) {
                        if (j < g()) {
                            aownVar3.o();
                        }
                        return new defpackage.aowk(q());
                    }
                    aownVar3.o();
                    obj2 = obj;
                    aownVar2 = aownVar3;
                } else {
                    if (zX) {
                        aownVar3.r();
                        return new defpackage.aowk(q());
                    }
                    u((aownVar3.b * j2) + ((long) i));
                }
            }
            return defpackage.aojh.a;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: apcv */
    @Override // defpackage.aowe, defpackage.aowv
    public final java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) throws java.lang.Throwable {
        apcv apcvVarD;
        java.lang.Object objC = C(obj, true);
        if (!(objC instanceof defpackage.aowk)) {
            return defpackage.aojh.a;
        }
        defpackage.aowm.b(objC);
        defpackage.aonj aonjVar = this.a;
        if (aonjVar == null || (apcvVarD = aoil.d(aonjVar, obj, (apcv) null)) == null) {
            throw q();
        }
        aoil.b(apcvVarD, q());
        throw apcvVarD;
    }

    @Override // defpackage.aowe, defpackage.aowv
    public final java.lang.Object b(java.lang.Object obj) {
        return C(obj, false);
    }

    @Override // defpackage.aowe
    protected final boolean z() {
        return this.h == 2;
    }
}
