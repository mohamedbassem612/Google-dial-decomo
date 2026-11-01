package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zip {
    public albh a;
    public final java.lang.Object b;

    public zip() {
        this.b = new apdp();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.zin zinVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.zin) {
            zinVar = (defpackage.zin) aolnVar;
            int i = zinVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zinVar.c = i - Integer.MIN_VALUE;
            } else {
                zinVar = new defpackage.zin(this, aolnVar);
            }
        } else {
            zinVar = new defpackage.zin(this, aolnVar);
        }
        java.lang.Object obj2 = zinVar.a;
        albh albhVar = aolu.a;
        int i2 = zinVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj2);
                java.lang.Object obj3 = this.b;
                apdp apdpVar = (apdp) obj3;
                zinVar.d = apdpVar;
                zinVar.c = 1;
                if (apdpVar.b(zinVar) != albhVar) {
                    obj = obj3;
                }
                return albhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = zinVar.d;
            aooc.af(obj2);
            albhVar = this.a;
            return albhVar;
        } finally {
            ((apdp) obj).d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(albh albhVar, aoln aolnVar) {
        defpackage.zio zioVar;
        java.lang.Object obj;
        albh albhVar2;
        if (aolnVar instanceof defpackage.zio) {
            zioVar = (defpackage.zio) aolnVar;
            int i = zioVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zioVar.d = i - Integer.MIN_VALUE;
            } else {
                zioVar = new defpackage.zio(this, aolnVar);
            }
        } else {
            zioVar = new defpackage.zio(this, aolnVar);
        }
        java.lang.Object obj2 = zioVar.b;
        aolu aoluVar = aolu.a;
        int i2 = zioVar.d;
        if (i2 == 0) {
            aooc.af(obj2);
            obj = this.b;
            zioVar.a = albhVar;
            apdp apdpVar = (apdp) obj;
            zioVar.e = apdpVar;
            zioVar.d = 1;
            if (apdpVar.b(zioVar) == aoluVar) {
                albhVar2 = albhVar;
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = zioVar.e;
            java.lang.Object obj3 = zioVar.a;
            aooc.af(obj2);
            obj = apdpVar2;
            albhVar2 = obj3;
        }
        try {
            albhVar2 = albhVar;
            this.a = albhVar2;
            return aojh.a;
        } finally {
            ((apdp) obj).d();
        }
    }

    public zip(defpackage.xdh xdhVar) {
        this.a = defpackage.wxx.a;
        this.b = xdhVar;
    }
}
