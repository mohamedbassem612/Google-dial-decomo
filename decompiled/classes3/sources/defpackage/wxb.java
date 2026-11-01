package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wxb implements defpackage.wvt {
    public static final aimz a = aimz.i("com/android/incallui/atlas/detection/techniques/holddetection/HoldDetectionModelRunner");
    public static final alqg b;
    public static final alqk c;
    public static final aigf d;
    public final defpackage.wvq e;
    public final ajcu f;
    public final ajcu g;
    public final ajcu h;
    public boolean k;
    public long l;
    public final defpackage.aljf m;
    public final defpackage.wzx n;
    public final ajwr o = new ajwr();
    public j$.util.Optional i = j$.util.Optional.empty();
    public j$.util.Optional j = j$.util.Optional.empty();

    static {
        akzx akzxVarM = alqg.a.m();
        akzxVarM.u();
        akzxVarM.b.b = 0;
        akzxVarM.u();
        akzxVarM.b.c = 16000;
        akzxVarM.u();
        akzxVarM.b.d = 1;
        b = akzxVarM.p();
        akzz akzzVarM = alqk.a.m();
        apdi apdiVar = amaf.d;
        akzx akzxVarM2 = amaf.a.m();
        akzxVarM2.u();
        amaf amafVar = akzxVarM2.b;
        amafVar.c = 2;
        amafVar.b |= 1;
        akzzVarM.bV(apdiVar, akzxVarM2.p());
        c = akzzVarM.p();
        aigb aigbVar = new aigb(4);
        aigbVar.i(defpackage.wxk.MUSIC, defpackage.alrb.MUSIC);
        aigbVar.i(defpackage.wxk.SPEECH, defpackage.alrb.SPEECH);
        aigbVar.i(defpackage.wxk.TELEPHONY, defpackage.alrb.TELEPHONY);
        aigbVar.i(defpackage.wxk.SILENCE, defpackage.alrb.SILENCE);
        aigbVar.i(defpackage.wxk.UNKNOWN_SOUND_EVENT_TYPE, defpackage.alrb.UNKNOWN);
        d = aigbVar.e(true);
    }

    public wxb(ajcu ajcuVar, ajcu ajcuVar2, ajcu ajcuVar3, defpackage.wvq wvqVar, defpackage.aljf aljfVar, defpackage.wzx wzxVar) {
        this.f = ajcuVar;
        this.g = ajcuVar2;
        this.h = ajcuVar3;
        this.e = wvqVar;
        this.m = aljfVar;
        this.n = wzxVar;
    }

    public final void a() {
        agsm.i(1133, this.o.d(ahqx.i(new defpackage.wwy(this, 0)), this.f), "failed to close resources", new java.lang.Object[0]);
    }
}
