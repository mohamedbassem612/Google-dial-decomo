package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uvb {
    public static final aimz a = aimz.i("com/android/dialer/transcriptaudiofeedback/impl/AudioRecordingCombiner");
    public final android.content.Context b;
    public final ajct c;
    public final ajct d;
    public final rlv e;
    public final inv f;
    public final ipc g;

    public uvb(android.content.Context context, ajct ajctVar, ajct ajctVar2, ipc ipcVar, rlv rlvVar, inv invVar) {
        this.b = context;
        this.c = ajctVar;
        this.d = ajctVar2;
        this.g = ipcVar;
        this.e = rlvVar;
        this.f = invVar;
    }

    public final ajcq a(defpackage.utq utqVar, idt idtVar) {
        int iAN = a.aN(utqVar.e);
        int i = iAN == 0 ? 1 : iAN;
        int i2 = i - 1;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return ahrv.g(ahvr.F(new nzd(this, i, utqVar, idtVar, 2), this.c)).i(new uhj(this, idtVar, 9, (byte[]) null), this.d);
        }
        throw new java.lang.UnsupportedOperationException(java.lang.String.format("Unsupported audio format %s", java.lang.Integer.toString(i2)));
    }
}
