package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rcw {
    private static final aimz b = aimz.i("com/android/dialer/incall/voice/ui/VoiceButtonRenderObserver");
    public aihd a;
    private aihd c;
    private final gpd d;

    public rcw(gpd gpdVar) {
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.d = gpdVar;
        aikn aiknVar = aikn.a;
        aooh.e(aiknVar, "of(...)");
        this.a = aiknVar;
        aooh.e(aiknVar, "of(...)");
        this.c = aiknVar;
    }

    private final void c(mce mceVar, java.lang.String str) {
        this.d.i(str).b(mceVar);
    }

    public final void a(aihd aihdVar, aihd aihdVar2, java.lang.String str) {
        b.b().l("com/android/dialer/incall/voice/ui/VoiceButtonRenderObserver", "emitCuiEventOnButtonUpdate", 48, "VoiceButtonRenderObserver.kt").v("enter");
        if (aihdVar.isEmpty()) {
            return;
        }
        aikx aikxVarAm = ahvr.am(aihdVar2, aihdVar);
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(aikxVarAm, 10));
        ailj ailjVarC = aikxVarAm.c();
        while (ailjVarC.hasNext()) {
            defpackage.qug qugVarB = defpackage.qug.b(((defpackage.rct) ailjVarC.next()).c);
            if (qugVarB == null) {
                qugVarB = defpackage.qug.BUTTON_UNKNOWN;
            }
            arrayList.add(qugVarB);
        }
        aihd aihdVarBx = ahvr.bx(arrayList);
        if (aihdVarBx.isEmpty()) {
            return;
        }
        if (aihdVarBx.contains(defpackage.qug.BUTTON_AUDIO_ROUTE)) {
            c(mce.aY, str);
        }
        if (aihdVarBx.contains(defpackage.qug.BUTTON_MUTE)) {
            c(mce.bb, str);
        }
        if (aihdVarBx.contains(defpackage.qug.BUTTON_HOLD)) {
            c(mce.bk, str);
        }
        if (aihdVarBx.contains(defpackage.qug.BUTTON_UNHOLD)) {
            c(mce.bh, str);
        }
        if (aihdVarBx.contains(defpackage.qug.BUTTON_SHARPIE)) {
            c(mce.fB, str);
        }
    }

    public final void b(aihd aihdVar, java.lang.String str) {
        aooh.f(aihdVar, "renderedButtons");
        a(this.c, aihdVar, str);
        this.c = aihdVar;
    }
}
