package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class poe extends amzm {
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
    private final amyz m;
    private final amzg n;

    public poe(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10, amzg amzgVar11, amyz amyzVar3, amzg amzgVar12) {
        super(amyzVar2, new defpackage.amzw(defpackage.poe.class), amyzVar);
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
        this.m = amyzVar3;
        this.n = amzs.b(amzgVar12);
    }

    /* JADX WARN: Type inference failed for: r1v40, types: [aonj, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final defpackage.zpo zpoVar = (defpackage.zpo) list.get(0);
        final android.content.Context context = (android.content.Context) list.get(1);
        final j$.util.Optional optional = (j$.util.Optional) list.get(2);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(3)).booleanValue();
        final boolean zBooleanValue2 = ((java.lang.Boolean) list.get(4)).booleanValue();
        final j$.util.Optional optional2 = (j$.util.Optional) list.get(5);
        final j$.util.Optional optional3 = (j$.util.Optional) list.get(6);
        final java.lang.CharSequence charSequence = (java.lang.CharSequence) list.get(7);
        final j$.util.Optional optional4 = (j$.util.Optional) list.get(8);
        final boolean zBooleanValue3 = ((java.lang.Boolean) list.get(9)).booleanValue();
        final j$.util.Optional optional5 = (j$.util.Optional) list.get(10);
        mgu mguVar = (mgu) list.get(11);
        aooh.f(zpoVar, "callState");
        aooh.f(context, "context");
        aooh.f(optional, "labelForIncomingOptional");
        aooh.f(optional2, "displayNumber");
        aooh.f(optional3, "labelForVideoRequest");
        aooh.f(charSequence, "labelForDialing");
        aooh.f(optional4, "disconnectCause");
        aooh.f(optional5, "validationPrefix");
        aooh.f(mguVar, "recorder");
        final amyz amyzVar = this.m;
        java.lang.Object objA = mguVar.b(new java.util.function.Function() { // from class: pnz
            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$andThen(this, function);
            }

            /* JADX WARN: Type inference failed for: r2v10, types: [aonj, java.lang.Object] */
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj2) {
                j$.util.Optional optionalOf;
                java.lang.String string;
                android.content.Context context2 = context;
                defpackage.amdx amdxVar = (defpackage.amdx) obj2;
                defpackage.zpo zpoVar2 = zpoVar;
                defpackage.zpo zpoVar3 = defpackage.zpo.d;
                if (zpoVar2 == zpoVar3 && zBooleanValue2) {
                    amdxVar.a = "Spam call";
                    return j$.util.Optional.of(defpackage.yee.b(context2));
                }
                j$.util.Optional optionalOfNullable = optional2;
                boolean z = zBooleanValue;
                j$.util.Optional optional6 = optional5;
                boolean z2 = zBooleanValue3;
                if (zpoVar2 == zpoVar3) {
                    j$.util.Optional optionalOf2 = optional;
                    if (z2 && optional6.isPresent()) {
                        amdxVar.a = "Should show validation, validation prefix present on ringing call";
                        optionalOf2 = j$.util.Optional.of(pez.V((java.lang.String) optional6.orElseThrow(), optionalOf2));
                        aooh.e(optionalOf2, "of(...)");
                    }
                    if (!z) {
                        return optionalOf2;
                    }
                    amdxVar.a = "Should show phone number";
                    if (optionalOf2.isEmpty()) {
                        string = (java.lang.String) optionalOfNullable.orElseThrow();
                    } else {
                        java.lang.Object objOrElseThrow = optionalOf2.orElseThrow();
                        java.lang.Object objOrElseThrow2 = optionalOfNullable.orElseThrow();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(objOrElseThrow);
                        sb.append(' ');
                        sb.append(objOrElseThrow2);
                        string = sb.toString();
                    }
                    j$.util.Optional optionalOf3 = j$.util.Optional.of(string);
                    aooh.e(optionalOf3, "of(...)");
                    return optionalOf3;
                }
                j$.util.Optional optional7 = optional3;
                if (optional7.isPresent()) {
                    amdxVar.a = "Label for video request";
                    optionalOf = optional7;
                } else if (zpoVar2 == defpackage.zpo.j) {
                    amdxVar.a = "Hanging up";
                    optionalOf = j$.util.Optional.of(context2.getString(2132019062));
                    aooh.c(optionalOf);
                } else if (zpoVar2 == defpackage.zpo.g) {
                    j$.util.Optional optionalOfNullable2 = optional4;
                    amdxVar.a = "Call disconnected";
                    defpackage.pnh pnhVar = new defpackage.pnh(new defpackage.pmu(9), 3);
                    if (true == optionalOfNullable2.isPresent()) {
                        optionalOfNullable2 = j$.util.Optional.ofNullable(pnhVar.a.a(optionalOfNullable2.get()));
                    }
                    aoin aoinVar = amyzVar;
                    aooh.e(optionalOfNullable2, "map(...)");
                    java.lang.CharSequence string2 = (java.lang.CharSequence) aooh.q(optionalOfNullable2);
                    if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                        if (string2 == null || string2.length() == 0) {
                            string2 = context2.getString(2132019028);
                            aooh.c(string2);
                        }
                    } else if (string2 == null) {
                        string2 = context2.getString(2132019028);
                        aooh.e(string2, "getString(...)");
                    }
                    optionalOf = j$.util.Optional.of(string2);
                    aooh.c(optionalOf);
                } else if (zpoVar2 == defpackage.zpo.k) {
                    amdxVar.a = "Pulling call";
                    optionalOf = j$.util.Optional.of(context2.getString(2132019102));
                    aooh.c(optionalOf);
                } else if (zpoVar2 == defpackage.zpo.c || zpoVar2 == defpackage.zpo.i) {
                    java.lang.CharSequence charSequence2 = charSequence;
                    amdxVar.a = "Label for dialing";
                    optionalOf = j$.util.Optional.of(charSequence2);
                    aooh.c(optionalOf);
                } else if (zpoVar2 == defpackage.zpo.f && z) {
                    amdxVar.a = "Showing display number";
                    if (true == optionalOfNullable.isPresent()) {
                        optionalOfNullable = j$.util.Optional.ofNullable((java.lang.String) optionalOfNullable.get());
                    }
                    aooh.c(optionalOfNullable);
                    optionalOf = optionalOfNullable;
                } else {
                    optionalOf = j$.util.Optional.empty();
                    aooh.e(optionalOf, "empty(...)");
                }
                if (!z2 || !optional6.isPresent()) {
                    return optionalOf;
                }
                amdxVar.a = "Validation on non-ringing call";
                return j$.util.Optional.of(pez.V((java.lang.String) optional6.orElseThrow(), optionalOf));
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$compose(this, function);
            }
        }).a(mfy.cG);
        aooh.e(objA, "to(...)");
        j$.util.Optional optionalOfNullable = (j$.util.Optional) objA;
        defpackage.pnh pnhVar = new defpackage.pnh(new defpackage.qji(context, 1), 4);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(pnhVar.a.a(optionalOfNullable.get()));
        }
        aooh.e(optionalOfNullable, "map(...)");
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        amzg amzgVar = this.n;
        amzg amzgVar2 = this.l;
        amzg amzgVar3 = this.k;
        amzg amzgVar4 = this.j;
        amzg amzgVar5 = this.i;
        amzg amzgVar6 = this.h;
        amzg amzgVar7 = this.g;
        amzg amzgVar8 = this.f;
        amzg amzgVar9 = this.e;
        amzg amzgVar10 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar10.d(), amzgVar9.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
