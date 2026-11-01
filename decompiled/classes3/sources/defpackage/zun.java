package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class zun implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
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
        return j$.util.function.Predicate.-CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
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
        return j$.util.function.Predicate.-CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
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
        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        int iAS;
        switch (this.$cid) {
            case 0:
                return ((com.google.android.gms.wearable.internal.NodeParcelable) obj).d;
            case 1:
                if (((java.lang.Integer) obj).intValue() != 13) {
                    return false;
                }
                break;
            case 2:
                com.google.android.gms.duokit.RemoteUserReachability remoteUserReachability = (com.google.android.gms.duokit.RemoteUserReachability) obj;
                if (remoteUserReachability.c != 0) {
                    return false;
                }
                int i = remoteUserReachability.b;
                if (i != 0 && i != 1) {
                    return false;
                }
                break;
            case 3:
                akjc akjcVar = (akjc) obj;
                aiof aiofVar = defpackage.acjy.ak;
                defpackage.akix akixVar = akjcVar.c == 14 ? (defpackage.akix) akjcVar.d : defpackage.akix.a;
                return (akixVar.b == 3 ? (defpackage.akjl) akixVar.c : defpackage.akjl.a).d;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                akjc akjcVar2 = (akjc) obj;
                defpackage.akix akixVar2 = akjcVar2.c == 14 ? (defpackage.akix) akjcVar2.d : defpackage.akix.a;
                if ((akixVar2.b == 3 ? (defpackage.akjl) akixVar2.c : defpackage.akjl.a).c.isEmpty()) {
                    return false;
                }
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((java.io.File) obj).isDirectory();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                if ((((defpackage.aphf) obj).b & 2048) == 0) {
                    return false;
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return j$.util.Objects.nonNull((aitt) obj);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return false;
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                int iAS2 = a.aS(((akya) obj).c);
                if (iAS2 == 0 || iAS2 != 3) {
                    return false;
                }
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                int iAS3 = a.aS(((akya) obj).c);
                if (iAS3 == 0 || iAS3 != 3) {
                    return false;
                }
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                int iAS4 = a.aS(((akya) obj).c);
                if (iAS4 == 0 || iAS4 != 2) {
                    return false;
                }
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int iAS5 = a.aS(((akya) obj).c);
                if (iAS5 == 0 || iAS5 != 2) {
                    return false;
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                akya akyaVar = (akya) obj;
                int iAS6 = a.aS(akyaVar.c);
                if ((iAS6 == 0 || iAS6 != 3) && ((iAS = a.aS(akyaVar.c)) == 0 || iAS != 4)) {
                    return false;
                }
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((java.lang.Integer) obj).equals(73833047);
            case 15:
                int iAS7 = a.aS(((akya) obj).c);
                if (iAS7 == 0 || iAS7 != 5) {
                    return false;
                }
                break;
            case 16:
                if (((java.lang.Integer) obj) == null) {
                    return false;
                }
                break;
            case 17:
                return anty.aD((java.lang.String) obj);
            case 18:
                if (((java.lang.String) obj).matches("Disclosure[1-9]")) {
                    return false;
                }
                break;
            case 19:
                alnb alnbVarB = alnb.b(((almz) obj).c);
                if (alnbVarB == null) {
                    alnbVarB = alnb.a;
                }
                return alnbVarB.equals(alnb.b);
            default:
                if (((alkn) obj).b.isEmpty()) {
                    return false;
                }
                break;
        }
        return true;
    }
}
