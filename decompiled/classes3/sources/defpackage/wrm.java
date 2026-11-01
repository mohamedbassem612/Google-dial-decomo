package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wrm implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;

    public /* synthetic */ wrm(int i) {
        this.$cid = i;
    }

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
        switch (this.$cid) {
            case 0:
                aimz aimzVar = wrp.a;
                defpackage.wqt wqtVar = ((defpackage.wqp) obj).e;
                if (wqtVar == null) {
                    wqtVar = defpackage.wqt.a;
                }
                defpackage.wgu wguVar = wqtVar.d;
                if (wguVar == null) {
                    wguVar = defpackage.wgu.a;
                }
                return wguVar.d;
            case 1:
                return ((j$.util.Optional) obj).isPresent();
            case 2:
                aimz aimzVar2 = defpackage.wxb.a;
                double d = ((defpackage.wwm) obj).d;
                if (d < 0.0d || d > 1.0d) {
                    return true;
                }
                break;
            case 3:
                aigf aigfVar = defpackage.wxb.d;
                defpackage.wxk wxkVarB = defpackage.wxk.b(((defpackage.wwm) obj).c);
                if (wxkVarB == null) {
                    wxkVarB = defpackage.wxk.UNKNOWN_SOUND_EVENT_TYPE;
                }
                if (!aigfVar.containsKey(wxkVarB)) {
                    return true;
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                if (((defpackage.wyz) obj).c != null) {
                    return true;
                }
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return j$.util.Objects.nonNull((java.lang.Long) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((defpackage.xab) obj).b.isEmpty();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aimz aimzVar3 = wzh.a;
                return ((defpackage.wyz) obj).c.h;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return "detection_model".equals(((defpackage.acuh) obj).c);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                int iJ = wsc.j(((defpackage.xbo) ((defpackage.apqr) obj).a(defpackage.xbo.class)).aZ().c.c);
                if (iJ == 0) {
                    throw null;
                }
                int i = iJ - 1;
                if (i == 2 || i == 3 || i == 4 || i == 5 || i == 6) {
                    return true;
                }
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return j$.util.Objects.nonNull((java.lang.String) obj);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                int i2 = defpackage.ynq.h;
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ((zjm) obj).f().isPresent();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((j$.util.Optional) obj).isPresent();
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((defpackage.uyg) obj).t().isPresent();
            case 15:
                return j$.util.Objects.nonNull((j$.util.Optional) obj);
            case 16:
                return ((j$.util.Optional) obj).isPresent();
            case 17:
                if (((defpackage.zpl) ((defpackage.apqr) obj).a(defpackage.zpl.class)).c().getParent() == null) {
                    return true;
                }
                break;
            case 18:
                return rs$.ExternalSyntheticApiModelOutline0.m(((defpackage.zpl) ((defpackage.apqr) obj).a(defpackage.zpl.class)).c());
            case 19:
                if (((defpackage.zpo) obj) == defpackage.zpo.f) {
                    return true;
                }
                break;
            default:
                if (((defpackage.zpo) obj) == defpackage.zpo.l) {
                    return true;
                }
                break;
        }
        return false;
    }
}
