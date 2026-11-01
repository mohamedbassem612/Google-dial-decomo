package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class ailg implements java.util.function.Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ailg(int i) {
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
                return (j$.util.Spliterator) obj;
            case 1:
                return ((java.util.Map.Entry) obj).getValue();
            case 2:
                return ((java.util.Map.Entry) obj).getKey();
            case 3:
                return ((java.util.Map.Entry) obj).getValue();
            case 4:
                return ((aitt) obj).a();
            case 5:
                return new java.util.ArrayList();
            case 6:
                return anty.aE(obj);
            case 7:
                defpackage.alik alikVarB = defpackage.alik.b(((defpackage.alil) obj).b);
                return alikVarB == null ? defpackage.alik.UNKNOWN : alikVarB;
            case 8:
                return ((java.util.Map.Entry) obj).getValue();
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                amkh amkhVar = (amkh) obj;
                akzx akzxVarM = defpackage.amay.a.m();
                java.lang.String str = amkhVar.c;
                akzxVarM.u();
                defpackage.amay amayVar = (defpackage.amay) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                amayVar.b = str;
                float fExp = (float) java.lang.Math.exp(-amkhVar.e);
                akzxVarM.u();
                ((defpackage.amay) akzxVarM.b).c = fExp;
                float f = amkhVar.e;
                akzxVarM.u();
                ((defpackage.amay) akzxVarM.b).d = f;
                return (defpackage.amay) akzxVarM.p();
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return anty.aE(obj);
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return (java.lang.Integer) ((java.util.Map.Entry) obj).getValue();
            case 12:
                defpackage.alpf alpfVar = (defpackage.alpf) obj;
                akzx akzxVarM2 = defpackage.alqw.a.m();
                java.lang.String str2 = alpfVar.c;
                akzxVarM2.u();
                defpackage.alqw alqwVar = (defpackage.alqw) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str2);
                alqwVar.b |= 1;
                alqwVar.c = str2;
                alat alatVar = alpfVar.d;
                akzxVarM2.u();
                defpackage.alqw alqwVar2 = (defpackage.alqw) akzxVarM2.b;
                alat alatVar2 = alqwVar2.d;
                if (!alatVar2.c()) {
                    alqwVar2.d = alad.J(alatVar2);
                }
                akyl.i(alatVar, alqwVar2.d);
                return (defpackage.alqw) akzxVarM2.p();
            case 13:
                java.lang.String str3 = (java.lang.String) obj;
                akzx akzxVarM3 = defpackage.alqq.a.m();
                akzxVarM3.u();
                defpackage.alqq alqqVar = (defpackage.alqq) akzxVarM3.b;
                j$.util.Objects.requireNonNull(str3);
                alqqVar.b |= 1;
                alqqVar.c = str3;
                return (defpackage.alqq) akzxVarM3.p();
            case 14:
                return new java.util.concurrent.atomic.AtomicInteger(0);
            case 15:
                return (defpackage.allg) obj;
            case 16:
                return ((defpackage.allg) obj).a();
            case 17:
                return defpackage.aknx.E(obj);
            case 18:
                return ((defpackage.alnb) obj).name();
            case 19:
                return defpackage.aknx.E(obj);
            default:
                return (defpackage.almy) obj;
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
