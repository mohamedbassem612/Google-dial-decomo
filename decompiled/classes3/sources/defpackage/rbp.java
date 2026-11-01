package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rbp extends amzm {
    private final amzg b;

    public rbp(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.rbp.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        aihd aihdVar = (aihd) obj;
        if (aihdVar.size() > 1) {
            defpackage.rau.a.d().l("com/android/dialer/incall/voice/service/VoiceProducerModule", "produceSelectedSnackbarKey", 186, "VoiceProducerModule.java").y("More than one snackbar exist at the same time: %s", j$.util.Collection.-EL.stream(aihdVar).map(new defpackage.rat(0)).collect(j$.util.stream.Collectors.joining(", ")));
        }
        return aiql.z(j$.util.Collection.-EL.stream(aihdVar).min(j$.util.Comparator.-CC.comparingInt(new defpackage.rar(4))));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
