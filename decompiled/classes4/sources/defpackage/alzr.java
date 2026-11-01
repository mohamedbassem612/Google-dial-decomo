package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class alzr implements java.util.function.Function {
    private final /* synthetic */ int $cid;

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
                int i = defpackage.alzs.f;
                return anar.n((defpackage.almz) obj);
            case 1:
                return java.lang.Double.valueOf(((defpackage.almx) obj).d);
            case 2:
                defpackage.alys alysVarB = defpackage.alys.b(((defpackage.alyt) obj).b);
                return alysVarB == null ? defpackage.alys.NO_TRIGGER : alysVarB;
            case 3:
                return ((defpackage.alyt) obj).c;
            case 4:
                return ((defpackage.alzx) obj).name();
            case 5:
                defpackage.alzx alzxVar = (defpackage.alzx) obj;
                defpackage.alzx alzxVar2 = defpackage.alzx.a;
                return alzxVar;
            case 6:
                return j$.util.Collection.-EL.stream((aify) obj);
            case 7:
                java.lang.String str = (java.lang.String) obj;
                aimz aimzVar = defpackage.amev.a;
                aift aiftVar = new aift(4);
                for (java.lang.String str2 : str.split("", 0)) {
                    aigf aigfVar = defpackage.amef.a;
                    if (!aigfVar.containsKey(str2)) {
                        return aify.p(str);
                    }
                    aiftVar.i((java.lang.String) aigfVar.get(str2));
                }
                return aiftVar.h();
            case 8:
                ahzf ahzfVar = defpackage.ambu.a;
                return ((defpackage.amcf) obj).c();
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return defpackage.ambu.a.g((java.lang.String) obj);
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return (defpackage.amdd) ((java.util.Map.Entry) obj).getKey();
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return new defpackage.ameg((defpackage.amdf) ((java.util.Map.Entry) obj).getValue());
            case 12:
                return ambr.d(obj);
            case 13:
                return ambr.d(obj);
            case 14:
                return ((defpackage.amce) obj).e();
            case 15:
                return ((defpackage.amce) obj).b;
            case 16:
                defpackage.amce amceVar = (defpackage.amce) obj;
                akzx akzxVarM = defpackage.amam.a.m();
                defpackage.amft amftVar = amceVar.b;
                akzxVarM.u();
                defpackage.amam amamVar = (defpackage.amam) akzxVarM.b;
                j$.util.Objects.requireNonNull(amftVar);
                amamVar.c = amftVar;
                amamVar.b |= 1;
                int iIntValue = amceVar.c.intValue();
                akzxVarM.u();
                defpackage.amam amamVar2 = (defpackage.amam) akzxVarM.b;
                amamVar2.b |= 2;
                amamVar2.d = iIntValue;
                boolean z = amceVar.f;
                akzxVarM.u();
                defpackage.amam amamVar3 = (defpackage.amam) akzxVarM.b;
                amamVar3.b |= 4;
                amamVar3.e = z;
                j$.util.Optional optional = amceVar.d;
                if (optional.isPresent()) {
                    int iIntValue2 = ((java.lang.Integer) optional.get()).intValue();
                    akzxVarM.u();
                    defpackage.amam amamVar4 = (defpackage.amam) akzxVarM.b;
                    amamVar4.b |= 16;
                    amamVar4.f = iIntValue2;
                }
                return (defpackage.amam) akzxVarM.p();
            case 17:
                return ((defpackage.amce) obj).toString();
            case 18:
                return (defpackage.amco) ((java.util.Map.Entry) obj).getKey();
            case 19:
                return (java.lang.String) obj;
            default:
                return ((defpackage.amdz) obj).b();
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
