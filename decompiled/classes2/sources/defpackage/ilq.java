package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ilq implements twh {
    public final java.util.Set a;
    public final java.util.Map b;
    public final java.util.Map c;
    private final android.content.Context d;

    public ilq(android.content.Context context, java.util.Set set, java.util.Map map, java.util.Map map2) {
        this.d = context;
        this.a = set;
        this.b = map;
        this.c = map2;
    }

    private final void g(java.lang.Object obj, java.lang.Long l, aono aonoVar, java.lang.String str) {
        aoov.an(((ilr) aooc.ar(this.d, ilr.class)).ii(), (aolr) null, 0, new defpackage.ilj(this, aonoVar, obj, str, l, null), 3);
    }

    public final void a(twg twgVar) {
        aooh.f(twgVar, "error");
        g(twgVar, null, defpackage.ilk.a, "onError: failed to notify listeners");
    }

    public final void b(j$.util.Optional optional) {
        aooh.f(optional, "transcription");
        g(optional, null, new defpackage.ill(null, 0), "onFinalTranscription: failed to notify listeners");
    }

    public final void c(tvx tvxVar) {
        aooh.f(tvxVar, "languageDetectionEvent");
        g(tvxVar, null, defpackage.ilm.a, "onOtherSodaEvent: failed to notify listeners");
    }

    public final void d(amle amleVar) {
        java.lang.Long lValueOf;
        aooh.f(amleVar, "sodaEvent");
        amkv amkvVar = amleVar.d;
        if (amkvVar == null) {
            amkvVar = amkv.a;
        }
        amlg amlgVar = amkvVar.c;
        if (amlgVar == null) {
            amlgVar = amlg.a;
        }
        if ((amlgVar.b & 4) != 0) {
            amkv amkvVar2 = amleVar.d;
            if (amkvVar2 == null) {
                amkvVar2 = amkv.a;
            }
            amlg amlgVar2 = amkvVar2.c;
            if (amlgVar2 == null) {
                amlgVar2 = amlg.a;
            }
            lValueOf = java.lang.Long.valueOf(amlgVar2.c);
        } else {
            lValueOf = null;
        }
        g(amleVar, lValueOf, defpackage.iln.a, "onOtherSodaEvent: failed to notify listeners");
    }

    public final void e(twj twjVar) {
        java.lang.Long lValueOf;
        aooh.f(twjVar, "transcription");
        amld amldVar = (twjVar.b == 2 ? (amle) twjVar.c : amle.a).c;
        if (amldVar == null) {
            amldVar = amld.a;
        }
        amlg amlgVar = (amldVar.b == 2 ? (amla) amldVar.c : amla.a).d;
        if (amlgVar == null) {
            amlgVar = amlg.a;
        }
        if ((amlgVar.b & 4) != 0) {
            amld amldVar2 = (twjVar.b == 2 ? (amle) twjVar.c : amle.a).c;
            if (amldVar2 == null) {
                amldVar2 = amld.a;
            }
            amlg amlgVar2 = (amldVar2.b == 2 ? (amla) amldVar2.c : amla.a).d;
            if (amlgVar2 == null) {
                amlgVar2 = amlg.a;
            }
            lValueOf = java.lang.Long.valueOf(amlgVar2.c);
        } else {
            lValueOf = null;
        }
        g(twjVar, lValueOf, defpackage.ilo.a, "onPartialResults: failed to notify listeners");
    }

    public final void f(twj twjVar) {
        java.lang.Long lValueOf;
        aooh.f(twjVar, "transcription");
        amld amldVar = (twjVar.b == 2 ? (amle) twjVar.c : amle.a).c;
        if (amldVar == null) {
            amldVar = amld.a;
        }
        amlg amlgVar = (amldVar.b == 1 ? (amkw) amldVar.c : amkw.a).e;
        if (amlgVar == null) {
            amlgVar = amlg.a;
        }
        if ((amlgVar.b & 4) != 0) {
            amld amldVar2 = (twjVar.b == 2 ? (amle) twjVar.c : amle.a).c;
            if (amldVar2 == null) {
                amldVar2 = amld.a;
            }
            amlg amlgVar2 = (amldVar2.b == 1 ? (amkw) amldVar2.c : amkw.a).e;
            if (amlgVar2 == null) {
                amlgVar2 = amlg.a;
            }
            lValueOf = java.lang.Long.valueOf(amlgVar2.c);
        } else {
            lValueOf = null;
        }
        g(twjVar, lValueOf, defpackage.ilp.a, "onSegmentResults: failed to notify listeners");
    }
}
