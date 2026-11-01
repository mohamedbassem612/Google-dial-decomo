package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qwx extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public qwx(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.qwx.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final android.content.Context context = (android.content.Context) list.get(0);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        final int iIntValue = ((java.lang.Integer) list.get(2)).intValue();
        return aiql.z(defpackage.uyg.K(new java.util.concurrent.Callable() { // from class: qwi
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                if (!zBooleanValue) {
                    return j$.util.Optional.empty();
                }
                if (iIntValue <= 0) {
                    defpackage.qwj.a.b().l("com/android/dialer/incall/voice/buttons/VoiceButtonsProducerModule", "produceManageConferenceButton", 373, "VoiceButtonsProducerModule.java").v("No conference children available to manage.");
                    return j$.util.Optional.empty();
                }
                android.content.Context context2 = context;
                akzx akzxVarM = defpackage.quf.a.m();
                defpackage.qug qugVar = defpackage.qug.BUTTON_MANAGE_CONFERENCE;
                akzxVarM.u();
                defpackage.quf qufVar = (defpackage.quf) akzxVarM.b;
                qufVar.e = qugVar.H;
                qufVar.b |= 1;
                java.lang.String string = context2.getString(2132019068);
                akzxVarM.u();
                defpackage.quf qufVar2 = (defpackage.quf) akzxVarM.b;
                j$.util.Objects.requireNonNull(string);
                qufVar2.b |= 4;
                qufVar2.g = string;
                akzxVarM.u();
                defpackage.quf qufVar3 = (defpackage.quf) akzxVarM.b;
                qufVar3.c = 2;
                qufVar3.d = 2131231258;
                java.lang.String string2 = context2.getString(2132017188);
                akzxVarM.u();
                defpackage.quf qufVar4 = (defpackage.quf) akzxVarM.b;
                j$.util.Objects.requireNonNull(string2);
                qufVar4.b |= 8;
                qufVar4.h = string2;
                defpackage.que queVar = defpackage.que.MORE;
                akzxVarM.u();
                defpackage.quf qufVar5 = (defpackage.quf) akzxVarM.b;
                qufVar5.l = queVar.g;
                qufVar5.b |= 512;
                akzxVarM.u();
                defpackage.quf qufVar6 = (defpackage.quf) akzxVarM.b;
                qufVar6.b |= 16;
                qufVar6.i = true;
                return j$.util.Optional.of((defpackage.quf) akzxVarM.p());
            }
        }, (ajct) list.get(3)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
