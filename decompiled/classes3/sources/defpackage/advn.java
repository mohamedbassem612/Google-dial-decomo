package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class advn extends aomh implements aonn {
    int a;
    final /* synthetic */ adzf b;
    final /* synthetic */ android.os.Bundle c;
    final /* synthetic */ defpackage.advp d;
    final /* synthetic */ java.lang.String e;
    final /* synthetic */ java.lang.String f;
    final /* synthetic */ long g;
    final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public advn(adzf adzfVar, android.os.Bundle bundle, defpackage.advp advpVar, java.lang.String str, java.lang.String str2, long j, boolean z, aoln aolnVar) {
        super(2, aolnVar);
        this.b = adzfVar;
        this.c = bundle;
        this.d = advpVar;
        this.e = str;
        this.f = str2;
        this.g = j;
        this.h = z;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        java.lang.String strName;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            aiof aiofVar = defpackage.advp.a;
            adzf adzfVar = this.b;
            android.os.Bundle bundle = this.c;
            this.a = 1;
            obj = adzfVar.d(bundle, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
        }
        defpackage.advp advpVar = this.d;
        java.lang.String str = this.e;
        java.lang.String str2 = this.f;
        long j = this.g;
        boolean z = this.h;
        defpackage.adua aduaVar = (adtz) obj;
        java.lang.String packageName = advpVar.b.getPackageName();
        aooh.e(packageName, "getPackageName(...)");
        java.lang.Object objA = advpVar.f.a();
        aooh.e(objA, "get(...)");
        aeey aeeyVar = (aeey) objA;
        aooh.f(aduaVar, "result");
        aooh.f(packageName, "packageName");
        aooh.f(aeeyVar, "clientStreamz");
        j$.util.Objects.checkIndex(0, 5);
        if (aduaVar != null) {
            boolean z2 = aduaVar instanceof adub;
            if (!z2) {
                if (aduaVar instanceof defpackage.adyk) {
                    defpackage.advp.a.b().k(((defpackage.adyk) aduaVar).a).I("Job finished with auth token recoverable failure. Job ID: '%s', key: '%s'", str, str2);
                } else if (aduaVar instanceof defpackage.adua) {
                    defpackage.advp.a.d().k(aduaVar.b()).I("Job finished with permanent failure. Job ID: '%s', key: '%s'", str, str2);
                } else if (aduaVar instanceof defpackage.adud) {
                    defpackage.advp.a.b().k(((defpackage.adud) aduaVar).b()).I("Job finished with transient failure. Job ID: '%s', key: '%s'", str, str2);
                }
            }
            aduu aduuVar = advpVar.e;
            int i2 = android.os.Build.VERSION.SDK_INT;
            java.lang.String strE = aduaVar.e();
            adty adtyVarC = aduaVar.c();
            if (adtyVarC == null || (strName = adtyVarC.name()) == null) {
                strName = "";
            }
            aeeyVar.e(packageName, aduuVar.a, i2, str2, strE, strName, z);
            advpVar.b(j, str2, aduaVar);
            boolean zG = this.b.g();
            j$.util.Objects.checkIndex(0, 4);
            if (z2) {
                return new gsf();
            }
            if (aduaVar instanceof defpackage.adud) {
                return zG ? new gse() : new gsd();
            }
            if (aduaVar instanceof defpackage.adua) {
                return new gsd();
            }
            throw new aois();
        }
        throw new aois();
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.advn(this.b, this.c, this.d, this.e, this.f, this.g, this.h, aolnVar);
    }
}
