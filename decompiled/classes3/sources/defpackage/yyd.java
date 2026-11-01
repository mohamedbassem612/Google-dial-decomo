package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class yyd extends aomh implements aonj {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.yyf c;
    final /* synthetic */ java.lang.String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyd(defpackage.yyf yyfVar, java.lang.String str, aoln aolnVar) {
        super(1, aolnVar);
        this.c = yyfVar;
        this.d = str;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.yyd(this.c, this.d, (aoln) obj).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        java.lang.Object obj2;
        defpackage.zbr zbrVar;
        aolu yxoVar = aolu.a;
        if (this.b == 0) {
            aooc.af(obj);
            defpackage.yyf yyfVar = this.c;
            java.lang.String str = this.d;
            defpackage.yyf.a.b().l("com/google/android/callcoreshared/sharpie/scamdetection/impl/SharpieScamDetectorImpl", "registerOnNewTranscript", 149, "SharpieScamDetectorImpl.kt").w("onNewTranscript size: [%s]", str.length());
            yyfVar.g.l(new zbq(defpackage.zbr.ai));
            if (!aeun.d(yyfVar.d)) {
                yyfVar.c.f(yyfVar.d, defpackage.yyf.b, 1);
            }
            yyfVar.d = yyfVar.c.b();
            this.a = yyfVar;
            this.b = 1;
            java.lang.Object objB = yyfVar.b(str, this);
            if (objB != yxoVar) {
                obj2 = yyfVar;
                obj = objB;
            }
            return yxoVar;
        }
        obj2 = this.a;
        aooc.af(obj);
        defpackage.zaf zafVar = (defpackage.zaf) obj;
        if (zafVar instanceof defpackage.zab) {
            defpackage.zab zabVar = (defpackage.zab) zafVar;
            yxoVar = new defpackage.yxn(zabVar.a, zabVar.b);
        } else if (zafVar instanceof defpackage.zad) {
            aazc aazcVar = ((defpackage.yyf) obj2).f;
            j$.time.Instant instantNow = j$.time.Instant.now();
            aooh.e(instantNow, "instant(...)");
            yxoVar = new defpackage.yxp(instantNow, ((defpackage.zad) zafVar).a);
        } else {
            if (!(zafVar instanceof defpackage.zac) && !aooh.n(zafVar, defpackage.zae.a)) {
                throw new aois();
            }
            yxoVar = new defpackage.yxo(zafVar.a());
        }
        defpackage.yyf yyfVar2 = this.c;
        zbq zbqVar = new zbq(defpackage.zbr.ak);
        zzx zzxVar = yyfVar2.g;
        zzxVar.l(zbqVar);
        j$.util.Objects.checkIndex(0, 4);
        if (yxoVar instanceof defpackage.yxn) {
            aimw aimwVarL = defpackage.yyf.a.b().l("com/google/android/callcoreshared/sharpie/scamdetection/impl/SharpieScamDetectorImpl", "handleDetectionResultSideEffects", 132, "SharpieScamDetectorImpl.kt");
            defpackage.yxy yxyVar = ((defpackage.yxn) yxoVar).a;
            aimwVarL.y("Failed to detect scam: %s", yxyVar);
            zzxVar.l(new zbq(defpackage.zbr.al));
            if (aooh.n(yxyVar, defpackage.yxx.a)) {
                zbrVar = defpackage.zbr.z;
            } else if (yxyVar instanceof defpackage.yxu) {
                switch (((defpackage.yxu) yxyVar).a.ordinal()) {
                    case 0:
                        zbrVar = defpackage.zbr.C;
                        break;
                    case 1:
                        zbrVar = defpackage.zbr.D;
                        break;
                    case 2:
                        zbrVar = defpackage.zbr.E;
                        break;
                    case 3:
                        zbrVar = defpackage.zbr.F;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        zbrVar = defpackage.zbr.G;
                        break;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        zbrVar = defpackage.zbr.H;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        zbrVar = defpackage.zbr.I;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        zbrVar = defpackage.zbr.J;
                        break;
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                        zbrVar = defpackage.zbr.K;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                        zbrVar = defpackage.zbr.L;
                        break;
                    case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                        zbrVar = defpackage.zbr.M;
                        break;
                    case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                        zbrVar = defpackage.zbr.N;
                        break;
                    case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                        zbrVar = defpackage.zbr.O;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                        zbrVar = defpackage.zbr.P;
                        break;
                    case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                        zbrVar = defpackage.zbr.Q;
                        break;
                    case 15:
                        zbrVar = defpackage.zbr.R;
                        break;
                    case 16:
                        zbrVar = defpackage.zbr.S;
                        break;
                    case 17:
                        zbrVar = defpackage.zbr.T;
                        break;
                    case 18:
                        zbrVar = defpackage.zbr.U;
                        break;
                    case 19:
                        zbrVar = defpackage.zbr.V;
                        break;
                    case 20:
                        zbrVar = defpackage.zbr.W;
                        break;
                    case 21:
                        zbrVar = defpackage.zbr.X;
                        break;
                    case 22:
                        zbrVar = defpackage.zbr.Y;
                        break;
                    case 23:
                        zbrVar = defpackage.zbr.Z;
                        break;
                    case 24:
                        zbrVar = defpackage.zbr.aa;
                        break;
                    case 25:
                        zbrVar = defpackage.zbr.ab;
                        break;
                    default:
                        throw new aois();
                }
            } else {
                if (!(yxyVar instanceof defpackage.yxw)) {
                    throw new aois();
                }
                int i = ((defpackage.yxw) yxyVar).a;
                defpackage.yxv yxvVar = defpackage.yxv.NOT_CONFIGURED;
                zbrVar = i + (-1) != 0 ? defpackage.zbr.B : defpackage.zbr.A;
            }
            zzxVar.l(new zbq(zbrVar));
        } else if (yxoVar instanceof defpackage.yxp) {
            zzxVar.l(new zbq(defpackage.zbr.aj));
            zzxVar.l(new zbs(defpackage.zbt.c));
        } else if (!(yxoVar instanceof defpackage.yxo)) {
            throw new aois();
        }
        return yxoVar;
    }
}
