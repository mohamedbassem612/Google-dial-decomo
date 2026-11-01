package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class nft extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ java.lang.String f;
    final /* synthetic */ abwd g;
    final /* synthetic */ defpackage.nmz h;
    final /* synthetic */ aoin i;
    final /* synthetic */ android.content.Context j;
    final /* synthetic */ aoin k;
    final /* synthetic */ defpackage.ogj l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nft(java.lang.String str, abwd abwdVar, defpackage.nmz nmzVar, aoin aoinVar, defpackage.ogj ogjVar, android.content.Context context, aoin aoinVar2, aoln aolnVar) {
        super(2, aolnVar);
        this.f = str;
        this.g = abwdVar;
        this.h = nmzVar;
        this.i = aoinVar;
        this.l = ogjVar;
        this.j = context;
        this.k = aoinVar2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [aoin] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        java.lang.Object obj2;
        ?? r3;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        int i;
        aolu aoluVar = aolu.a;
        if (this.e == 0) {
            aooc.af(obj);
            java.lang.String str = this.f;
            abwd abwdVar = this.g;
            defpackage.nmz nmzVar = this.h;
            aoin aoinVar = this.i;
            defpackage.ogj ogjVar = this.l;
            android.content.Context context = this.j;
            aoin aoinVar2 = this.k;
            akzx akzxVarM = defpackage.nic.a.m();
            aooh.f(akzxVarM, "builder");
            defpackage.npw npwVar = new defpackage.npw(akzxVarM);
            aooh.f(str, "value");
            akzx akzxVar = (akzx) npwVar.a;
            akzxVar.u();
            defpackage.nic nicVar = (defpackage.nic) akzxVar.b;
            j$.util.Objects.requireNonNull(str);
            nicVar.c = str;
            aooh.f(abwdVar, "value");
            akzxVar.u();
            defpackage.nic nicVar2 = (defpackage.nic) akzxVar.b;
            j$.util.Objects.requireNonNull(abwdVar);
            nicVar2.d = abwdVar;
            nicVar2.b |= 1;
            if (nmzVar instanceof defpackage.nmx) {
                npwVar.P(((defpackage.nmx) nmzVar).a);
            } else if (nmzVar instanceof defpackage.nmy) {
                defpackage.nmy nmyVar = (defpackage.nmy) nmzVar;
                npwVar.P(nmyVar.a);
                boolean z = nmyVar.b;
                akzxVar.u();
                defpackage.nic nicVar3 = (defpackage.nic) akzxVar.b;
                nicVar3.b |= 4;
                nicVar3.f = z;
            } else if (!aooh.n(nmzVar, defpackage.nmw.a)) {
                throw new aois();
            }
            obj4 = npwVar;
            if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                this.a = context;
                this.b = aoinVar2;
                this.c = npwVar;
                this.d = npwVar;
                this.e = 1;
                obj = ogjVar.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                obj2 = context;
                r3 = aoinVar2;
                defpackage.npw npwVar2 = npwVar;
                obj3 = npwVar2;
                obj5 = npwVar2;
            }
            alad aladVarP = ((akzx) ((defpackage.npw) obj4).a).p();
            aooh.e(aladVarP, "build(...)");
            j$.util.Optional optionalOf = j$.util.Optional.of((defpackage.nic) aladVarP);
            aooh.e(optionalOf, "of(...)");
            return optionalOf;
        }
        java.lang.Object obj6 = this.d;
        java.lang.Object obj7 = this.c;
        java.lang.Object obj8 = this.b;
        obj2 = this.a;
        aooc.af(obj);
        obj5 = obj6;
        obj3 = obj7;
        r3 = obj8;
        defpackage.nmn nmnVarB = defpackage.nmn.b(((defpackage.nmu) obj).A);
        if (nmnVarB == null) {
            nmnVarB = defpackage.nmn.UNRECOGNIZED;
        }
        switch (nmnVarB.ordinal()) {
            case 1:
                i = 2132017814;
                break;
            case 2:
                i = 2132017816;
                break;
            case 3:
                i = 2132017813;
                break;
            case 4:
                i = 2132017812;
                break;
            case 5:
                i = 2132017817;
                break;
            case 6:
                i = 2132017818;
                break;
            case 7:
                i = 2132017819;
                break;
            case 8:
                i = 2132017815;
                break;
            default:
                i = 2132018365;
                break;
        }
        java.lang.String string = ((android.content.Context) obj2).getString(i);
        aooh.e(string, "getString(...)");
        aooh.f(string, "value");
        akzx akzxVar2 = (akzx) ((defpackage.npw) obj5).a;
        akzxVar2.u();
        defpackage.nic nicVar4 = (defpackage.nic) akzxVar2.b;
        defpackage.nic nicVar5 = defpackage.nic.a;
        j$.util.Objects.requireNonNull(string);
        nicVar4.b |= 8;
        nicVar4.g = string;
        java.lang.Object objA = r3.a();
        aooh.e(objA, "get(...)");
        boolean zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
        akzxVar2.u();
        defpackage.nic nicVar6 = (defpackage.nic) akzxVar2.b;
        nicVar6.b |= 16;
        nicVar6.h = zBooleanValue;
        obj4 = obj3;
        alad aladVarP2 = ((akzx) ((defpackage.npw) obj4).a).p();
        aooh.e(aladVarP2, "build(...)");
        j$.util.Optional optionalOf2 = j$.util.Optional.of((defpackage.nic) aladVarP2);
        aooh.e(optionalOf2, "of(...)");
        return optionalOf2;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.nft(this.f, this.g, this.h, this.i, this.l, this.j, this.k, aolnVar);
    }
}
