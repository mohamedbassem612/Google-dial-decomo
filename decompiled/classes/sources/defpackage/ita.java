package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ita {
    private isx a;
    private final defpackage.apdp b = new defpackage.apdp();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        isy isyVar;
        defpackage.apdp apdpVar;
        if (aolnVar instanceof isy) {
            isyVar = (isy) aolnVar;
            int i = isyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                isyVar.c = i - Integer.MIN_VALUE;
            } else {
                isyVar = new isy(this, aolnVar);
            }
        } else {
            isyVar = new isy(this, aolnVar);
        }
        java.lang.Object obj = isyVar.a;
        isx isxVar = defpackage.aolu.a;
        int i2 = isyVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                defpackage.apdp apdpVar2 = this.b;
                isyVar.d = apdpVar2;
                isyVar.c = 1;
                if (apdpVar2.b(isyVar) != isxVar) {
                    apdpVar = apdpVar2;
                }
                return isxVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = isyVar.d;
            defpackage.aooc.af(obj);
            isxVar = this.a;
            return isxVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(itb itbVar, isw iswVar, defpackage.aoln aolnVar) {
        isz iszVar;
        defpackage.apdp apdpVar;
        if (aolnVar instanceof isz) {
            iszVar = (isz) aolnVar;
            int i = iszVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iszVar.c = i - Integer.MIN_VALUE;
            } else {
                iszVar = new isz(this, aolnVar);
            }
        } else {
            iszVar = new isz(this, aolnVar);
        }
        java.lang.Object obj = iszVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = iszVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                apdpVar = this.b;
                iszVar.d = itbVar;
                iszVar.e = iswVar;
                iszVar.f = apdpVar;
                iszVar.c = 1;
                if (apdpVar.b(iszVar) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.apdp apdpVar2 = iszVar.f;
            iswVar = iszVar.e;
            itb itbVar2 = iszVar.d;
            defpackage.aooc.af(obj);
            apdpVar = apdpVar2;
            itbVar = itbVar2;
            this.a = new isx(itbVar, iswVar);
            obj2 = defpackage.aojh.a;
            return obj2;
        } finally {
            apdpVar.d();
        }
    }
}
