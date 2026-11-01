package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pci {
    private static final aimz a = aimz.i("com/android/dialer/incall/arbiter/impl/PhoneDialerInCallArbiterImpl");
    private defpackage.pcb b;
    private final apdp d = new apdp();
    private defpackage.zie c = defpackage.zie.PHONE;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.pcc pccVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.pcc) {
            pccVar = (defpackage.pcc) aolnVar;
            int i = pccVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pccVar.c = i - Integer.MIN_VALUE;
            } else {
                pccVar = new defpackage.pcc(this, aolnVar);
            }
        } else {
            pccVar = new defpackage.pcc(this, aolnVar);
        }
        java.lang.Object obj = pccVar.a;
        aolu aoluVar = aolu.a;
        int i2 = pccVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            apdp apdpVar2 = this.d;
            pccVar.d = apdpVar2;
            pccVar.c = 1;
            if (apdpVar2.b(pccVar) == aoluVar) {
                return aoluVar;
            }
            apdpVar = apdpVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = pccVar.d;
            aooc.af(obj);
        }
        try {
            defpackage.pcb pcbVar = this.b;
            return pcbVar != null ? pcbVar.a : null;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.zie zieVar, aomy aomyVar, aoln aolnVar) {
        defpackage.pcd pcdVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.pcd) {
            pcdVar = (defpackage.pcd) aolnVar;
            int i = pcdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pcdVar.c = i - Integer.MIN_VALUE;
            } else {
                pcdVar = new defpackage.pcd(this, aolnVar);
            }
        } else {
            pcdVar = new defpackage.pcd(this, aolnVar);
        }
        java.lang.Object obj = pcdVar.a;
        java.lang.Boolean boolValueOf = aolu.a;
        int i2 = pcdVar.c;
        boolean z = true;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.d;
                pcdVar.d = zieVar;
                pcdVar.f = (mtr) aomyVar;
                pcdVar.e = apdpVar;
                pcdVar.c = 1;
                if (apdpVar.b(pcdVar) != boolValueOf) {
                }
                return boolValueOf;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = pcdVar.e;
            aomyVar = pcdVar.f;
            defpackage.zie zieVar2 = pcdVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            zieVar = zieVar2;
            if (this.c == zieVar) {
                aomyVar.a();
            } else {
                z = false;
            }
            boolValueOf = java.lang.Boolean.valueOf(z);
            return boolValueOf;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.pce pceVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.pce) {
            pceVar = (defpackage.pce) aolnVar;
            int i = pceVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pceVar.c = i - Integer.MIN_VALUE;
            } else {
                pceVar = new defpackage.pce(this, aolnVar);
            }
        } else {
            pceVar = new defpackage.pce(this, aolnVar);
        }
        java.lang.Object obj = pceVar.a;
        java.lang.Boolean boolValueOf = aolu.a;
        int i2 = pceVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.d;
                pceVar.d = apdpVar2;
                pceVar.c = 1;
                if (apdpVar2.b(pceVar) != boolValueOf) {
                    apdpVar = apdpVar2;
                }
                return boolValueOf;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = pceVar.d;
            aooc.af(obj);
            boolValueOf = java.lang.Boolean.valueOf(this.b != null);
            return boolValueOf;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.pca pcaVar, aoln aolnVar) {
        defpackage.pcf pcfVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.pcf) {
            pcfVar = (defpackage.pcf) aolnVar;
            int i = pcfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pcfVar.c = i - Integer.MIN_VALUE;
            } else {
                pcfVar = new defpackage.pcf(this, aolnVar);
            }
        } else {
            pcfVar = new defpackage.pcf(this, aolnVar);
        }
        java.lang.Object obj = pcfVar.a;
        java.lang.Boolean boolValueOf = aolu.a;
        int i2 = pcfVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.d;
                pcfVar.d = pcaVar;
                pcfVar.e = apdpVar;
                pcfVar.c = 1;
                if (apdpVar.b(pcfVar) != boolValueOf) {
                }
                return boolValueOf;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = pcfVar.e;
            defpackage.pca pcaVar2 = pcfVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            pcaVar = pcaVar2;
            defpackage.pcb pcbVar = this.b;
            boolValueOf = java.lang.Boolean.valueOf((pcbVar != null ? pcbVar.a : null) == pcaVar);
            return boolValueOf;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object e(defpackage.zie zieVar, aoln aolnVar) {
        defpackage.pcg pcgVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.pcg) {
            pcgVar = (defpackage.pcg) aolnVar;
            int i = pcgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pcgVar.c = i - Integer.MIN_VALUE;
            } else {
                pcgVar = new defpackage.pcg(this, aolnVar);
            }
        } else {
            pcgVar = new defpackage.pcg(this, aolnVar);
        }
        java.lang.Object obj = pcgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = pcgVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            apdpVar = this.d;
            pcgVar.d = zieVar;
            pcgVar.e = apdpVar;
            pcgVar.c = 1;
            if (apdpVar.b(pcgVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = pcgVar.e;
            defpackage.zie zieVar2 = pcgVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            zieVar = zieVar2;
        }
        try {
            a.b().l("com/android/dialer/incall/arbiter/impl/PhoneDialerInCallArbiterImpl", "registerPrimaryActiveSurface$<anonymous>", 60, "PhoneDialerInCallArbiterImpl.kt").y("Registering primary active surface: %s", zieVar);
            this.c = zieVar;
            return aojh.a;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.pca pcaVar, aoln aolnVar) {
        defpackage.pch pchVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.pch) {
            pchVar = (defpackage.pch) aolnVar;
            int i = pchVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pchVar.c = i - Integer.MIN_VALUE;
            } else {
                pchVar = new defpackage.pch(this, aolnVar);
            }
        } else {
            pchVar = new defpackage.pch(this, aolnVar);
        }
        java.lang.Object obj = pchVar.a;
        java.lang.Boolean boolValueOf = aolu.a;
        int i2 = pchVar.c;
        boolean z = true;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.d;
                pchVar.d = pcaVar;
                pchVar.e = apdpVar;
                pchVar.c = 1;
                if (apdpVar.b(pchVar) != boolValueOf) {
                }
                return boolValueOf;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = pchVar.e;
            defpackage.pca pcaVar2 = pchVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            pcaVar = pcaVar2;
            defpackage.pcb pcbVar = this.b;
            if (pcbVar == null) {
                this.b = new defpackage.pcb(pcaVar);
            } else if (pcbVar.a != pcaVar) {
                z = false;
            }
            boolValueOf = java.lang.Boolean.valueOf(z);
            return boolValueOf;
        } finally {
            apdpVar.d();
        }
    }
}
