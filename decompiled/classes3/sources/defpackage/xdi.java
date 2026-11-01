package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xdi implements defpackage.qtx {
    private static final aimz a = aimz.i("com/android/incallui/atlas/ui/impl/tidepods/voice/AtlasVoiceButtonController");
    private final defpackage.wxm b;
    private final defpackage.rfa c;
    private final long d;

    public xdi(defpackage.wxm wxmVar, defpackage.rfa rfaVar, long j) {
        this.b = wxmVar;
        this.c = rfaVar;
        this.d = j;
    }

    @Override // defpackage.qtx
    public final void a() {
        a.b().l("com/android/incallui/atlas/ui/impl/tidepods/voice/AtlasVoiceButtonController", "onButtonClicked", 34, "AtlasVoiceButtonController.java").v("enter");
        this.b.b(this.d, defpackage.alex.USER_CLICK_HFM_BUTTON);
        this.c.c(defpackage.rea.CONTROLLER_ATLAS, defpackage.rex.b);
    }
}
