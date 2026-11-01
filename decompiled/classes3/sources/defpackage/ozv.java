package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ozv implements olu {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ozv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final ajcq a() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.otm otmVar = new defpackage.otm((char[]) null);
            otmVar.a = "answer_screen_shown";
            otmVar.f(java.lang.Boolean.toString(((java.util.concurrent.atomic.AtomicBoolean) ((defpackage.wjc) this.a).a).get()));
            return aiql.z(otmVar.e());
        }
        if (i == 1) {
            int i2 = omk.f;
            defpackage.otm otmVar2 = new defpackage.otm((char[]) null);
            otmVar2.a = "display_change_frequency_per_minute_during_call";
            otmVar2.f((java.lang.String) this.a);
            return aiql.z(otmVar2.e());
        }
        if (i != 2) {
            defpackage.otm otmVar3 = new defpackage.otm((char[]) null);
            otmVar3.a = "video_answer_screen_shown";
            otmVar3.f(java.lang.Boolean.toString(((defpackage.qnd) this.a).k.get()));
            return aiql.z(otmVar3.e());
        }
        defpackage.otm otmVar4 = new defpackage.otm((char[]) null);
        otmVar4.a = "status_bar_notification_requested";
        otmVar4.f(java.lang.Boolean.toString(((defpackage.qko) this.a).f.get()));
        return aiql.z(otmVar4.e());
    }
}
