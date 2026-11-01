package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pjn extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public pjn(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.pjn.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        mgu mguVar = (mgu) list.get(0);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        final defpackage.plq plqVar = (defpackage.plq) list.get(2);
        return aiql.z((j$.util.Optional) mguVar.b(new java.util.function.Function() { // from class: piu
            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$andThen(this, function);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0018  */
            /* JADX WARN: Code duplicated, block: B:13:0x001b  */
            /* JADX WARN: Code duplicated, block: B:15:0x001e  */
            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            /* JADX WARN: Code duplicated, block: B:17:0x0024  */
            /* JADX WARN: Code duplicated, block: B:18:0x0027  */
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj2) {
                int i;
                java.lang.String str;
                defpackage.amdx amdxVar = (defpackage.amdx) obj2;
                defpackage.plq plqVar2 = plqVar;
                int i2 = plqVar2.b;
                if (i2 != 4) {
                    i = i2 - 1;
                    if (i != 1) {
                        str = "FormattedNumber";
                    } else if (i != 2) {
                        str = "OverriddenName";
                    } else if (i != 3) {
                        str = "PresentationString";
                    } else {
                        str = "IdentifiedName";
                    }
                } else if (zBooleanValue) {
                    str = "SpoofedName";
                } else {
                    i2 = 4;
                    i = i2 - 1;
                    if (i != 1) {
                        str = "FormattedNumber";
                    } else if (i != 2) {
                        str = "OverriddenName";
                    } else if (i != 3) {
                        str = "PresentationString";
                    } else {
                        str = "IdentifiedName";
                    }
                }
                amdxVar.a = str;
                return plqVar2.a;
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$compose(this, function);
            }
        }).a(mfy.aM));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
