package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class sqj implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;

    public /* synthetic */ sqj(int i) {
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

    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object, vfe] */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.Object, vfe] */
    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                int i = defpackage.sql.e;
                return ((defpackage.spd) obj).o;
            case 1:
                int i2 = defpackage.sql.e;
                return ((defpackage.spd) obj).o;
            case 2:
                defpackage.spe speVar = ((defpackage.spn) obj).c;
                if (speVar == null) {
                    speVar = defpackage.spe.a;
                }
                if (!speVar.equals(defpackage.spe.a)) {
                    return true;
                }
                break;
            case 3:
                aimz aimzVar = sqq.a;
                defpackage.spe speVar2 = ((defpackage.spn) obj).d;
                if (speVar2 == null) {
                    speVar2 = defpackage.spe.a;
                }
                if (!speVar2.equals(defpackage.spe.a)) {
                    return true;
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return defpackage.sta.d.equals(((com.android.dialer.playback.CallRecordingPlayer) obj).b);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.tin tinVar = (defpackage.tin) obj;
                if (snl.as(tinVar) && tinVar.q) {
                    return true;
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                if (!((defpackage.tin) obj).o.isPresent()) {
                    return true;
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return "data".equals(((defpackage.acuh) obj).c);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                if (!((defpackage.utq) obj).d.isEmpty()) {
                    return true;
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((java.lang.Boolean) obj).booleanValue();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((java.lang.Boolean) obj).booleanValue();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return ((java.lang.String) obj).startsWith("VisualVoicemail_");
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                android.service.notification.StatusBarNotification statusBarNotification = (android.service.notification.StatusBarNotification) obj;
                if (!android.text.TextUtils.isEmpty(statusBarNotification.getTag()) && statusBarNotification.getTag().startsWith("VisualVoicemail_")) {
                    return true;
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                aimz aimzVar2 = vdo.a;
                if (((java.lang.Integer) obj).intValue() > 0) {
                    return true;
                }
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.vdg vdgVar = (defpackage.vdg) obj;
                if (vdgVar.e || !vdgVar.f) {
                    return true;
                }
                break;
            case 15:
                return defpackage.vff.a(obj);
            case 16:
                defpackage.vff vffVar = (defpackage.vff) obj;
                if (!((defpackage.vdg) vffVar.a).d && vffVar.b.b()) {
                    return true;
                }
                break;
            case 17:
                return defpackage.vff.a(obj);
            case 18:
                defpackage.vff vffVar2 = (defpackage.vff) obj;
                if (((defpackage.vdg) vffVar2.a).d && !vffVar2.b.b()) {
                    return true;
                }
                break;
            case 19:
                return ((defpackage.vdg) ((defpackage.vff) obj).a).f;
            default:
                return defpackage.vff.a(obj);
        }
        return false;
    }
}
