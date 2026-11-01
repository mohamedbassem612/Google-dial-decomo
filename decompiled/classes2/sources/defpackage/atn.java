package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class atn extends aomh implements aonn {
    long a;
    long b;
    long c;
    int d;
    /* synthetic */ long e;
    final /* synthetic */ ato f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atn(ato atoVar, aoln aolnVar) {
        super(2, aolnVar);
        this.f = atoVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c(new defpackage.dpu(((defpackage.dpu) obj).a), (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0068  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5 = this.e;
        aolu aoluVar = aolu.a;
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                aooc.af(obj);
            } else if (i != 2) {
                j4 = this.c;
                aooc.af(obj);
            } else {
                j2 = this.b;
                j = this.a;
                aooc.af(obj);
                j3 = ((defpackage.dpu) obj).a;
                cuq cuqVar = this.f.e;
                long jAM = mni.aM(j2, j3);
                this.e = j5;
                this.a = j;
                this.b = j2;
                this.c = j3;
                this.d = 3;
                obj = cuqVar.d(jAM, j3, this);
                if (obj != aoluVar) {
                    return aoluVar;
                }
                j4 = j3;
            }
            return new defpackage.dpu(mni.aM(j5, mni.aM(j4, ((defpackage.dpu) obj).a)));
        }
        aooc.af(obj);
        cuq cuqVar2 = this.f.e;
        this.e = j5;
        this.d = 1;
        obj = cuqVar2.e(j5, this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        j = ((defpackage.dpu) obj).a;
        long jAM2 = mni.aM(j5, j);
        ato atoVar = this.f;
        this.e = j5;
        this.a = j;
        this.b = jAM2;
        this.d = 2;
        obj = atoVar.g(jAM2, this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        j2 = jAM2;
        j3 = ((defpackage.dpu) obj).a;
        cuq cuqVar3 = this.f.e;
        long jAM3 = mni.aM(j2, j3);
        this.e = j5;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = 3;
        obj = cuqVar3.d(jAM3, j3, this);
        if (obj != aoluVar) {
            return aoluVar;
        }
        j4 = j3;
        return new defpackage.dpu(mni.aM(j5, mni.aM(j4, ((defpackage.dpu) obj).a)));
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.atn atnVar = new defpackage.atn(this.f, aolnVar);
        atnVar.e = ((defpackage.dpu) obj).a;
        return atnVar;
    }
}
