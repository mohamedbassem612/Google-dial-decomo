package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class noe {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/dobby/impl/settings/service/DobbySettingsConsolidator");
    private final defpackage.nnx b;
    private final defpackage.zjm c;

    public noe(defpackage.zjm zjmVar, defpackage.nnx nnxVar) {
        this.c = zjmVar;
        this.b = nnxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.aoln aolnVar) throws java.lang.Throwable {
        nny nnyVar;
        if (aolnVar instanceof nny) {
            nnyVar = (nny) aolnVar;
            int i = nnyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nnyVar.c = i - Integer.MIN_VALUE;
            } else {
                nnyVar = new nny(this, aolnVar);
            }
        } else {
            nnyVar = new nny(this, aolnVar);
        }
        java.lang.Object objB = nnyVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nnyVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objB);
            defpackage.nnx nnxVar = this.b;
            nnyVar.c = 1;
            objB = nnxVar.b(nnyVar);
            if (objB != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objB);
            return objB;
        }
        defpackage.aooc.af(objB);
        noi noiVarB = noi.b(((defpackage.nok) objB).d);
        if (noiVarB == null) {
            noiVarB = noi.e;
        }
        nnyVar.c = 2;
        java.lang.Object objB2 = b(noiVarB, nnyVar);
        if (objB2 != aoluVar) {
            return objB2;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(noi noiVar, defpackage.aoln aolnVar) {
        nnz nnzVar;
        if (aolnVar instanceof nnz) {
            nnzVar = (nnz) aolnVar;
            int i = nnzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nnzVar.c = i - Integer.MIN_VALUE;
            } else {
                nnzVar = new nnz(this, aolnVar);
            }
        } else {
            nnzVar = new nnz(this, aolnVar);
        }
        java.lang.Object objC = nnzVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nnzVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objC);
            nnzVar.d = noiVar;
            nnzVar.c = 1;
            objC = c(nnzVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            noiVar = nnzVar.d;
            defpackage.aooc.af(objC);
        }
        return (((java.lang.Boolean) objC).booleanValue() && noiVar == noi.a) ? noi.c : noiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        noa noaVar;
        if (aolnVar instanceof noa) {
            noaVar = (noa) aolnVar;
            int i = noaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                noaVar.c = i - Integer.MIN_VALUE;
            } else {
                noaVar = new noa(this, aolnVar);
            }
        } else {
            noaVar = new noa(this, aolnVar);
        }
        java.lang.Object objC = noaVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = noaVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objC);
            j$.util.Optional optionalG = this.c.g();
            defpackage.aooh.e(optionalG, "getFeature(...)");
            defpackage.met metVar = (defpackage.met) defpackage.aooh.q(optionalG);
            if (metVar != null) {
                noaVar.c = 1;
                objC = metVar.c(noaVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
            }
            return java.lang.Boolean.FALSE;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defpackage.aooc.af(objC);
        if (((java.lang.Boolean) objC).booleanValue()) {
            ((defpackage.aimw) a.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsConsolidator", "isAapmEnabled", 80, "DobbySettingsConsolidator.kt")).v("AAPM is enabled");
            return java.lang.Boolean.TRUE;
        }
        return java.lang.Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.aoln aolnVar) throws java.lang.Throwable {
        nob nobVar;
        if (aolnVar instanceof nob) {
            nobVar = (nob) aolnVar;
            int i = nobVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nobVar.c = i - Integer.MIN_VALUE;
            } else {
                nobVar = new nob(this, aolnVar);
            }
        } else {
            nobVar = new nob(this, aolnVar);
        }
        java.lang.Object objB = nobVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nobVar.c;
        boolean z = true;
        if (i2 == 0) {
            defpackage.aooc.af(objB);
            defpackage.nnx nnxVar = this.b;
            nobVar.c = 1;
            objB = nnxVar.b(nobVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objB);
        }
        noh nohVarB = noh.b(((defpackage.nok) objB).c);
        if (nohVarB == null) {
            nohVarB = noh.k;
        }
        int iOrdinal = nohVarB.ordinal();
        if (iOrdinal != 1 && iOrdinal != 4 && iOrdinal != 6) {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.aoln aolnVar) throws java.lang.Throwable {
        noc nocVar;
        noh nohVarB;
        if (aolnVar instanceof noc) {
            nocVar = (noc) aolnVar;
            int i = nocVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nocVar.c = i - Integer.MIN_VALUE;
            } else {
                nocVar = new noc(this, aolnVar);
            }
        } else {
            nocVar = new noc(this, aolnVar);
        }
        java.lang.Object objC = nocVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nocVar.c;
        boolean zD = true;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(objC);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objC);
            }
            nohVarB = noh.b(((defpackage.nok) objC).c);
            if (nohVarB == null) {
                nohVarB = noh.k;
            }
            zD = defpackage.mni.D(nohVarB);
            return java.lang.Boolean.valueOf(zD);
        }
        defpackage.aooc.af(objC);
        nocVar.c = 1;
        objC = c(nocVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        if (!((java.lang.Boolean) objC).booleanValue()) {
            defpackage.nnx nnxVar = this.b;
            nocVar.c = 2;
            objC = nnxVar.b(nocVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
            nohVarB = noh.b(((defpackage.nok) objC).c);
            if (nohVarB == null) {
                nohVarB = noh.k;
            }
            zD = defpackage.mni.D(nohVarB);
        }
        return java.lang.Boolean.valueOf(zD);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(noh nohVar, defpackage.aoln aolnVar) {
        nod nodVar;
        if (aolnVar instanceof nod) {
            nodVar = (nod) aolnVar;
            int i = nodVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nodVar.c = i - Integer.MIN_VALUE;
            } else {
                nodVar = new nod(this, aolnVar);
            }
        } else {
            nodVar = new nod(this, aolnVar);
        }
        java.lang.Object objC = nodVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nodVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objC);
            nodVar.d = nohVar;
            nodVar.c = 1;
            objC = c(nodVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nohVar = nodVar.d;
            defpackage.aooc.af(objC);
        }
        return java.lang.Boolean.valueOf(((java.lang.Boolean) objC).booleanValue() ? true : defpackage.mni.D(nohVar));
    }
}
