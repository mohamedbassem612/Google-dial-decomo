package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yvj implements ysg {
    private final aoin a;
    private final aoin b;
    private final yvp c;
    private final tmi d;

    public yvj(tmi tmiVar, aoin aoinVar, aoin aoinVar2, yvp yvpVar) {
        aooh.f(tmiVar, "configProvider");
        aooh.f(aoinVar, "astreaMinPackageVersion");
        aooh.f(aoinVar2, "enableSharpieLlmService");
        this.d = tmiVar;
        this.a = aoinVar;
        this.b = aoinVar2;
        this.c = yvpVar;
    }

    public final int a() {
        return ((java.lang.Boolean) this.b.a()).booleanValue() ? 309 : 237;
    }

    public final long b() {
        return this.c.a().a;
    }

    public final long c() {
        java.lang.Object objA = this.a.a();
        aooh.e(objA, "get(...)");
        return ((java.lang.Number) objA).longValue();
    }

    public final java.lang.Integer d() {
        return java.lang.Integer.valueOf((int) this.c.a().b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.yvi yviVar;
        if (aolnVar instanceof defpackage.yvi) {
            yviVar = (defpackage.yvi) aolnVar;
            int i = yviVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yviVar.c = i - Integer.MIN_VALUE;
            } else {
                yviVar = new defpackage.yvi(this, aolnVar);
            }
        } else {
            yviVar = new defpackage.yvi(this, aolnVar);
        }
        java.lang.Object objB = yviVar.a;
        aolu aoluVar = aolu.a;
        int i2 = yviVar.c;
        if (i2 == 0) {
            aooc.af(objB);
            tmi tmiVar = this.d;
            yviVar.c = 1;
            objB = tmiVar.b(yviVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objB);
        }
        return java.lang.Boolean.valueOf(((defpackage.yuw) objB).c.a);
    }

    public final /* synthetic */ void f() {
    }
}
