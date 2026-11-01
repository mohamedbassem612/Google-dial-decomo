package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class thw implements java.util.function.Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ thw(int i) {
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
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
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
                return java.lang.Long.valueOf(((mfj) obj).a);
            case 1:
                return java.lang.Long.valueOf(((defpackage.thz) obj).a);
            case 2:
                return (java.lang.Long) ((java.util.Map.Entry) obj).getKey();
            case 3:
                return ((java.lang.Long) obj).toString();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                long j = ((defpackage.tin) obj).a;
                aimz aimzVar = defpackage.tib.a;
                return java.lang.String.valueOf(j);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((java.lang.Long) obj).toString();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((defpackage.tiz) obj).a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((android.content.ContentValues) obj).getAsString("call_mapping_id");
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((defpackage.taq) obj).b;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((defpackage.taq) obj).a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return java.lang.Long.toString(((java.lang.Long) obj).longValue());
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return j$.util.Collection.-EL.stream(((defpackage.upt) obj).l).map(new defpackage.thw(12));
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ((defpackage.upl) obj).c;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return anty.aE(obj);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                aimz aimzVar2 = defpackage.uqp.a;
                return new defpackage.uqs((java.lang.String) entry.getKey(), ((java.lang.Double) entry.getValue()).doubleValue());
            case 15:
                defpackage.uqs uqsVar = (defpackage.uqs) obj;
                java.lang.String str = uqsVar.a;
                aimz aimzVar3 = defpackage.uqp.a;
                if (str != null) {
                    return new defpackage.uqi(str, uqsVar.b);
                }
                throw new java.lang.NullPointerException("Null normalizedNumber");
            case 16:
                return j$.util.Collection.-EL.stream((aify) obj);
            case 17:
                alcf alcfVar = ((defpackage.utq) obj).c;
                return alcfVar == null ? alcf.a : alcfVar;
            case 18:
                return (defpackage.uty) ((java.util.Map.Entry) obj).getKey();
            case 19:
                return (defpackage.utx) ((aoin) ((java.util.Map.Entry) obj).getValue()).a();
            default:
                return j$.util.Collection.-EL.stream((aify) obj);
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
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
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
