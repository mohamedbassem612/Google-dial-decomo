package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class alks implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ alks(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                break;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                break;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                break;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Collection] */
    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                java.lang.String str = (java.lang.String) obj;
                j$.util.stream.Stream stream = j$.util.Collection.-EL.stream((java.util.Collection) this.a);
                j$.util.Objects.requireNonNull(str);
                return stream.anyMatch(new defpackage.alks(str, 3));
            case 1:
                defpackage.almz almzVar = (defpackage.almz) obj;
                defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
                if (alnbVarB == null) {
                    alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
                }
                if (!alnbVarB.equals(defpackage.alnb.EVENT_SAY)) {
                    return true;
                }
                if (!((java.lang.String) defpackage.alpv.i(almzVar).orElse("")).matches((java.lang.String) this.a)) {
                    return true;
                }
                break;
            case 2:
                if (((java.lang.Float) obj).floatValue() > ((defpackage.alnz) this.a).d) {
                    return true;
                }
                break;
            case 3:
                return ((java.lang.String) this.a).endsWith((java.lang.String) obj);
            case 4:
                return ((java.lang.Integer) this.a).equals(((java.util.Map.Entry) obj).getValue());
            case 5:
                java.lang.String str2 = (java.lang.String) obj;
                defpackage.aloa aloaVar = (defpackage.aloa) this.a;
                if (aloaVar.e.contains(str2)) {
                    return true;
                }
                int iAe = a.ae(aloaVar.f);
                if (iAe != 0 && iAe == 2 && (str2.equals("robot_intent_score_distributions") || str2.equals("robot_intent_classes"))) {
                    return true;
                }
                break;
            case 6:
                return ((java.lang.String) obj).equals(this.a);
            case 7:
                if (((java.lang.Float) obj).floatValue() > ((defpackage.allc) this.a).a) {
                    return true;
                }
                break;
            case 8:
                return ((aihd) this.a).contains(((java.util.Map.Entry) obj).getKey());
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                if (((java.util.Map.Entry) obj).getValue() == this.a) {
                    return true;
                }
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                defpackage.alxf alxfVar = (defpackage.alxf) obj;
                int i = alxfVar.c;
                if (i != 4) {
                    return true;
                }
                if (!((defpackage.alza) this.a).c.d(i == 4 ? (java.lang.String) alxfVar.d : "").o) {
                    return true;
                }
                break;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                defpackage.alxf alxfVar2 = (defpackage.alxf) obj;
                int i2 = alxfVar2.c;
                if (i2 == 6) {
                    return true;
                }
                if (((aify) ((defpackage.alza) this.a).c.c).contains(i2 == 4 ? (java.lang.String) alxfVar2.d : "")) {
                    return true;
                }
                break;
            case 12:
                defpackage.alxf alxfVar3 = (defpackage.alxf) obj;
                int i3 = defpackage.alza.h;
                if (!((aihd) this.a).contains(alxfVar3.c == 4 ? (java.lang.String) alxfVar3.d : "")) {
                    return true;
                }
                break;
            case 13:
                return ((aify) ((defpackage.alza) this.a).c.c).contains(((defpackage.almm) obj).c);
            case 14:
                if (((defpackage.alor) obj).b.size() >= ((defpackage.alzk) this.a).c) {
                    return true;
                }
                break;
            case 15:
                if (((defpackage.almx) obj).d < ((defpackage.alzk) this.a).b) {
                    return true;
                }
                break;
            case 16:
                java.lang.Object obj2 = this.a;
                int i4 = defpackage.alzn.c;
                return anty.aF((java.lang.String) obj2, (defpackage.almz) obj);
            case 17:
                return ((java.lang.String) obj).equals(((defpackage.alzn) this.a).b.b);
            case 18:
                java.lang.Object obj3 = this.a;
                int i5 = defpackage.alzs.f;
                return anty.aF((java.lang.String) obj3, (defpackage.almz) obj);
            case 19:
                return ((java.lang.String) obj).equals(((defpackage.alzs) this.a).b.b);
            default:
                if (defpackage.ambz.a((java.lang.String) obj, (java.lang.String) this.a) < 0.35d) {
                    return true;
                }
                break;
        }
        return false;
    }
}
