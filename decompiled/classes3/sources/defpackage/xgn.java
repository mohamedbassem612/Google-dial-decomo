package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xgn implements aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ xgn(int i) {
        this.$cid = i;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                java.lang.annotation.Annotation annotation = (java.lang.annotation.Annotation) obj;
                aooh.f(annotation, "it");
                return new defpackage.xgj((com.android.onboarding.contracts.annotations.OnboardingNode) annotation);
            case 1:
                java.lang.String str = (java.lang.String) obj;
                aooh.f(str, "p");
                return new aorg("^" + ajsz.cr(aoov.R(str, new char[]{'*'}), ".*", (java.lang.CharSequence) null, (java.lang.CharSequence) null, new ukw(20), 30) + '$');
            case 2:
                aope aopeVar = defpackage.xhd.a;
                aooh.f((ecp) obj, "it");
                return dzk.t(new dzk[0]);
            case 3:
                defpackage.xiw xiwVar = (defpackage.xiw) obj;
                defpackage.xhr xhrVar = defpackage.xhr.a;
                aooh.f(xiwVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_NODE);
                return xiwVar.getNodeName() + '(' + xiwVar.d() + ')';
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int i = defpackage.xkx.a;
                aooh.f((defpackage.xke) obj, "it");
                return java.lang.Boolean.TRUE;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.annotation.Annotation annotation2 = (java.lang.annotation.Annotation) obj;
                aooh.f(annotation2, "it");
                return new defpackage.xgj((com.android.onboarding.contracts.annotations.OnboardingNode) annotation2);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.annotation.Annotation annotation3 = (java.lang.annotation.Annotation) obj;
                aooh.f(annotation3, "it");
                return new defpackage.xnp((defpackage.xns) annotation3);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aoqc[] aoqcVarArr = defpackage.xor.a;
                aooh.f((ecp) obj, "it");
                return dzk.t(new dzk[0]);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return defpackage.xff.p(obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.lang.Integer num = (java.lang.Integer) obj;
                num.intValue();
                return defpackage.xff.p(num);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Long l = (java.lang.Long) obj;
                l.longValue();
                return defpackage.xff.p(l);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.Double d = (java.lang.Double) obj;
                d.doubleValue();
                return defpackage.xff.p(d);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.booleanValue();
                return defpackage.xff.p(bool);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.Short sh = (java.lang.Short) obj;
                sh.shortValue();
                return defpackage.xff.p(sh);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.Character ch = (java.lang.Character) obj;
                ch.charValue();
                return defpackage.xff.p(ch);
            case 15:
                java.lang.Float f = (java.lang.Float) obj;
                f.floatValue();
                return defpackage.xff.p(f);
            case 16:
                return defpackage.xff.p(obj);
            case 17:
                java.lang.String str2 = (java.lang.String) obj;
                int i2 = defpackage.xox.a;
                aooh.f(str2, "it");
                if (str2 == null) {
                    aooh.i("<this>");
                }
                if (str2.length() != 0) {
                    return java.lang.String.valueOf(str2.charAt(0));
                }
                throw new java.util.NoSuchElementException("Char sequence is empty.");
            case 18:
                ((java.lang.Integer) obj).intValue();
                return null;
            case 19:
                throw new java.lang.IllegalStateException("Missing persistable list value at index " + ((java.lang.Integer) obj).intValue());
            default:
                aooh.f((java.util.Map) obj, "it");
                return aojh.a;
        }
    }
}
