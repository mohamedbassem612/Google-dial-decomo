package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wxj implements defpackage.wvt {
    public static final aimz a = aimz.i("com/android/incallui/atlas/detection/techniques/soundeventdetection/SoundEventDetectionModelRunner");
    public static final aigf b;
    public final defpackage.wvr c;
    public final ajct d;
    public final aigf e;
    public final defpackage.wvq f;
    public defpackage.wvs h;
    public final defpackage.wyw i;
    public final defpackage.taq k;
    public final ajwr j = new ajwr();
    public final java.util.concurrent.atomic.AtomicBoolean g = new java.util.concurrent.atomic.AtomicBoolean(false);

    static {
        aigb aigbVar = new aigb(4);
        aigbVar.i(0, defpackage.wxk.SPEECH);
        aigbVar.i(137, defpackage.wxk.MUSIC);
        aigbVar.i(500, defpackage.wxk.SILENCE);
        aigbVar.i(389, defpackage.wxk.TELEPHONY);
        aigbVar.i(390, defpackage.wxk.TELEPHONY);
        aigbVar.i(392, defpackage.wxk.TELEPHONY);
        aigbVar.i(393, defpackage.wxk.TELEPHONY);
        b = aigbVar.e(true);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [aoin, java.lang.Object] */
    public wxj(defpackage.taq taqVar, defpackage.wvr wvrVar, ajct ajctVar, defpackage.taq taqVar2, defpackage.wvq wvqVar, defpackage.wxf wxfVar) {
        this.k = taqVar;
        this.c = wvrVar;
        this.d = ajctVar;
        alat<defpackage.wxe> alatVar = wxfVar.b;
        aigb aigbVar = new aigb(4);
        for (defpackage.wxe wxeVar : alatVar) {
            defpackage.wxk wxkVarB = defpackage.wxk.b(wxeVar.c);
            if (wxkVarB == null) {
                wxkVarB = defpackage.wxk.UNKNOWN_SOUND_EVENT_TYPE;
            }
            aigbVar.i(wxkVarB, java.lang.Float.valueOf(wxeVar.d));
        }
        this.e = aigbVar.e(true);
        this.f = wvqVar;
        this.i = new defpackage.wyw((aoin) taqVar2.b, (aoin) taqVar2.a);
    }
}
