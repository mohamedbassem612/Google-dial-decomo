package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jnr implements dsf {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ jnr(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r9v22, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final java.lang.Object a(final dsd dsdVar) {
        byte[] bArr = null;
        int i = 0;
        switch (this.$cid) {
            case 0:
                final int i2 = 1;
                android.speech.tts.TextToSpeech.OnInitListener onInitListener = new android.speech.tts.TextToSpeech.OnInitListener() { // from class: lbp
                    @Override // android.speech.tts.TextToSpeech.OnInitListener
                    public final void onInit(int i3) {
                        if (i2 != 0) {
                            java.lang.Object obj = dsdVar;
                            if (i3 == 0) {
                                ((dsd) obj).b((java.lang.Object) null);
                                return;
                            } else {
                                ((dsd) obj).d(new java.lang.IllegalStateException(a.bj(i3, "TTS initialization failed: ")));
                                return;
                            }
                        }
                        if (i3 != 0) {
                            lbq.a.b().l("com/android/dialer/callrecording/impl/ttsprewarm/TtsPreWarm", "prewarmTtsInBackground", 91, "TtsPreWarm.java").w("prewarming: failed to init TTS with status %d", i3);
                            return;
                        }
                        java.lang.Object obj2 = dsdVar;
                        defpackage.jyr jyrVar = new defpackage.jyr(obj2, 13);
                        lbq lbqVar = (lbq) obj2;
                        ahvr.J(lbqVar.g.g(jyrVar, lbqVar.c), new defpackage.jya(lbqVar, 5), lbqVar.b);
                    }
                };
                ((java.util.concurrent.atomic.AtomicReference) this.b).set(new android.speech.tts.TextToSpeech((android.content.Context) ((defpackage.jns) this.a).f.a, onInitListener));
                return onInitListener;
            case 1:
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
                dsdVar.a(new defpackage.fkh(atomicBoolean, 9, bArr), gru.a);
                this.a.execute(new defpackage.ac((java.lang.Object) atomicBoolean, (java.lang.Object) dsdVar, this.b, 14, (char[]) null));
                return aojh.a;
            case 2:
                defpackage.jny jnyVar = (defpackage.jny) this.b;
                agsm.i(161, ahvr.F(new joq(jnyVar, dsdVar, new defpackage.jnw(jnyVar, dsdVar), (defpackage.jnu) this.a, 1), jnyVar.b), "failed to speak", new java.lang.Object[0]);
                return "CallAnnouncer.speak";
            case 3:
                java.lang.Object obj = this.a;
                ops opsVar = (ops) obj;
                xsv xsvVarQ = opsVar.b.b().c().e(ops.b((java.lang.String) this.b)).q(xwm.c);
                defpackage.opr oprVar = new defpackage.opr(opsVar, dsdVar);
                if (((java.lang.Boolean) opsVar.d.a()).booleanValue()) {
                    opsVar.f.add(dsdVar);
                }
                dsdVar.a(new defpackage.opo(obj, oprVar, dsdVar, i), opsVar.e);
                xsvVarQ.k(oprVar);
                return "GlidePhotoManagerImpl.loadCallBackgroundIntoBitmap";
            case 4:
                oqi oqiVar = (oqi) this.a;
                ipc ipcVar = (ipc) oqiVar.g.orElseThrow();
                j$.util.Optional optional = (j$.util.Optional) this.b;
                java.lang.String strE = ((defpackage.oql) optional.orElseThrow()).e();
                android.content.Context context = oqiVar.b;
                if (context == null) {
                    throw new java.lang.IllegalArgumentException("Client context is not set.");
                }
                if (android.text.TextUtils.isEmpty(strE)) {
                    throw new java.lang.IllegalArgumentException("Trigger ID cannot be null or empty.");
                }
                ahex ahexVar = new ahex(context, strE, new defpackage.oqf(oqiVar, optional, dsdVar), (java.lang.String) oqiVar.i.a(), ((java.lang.Boolean) oqiVar.h.a()).booleanValue());
                java.lang.String strCo = ahvr.co((java.lang.String) ahexVar.d);
                afjh afjhVar = afjh.a;
                afjhVar.h = strCo;
                if (android.text.TextUtils.isEmpty(afjhVar.h)) {
                    android.util.Log.d("SurveyController", "API key was not set or set empty by the client. API key is needed if survey is targeted for signed out users as well. For surveys targeted for only signin users, api key is not needed.");
                }
                afjq afjqVarE = afjhVar.e(ahexVar, afjhVar.h);
                akzx akzxVarM = anaj.a.m();
                java.lang.String str = afjhVar.h;
                akzxVarM.u();
                anaj anajVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                anajVar.b = str;
                akzxVarM.u();
                akzxVarM.b.c = a.Q(4);
                anaj anajVarP = akzxVarM.p();
                afjq afjqVarE2 = afjhVar.e(ahexVar, "AIzaSyBmGDOmYcGmylWMKTdQxmf5vXWAuybv7qA");
                ajxi ajxiVar = new ajxi(afjhVar, ahexVar, afjqVarE);
                if (anajVarP == null) {
                    android.util.Log.e("NetworkCallerGrpc", "Survey startup config request was null");
                    return "DialerHatsSurveyClient.requestSurvey";
                }
                long j = afjz.a;
                afjm.a().execute(new acxq(afjqVarE2, anajVarP, ajxiVar, 7, (byte[]) null));
                return "DialerHatsSurveyClient.requestSurvey";
            case 5:
                java.lang.Object obj2 = this.a;
                java.lang.Object obj3 = this.b;
                tbb tbbVar = new tbb(obj3, obj2, dsdVar, 15, (char[]) null);
                vix vixVar = (vix) obj3;
                java.util.concurrent.Executor executor = vixVar.d;
                vixVar.e.g(ahrv.g(ahvr.B(ahvr.P(tbbVar, executor), java.lang.SecurityException.class, new vfw(dsdVar, 8), vixVar.c)).i(new vfv(obj3, dsdVar, 10), executor), vixVar.a(), java.util.concurrent.TimeUnit.MILLISECONDS);
                return null;
            case 6:
                java.lang.Object obj4 = this.b;
                java.lang.Object obj5 = this.a;
                agsm.i(1169, ahvr.E(new defpackage.opo(obj5, obj4, dsdVar, 15), ((xca) obj5).d), "failed to initiate audio route change", new java.lang.Object[0]);
                return "audio route changed";
            default:
                java.lang.Object obj6 = this.b;
                ymr ymrVar = (ymr) obj6;
                ylr ylrVar = new ylr(ymrVar, dsdVar);
                try {
                    dsdVar.a(new vet(((ymr) obj6).f(((ymq) this.a).a, ylrVar), 18), ymrVar.d);
                    return "prepareInferenceEngineFuture";
                } catch (android.os.RemoteException e) {
                    android.util.Log.e(ymr.a, "Failed to prepare inference engine.", e);
                    dsdVar.d(new ymi(3, 6, "Failed to prepare inference engine.", e));
                    return null;
                } catch (java.lang.RuntimeException e2) {
                    android.util.Log.e(ymr.a, "Failed to prepare inference engine.", e2);
                    dsdVar.d(new ymi(3, 0, "Failed to prepare inference engine.", e2));
                    return null;
                }
        }
    }

    public /* synthetic */ jnr(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
