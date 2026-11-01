package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class amcr implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ amcr(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
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
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r5v57, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v67, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        int iIndexOf;
        int i = 12;
        switch (this.$cid) {
            case 0:
                java.lang.String str = (java.lang.String) obj;
                j$.util.Objects.requireNonNull(str);
                defpackage.amfn amfnVar = (defpackage.amfn) ((defpackage.amfm) this.a).h.get(str);
                if (amfnVar != null) {
                    return aihd.o(amfnVar.b);
                }
                throw new java.lang.IllegalArgumentException();
            case 1:
                j$.util.stream.Stream stream = j$.util.Collection.-EL.stream((aify) ((java.util.Map.Entry) obj).getValue());
                java.lang.Object obj2 = this.a;
                j$.util.Objects.requireNonNull(obj2);
                return (aify) stream.filter(new defpackage.amcc(obj2, 5)).map(new defpackage.alyy(obj2, 16)).collect(aido.a);
            case 2:
                defpackage.amdz amdzVar = (defpackage.amdz) obj;
                aimz aimzVar = defpackage.amcx.a;
                int i2 = amdzVar.a().b;
                java.lang.String str2 = ((defpackage.amcp) this.a).b;
                int length = str2.length();
                if (i2 == length || (i2 < length && str2.charAt(i2) == ' ')) {
                    return amdzVar;
                }
                int length2 = str2.length();
                if (i2 < length && (iIndexOf = str2.indexOf(32, i2)) != -1) {
                    length2 = iIndexOf;
                }
                return amdzVar.d(str2, length2);
            case 3:
                defpackage.alig aligVar = (defpackage.alig) obj;
                defpackage.alig aligVar2 = (defpackage.alig) this.a;
                if (!aligVar.b(aligVar2)) {
                    return j$.util.Optional.empty();
                }
                alif alifVar = aligVar.b;
                int i3 = alifVar.a;
                alif alifVar2 = aligVar2.b;
                int i4 = alifVar2.a;
                int i5 = alifVar.b;
                int i6 = alifVar2.b;
                java.lang.String str3 = aligVar.a;
                int iMax = java.lang.Math.max(i3, i4);
                int iMin = java.lang.Math.min(i5, i6);
                return j$.util.Optional.of(new defpackage.alig(str3.substring(iMax - i3, iMin - i3), new alif(iMax, iMin, alifVar.c)));
            case 4:
                return ((defpackage.altp) obj).f(((defpackage.amcp) this.a).b);
            case 5:
                defpackage.alig aligVar3 = (defpackage.alig) obj;
                j$.util.stream.Stream stream2 = j$.util.Collection.-EL.stream((java.util.Collection) this.a);
                j$.util.Objects.requireNonNull(aligVar3);
                return stream2.filter(new defpackage.amcc(aligVar3, i));
            case 6:
                defpackage.alig aligVar4 = (defpackage.alig) obj;
                j$.util.stream.Stream stream3 = j$.util.Collection.-EL.stream((java.util.Collection) this.a);
                j$.util.Objects.requireNonNull(aligVar4);
                return stream3.filter(new defpackage.amcc(aligVar4, i));
            case 7:
                defpackage.alig aligVar5 = (defpackage.alig) obj;
                j$.util.stream.Stream stream4 = j$.util.Collection.-EL.stream(((aiga) this.a).a("output_key"));
                j$.util.Objects.requireNonNull(aligVar5);
                return stream4.filter(new defpackage.amcc(aligVar5, 11)).map(new defpackage.amcr(aligVar5, 3)).map(new defpackage.amcu(10));
            case 8:
                return ((j$.util.stream.Stream) obj).max((java.util.Comparator) this.a);
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                aigf aigfVar = defpackage.amef.a;
                return java.lang.Integer.valueOf((((aify) this.a).size() - 1) - ((java.lang.Integer) ((java.util.Map.Entry) obj).getKey()).intValue());
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                aigf aigfVar2 = defpackage.amef.a;
                return java.lang.Integer.valueOf((((aify) this.a).size() - 1) - ((java.lang.Integer) ((java.util.Map.Entry) obj).getValue()).intValue());
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                java.lang.Integer num = (java.lang.Integer) obj;
                return java.lang.Integer.valueOf(num.intValue() + j$.util.Collection.-EL.stream((java.util.Collection) this.a).limit(num.intValue() + 1).mapToInt(new defpackage.amdt(2)).sum());
            case 12:
                return ((defpackage.altp) obj).a(((java.lang.String) this.a).length());
            default:
                return (java.lang.Integer) this.a.get(((java.lang.Integer) obj).intValue());
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
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
