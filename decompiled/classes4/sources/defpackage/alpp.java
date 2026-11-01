package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class alpp implements java.util.function.Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ alpp(int i) {
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
                return j$.util.stream.Stream.-CC.ofNullable((java.lang.String) defpackage.alpq.a.d.get((defpackage.alrf) obj));
            case 1:
                defpackage.alnr alnrVar = (defpackage.alnr) obj;
                defpackage.alnq alnqVarB = defpackage.alnq.b(alnrVar.c);
                if (alnqVarB == null) {
                    alnqVarB = defpackage.alnq.UNKNOWN_LLM_FEATURE;
                }
                return java.lang.String.format("%s (version %s)", alnqVarB.name(), java.lang.Long.valueOf(alnrVar.d));
            case 2:
                int i = defpackage.alpr.a;
                return j$.util.Collection.-EL.stream(aiql.U((int[]) obj));
            case 3:
                return (j$.util.stream.Stream) obj;
            case 4:
                return ((alqn) obj).c;
            case 5:
                return java.lang.Double.valueOf(((defpackage.alqo) obj).d);
            case 6:
                return java.lang.Integer.valueOf(((defpackage.alqo) obj).c.length());
            case 7:
                return ((defpackage.alwf) obj).c;
            case 8:
                defpackage.alwf alwfVar = ((defpackage.alyp) obj).d;
                return alwfVar == null ? defpackage.alwf.a : alwfVar;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                defpackage.alww alwwVar = (defpackage.alww) obj;
                int iAQ = a.aQ((alwwVar.c == 3 ? (defpackage.alyp) alwwVar.d : defpackage.alyp.a).c);
                if (iAQ == 0 || iAQ != 2) {
                    return alwwVar;
                }
                akzx akzxVarP = alwwVar.p();
                akzx akzxVarP2 = (alwwVar.c == 3 ? (defpackage.alyp) alwwVar.d : defpackage.alyp.a).p();
                akzxVarP2.u();
                defpackage.alyp alypVar = (defpackage.alyp) akzxVarP2.b;
                alypVar.f = 2;
                alypVar.b |= 8;
                akzxVarP.u();
                defpackage.alww alwwVar2 = (defpackage.alww) akzxVarP.b;
                defpackage.alyp alypVar2 = (defpackage.alyp) akzxVarP2.p();
                j$.util.Objects.requireNonNull(alypVar2);
                alwwVar2.d = alypVar2;
                alwwVar2.c = 3;
                return (defpackage.alww) akzxVarP.p();
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return ((defpackage.alqw) obj).c;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                defpackage.alww alwwVar3 = (defpackage.alww) obj;
                return alwwVar3.c == 3 ? (defpackage.alyp) alwwVar3.d : defpackage.alyp.a;
            case 12:
                defpackage.alwk alwkVarB = defpackage.alwk.b(((defpackage.alwl) obj).b);
                return alwkVarB == null ? defpackage.alwk.NO_TRIGGER : alwkVarB;
            case 13:
                return ((defpackage.alwl) obj).c;
            case 14:
                defpackage.alyl alylVarB = defpackage.alyl.b(((defpackage.alym) obj).c);
                return alylVarB == null ? defpackage.alyl.NO_TRIGGER : alylVarB;
            case 15:
                return ((defpackage.alym) obj).d;
            case 16:
                int i2 = defpackage.alza.h;
                akzx akzxVarP3 = ((defpackage.alxf) obj).p();
                akzxVarP3.u();
                defpackage.alxf alxfVar = (defpackage.alxf) akzxVarP3.b;
                alxfVar.g = 4;
                alxfVar.b |= 4;
                return (defpackage.alxf) akzxVarP3.p();
            case 17:
                return ((defpackage.aloe) obj).c;
            case 18:
                defpackage.alxn alxnVarB = defpackage.alxn.b(((defpackage.alxo) obj).b);
                return alxnVarB == null ? defpackage.alxn.NO_TRIGGER : alxnVarB;
            case 19:
                return ((defpackage.alxo) obj).c;
            default:
                defpackage.alxf alxfVar2 = (defpackage.alxf) obj;
                return alxfVar2.c == 4 ? (java.lang.String) alxfVar2.d : "";
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
