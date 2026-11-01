package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class alyz implements java.util.function.Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ alyz(int i) {
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
                int i = defpackage.alza.h;
                defpackage.almm almmVar = ((defpackage.alxm) obj).b;
                if (almmVar == null) {
                    almmVar = defpackage.almm.a;
                }
                return almmVar.c;
            case 1:
                java.lang.String str = (java.lang.String) obj;
                int i2 = defpackage.alza.h;
                return str;
            case 2:
                defpackage.alxi alxiVarB = defpackage.alxi.b(((defpackage.alxc) obj).b);
                return alxiVarB == null ? defpackage.alxi.ENTRY_POINT_DEFAULT : alxiVarB;
            case 3:
                defpackage.alxf alxfVar = (defpackage.alxf) obj;
                int i3 = defpackage.alza.h;
                return alxfVar;
            case 4:
                int i4 = defpackage.alza.h;
                defpackage.almm almmVar2 = ((defpackage.alxm) obj).b;
                if (almmVar2 == null) {
                    almmVar2 = defpackage.almm.a;
                }
                return almmVar2.c;
            case 5:
                defpackage.alwq alwqVarB = defpackage.alwq.b(((defpackage.alxp) obj).c);
                return alwqVarB == null ? defpackage.alwq.TYPE_UNSET : alwqVarB;
            case 6:
                return ((defpackage.alxp) obj).d;
            case 7:
                return ahus.x((j$.util.Optional) obj);
            case 8:
                return ((defpackage.almm) obj).c;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                defpackage.alor alorVar = (defpackage.alor) obj;
                akzx akzxVarM = defpackage.alos.a.m();
                akzxVarM.u();
                defpackage.alos alosVar = (defpackage.alos) akzxVarM.b;
                j$.util.Objects.requireNonNull(alorVar);
                alosVar.c = alorVar;
                alosVar.b = 1;
                return (defpackage.alos) akzxVarM.p();
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                defpackage.alov alovVar = ((defpackage.almx) obj).c;
                if (alovVar == null) {
                    alovVar = defpackage.alov.a;
                }
                return alovVar.b;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return (defpackage.almx) obj;
            case 12:
                defpackage.alos alosVar2 = (defpackage.alos) obj;
                return (alosVar2.b == 1 ? (defpackage.alor) alosVar2.c : defpackage.alor.a).b;
            case 13:
                return j$.util.Collection.-EL.stream((java.util.List) obj);
            case 14:
                return java.lang.Double.valueOf(((defpackage.almx) obj).d);
            case 15:
                return ahus.x((j$.util.Optional) obj);
            case 16:
                int i5 = defpackage.alzn.c;
                return anar.n((defpackage.almz) obj);
            case 17:
                defpackage.alyd alydVarB = defpackage.alyd.b(((defpackage.alye) obj).b);
                return alydVarB == null ? defpackage.alyd.NO_TRIGGER : alydVarB;
            case 18:
                return ((defpackage.alye) obj).c;
            case 19:
                defpackage.alos alosVar3 = (defpackage.alos) obj;
                return (alosVar3.b == 1 ? (defpackage.alor) alosVar3.c : defpackage.alor.a).b;
            default:
                return j$.util.Collection.-EL.stream((java.util.List) obj);
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
