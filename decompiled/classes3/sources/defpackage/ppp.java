package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ppp extends amzm {
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
    private final amzg q;

    public ppp(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10, amzg amzgVar11, amzg amzgVar12, amzg amzgVar13, amzg amzgVar14, amzg amzgVar15, amzg amzgVar16) {
        super(amyzVar2, new defpackage.amzw(defpackage.ppp.class), amyzVar);
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
        this.q = amzs.b(amzgVar16);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final defpackage.zpo zpoVar = (defpackage.zpo) list.get(0);
        final android.content.Context context = (android.content.Context) list.get(1);
        final j$.util.Optional optional = (j$.util.Optional) list.get(2);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(3)).booleanValue();
        final j$.util.Optional optional2 = (j$.util.Optional) list.get(4);
        final j$.util.Optional optional3 = (j$.util.Optional) list.get(5);
        final java.lang.CharSequence charSequence = (java.lang.CharSequence) list.get(6);
        final j$.util.Optional optional4 = (j$.util.Optional) list.get(7);
        final boolean zBooleanValue2 = ((java.lang.Boolean) list.get(8)).booleanValue();
        final j$.util.Optional optional5 = (j$.util.Optional) list.get(9);
        final j$.util.Optional optional6 = (j$.util.Optional) list.get(10);
        final boolean zBooleanValue3 = ((java.lang.Boolean) list.get(11)).booleanValue();
        final j$.util.Optional optional7 = (j$.util.Optional) list.get(12);
        final boolean zBooleanValue4 = ((java.lang.Boolean) list.get(13)).booleanValue();
        final j$.util.Optional optional8 = (j$.util.Optional) list.get(14);
        return aiql.z((j$.util.Optional) ((mgu) list.get(15)).b(new java.util.function.Function() { // from class: ppf
            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$andThen(this, function);
            }

            /* JADX WARN: Code duplicated, block: B:46:0x00f5  */
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj2) {
                j$.util.Optional optionalOf;
                defpackage.amdx amdxVar = (defpackage.amdx) obj2;
                j$.util.Optional optional9 = optional4;
                if (optional9.isPresent() && ((omy) optional9.orElseThrow()).a.isPresent()) {
                    amdxVar.a = "Fides contact grid info";
                    return ((omy) optional9.orElseThrow()).a;
                }
                j$.util.Optional optional10 = optional2;
                boolean z = zBooleanValue;
                j$.util.Optional optional11 = optional7;
                boolean z2 = zBooleanValue3;
                defpackage.zpo zpoVar2 = zpoVar;
                if (zpoVar2 == defpackage.zpo.d) {
                    j$.util.Optional optional12 = optional;
                    java.lang.CharSequence charSequenceConcat = optional12.isPresent() ? (java.lang.CharSequence) optional12.orElseThrow() : null;
                    if (z2 && optional11.isPresent()) {
                        amdxVar.a = "Should show validation, validation prefix present on ringing call";
                        charSequenceConcat = pez.V((java.lang.String) optional11.orElseThrow(), j$.util.Optional.ofNullable(charSequenceConcat));
                    }
                    if (z) {
                        amdxVar.a = "Should show phone number";
                        charSequenceConcat = charSequenceConcat == null ? (java.lang.CharSequence) optional10.orElseThrow() : android.text.TextUtils.concat(charSequenceConcat, " ", (java.lang.CharSequence) optional10.orElseThrow());
                    }
                    return j$.util.Optional.ofNullable(charSequenceConcat);
                }
                j$.util.Optional optional13 = optional3;
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                if (optional13.isPresent()) {
                    amdxVar.a = "Label for video request";
                    optionalOf = optional13;
                } else {
                    android.content.Context context2 = context;
                    if (zpoVar2 == defpackage.zpo.k) {
                        amdxVar.a = "Pulling call";
                        optionalOf = j$.util.Optional.of(context2.getString(2132019102));
                    } else if (zpoVar2 == defpackage.zpo.c || zpoVar2 == defpackage.zpo.i) {
                        java.lang.CharSequence charSequence2 = charSequence;
                        amdxVar.a = "Label for dialing";
                        optionalOf = j$.util.Optional.of(charSequence2);
                    } else {
                        defpackage.zpo zpoVar3 = defpackage.zpo.f;
                        if (zpoVar2 == zpoVar3 && zBooleanValue2) {
                            amdxVar.a = "On hold";
                            optionalOf = j$.util.Optional.of(context2.getString(2132019029));
                        } else {
                            if (zpoVar2.equals(defpackage.zpo.e)) {
                                j$.util.Optional optionalOfNullable = optional8;
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.pzp) optionalOfNullable.get()).equals(defpackage.pzp.VOICE_SCREEN)));
                                }
                                if (((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                                    amdxVar.a = "On hold";
                                    optionalOf = j$.util.Optional.of(context2.getString(2132019029));
                                }
                            }
                            if (zpoVar2 == zpoVar3 && z) {
                                amdxVar.a = "Showing display number";
                                java.util.function.Function functionIdentity = j$.util.function.Function.-CC.identity();
                                functionIdentity.getClass();
                                optionalOf = true != optional10.isPresent() ? optional10 : j$.util.Optional.ofNullable(aa$.ExternalSyntheticApiModelOutline1.m(functionIdentity, optional10.get()));
                            } else {
                                j$.util.Optional optional14 = optional5;
                                if (optional14.isPresent()) {
                                    boolean z3 = zBooleanValue4;
                                    j$.util.Optional optional15 = optional6;
                                    amdxVar.a = "Showing connection label";
                                    optionalOf = j$.util.Optional.of(pez.X((java.lang.String) optional14.orElseThrow(), optional15, z3));
                                } else {
                                    optionalOf = optionalEmpty;
                                }
                            }
                        }
                    }
                }
                if (!z2 || !optional11.isPresent()) {
                    return optionalOf;
                }
                amdxVar.a = "Validation on non-ringing call";
                return j$.util.Optional.of(pez.V((java.lang.String) optional11.orElseThrow(), optionalOf));
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$compose(this, function);
            }
        }).a(mfy.cG));
    }

    protected final ajcq c() {
        amzg amzgVar = this.q;
        amzg amzgVar2 = this.p;
        amzg amzgVar3 = this.o;
        amzg amzgVar4 = this.n;
        amzg amzgVar5 = this.m;
        amzg amzgVar6 = this.l;
        amzg amzgVar7 = this.k;
        amzg amzgVar8 = this.j;
        amzg amzgVar9 = this.i;
        amzg amzgVar10 = this.h;
        amzg amzgVar11 = this.g;
        amzg amzgVar12 = this.f;
        amzg amzgVar13 = this.e;
        amzg amzgVar14 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar14.d(), amzgVar13.d(), amzgVar12.d(), amzgVar11.d(), amzgVar10.d(), amzgVar9.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
