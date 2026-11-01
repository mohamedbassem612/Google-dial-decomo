package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ibo {
    public final oju a;
    public final ajct b;
    public final java.util.concurrent.Executor c;
    public java.lang.Boolean d = null;

    public ibo(oju ojuVar, ajct ajctVar) {
        this.a = ojuVar;
        this.b = ajctVar;
        this.c = new ajdc(ajctVar);
    }

    public final j$.util.Optional a() {
        for (android.media.AudioDeviceInfo audioDeviceInfo : this.a.i()) {
            if (audioDeviceInfo.getType() == 18) {
                return j$.util.Optional.of(audioDeviceInfo);
            }
        }
        return j$.util.Optional.empty();
    }
}
