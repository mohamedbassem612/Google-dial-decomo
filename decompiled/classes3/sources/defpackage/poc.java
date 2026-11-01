package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class poc extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;
    private final amzg j;
    private final amzg k;
    private final amzg l;
    private final amzg m;
    private final amzg n;
    private final amzg o;
    private final amzg p;

    public poc(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10, amzg amzgVar11, amzg amzgVar12, amzg amzgVar13, amzg amzgVar14, amzg amzgVar15) {
        super(amyzVar2, new defpackage.amzw(defpackage.poc.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
        this.j = amzs.b(amzgVar9);
        this.k = amzs.b(amzgVar10);
        this.l = amzs.b(amzgVar11);
        this.m = amzs.b(amzgVar12);
        this.n = amzs.b(amzgVar13);
        this.o = amzs.b(amzgVar14);
        this.p = amzs.b(amzgVar15);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [aonj, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final defpackage.zpo zpoVar = (defpackage.zpo) list.get(0);
        final android.content.Context context = (android.content.Context) list.get(1);
        final j$.util.Optional optional = (j$.util.Optional) list.get(2);
        final j$.util.Optional optional2 = (j$.util.Optional) list.get(3);
        final j$.util.Optional optional3 = (j$.util.Optional) list.get(4);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(5)).booleanValue();
        final j$.util.Optional optional4 = (j$.util.Optional) list.get(6);
        final boolean zBooleanValue2 = ((java.lang.Boolean) list.get(7)).booleanValue();
        final boolean zBooleanValue3 = ((java.lang.Boolean) list.get(8)).booleanValue();
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(9);
        final j$.util.Optional optional5 = (j$.util.Optional) list.get(10);
        final j$.util.Optional optional6 = (j$.util.Optional) list.get(11);
        final boolean zBooleanValue4 = ((java.lang.Boolean) list.get(12)).booleanValue();
        mgu mguVar = (mgu) list.get(13);
        final j$.util.Optional optional7 = (j$.util.Optional) list.get(14);
        aooh.f(zpoVar, "callState");
        aooh.f(context, "context");
        aooh.f(optional, "location");
        aooh.f(optional2, "displayNumber");
        aooh.f(optional3, "calleeId");
        aooh.f(optional4, "numberLabel");
        aooh.f(optionalOfNullable, "selectedInCallScreenKey");
        aooh.f(optional5, "connectionLabel");
        aooh.f(optional6, "simColor");
        aooh.f(mguVar, "recorder");
        aooh.f(optional7, "fidesContactGridInfo");
        defpackage.pnh pnhVar = new defpackage.pnh(new defpackage.pmu(10), 5);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(a.k((aonj) pnhVar.a, optionalOfNullable.get()));
        }
        java.lang.Object objOrElse = optionalOfNullable.orElse(java.lang.Boolean.FALSE);
        aooh.e(objOrElse, "orElse(...)");
        final boolean zBooleanValue5 = ((java.lang.Boolean) objOrElse).booleanValue();
        j$.util.Optional optionalOfNullable2 = (j$.util.Optional) mguVar.b(new java.util.function.Function() { // from class: poa
            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj2) {
                defpackage.amdx amdxVar = (defpackage.amdx) obj2;
                defpackage.zpo zpoVar2 = zpoVar;
                defpackage.zpo zpoVar3 = defpackage.zpo.f;
                if ((zpoVar2 == zpoVar3 && zBooleanValue3) || (zpoVar2 == defpackage.zpo.e && zBooleanValue5)) {
                    android.content.Context context2 = context;
                    amdxVar.a = "On hold";
                    return j$.util.Optional.of(context2.getString(2132019029));
                }
                if (zBooleanValue2) {
                    amdxVar.a = "Emergency call";
                    return j$.util.Optional.empty();
                }
                j$.util.Optional optional8 = optional7;
                if (optional8.isPresent() && ((omy) optional8.orElseThrow()).a.isPresent()) {
                    amdxVar.a = "Fides contact grid info";
                    return ((omy) optional8.orElseThrow()).a;
                }
                j$.util.Optional optional9 = optional5;
                if (optional9.isPresent() && zpoVar2 == zpoVar3) {
                    boolean z = zBooleanValue4;
                    j$.util.Optional optional10 = optional6;
                    amdxVar.a = "Showing connection label";
                    return j$.util.Optional.of(pez.X((java.lang.String) optional9.orElseThrow(), optional10, z));
                }
                j$.util.Optional optional11 = optional;
                if (optional11.isPresent()) {
                    amdxVar.a = "Location";
                    return j$.util.Optional.of(optional11.orElseThrow());
                }
                j$.util.Optional optional12 = optional2;
                if (optional12.isPresent()) {
                    j$.util.Optional optional13 = optional3;
                    if (optional13.isPresent()) {
                        amdxVar.a = "Callee ID";
                        return j$.util.Optional.of(((defpackage.abvz) optional13.orElseThrow()).d + ' ' + optional12.orElseThrow());
                    }
                    if (!zBooleanValue) {
                        j$.util.Optional optional14 = optional4;
                        if (!optional14.isPresent()) {
                            amdxVar.a = "Display number without number label";
                            return j$.util.Optional.of(optional12.orElseThrow());
                        }
                        amdxVar.a = "Display number with number label";
                        java.lang.Object objOrElseThrow = optional14.orElseThrow();
                        java.lang.Object objOrElseThrow2 = optional12.orElseThrow();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(objOrElseThrow);
                        sb.append(' ');
                        sb.append(objOrElseThrow2);
                        return j$.util.Optional.of(sb.toString());
                    }
                }
                amdxVar.a = "Empty";
                return j$.util.Optional.empty();
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$compose(this, function);
            }
        }).a(mfy.cC);
        defpackage.pnh pnhVar2 = new defpackage.pnh(new opy(context, 20), 2);
        if (true == optionalOfNullable2.isPresent()) {
            optionalOfNullable2 = j$.util.Optional.ofNullable(pnhVar2.a.a(optionalOfNullable2.get()));
        }
        aooh.e(optionalOfNullable2, "map(...)");
        return aiql.z(optionalOfNullable2);
    }

    protected final ajcq c() {
        amzg amzgVar = this.p;
        amzg amzgVar2 = this.o;
        amzg amzgVar3 = this.n;
        amzg amzgVar4 = this.m;
        amzg amzgVar5 = this.l;
        amzg amzgVar6 = this.k;
        amzg amzgVar7 = this.j;
        amzg amzgVar8 = this.i;
        amzg amzgVar9 = this.h;
        amzg amzgVar10 = this.g;
        amzg amzgVar11 = this.f;
        amzg amzgVar12 = this.e;
        amzg amzgVar13 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar13.d(), amzgVar12.d(), amzgVar11.d(), amzgVar10.d(), amzgVar9.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
