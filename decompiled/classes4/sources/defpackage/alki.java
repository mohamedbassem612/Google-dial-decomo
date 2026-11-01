package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class alki implements java.util.function.Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ alki(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
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
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                defpackage.almz almzVar = ((defpackage.almy) obj).h;
                return almzVar == null ? defpackage.almz.a : almzVar;
            case 1:
                return ((defpackage.alqi) obj).c;
            case 2:
                defpackage.almz almzVar2 = (defpackage.almz) obj;
                defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar2.c);
                if (alnbVarB == null) {
                    alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
                }
                if (alnbVarB.equals(defpackage.alnb.EVENT_SAY)) {
                    return defpackage.alpv.i(almzVar2);
                }
                defpackage.alnb alnbVarB2 = defpackage.alnb.b(almzVar2.c);
                if (alnbVarB2 == null) {
                    alnbVarB2 = defpackage.alnb.EVENT_UNKNOWN;
                }
                return alnbVarB2.equals(defpackage.alnb.EVENT_ASR_RESULT) ? j$.util.Optional.of(defpackage.alkt.e(almzVar2)) : j$.util.Optional.empty();
            case 3:
                return ahus.x((j$.util.Optional) obj);
            case 4:
                return ((java.lang.StringBuilder) obj).toString();
            case 5:
                return (java.lang.Integer) ((java.util.Map.Entry) obj).getKey();
            case 6:
                return ahus.x((j$.util.Optional) obj);
            case 7:
                return (java.lang.String) obj;
            case 8:
                return (int[][]) ((java.util.Map.Entry) obj).getValue();
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return (java.lang.String) obj;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return anty.aE(obj);
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                defpackage.aqag aqagVar = (defpackage.aqag) ((java.util.Map.Entry) obj).getValue();
                int i = defpackage.alpr.a;
                defpackage.aqaf aqafVarB = defpackage.aqaf.b(aqagVar.c);
                if (aqafVarB == null) {
                    aqafVarB = defpackage.aqaf.UNRECOGNIZED;
                }
                int iOrdinal = aqafVarB.ordinal();
                if (iOrdinal == 3 || iOrdinal == 9 || iOrdinal == 5 || iOrdinal == 6) {
                    return new int[][]{aiql.W(aify.n(aqagVar.f))};
                }
                defpackage.aqaf aqafVarB2 = defpackage.aqaf.b(aqagVar.c);
                if (aqafVarB2 == null) {
                    aqafVarB2 = defpackage.aqaf.UNRECOGNIZED;
                }
                throw new java.lang.UnsupportedOperationException(java.lang.String.format("Unsupported data type: %s", aqafVarB2.name()));
            case 12:
                return ((defpackage.amgy) obj).c;
            case 13:
                return ((defpackage.amgx) obj).c;
            case 14:
                return (defpackage.amgx) obj;
            case 15:
                return ((defpackage.amgz) obj).c;
            case 16:
                return (aoin) ((java.util.Map.Entry) obj).getValue();
            case 17:
                return ((aoin) obj).a();
            case 18:
                return (defpackage.alnr) ((java.util.Map.Entry) obj).getKey();
            case 19:
                return ahus.z((defpackage.alnr) obj, defpackage.alpl.a);
            default:
                return ahus.z((defpackage.alnr) obj, defpackage.alpl.b);
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
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
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
