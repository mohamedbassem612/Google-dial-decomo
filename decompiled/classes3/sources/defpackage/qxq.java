package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qxq implements java.util.Comparator {
    private final /* synthetic */ int $cid;

    public qxq(int i) {
        this.$cid = i;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return ajsz.au(((defpackage.quf) obj).g, ((defpackage.quf) obj2).g);
            case 1:
                return ajsz.au(java.lang.Integer.valueOf(((defpackage.qib) obj).a.I), java.lang.Integer.valueOf(((defpackage.qib) obj2).a.I));
            case 2:
                defpackage.que queVarB = defpackage.que.b(((defpackage.qxp) obj).c);
                if (queVarB == null) {
                    queVarB = defpackage.que.UNKNOWN;
                }
                defpackage.que queVarB2 = defpackage.que.b(((defpackage.qxp) obj2).c);
                if (queVarB2 == null) {
                    queVarB2 = defpackage.que.UNKNOWN;
                }
                return ajsz.au(queVarB, queVarB2);
            case 3:
                defpackage.qug qugVarB = defpackage.qug.b(((defpackage.quf) obj).e);
                if (qugVarB == null) {
                    qugVarB = defpackage.qug.BUTTON_UNKNOWN;
                }
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(qugVarB.H);
                defpackage.qug qugVarB2 = defpackage.qug.b(((defpackage.quf) obj2).e);
                if (qugVarB2 == null) {
                    qugVarB2 = defpackage.qug.BUTTON_UNKNOWN;
                }
                return ajsz.au(numValueOf, java.lang.Integer.valueOf(qugVarB2.H));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ajsz.au(java.lang.Integer.valueOf(((defpackage.rjf) obj).a.a()), java.lang.Integer.valueOf(((defpackage.rjf) obj2).a.a()));
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return java.lang.Long.compare(((android.service.notification.StatusBarNotification) obj).getPostTime(), ((android.service.notification.StatusBarNotification) obj2).getPostTime());
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ajsz.au(java.lang.Long.valueOf(((defpackage.zeu) obj).c), java.lang.Long.valueOf(((defpackage.zeu) obj2).c));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ajsz.au(java.lang.Long.valueOf(((defpackage.zeu) obj).c), java.lang.Long.valueOf(((defpackage.zeu) obj2).c));
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ajsz.au((java.lang.Long) ((java.util.Map.Entry) obj2).getValue(), (java.lang.Long) ((java.util.Map.Entry) obj).getValue());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ajsz.au(java.lang.Integer.valueOf(((defpackage.sts) obj).a().a()), java.lang.Integer.valueOf(((defpackage.sts) obj2).a().a()));
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ajsz.au(java.lang.Integer.valueOf(((defpackage.tel) obj).a().h), java.lang.Integer.valueOf(((defpackage.tel) obj2).a().h));
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return ajsz.au(java.lang.Integer.valueOf(((defpackage.teu) obj).a().ordinal()), java.lang.Integer.valueOf(((defpackage.teu) obj2).a().ordinal()));
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.upt uptVar = ((defpackage.uqb) obj).a;
                int i = uptVar.d;
                defpackage.upt uptVar2 = ((defpackage.uqb) obj2).a;
                int i2 = uptVar2.d;
                return ((i > 0 || i2 > 0) && i != i2) ? i - i2 : uptVar.o.compareTo(uptVar2.o);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((com.google.android.gms.common.api.Scope) obj).b.compareTo(((com.google.android.gms.common.api.Scope) obj2).b);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ajsz.au(java.lang.Integer.valueOf(afsq.bk((defpackage.abfo) obj)), java.lang.Integer.valueOf(afsq.bk((defpackage.abfo) obj2)));
            case 15:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                aooh.f(bArr, "l");
                aooh.f(bArr2, "r");
                int length = bArr.length;
                int length2 = bArr2.length;
                if (length != length2) {
                    return length - length2;
                }
                for (int i3 = 0; i3 < length; i3++) {
                    byte b = bArr[i3];
                    byte b2 = bArr2[i3];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 16:
                return abrz.H((defpackage.acwb) obj).compareTo(abrz.H((defpackage.acwb) obj2));
            case 17:
                return abrz.H(((defpackage.adac) obj).a).compareTo(abrz.H(((defpackage.adac) obj2).a));
            case 18:
                return abrz.H((defpackage.acwe) obj).compareTo(abrz.H((defpackage.acwe) obj2));
            case 19:
                return java.lang.Long.compare(((java.io.File) obj2).lastModified(), ((java.io.File) obj).lastModified());
            default:
                return ((com.google.android.libraries.micore.superpacks.common.PackManifest) obj).p().c(((com.google.android.libraries.micore.superpacks.common.PackManifest) obj2).p());
        }
    }
}
