package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class altw implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;

    public /* synthetic */ altw(int i) {
        this.$cid = i;
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

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                if ((((defpackage.alqo) obj).b & 2) == 0) {
                    return false;
                }
                break;
            case 1:
                defpackage.amhe amheVar = ((defpackage.amhd) obj).c;
                if (amheVar == null) {
                    amheVar = defpackage.amhe.a;
                }
                if ((amheVar.b & 2) != 0) {
                    return false;
                }
                break;
            case 2:
                if ((((defpackage.alqo) obj).b & 16) == 0) {
                    return false;
                }
                break;
            case 3:
                if (((java.lang.String) obj).equals("no_label")) {
                    return false;
                }
                break;
            case 4:
                if (((defpackage.alwe) obj).d > 250) {
                    return false;
                }
                break;
            case 5:
                return ((defpackage.alwf) obj).d.isEmpty();
            case 6:
                if (((defpackage.alwf) obj).d.isEmpty()) {
                    return false;
                }
                break;
            case 7:
                int iAN = a.aN(((defpackage.alyi) obj).e);
                if (iAN == 0 || iAN != 2) {
                    return false;
                }
                break;
            case 8:
                int iAN2 = a.aN(((defpackage.alyi) obj).e);
                if (iAN2 == 0 || iAN2 != 2) {
                    return false;
                }
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                defpackage.alww alwwVar = (defpackage.alww) obj;
                int iAQ = a.aQ((alwwVar.c == 3 ? (defpackage.alyp) alwwVar.d : defpackage.alyp.a).c);
                if (iAQ == 0 || iAQ != 3) {
                    return false;
                }
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return ((defpackage.alyp) obj).g;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                defpackage.alwk alwkVarB = defpackage.alwk.b(((defpackage.alwl) obj).b);
                if (alwkVarB == null) {
                    alwkVarB = defpackage.alwk.NO_TRIGGER;
                }
                if (alwkVarB == defpackage.alwk.NO_TRIGGER) {
                    return false;
                }
                break;
            case 12:
                int i = defpackage.alvx.b;
                defpackage.alyl alylVarB = defpackage.alyl.b(((defpackage.alym) obj).c);
                if (alylVarB == null) {
                    alylVarB = defpackage.alyl.NO_TRIGGER;
                }
                if (alylVarB == defpackage.alyl.NO_TRIGGER) {
                    return false;
                }
                break;
            case 13:
                int i2 = defpackage.alza.h;
                int iR = airh.r(((defpackage.alxf) obj).g);
                return airh.m(iR != 0 ? iR : 1);
            case 14:
                int i3 = defpackage.alza.h;
                int iR2 = airh.r(((defpackage.alxf) obj).g);
                if (iR2 == 0) {
                    iR2 = 1;
                }
                if (airh.m(iR2)) {
                    return false;
                }
                break;
            case 15:
                int i4 = defpackage.alza.h;
                defpackage.alxn alxnVarB = defpackage.alxn.b(((defpackage.alxo) obj).b);
                if (alxnVarB == null) {
                    alxnVarB = defpackage.alxn.NO_TRIGGER;
                }
                if (alxnVarB == defpackage.alxn.NO_TRIGGER) {
                    return false;
                }
                break;
            case 16:
                return airh.p(obj);
            case 17:
                int i5 = defpackage.alza.h;
                defpackage.alsy alsyVarB = defpackage.alsy.b(((defpackage.alxf) obj).f);
                if (alsyVarB == null) {
                    alsyVarB = defpackage.alsy.NO_ACTION;
                }
                return alsyVarB.equals(defpackage.alsy.ASK_FOR_CONSENT_FOR_AI_REPLIES);
            case 18:
                return airh.p(obj);
            case 19:
                int i6 = defpackage.alza.h;
                defpackage.alwq alwqVarB = defpackage.alwq.b(((defpackage.alws) obj).b);
                if (alwqVarB == null) {
                    alwqVarB = defpackage.alwq.TYPE_UNSET;
                }
                if (alwqVarB == defpackage.alwq.TYPE_UNSET) {
                    return false;
                }
                break;
            default:
                int i7 = defpackage.alza.h;
                defpackage.alwq alwqVarB2 = defpackage.alwq.b(((defpackage.alws) obj).b);
                if (alwqVarB2 == null) {
                    alwqVarB2 = defpackage.alwq.TYPE_UNSET;
                }
                if (alwqVarB2 != defpackage.alwq.TYPE_UNSET) {
                    return false;
                }
                break;
        }
        return true;
    }
}
