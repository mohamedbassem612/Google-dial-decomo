package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aofc implements defpackage.anuo {
    final /* synthetic */ defpackage.aofe a;

    public aofc(defpackage.aofe aofeVar) {
        j$.util.Objects.requireNonNull(aofeVar);
        this.a = aofeVar;
    }

    @Override // defpackage.anuo
    public final void a(anqw anqwVar) {
        int i = defpackage.aoik.a;
        defpackage.aofd aofdVar = this.a.f;
        int i2 = defpackage.aofd.z;
        synchronized (aofdVar.a) {
            aofdVar.q(anqwVar, true, null);
        }
    }

    @Override // defpackage.anuo
    public final void b(defpackage.aodu aoduVar, boolean z, boolean z2, int i) {
        apoy apoyVar;
        int i2 = defpackage.aoik.a;
        if (aoduVar == null) {
            apoyVar = defpackage.aofe.a;
        } else {
            apoyVar = ((defpackage.aofq) aoduVar).a;
            int i3 = (int) apoyVar.b;
            if (i3 > 0) {
                this.a.w(i3);
            }
        }
        defpackage.aofe aofeVar = this.a;
        defpackage.aofd aofdVar = aofeVar.f;
        int i4 = defpackage.aofd.z;
        synchronized (aofdVar.a) {
            if (!aofdVar.f) {
                if (aofdVar.u) {
                    aofdVar.c.fQ(apoyVar, (int) apoyVar.b);
                    aofdVar.d |= z;
                    aofdVar.e |= z2;
                } else {
                    ahvr.bZ(aofdVar.x != -1, "streamId should be set");
                    aofdVar.h.a(z, aofdVar.w, apoyVar, z2);
                }
            }
            aodq aodqVar = aofeVar.t;
            if (i != 0) {
                aodqVar.f += (long) i;
                aodqVar.a.a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0160 A[Catch: all -> 0x017a, TryCatch #0 {, blocks: (B:4:0x001d, B:6:0x004f, B:8:0x005a, B:9:0x008d, B:11:0x0090, B:13:0x009e, B:15:0x00a6, B:16:0x00b6, B:17:0x00b9, B:19:0x00c0, B:50:0x0176, B:20:0x00ce, B:22:0x00d4, B:24:0x00dc, B:26:0x00e4, B:41:0x0149, B:43:0x014f, B:45:0x0153, B:27:0x00eb, B:29:0x00fb, B:31:0x010e, B:33:0x0114, B:35:0x0118, B:36:0x012d, B:38:0x0133, B:40:0x0145, B:30:0x00fe, B:46:0x0160, B:48:0x016a, B:49:0x0173, B:7:0x0055), top: B:56:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:48:0x016a A[Catch: all -> 0x017a, TryCatch #0 {, blocks: (B:4:0x001d, B:6:0x004f, B:8:0x005a, B:9:0x008d, B:11:0x0090, B:13:0x009e, B:15:0x00a6, B:16:0x00b6, B:17:0x00b9, B:19:0x00c0, B:50:0x0176, B:20:0x00ce, B:22:0x00d4, B:24:0x00dc, B:26:0x00e4, B:41:0x0149, B:43:0x014f, B:45:0x0153, B:27:0x00eb, B:29:0x00fb, B:31:0x010e, B:33:0x0114, B:35:0x0118, B:36:0x012d, B:38:0x0133, B:40:0x0145, B:30:0x00fe, B:46:0x0160, B:48:0x016a, B:49:0x0173, B:7:0x0055), top: B:56:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0173 A[Catch: all -> 0x017a, TryCatch #0 {, blocks: (B:4:0x001d, B:6:0x004f, B:8:0x005a, B:9:0x008d, B:11:0x0090, B:13:0x009e, B:15:0x00a6, B:16:0x00b6, B:17:0x00b9, B:19:0x00c0, B:50:0x0176, B:20:0x00ce, B:22:0x00d4, B:24:0x00dc, B:26:0x00e4, B:41:0x0149, B:43:0x014f, B:45:0x0153, B:27:0x00eb, B:29:0x00fb, B:31:0x010e, B:33:0x0114, B:35:0x0118, B:36:0x012d, B:38:0x0133, B:40:0x0145, B:30:0x00fe, B:46:0x0160, B:48:0x016a, B:49:0x0173, B:7:0x0055), top: B:56:0x001d }] */
    @Override // defpackage.anuo
    public final void c(anph anphVar) {
        anqw anqwVar;
        int i = defpackage.aoik.a;
        defpackage.aofe aofeVar = this.a;
        java.lang.String str = "/" + aofeVar.b.b;
        defpackage.aofd aofdVar = aofeVar.f;
        int i2 = defpackage.aofd.z;
        synchronized (aofdVar.a) {
            defpackage.aofe aofeVar2 = aofdVar.y;
            java.lang.String str2 = aofeVar2.e;
            java.lang.String str3 = aofeVar2.c;
            defpackage.aofk aofkVar = aofdVar.i;
            javax.net.ssl.SSLSocketFactory sSLSocketFactory = aofkVar.w;
            defpackage.aogn aognVar = defpackage.aoev.a;
            ahvr.cj(anphVar, "headers");
            ahvr.cj(str2, "authority");
            anphVar.f(anxo.h);
            anphVar.f(anxo.i);
            anpc anpcVar = anxo.j;
            anphVar.f(anpcVar);
            java.nio.charset.Charset charset = annu.a;
            java.util.ArrayList arrayList = new java.util.ArrayList(anphVar.e + 7);
            if (sSLSocketFactory == null) {
                arrayList.add(defpackage.aoev.b);
            } else {
                arrayList.add(defpackage.aoev.a);
            }
            arrayList.add(defpackage.aoev.c);
            arrayList.add(new defpackage.aogn(defpackage.aogn.e, str2));
            arrayList.add(new defpackage.aogn(defpackage.aogn.c, str));
            arrayList.add(new defpackage.aogn(anpcVar.a, str3));
            arrayList.add(defpackage.aoev.e);
            arrayList.add(defpackage.aoev.f);
            byte[][] bArrA = defpackage.aodp.a(anphVar);
            for (int i3 = 0; i3 < bArrA.length; i3 += 2) {
                byte[] bArr = bArrA[i3];
                appb appbVar = appb.a;
                appb appbVarAR = aoov.aR(bArr);
                if (appbVarAR.c() != 0 && appbVarAR.a(0) != 58) {
                    arrayList.add(new defpackage.aogn(appbVarAR, aoov.aR(bArrA[i3 + 1])));
                }
            }
            aofdVar.b = arrayList;
            anqw anqwVar2 = aofkVar.s;
            if (anqwVar2 != null) {
                aofeVar2.f.m(anqwVar2, defpackage.anvq.d, true, new anph());
            } else if ((aofkVar.y instanceof javax.net.ssl.SSLSocket) && !str2.equals(aofkVar.f)) {
                java.util.Map map = aofkVar.J;
                if (map.containsKey(str2)) {
                    anqwVar = (anqw) map.get(str2);
                } else {
                    anqw anqwVarF = aofkVar.x.verify(str2, ((javax.net.ssl.SSLSocket) aofkVar.y).getSession()) ? anqw.b : anqw.l.f(java.lang.String.format("HostNameVerifier verification failed for authority '%s'", str2));
                    if (!anqwVarF.h() && !defpackage.aofk.b) {
                        defpackage.aofk.a.logp(java.util.logging.Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport", "verifyAuthority", java.lang.String.format("HostNameVerifier verification failed for authority '%s'. This will be an error in the future.", str2));
                    }
                    anqw anqwVarF2 = anqwVarF.h() ? anqw.l.f(java.lang.String.format("Could not verify authority '%s' for the rpc with no X509TrustManager available", str2)) : anqwVarF;
                    map.put(str2, anqwVarF2);
                    anqwVar = anqwVarF2;
                }
                if (!anqwVar.h() && defpackage.aofk.b) {
                    aofeVar2.f.m(anqwVar, defpackage.anvq.a, true, new anph());
                } else if (aofkVar.n.size() >= aofkVar.z) {
                    aofkVar.A.add(aofeVar2);
                    aofkVar.l(aofeVar2);
                } else {
                    aofkVar.n(aofeVar2);
                }
            } else if (aofkVar.n.size() >= aofkVar.z) {
                aofkVar.A.add(aofeVar2);
                aofkVar.l(aofeVar2);
            } else {
                aofkVar.n(aofeVar2);
            }
        }
    }
}
