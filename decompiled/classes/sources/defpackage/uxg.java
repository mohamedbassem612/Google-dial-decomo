package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uxg extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    int b;
    final /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxg(defpackage.accp accpVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = accpVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.uxg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i == 1) {
            return ((defpackage.uxg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i == 2) {
            return ((defpackage.uxg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i == 3) {
            return ((defpackage.uxg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i != 4) {
            return ((defpackage.uxg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.uxg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:169:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x014b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66, types: [adzh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [adzh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [adzh] */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aolu aoluVar;
        java.lang.Object obj2;
        java.lang.Object objA;
        defpackage.alam alamVar;
        java.lang.Object objO;
        java.lang.Object objT;
        java.lang.Object obj3;
        defpackage.unv unvVarD;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object objA2;
        defpackage.alam alamVar2;
        java.lang.Object objAj;
        java.lang.Object obj6;
        ?? r0;
        ?? r1;
        java.lang.Object objA3;
        ?? r2;
        defpackage.adzf adzfVar;
        java.lang.Object obj7;
        java.lang.Object obj8;
        java.lang.Object obj9;
        int i = this.$cid;
        boolean z = true;
        if (i == 0) {
            aoluVar = defpackage.aolu.a;
            if (this.b != 0) {
                obj2 = this.a;
                try {
                    defpackage.aooc.af(obj);
                    objA = obj;
                } catch (java.lang.IllegalStateException e) {
                    e = e;
                    alamVar = new defpackage.alam(((defpackage.amsa) ((defpackage.akzx) obj2).b).e, defpackage.amsa.a);
                    if (!alamVar.isEmpty()) {
                    }
                    throw e;
                }
            } else {
                defpackage.aooc.af(obj);
                java.lang.Object obj10 = this.c;
                if (((uxh) obj10).h) {
                    ((defpackage.aimw) uxh.a.b().l("com/android/dialer/tts/api/session/TtsSession", "prewarmSynthesizer$<anonymous>", 75, "TtsSession.kt")).v("TTS Session already pre-warmed");
                    return java.lang.Boolean.TRUE;
                }
                ((defpackage.aimw) uxh.a.b().l("com/android/dialer/tts/api/session/TtsSession", "prewarmSynthesizer$<anonymous>", 78, "TtsSession.kt")).v("Pre-warming TTS Session");
                defpackage.akzx akzxVarM = defpackage.amsa.b.m();
                defpackage.aooh.e(akzxVarM, "newBuilder(...)");
                try {
                    uxk uxkVar = ((uxh) obj10).e;
                    android.speech.tts.TextToSpeech textToSpeech = ((uxh) obj10).g;
                    if (textToSpeech == null) {
                        throw new java.lang.IllegalStateException("Please call start before using the session!");
                    }
                    uwu uwuVar = ((uxh) obj10).b;
                    this.a = akzxVarM;
                    this.b = 1;
                    objA = uxkVar.a(textToSpeech, "42", uwuVar, akzxVarM, this);
                    if (objA != aoluVar) {
                        obj2 = akzxVarM;
                    }
                } catch (java.lang.IllegalStateException e2) {
                    e = e2;
                    obj2 = akzxVarM;
                    alamVar = new defpackage.alam(((defpackage.amsa) ((defpackage.akzx) obj2).b).e, defpackage.amsa.a);
                    if (!alamVar.isEmpty() || defpackage.ajsz.bI(alamVar) != amsb.d) {
                        throw e;
                    }
                    ((defpackage.aimw) uxh.a.b().l("com/android/dialer/tts/api/session/TtsSession", "prewarmSynthesizer$<anonymous>", 100, "TtsSession.kt")).v("Voice is not available for offline synthesis. A download request has been sent");
                    z = false;
                }
            }
            ((java.io.File) objA).deleteOnExit();
            ((uxh) this.c).h = true;
            return java.lang.Boolean.valueOf(z);
        }
        if (i != 1) {
            if (i == 2) {
                aoluVar = defpackage.aolu.a;
                if (this.b != 0) {
                    obj5 = this.a;
                    try {
                        defpackage.aooc.af(obj);
                        objA2 = obj;
                    } catch (java.lang.IllegalStateException e3) {
                        e = e3;
                        alamVar2 = new defpackage.alam(((defpackage.amsa) ((defpackage.akzx) obj5).b).e, defpackage.amsa.a);
                        if (!alamVar2.isEmpty()) {
                        }
                        throw e;
                    }
                } else {
                    defpackage.aooc.af(obj);
                    defpackage.akzx akzxVarM2 = defpackage.amsa.b.m();
                    defpackage.aooh.e(akzxVarM2, "newBuilder(...)");
                    try {
                        java.lang.Object obj11 = this.c;
                        uxk uxkVar2 = ((uxh) obj11).e;
                        android.speech.tts.TextToSpeech textToSpeech2 = ((uxh) obj11).g;
                        if (textToSpeech2 == null) {
                            throw new java.lang.IllegalStateException("Please call start before using the session!");
                        }
                        vqf vqfVarBd = defpackage.wsc.bd(((uxh) obj11).b.L());
                        vqfVarBd.r();
                        uwu uwuVarP = vqfVarBd.p();
                        this.a = akzxVarM2;
                        this.b = 1;
                        objA2 = uxkVar2.a(textToSpeech2, "42", uwuVarP, akzxVarM2, this);
                        if (objA2 != aoluVar) {
                            obj5 = akzxVarM2;
                        }
                    } catch (java.lang.IllegalStateException e4) {
                        e = e4;
                        obj5 = akzxVarM2;
                        alamVar2 = new defpackage.alam(((defpackage.amsa) ((defpackage.akzx) obj5).b).e, defpackage.amsa.a);
                        if (!alamVar2.isEmpty() || defpackage.ajsz.bI(alamVar2) != amsb.d) {
                            throw e;
                        }
                        ((defpackage.aimw) uxh.a.b().l("com/android/dialer/tts/api/session/TtsSession", "requestVoiceDownload$<anonymous>", 199, "TtsSession.kt")).v("Voice is not available for offline synthesis. A download request has been sent");
                    }
                }
                ((java.io.File) objA2).deleteOnExit();
                return defpackage.aojh.a;
            }
            if (i == 3) {
                defpackage.aolu aoluVar2 = defpackage.aolu.a;
                try {
                    if (this.b != 0) {
                        obj6 = this.a;
                        defpackage.aooc.af(obj);
                        objAj = obj;
                    } else {
                        defpackage.aooc.af(obj);
                        java.lang.Object obj12 = this.c;
                        if (((uxh) obj12).g != null) {
                            throw new java.lang.IllegalStateException("Start can only be called once!");
                        }
                        ((defpackage.aimw) uxh.a.b().l("com/android/dialer/tts/api/session/TtsSession", "start$<anonymous>", 52, "TtsSession.kt")).v("Starting TTS Session");
                        uxm uxmVar = ((uxh) obj12).d;
                        uwu uwuVar2 = ((uxh) obj12).b;
                        defpackage.akzx akzxVar = ((uxh) obj12).i;
                        this.a = obj12;
                        this.b = 1;
                        objAj = defpackage.aoov.aj(uxmVar.c, new ugg(akzxVar, uxmVar, uwuVar2, (defpackage.aoln) null, 11), this);
                        obj4 = aoluVar2;
                        if (objAj != aoluVar2) {
                            obj6 = obj12;
                        }
                    }
                    ((uxh) obj6).g = (android.speech.tts.TextToSpeech) objAj;
                    return defpackage.aojh.a;
                } catch (java.lang.IllegalStateException e5) {
                    uxh uxhVar = (uxh) this.c;
                    uxhVar.f.z((defpackage.amsa) uxhVar.i.r());
                    throw e5;
                }
            }
            defpackage.aolu aoluVar3 = defpackage.aolu.a;
            if (i != 4) {
                int i2 = this.b;
                if (i2 != 0 && i2 != 1) {
                    if (i2 != 2) {
                        obj7 = this.a;
                        defpackage.aooc.af(obj);
                    } else {
                        defpackage.aooc.af(obj);
                    }
                    obj8 = this.c;
                    if (((defpackage.cmv) obj8).D) {
                        for (agjt agjtVar : ((agjx) obj7).d) {
                            obj9 = agjtVar.b;
                            if (obj9 != null) {
                                ((agks) obj8).i.put(agjtVar.a, obj9);
                            }
                        }
                        agks agksVar = (agks) obj8;
                        agksVar.l++;
                        agksVar.d();
                        return defpackage.aojh.a;
                    }
                    return defpackage.aojh.a;
                }
                defpackage.aooc.af(obj);
                java.lang.Object obj13 = this.c;
                java.lang.Float f = new java.lang.Float(0.0f);
                this.b = 2;
                if (((agks) obj13).c.f(f, this) == aoluVar3) {
                    return aoluVar3;
                }
                agks agksVar2 = (agks) this.c;
                agksVar2.j = (agjx) agksVar2.k.get(agksVar2.l);
                agjx agjxVar = agksVar2.j;
                if (agjxVar != null) {
                    long j = agjxVar.a;
                    if (j > 0) {
                        defpackage.alm almVar = new defpackage.alm((int) j, (int) agjxVar.b, agjxVar.c);
                        defpackage.aii aiiVar = agksVar2.c;
                        java.lang.Float f2 = new java.lang.Float(1.0f);
                        this.a = agjxVar;
                        this.b = 3;
                        if (defpackage.aii.l(aiiVar, f2, almVar, null, null, this, 12) == aoluVar3) {
                            return aoluVar3;
                        }
                    } else {
                        defpackage.aii aiiVar2 = agksVar2.c;
                        java.lang.Float f3 = new java.lang.Float(1.0f);
                        this.a = agjxVar;
                        this.b = 4;
                        if (aiiVar2.f(f3, this) == aoluVar3) {
                            return aoluVar3;
                        }
                    }
                    obj7 = agjxVar;
                    obj8 = this.c;
                    if (((defpackage.cmv) obj8).D) {
                        while (r1.hasNext()) {
                            obj9 = agjtVar.b;
                            if (obj9 != null) {
                                ((agks) obj8).i.put(agjtVar.a, obj9);
                            }
                        }
                        agks agksVar3 = (agks) obj8;
                        agksVar3.l++;
                        agksVar3.d();
                        return defpackage.aojh.a;
                    }
                }
                return defpackage.aojh.a;
            }
            int i3 = this.b;
            if (i3 != 0) {
                if (i3 == 1) {
                    java.lang.Object obj14 = this.a;
                    defpackage.aooc.af(obj);
                    r0 = obj14;
                } else if (i3 == 2) {
                    java.lang.Object obj15 = this.a;
                    defpackage.aooc.af(obj);
                    r1 = obj15;
                    java.lang.Object obj16 = this.c;
                    this.a = r1;
                    this.b = 3;
                    objA3 = r1.a(((defpackage.accp) obj16).f.a(), this);
                    r2 = r1;
                    if (objA3 == aoluVar3) {
                        return aoluVar3;
                    }
                    adzfVar = ((defpackage.accp) this.c).i;
                    if (adzfVar != null) {
                        this.a = null;
                        this.b = 4;
                        if (r2.a(adzfVar.a(), this) == aoluVar3) {
                            return aoluVar3;
                        }
                    }
                } else if (i3 != 3) {
                    defpackage.aooc.af(obj);
                } else {
                    java.lang.Object obj17 = this.a;
                    defpackage.aooc.af(obj);
                    r2 = obj17;
                    adzfVar = ((defpackage.accp) this.c).i;
                    if (adzfVar != null) {
                        this.a = null;
                        this.b = 4;
                        if (r2.a(adzfVar.a(), this) == aoluVar3) {
                            return aoluVar3;
                        }
                    }
                }
                return defpackage.aojh.a;
            }
            defpackage.aooc.af(obj);
            defpackage.accp accpVar = (defpackage.accp) this.c;
            java.lang.Object objA4 = accpVar.b.a();
            defpackage.aooh.e(objA4, "get(...)");
            defpackage.adzh adzhVar = (defpackage.adzh) objA4;
            this.a = adzhVar;
            this.b = 1;
            if (adzhVar.a(accpVar.g.a(), this) == aoluVar3) {
                return aoluVar3;
            }
            r0 = adzhVar;
            java.lang.Object obj18 = this.c;
            this.a = r0;
            this.b = 2;
            java.lang.Object objA5 = r0.a(((defpackage.accp) obj18).h.a(), this);
            r1 = r0;
            if (objA5 == aoluVar3) {
                return aoluVar3;
            }
            java.lang.Object obj19 = this.c;
            this.a = r1;
            this.b = 3;
            objA3 = r1.a(((defpackage.accp) obj19).f.a(), this);
            r2 = r1;
            if (objA3 == aoluVar3) {
                return aoluVar3;
            }
            adzfVar = ((defpackage.accp) this.c).i;
            if (adzfVar != null) {
                this.a = null;
                this.b = 4;
                if (r2.a(adzfVar.a(), this) == aoluVar3) {
                    return aoluVar3;
                }
            }
            return defpackage.aojh.a;
        }
        defpackage.aolu aoluVar4 = defpackage.aolu.a;
        int i4 = this.b;
        if (i4 == 0) {
            defpackage.aooc.af(obj);
            defpackage.gpd gpdVar = (defpackage.gpd) this.c;
            if (!((java.util.concurrent.atomic.AtomicBoolean) gpdVar.c).getAndSet(true)) {
                java.lang.Object obj20 = gpdVar.d;
                this.b = 1;
                objT = ((defpackage.tvn) obj20).t(this);
                if (objT == aoluVar4) {
                    return aoluVar4;
                }
                return defpackage.ttj.E((defpackage.unv) objT);
            }
            this.b = 2;
            objO = gpdVar.o(this);
            if (objO == aoluVar4) {
                return aoluVar4;
            }
            obj3 = this.c;
            java.util.List list = (java.util.List) objO;
            unvVarD = defpackage.ttj.D(list);
            this.a = list;
            this.b = 3;
            obj4 = list;
            if (((defpackage.tvn) ((defpackage.gpd) obj3).d).u(unvVarD, this) == aoluVar4) {
                return aoluVar4;
            }
        } else {
            if (i4 == 1) {
                defpackage.aooc.af(obj);
                objT = obj;
                return defpackage.ttj.E((defpackage.unv) objT);
            }
            if (i4 != 2) {
                java.lang.Object obj21 = this.a;
                defpackage.aooc.af(obj);
                return obj21;
            }
            defpackage.aooc.af(obj);
            objO = obj;
            obj3 = this.c;
            java.util.List list2 = (java.util.List) objO;
            unvVarD = defpackage.ttj.D(list2);
            this.a = list2;
            this.b = 3;
            obj4 = list2;
            if (((defpackage.tvn) ((defpackage.gpd) obj3).d).u(unvVarD, this) == aoluVar4) {
                return aoluVar4;
            }
        }
        return obj4;
        return aoluVar;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.uxg((uxh) this.c, aolnVar, 0);
        }
        if (i == 1) {
            return new defpackage.uxg((defpackage.gpd) this.c, aolnVar, 1);
        }
        if (i == 2) {
            return new defpackage.uxg((uxh) this.c, aolnVar, 2, (byte[]) null);
        }
        if (i == 3) {
            return new defpackage.uxg((uxh) this.c, aolnVar, 3, (char[]) null);
        }
        java.lang.Object obj2 = this.c;
        return i != 4 ? new defpackage.uxg((agks) obj2, aolnVar, 5) : new defpackage.uxg((defpackage.accp) obj2, aolnVar, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxg(agks agksVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = agksVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxg(defpackage.gpd gpdVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = gpdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxg(uxh uxhVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = uxhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxg(uxh uxhVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = uxhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxg(uxh uxhVar, defpackage.aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = uxhVar;
    }
}
