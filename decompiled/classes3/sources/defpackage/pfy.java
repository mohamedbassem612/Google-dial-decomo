package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pfy extends amzm {
    private final amzg b;

    public pfy(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.pfy.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        aihd aihdVar = (aihd) obj;
        boolean zIsEmpty = aihdVar.isEmpty();
        boolean z = !zIsEmpty;
        if (!zIsEmpty) {
            defpackage.pfi.a.b().l("com/android/dialer/incall/bubble/service/BubbleModelProducerModule", "produceShouldInhibitSpeakerAndMuteButton", 416, "BubbleModelProducerModule.java").y("inhibited by %s", j$.util.Collection.-EL.stream(aihdVar).map(new old(16)).collect(j$.util.stream.Collectors.joining(",")));
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
