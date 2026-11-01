package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uvn implements defpackage.agza {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public uvn(lyi lyiVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(lyiVar);
        this.a = lyiVar;
    }

    @Override // defpackage.agza
    public final void a(java.lang.Throwable th) {
        if (this.$cid != 0) {
            a.bq(lyi.a.c(), "Error getting call details UI model.", "com/android/dialer/conversationhistorycalldetails/ConversationHistoryCallDetailsFragmentPeer$UiModelSubscriptionCallbacks", "onLoadError", (char) 1426, "ConversationHistoryCallDetailsFragmentPeer.java", th, zct.b);
            ((lyi) this.a).f(new lzl(false, wgi.a));
        } else {
            a.bq(defpackage.uvo.a.c(), "failed loading feedback data", "com/android/dialer/transcriptaudiofeedback/impl/FeedbackMainFragmentPeer$2", "onLoadError", (char) 366, "FeedbackMainFragmentPeer.java", th, zct.b);
            ((defpackage.uvo) this.a).c(defpackage.utr.a);
        }
    }

    @Override // defpackage.agza
    public final /* synthetic */ void b(java.lang.Object obj) {
        if (this.$cid == 0) {
            ((defpackage.uvo) this.a).c((defpackage.utr) obj);
            return;
        }
        lzw lzwVar = (lzw) obj;
        lyi.a.b().l("com/android/dialer/conversationhistorycalldetails/ConversationHistoryCallDetailsFragmentPeer$UiModelSubscriptionCallbacks", "onLoaded", 1411, "ConversationHistoryCallDetailsFragmentPeer.java").v("Successfully fetched call details UI model");
        j$.util.Optional optionalOf = j$.util.Optional.of(lzwVar.a);
        ahvr.ci(optionalOf);
        optionalOf.isPresent();
        kiu kiuVar = (kiu) optionalOf.orElseThrow();
        java.lang.Object obj2 = this.a;
        lyi lyiVar = (lyi) obj2;
        lyiVar.g = kiuVar;
        lyiVar.h();
        lyiVar.g(lyiVar.h.f());
        lyn lynVarC = lyiVar.c();
        lyiVar.h.E(lynVarC);
        lxt lxtVar = lyiVar.i;
        defpackage.abwd abwdVar = lynVarC.c;
        if (abwdVar == null) {
            abwdVar = defpackage.abwd.a;
        }
        lxtVar.y(abwdVar);
        lyiVar.f(lzwVar.b);
        kiq kiqVar = lzwVar.c;
        lyn lynVarC2 = lyiVar.c();
        lyiVar.h.E(lynVarC2);
        lxt lxtVar2 = lyiVar.i;
        if (lxtVar2 != null) {
            defpackage.abwd abwdVar2 = lynVarC2.c;
            if (abwdVar2 == null) {
                abwdVar2 = defpackage.abwd.a;
            }
            lxtVar2.y(abwdVar2);
            lxt lxtVar3 = lyiVar.i;
            kiu kiuVar2 = lyiVar.g;
            aooh.f(kiuVar2, "coalescedRow");
            lxtVar3.h = kiuVar2;
            lyiVar.i.x(kiqVar);
            lyiVar.I.aF(lyiVar.a(), new lye(obj2, 0));
        }
        knb knbVar = ((akzx) lyiVar.E.a).b;
        if ((knbVar.b & 8) != 0) {
            kmx kmxVar = knbVar.e;
            if (kmxVar == null) {
                kmxVar = kmx.a;
            }
            if (lyiVar.g.d == kmxVar.c) {
                lyiVar.a().n.ae(kmxVar.f);
            }
        }
        lyiVar.v = j$.util.Optional.of(kiqVar);
    }

    public uvn(defpackage.uvo uvoVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(uvoVar);
        this.a = uvoVar;
    }
}
