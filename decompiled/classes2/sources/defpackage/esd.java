package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class esd {
    public final int a = 1;
    public final android.media.AudioManager.OnAudioFocusChangeListener b;
    public final android.os.Handler c;
    public final defpackage.epu d;
    public final boolean e;
    private final java.lang.Object f;

    public esd(android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, android.os.Handler handler, defpackage.epu epuVar, boolean z) {
        this.c = handler;
        this.d = epuVar;
        this.e = z;
        this.b = onAudioFocusChangeListener;
        this.f = da$.ExternalSyntheticApiModelOutline1.m(da$.ExternalSyntheticApiModelOutline1.m$1(da$.ExternalSyntheticApiModelOutline1.m(da$.ExternalSyntheticApiModelOutline1.m(da$.ExternalSyntheticApiModelOutline1.m(new android.media.AudioFocusRequest.Builder(1), epuVar.a()), z), onAudioFocusChangeListener, handler), true));
    }

    final android.media.AudioFocusRequest a() {
        java.lang.Object obj = this.f;
        ahvr.ci(obj);
        return da$.ExternalSyntheticApiModelOutline1.m(obj);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.esd) {
            defpackage.esd esdVar = (defpackage.esd) obj;
            int i = esdVar.a;
            if (this.e == esdVar.e && j$.util.Objects.equals(this.b, esdVar.b) && j$.util.Objects.equals(this.c, esdVar.c) && j$.util.Objects.equals(this.d, esdVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{1, this.b, this.c, this.d, java.lang.Boolean.valueOf(this.e)});
    }
}
