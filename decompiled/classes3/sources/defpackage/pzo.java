package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pzo {
    private static final aimz a = aimz.i("com/android/dialer/incall/incallbasesemanticlogger/InCallBaseSemanticLogger");
    private final zpm b;
    private final zjm c;
    private final gpd d;

    public pzo(gpd gpdVar, zpm zpmVar, zjm zjmVar) {
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(zpmVar, "callScopes");
        aooh.f(zjmVar, "callId");
        this.d = gpdVar;
        this.b = zpmVar;
        this.c = zjmVar;
    }

    private static final boolean e(zpm zpmVar) {
        return zpmVar.d().size() == 1;
    }

    private final void f(zas zasVar, int i) {
        java.lang.String str;
        switch (i - 2) {
            case 1:
                zasVar.b(mce.Q);
                break;
            case 2:
                zasVar.b(mce.S);
                zasVar.a(mcd.r);
                break;
            case 3:
                zasVar.b(mce.d);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                zpm zpmVar = this.b;
                if (e(zpmVar) && zpmVar.a().size() == 1) {
                    zasVar.b(mce.aN);
                }
                zasVar.b(mce.U);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
            default:
                aimw aimwVarL = a.d().l("com/android/dialer/incall/incallbasesemanticlogger/InCallBaseSemanticLogger", "logEvent", 111, "InCallBaseSemanticLogger.kt");
                switch (i) {
                    case 3:
                        str = "CORE_SEMANTIC_EVENT_INCOMING_CALL_ADDED";
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        str = "CORE_SEMANTIC_EVENT_CALL_REMOVED";
                        break;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        str = "CORE_SEMANTIC_EVENT_CALL_ADDED";
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        str = "CORE_SEMANTIC_EVENT_CALL_CONNECTED";
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    default:
                        str = "null";
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                        str = "CORE_SEMANTIC_EVENT_AUDIO_ROUTE_REQUESTED";
                        break;
                    case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                        str = "CORE_SEMANTIC_EVENT_MUTE_STATE_REQUESTED";
                        break;
                    case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                        str = "CORE_SEMANTIC_EVENT_CALL_ADDED_EXTERNAL";
                        break;
                    case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                        str = "CORE_SEMANTIC_EVENT_CALL_HOLD_REQUESTED";
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                        str = "CORE_SEMANTIC_EVENT_CALL_UNHOLD_REQUESTED";
                        break;
                    case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                        str = "CORE_SEMANTIC_EVENT_IS_EMERGENCY_NUMBER";
                        break;
                    case 15:
                        str = "CORE_SEMANTIC_EVENT_CALL_ALREADY_DISCONNECTED";
                        break;
                    case 16:
                        str = "CORE_SEMANTIC_EVENT_CALL_DISCONNECTED";
                        break;
                    case 17:
                        str = "CORE_SEMANTIC_EVENT_ANSWER_CALL_TELECOM";
                        break;
                    case 18:
                        str = "CORE_SEMANTIC_EVENT_ANSWER_CALL_ALREADY_ACTIVE";
                        break;
                    case 19:
                        str = "CORE_SEMANTIC_EVENT_ANSWER_CALL_INTERCEPTED";
                        break;
                    case 20:
                        str = "CORE_SEMANTIC_EVENT_ANSWER_CALL_INTERCEPTED_ACTIVE";
                        break;
                    case 21:
                        str = "CORE_SEMANTIC_EVENT_ANSWER_CALL_ANSWERED";
                        break;
                    case 22:
                        str = "CORE_SEMANTIC_EVENT_ANSWER_CALL_ALREADY_DISCONNECTING";
                        break;
                }
                aimwVarL.y("Invalid InCall-Core semantic event received: %s", str);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                zasVar.b(mce.aW);
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                zasVar.b(mce.ba);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                zasVar.b(mce.bx);
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                zasVar.b(mce.be);
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                zasVar.b(mce.bj);
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                zasVar.b(mce.by);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                zpm zpmVar2 = this.b;
                if (zpmVar2.d().isEmpty()) {
                    zasVar.b(mce.hv);
                }
                if (e(zpmVar2)) {
                    zasVar.b(mce.aQ);
                }
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                zasVar.b(mce.T);
                break;
            case 15:
                zasVar.b(mce.fl);
                break;
            case 16:
                zasVar.b(mce.fm);
                break;
            case 17:
                zasVar.b(mce.fo);
                break;
            case 18:
                zasVar.b(mce.fp);
                break;
            case 19:
                zasVar.b(mce.fq);
                break;
            case 20:
                zasVar.b(mce.fn);
                break;
        }
    }

    private static final void g(zas zasVar, int i) {
        mcd mcdVar;
        int i2 = i - 2;
        if (i2 == 1) {
            mcdVar = mcd.u;
        } else if (i2 != 2) {
            mcdVar = i2 != 3 ? mcd.C : mcd.B;
        } else {
            mcdVar = mcd.x;
        }
        zasVar.a(mcdVar);
    }

    public final void a(android.telecom.Call call, int i) {
        g(this.d.j(call != null ? this.c.e(call) : null), i);
    }

    public final void b(java.lang.String str, int i) {
        g(this.d.i(str), 4);
    }

    public final void c(android.telecom.Call call, int i) {
        f(this.d.j(call != null ? this.c.e(call) : null), i);
    }

    public final void d(java.lang.String str, int i) {
        f(this.d.i(str), i);
    }
}
