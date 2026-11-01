package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class erz extends android.content.BroadcastReceiver {
    private final defpackage.etk a;

    public erz(defpackage.esv esvVar, defpackage.etk etkVar) {
        j$.util.Objects.requireNonNull(esvVar);
        this.a = etkVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.a.d(new defpackage.fvl(1));
        }
    }
}
