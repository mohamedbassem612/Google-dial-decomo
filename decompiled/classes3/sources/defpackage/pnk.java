package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pnk extends amzm {
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

    public pnk(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10, amzg amzgVar11) {
        super(amyzVar2, new defpackage.amzw(defpackage.pnk.class), amyzVar);
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
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final defpackage.zpo zpoVar = (defpackage.zpo) list.get(0);
        final android.content.Context context = (android.content.Context) list.get(1);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        final j$.util.Optional optional = (j$.util.Optional) list.get(3);
        final j$.util.Optional optional2 = (j$.util.Optional) list.get(4);
        final j$.util.Optional optional3 = (j$.util.Optional) list.get(5);
        final j$.util.Optional optional4 = (j$.util.Optional) list.get(6);
        final boolean zBooleanValue2 = ((java.lang.Boolean) list.get(7)).booleanValue();
        final j$.util.Optional optional5 = (j$.util.Optional) list.get(8);
        final boolean zBooleanValue3 = ((java.lang.Boolean) list.get(9)).booleanValue();
        return aiql.z((j$.util.Optional) ((mgu) list.get(10)).b(new java.util.function.Function() { // from class: pni
            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj2) {
                defpackage.zpo zpoVar2 = zpoVar;
                android.content.Context context2 = context;
                defpackage.amdx amdxVar = (defpackage.amdx) obj2;
                if (zpoVar2 == defpackage.zpo.d && zBooleanValue) {
                    amdxVar.a = "Spam call";
                    return j$.util.Optional.of(defpackage.yee.b(context2));
                }
                if (zpoVar2 == defpackage.zpo.j) {
                    amdxVar.a = "Hanging up";
                    return j$.util.Optional.of(context2.getString(2132019062));
                }
                if (zpoVar2 == defpackage.zpo.g) {
                    j$.util.Optional optional6 = optional;
                    java.lang.CharSequence label = optional6.isPresent() ? ((android.telecom.DisconnectCause) optional6.orElseThrow()).getLabel() : null;
                    if (android.text.TextUtils.isEmpty(label)) {
                        label = context2.getString(2132019028);
                    }
                    amdxVar.a = label.toString();
                    return j$.util.Optional.of(label);
                }
                if (zBooleanValue3) {
                    amdxVar.a = "Emergency call";
                    return j$.util.Optional.empty();
                }
                j$.util.Optional optional7 = optional2;
                if (optional7.isPresent()) {
                    amdxVar.a = "Location";
                    return j$.util.Optional.of((java.lang.CharSequence) optional7.orElseThrow());
                }
                j$.util.Optional optional8 = optional3;
                if (optional8.isPresent()) {
                    j$.util.Optional optional9 = optional4;
                    if (optional9.isPresent()) {
                        amdxVar.a = "Callee ID";
                        return j$.util.Optional.of(pez.aq(context2, android.text.TextUtils.concat(((defpackage.abvz) optional9.orElseThrow()).d, " ", (java.lang.CharSequence) optional8.orElseThrow())));
                    }
                    if (!zBooleanValue2) {
                        j$.util.Optional optional10 = optional5;
                        if (optional10.isPresent()) {
                            amdxVar.a = "Display number with number label";
                            return j$.util.Optional.of(pez.aq(context2, android.text.TextUtils.concat((java.lang.CharSequence) optional10.orElseThrow(), " ", (java.lang.CharSequence) optional8.orElseThrow())));
                        }
                        amdxVar.a = "Display number without number label";
                        return j$.util.Optional.of(pez.aq(context2, (java.lang.CharSequence) optional8.orElseThrow()));
                    }
                }
                amdxVar.a = "Empty";
                return j$.util.Optional.empty();
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$compose(this, function);
            }
        }).a(mfy.cC));
    }

    protected final ajcq c() {
        amzg amzgVar = this.l;
        amzg amzgVar2 = this.k;
        amzg amzgVar3 = this.j;
        amzg amzgVar4 = this.i;
        amzg amzgVar5 = this.h;
        amzg amzgVar6 = this.g;
        amzg amzgVar7 = this.f;
        amzg amzgVar8 = this.e;
        amzg amzgVar9 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar9.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
