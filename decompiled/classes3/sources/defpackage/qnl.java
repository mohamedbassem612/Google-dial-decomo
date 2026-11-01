package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qnl extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;

    public qnl(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7) {
        super(amyzVar2, new defpackage.amzw(defpackage.qnl.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0069  */
    /* JADX WARN: Code duplicated, block: B:14:0x006f  */
    /* JADX WARN: Code duplicated, block: B:15:0x008b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0091  */
    /* JADX WARN: Code duplicated, block: B:18:0x00b4  */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aimz aimzVar = defpackage.qng.a;
        boolean z = false;
        defpackage.zpo zpoVar = (defpackage.zpo) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(2)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(3)).booleanValue();
        boolean zBooleanValue4 = ((java.lang.Boolean) list.get(4)).booleanValue();
        java.util.Set set = (java.util.Set) list.get(5);
        defpackage.ovb ovbVar = (defpackage.ovb) list.get(6);
        aooh.f(zpoVar, "callState");
        aooh.f(set, "answerScreenInhibitors");
        aooh.f(ovbVar, "answeredCallState");
        if (!zBooleanValue4) {
            if (zBooleanValue) {
                if (zBooleanValue3) {
                    if (set.isEmpty()) {
                        z = true;
                    } else {
                        defpackage.qng.a.b().l("com/android/dialer/incall/video/answer/service/VideoAnswerProducerModule", "produceShouldShowVideoAnswerScreen", 121, "VideoAnswerProducerModule.kt").y("inhibited by %s", ajsz.cr(set, ",", (java.lang.CharSequence) null, (java.lang.CharSequence) null, new qks(4), 30));
                    }
                } else if (ovbVar.b()) {
                    defpackage.qng.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/incall/video/answer/service/VideoAnswerProducerModule", "produceShouldShowVideoAnswerScreen", 115, "VideoAnswerProducerModule.kt").v("skipping creating video answer fragment because the call has been already answered");
                } else if (set.isEmpty()) {
                    defpackage.qng.a.b().l("com/android/dialer/incall/video/answer/service/VideoAnswerProducerModule", "produceShouldShowVideoAnswerScreen", 121, "VideoAnswerProducerModule.kt").y("inhibited by %s", ajsz.cr(set, ",", (java.lang.CharSequence) null, (java.lang.CharSequence) null, new qks(4), 30));
                } else {
                    z = true;
                }
            } else if (zBooleanValue3) {
                if (set.isEmpty()) {
                    defpackage.qng.a.b().l("com/android/dialer/incall/video/answer/service/VideoAnswerProducerModule", "produceShouldShowVideoAnswerScreen", 121, "VideoAnswerProducerModule.kt").y("inhibited by %s", ajsz.cr(set, ",", (java.lang.CharSequence) null, (java.lang.CharSequence) null, new qks(4), 30));
                } else {
                    z = true;
                }
            } else if (zpoVar == defpackage.zpo.d && zBooleanValue2) {
                if (ovbVar.b()) {
                    defpackage.qng.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/incall/video/answer/service/VideoAnswerProducerModule", "produceShouldShowVideoAnswerScreen", 115, "VideoAnswerProducerModule.kt").v("skipping creating video answer fragment because the call has been already answered");
                } else if (set.isEmpty()) {
                    defpackage.qng.a.b().l("com/android/dialer/incall/video/answer/service/VideoAnswerProducerModule", "produceShouldShowVideoAnswerScreen", 121, "VideoAnswerProducerModule.kt").y("inhibited by %s", ajsz.cr(set, ",", (java.lang.CharSequence) null, (java.lang.CharSequence) null, new qks(4), 30));
                } else {
                    z = true;
                }
            }
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        amzg amzgVar = this.h;
        amzg amzgVar2 = this.g;
        amzg amzgVar3 = this.f;
        amzg amzgVar4 = this.e;
        amzg amzgVar5 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
