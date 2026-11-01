package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class vfd implements java.util.function.BinaryOperator {
    private final /* synthetic */ int $cid;

    @Override // java.util.function.BiFunction
    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        int i = this.$cid;
        if (i == 0) {
            return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
        }
        if (i == 1) {
            return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
        }
        if (i == 2) {
            return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
        }
        if (i == 3) {
            return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
        }
        if (i != 4) {
            return i != 5 ? j$.util.function.BiFunction.-CC.$default$andThen(this, function) : j$.util.function.BiFunction.-CC.$default$andThen(this, function);
        }
        return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        aifz aifzVar;
        int i = this.$cid;
        if (i == 0) {
            throw new java.lang.IllegalStateException("Duplicate server voicemail id: ".concat(java.lang.String.valueOf(((vfe) obj).a())));
        }
        if (i == 1) {
            throw new java.lang.AssertionError("multiple result");
        }
        if (i == 2) {
            aifzVar = (aifz) obj;
            aieb aiebVar = ((aigq) ((aifz) obj2)).a;
            if (aiebVar != null) {
                for (java.util.Map.Entry entry : new aidw(aiebVar)) {
                    aifzVar.h(entry.getKey(), ((aifn) entry.getValue()).g());
                }
            }
        } else if (i == 3) {
            aifzVar = (java.lang.StringBuilder) obj;
            aifzVar.append((java.lang.StringBuilder) obj2);
        } else if (i == 4) {
            aifzVar = (defpackage.alxf) obj;
            int i2 = defpackage.alza.h;
        } else {
            if (i != 5) {
                java.lang.Integer num = (java.lang.Integer) obj2;
                aimz aimzVar = defpackage.amev.a;
                return num;
            }
            aifzVar = (defpackage.almx) obj;
            defpackage.almx almxVar = (defpackage.almx) obj2;
            if (aifzVar.d >= almxVar.d) {
                return almxVar;
            }
        }
        return aifzVar;
    }
}
