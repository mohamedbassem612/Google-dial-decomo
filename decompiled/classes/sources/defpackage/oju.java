package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class oju {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/externals/androidapis/media/DialerAudioManager");
    public final defpackage.aoss b;
    public final defpackage.aolr c;
    public final defpackage.zjv d;
    public final defpackage.mgu e;
    public final android.media.AudioManager f;

    public oju(defpackage.aoss aossVar, defpackage.aolr aolrVar, defpackage.zjv zjvVar, defpackage.mgu mguVar, android.media.AudioManager audioManager) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        if (zjvVar == null) {
            defpackage.aooh.i("externalsLogging");
        }
        if (mguVar == null) {
            defpackage.aooh.i("scopedDiffRecorder");
        }
        this.b = aossVar;
        this.c = aolrVar;
        this.d = zjvVar;
        this.e = mguVar;
        this.f = audioManager;
    }

    public final int a(android.media.AudioFocusRequest audioFocusRequest) {
        defpackage.aooh.f(audioFocusRequest, "focusRequest");
        int iM = da$.ExternalSyntheticApiModelOutline1.m(this.f, audioFocusRequest);
        defpackage.zjv.i(this.d, defpackage.mgv.AUDIO_MANAGER_ABANDON_AUDIO_FOCUS_REQUEST, defpackage.ajsz.bb(defpackage.gus.au(da$.ExternalSyntheticApiModelOutline1.m(audioFocusRequest)), defpackage.gus.ax(da$.ExternalSyntheticApiModelOutline1.m(audioFocusRequest)), defpackage.gus.au(da$.ExternalSyntheticApiModelOutline1.m(audioFocusRequest).getUsage()), defpackage.gus.au(da$.ExternalSyntheticApiModelOutline1.m(audioFocusRequest).getContentType())), defpackage.gus.au(iM), 0, 24);
        return iM;
    }

    public final int b() {
        int mode = this.f.getMode();
        defpackage.mgu mguVar = this.e;
        j$.util.Objects.requireNonNull(mguVar);
        return defpackage.gus.aD(defpackage.mgv.AUDIO_MANAGER_GET_MODE, mode, mguVar).f();
    }

    public final int c() {
        int ringerMode = this.f.getRingerMode();
        defpackage.mgu mguVar = this.e;
        j$.util.Objects.requireNonNull(mguVar);
        return defpackage.gus.aD(defpackage.mgv.AUDIO_MANAGER_GET_RINGER_MODE, ringerMode, mguVar).f();
    }

    public final int d(android.media.AudioFocusRequest audioFocusRequest) {
        defpackage.aooh.f(audioFocusRequest, "focusRequest");
        int iM$1 = da$.ExternalSyntheticApiModelOutline1.m$1(this.f, audioFocusRequest);
        defpackage.zjv.i(this.d, defpackage.mgv.AUDIO_MANAGER_REQUEST_AUDIO_FOCUS, defpackage.ajsz.bb(defpackage.gus.au(da$.ExternalSyntheticApiModelOutline1.m(audioFocusRequest)), defpackage.gus.ax(da$.ExternalSyntheticApiModelOutline1.m(audioFocusRequest)), defpackage.gus.au(da$.ExternalSyntheticApiModelOutline1.m(audioFocusRequest).getUsage()), defpackage.gus.au(da$.ExternalSyntheticApiModelOutline1.m(audioFocusRequest).getContentType())), defpackage.gus.au(iM$1), 0, 24);
        return iM$1;
    }

    public final java.lang.Object e(android.media.AudioFocusRequest audioFocusRequest, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.c, new defpackage.ojq(this, audioFocusRequest, null), aolnVar);
    }

    public final java.lang.Object f(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.c, new defpackage.ohg(this, (defpackage.aoln) null, 8, (short[]) null), aolnVar);
    }

    public final java.lang.Object g(boolean z, defpackage.aoln aolnVar) {
        java.lang.Object objAj = defpackage.aoov.aj(this.c, new jcm(this, z, (defpackage.aoln) null, 4), aolnVar);
        return objAj != defpackage.aolu.a ? defpackage.aojh.a : objAj;
    }

    public final java.util.List h() {
        java.lang.Object objD = new defpackage.mgr(this.e, mp$.ExternalSyntheticApiModelOutline0.m(this.f)).b(defpackage.mgv.AUDIO_MANAGER_GET_AVAILABLE_COMMUNICATION_DEVICES).e(new mig(7)).d(new mig(8));
        defpackage.aooh.e(objD, "asUserdata(...)");
        return (java.util.List) objD;
    }

    public final java.util.List i() {
        android.media.AudioDeviceInfo[] devices = this.f.getDevices(2);
        defpackage.aooh.e(devices, "getDevices(...)");
        java.util.List listCU = defpackage.ajsz.cU(devices);
        defpackage.zjv.i(this.d, defpackage.mgv.AUDIO_MANAGER_GET_DEVICES, defpackage.ajsz.aY(defpackage.gus.au(2)), defpackage.gus.au(listCU.size()), 0, 24);
        return listCU;
    }
}
