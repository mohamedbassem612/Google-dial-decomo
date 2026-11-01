package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class nix extends aomh implements aonn {
    int a;
    long b;
    int c;
    final /* synthetic */ java.lang.String d;
    final /* synthetic */ defpackage.njd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nix(java.lang.String str, defpackage.njd njdVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = str;
        this.e = njdVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006e A[Catch: all -> 0x0098, IllegalStateException -> 0x009b, TryCatch #2 {all -> 0x0098, blocks: (B:30:0x006a, B:32:0x006e, B:35:0x0074, B:37:0x007a, B:40:0x0085), top: B:54:0x006a }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071  */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[Catch: all -> 0x0098, IllegalStateException -> 0x009b, TryCatch #2 {all -> 0x0098, blocks: (B:30:0x006a, B:32:0x006e, B:35:0x0074, B:37:0x007a, B:40:0x0085), top: B:54:0x006a }] */
    /* JADX WARN: Code duplicated, block: B:37:0x007a A[Catch: all -> 0x0098, IllegalStateException -> 0x009b, TRY_LEAVE, TryCatch #2 {all -> 0x0098, blocks: (B:30:0x006a, B:32:0x006e, B:35:0x0074, B:37:0x007a, B:40:0x0085), top: B:54:0x006a }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0026: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:39), block:B:15:0x0026 */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        int i;
        int i2;
        java.lang.Object objD;
        int i3;
        long jLongValue;
        java.lang.Object objI;
        int i4;
        long j;
        java.lang.Object objE;
        defpackage.nih nihVar;
        defpackage.hxf hxfVar;
        defpackage.njd njdVar;
        aolu aoluVar = aolu.a;
        int i5 = this.c;
        try {
            try {
                try {
                    if (i5 == 0) {
                        aooc.af(obj);
                        int iHashCode = this.d.hashCode();
                        zhr.b("NGCS-TTS-Request", iHashCode);
                        defpackage.nrv nrvVar = this.e.g;
                        this.a = iHashCode;
                        this.c = 1;
                        objD = nrvVar.d(this);
                        if (objD == aoluVar) {
                            return aoluVar;
                        }
                        i3 = iHashCode;
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                i2 = this.a;
                                try {
                                    aooc.af(obj);
                                    objE = obj;
                                    zhr.c("NGCS-TTS-Request", i2);
                                    return objE;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    zhr.c("NGCS-TTS-Request", i2);
                                    throw th;
                                }
                            }
                            j = this.b;
                            int i6 = this.a;
                            try {
                                aooc.af(obj);
                                objI = obj;
                                i4 = i6;
                                try {
                                    try {
                                        nihVar = (defpackage.nih) objI;
                                        if (nihVar != null) {
                                            hxfVar = nihVar.a;
                                        } else {
                                            hxfVar = null;
                                        }
                                        if (hxfVar == null) {
                                            njdVar = this.e;
                                            if (njdVar.n) {
                                                njdVar.p.a(qbc.ba);
                                                objE = defpackage.Cnew.PLAY_RECORDING_CANCELLED_UNDER_WRONG_STATES;
                                            } else {
                                                defpackage.njd njdVar2 = this.e;
                                                this.a = i4;
                                                this.c = 3;
                                                objE = njdVar2.e(nihVar, j, null, false, null, this);
                                                if (objE == aoluVar) {
                                                    return aoluVar;
                                                }
                                            }
                                        } else {
                                            defpackage.njd njdVar3 = this.e;
                                            this.a = i4;
                                            this.c = 3;
                                            objE = njdVar3.e(nihVar, j, null, false, null, this);
                                            if (objE == aoluVar) {
                                                return aoluVar;
                                            }
                                        }
                                        i2 = i4;
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        i2 = i4;
                                        zhr.c("NGCS-TTS-Request", i2);
                                        throw th;
                                    }
                                } catch (java.lang.IllegalStateException unused) {
                                    i3 = i4;
                                    defpackage.njd.a.d().m(aioa.b).l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "playSpeechAndAwait$<anonymous>", 324, "DobbyUplinkAudioInjector.kt").v("failed to play TTS audio request");
                                    this.e.h.a(mcd.M);
                                    objE = defpackage.Cnew.PLAY_RECORDING_FAILED;
                                    i2 = i3;
                                }
                            } catch (java.lang.IllegalStateException unused2) {
                                i3 = i6;
                                defpackage.njd.a.d().m(aioa.b).l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "playSpeechAndAwait$<anonymous>", 324, "DobbyUplinkAudioInjector.kt").v("failed to play TTS audio request");
                                this.e.h.a(mcd.M);
                                objE = defpackage.Cnew.PLAY_RECORDING_FAILED;
                                i2 = i3;
                                zhr.c("NGCS-TTS-Request", i2);
                                return objE;
                            }
                            zhr.c("NGCS-TTS-Request", i2);
                            return objE;
                        }
                        i3 = this.a;
                        aooc.af(obj);
                        objD = obj;
                    }
                    defpackage.njd njdVar4 = this.e;
                    java.lang.String str = this.d;
                    this.a = i3;
                    this.b = jLongValue;
                    this.c = 2;
                    objI = njdVar4.i(str, this);
                    if (objI == aoluVar) {
                        return aoluVar;
                    }
                    i4 = i3;
                    j = jLongValue;
                    nihVar = (defpackage.nih) objI;
                    if (nihVar != null) {
                        hxfVar = nihVar.a;
                    } else {
                        hxfVar = null;
                    }
                    if (hxfVar == null) {
                        njdVar = this.e;
                        if (njdVar.n) {
                            njdVar.p.a(qbc.ba);
                            objE = defpackage.Cnew.PLAY_RECORDING_CANCELLED_UNDER_WRONG_STATES;
                        } else {
                            defpackage.njd njdVar5 = this.e;
                            this.a = i4;
                            this.c = 3;
                            objE = njdVar5.e(nihVar, j, null, false, null, this);
                            if (objE == aoluVar) {
                                return aoluVar;
                            }
                        }
                    } else {
                        defpackage.njd njdVar6 = this.e;
                        this.a = i4;
                        this.c = 3;
                        objE = njdVar6.e(nihVar, j, null, false, null, this);
                        if (objE == aoluVar) {
                            return aoluVar;
                        }
                    }
                    i2 = i4;
                    zhr.c("NGCS-TTS-Request", i2);
                    return objE;
                } catch (java.lang.IllegalStateException unused3) {
                    defpackage.njd.a.d().m(aioa.b).l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "playSpeechAndAwait$<anonymous>", 324, "DobbyUplinkAudioInjector.kt").v("failed to play TTS audio request");
                    this.e.h.a(mcd.M);
                    objE = defpackage.Cnew.PLAY_RECORDING_FAILED;
                    i2 = i3;
                    zhr.c("NGCS-TTS-Request", i2);
                    return objE;
                }
                jLongValue = ((java.lang.Number) objD).longValue();
            } catch (java.lang.Throwable th3) {
                th = th3;
                i2 = 1;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            i2 = i;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.nix(this.d, this.e, aolnVar);
    }
}
