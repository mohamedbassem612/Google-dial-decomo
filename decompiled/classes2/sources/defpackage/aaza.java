package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aaza extends ylc implements android.os.IInterface {
    final /* synthetic */ java.util.function.Consumer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaza(defpackage.iao iaoVar, java.util.function.Consumer consumer) {
        super("com.google.android.ims.ipc.IAudioRecordingCallback");
        this.a = consumer;
        j$.util.Objects.requireNonNull(iaoVar);
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        parcel.readInt();
        yld.c(parcel);
        aa$.ExternalSyntheticApiModelOutline1.m(this.a, new java.lang.IllegalStateException("Error in VoiceLibController.startRecording"));
        return true;
    }
}
