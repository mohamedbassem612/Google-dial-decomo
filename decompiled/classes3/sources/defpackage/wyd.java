package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wyd implements java.util.function.Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ wyd(int i) {
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
                return java.lang.Long.valueOf(((defpackage.wyz) obj).a);
            case 1:
                defpackage.wwm wwmVar = (defpackage.wwm) obj;
                aimz aimzVar = defpackage.wxb.a;
                akzx akzxVarM = defpackage.alra.a.m();
                aigf aigfVar = defpackage.wxb.d;
                defpackage.wxk wxkVarB = defpackage.wxk.b(wwmVar.c);
                if (wxkVarB == null) {
                    wxkVarB = defpackage.wxk.UNKNOWN_SOUND_EVENT_TYPE;
                }
                defpackage.alrb alrbVar = (defpackage.alrb) aigfVar.get(wxkVarB);
                akzxVarM.u();
                defpackage.alra alraVar = (defpackage.alra) akzxVarM.b;
                alraVar.c = alrbVar.f;
                alraVar.b |= 1;
                double d = wwmVar.d;
                akzxVarM.u();
                defpackage.alra alraVar2 = (defpackage.alra) akzxVarM.b;
                alraVar2.b |= 2;
                alraVar2.d = d;
                return (defpackage.alra) akzxVarM.p();
            case 2:
                return ((defpackage.wyz) obj).c;
            case 3:
                return anar.r(obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return java.lang.Long.valueOf(((kdy) obj).a);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return (defpackage.wyz) obj;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return java.lang.Long.valueOf(((defpackage.wyz) obj).a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return (defpackage.wyz) obj;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return java.lang.Long.valueOf(((kdy) obj).b);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return java.lang.Long.valueOf(((defpackage.wyz) obj).a);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.yov yovVar = (defpackage.yov) obj;
                return java.lang.String.format(java.util.Locale.getDefault(), "(%d, %d)", java.lang.Integer.valueOf(yovVar.b), java.lang.Integer.valueOf(yovVar.c));
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                com.google.android.apps.aicore.aidl.CitationSource citationSource = (com.google.android.apps.aicore.aidl.CitationSource) obj;
                int i = citationSource.a;
                int i2 = citationSource.b;
                java.lang.String str = citationSource.c;
                java.lang.String str2 = citationSource.d;
                int i3 = defpackage.ynq.h;
                return new defpackage.ynj(i, i2, str, str2);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return java.lang.Float.valueOf(((defpackage.you) obj).b);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return java.lang.Integer.valueOf(((defpackage.xqh) ((akzx) obj).b).k);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return java.lang.Long.valueOf(((defpackage.xqh) ((akzx) obj).b).l);
            case 15:
                return java.lang.Integer.valueOf(((defpackage.xqh) ((akzx) obj).b).m);
            case 16:
                return java.lang.Long.valueOf(((defpackage.xqh) ((akzx) obj).b).n);
            case 17:
                return java.lang.Integer.valueOf(((defpackage.xqh) ((akzx) obj).b).o);
            case 18:
                return java.lang.Long.valueOf(((defpackage.xqh) ((akzx) obj).b).c);
            case 19:
                return 0;
            default:
                return java.lang.Long.valueOf(((defpackage.xqh) ((akzx) obj).b).d);
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
