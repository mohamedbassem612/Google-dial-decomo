package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class amcc implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ amcc(java.lang.Object obj, int i) {
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
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.lang.Object, java.util.Collection] */
    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        int i = 11;
        switch (this.$cid) {
            case 0:
                defpackage.amfw amfwVarB = defpackage.amfw.b(((defpackage.amfx) obj).e);
                if (amfwVarB == null) {
                    amfwVarB = defpackage.amfw.UNKNOWN;
                }
                return amfwVarB.equals(this.a);
            case 1:
                if (defpackage.ambz.a((java.lang.String) this.a, (java.lang.String) obj) > 0.35d) {
                    return false;
                }
                break;
            case 2:
                defpackage.amfw amfwVarB2 = defpackage.amfw.b(((defpackage.amfx) obj).e);
                if (amfwVarB2 == null) {
                    amfwVarB2 = defpackage.amfw.UNKNOWN;
                }
                return ((aihd) this.a).contains(amfwVarB2);
            case 3:
                return ((defpackage.altp) obj).j((defpackage.altp) this.a);
            case 4:
                if (((defpackage.altp) obj).h(((defpackage.amcp) this.a).b).split(" ").length <= 1) {
                    return false;
                }
                break;
            case 5:
                return ((defpackage.altp) this.a).i(((java.lang.Integer) obj).intValue());
            case 6:
                java.lang.Integer num = (java.lang.Integer) obj;
                int iIntValue = num.intValue();
                defpackage.altp altpVar = (defpackage.altp) this.a;
                if (iIntValue < altpVar.a || num.intValue() > altpVar.b) {
                    return false;
                }
                break;
            case 7:
                return ((defpackage.altp) this.a).j((defpackage.altp) obj);
            case 8:
                return ((defpackage.altp) this.a).c(1).i(((java.lang.Integer) obj).intValue());
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return ((java.lang.Class) this.a).isInstance((defpackage.amdz) obj);
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                aimz aimzVar = defpackage.amcx.a;
                return ((defpackage.amce) ((aify) this.a).get(((java.lang.Integer) obj).intValue())).f;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return ((defpackage.alig) this.a).b((defpackage.alig) obj);
            case 12:
                alif alifVar = ((defpackage.alig) obj).b;
                int i2 = alifVar.a;
                alif alifVar2 = ((defpackage.alig) this.a).b;
                if (i2 < alifVar2.a || alifVar.b > alifVar2.b) {
                    return false;
                }
                break;
            case 13:
                defpackage.alig aligVar = (defpackage.alig) obj;
                j$.util.stream.Stream stream = j$.util.Collection.-EL.stream((java.util.Collection) this.a);
                j$.util.Objects.requireNonNull(aligVar);
                return stream.noneMatch(new defpackage.amcc(aligVar, i));
            case 14:
                defpackage.alig aligVar2 = (defpackage.alig) obj;
                j$.util.stream.Stream stream2 = j$.util.Collection.-EL.stream((java.util.Collection) this.a);
                j$.util.Objects.requireNonNull(aligVar2);
                return stream2.noneMatch(new defpackage.amcc(aligVar2, i));
            case 15:
                if (((defpackage.alig) obj).b.b >= ((defpackage.alig) this.a).b.a) {
                    return false;
                }
                break;
            case 16:
                defpackage.alig aligVar3 = (defpackage.alig) obj;
                j$.util.stream.Stream stream3 = j$.util.Collection.-EL.stream(((aiga) this.a).a("output_key"));
                j$.util.Objects.requireNonNull(aligVar3);
                return stream3.anyMatch(new defpackage.amcc(aligVar3, i));
            default:
                return ((defpackage.altp) this.a).i(((java.lang.Integer) obj).intValue());
        }
        return true;
    }
}
