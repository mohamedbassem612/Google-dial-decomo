package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hxv {
    public static final aimz a = aimz.i("com/android/dialer/audio/audioinjector/AudioInjector");
    public final aolr b;
    public final aoss c;
    public final defpackage.hyj d;
    public final rlv e;
    public aoub f;
    public boolean g;
    public defpackage.hxg h;
    public final aowi i;
    public final zoi j;
    public final qbe k;
    public final apdp l;
    public final apni m;
    private final defpackage.hys n;
    private final defpackage.hyp o;
    private final defpackage.idh p;
    private final izg q;

    public hxv(aolr aolrVar, aoss aossVar, defpackage.idh idhVar, defpackage.hyj hyjVar, izg izgVar, defpackage.hys hysVar, defpackage.hyp hypVar, rlv rlvVar, qbe qbeVar, apni apniVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(idhVar, "tidepodsCallAudio");
        aooh.f(hyjVar, "localAudioPlayer");
        aooh.f(izgVar, "ttsInstance");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(apniVar, "androidJobs");
        this.b = aolrVar;
        this.c = aossVar;
        this.p = idhVar;
        this.d = hyjVar;
        this.q = izgVar;
        this.n = hysVar;
        this.o = hypVar;
        this.e = rlvVar;
        this.k = qbeVar;
        this.m = apniVar;
        this.l = new apdp();
        this.i = aooh.H(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 0, (aonj) null, 6);
        this.j = new defpackage.jwb(this, 1);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final java.lang.Object a(defpackage.hxw hxwVar, aoln aolnVar) throws aois {
        defpackage.hxk hxkVar;
        defpackage.hys hysVar;
        defpackage.hys hysVar2;
        java.io.File file;
        java.lang.Object obj = hxwVar;
        if (aolnVar instanceof defpackage.hxk) {
            hxkVar = (defpackage.hxk) aolnVar;
            int i = hxkVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hxkVar.d = i - Integer.MIN_VALUE;
            } else {
                hxkVar = new defpackage.hxk(this, aolnVar);
            }
        } else {
            hxkVar = new defpackage.hxk(this, aolnVar);
        }
        java.lang.Object objAj = hxkVar.b;
        aolu aoluVar = aolu.a;
        int i2 = hxkVar.d;
        if (i2 == 0) {
            aooc.af(objAj);
            j$.util.Objects.checkIndex(0, 5);
            if (obj != null) {
                if (obj instanceof defpackage.hxx) {
                    file = ((defpackage.hxx) obj).a;
                } else if (obj instanceof defpackage.hxy) {
                    defpackage.hyp hypVar = this.o;
                    hxkVar.d = 1;
                    objAj = aoov.aj(hypVar.c, new defpackage.fyn(hypVar, (defpackage.hxy) obj, (aoln) null, 8), hxkVar);
                    if (objAj == aoluVar) {
                        return aoluVar;
                    }
                    file = (java.io.File) objAj;
                } else if (obj instanceof defpackage.hxz) {
                    defpackage.hys hysVar3 = this.n;
                    izg izgVar = this.q;
                    hxkVar.a = obj;
                    hxkVar.e = hysVar3;
                    hxkVar.d = 2;
                    java.lang.Object objM = izgVar.m(hxkVar);
                    if (objM == aoluVar) {
                        return aoluVar;
                    }
                    objAj = objM;
                    hysVar2 = hysVar3;
                    hxkVar.a = null;
                    hxkVar.e = null;
                    hxkVar.d = 3;
                    objAj = hysVar2.b((android.speech.tts.TextToSpeech) objAj, (defpackage.hxz) obj, hxkVar);
                    if (objAj == aoluVar) {
                        return aoluVar;
                    }
                    file = (java.io.File) objAj;
                } else if (obj instanceof defpackage.hya) {
                    defpackage.hys hysVar4 = this.n;
                    izg izgVar2 = this.q;
                    hxkVar.a = obj;
                    hxkVar.e = hysVar4;
                    hxkVar.d = 4;
                    java.lang.Object objM2 = izgVar2.m(hxkVar);
                    if (objM2 == aoluVar) {
                        return aoluVar;
                    }
                    hysVar = hysVar4;
                    objAj = objM2;
                    hxkVar.a = null;
                    hxkVar.e = null;
                    hxkVar.d = 5;
                    objAj = aoov.aj(hxkVar.u(), new defpackage.hyq(hysVar, (android.speech.tts.TextToSpeech) objAj, (defpackage.hya) obj, (aoln) null, 0), hxkVar);
                    if (objAj == aoluVar) {
                        return aoluVar;
                    }
                    file = (java.io.File) objAj;
                }
            }
            throw new aois();
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hysVar2 = hxkVar.e;
                obj = hxkVar.a;
                aooc.af(objAj);
                hxkVar.a = null;
                hxkVar.e = null;
                hxkVar.d = 3;
                objAj = hysVar2.b((android.speech.tts.TextToSpeech) objAj, (defpackage.hxz) obj, hxkVar);
                if (objAj == aoluVar) {
                    return aoluVar;
                }
            } else if (i2 != 3) {
                if (i2 == 4) {
                    defpackage.hys hysVar5 = hxkVar.e;
                    obj = hxkVar.a;
                    aooc.af(objAj);
                    hysVar = hysVar5;
                    hxkVar.a = null;
                    hxkVar.e = null;
                    hxkVar.d = 5;
                    objAj = aoov.aj(hxkVar.u(), new defpackage.hyq(hysVar, (android.speech.tts.TextToSpeech) objAj, (defpackage.hya) obj, (aoln) null, 0), hxkVar);
                    if (objAj == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (i2 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aooc.af(objAj);
                }
                file = (java.io.File) objAj;
            } else {
                aooc.af(objAj);
            }
            file = (java.io.File) objAj;
        } else {
            aooc.af(objAj);
            file = (java.io.File) objAj;
        }
        java.lang.String absolutePath = file.getAbsolutePath();
        aooh.e(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.hxw hxwVar, boolean z, aoln aolnVar) {
        defpackage.hxp hxpVar;
        defpackage.hyj hyjVar;
        if (aolnVar instanceof defpackage.hxp) {
            hxpVar = (defpackage.hxp) aolnVar;
            int i = hxpVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hxpVar.d = i - Integer.MIN_VALUE;
            } else {
                hxpVar = new defpackage.hxp(this, aolnVar);
            }
        } else {
            hxpVar = new defpackage.hxp(this, aolnVar);
        }
        java.lang.Object obj = hxpVar.b;
        aolu aoluVar = aolu.a;
        int i2 = hxpVar.d;
        if (i2 == 0) {
            aooc.af(obj);
            defpackage.hyj hyjVar2 = this.d;
            hxpVar.e = hyjVar2;
            hxpVar.a = z;
            hxpVar.d = 1;
            java.lang.Object objA = a(hxwVar, hxpVar);
            if (objA != aoluVar) {
                hyjVar = hyjVar2;
                obj = objA;
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
            return obj;
        }
        z = hxpVar.a;
        defpackage.hyj hyjVar3 = hxpVar.e;
        aooc.af(obj);
        hyjVar = hyjVar3;
        boolean z2 = z;
        hxpVar.e = null;
        hxpVar.d = 2;
        java.lang.Object objA2 = ahvr.ag(hyjVar.b, hyjVar.f, new defpackage.hyg(hyjVar, (java.lang.String) obj, z2, (aoln) null, 0)).a(hxpVar);
        if (objA2 != aoluVar) {
            return objA2;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.hxw hxwVar, boolean z, aoln aolnVar) {
        defpackage.hxr hxrVar;
        if (aolnVar instanceof defpackage.hxr) {
            hxrVar = (defpackage.hxr) aolnVar;
            int i = hxrVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hxrVar.d = i - Integer.MIN_VALUE;
            } else {
                hxrVar = new defpackage.hxr(this, aolnVar);
            }
        } else {
            hxrVar = new defpackage.hxr(this, aolnVar);
        }
        java.lang.Object objA = hxrVar.b;
        aolu aoluVar = aolu.a;
        int i2 = hxrVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                z = hxrVar.a;
                aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
            }
            aooh.e(objA, "await(...)");
            return objA;
        }
        aooc.af(objA);
        hxrVar.a = z;
        hxrVar.d = 1;
        objA = a(hxwVar, hxrVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        java.lang.String str = (java.lang.String) objA;
        defpackage.idh idhVar = this.p;
        ajcq ajcqVarF = z ? idhVar.f(str) : idhVar.e(str);
        hxrVar.d = 2;
        objA = aosv.D(ajcqVarF, hxrVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        aooh.e(objA, "await(...)");
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.hxs hxsVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.hxs) {
            hxsVar = (defpackage.hxs) aolnVar;
            int i = hxsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hxsVar.c = i - Integer.MIN_VALUE;
            } else {
                hxsVar = new defpackage.hxs(this, aolnVar);
            }
        } else {
            hxsVar = new defpackage.hxs(this, aolnVar);
        }
        java.lang.Object obj = hxsVar.a;
        aojh aojhVar = aolu.a;
        int i2 = hxsVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.l;
                hxsVar.d = apdpVar2;
                hxsVar.c = 1;
                if (apdpVar2.b(hxsVar) != aojhVar) {
                    apdpVar = apdpVar2;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = hxsVar.d;
            aooc.af(obj);
            if (this.f == null) {
                a.b().l("com/android/dialer/audio/audioinjector/AudioInjector", "startRequestReceiverJobIfNotStarted$<anonymous>", 306, "AudioInjector.kt").v("launching a job to receive audio injection requests");
                aoub aoubVarJ = afsq.J(this.c, new defpackage.dqx(this, (aoln) null, 12));
                aoubVarJ.p(new defpackage.guv(12));
                this.f = aoubVarJ;
            }
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    public final java.lang.Object e(defpackage.hxw hxwVar, aoln aolnVar) {
        return aoov.aj(this.b, new defpackage.hxq(this, hxwVar, (aoln) null, 1, (byte[]) null), aolnVar);
    }

    public final java.lang.Object f(defpackage.hxw hxwVar, defpackage.hxw hxwVar2, aoln aolnVar) {
        return aoov.aj(this.b, new defpackage.hxl(this, hxwVar, hxwVar2, (aoln) null, 0), aolnVar);
    }

    public final java.lang.Object g(int i, aoln aolnVar) {
        return aoov.aj(this.b, new defpackage.hxn(this, i, null), aolnVar);
    }

    public final ajcq h(int i) {
        return aosv.F(this.c, 0, new defpackage.hxo(this, i, (aoln) null, 0), 3);
    }

    public final ajcq i(defpackage.hxw hxwVar) {
        aooh.f(hxwVar, "audio");
        return aosv.F(this.c, 0, new huk(this, hxwVar, (aoln) null, 6, (char[]) null), 3);
    }
}
