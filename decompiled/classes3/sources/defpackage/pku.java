package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pku extends amzm {
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

    public pku(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10, amzg amzgVar11, amzg amzgVar12, amzg amzgVar13) {
        super(amyzVar2, new defpackage.amzw(defpackage.pku.class), amyzVar);
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
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final android.content.Context context = (android.content.Context) list.get(0);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        final boolean zBooleanValue2 = ((java.lang.Boolean) list.get(2)).booleanValue();
        final boolean zBooleanValue3 = ((java.lang.Boolean) list.get(3)).booleanValue();
        final java.lang.String str = (java.lang.String) list.get(4);
        final boolean zBooleanValue4 = ((java.lang.Boolean) list.get(5)).booleanValue();
        final oko okoVar = (oko) list.get(6);
        final boolean zBooleanValue5 = ((java.lang.Boolean) list.get(7)).booleanValue();
        final j$.util.Optional optional = (j$.util.Optional) list.get(8);
        final php phpVar = (php) list.get(9);
        final java.lang.String str2 = (java.lang.String) list.get(10);
        final defpackage.zna znaVar = (defpackage.zna) list.get(11);
        return aiql.z((j$.util.Optional) ((mgu) list.get(12)).b(new java.util.function.Function() { // from class: pis
            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj2) {
                boolean z = zBooleanValue;
                android.content.Context context2 = context;
                defpackage.amdx amdxVar = (defpackage.amdx) obj2;
                if (z || zBooleanValue2) {
                    amdxVar.a = "EmergencyNumber";
                    return j$.util.Optional.of(context2.getString(2132018528));
                }
                if (zBooleanValue3) {
                    java.lang.String str3 = str;
                    amdxVar.a = "Conference";
                    return j$.util.Optional.of(str3);
                }
                if (zBooleanValue4) {
                    oko okoVar2 = okoVar;
                    amdxVar.a = "Voicemail";
                    return okoVar2.B();
                }
                java.lang.String str4 = str2;
                boolean z2 = zBooleanValue5;
                java.lang.Integer num = (java.lang.Integer) optional.orElse((java.lang.Object) null);
                if (z2 && num != null && phpVar.a.get() > 1) {
                    amdxVar.a = "Hidden";
                    return j$.util.Optional.of(context2.getString(2132020652, str4, num));
                }
                if (znaVar != defpackage.zna.ALLOWED) {
                    amdxVar.a = "Presentation";
                    return j$.util.Optional.of(str4);
                }
                amdxVar.a = "Empty";
                return j$.util.Optional.empty();
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$compose(this, function);
            }
        }).a(mfy.aK));
    }

    protected final ajcq c() {
        amzg amzgVar = this.n;
        amzg amzgVar2 = this.m;
        amzg amzgVar3 = this.l;
        amzg amzgVar4 = this.k;
        amzg amzgVar5 = this.j;
        amzg amzgVar6 = this.i;
        amzg amzgVar7 = this.h;
        amzg amzgVar8 = this.g;
        amzg amzgVar9 = this.f;
        amzg amzgVar10 = this.e;
        amzg amzgVar11 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar11.d(), amzgVar10.d(), amzgVar9.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
