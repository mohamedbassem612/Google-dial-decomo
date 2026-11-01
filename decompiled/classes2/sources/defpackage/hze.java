package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@java.lang.Deprecated
public final class hze implements defpackage.hzl {
    public static final aimz a = aimz.i("com/android/dialer/audio/impl/ExternalAudioSource");
    public final defpackage.hyy b;
    public final aigf c;
    public final lpb d;
    public j$.util.Optional e = j$.util.Optional.empty();
    public final java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean();

    public hze(defpackage.hyy hyyVar, aigf aigfVar, lpb lpbVar) {
        this.b = hyyVar;
        this.c = aigfVar;
        this.d = lpbVar;
    }

    @Override // defpackage.hzl
    public final android.media.AudioFormat a() {
        ahvr.bZ(this.e.isPresent(), "External source is not activated");
        return (android.media.AudioFormat) this.e.orElseThrow();
    }

    @Override // defpackage.hzl
    public final void c(defpackage.hyw hywVar) {
        throw new java.lang.IllegalStateException("cannot start listening on external source");
    }

    @Override // defpackage.hzl
    public final void b() {
    }
}
