package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ffh implements defpackage.fft {
    public defpackage.frr a;
    private final defpackage.ffg b;
    private final defpackage.evq c;
    private boolean d;

    public ffh(android.content.Context context, defpackage.flm flmVar) {
        defpackage.evw evwVar = new defpackage.evw(context);
        defpackage.frq frqVar = new defpackage.frq(1);
        this.c = evwVar;
        this.a = frqVar;
        defpackage.ffg ffgVar = new defpackage.ffg(flmVar, frqVar);
        this.b = ffgVar;
        if (evwVar != ffgVar.d) {
            ffgVar.d = evwVar;
            ffgVar.b.clear();
            ffgVar.c.clear();
        }
        this.d = true;
        defpackage.eqe.b(5);
    }

    public static defpackage.fft a(java.lang.Class cls, defpackage.evq evqVar) {
        try {
            return (defpackage.fft) cls.getConstructor(defpackage.evq.class).newInstance(evqVar);
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    @Override // defpackage.fft
    public final defpackage.ffw b(defpackage.eqt eqtVar) {
        fff fffVar;
        defpackage.eqq eqqVar = eqtVar.b;
        ahvr.ci(eqqVar);
        android.net.Uri uri = eqqVar.a;
        java.lang.String scheme = uri.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        java.lang.String str = eqqVar.b;
        if (j$.util.Objects.equals(str, "application/x-image-uri")) {
            long j = eqqVar.i;
            java.lang.String str2 = eum.a;
            throw null;
        }
        int iQ = eum.q(uri, str);
        if (eqqVar.i != -9223372036854775807L) {
            defpackage.flf flfVar = (defpackage.flf) this.b.a;
            flfVar.f();
            flfVar.e();
        }
        try {
            defpackage.ffg ffgVar = this.b;
            java.util.Map map = ffgVar.c;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iQ);
            defpackage.fft fftVar = (defpackage.fft) map.get(numValueOf);
            int i = 0;
            if (fftVar == null) {
                java.util.Map map2 = ffgVar.b;
                fff fffVar2 = (ahzi) map2.get(numValueOf);
                if (fffVar2 == null) {
                    defpackage.evq evqVar = ffgVar.d;
                    ahvr.ci(evqVar);
                    if (iQ != 0) {
                        if (iQ == 1) {
                            fffVar = new fff(java.lang.Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(defpackage.fft.class), evqVar, 0);
                        } else if (iQ != 2) {
                            fffVar2 = iQ != 3 ? new fff(ffgVar, evqVar, 3) : new defpackage.exm(java.lang.Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(defpackage.fft.class), 5);
                        } else {
                            fffVar2 = new fff(java.lang.Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(defpackage.fft.class), evqVar, 2);
                        }
                        map2.put(numValueOf, fffVar2);
                    } else {
                        fffVar = new fff(java.lang.Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(defpackage.fft.class), evqVar, 1);
                    }
                    fffVar2 = fffVar;
                    map2.put(numValueOf, fffVar2);
                }
                fftVar = (defpackage.fft) fffVar2.eZ();
                fftVar.d(ffgVar.f);
                fftVar.c(ffgVar.e);
                map.put(numValueOf, fftVar);
            }
            defpackage.eqp eqpVar = eqtVar.c;
            defpackage.eqo eqoVar = new defpackage.eqo(eqpVar);
            if (eqpVar.a == -9223372036854775807L) {
                eqoVar.a = -9223372036854775807L;
            }
            if (eqpVar.d == -3.4028235E38f) {
                eqoVar.d = -3.4028235E38f;
            }
            if (eqpVar.e == -3.4028235E38f) {
                eqoVar.e = -3.4028235E38f;
            }
            if (eqpVar.b == -9223372036854775807L) {
                eqoVar.b = -9223372036854775807L;
            }
            if (eqpVar.c == -9223372036854775807L) {
                eqoVar.c = -9223372036854775807L;
            }
            defpackage.eqp eqpVar2 = new defpackage.eqp(eqoVar);
            if (!eqpVar2.equals(eqpVar)) {
                defpackage.eqk eqkVar = new defpackage.eqk(eqtVar);
                eqkVar.c = new defpackage.eqo(eqpVar2);
                eqtVar = eqkVar.a();
            }
            defpackage.ffw ffwVarB = fftVar.b(eqtVar);
            defpackage.eqq eqqVar2 = eqtVar.b;
            aike aikeVar = eqqVar2.g;
            if (!aikeVar.isEmpty()) {
                if (this.d) {
                    int i2 = aikeVar.d;
                    defpackage.ffw[] ffwVarArr = new defpackage.ffw[i2];
                    if (i2 > 0) {
                        defpackage.eqf eqfVar = new defpackage.eqf();
                        java.lang.String str3 = ((defpackage.eqs) aikeVar.get(0)).b;
                        eqfVar.c(null);
                        java.lang.String str4 = ((defpackage.eqs) aikeVar.get(0)).c;
                        eqfVar.d = null;
                        int i3 = ((defpackage.eqs) aikeVar.get(0)).d;
                        eqfVar.e = 0;
                        int i4 = ((defpackage.eqs) aikeVar.get(0)).e;
                        eqfVar.f = 0;
                        java.lang.String str5 = ((defpackage.eqs) aikeVar.get(0)).f;
                        eqfVar.b = null;
                        java.lang.String str6 = ((defpackage.eqs) aikeVar.get(0)).g;
                        eqfVar.a = null;
                        final defpackage.eqg eqgVar = new defpackage.eqg(eqfVar);
                        defpackage.fgo fgoVar = new defpackage.fgo(this.c, new defpackage.flm() { // from class: ffe
                            @Override // defpackage.flm
                            public final /* synthetic */ defpackage.flj[] a(android.net.Uri uri2, java.util.Map map3) {
                                defpackage.ffh ffhVar = this.a;
                                defpackage.flj[] fljVarArr = new defpackage.flj[1];
                                defpackage.frr frrVar = ffhVar.a;
                                defpackage.eqg eqgVar2 = eqgVar;
                                fljVarArr[0] = frrVar.c(eqgVar2) ? new defpackage.frn(ffhVar.a.b(eqgVar2)) : new defpackage.fmz(eqgVar2, 1);
                                return fljVarArr;
                            }
                        });
                        if (this.a.c(eqgVar)) {
                            defpackage.eqf eqfVar2 = new defpackage.eqf(eqgVar);
                            eqfVar2.c("application/x-media3-cues");
                            eqfVar2.j = eqgVar.p;
                            eqfVar2.M = this.a.a(eqgVar);
                            eqgVar = new defpackage.eqg(eqfVar2);
                        }
                        fgoVar.a = eqgVar;
                        fgoVar.b = true;
                        android.net.Uri uri2 = ((defpackage.eqs) aikeVar.get(0)).a;
                        throw null;
                    }
                    ffwVarB = new defpackage.fgz(ffwVarB, aikeVar, ffwVarArr);
                } else {
                    int i5 = aikeVar.d;
                    defpackage.ffw[] ffwVarArr2 = new defpackage.ffw[i5 + 1];
                    ffwVarArr2[0] = ffwVarB;
                    while (i < i5) {
                        int i6 = i + 1;
                        ffwVarArr2[i6] = new defpackage.fhb((defpackage.eqs) aikeVar.get(i));
                        i = i6;
                    }
                    ffwVarB = new defpackage.fge(ffwVarArr2);
                }
            }
            defpackage.eql eqlVar = eqtVar.e;
            ahvr.ci(eqqVar2);
            defpackage.eqj eqjVar = eqqVar2.d;
            return ffwVarB;
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    @Override // defpackage.fft
    @java.lang.Deprecated
    public final /* synthetic */ void c(boolean z) {
        this.d = z;
        defpackage.ffg ffgVar = this.b;
        ffgVar.e = z;
        ((defpackage.flf) ffgVar.a).b(z);
        java.util.Iterator it = ffgVar.c.values().iterator();
        while (it.hasNext()) {
            ((defpackage.fft) it.next()).c(z);
        }
    }

    @Override // defpackage.fft
    public final /* synthetic */ void d(defpackage.frr frrVar) {
        ahvr.ci(frrVar);
        this.a = frrVar;
        defpackage.ffg ffgVar = this.b;
        ffgVar.f = frrVar;
        ((defpackage.flf) ffgVar.a).g(frrVar);
        java.util.Iterator it = ffgVar.c.values().iterator();
        while (it.hasNext()) {
            ((defpackage.fft) it.next()).d(frrVar);
        }
    }
}
