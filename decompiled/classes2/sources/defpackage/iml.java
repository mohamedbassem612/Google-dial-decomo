package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iml {
    private java.lang.String a;
    private final apdp b = new apdp();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.imi imiVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.imi) {
            imiVar = (defpackage.imi) aolnVar;
            int i = imiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                imiVar.c = i - Integer.MIN_VALUE;
            } else {
                imiVar = new defpackage.imi(this, aolnVar);
            }
        } else {
            imiVar = new defpackage.imi(this, aolnVar);
        }
        java.lang.Object obj = imiVar.a;
        aojh aojhVar = aolu.a;
        int i2 = imiVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.b;
                imiVar.d = apdpVar2;
                imiVar.c = 1;
                if (apdpVar2.b(imiVar) != aojhVar) {
                    apdpVar = apdpVar2;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = imiVar.d;
            aooc.af(obj);
            this.a = null;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.imj imjVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.imj) {
            imjVar = (defpackage.imj) aolnVar;
            int i = imjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                imjVar.c = i - Integer.MIN_VALUE;
            } else {
                imjVar = new defpackage.imj(this, aolnVar);
            }
        } else {
            imjVar = new defpackage.imj(this, aolnVar);
        }
        java.lang.Object obj = imjVar.a;
        java.lang.String str = aolu.a;
        int i2 = imjVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.b;
                imjVar.d = apdpVar2;
                imjVar.c = 1;
                if (apdpVar2.b(imjVar) != str) {
                    apdpVar = apdpVar2;
                }
                return str;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = imjVar.d;
            aooc.af(obj);
            str = this.a;
            return str;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(java.lang.String str, aoln aolnVar) {
        defpackage.imk imkVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.imk) {
            imkVar = (defpackage.imk) aolnVar;
            int i = imkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                imkVar.c = i - Integer.MIN_VALUE;
            } else {
                imkVar = new defpackage.imk(this, aolnVar);
            }
        } else {
            imkVar = new defpackage.imk(this, aolnVar);
        }
        java.lang.Object obj = imkVar.a;
        aojh aojhVar = aolu.a;
        int i2 = imkVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.b;
                imkVar.d = str;
                imkVar.e = apdpVar;
                imkVar.c = 1;
                if (apdpVar.b(imkVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = imkVar.e;
            java.lang.String str2 = imkVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            str = str2;
            this.a = str;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }
}
