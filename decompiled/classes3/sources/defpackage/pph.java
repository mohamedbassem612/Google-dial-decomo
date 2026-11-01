package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pph extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;

    public pph(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7) {
        super(amyzVar2, new defpackage.amzw(defpackage.pph.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final j$.util.Optional optional = (j$.util.Optional) list.get(0);
        final android.content.Context context = (android.content.Context) list.get(1);
        final j$.util.Optional optional2 = (j$.util.Optional) list.get(2);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(3)).booleanValue();
        final boolean zBooleanValue2 = ((java.lang.Boolean) list.get(4)).booleanValue();
        final boolean zBooleanValue3 = ((java.lang.Boolean) list.get(5)).booleanValue();
        return aiql.z((java.lang.CharSequence) ((mgu) list.get(6)).b(new java.util.function.Function() { // from class: ppe
            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj2) {
                hue hueVar;
                j$.util.Optional optional3 = optional;
                boolean z = zBooleanValue;
                boolean z2 = zBooleanValue2;
                android.content.Context context2 = context;
                j$.util.Optional optional4 = optional2;
                defpackage.amdx amdxVar = (defpackage.amdx) obj2;
                if (optional4.isPresent() && !z) {
                    java.lang.CharSequence charSequence = (java.lang.CharSequence) optional4.orElseThrow();
                    hueVar = z2 ? (hue) optional3.orElse((java.lang.Object) null) : null;
                    if (hueVar == null) {
                        return charSequence;
                    }
                    java.lang.String strValueOf = java.lang.String.valueOf(hueVar.e);
                    amdxVar.a = "Using assisted dialed extras.";
                    return android.text.TextUtils.concat(charSequence, " • ", context2.getString(2132019035, strValueOf, hueVar.c));
                }
                if (zBooleanValue3) {
                    amdxVar.a = "Is video call.";
                    return z ? context2.getString(2132019108) : context2.getString(2132019106);
                }
                hueVar = z2 ? (hue) optional3.orElse((java.lang.Object) null) : null;
                if (hueVar != null) {
                    return context2.getString(2132019034, java.lang.String.valueOf(hueVar.e), hueVar.c);
                }
                amdxVar.a = "Calling...";
                return context2.getString(2132019033);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$compose(this, function);
            }
        }).a(mfy.cD));
    }

    protected final ajcq c() {
        amzg amzgVar = this.h;
        amzg amzgVar2 = this.g;
        amzg amzgVar3 = this.f;
        amzg amzgVar4 = this.e;
        amzg amzgVar5 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
