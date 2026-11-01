package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class achl implements defpackage.adzf {
    private final defpackage.acgs a;
    private final defpackage.aoin b;
    private final defpackage.amwu c;
    private final java.lang.String d;
    private final long e;

    static {
        defpackage.aiof.i("GnpSdk");
    }

    public achl(defpackage.acgs acgsVar, defpackage.aoin aoinVar, defpackage.amwu amwuVar) {
        defpackage.aooh.f(aoinVar, "growthkitEnabled");
        defpackage.aooh.f(amwuVar, "gnpJobSchedulingApi");
        this.a = acgsVar;
        this.b = aoinVar;
        this.c = amwuVar;
        this.d = "GK_STORAGE_CLEANUP";
        this.e = defpackage.anfw.a.eZ().c();
    }

    @Override // defpackage.adzf
    public final int a() {
        return 13;
    }

    @Override // defpackage.adzf
    public final long b() {
        return this.e;
    }

    @Override // defpackage.adzf
    public final java.lang.Long c() {
        return 30000L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.adzf
    public final java.lang.Object d(android.os.Bundle bundle, defpackage.aoln aolnVar) {
        achk achkVar;
        if (aolnVar instanceof achk) {
            achkVar = (achk) aolnVar;
            int i = achkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                achkVar.c = i - Integer.MIN_VALUE;
            } else {
                achkVar = new achk(this, aolnVar);
            }
        } else {
            achkVar = new achk(this, aolnVar);
        }
        java.lang.Object obj = achkVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = achkVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj);
            }
            return new defpackage.adub(defpackage.aojh.a);
        }
        defpackage.aooc.af(obj);
        defpackage.acgs acgsVar = this.a;
        achkVar.c = 1;
        if (acgsVar.a(achkVar) == aoluVar) {
            return aoluVar;
        }
        if (!((java.lang.Boolean) this.b.a()).booleanValue()) {
            java.lang.Object objA = this.c.a();
            defpackage.aooh.e(objA, "get(...)");
            achkVar.c = 2;
            if (((defpackage.adzh) objA).a(13, achkVar) == aoluVar) {
                return aoluVar;
            }
        }
        return new defpackage.adub(defpackage.aojh.a);
    }

    @Override // defpackage.adzf
    public final java.lang.String e() {
        return this.d;
    }

    @Override // defpackage.adzf
    public final boolean f() {
        return true;
    }

    @Override // defpackage.adzf
    public final boolean g() {
        return false;
    }

    @Override // defpackage.adzf
    public final int h() {
        return 2;
    }

    @Override // defpackage.adzf
    public final void i() {
    }

    @Override // defpackage.adzf
    public final /* synthetic */ void j() {
    }
}
