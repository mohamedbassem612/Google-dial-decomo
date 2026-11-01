package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kuz implements defpackage.zcr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callrecording/impl/CallRecordingEnabledFn");
    private final defpackage.zzx b;

    public kuz(defpackage.zzx zzxVar) {
        this.b = zzxVar;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        if (!this.b.m()) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/callrecording/impl/CallRecordingEnabledFn", "isEnabled", (char) 24, "CallRecordingEnabledFn.java")).v("disabled by direct boot");
        return false;
    }
}
