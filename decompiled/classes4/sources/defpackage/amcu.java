package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class amcu implements java.util.function.Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ amcu(int i) {
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
                return java.lang.Integer.valueOf(((defpackage.altp) obj).b);
            case 1:
                return ((defpackage.amdz) obj).a();
            case 2:
                return ((defpackage.amce) obj).toString();
            case 3:
                aimz aimzVar = defpackage.amcx.a;
                defpackage.amcd amcdVar = new defpackage.amcd((defpackage.amce) obj);
                amcdVar.f(true);
                return amcdVar.a();
            case 4:
                return ((defpackage.amce) obj).b();
            case 5:
                aimz aimzVar2 = defpackage.amcx.a;
                defpackage.amcd amcdVar2 = new defpackage.amcd((defpackage.amce) obj);
                amcdVar2.f(true);
                return amcdVar2.a();
            case 6:
                aimz aimzVar3 = defpackage.amcx.a;
                defpackage.amcd amcdVar3 = new defpackage.amcd((defpackage.amce) obj);
                amcdVar3.f(true);
                return amcdVar3.a();
            case 7:
                defpackage.amea ameaVar = (defpackage.amea) obj;
                akzx akzxVarM = defpackage.amao.a.m();
                int i = ameaVar.c;
                akzxVarM.u();
                defpackage.amao amaoVar = (defpackage.amao) akzxVarM.b;
                amaoVar.c = defpackage.amjk.k(i);
                amaoVar.b |= 1;
                java.lang.Iterable iterable = (java.lang.Iterable) j$.util.Collection.-EL.stream(ameaVar.b).map(new defpackage.amdk(13)).collect(aido.a);
                akzxVarM.u();
                defpackage.amao amaoVar2 = (defpackage.amao) akzxVarM.b;
                alak alakVar = amaoVar2.d;
                if (!alakVar.c()) {
                    amaoVar2.d = alad.H(alakVar);
                }
                akyl.i(iterable, amaoVar2.d);
                return (defpackage.amao) akzxVarM.p();
            case 8:
                return ((defpackage.alig) obj).a;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                amdx amdxVar = new amdx();
                amdxVar.d((defpackage.amgc) obj);
                return amdxVar.c();
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return (defpackage.alig) ((j$.util.Optional) obj).get();
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return java.lang.Integer.valueOf(((defpackage.alig) obj).b.a);
            case 12:
                return ((java.lang.String) obj).replaceAll("^[., ]+", "").replaceAll("[., ]+$", "");
            case 13:
                return java.lang.Integer.valueOf(((defpackage.alig) obj).b.a);
            case 14:
                alif alifVar = ((defpackage.alig) obj).b;
                return defpackage.altp.b(alifVar.a, alifVar.b);
            case 15:
                amdx amdxVar2 = new amdx();
                amdxVar2.f((defpackage.amfp) obj);
                return amdxVar2.e();
            case 16:
                return (java.lang.String) ((java.util.Map.Entry) obj).getKey();
            case 17:
                java.util.regex.Matcher matcher = defpackage.amew.a.matcher(((defpackage.alig) obj).a);
                if (!matcher.find()) {
                    return j$.util.Optional.empty();
                }
                j$.util.Optional optionalA = defpackage.amew.a(j$.util.Optional.ofNullable(aa$.ExternalSyntheticApiModelOutline0.m(matcher, "digitsLength")));
                j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((java.lang.String) defpackage.amev.l(aa$.ExternalSyntheticApiModelOutline0.m(matcher, "endKey")).orElse(aa$.ExternalSyntheticApiModelOutline0.m(matcher, "endKey")));
                akzx akzxVarM2 = defpackage.amfz.a.m();
                java.lang.String strM = aa$.ExternalSyntheticApiModelOutline0.m(matcher, "detail");
                akzxVarM2.u();
                defpackage.amfz amfzVar = (defpackage.amfz) akzxVarM2.b;
                j$.util.Objects.requireNonNull(strM);
                amfzVar.b |= 1;
                amfzVar.c = strM;
                j$.util.Objects.requireNonNull(akzxVarM2);
                defpackage.amdj amdjVar = new defpackage.amdj(akzxVarM2, 3);
                if (true == optionalA.isPresent()) {
                    java.lang.Object obj2 = optionalA.get();
                    java.lang.Object obj3 = amdjVar.a;
                    int iIntValue = ((java.lang.Integer) obj2).intValue();
                    akzx akzxVar = (akzx) obj3;
                    akzxVar.u();
                    defpackage.amfz amfzVar2 = (defpackage.amfz) akzxVar.b;
                    amfzVar2.b |= 2;
                    amfzVar2.d = iIntValue;
                }
                j$.util.Objects.requireNonNull(akzxVarM2);
                defpackage.amdj amdjVar2 = new defpackage.amdj(akzxVarM2, 4);
                if (true == optionalOfNullable.isPresent()) {
                    java.lang.String str = (java.lang.String) optionalOfNullable.get();
                    akzx akzxVar2 = (akzx) amdjVar2.a;
                    akzxVar2.u();
                    defpackage.amfz amfzVar3 = (defpackage.amfz) akzxVar2.b;
                    j$.util.Objects.requireNonNull(str);
                    amfzVar3.b |= 4;
                    amfzVar3.e = str;
                }
                return j$.util.Optional.of((defpackage.amfz) akzxVarM2.p());
            case 18:
                return (defpackage.amfz) ((j$.util.Optional) obj).get();
            case 19:
                return (aify) ((j$.util.stream.Stream) obj).collect(aido.a);
            default:
                return java.lang.Float.valueOf(((defpackage.alig) obj).b.c);
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
