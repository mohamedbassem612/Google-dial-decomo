package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mtd {
    private mta a;
    private final defpackage.apdp b = new defpackage.apdp();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        mtb mtbVar;
        defpackage.apdp apdpVar;
        if (aolnVar instanceof mtb) {
            mtbVar = (mtb) aolnVar;
            int i = mtbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mtbVar.c = i - Integer.MIN_VALUE;
            } else {
                mtbVar = new mtb(this, aolnVar);
            }
        } else {
            mtbVar = new mtb(this, aolnVar);
        }
        java.lang.Object obj = mtbVar.a;
        mta mtaVar = defpackage.aolu.a;
        int i2 = mtbVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                defpackage.apdp apdpVar2 = this.b;
                mtbVar.d = apdpVar2;
                mtbVar.c = 1;
                if (apdpVar2.b(mtbVar) != mtaVar) {
                    apdpVar = apdpVar2;
                }
                return mtaVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = mtbVar.d;
            defpackage.aooc.af(obj);
            mtaVar = this.a;
            return mtaVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(mte mteVar, msz mszVar, defpackage.aoln aolnVar) {
        mtc mtcVar;
        defpackage.apdp apdpVar;
        if (aolnVar instanceof mtc) {
            mtcVar = (mtc) aolnVar;
            int i = mtcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mtcVar.c = i - Integer.MIN_VALUE;
            } else {
                mtcVar = new mtc(this, aolnVar);
            }
        } else {
            mtcVar = new mtc(this, aolnVar);
        }
        java.lang.Object obj = mtcVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = mtcVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                apdpVar = this.b;
                mtcVar.d = mteVar;
                mtcVar.e = mszVar;
                mtcVar.f = apdpVar;
                mtcVar.c = 1;
                if (apdpVar.b(mtcVar) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.apdp apdpVar2 = mtcVar.f;
            mszVar = mtcVar.e;
            mte mteVar2 = mtcVar.d;
            defpackage.aooc.af(obj);
            apdpVar = apdpVar2;
            mteVar = mteVar2;
            this.a = new mta(mteVar, mszVar);
            obj2 = defpackage.aojh.a;
            return obj2;
        } finally {
            apdpVar.d();
        }
    }
}
