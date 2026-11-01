package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nkk implements ysg {
    private final noe a;
    private final aoin b;

    public nkk(noe noeVar, aoin aoinVar) {
        aooh.f(aoinVar, "enableAgenticCallScreen");
        this.a = noeVar;
        this.b = aoinVar;
    }

    public final int a() {
        return 305;
    }

    public final long b() {
        return 0L;
    }

    public final long c() {
        return 0L;
    }

    public final /* synthetic */ java.lang.Integer d() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.nkj nkjVar;
        if (aolnVar instanceof defpackage.nkj) {
            nkjVar = (defpackage.nkj) aolnVar;
            int i = nkjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nkjVar.c = i - Integer.MIN_VALUE;
            } else {
                nkjVar = new defpackage.nkj(this, aolnVar);
            }
        } else {
            nkjVar = new defpackage.nkj(this, aolnVar);
        }
        java.lang.Object objE = nkjVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nkjVar.c;
        if (i2 == 0) {
            aooc.af(objE);
            noe noeVar = this.a;
            nkjVar.c = 1;
            objE = noeVar.e(nkjVar);
            if (objE == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objE);
        }
        return java.lang.Boolean.valueOf(((java.lang.Boolean) objE).booleanValue() && ((java.lang.Boolean) this.b.a()).booleanValue());
    }

    public final /* synthetic */ void f() {
    }
}
