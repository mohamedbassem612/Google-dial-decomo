package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class amdk implements java.util.function.Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ amdk(int i) {
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
                return java.lang.Integer.valueOf(((defpackage.amdw) obj).a().a);
            case 1:
                amdx amdxVar = new amdx();
                amdxVar.b((defpackage.amgf) obj);
                return amdxVar.a();
            case 2:
                return (j$.util.stream.Stream) obj;
            case 3:
                return java.lang.Integer.valueOf(((defpackage.amdz) obj).a().a);
            case 4:
                return (java.lang.String) ((java.util.Map.Entry) obj).getKey();
            case 5:
                defpackage.alig aligVar = (defpackage.alig) ((java.util.Map.Entry) obj).getValue();
                java.lang.String str = aligVar.a;
                java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\[FOREIGN\\-LANGUAGE\\][,.]*$").matcher(str);
                if (!matcher.find()) {
                    return aligVar;
                }
                java.lang.String strSubstring = str.substring(0, matcher.start() - 1);
                alif alifVar = aligVar.b;
                int i = alifVar.a;
                return new defpackage.alig(strSubstring, new alif(i, (matcher.start() + i) - 1, alifVar.c));
            case 6:
                return (aify) ((j$.util.stream.Stream) obj).collect(aido.a);
            case 7:
                amdx amdxVar2 = new amdx();
                amdxVar2.b((defpackage.amgf) obj);
                return amdxVar2.a();
            case 8:
                return ((defpackage.alig) ((j$.util.Optional) obj).get()).a;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return (java.lang.String) defpackage.amev.l((java.lang.String) obj).orElse("");
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return java.util.regex.Pattern.quote((java.lang.String) obj);
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                int i2 = defpackage.amdu.a;
                return java.text.MessageFormat.format("(?:{0}[,.]?)", (java.lang.String) obj);
            case 12:
                int i3 = defpackage.amdu.a;
                amdx amdxVar3 = new amdx();
                amdxVar3.d((defpackage.amgc) obj);
                return amdxVar3.c();
            case 13:
                return java.lang.Integer.valueOf(((defpackage.amcf) obj).a());
            case 14:
                java.lang.String str2 = (java.lang.String) obj;
                return (java.lang.String) defpackage.amef.a.getOrDefault(str2, str2);
            case 15:
                return (java.lang.Integer) ((java.util.Map.Entry) obj).getValue();
            case 16:
                return (defpackage.altp) ((j$.util.Optional) obj).get();
            case 17:
                return j$.util.Collection.-EL.stream((java.util.List) obj);
            case 18:
                return defpackage.amev.b.j(defpackage.amev.m((java.lang.String) obj));
            case 19:
                defpackage.amce amceVar = (defpackage.amce) obj;
                return amceVar.e().substring(amceVar.c.intValue()).trim();
            default:
                return ((defpackage.amce) obj).e();
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
