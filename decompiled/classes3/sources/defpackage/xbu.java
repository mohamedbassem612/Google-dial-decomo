package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xbu implements hxa {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ xbu(kxr kxrVar, defpackage.akzb akzbVar, int i) {
        this.$cid = i;
        this.b = kxrVar;
        this.a = akzbVar;
    }

    public final hwz a(akzc akzcVar, int i) {
        int i2;
        if (this.$cid != 0) {
            kxr kxrVar = (kxr) this.b;
            if (kxrVar.j.get()) {
                return hwz.b;
            }
            java.lang.Object obj = this.a;
            if (i > 0) {
                try {
                    ((defpackage.akzb) obj).write(new byte[i]);
                } catch (java.io.IOException e) {
                    kxrVar.g.o(rmx.fU);
                    a.bq(kxr.a.c(), "failure saving audio bytes", "com/android/dialer/callrecording/impl/service/CallRecorder", "startRecording", (char) 236, "CallRecorder.java", e, zct.b);
                    return hwz.b;
                }
            }
            akzcVar.m((java.io.OutputStream) obj);
            return hwz.a;
        }
        java.lang.Object obj2 = this.a;
        defpackage.xbx xbxVar = (defpackage.xbx) obj2;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = xbxVar.j;
        if (atomicBoolean.get()) {
            hzb hzbVar = (hzb) this.b;
            defpackage.xbx.a.b().g(10, java.util.concurrent.TimeUnit.SECONDS).l("com/android/incallui/atlas/ui/impl/tidepods/service/callaudioreader/HoldForMeCallAudioReader", "readCallAudio", 281, "HoldForMeCallAudioReader.java").z("Resampling audio date from %d, to %d", hzbVar.b.getSampleRate(), 16000);
            akzc akzcVarA = xbxVar.c.a(akzcVar, hzbVar.b.getSampleRate(), 16000);
            akzx akzxVarM = defpackage.wvf.a.m();
            int iOrdinal = hzbVar.d.ordinal();
            if (iOrdinal != 0) {
                i2 = 3;
                if (iOrdinal != 1) {
                    if (iOrdinal == 2 || iOrdinal == 3) {
                        throw new java.lang.IllegalStateException("unsupported audio mode");
                    }
                    if (iOrdinal != 4) {
                        throw new defpackage.ahzr("Not an exhaustive switch");
                    }
                    i2 = 4;
                }
            } else {
                i2 = 2;
            }
            akzxVarM.u();
            defpackage.wvf wvfVar = (defpackage.wvf) akzxVarM.b;
            wvfVar.f = i2 - 1;
            wvfVar.b |= 8;
            akzxVarM.u();
            defpackage.wvf wvfVar2 = (defpackage.wvf) akzxVarM.b;
            j$.util.Objects.requireNonNull(akzcVarA);
            wvfVar2.b |= 1;
            wvfVar2.c = akzcVarA;
            akzxVarM.u();
            defpackage.wvf wvfVar3 = (defpackage.wvf) akzxVarM.b;
            wvfVar3.b |= 2;
            wvfVar3.d = 16000;
            int iM = fn$.ExternalSyntheticApiModelOutline0.m(hzbVar.b);
            akzxVarM.u();
            defpackage.wvf wvfVar4 = (defpackage.wvf) akzxVarM.b;
            wvfVar4.b |= 4;
            wvfVar4.e = iM;
            defpackage.wvf wvfVar5 = (defpackage.wvf) akzxVarM.p();
            akzx akzxVarM2 = defpackage.wvg.a.m();
            akzxVarM2.u();
            defpackage.wvg wvgVar = (defpackage.wvg) akzxVarM2.b;
            j$.util.Objects.requireNonNull(wvfVar5);
            wvgVar.d = wvfVar5;
            wvgVar.c = 1;
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            akzxVarM2.u();
            defpackage.wvg wvgVar2 = (defpackage.wvg) akzxVarM2.b;
            wvgVar2.b |= 1;
            wvgVar2.e = jElapsedRealtime;
            agsm.i(1168, ahvr.E(new defpackage.wdm(obj2, (defpackage.wvg) akzxVarM2.p(), 5, null), xbxVar.e), "failed notifying audio listener", new java.lang.Object[0]);
        }
        return atomicBoolean.get() ? hwz.a : hwz.b;
    }

    public /* synthetic */ xbu(defpackage.xbx xbxVar, hzb hzbVar, int i) {
        this.$cid = i;
        this.a = xbxVar;
        this.b = hzbVar;
    }
}
