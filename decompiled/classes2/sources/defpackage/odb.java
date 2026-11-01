package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class odb extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    java.lang.Object f;
    int g;
    final /* synthetic */ defpackage.odl h;
    final /* synthetic */ android.content.Context i;
    final /* synthetic */ aoin j;
    final /* synthetic */ j$.util.Optional k;
    final /* synthetic */ j$.util.Optional l;
    final /* synthetic */ defpackage.ocu m;
    final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odb(defpackage.odl odlVar, android.content.Context context, aoin aoinVar, j$.util.Optional optional, j$.util.Optional optional2, defpackage.ocu ocuVar, boolean z, aoln aolnVar) {
        super(2, aolnVar);
        this.h = odlVar;
        this.i = context;
        this.j = aoinVar;
        this.k = optional;
        this.l = optional2;
        this.m = ocuVar;
        this.n = z;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        java.lang.Object obj2;
        java.lang.String str;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        defpackage.oaf oafVar;
        aolu aoluVar = aolu.a;
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                obj5 = this.f;
                obj6 = this.e;
                obj7 = this.d;
                obj2 = this.c;
                obj4 = this.b;
                obj3 = this.a;
                aooc.af(obj);
            } else {
                aooc.af(obj);
            }
            boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
            akzx akzxVar = (akzx) ((defpackage.nwj) obj5).a;
            akzxVar.u();
            defpackage.nzp nzpVar = (defpackage.nzp) akzxVar.b;
            defpackage.nzp nzpVar2 = defpackage.nzp.a;
            nzpVar.b |= 64;
            nzpVar.i = zBooleanValue;
            aooh.f(obj3, "value");
            akzx akzxVar2 = (akzx) ((defpackage.nwj) obj6).a;
            akzxVar2.u();
            defpackage.nzp nzpVar3 = (defpackage.nzp) akzxVar2.b;
            j$.util.Objects.requireNonNull(obj3);
            nzpVar3.b |= 8;
            nzpVar3.f = (java.lang.String) obj3;
            aooh.f(obj4, "value");
            akzxVar2.u();
            defpackage.nzp nzpVar4 = (defpackage.nzp) akzxVar2.b;
            j$.util.Objects.requireNonNull(obj4);
            nzpVar4.b |= 128;
            nzpVar4.j = (java.lang.String) obj4;
            aooh.f(obj2, "value");
            akzxVar2.u();
            defpackage.nzp nzpVar5 = (defpackage.nzp) akzxVar2.b;
            j$.util.Objects.requireNonNull(obj2);
            nzpVar5.b |= 256;
            nzpVar5.k = (java.lang.String) obj2;
            alad aladVarP = ((akzx) ((defpackage.nwj) obj7).a).p();
            aooh.e(aladVarP, "build(...)");
            final boolean z = this.n;
            return new pgi((defpackage.nzp) aladVarP, new aomy() { // from class: oda
                public final java.lang.Object a() {
                    return java.lang.Boolean.valueOf(z);
                }
            }, (byte[]) null);
        }
        aooc.af(obj);
        defpackage.odl odlVar = this.h;
        this.g = 1;
        obj = odlVar.a(this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        defpackage.odi odiVar = (defpackage.odi) obj;
        defpackage.oce oceVar = odiVar != null ? odiVar.b : null;
        if (oceVar == null) {
            str = "";
            obj2 = "";
            obj4 = obj2;
            obj3 = obj4;
        } else {
            int iOrdinal = oceVar.ordinal();
            if (iOrdinal == 0) {
                android.content.Context context = this.i;
                string = context.getString(2132020002);
                aooh.e(string, "getString(...)");
                string2 = context.getString(2132020003);
                aooh.e(string2, "getString(...)");
                string3 = context.getString(2132020006);
                aooh.e(string3, "getString(...)");
                if (((java.lang.Boolean) this.j.a()).booleanValue()) {
                    string4 = context.getString(2132020005);
                    aooh.c(string4);
                } else {
                    string4 = context.getString(2132020004);
                    aooh.c(string4);
                }
            } else {
                if (iOrdinal != 1) {
                    throw new aois();
                }
                android.content.Context context2 = this.i;
                string = context2.getString(2132019995);
                aooh.e(string, "getString(...)");
                string2 = context2.getString(2132019996);
                aooh.e(string2, "getString(...)");
                string3 = context2.getString(2132019998);
                aooh.e(string3, "getString(...)");
                string4 = context2.getString(2132019997);
                aooh.e(string4, "getString(...)");
            }
            java.lang.String str2 = string;
            obj2 = string4;
            str = str2;
            java.lang.String str3 = string3;
            obj3 = string2;
            obj4 = str3;
        }
        if (((defpackage.oag) aooh.q(this.k)) != null && (oafVar = (defpackage.oaf) aooh.q(this.l)) != null) {
            oafVar.b();
        }
        defpackage.ocu ocuVar = this.m;
        akzx akzxVarM = defpackage.nzp.a.m();
        aooh.f(akzxVarM, "builder");
        defpackage.nwj nwjVar = new defpackage.nwj(akzxVarM);
        akzx akzxVar3 = (akzx) nwjVar.a;
        akzxVar3.u();
        defpackage.nzp nzpVar6 = (defpackage.nzp) akzxVar3.b;
        nzpVar6.c = 3;
        nzpVar6.b |= 1;
        akzxVar3.u();
        defpackage.nzp nzpVar7 = (defpackage.nzp) akzxVar3.b;
        nzpVar7.b |= 2;
        nzpVar7.d = 2131231299;
        aooh.f(str, "value");
        akzxVar3.u();
        defpackage.nzp nzpVar8 = (defpackage.nzp) akzxVar3.b;
        j$.util.Objects.requireNonNull(str);
        nzpVar8.b |= 4;
        nzpVar8.e = str;
        akzxVar3.u();
        defpackage.nzp nzpVar9 = (defpackage.nzp) akzxVar3.b;
        nzpVar9.b |= 32;
        nzpVar9.h = false;
        this.a = obj3;
        this.b = obj4;
        this.c = obj2;
        this.d = nwjVar;
        this.e = nwjVar;
        this.f = nwjVar;
        this.g = 2;
        obj = aoov.aj(ocuVar.c, new defpackage.hnj(ocuVar, (aoln) null, 19), this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        obj5 = nwjVar;
        obj6 = obj5;
        obj7 = obj6;
        boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
        akzx akzxVar4 = (akzx) ((defpackage.nwj) obj5).a;
        akzxVar4.u();
        defpackage.nzp nzpVar10 = (defpackage.nzp) akzxVar4.b;
        defpackage.nzp nzpVar11 = defpackage.nzp.a;
        nzpVar10.b |= 64;
        nzpVar10.i = zBooleanValue2;
        aooh.f(obj3, "value");
        akzx akzxVar5 = (akzx) ((defpackage.nwj) obj6).a;
        akzxVar5.u();
        defpackage.nzp nzpVar12 = (defpackage.nzp) akzxVar5.b;
        j$.util.Objects.requireNonNull(obj3);
        nzpVar12.b |= 8;
        nzpVar12.f = (java.lang.String) obj3;
        aooh.f(obj4, "value");
        akzxVar5.u();
        defpackage.nzp nzpVar13 = (defpackage.nzp) akzxVar5.b;
        j$.util.Objects.requireNonNull(obj4);
        nzpVar13.b |= 128;
        nzpVar13.j = (java.lang.String) obj4;
        aooh.f(obj2, "value");
        akzxVar5.u();
        defpackage.nzp nzpVar14 = (defpackage.nzp) akzxVar5.b;
        j$.util.Objects.requireNonNull(obj2);
        nzpVar14.b |= 256;
        nzpVar14.k = (java.lang.String) obj2;
        alad aladVarP2 = ((akzx) ((defpackage.nwj) obj7).a).p();
        aooh.e(aladVarP2, "build(...)");
        final boolean z2 = this.n;
        return new pgi((defpackage.nzp) aladVarP2, new aomy() { // from class: oda
            public final java.lang.Object a() {
                return java.lang.Boolean.valueOf(z2);
            }
        }, (byte[]) null);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.odb(this.h, this.i, this.j, this.k, this.l, this.m, this.n, aolnVar);
    }
}
