package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class alzc implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;

    public /* synthetic */ alzc(int i) {
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
                aimz aimzVar = defpackage.alzd.a;
                return anty.aD((java.lang.String) obj);
            case 1:
                return ((defpackage.alxm) obj).d;
            case 2:
                defpackage.almz almzVar = (defpackage.almz) obj;
                int i = defpackage.alzn.c;
                apdi apdiVar = defpackage.alol.f;
                almzVar.c(apdiVar);
                return ((alaa) almzVar).n.l((alac) apdiVar.a);
            case 3:
                defpackage.alyd alydVarB = defpackage.alyd.b(((defpackage.alye) obj).b);
                if (alydVarB == null) {
                    alydVarB = defpackage.alyd.NO_TRIGGER;
                }
                if (alydVarB != defpackage.alyd.NO_TRIGGER) {
                    return true;
                }
                break;
            case 4:
                defpackage.almz almzVar2 = (defpackage.almz) obj;
                int i2 = defpackage.alzs.f;
                apdi apdiVar2 = defpackage.alol.f;
                almzVar2.c(apdiVar2);
                return ((alaa) almzVar2).n.l((alac) apdiVar2.a);
            case 5:
                int i3 = defpackage.alzt.b;
                defpackage.alys alysVarB = defpackage.alys.b(((defpackage.alyt) obj).b);
                if (alysVarB == null) {
                    alysVarB = defpackage.alys.NO_TRIGGER;
                }
                if (alysVarB != defpackage.alys.NO_TRIGGER) {
                    return true;
                }
                break;
            case 6:
                ahzf ahzfVar = defpackage.ambu.a;
                return ((defpackage.amea) obj).a.isPresent();
            case 7:
                defpackage.amce amceVar = (defpackage.amce) obj;
                ahzf ahzfVar2 = defpackage.ambu.a;
                if (amceVar.i() && !amceVar.k()) {
                    return true;
                }
                break;
            case 8:
                ahzf ahzfVar3 = defpackage.ambu.a;
                if (((java.lang.Float) obj).floatValue() < 0.85f) {
                    return true;
                }
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                ahzf ahzfVar4 = defpackage.ambu.a;
                java.lang.String strC = ((defpackage.amcf) obj).c();
                aimz aimzVar2 = defpackage.amev.a;
                if (strC.contains("www.") || strC.contains(".com") || strC.contains(".gov")) {
                    return true;
                }
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                ahzf ahzfVar5 = defpackage.ambu.a;
                return defpackage.amev.u(((defpackage.amcf) obj).c());
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                defpackage.amce amceVar2 = (defpackage.amce) obj;
                ahzf ahzfVar6 = defpackage.ambu.a;
                if (amceVar2.i() && !amceVar2.k()) {
                    return true;
                }
                break;
            case 12:
                defpackage.amfw amfwVarB = defpackage.amfw.b(((defpackage.amfx) obj).e);
                if (amfwVarB == null) {
                    amfwVarB = defpackage.amfw.UNKNOWN;
                }
                return amfwVarB.equals(defpackage.amfw.PREDICTED_BY_CACHE);
            case 13:
                aify aifyVar = defpackage.amcj.a;
                if (!((defpackage.alqo) obj).c.trim().isEmpty()) {
                    return true;
                }
                break;
            case 14:
                if (!defpackage.amcj.a.contains(ahvr.p(((defpackage.alqo) obj).c).trim())) {
                    return true;
                }
                break;
            case 15:
                return anty.aD((java.lang.String) obj);
            case 16:
                return ((defpackage.amce) obj).i();
            case 17:
                return anty.aD((java.lang.String) obj);
            case 18:
                aimz aimzVar3 = defpackage.amcx.a;
                return ((defpackage.amce) obj).d.isPresent();
            case 19:
                return anty.aD((java.lang.String) obj);
            default:
                if (!defpackage.amev.r(defpackage.amev.q(((defpackage.alig) ((java.util.Map.Entry) obj).getValue()).a).replace(ahvr.p("[FOREIGN-LANGUAGE]"), "").trim()).isEmpty()) {
                    return true;
                }
                break;
        }
        return false;
    }
}
