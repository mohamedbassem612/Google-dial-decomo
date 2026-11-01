package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class aite implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ aite(int i) {
        this.$cid = i;
        this.a = "_history";
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v13, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v61, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v63, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v65, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return new java.util.AbstractMap.SimpleImmutableEntry(obj, this.a);
            case 1:
                return a.j((aonj) this.a, obj);
            case 2:
                return ((aitr) this.a).a.a;
            case 3:
                return ((aitr) this.a).b.a;
            case 4:
                return this.a.a(obj);
            case 5:
                java.lang.Integer num = (java.lang.Integer) obj;
                return (java.lang.Integer) ((aigf) ((alic) this.a).c).getOrDefault(num, num);
            case 6:
                defpackage.alia aliaVar = (defpackage.alia) this.a;
                aigf aigfVar = aliaVar.f;
                defpackage.alii aliiVar = (defpackage.alii) obj;
                aimz aimzVar = defpackage.alij.a;
                int i = aliiVar.a;
                if (!aigfVar.containsKey(java.lang.Integer.valueOf(i))) {
                    defpackage.alij.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/bert/ml/TaggingModelClient", "convertBack", 502, "TaggingModelClient.java").v("start token is out of bounds.");
                    return new defpackage.alig("", new alif(i, aliiVar.b, aliiVar.c));
                }
                java.lang.Integer numC = defpackage.alij.c(aigfVar, i, "Start token is out of bounds.");
                java.lang.Integer numC2 = defpackage.alij.c(aigfVar, aliiVar.b, "End token is out of bounds.");
                ahyj ahyjVar = new ahyj(" ");
                aify aifyVar = aliaVar.e;
                java.lang.String strB = ahyjVar.b(aifyVar.b(numC.intValue(), numC2.intValue() + 1));
                int iSum = j$.util.Collection.-EL.stream(aifyVar).limit(numC.intValue()).mapToInt(new rar(16)).sum() + numC.intValue();
                if (defpackage.aknx.G(aliaVar.a.charAt(0))) {
                    iSum++;
                }
                return new defpackage.alig(strB, new alif(iSum, strB.length() + iSum, aliiVar.c));
            case 7:
                defpackage.almz almzVar = (defpackage.almz) obj;
                defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
                if (alnbVarB == null) {
                    alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
                }
                int iOrdinal = alnbVarB.ordinal();
                if (iOrdinal == 1) {
                    return j$.util.Optional.of(new defpackage.alkn(defpackage.alkm.b, defpackage.alkt.e(almzVar)));
                }
                if (iOrdinal != 5) {
                    return j$.util.Optional.empty();
                }
                j$.util.Optional optionalH = defpackage.alpv.h(almzVar, 2, this.a);
                return true == optionalH.isPresent() ? j$.util.Optional.ofNullable(new defpackage.alkn(defpackage.alkm.a, (java.lang.String) optionalH.get())) : optionalH;
            case 8:
                return ((defpackage.alkx) this.a).b.c((java.lang.String) obj);
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return java.lang.String.valueOf((java.lang.String) ((java.util.Map.Entry) obj).getKey()).concat((java.lang.String) this.a);
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return ((java.lang.String) this.a).concat(java.lang.String.valueOf((java.lang.String) ((java.util.Map.Entry) obj).getKey()));
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return ((defpackage.alkx) this.a).b.f((java.lang.String) obj);
            case 12:
                java.lang.CharSequence[] charSequenceArr = {this.a, (java.lang.String) obj};
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append((java.lang.CharSequence) charSequenceArr[0]);
                sb.append("/");
                sb.append((java.lang.CharSequence) charSequenceArr[1]);
                return sb.toString();
            case 13:
                defpackage.alpv alpvVar = defpackage.alqc.a;
                return this.a.a(obj);
            case 14:
                defpackage.alpv alpvVar2 = defpackage.alqc.a;
                return this.a.a(obj);
            case 15:
                defpackage.alpv alpvVar3 = defpackage.alqc.a;
                return this.a.a(obj);
            case 16:
                java.lang.Integer num2 = (java.lang.Integer) obj;
                return java.lang.Integer.valueOf(((java.lang.Integer) ((aify) this.a).get(num2.intValue())).intValue() + num2.intValue());
            case 17:
                java.lang.Integer num3 = (java.lang.Integer) obj;
                return java.lang.Integer.valueOf(((java.lang.Integer) ((aify) this.a).get(num3.intValue() + 1)).intValue() + num3.intValue());
            case 18:
                return java.lang.Integer.valueOf(((((java.lang.Double) obj).doubleValue() > ((defpackage.alty) this.a).a ? 1 : (((java.lang.Double) obj).doubleValue() == ((defpackage.alty) this.a).a ? 0 : -1)) ^ (-1)) >>> 31);
            case 19:
                return java.lang.Integer.valueOf(((java.util.concurrent.atomic.AtomicInteger) this.a).addAndGet(((java.lang.Integer) obj).intValue()));
            default:
                defpackage.alyi alyiVar = (defpackage.alyi) obj;
                if (alyiVar.c == ((defpackage.altd) this.a).c) {
                    akzx akzxVarP = alyiVar.p();
                    akzxVarP.u();
                    defpackage.alyi alyiVar2 = (defpackage.alyi) akzxVarP.b;
                    alyiVar2.e = 1;
                    alyiVar2.b |= 4;
                    return (defpackage.alyi) akzxVarP.p();
                }
                akzx akzxVarP2 = alyiVar.p();
                akzxVarP2.u();
                defpackage.alyi alyiVar3 = (defpackage.alyi) akzxVarP2.b;
                alyiVar3.e = 3;
                alyiVar3.b |= 4;
                return (defpackage.alyi) akzxVarP2.p();
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

    public /* synthetic */ aite(int i, byte[] bArr) {
        this.$cid = i;
        this.a = "current__";
    }

    public /* synthetic */ aite(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
