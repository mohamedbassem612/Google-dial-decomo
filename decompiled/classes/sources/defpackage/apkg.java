package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apkg implements defpackage.apkz, defpackage.aplo {
    public final defpackage.apjp a;
    public final java.util.List b;
    public java.net.Socket c;
    private final defpackage.apkc d;
    private final defpackage.apkv e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final boolean j;
    private final defpackage.apks k;
    private final defpackage.apkw l;
    private final defpackage.apjh m;
    private final int n;
    private final boolean o;
    private final aplh p;
    private volatile boolean q;
    private java.net.Socket r;
    private defpackage.apit s;
    private defpackage.apjf t;
    private defpackage.apkt u;
    private defpackage.apkd v;

    public apkg(defpackage.apkc apkcVar, defpackage.apkv apkvVar, int i, int i2, int i3, int i4, boolean z, defpackage.apks apksVar, defpackage.apkw apkwVar, defpackage.apjp apjpVar, java.util.List list, defpackage.apjh apjhVar, int i5, boolean z2, aplh aplhVar) {
        if (apkcVar == null) {
            defpackage.aooh.i("taskRunner");
        }
        if (apjpVar == null) {
            defpackage.aooh.i("route");
        }
        this.d = apkcVar;
        this.e = apkvVar;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = z;
        this.k = apksVar;
        this.l = apkwVar;
        this.a = apjpVar;
        this.b = list;
        this.m = apjhVar;
        this.n = i5;
        this.o = z2;
        this.p = aplhVar;
    }

    static /* synthetic */ defpackage.apkg j(defpackage.apkg apkgVar, defpackage.apjp apjpVar, int i, boolean z, aplh aplhVar, int i2) {
        return new defpackage.apkg(apkgVar.d, apkgVar.e, apkgVar.f, apkgVar.g, apkgVar.h, apkgVar.i, apkgVar.j, apkgVar.k, apkgVar.l, (i2 & 1) != 0 ? apkgVar.a : apjpVar, apkgVar.b, (i2 & 4) != 0 ? apkgVar.m : null, (i2 & 8) != 0 ? apkgVar.n : i, (i2 & 16) != 0 ? apkgVar.o : z, (i2 & 32) != 0 ? apkgVar.p : aplhVar);
    }

    private final defpackage.apkg k(java.util.List list, javax.net.ssl.SSLSocket sSLSocket) {
        java.lang.String[] strArr;
        java.lang.String[] strArr2;
        int i = this.n;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            defpackage.apik apikVar = (defpackage.apik) list.get(i2);
            if (sSLSocket == null) {
                defpackage.aooh.i("socket");
            }
            if (apikVar.c && (((strArr = apikVar.f) == null || defpackage.apjv.k(strArr, sSLSocket.getEnabledProtocols(), defpackage.aolh.a)) && ((strArr2 = apikVar.e) == null || defpackage.apjv.k(strArr2, sSLSocket.getEnabledCipherSuites(), defpackage.apii.a)))) {
                return j(this, null, i2, i != -1, null, 39);
            }
        }
        return null;
    }

    private final void l() throws java.io.IOException {
        java.net.Socket socket;
        java.net.Socket socket2;
        int i;
        defpackage.apjp apjpVar = this.a;
        java.net.Proxy proxy = apjpVar.b;
        java.net.Proxy.Type type = proxy.type();
        if (type == null || !((i = defpackage.apkf.a[type.ordinal()]) == 1 || i == 2)) {
            socket = new java.net.Socket(proxy);
        } else {
            socket = apjpVar.a.b.createSocket();
            if (socket == null) {
                defpackage.aooh.g();
            }
        }
        this.r = socket;
        if (this.q) {
            throw new java.io.IOException("canceled");
        }
        socket.setSoTimeout(this.i);
        try {
            defpackage.apnn apnnVar = defpackage.apnn.b;
            java.net.InetSocketAddress inetSocketAddress = apjpVar.c;
            int i2 = this.h;
            if (socket == null) {
                defpackage.aooh.i("socket");
                socket2 = null;
            } else {
                socket2 = socket;
            }
            if (inetSocketAddress == null) {
                defpackage.aooh.i("address");
            }
            socket2.connect(inetSocketAddress, i2);
            if (socket == null) {
                try {
                    defpackage.aooh.i("<this>");
                    socket = null;
                } catch (java.lang.NullPointerException e) {
                    if (defpackage.aooh.n(e.getMessage(), "throw with null exception")) {
                        throw new java.io.IOException(e);
                    }
                    return;
                }
            }
            if (socket == null) {
                defpackage.aooh.i("<this>");
            }
            this.v = new defpackage.apkd(new defpackage.apqm(socket));
        } catch (java.net.ConnectException e2) {
            java.net.InetSocketAddress inetSocketAddress2 = this.a.c;
            java.util.Objects.toString(inetSocketAddress2);
            java.net.ConnectException connectException = new java.net.ConnectException("Failed to connect to ".concat(java.lang.String.valueOf(inetSocketAddress2)));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    @Override // defpackage.aplo
    public final defpackage.apjp a() {
        return this.a;
    }

    @Override // defpackage.apkz
    public final defpackage.apkt b() {
        defpackage.apks apksVar = this.k;
        defpackage.zzx zzxVar = apksVar.a.A;
        defpackage.apjp apjpVar = this.a;
        zzxVar.O(apjpVar);
        defpackage.apkt apktVar = this.u;
        if (apktVar == null) {
            defpackage.aooh.g();
        }
        defpackage.apkh apkhVar = apktVar.f;
        if (apktVar == null) {
            defpackage.aooh.i("connection");
        }
        if (apjpVar == null) {
            defpackage.aooh.i("route");
        }
        defpackage.apkx apkxVarB = this.l.b(this, this.b);
        if (apkxVarB != null) {
            return apkxVarB.a;
        }
        synchronized (apktVar) {
            defpackage.apkv apkvVar = this.e;
            if (apktVar == null) {
                defpackage.aooh.i("connection");
            }
            java.util.TimeZone timeZone = defpackage.apjx.a;
            ((j$.util.concurrent.ConcurrentLinkedQueue) apkvVar.d).add(apktVar);
            apkvVar.a();
            apksVar.g(apktVar);
        }
        defpackage.apis apisVar = this.k.c;
        if (apktVar == null) {
            defpackage.aooh.i("connection");
        }
        defpackage.apkh apkhVar2 = apktVar.f;
        if (apktVar != null) {
            return apktVar;
        }
        defpackage.aooh.i("connection");
        return apktVar;
    }

    @Override // defpackage.apkz
    public final defpackage.apky c() {
        java.net.Socket socket;
        java.net.Socket socket2;
        if (this.r != null) {
            throw new java.lang.IllegalStateException("TCP already connected");
        }
        defpackage.apks apksVar = this.k;
        apksVar.p.add(this);
        boolean z = false;
        try {
            try {
                defpackage.apis apisVar = apksVar.c;
                defpackage.apjp apjpVar = this.a;
                java.net.InetSocketAddress inetSocketAddress = apjpVar.c;
                java.net.Proxy proxy = apjpVar.b;
                if (inetSocketAddress == null) {
                    defpackage.aooh.i("inetSocketAddress");
                }
                if (proxy == null) {
                    defpackage.aooh.i("proxy");
                }
                if (apjpVar == null) {
                    defpackage.aooh.i("route");
                }
                l();
                z = true;
                defpackage.apky apkyVar = new defpackage.apky(this, null, null);
                this.k.p.remove(this);
                return apkyVar;
            } catch (java.io.IOException e) {
                defpackage.apjp apjpVar2 = this.a;
                defpackage.apib apibVar = apjpVar2.a;
                if (apibVar.g == null) {
                    java.net.Proxy proxy2 = apjpVar2.b;
                    if (proxy2.type() != java.net.Proxy.Type.DIRECT) {
                        apibVar.h.connectFailed(apibVar.i.f(), proxy2.address(), e);
                    }
                }
                this.k.c.c(apjpVar2.c, apjpVar2.b);
                if (apjpVar2 == null) {
                    defpackage.aooh.i("route");
                }
                defpackage.apky apkyVar2 = new defpackage.apky(this, null, e);
                this.k.p.remove(this);
                if (!z && (socket = this.r) != null) {
                    defpackage.apjx.h(socket);
                }
                return apkyVar2;
            }
        } catch (java.lang.Throwable th) {
            this.k.p.remove(this);
            if (!z && (socket2 = this.r) != null) {
                defpackage.apjx.h(socket2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01e6 A[Catch: all -> 0x06ae, IOException -> 0x06b1, TryCatch #5 {IOException -> 0x06b1, blocks: (B:44:0x00eb, B:48:0x00f5, B:50:0x0101, B:54:0x010b, B:56:0x0117, B:59:0x012b, B:65:0x013b, B:75:0x017e, B:78:0x018f, B:87:0x01a6, B:90:0x01b0, B:92:0x01b4, B:94:0x01c8, B:96:0x01ce, B:97:0x01d1, B:99:0x01db, B:100:0x01de, B:102:0x01e6, B:104:0x01f0, B:109:0x01fb, B:111:0x0206, B:114:0x020d, B:115:0x0210, B:117:0x022a, B:119:0x024d, B:120:0x0252, B:122:0x0258, B:209:0x0445, B:211:0x044b, B:212:0x044e, B:278:0x053f, B:280:0x054b, B:281:0x054e, B:283:0x0554, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:290:0x0579, B:293:0x0580, B:296:0x0586, B:298:0x059d, B:301:0x05a4, B:302:0x05a7, B:303:0x05c8, B:310:0x0602, B:311:0x0603, B:312:0x0605, B:326:0x0632, B:327:0x0633, B:223:0x0465, B:226:0x046c, B:227:0x046f, B:229:0x0473, B:231:0x047b, B:233:0x0481, B:235:0x048b, B:237:0x0493, B:239:0x0499, B:241:0x04a1, B:243:0x04a7, B:245:0x04af, B:247:0x04b7, B:250:0x04c0, B:252:0x04c8, B:253:0x04cb, B:255:0x04d7, B:256:0x04e4, B:257:0x04e5, B:258:0x0501, B:260:0x0505, B:262:0x0509, B:264:0x0511, B:266:0x0515, B:215:0x0453, B:217:0x0459, B:218:0x045c, B:219:0x045f, B:93:0x01c4, B:68:0x0142, B:272:0x0521, B:273:0x0528, B:274:0x0529, B:276:0x053b, B:277:0x053d), top: B:421:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x01f0 A[Catch: all -> 0x06ae, IOException -> 0x06b1, LOOP:0: B:101:0x01e4->B:104:0x01f0, LOOP_END, TryCatch #5 {IOException -> 0x06b1, blocks: (B:44:0x00eb, B:48:0x00f5, B:50:0x0101, B:54:0x010b, B:56:0x0117, B:59:0x012b, B:65:0x013b, B:75:0x017e, B:78:0x018f, B:87:0x01a6, B:90:0x01b0, B:92:0x01b4, B:94:0x01c8, B:96:0x01ce, B:97:0x01d1, B:99:0x01db, B:100:0x01de, B:102:0x01e6, B:104:0x01f0, B:109:0x01fb, B:111:0x0206, B:114:0x020d, B:115:0x0210, B:117:0x022a, B:119:0x024d, B:120:0x0252, B:122:0x0258, B:209:0x0445, B:211:0x044b, B:212:0x044e, B:278:0x053f, B:280:0x054b, B:281:0x054e, B:283:0x0554, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:290:0x0579, B:293:0x0580, B:296:0x0586, B:298:0x059d, B:301:0x05a4, B:302:0x05a7, B:303:0x05c8, B:310:0x0602, B:311:0x0603, B:312:0x0605, B:326:0x0632, B:327:0x0633, B:223:0x0465, B:226:0x046c, B:227:0x046f, B:229:0x0473, B:231:0x047b, B:233:0x0481, B:235:0x048b, B:237:0x0493, B:239:0x0499, B:241:0x04a1, B:243:0x04a7, B:245:0x04af, B:247:0x04b7, B:250:0x04c0, B:252:0x04c8, B:253:0x04cb, B:255:0x04d7, B:256:0x04e4, B:257:0x04e5, B:258:0x0501, B:260:0x0505, B:262:0x0509, B:264:0x0511, B:266:0x0515, B:215:0x0453, B:217:0x0459, B:218:0x045c, B:219:0x045f, B:93:0x01c4, B:68:0x0142, B:272:0x0521, B:273:0x0528, B:274:0x0529, B:276:0x053b, B:277:0x053d), top: B:421:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0228  */
    /* JADX WARN: Code duplicated, block: B:119:0x024d A[Catch: all -> 0x06ae, IOException -> 0x06b1, TryCatch #5 {IOException -> 0x06b1, blocks: (B:44:0x00eb, B:48:0x00f5, B:50:0x0101, B:54:0x010b, B:56:0x0117, B:59:0x012b, B:65:0x013b, B:75:0x017e, B:78:0x018f, B:87:0x01a6, B:90:0x01b0, B:92:0x01b4, B:94:0x01c8, B:96:0x01ce, B:97:0x01d1, B:99:0x01db, B:100:0x01de, B:102:0x01e6, B:104:0x01f0, B:109:0x01fb, B:111:0x0206, B:114:0x020d, B:115:0x0210, B:117:0x022a, B:119:0x024d, B:120:0x0252, B:122:0x0258, B:209:0x0445, B:211:0x044b, B:212:0x044e, B:278:0x053f, B:280:0x054b, B:281:0x054e, B:283:0x0554, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:290:0x0579, B:293:0x0580, B:296:0x0586, B:298:0x059d, B:301:0x05a4, B:302:0x05a7, B:303:0x05c8, B:310:0x0602, B:311:0x0603, B:312:0x0605, B:326:0x0632, B:327:0x0633, B:223:0x0465, B:226:0x046c, B:227:0x046f, B:229:0x0473, B:231:0x047b, B:233:0x0481, B:235:0x048b, B:237:0x0493, B:239:0x0499, B:241:0x04a1, B:243:0x04a7, B:245:0x04af, B:247:0x04b7, B:250:0x04c0, B:252:0x04c8, B:253:0x04cb, B:255:0x04d7, B:256:0x04e4, B:257:0x04e5, B:258:0x0501, B:260:0x0505, B:262:0x0509, B:264:0x0511, B:266:0x0515, B:215:0x0453, B:217:0x0459, B:218:0x045c, B:219:0x045f, B:93:0x01c4, B:68:0x0142, B:272:0x0521, B:273:0x0528, B:274:0x0529, B:276:0x053b, B:277:0x053d), top: B:421:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0258 A[Catch: all -> 0x06ae, IOException -> 0x06b1, TRY_LEAVE, TryCatch #5 {IOException -> 0x06b1, blocks: (B:44:0x00eb, B:48:0x00f5, B:50:0x0101, B:54:0x010b, B:56:0x0117, B:59:0x012b, B:65:0x013b, B:75:0x017e, B:78:0x018f, B:87:0x01a6, B:90:0x01b0, B:92:0x01b4, B:94:0x01c8, B:96:0x01ce, B:97:0x01d1, B:99:0x01db, B:100:0x01de, B:102:0x01e6, B:104:0x01f0, B:109:0x01fb, B:111:0x0206, B:114:0x020d, B:115:0x0210, B:117:0x022a, B:119:0x024d, B:120:0x0252, B:122:0x0258, B:209:0x0445, B:211:0x044b, B:212:0x044e, B:278:0x053f, B:280:0x054b, B:281:0x054e, B:283:0x0554, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:290:0x0579, B:293:0x0580, B:296:0x0586, B:298:0x059d, B:301:0x05a4, B:302:0x05a7, B:303:0x05c8, B:310:0x0602, B:311:0x0603, B:312:0x0605, B:326:0x0632, B:327:0x0633, B:223:0x0465, B:226:0x046c, B:227:0x046f, B:229:0x0473, B:231:0x047b, B:233:0x0481, B:235:0x048b, B:237:0x0493, B:239:0x0499, B:241:0x04a1, B:243:0x04a7, B:245:0x04af, B:247:0x04b7, B:250:0x04c0, B:252:0x04c8, B:253:0x04cb, B:255:0x04d7, B:256:0x04e4, B:257:0x04e5, B:258:0x0501, B:260:0x0505, B:262:0x0509, B:264:0x0511, B:266:0x0515, B:215:0x0453, B:217:0x0459, B:218:0x045c, B:219:0x045f, B:93:0x01c4, B:68:0x0142, B:272:0x0521, B:273:0x0528, B:274:0x0529, B:276:0x053b, B:277:0x053d), top: B:421:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0261 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0269 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0270 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0283 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0296 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02a2 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:145:0x02ad A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:148:0x02b6 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:150:0x02c0 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:152:0x02c9 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:155:0x02db A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0325 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:160:0x036c A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0374 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0382 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:166:0x0386 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:169:0x03a1 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:171:0x03a5 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:175:0x03b8 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:181:0x03cb A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:182:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:185:0x03d7 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:188:0x03de A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:191:0x03ef A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:193:0x03f9 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:195:0x0403 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:197:0x040d A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:199:0x0417 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:201:0x0421 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:203:0x042b A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:205:0x0435 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:207:0x0441 A[Catch: all -> 0x0452, TryCatch #13 {all -> 0x0452, blocks: (B:123:0x025d, B:125:0x0261, B:127:0x0269, B:129:0x0270, B:130:0x0275, B:131:0x027d, B:133:0x0283, B:137:0x0292, B:139:0x0296, B:140:0x0299, B:142:0x02a2, B:143:0x02a5, B:145:0x02ad, B:146:0x02b0, B:148:0x02b6, B:150:0x02c0, B:152:0x02c9, B:153:0x02cc, B:155:0x02db, B:157:0x0325, B:158:0x0328, B:159:0x036b, B:160:0x036c, B:161:0x0373, B:162:0x0374, B:163:0x0381, B:164:0x0382, B:166:0x0386, B:167:0x0389, B:169:0x03a1, B:171:0x03a5, B:172:0x03aa, B:173:0x03b2, B:175:0x03b8, B:179:0x03c7, B:181:0x03cb, B:183:0x03d1, B:185:0x03d7, B:188:0x03de, B:189:0x03e1, B:191:0x03ef, B:193:0x03f9, B:195:0x0403, B:197:0x040d, B:199:0x0417, B:201:0x0421, B:203:0x042b, B:205:0x0435, B:206:0x0440, B:208:0x0443, B:207:0x0441), top: B:423:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:211:0x044b A[Catch: SSLException -> 0x0460, all -> 0x06ae, IOException -> 0x06b1, TRY_LEAVE, TryCatch #5 {IOException -> 0x06b1, blocks: (B:44:0x00eb, B:48:0x00f5, B:50:0x0101, B:54:0x010b, B:56:0x0117, B:59:0x012b, B:65:0x013b, B:75:0x017e, B:78:0x018f, B:87:0x01a6, B:90:0x01b0, B:92:0x01b4, B:94:0x01c8, B:96:0x01ce, B:97:0x01d1, B:99:0x01db, B:100:0x01de, B:102:0x01e6, B:104:0x01f0, B:109:0x01fb, B:111:0x0206, B:114:0x020d, B:115:0x0210, B:117:0x022a, B:119:0x024d, B:120:0x0252, B:122:0x0258, B:209:0x0445, B:211:0x044b, B:212:0x044e, B:278:0x053f, B:280:0x054b, B:281:0x054e, B:283:0x0554, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:290:0x0579, B:293:0x0580, B:296:0x0586, B:298:0x059d, B:301:0x05a4, B:302:0x05a7, B:303:0x05c8, B:310:0x0602, B:311:0x0603, B:312:0x0605, B:326:0x0632, B:327:0x0633, B:223:0x0465, B:226:0x046c, B:227:0x046f, B:229:0x0473, B:231:0x047b, B:233:0x0481, B:235:0x048b, B:237:0x0493, B:239:0x0499, B:241:0x04a1, B:243:0x04a7, B:245:0x04af, B:247:0x04b7, B:250:0x04c0, B:252:0x04c8, B:253:0x04cb, B:255:0x04d7, B:256:0x04e4, B:257:0x04e5, B:258:0x0501, B:260:0x0505, B:262:0x0509, B:264:0x0511, B:266:0x0515, B:215:0x0453, B:217:0x0459, B:218:0x045c, B:219:0x045f, B:93:0x01c4, B:68:0x0142, B:272:0x0521, B:273:0x0528, B:274:0x0529, B:276:0x053b, B:277:0x053d), top: B:421:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:248:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:268:0x051b  */
    /* JADX WARN: Code duplicated, block: B:274:0x0529 A[Catch: all -> 0x06ae, IOException -> 0x06b1, TryCatch #5 {IOException -> 0x06b1, blocks: (B:44:0x00eb, B:48:0x00f5, B:50:0x0101, B:54:0x010b, B:56:0x0117, B:59:0x012b, B:65:0x013b, B:75:0x017e, B:78:0x018f, B:87:0x01a6, B:90:0x01b0, B:92:0x01b4, B:94:0x01c8, B:96:0x01ce, B:97:0x01d1, B:99:0x01db, B:100:0x01de, B:102:0x01e6, B:104:0x01f0, B:109:0x01fb, B:111:0x0206, B:114:0x020d, B:115:0x0210, B:117:0x022a, B:119:0x024d, B:120:0x0252, B:122:0x0258, B:209:0x0445, B:211:0x044b, B:212:0x044e, B:278:0x053f, B:280:0x054b, B:281:0x054e, B:283:0x0554, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:290:0x0579, B:293:0x0580, B:296:0x0586, B:298:0x059d, B:301:0x05a4, B:302:0x05a7, B:303:0x05c8, B:310:0x0602, B:311:0x0603, B:312:0x0605, B:326:0x0632, B:327:0x0633, B:223:0x0465, B:226:0x046c, B:227:0x046f, B:229:0x0473, B:231:0x047b, B:233:0x0481, B:235:0x048b, B:237:0x0493, B:239:0x0499, B:241:0x04a1, B:243:0x04a7, B:245:0x04af, B:247:0x04b7, B:250:0x04c0, B:252:0x04c8, B:253:0x04cb, B:255:0x04d7, B:256:0x04e4, B:257:0x04e5, B:258:0x0501, B:260:0x0505, B:262:0x0509, B:264:0x0511, B:266:0x0515, B:215:0x0453, B:217:0x0459, B:218:0x045c, B:219:0x045f, B:93:0x01c4, B:68:0x0142, B:272:0x0521, B:273:0x0528, B:274:0x0529, B:276:0x053b, B:277:0x053d), top: B:421:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:276:0x053b A[Catch: all -> 0x06ae, IOException -> 0x06b1, TryCatch #5 {IOException -> 0x06b1, blocks: (B:44:0x00eb, B:48:0x00f5, B:50:0x0101, B:54:0x010b, B:56:0x0117, B:59:0x012b, B:65:0x013b, B:75:0x017e, B:78:0x018f, B:87:0x01a6, B:90:0x01b0, B:92:0x01b4, B:94:0x01c8, B:96:0x01ce, B:97:0x01d1, B:99:0x01db, B:100:0x01de, B:102:0x01e6, B:104:0x01f0, B:109:0x01fb, B:111:0x0206, B:114:0x020d, B:115:0x0210, B:117:0x022a, B:119:0x024d, B:120:0x0252, B:122:0x0258, B:209:0x0445, B:211:0x044b, B:212:0x044e, B:278:0x053f, B:280:0x054b, B:281:0x054e, B:283:0x0554, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:290:0x0579, B:293:0x0580, B:296:0x0586, B:298:0x059d, B:301:0x05a4, B:302:0x05a7, B:303:0x05c8, B:310:0x0602, B:311:0x0603, B:312:0x0605, B:326:0x0632, B:327:0x0633, B:223:0x0465, B:226:0x046c, B:227:0x046f, B:229:0x0473, B:231:0x047b, B:233:0x0481, B:235:0x048b, B:237:0x0493, B:239:0x0499, B:241:0x04a1, B:243:0x04a7, B:245:0x04af, B:247:0x04b7, B:250:0x04c0, B:252:0x04c8, B:253:0x04cb, B:255:0x04d7, B:256:0x04e4, B:257:0x04e5, B:258:0x0501, B:260:0x0505, B:262:0x0509, B:264:0x0511, B:266:0x0515, B:215:0x0453, B:217:0x0459, B:218:0x045c, B:219:0x045f, B:93:0x01c4, B:68:0x0142, B:272:0x0521, B:273:0x0528, B:274:0x0529, B:276:0x053b, B:277:0x053d), top: B:421:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:280:0x054b A[Catch: all -> 0x06ae, IOException -> 0x06b1, TryCatch #5 {IOException -> 0x06b1, blocks: (B:44:0x00eb, B:48:0x00f5, B:50:0x0101, B:54:0x010b, B:56:0x0117, B:59:0x012b, B:65:0x013b, B:75:0x017e, B:78:0x018f, B:87:0x01a6, B:90:0x01b0, B:92:0x01b4, B:94:0x01c8, B:96:0x01ce, B:97:0x01d1, B:99:0x01db, B:100:0x01de, B:102:0x01e6, B:104:0x01f0, B:109:0x01fb, B:111:0x0206, B:114:0x020d, B:115:0x0210, B:117:0x022a, B:119:0x024d, B:120:0x0252, B:122:0x0258, B:209:0x0445, B:211:0x044b, B:212:0x044e, B:278:0x053f, B:280:0x054b, B:281:0x054e, B:283:0x0554, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:290:0x0579, B:293:0x0580, B:296:0x0586, B:298:0x059d, B:301:0x05a4, B:302:0x05a7, B:303:0x05c8, B:310:0x0602, B:311:0x0603, B:312:0x0605, B:326:0x0632, B:327:0x0633, B:223:0x0465, B:226:0x046c, B:227:0x046f, B:229:0x0473, B:231:0x047b, B:233:0x0481, B:235:0x048b, B:237:0x0493, B:239:0x0499, B:241:0x04a1, B:243:0x04a7, B:245:0x04af, B:247:0x04b7, B:250:0x04c0, B:252:0x04c8, B:253:0x04cb, B:255:0x04d7, B:256:0x04e4, B:257:0x04e5, B:258:0x0501, B:260:0x0505, B:262:0x0509, B:264:0x0511, B:266:0x0515, B:215:0x0453, B:217:0x0459, B:218:0x045c, B:219:0x045f, B:93:0x01c4, B:68:0x0142, B:272:0x0521, B:273:0x0528, B:274:0x0529, B:276:0x053b, B:277:0x053d), top: B:421:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:283:0x0554 A[Catch: all -> 0x06ae, IOException -> 0x06b1, TryCatch #5 {IOException -> 0x06b1, blocks: (B:44:0x00eb, B:48:0x00f5, B:50:0x0101, B:54:0x010b, B:56:0x0117, B:59:0x012b, B:65:0x013b, B:75:0x017e, B:78:0x018f, B:87:0x01a6, B:90:0x01b0, B:92:0x01b4, B:94:0x01c8, B:96:0x01ce, B:97:0x01d1, B:99:0x01db, B:100:0x01de, B:102:0x01e6, B:104:0x01f0, B:109:0x01fb, B:111:0x0206, B:114:0x020d, B:115:0x0210, B:117:0x022a, B:119:0x024d, B:120:0x0252, B:122:0x0258, B:209:0x0445, B:211:0x044b, B:212:0x044e, B:278:0x053f, B:280:0x054b, B:281:0x054e, B:283:0x0554, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:290:0x0579, B:293:0x0580, B:296:0x0586, B:298:0x059d, B:301:0x05a4, B:302:0x05a7, B:303:0x05c8, B:310:0x0602, B:311:0x0603, B:312:0x0605, B:326:0x0632, B:327:0x0633, B:223:0x0465, B:226:0x046c, B:227:0x046f, B:229:0x0473, B:231:0x047b, B:233:0x0481, B:235:0x048b, B:237:0x0493, B:239:0x0499, B:241:0x04a1, B:243:0x04a7, B:245:0x04af, B:247:0x04b7, B:250:0x04c0, B:252:0x04c8, B:253:0x04cb, B:255:0x04d7, B:256:0x04e4, B:257:0x04e5, B:258:0x0501, B:260:0x0505, B:262:0x0509, B:264:0x0511, B:266:0x0515, B:215:0x0453, B:217:0x0459, B:218:0x045c, B:219:0x045f, B:93:0x01c4, B:68:0x0142, B:272:0x0521, B:273:0x0528, B:274:0x0529, B:276:0x053b, B:277:0x053d), top: B:421:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:286:0x055b A[Catch: all -> 0x06ae, IOException -> 0x06b1, TryCatch #5 {IOException -> 0x06b1, blocks: (B:44:0x00eb, B:48:0x00f5, B:50:0x0101, B:54:0x010b, B:56:0x0117, B:59:0x012b, B:65:0x013b, B:75:0x017e, B:78:0x018f, B:87:0x01a6, B:90:0x01b0, B:92:0x01b4, B:94:0x01c8, B:96:0x01ce, B:97:0x01d1, B:99:0x01db, B:100:0x01de, B:102:0x01e6, B:104:0x01f0, B:109:0x01fb, B:111:0x0206, B:114:0x020d, B:115:0x0210, B:117:0x022a, B:119:0x024d, B:120:0x0252, B:122:0x0258, B:209:0x0445, B:211:0x044b, B:212:0x044e, B:278:0x053f, B:280:0x054b, B:281:0x054e, B:283:0x0554, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:290:0x0579, B:293:0x0580, B:296:0x0586, B:298:0x059d, B:301:0x05a4, B:302:0x05a7, B:303:0x05c8, B:310:0x0602, B:311:0x0603, B:312:0x0605, B:326:0x0632, B:327:0x0633, B:223:0x0465, B:226:0x046c, B:227:0x046f, B:229:0x0473, B:231:0x047b, B:233:0x0481, B:235:0x048b, B:237:0x0493, B:239:0x0499, B:241:0x04a1, B:243:0x04a7, B:245:0x04af, B:247:0x04b7, B:250:0x04c0, B:252:0x04c8, B:253:0x04cb, B:255:0x04d7, B:256:0x04e4, B:257:0x04e5, B:258:0x0501, B:260:0x0505, B:262:0x0509, B:264:0x0511, B:266:0x0515, B:215:0x0453, B:217:0x0459, B:218:0x045c, B:219:0x045f, B:93:0x01c4, B:68:0x0142, B:272:0x0521, B:273:0x0528, B:274:0x0529, B:276:0x053b, B:277:0x053d), top: B:421:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:287:0x0562  */
    /* JADX WARN: Code duplicated, block: B:293:0x0580 A[Catch: all -> 0x06ae, IOException -> 0x06b1, TRY_LEAVE, TryCatch #5 {IOException -> 0x06b1, blocks: (B:44:0x00eb, B:48:0x00f5, B:50:0x0101, B:54:0x010b, B:56:0x0117, B:59:0x012b, B:65:0x013b, B:75:0x017e, B:78:0x018f, B:87:0x01a6, B:90:0x01b0, B:92:0x01b4, B:94:0x01c8, B:96:0x01ce, B:97:0x01d1, B:99:0x01db, B:100:0x01de, B:102:0x01e6, B:104:0x01f0, B:109:0x01fb, B:111:0x0206, B:114:0x020d, B:115:0x0210, B:117:0x022a, B:119:0x024d, B:120:0x0252, B:122:0x0258, B:209:0x0445, B:211:0x044b, B:212:0x044e, B:278:0x053f, B:280:0x054b, B:281:0x054e, B:283:0x0554, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:290:0x0579, B:293:0x0580, B:296:0x0586, B:298:0x059d, B:301:0x05a4, B:302:0x05a7, B:303:0x05c8, B:310:0x0602, B:311:0x0603, B:312:0x0605, B:326:0x0632, B:327:0x0633, B:223:0x0465, B:226:0x046c, B:227:0x046f, B:229:0x0473, B:231:0x047b, B:233:0x0481, B:235:0x048b, B:237:0x0493, B:239:0x0499, B:241:0x04a1, B:243:0x04a7, B:245:0x04af, B:247:0x04b7, B:250:0x04c0, B:252:0x04c8, B:253:0x04cb, B:255:0x04d7, B:256:0x04e4, B:257:0x04e5, B:258:0x0501, B:260:0x0505, B:262:0x0509, B:264:0x0511, B:266:0x0515, B:215:0x0453, B:217:0x0459, B:218:0x045c, B:219:0x045f, B:93:0x01c4, B:68:0x0142, B:272:0x0521, B:273:0x0528, B:274:0x0529, B:276:0x053b, B:277:0x053d), top: B:421:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:298:0x059d A[Catch: all -> 0x06ae, IOException -> 0x06b1, TryCatch #5 {IOException -> 0x06b1, blocks: (B:44:0x00eb, B:48:0x00f5, B:50:0x0101, B:54:0x010b, B:56:0x0117, B:59:0x012b, B:65:0x013b, B:75:0x017e, B:78:0x018f, B:87:0x01a6, B:90:0x01b0, B:92:0x01b4, B:94:0x01c8, B:96:0x01ce, B:97:0x01d1, B:99:0x01db, B:100:0x01de, B:102:0x01e6, B:104:0x01f0, B:109:0x01fb, B:111:0x0206, B:114:0x020d, B:115:0x0210, B:117:0x022a, B:119:0x024d, B:120:0x0252, B:122:0x0258, B:209:0x0445, B:211:0x044b, B:212:0x044e, B:278:0x053f, B:280:0x054b, B:281:0x054e, B:283:0x0554, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:290:0x0579, B:293:0x0580, B:296:0x0586, B:298:0x059d, B:301:0x05a4, B:302:0x05a7, B:303:0x05c8, B:310:0x0602, B:311:0x0603, B:312:0x0605, B:326:0x0632, B:327:0x0633, B:223:0x0465, B:226:0x046c, B:227:0x046f, B:229:0x0473, B:231:0x047b, B:233:0x0481, B:235:0x048b, B:237:0x0493, B:239:0x0499, B:241:0x04a1, B:243:0x04a7, B:245:0x04af, B:247:0x04b7, B:250:0x04c0, B:252:0x04c8, B:253:0x04cb, B:255:0x04d7, B:256:0x04e4, B:257:0x04e5, B:258:0x0501, B:260:0x0505, B:262:0x0509, B:264:0x0511, B:266:0x0515, B:215:0x0453, B:217:0x0459, B:218:0x045c, B:219:0x045f, B:93:0x01c4, B:68:0x0142, B:272:0x0521, B:273:0x0528, B:274:0x0529, B:276:0x053b, B:277:0x053d), top: B:421:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:301:0x05a4 A[Catch: all -> 0x06ae, IOException -> 0x06b1, TryCatch #5 {IOException -> 0x06b1, blocks: (B:44:0x00eb, B:48:0x00f5, B:50:0x0101, B:54:0x010b, B:56:0x0117, B:59:0x012b, B:65:0x013b, B:75:0x017e, B:78:0x018f, B:87:0x01a6, B:90:0x01b0, B:92:0x01b4, B:94:0x01c8, B:96:0x01ce, B:97:0x01d1, B:99:0x01db, B:100:0x01de, B:102:0x01e6, B:104:0x01f0, B:109:0x01fb, B:111:0x0206, B:114:0x020d, B:115:0x0210, B:117:0x022a, B:119:0x024d, B:120:0x0252, B:122:0x0258, B:209:0x0445, B:211:0x044b, B:212:0x044e, B:278:0x053f, B:280:0x054b, B:281:0x054e, B:283:0x0554, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:290:0x0579, B:293:0x0580, B:296:0x0586, B:298:0x059d, B:301:0x05a4, B:302:0x05a7, B:303:0x05c8, B:310:0x0602, B:311:0x0603, B:312:0x0605, B:326:0x0632, B:327:0x0633, B:223:0x0465, B:226:0x046c, B:227:0x046f, B:229:0x0473, B:231:0x047b, B:233:0x0481, B:235:0x048b, B:237:0x0493, B:239:0x0499, B:241:0x04a1, B:243:0x04a7, B:245:0x04af, B:247:0x04b7, B:250:0x04c0, B:252:0x04c8, B:253:0x04cb, B:255:0x04d7, B:256:0x04e4, B:257:0x04e5, B:258:0x0501, B:260:0x0505, B:262:0x0509, B:264:0x0511, B:266:0x0515, B:215:0x0453, B:217:0x0459, B:218:0x045c, B:219:0x045f, B:93:0x01c4, B:68:0x0142, B:272:0x0521, B:273:0x0528, B:274:0x0529, B:276:0x053b, B:277:0x053d), top: B:421:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:306:0x05cd A[Catch: all -> 0x06a3, TryCatch #2 {all -> 0x06a3, blocks: (B:304:0x05c9, B:306:0x05cd, B:308:0x05d7, B:309:0x05f8), top: B:416:0x05c9 }] */
    /* JADX WARN: Code duplicated, block: B:308:0x05d7 A[Catch: all -> 0x06a3, TryCatch #2 {all -> 0x06a3, blocks: (B:304:0x05c9, B:306:0x05cd, B:308:0x05d7, B:309:0x05f8), top: B:416:0x05c9 }] */
    /* JADX WARN: Code duplicated, block: B:315:0x060a A[Catch: all -> 0x0692, TRY_LEAVE, TryCatch #12 {all -> 0x0692, blocks: (B:313:0x0606, B:315:0x060a, B:321:0x061c, B:323:0x0622, B:324:0x062c, B:325:0x062f), top: B:429:0x0606 }] */
    /* JADX WARN: Code duplicated, block: B:321:0x061c A[Catch: all -> 0x0692, TRY_ENTER, TryCatch #12 {all -> 0x0692, blocks: (B:313:0x0606, B:315:0x060a, B:321:0x061c, B:323:0x0622, B:324:0x062c, B:325:0x062f), top: B:429:0x0606 }] */
    /* JADX WARN: Code duplicated, block: B:323:0x0622 A[Catch: all -> 0x0692, TryCatch #12 {all -> 0x0692, blocks: (B:313:0x0606, B:315:0x060a, B:321:0x061c, B:323:0x0622, B:324:0x062c, B:325:0x062f), top: B:429:0x0606 }] */
    /* JADX WARN: Code duplicated, block: B:330:0x063c  */
    /* JADX WARN: Code duplicated, block: B:332:0x0646  */
    /* JADX WARN: Code duplicated, block: B:336:0x065e A[Catch: all -> 0x06aa, IOException -> 0x06ac, TryCatch #6 {all -> 0x06aa, blocks: (B:334:0x0654, B:336:0x065e, B:338:0x0665, B:295:0x0583, B:331:0x0642, B:333:0x0647, B:359:0x0695, B:360:0x0696, B:368:0x06a6, B:369:0x06a7), top: B:422:0x0583 }] */
    /* JADX WARN: Code duplicated, block: B:338:0x0665 A[Catch: all -> 0x06aa, IOException -> 0x06ac, TRY_LEAVE, TryCatch #6 {all -> 0x06aa, blocks: (B:334:0x0654, B:336:0x065e, B:338:0x0665, B:295:0x0583, B:331:0x0642, B:333:0x0647, B:359:0x0695, B:360:0x0696, B:368:0x06a6, B:369:0x06a7), top: B:422:0x0583 }] */
    /* JADX WARN: Code duplicated, block: B:352:0x0686  */
    /* JADX WARN: Code duplicated, block: B:361:0x0697  */
    /* JADX WARN: Code duplicated, block: B:391:0x06d3 A[Catch: all -> 0x06ef, TryCatch #9 {all -> 0x06ef, blocks: (B:389:0x06c2, B:391:0x06d3, B:392:0x06d6), top: B:424:0x06c2 }] */
    /* JADX WARN: Code duplicated, block: B:395:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:397:0x06e8 A[PHI: r0 r2
      0x06e8: PHI (r0v7 java.net.Socket) = (r0v12 java.net.Socket), (r0v17 java.net.Socket) binds: [B:396:0x06e6, B:40:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x06e8: PHI (r2v5 apky) = (r2v9 apky), (r2v10 apky) binds: [B:396:0x06e6, B:40:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:403:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:405:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:416:0x05c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x0606 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7 A[Catch: IOException -> 0x06b5, all -> 0x06b9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x06b5, blocks: (B:10:0x0024, B:14:0x003e, B:18:0x004b, B:20:0x005d, B:21:0x0063, B:23:0x007f, B:24:0x0082, B:26:0x0093, B:27:0x00a6, B:31:0x00b0, B:32:0x00c3, B:33:0x00c4, B:34:0x00cb, B:35:0x00cc, B:37:0x00d6, B:42:0x00e7, B:46:0x00ef, B:52:0x0105, B:58:0x0128, B:61:0x0131, B:64:0x0138, B:77:0x018c, B:80:0x0195, B:83:0x019c, B:86:0x01a3, B:89:0x01aa, B:70:0x0148, B:72:0x0152, B:73:0x0155, B:74:0x017d), top: B:418:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:438:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x01f6 A[EDGE_INSN: B:439:0x01f6->B:106:0x01f6 BREAK  A[LOOP:0: B:101:0x01e4->B:104:0x01f0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x062c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb A[Catch: all -> 0x06ae, IOException -> 0x06b1, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IOException -> 0x06b1, blocks: (B:44:0x00eb, B:48:0x00f5, B:50:0x0101, B:54:0x010b, B:56:0x0117, B:59:0x012b, B:65:0x013b, B:75:0x017e, B:78:0x018f, B:87:0x01a6, B:90:0x01b0, B:92:0x01b4, B:94:0x01c8, B:96:0x01ce, B:97:0x01d1, B:99:0x01db, B:100:0x01de, B:102:0x01e6, B:104:0x01f0, B:109:0x01fb, B:111:0x0206, B:114:0x020d, B:115:0x0210, B:117:0x022a, B:119:0x024d, B:120:0x0252, B:122:0x0258, B:209:0x0445, B:211:0x044b, B:212:0x044e, B:278:0x053f, B:280:0x054b, B:281:0x054e, B:283:0x0554, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:290:0x0579, B:293:0x0580, B:296:0x0586, B:298:0x059d, B:301:0x05a4, B:302:0x05a7, B:303:0x05c8, B:310:0x0602, B:311:0x0603, B:312:0x0605, B:326:0x0632, B:327:0x0633, B:223:0x0465, B:226:0x046c, B:227:0x046f, B:229:0x0473, B:231:0x047b, B:233:0x0481, B:235:0x048b, B:237:0x0493, B:239:0x0499, B:241:0x04a1, B:243:0x04a7, B:245:0x04af, B:247:0x04b7, B:250:0x04c0, B:252:0x04c8, B:253:0x04cb, B:255:0x04d7, B:256:0x04e4, B:257:0x04e5, B:258:0x0501, B:260:0x0505, B:262:0x0509, B:264:0x0511, B:266:0x0515, B:215:0x0453, B:217:0x0459, B:218:0x045c, B:219:0x045f, B:93:0x01c4, B:68:0x0142, B:272:0x0521, B:273:0x0528, B:274:0x0529, B:276:0x053b, B:277:0x053d), top: B:421:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ef A[Catch: IOException -> 0x06b5, all -> 0x06b9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x06b5, blocks: (B:10:0x0024, B:14:0x003e, B:18:0x004b, B:20:0x005d, B:21:0x0063, B:23:0x007f, B:24:0x0082, B:26:0x0093, B:27:0x00a6, B:31:0x00b0, B:32:0x00c3, B:33:0x00c4, B:34:0x00cb, B:35:0x00cc, B:37:0x00d6, B:42:0x00e7, B:46:0x00ef, B:52:0x0105, B:58:0x0128, B:61:0x0131, B:64:0x0138, B:77:0x018c, B:80:0x0195, B:83:0x019c, B:86:0x01a3, B:89:0x01aa, B:70:0x0148, B:72:0x0152, B:73:0x0155, B:74:0x017d), top: B:418:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0101 A[Catch: all -> 0x06ae, IOException -> 0x06b1, TRY_LEAVE, TryCatch #5 {IOException -> 0x06b1, blocks: (B:44:0x00eb, B:48:0x00f5, B:50:0x0101, B:54:0x010b, B:56:0x0117, B:59:0x012b, B:65:0x013b, B:75:0x017e, B:78:0x018f, B:87:0x01a6, B:90:0x01b0, B:92:0x01b4, B:94:0x01c8, B:96:0x01ce, B:97:0x01d1, B:99:0x01db, B:100:0x01de, B:102:0x01e6, B:104:0x01f0, B:109:0x01fb, B:111:0x0206, B:114:0x020d, B:115:0x0210, B:117:0x022a, B:119:0x024d, B:120:0x0252, B:122:0x0258, B:209:0x0445, B:211:0x044b, B:212:0x044e, B:278:0x053f, B:280:0x054b, B:281:0x054e, B:283:0x0554, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:290:0x0579, B:293:0x0580, B:296:0x0586, B:298:0x059d, B:301:0x05a4, B:302:0x05a7, B:303:0x05c8, B:310:0x0602, B:311:0x0603, B:312:0x0605, B:326:0x0632, B:327:0x0633, B:223:0x0465, B:226:0x046c, B:227:0x046f, B:229:0x0473, B:231:0x047b, B:233:0x0481, B:235:0x048b, B:237:0x0493, B:239:0x0499, B:241:0x04a1, B:243:0x04a7, B:245:0x04af, B:247:0x04b7, B:250:0x04c0, B:252:0x04c8, B:253:0x04cb, B:255:0x04d7, B:256:0x04e4, B:257:0x04e5, B:258:0x0501, B:260:0x0505, B:262:0x0509, B:264:0x0511, B:266:0x0515, B:215:0x0453, B:217:0x0459, B:218:0x045c, B:219:0x045f, B:93:0x01c4, B:68:0x0142, B:272:0x0521, B:273:0x0528, B:274:0x0529, B:276:0x053b, B:277:0x053d), top: B:421:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0105 A[Catch: IOException -> 0x06b5, all -> 0x06b9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x06b5, blocks: (B:10:0x0024, B:14:0x003e, B:18:0x004b, B:20:0x005d, B:21:0x0063, B:23:0x007f, B:24:0x0082, B:26:0x0093, B:27:0x00a6, B:31:0x00b0, B:32:0x00c3, B:33:0x00c4, B:34:0x00cb, B:35:0x00cc, B:37:0x00d6, B:42:0x00e7, B:46:0x00ef, B:52:0x0105, B:58:0x0128, B:61:0x0131, B:64:0x0138, B:77:0x018c, B:80:0x0195, B:83:0x019c, B:86:0x01a3, B:89:0x01aa, B:70:0x0148, B:72:0x0152, B:73:0x0155, B:74:0x017d), top: B:418:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0117 A[Catch: all -> 0x06ae, IOException -> 0x06b1, TRY_LEAVE, TryCatch #5 {IOException -> 0x06b1, blocks: (B:44:0x00eb, B:48:0x00f5, B:50:0x0101, B:54:0x010b, B:56:0x0117, B:59:0x012b, B:65:0x013b, B:75:0x017e, B:78:0x018f, B:87:0x01a6, B:90:0x01b0, B:92:0x01b4, B:94:0x01c8, B:96:0x01ce, B:97:0x01d1, B:99:0x01db, B:100:0x01de, B:102:0x01e6, B:104:0x01f0, B:109:0x01fb, B:111:0x0206, B:114:0x020d, B:115:0x0210, B:117:0x022a, B:119:0x024d, B:120:0x0252, B:122:0x0258, B:209:0x0445, B:211:0x044b, B:212:0x044e, B:278:0x053f, B:280:0x054b, B:281:0x054e, B:283:0x0554, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:290:0x0579, B:293:0x0580, B:296:0x0586, B:298:0x059d, B:301:0x05a4, B:302:0x05a7, B:303:0x05c8, B:310:0x0602, B:311:0x0603, B:312:0x0605, B:326:0x0632, B:327:0x0633, B:223:0x0465, B:226:0x046c, B:227:0x046f, B:229:0x0473, B:231:0x047b, B:233:0x0481, B:235:0x048b, B:237:0x0493, B:239:0x0499, B:241:0x04a1, B:243:0x04a7, B:245:0x04af, B:247:0x04b7, B:250:0x04c0, B:252:0x04c8, B:253:0x04cb, B:255:0x04d7, B:256:0x04e4, B:257:0x04e5, B:258:0x0501, B:260:0x0505, B:262:0x0509, B:264:0x0511, B:266:0x0515, B:215:0x0453, B:217:0x0459, B:218:0x045c, B:219:0x045f, B:93:0x01c4, B:68:0x0142, B:272:0x0521, B:273:0x0528, B:274:0x0529, B:276:0x053b, B:277:0x053d), top: B:421:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0128 A[Catch: IOException -> 0x06b5, all -> 0x06b9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x06b5, blocks: (B:10:0x0024, B:14:0x003e, B:18:0x004b, B:20:0x005d, B:21:0x0063, B:23:0x007f, B:24:0x0082, B:26:0x0093, B:27:0x00a6, B:31:0x00b0, B:32:0x00c3, B:33:0x00c4, B:34:0x00cb, B:35:0x00cc, B:37:0x00d6, B:42:0x00e7, B:46:0x00ef, B:52:0x0105, B:58:0x0128, B:61:0x0131, B:64:0x0138, B:77:0x018c, B:80:0x0195, B:83:0x019c, B:86:0x01a3, B:89:0x01aa, B:70:0x0148, B:72:0x0152, B:73:0x0155, B:74:0x017d), top: B:418:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0131 A[Catch: IOException -> 0x06b5, all -> 0x06b9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x06b5, blocks: (B:10:0x0024, B:14:0x003e, B:18:0x004b, B:20:0x005d, B:21:0x0063, B:23:0x007f, B:24:0x0082, B:26:0x0093, B:27:0x00a6, B:31:0x00b0, B:32:0x00c3, B:33:0x00c4, B:34:0x00cb, B:35:0x00cc, B:37:0x00d6, B:42:0x00e7, B:46:0x00ef, B:52:0x0105, B:58:0x0128, B:61:0x0131, B:64:0x0138, B:77:0x018c, B:80:0x0195, B:83:0x019c, B:86:0x01a3, B:89:0x01aa, B:70:0x0148, B:72:0x0152, B:73:0x0155, B:74:0x017d), top: B:418:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0138 A[Catch: IOException -> 0x06b5, all -> 0x06b9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x06b5, blocks: (B:10:0x0024, B:14:0x003e, B:18:0x004b, B:20:0x005d, B:21:0x0063, B:23:0x007f, B:24:0x0082, B:26:0x0093, B:27:0x00a6, B:31:0x00b0, B:32:0x00c3, B:33:0x00c4, B:34:0x00cb, B:35:0x00cc, B:37:0x00d6, B:42:0x00e7, B:46:0x00ef, B:52:0x0105, B:58:0x0128, B:61:0x0131, B:64:0x0138, B:77:0x018c, B:80:0x0195, B:83:0x019c, B:86:0x01a3, B:89:0x01aa, B:70:0x0148, B:72:0x0152, B:73:0x0155, B:74:0x017d), top: B:418:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0140  */
    /* JADX WARN: Code duplicated, block: B:68:0x0142 A[Catch: all -> 0x06ae, IOException -> 0x06b1, TRY_LEAVE, TryCatch #5 {IOException -> 0x06b1, blocks: (B:44:0x00eb, B:48:0x00f5, B:50:0x0101, B:54:0x010b, B:56:0x0117, B:59:0x012b, B:65:0x013b, B:75:0x017e, B:78:0x018f, B:87:0x01a6, B:90:0x01b0, B:92:0x01b4, B:94:0x01c8, B:96:0x01ce, B:97:0x01d1, B:99:0x01db, B:100:0x01de, B:102:0x01e6, B:104:0x01f0, B:109:0x01fb, B:111:0x0206, B:114:0x020d, B:115:0x0210, B:117:0x022a, B:119:0x024d, B:120:0x0252, B:122:0x0258, B:209:0x0445, B:211:0x044b, B:212:0x044e, B:278:0x053f, B:280:0x054b, B:281:0x054e, B:283:0x0554, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:290:0x0579, B:293:0x0580, B:296:0x0586, B:298:0x059d, B:301:0x05a4, B:302:0x05a7, B:303:0x05c8, B:310:0x0602, B:311:0x0603, B:312:0x0605, B:326:0x0632, B:327:0x0633, B:223:0x0465, B:226:0x046c, B:227:0x046f, B:229:0x0473, B:231:0x047b, B:233:0x0481, B:235:0x048b, B:237:0x0493, B:239:0x0499, B:241:0x04a1, B:243:0x04a7, B:245:0x04af, B:247:0x04b7, B:250:0x04c0, B:252:0x04c8, B:253:0x04cb, B:255:0x04d7, B:256:0x04e4, B:257:0x04e5, B:258:0x0501, B:260:0x0505, B:262:0x0509, B:264:0x0511, B:266:0x0515, B:215:0x0453, B:217:0x0459, B:218:0x045c, B:219:0x045f, B:93:0x01c4, B:68:0x0142, B:272:0x0521, B:273:0x0528, B:274:0x0529, B:276:0x053b, B:277:0x053d), top: B:421:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0148 A[Catch: IOException -> 0x06b5, all -> 0x06b9, TRY_ENTER, TryCatch #3 {IOException -> 0x06b5, blocks: (B:10:0x0024, B:14:0x003e, B:18:0x004b, B:20:0x005d, B:21:0x0063, B:23:0x007f, B:24:0x0082, B:26:0x0093, B:27:0x00a6, B:31:0x00b0, B:32:0x00c3, B:33:0x00c4, B:34:0x00cb, B:35:0x00cc, B:37:0x00d6, B:42:0x00e7, B:46:0x00ef, B:52:0x0105, B:58:0x0128, B:61:0x0131, B:64:0x0138, B:77:0x018c, B:80:0x0195, B:83:0x019c, B:86:0x01a3, B:89:0x01aa, B:70:0x0148, B:72:0x0152, B:73:0x0155, B:74:0x017d), top: B:418:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0152 A[Catch: IOException -> 0x06b5, all -> 0x06b9, TryCatch #3 {IOException -> 0x06b5, blocks: (B:10:0x0024, B:14:0x003e, B:18:0x004b, B:20:0x005d, B:21:0x0063, B:23:0x007f, B:24:0x0082, B:26:0x0093, B:27:0x00a6, B:31:0x00b0, B:32:0x00c3, B:33:0x00c4, B:34:0x00cb, B:35:0x00cc, B:37:0x00d6, B:42:0x00e7, B:46:0x00ef, B:52:0x0105, B:58:0x0128, B:61:0x0131, B:64:0x0138, B:77:0x018c, B:80:0x0195, B:83:0x019c, B:86:0x01a3, B:89:0x01aa, B:70:0x0148, B:72:0x0152, B:73:0x0155, B:74:0x017d), top: B:418:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x018c A[Catch: IOException -> 0x06b5, all -> 0x06b9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x06b5, blocks: (B:10:0x0024, B:14:0x003e, B:18:0x004b, B:20:0x005d, B:21:0x0063, B:23:0x007f, B:24:0x0082, B:26:0x0093, B:27:0x00a6, B:31:0x00b0, B:32:0x00c3, B:33:0x00c4, B:34:0x00cb, B:35:0x00cc, B:37:0x00d6, B:42:0x00e7, B:46:0x00ef, B:52:0x0105, B:58:0x0128, B:61:0x0131, B:64:0x0138, B:77:0x018c, B:80:0x0195, B:83:0x019c, B:86:0x01a3, B:89:0x01aa, B:70:0x0148, B:72:0x0152, B:73:0x0155, B:74:0x017d), top: B:418:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0195 A[Catch: IOException -> 0x06b5, all -> 0x06b9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x06b5, blocks: (B:10:0x0024, B:14:0x003e, B:18:0x004b, B:20:0x005d, B:21:0x0063, B:23:0x007f, B:24:0x0082, B:26:0x0093, B:27:0x00a6, B:31:0x00b0, B:32:0x00c3, B:33:0x00c4, B:34:0x00cb, B:35:0x00cc, B:37:0x00d6, B:42:0x00e7, B:46:0x00ef, B:52:0x0105, B:58:0x0128, B:61:0x0131, B:64:0x0138, B:77:0x018c, B:80:0x0195, B:83:0x019c, B:86:0x01a3, B:89:0x01aa, B:70:0x0148, B:72:0x0152, B:73:0x0155, B:74:0x017d), top: B:418:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x019c A[Catch: IOException -> 0x06b5, all -> 0x06b9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x06b5, blocks: (B:10:0x0024, B:14:0x003e, B:18:0x004b, B:20:0x005d, B:21:0x0063, B:23:0x007f, B:24:0x0082, B:26:0x0093, B:27:0x00a6, B:31:0x00b0, B:32:0x00c3, B:33:0x00c4, B:34:0x00cb, B:35:0x00cc, B:37:0x00d6, B:42:0x00e7, B:46:0x00ef, B:52:0x0105, B:58:0x0128, B:61:0x0131, B:64:0x0138, B:77:0x018c, B:80:0x0195, B:83:0x019c, B:86:0x01a3, B:89:0x01aa, B:70:0x0148, B:72:0x0152, B:73:0x0155, B:74:0x017d), top: B:418:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a3 A[Catch: IOException -> 0x06b5, all -> 0x06b9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x06b5, blocks: (B:10:0x0024, B:14:0x003e, B:18:0x004b, B:20:0x005d, B:21:0x0063, B:23:0x007f, B:24:0x0082, B:26:0x0093, B:27:0x00a6, B:31:0x00b0, B:32:0x00c3, B:33:0x00c4, B:34:0x00cb, B:35:0x00cc, B:37:0x00d6, B:42:0x00e7, B:46:0x00ef, B:52:0x0105, B:58:0x0128, B:61:0x0131, B:64:0x0138, B:77:0x018c, B:80:0x0195, B:83:0x019c, B:86:0x01a3, B:89:0x01aa, B:70:0x0148, B:72:0x0152, B:73:0x0155, B:74:0x017d), top: B:418:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01aa A[Catch: IOException -> 0x06b5, all -> 0x06b9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x06b5, blocks: (B:10:0x0024, B:14:0x003e, B:18:0x004b, B:20:0x005d, B:21:0x0063, B:23:0x007f, B:24:0x0082, B:26:0x0093, B:27:0x00a6, B:31:0x00b0, B:32:0x00c3, B:33:0x00c4, B:34:0x00cb, B:35:0x00cc, B:37:0x00d6, B:42:0x00e7, B:46:0x00ef, B:52:0x0105, B:58:0x0128, B:61:0x0131, B:64:0x0138, B:77:0x018c, B:80:0x0195, B:83:0x019c, B:86:0x01a3, B:89:0x01aa, B:70:0x0148, B:72:0x0152, B:73:0x0155, B:74:0x017d), top: B:418:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01b4 A[Catch: all -> 0x06ae, IOException -> 0x06b1, TryCatch #5 {IOException -> 0x06b1, blocks: (B:44:0x00eb, B:48:0x00f5, B:50:0x0101, B:54:0x010b, B:56:0x0117, B:59:0x012b, B:65:0x013b, B:75:0x017e, B:78:0x018f, B:87:0x01a6, B:90:0x01b0, B:92:0x01b4, B:94:0x01c8, B:96:0x01ce, B:97:0x01d1, B:99:0x01db, B:100:0x01de, B:102:0x01e6, B:104:0x01f0, B:109:0x01fb, B:111:0x0206, B:114:0x020d, B:115:0x0210, B:117:0x022a, B:119:0x024d, B:120:0x0252, B:122:0x0258, B:209:0x0445, B:211:0x044b, B:212:0x044e, B:278:0x053f, B:280:0x054b, B:281:0x054e, B:283:0x0554, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:290:0x0579, B:293:0x0580, B:296:0x0586, B:298:0x059d, B:301:0x05a4, B:302:0x05a7, B:303:0x05c8, B:310:0x0602, B:311:0x0603, B:312:0x0605, B:326:0x0632, B:327:0x0633, B:223:0x0465, B:226:0x046c, B:227:0x046f, B:229:0x0473, B:231:0x047b, B:233:0x0481, B:235:0x048b, B:237:0x0493, B:239:0x0499, B:241:0x04a1, B:243:0x04a7, B:245:0x04af, B:247:0x04b7, B:250:0x04c0, B:252:0x04c8, B:253:0x04cb, B:255:0x04d7, B:256:0x04e4, B:257:0x04e5, B:258:0x0501, B:260:0x0505, B:262:0x0509, B:264:0x0511, B:266:0x0515, B:215:0x0453, B:217:0x0459, B:218:0x045c, B:219:0x045f, B:93:0x01c4, B:68:0x0142, B:272:0x0521, B:273:0x0528, B:274:0x0529, B:276:0x053b, B:277:0x053d), top: B:421:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01c4 A[Catch: all -> 0x06ae, IOException -> 0x06b1, TryCatch #5 {IOException -> 0x06b1, blocks: (B:44:0x00eb, B:48:0x00f5, B:50:0x0101, B:54:0x010b, B:56:0x0117, B:59:0x012b, B:65:0x013b, B:75:0x017e, B:78:0x018f, B:87:0x01a6, B:90:0x01b0, B:92:0x01b4, B:94:0x01c8, B:96:0x01ce, B:97:0x01d1, B:99:0x01db, B:100:0x01de, B:102:0x01e6, B:104:0x01f0, B:109:0x01fb, B:111:0x0206, B:114:0x020d, B:115:0x0210, B:117:0x022a, B:119:0x024d, B:120:0x0252, B:122:0x0258, B:209:0x0445, B:211:0x044b, B:212:0x044e, B:278:0x053f, B:280:0x054b, B:281:0x054e, B:283:0x0554, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:290:0x0579, B:293:0x0580, B:296:0x0586, B:298:0x059d, B:301:0x05a4, B:302:0x05a7, B:303:0x05c8, B:310:0x0602, B:311:0x0603, B:312:0x0605, B:326:0x0632, B:327:0x0633, B:223:0x0465, B:226:0x046c, B:227:0x046f, B:229:0x0473, B:231:0x047b, B:233:0x0481, B:235:0x048b, B:237:0x0493, B:239:0x0499, B:241:0x04a1, B:243:0x04a7, B:245:0x04af, B:247:0x04b7, B:250:0x04c0, B:252:0x04c8, B:253:0x04cb, B:255:0x04d7, B:256:0x04e4, B:257:0x04e5, B:258:0x0501, B:260:0x0505, B:262:0x0509, B:264:0x0511, B:266:0x0515, B:215:0x0453, B:217:0x0459, B:218:0x045c, B:219:0x045f, B:93:0x01c4, B:68:0x0142, B:272:0x0521, B:273:0x0528, B:274:0x0529, B:276:0x053b, B:277:0x053d), top: B:421:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01ce A[Catch: all -> 0x06ae, IOException -> 0x06b1, TryCatch #5 {IOException -> 0x06b1, blocks: (B:44:0x00eb, B:48:0x00f5, B:50:0x0101, B:54:0x010b, B:56:0x0117, B:59:0x012b, B:65:0x013b, B:75:0x017e, B:78:0x018f, B:87:0x01a6, B:90:0x01b0, B:92:0x01b4, B:94:0x01c8, B:96:0x01ce, B:97:0x01d1, B:99:0x01db, B:100:0x01de, B:102:0x01e6, B:104:0x01f0, B:109:0x01fb, B:111:0x0206, B:114:0x020d, B:115:0x0210, B:117:0x022a, B:119:0x024d, B:120:0x0252, B:122:0x0258, B:209:0x0445, B:211:0x044b, B:212:0x044e, B:278:0x053f, B:280:0x054b, B:281:0x054e, B:283:0x0554, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:290:0x0579, B:293:0x0580, B:296:0x0586, B:298:0x059d, B:301:0x05a4, B:302:0x05a7, B:303:0x05c8, B:310:0x0602, B:311:0x0603, B:312:0x0605, B:326:0x0632, B:327:0x0633, B:223:0x0465, B:226:0x046c, B:227:0x046f, B:229:0x0473, B:231:0x047b, B:233:0x0481, B:235:0x048b, B:237:0x0493, B:239:0x0499, B:241:0x04a1, B:243:0x04a7, B:245:0x04af, B:247:0x04b7, B:250:0x04c0, B:252:0x04c8, B:253:0x04cb, B:255:0x04d7, B:256:0x04e4, B:257:0x04e5, B:258:0x0501, B:260:0x0505, B:262:0x0509, B:264:0x0511, B:266:0x0515, B:215:0x0453, B:217:0x0459, B:218:0x045c, B:219:0x045f, B:93:0x01c4, B:68:0x0142, B:272:0x0521, B:273:0x0528, B:274:0x0529, B:276:0x053b, B:277:0x053d), top: B:421:0x00e9 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01db A[Catch: all -> 0x06ae, IOException -> 0x06b1, TryCatch #5 {IOException -> 0x06b1, blocks: (B:44:0x00eb, B:48:0x00f5, B:50:0x0101, B:54:0x010b, B:56:0x0117, B:59:0x012b, B:65:0x013b, B:75:0x017e, B:78:0x018f, B:87:0x01a6, B:90:0x01b0, B:92:0x01b4, B:94:0x01c8, B:96:0x01ce, B:97:0x01d1, B:99:0x01db, B:100:0x01de, B:102:0x01e6, B:104:0x01f0, B:109:0x01fb, B:111:0x0206, B:114:0x020d, B:115:0x0210, B:117:0x022a, B:119:0x024d, B:120:0x0252, B:122:0x0258, B:209:0x0445, B:211:0x044b, B:212:0x044e, B:278:0x053f, B:280:0x054b, B:281:0x054e, B:283:0x0554, B:284:0x0557, B:286:0x055b, B:288:0x0563, B:290:0x0579, B:293:0x0580, B:296:0x0586, B:298:0x059d, B:301:0x05a4, B:302:0x05a7, B:303:0x05c8, B:310:0x0602, B:311:0x0603, B:312:0x0605, B:326:0x0632, B:327:0x0633, B:223:0x0465, B:226:0x046c, B:227:0x046f, B:229:0x0473, B:231:0x047b, B:233:0x0481, B:235:0x048b, B:237:0x0493, B:239:0x0499, B:241:0x04a1, B:243:0x04a7, B:245:0x04af, B:247:0x04b7, B:250:0x04c0, B:252:0x04c8, B:253:0x04cb, B:255:0x04d7, B:256:0x04e4, B:257:0x04e5, B:258:0x0501, B:260:0x0505, B:262:0x0509, B:264:0x0511, B:266:0x0515, B:215:0x0453, B:217:0x0459, B:218:0x045c, B:219:0x045f, B:93:0x01c4, B:68:0x0142, B:272:0x0521, B:273:0x0528, B:274:0x0529, B:276:0x053b, B:277:0x053d), top: B:421:0x00e9 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:308:0x05d7, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [apkz] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.apkz
    public final defpackage.apky d() throws java.lang.Throwable {
        boolean z;
        ?? r8;
        boolean z2;
        java.net.Socket socket;
        defpackage.apky apkyVar;
        java.net.Socket socket2;
        ?? r13;
        defpackage.apjp apjpVar;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory;
        boolean z3;
        java.util.List list;
        defpackage.apjf apjfVar;
        defpackage.apkt apktVar;
        java.net.Socket socket3;
        defpackage.apjf apjfVar2;
        defpackage.apkd apkdVar;
        defpackage.apkd apkdVar2;
        defpackage.apjf apjfVar3;
        defpackage.apkd apkdVar3;
        defpackage.apms apmsVar;
        defpackage.apna apnaVar;
        java.util.logging.Logger logger;
        defpackage.apoz apozVar;
        defpackage.apnf apnfVar;
        int i;
        int iC;
        java.net.InetSocketAddress inetSocketAddress;
        java.net.Proxy proxy;
        java.lang.Object obj;
        defpackage.apkd apkdVar4;
        defpackage.apkd apkdVar5;
        java.lang.String str;
        java.net.Socket socketCreateSocket;
        javax.net.ssl.SSLSocket sSLSocket;
        defpackage.apkg apkgVarK;
        java.lang.String[] enabledProtocols;
        defpackage.apik apikVar;
        boolean z4;
        java.lang.String[] enabledCipherSuites;
        java.lang.String[] strArr;
        java.lang.String[] strArr2;
        java.lang.String[] enabledProtocols2;
        java.lang.String[] supportedCipherSuites;
        java.util.Comparator comparator;
        int length;
        int i2;
        defpackage.apik apikVarA;
        defpackage.apkg apkgVar;
        aplh aplhVar;
        defpackage.apkg apkgVarK2;
        android.net.ssl.EchConfigMismatchException echConfigMismatchExceptionM;
        java.lang.String strM;
        defpackage.appb appbVarAS;
        byte[] bArrM;
        boolean z5;
        javax.net.ssl.SSLSession session;
        defpackage.apit apitVarV;
        javax.net.ssl.HostnameVerifier hostnameVerifier;
        defpackage.apih apihVar;
        java.lang.String strA;
        defpackage.apjf apjfVar4;
        java.util.Iterator it;
        java.lang.Object next;
        defpackage.apnw apnwVar;
        java.util.List listA;
        java.lang.Object obj2;
        java.security.cert.X509Certificate x509Certificate;
        java.util.List list2;
        defpackage.appb appbVar;
        java.util.Iterator it2;
        java.lang.Object next2;
        defpackage.apnw apnwVar2;
        int i3;
        java.net.Socket socket4 = this.r;
        if (socket4 == null) {
            throw new java.lang.IllegalArgumentException("TCP not connected");
        }
        if (i()) {
            throw new java.lang.IllegalStateException("already connected");
        }
        defpackage.apjp apjpVar2 = this.a;
        defpackage.apib apibVar = apjpVar2.a;
        java.util.List list3 = apibVar.k;
        defpackage.apks apksVar = this.k;
        apksVar.p.add(this);
        try {
            try {
                defpackage.apjh apjhVar = this.m;
                if (apjhVar == null) {
                    sSLSocketFactory = apibVar.c;
                    if (sSLSocketFactory != null) {
                        apkdVar4 = this.v;
                        if (apkdVar4 == null) {
                            defpackage.aooh.j("socket");
                            apkdVar4 = null;
                        }
                        if (((defpackage.appx) apkdVar4.b).b.B()) {
                            apkdVar5 = this.v;
                            if (apkdVar5 == null) {
                                defpackage.aooh.j("socket");
                                apkdVar5 = null;
                            }
                            if (((defpackage.appv) apkdVar5.c).b.B()) {
                                defpackage.apis apisVar = apksVar.c;
                                defpackage.apiw apiwVar = apibVar.i;
                                str = apiwVar.b;
                                socketCreateSocket = sSLSocketFactory.createSocket(socket4, str, apiwVar.c, true);
                                if (socketCreateSocket == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                                }
                                sSLSocket = (javax.net.ssl.SSLSocket) socketCreateSocket;
                                if (list3 == null) {
                                    defpackage.aooh.i("connectionSpecs");
                                }
                                if (sSLSocket == null) {
                                    defpackage.aooh.i("sslSocket");
                                }
                                if (this.n != -1) {
                                    apkgVarK = this;
                                } else {
                                    apkgVarK = k(list3, sSLSocket);
                                    if (apkgVarK == null) {
                                        boolean z6 = this.o;
                                        enabledProtocols = sSLSocket.getEnabledProtocols();
                                        if (enabledProtocols == null) {
                                            defpackage.aooh.g();
                                        }
                                        java.lang.String string = java.util.Arrays.toString(enabledProtocols);
                                        defpackage.aooh.e(string, "toString(...)");
                                        throw new java.net.UnknownServiceException("Unable to find acceptable protocols. isFallback=" + z6 + ", modes=" + list3 + ", supported protocols=" + string);
                                    }
                                }
                                apikVar = (defpackage.apik) list3.get(apkgVarK.n);
                                z4 = apkgVarK.o;
                                if (sSLSocket == null) {
                                    defpackage.aooh.i("sslSocket");
                                }
                                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                                if (enabledCipherSuites == null) {
                                    defpackage.aooh.g();
                                }
                                if (apikVar == null) {
                                    defpackage.aooh.i("<this>");
                                }
                                if (enabledCipherSuites == null) {
                                    defpackage.aooh.i("socketEnabledCipherSuites");
                                }
                                strArr = apikVar.e;
                                if (strArr != null) {
                                    enabledCipherSuites = defpackage.apjv.m(strArr, enabledCipherSuites, defpackage.apii.a);
                                }
                                strArr2 = apikVar.f;
                                if (strArr2 != null) {
                                    java.lang.String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
                                    defpackage.aooh.e(enabledProtocols3, "getEnabledProtocols(...)");
                                    enabledProtocols2 = defpackage.apjv.m(enabledProtocols3, strArr2, defpackage.aolh.a);
                                } else {
                                    enabledProtocols2 = sSLSocket.getEnabledProtocols();
                                }
                                supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                                if (supportedCipherSuites == null) {
                                    defpackage.aooh.g();
                                }
                                comparator = defpackage.apii.a;
                                int i4 = defpackage.apjv.a;
                                if (supportedCipherSuites == null) {
                                    defpackage.aooh.i("<this>");
                                }
                                length = supportedCipherSuites.length;
                                i2 = 0;
                                while (true) {
                                    if (i2 < length) {
                                        i2 = -1;
                                        break;
                                    }
                                    i3 = length;
                                    if (comparator.compare(supportedCipherSuites[i2], "TLS_FALLBACK_SCSV") != 0) {
                                        break;
                                        break;
                                    }
                                    i2++;
                                    length = i3;
                                }
                                if (z4) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                defpackage.apij apijVar = new defpackage.apij(apikVar);
                                apijVar.b((java.lang.String[]) java.util.Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
                                apijVar.d((java.lang.String[]) java.util.Arrays.copyOf(enabledProtocols2, enabledProtocols2.length));
                                apikVarA = apijVar.a();
                                if (apikVarA.b() != null) {
                                    sSLSocket.setEnabledProtocols(apikVarA.f);
                                }
                                if (apikVarA.a() != null) {
                                    sSLSocket.setEnabledCipherSuites(apikVarA.e);
                                }
                                z5 = apikVar.d;
                                if (z5) {
                                    defpackage.apnn apnnVar = defpackage.apnn.b;
                                    list2 = apibVar.j;
                                    appbVar = apjpVar2.d;
                                    if (sSLSocket == null) {
                                        defpackage.aooh.i("sslSocket");
                                    }
                                    if (list2 == null) {
                                        defpackage.aooh.i("protocols");
                                    }
                                    it2 = ((defpackage.apnl) apnnVar).a.iterator();
                                    do {
                                        if (it2.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it2.next();
                                    } while (!((defpackage.apnw) next2).d(sSLSocket));
                                    apnwVar2 = (defpackage.apnw) next2;
                                    if (apnwVar2 != null) {
                                        apnwVar2.b(sSLSocket, str, list2, appbVar);
                                    }
                                }
                                sSLSocket.startHandshake();
                                session = sSLSocket.getSession();
                                if (session == null) {
                                    defpackage.aooh.g();
                                }
                                apitVarV = defpackage.aooh.V(session);
                                hostnameVerifier = apibVar.d;
                                if (hostnameVerifier == null) {
                                    defpackage.aooh.g();
                                }
                                if (!hostnameVerifier.verify(str, session)) {
                                    listA = apitVarV.a();
                                    if (!listA.isEmpty()) {
                                        throw new javax.net.ssl.SSLPeerUnverifiedException(defpackage.a.bk(str, "Hostname ", " not verified (no certificates)"));
                                    }
                                    obj2 = listA.get(0);
                                    if (obj2 == null) {
                                        defpackage.aooh.h("null cannot be cast to non-null type java.security.cert.X509Certificate");
                                    }
                                    x509Certificate = (java.security.cert.X509Certificate) obj2;
                                    defpackage.apih apihVar2 = defpackage.apih.a;
                                    defpackage.aooh.f(x509Certificate, "certificate");
                                    if (x509Certificate instanceof java.security.cert.X509Certificate) {
                                        throw new java.lang.IllegalArgumentException("Certificate pinning requires X509 certificates");
                                    }
                                    defpackage.aooh.f(x509Certificate, "<this>");
                                    defpackage.appb appbVar2 = defpackage.appb.a;
                                    byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                                    defpackage.aooh.e(encoded, "getEncoded(...)");
                                    defpackage.appb appbVarAS2 = defpackage.aoov.aS(encoded);
                                    byte[] bArr = appbVarAS2.b;
                                    java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
                                    messageDigest.update(bArr, 0, appbVarAS2.c());
                                    byte[] bArrDigest = messageDigest.digest();
                                    defpackage.aooh.c(bArrDigest);
                                    java.lang.String strConcat = "sha256/".concat(new defpackage.appb(bArrDigest).p());
                                    java.lang.String name = x509Certificate.getSubjectDN().getName();
                                    if (x509Certificate == null) {
                                        defpackage.aooh.i("certificate");
                                    }
                                    throw new javax.net.ssl.SSLPeerUnverifiedException(defpackage.aoov.n("\n            |Hostname " + str + " not verified:\n            |    certificate: " + strConcat + "\n            |    DN: " + name + "\n            |    subjectAltNames: " + defpackage.ajsz.bT(defpackage.apoe.a(x509Certificate, 7), defpackage.apoe.a(x509Certificate, 2)) + "\n            "));
                                }
                                apihVar = apibVar.e;
                                if (apihVar == null) {
                                    defpackage.aooh.g();
                                }
                                this.s = new defpackage.apit(apitVarV.a, apitVarV.b, apitVarV.c, new defpackage.dcg(apihVar, apitVarV, apibVar, 5));
                                apihVar.b();
                                if (z5) {
                                    defpackage.apnn apnnVar2 = defpackage.apnn.b;
                                    if (sSLSocket == null) {
                                        defpackage.aooh.i("sslSocket");
                                    }
                                    it = ((defpackage.apnl) apnnVar2).a.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                    } while (!((defpackage.apnw) next).d(sSLSocket));
                                    apnwVar = (defpackage.apnw) next;
                                    if (apnwVar != null) {
                                        strA = apnwVar.a(sSLSocket);
                                    } else {
                                        strA = null;
                                    }
                                } else {
                                    strA = null;
                                }
                                this.c = sSLSocket;
                                if (sSLSocket == null) {
                                    defpackage.aooh.i("<this>");
                                }
                                if (sSLSocket == null) {
                                    defpackage.aooh.i("<this>");
                                }
                                this.v = new defpackage.apkd(new defpackage.apqm(sSLSocket));
                                if (strA != null) {
                                    apjfVar4 = defpackage.apjf.HTTP_1_0;
                                    if (!defpackage.aooh.n(strA, apjfVar4.h)) {
                                        apjfVar4 = defpackage.apjf.HTTP_1_1;
                                        if (!defpackage.aooh.n(strA, apjfVar4.h)) {
                                            apjfVar4 = defpackage.apjf.H2_PRIOR_KNOWLEDGE;
                                            if (!defpackage.aooh.n(strA, apjfVar4.h)) {
                                                apjfVar4 = defpackage.apjf.HTTP_2;
                                                if (!defpackage.aooh.n(strA, apjfVar4.h)) {
                                                    apjfVar4 = defpackage.apjf.SPDY_3;
                                                    if (!defpackage.aooh.n(strA, apjfVar4.h)) {
                                                        apjfVar4 = defpackage.apjf.QUIC;
                                                        if (!defpackage.aooh.n(strA, apjfVar4.h)) {
                                                            apjfVar4 = defpackage.apjf.HTTP_3;
                                                            if (!defpackage.aoov.ad(strA, apjfVar4.h)) {
                                                                throw new java.io.IOException("Unexpected protocol: ".concat(strA));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    apjfVar4 = defpackage.apjf.HTTP_1_1;
                                }
                                this.t = apjfVar4;
                                defpackage.apnn apnnVar3 = defpackage.apnn.b;
                                if (sSLSocket == null) {
                                    defpackage.aooh.i("sslSocket");
                                }
                                defpackage.apis apisVar2 = apksVar.c;
                            }
                        }
                        throw new java.io.IOException("TLS tunnel buffered too many bytes!");
                    }
                    z3 = true;
                    this.c = socket4;
                    list = this.a.a.j;
                    apjfVar = defpackage.apjf.H2_PRIOR_KNOWLEDGE;
                    if (!list.contains(apjfVar)) {
                        apjfVar = defpackage.apjf.HTTP_1_1;
                    }
                    this.t = apjfVar;
                    defpackage.apkc apkcVar = this.d;
                    defpackage.apkv apkvVar = this.e;
                    defpackage.apjp apjpVar3 = this.a;
                    socket3 = this.c;
                    if (socket3 == null) {
                        defpackage.aooh.g();
                    }
                    defpackage.apit apitVar = this.s;
                    apjfVar2 = this.t;
                    if (apjfVar2 == null) {
                        defpackage.aooh.g();
                    }
                    apkdVar = this.v;
                    if (apkdVar == null) {
                        defpackage.aooh.j("socket");
                        apkdVar2 = null;
                    } else {
                        apkdVar2 = apkdVar;
                    }
                    apktVar = new defpackage.apkt(apkcVar, apjpVar3, socket4, socket3, apitVar, apjfVar2, apkdVar2, (defpackage.apkh) apkvVar.b);
                    this.u = apktVar;
                    apktVar.n = java.lang.System.nanoTime();
                    apjfVar3 = apktVar.e;
                    if (apjfVar3 != defpackage.apjf.HTTP_2) {
                        z = false;
                        apktVar.c.setSoTimeout(0);
                        defpackage.apmf apmfVar = defpackage.apmf.a;
                        defpackage.apmn apmnVar = new defpackage.apmn(apktVar.a);
                        apkdVar3 = apktVar.o;
                        java.lang.String str2 = apktVar.b.a.i.b;
                        if (apkdVar3 == null) {
                            defpackage.aooh.i("socket");
                        }
                        if (apkdVar3 == null) {
                            defpackage.aooh.i("<set-?>");
                        }
                        apmnVar.e = apkdVar3;
                        r8 = 32;
                        apmnVar.b = defpackage.a.bE(str2, (byte) 32, defpackage.apjx.b);
                        apmnVar.c = apktVar;
                        apmnVar.f = apmfVar;
                        apmsVar = new defpackage.apms(apmnVar);
                        apktVar.g = apmsVar;
                        apktVar.l = defpackage.apms.a.d();
                        apnaVar = apmsVar.u;
                        synchronized (apnaVar) {
                            if (!apnaVar.e) {
                                throw new java.io.IOException("closed");
                            }
                            logger = defpackage.apna.a;
                            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                                logger.fine(defpackage.apjx.c(">> CONNECTION " + defpackage.apmk.a.g(), new java.lang.Object[0]));
                            }
                            apozVar = apnaVar.b;
                            apozVar.J(defpackage.apmk.a);
                            apozVar.flush();
                            apnfVar = apmsVar.q;
                            synchronized (apnaVar) {
                                if (!apnaVar.e) {
                                    throw new java.io.IOException("closed");
                                }
                                apnaVar.c(0, java.lang.Integer.bitCount(apnfVar.a) * 6, 4, 0);
                                for (i = 0; i < 10; i++) {
                                    if (apnfVar.f(i)) {
                                        apozVar.R(i);
                                        apozVar.Q(apnfVar.a(i));
                                    }
                                }
                                apozVar.flush();
                                iC = apnfVar.c();
                                if (iC != 65535) {
                                    z = false;
                                    apnaVar.e(0, iC - 65535);
                                } else {
                                    z = false;
                                }
                                apmsVar.h.b().e(apmsVar.d, apmsVar.v);
                                defpackage.apks apksVar2 = this.k;
                                defpackage.apis apisVar3 = apksVar2.c;
                                inetSocketAddress = apjpVar3.c;
                                proxy = apjpVar3.b;
                                if (inetSocketAddress == null) {
                                    defpackage.aooh.i("inetSocketAddress");
                                }
                                if (proxy == null) {
                                    defpackage.aooh.i("proxy");
                                }
                                obj = null;
                                apkyVar = new defpackage.apky(this, null, null);
                                apksVar2.p.remove(this);
                                throw th;
                            }
                            throw th;
                        }
                    }
                    z = false;
                    apktVar.c.setSoTimeout(0);
                    defpackage.apmf apmfVar2 = defpackage.apmf.a;
                    defpackage.apmn apmnVar2 = new defpackage.apmn(apktVar.a);
                    apkdVar3 = apktVar.o;
                    java.lang.String str3 = apktVar.b.a.i.b;
                    if (apkdVar3 == null) {
                        defpackage.aooh.i("socket");
                    }
                    if (apkdVar3 == null) {
                        defpackage.aooh.i("<set-?>");
                    }
                    apmnVar2.e = apkdVar3;
                    r8 = 32;
                    apmnVar2.b = defpackage.a.bE(str3, (byte) 32, defpackage.apjx.b);
                    apmnVar2.c = apktVar;
                    apmnVar2.f = apmfVar2;
                    apmsVar = new defpackage.apms(apmnVar2);
                    apktVar.g = apmsVar;
                    apktVar.l = defpackage.apms.a.d();
                    apnaVar = apmsVar.u;
                    synchronized (apnaVar) {
                        if (!apnaVar.e) {
                            throw new java.io.IOException("closed");
                        }
                        logger = defpackage.apna.a;
                        if (logger.isLoggable(java.util.logging.Level.FINE)) {
                            logger.fine(defpackage.apjx.c(">> CONNECTION " + defpackage.apmk.a.g(), new java.lang.Object[0]));
                        }
                        apozVar = apnaVar.b;
                        apozVar.J(defpackage.apmk.a);
                        apozVar.flush();
                        apnfVar = apmsVar.q;
                        synchronized (apnaVar) {
                            if (!apnaVar.e) {
                                throw new java.io.IOException("closed");
                            }
                            apnaVar.c(0, java.lang.Integer.bitCount(apnfVar.a) * 6, 4, 0);
                            while (i < 10) {
                                if (apnfVar.f(i)) {
                                    apozVar.R(i);
                                    apozVar.Q(apnfVar.a(i));
                                }
                            }
                            apozVar.flush();
                            iC = apnfVar.c();
                            if (iC != 65535) {
                                z = false;
                                apnaVar.e(0, iC - 65535);
                            } else {
                                z = false;
                            }
                            apmsVar.h.b().e(apmsVar.d, apmsVar.v);
                            defpackage.apks apksVar3 = this.k;
                            defpackage.apis apisVar4 = apksVar3.c;
                            inetSocketAddress = apjpVar3.c;
                            proxy = apjpVar3.b;
                            if (inetSocketAddress == null) {
                                defpackage.aooh.i("inetSocketAddress");
                            }
                            if (proxy == null) {
                                defpackage.aooh.i("proxy");
                            }
                            obj = null;
                            apkyVar = new defpackage.apky(this, null, null);
                            apksVar3.p.remove(this);
                            throw th;
                        }
                        throw th;
                    }
                }
                try {
                    java.lang.String strBk = defpackage.a.bk(defpackage.apjx.d(apibVar.i, true), "CONNECT ", " HTTP/1.1");
                    defpackage.apkd apkdVar6 = this.v;
                    if (apkdVar6 == null) {
                        defpackage.aooh.j("socket");
                        apkdVar6 = null;
                    }
                    apmc apmcVar = new apmc((defpackage.apje) null, this, apkdVar6);
                    defpackage.apkd apkdVar7 = this.v;
                    if (apkdVar7 == null) {
                        defpackage.aooh.j("socket");
                        apkdVar7 = null;
                    }
                    apkdVar7.b.fP().f(this.f, java.util.concurrent.TimeUnit.MILLISECONDS);
                    defpackage.apkd apkdVar8 = this.v;
                    if (apkdVar8 == null) {
                        defpackage.aooh.j("socket");
                        apkdVar8 = null;
                    }
                    apkdVar8.c.fP().f(this.g, java.util.concurrent.TimeUnit.MILLISECONDS);
                    apmcVar.m(apjhVar.c, strBk);
                    apmcVar.h();
                    defpackage.apjl apjlVarB = apmcVar.b(false);
                    if (apjlVarB == null) {
                        defpackage.aooh.g();
                    }
                    apjlVarB.d(apjhVar);
                    defpackage.apjm apjmVarA = apjlVarB.a();
                    long jA = defpackage.apjx.a(apjmVarA);
                    if (jA != -1) {
                        defpackage.apqd apqdVarL = apmcVar.l(apjmVarA.a.a, jA);
                        defpackage.apjx.k(apqdVarL, Integer.MAX_VALUE, java.util.concurrent.TimeUnit.MILLISECONDS);
                        apqdVarL.close();
                    }
                    int i5 = apjmVarA.d;
                    if (i5 != 200) {
                        if (i5 == 407) {
                            throw new java.io.IOException("Failed to authenticate with proxy");
                        }
                        throw new java.io.IOException("Unexpected response code for CONNECT: " + apjmVarA.d);
                    }
                    apkyVar = new defpackage.apky(this, null, null);
                    if (apkyVar.b == null && apkyVar.c == null) {
                        sSLSocketFactory = apibVar.c;
                        try {
                            try {
                                if (sSLSocketFactory != null) {
                                    apkdVar4 = this.v;
                                    if (apkdVar4 == null) {
                                        defpackage.aooh.j("socket");
                                        apkdVar4 = null;
                                    }
                                    if (((defpackage.appx) apkdVar4.b).b.B()) {
                                        apkdVar5 = this.v;
                                        if (apkdVar5 == null) {
                                            defpackage.aooh.j("socket");
                                            apkdVar5 = null;
                                        }
                                        if (((defpackage.appv) apkdVar5.c).b.B()) {
                                            defpackage.apis apisVar5 = apksVar.c;
                                            defpackage.apiw apiwVar2 = apibVar.i;
                                            str = apiwVar2.b;
                                            socketCreateSocket = sSLSocketFactory.createSocket(socket4, str, apiwVar2.c, true);
                                            if (socketCreateSocket == null) {
                                                defpackage.aooh.h("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                                            }
                                            sSLSocket = (javax.net.ssl.SSLSocket) socketCreateSocket;
                                            if (list3 == null) {
                                                defpackage.aooh.i("connectionSpecs");
                                            }
                                            if (sSLSocket == null) {
                                                defpackage.aooh.i("sslSocket");
                                            }
                                            if (this.n != -1) {
                                                apkgVarK = this;
                                            } else {
                                                apkgVarK = k(list3, sSLSocket);
                                                if (apkgVarK == null) {
                                                    boolean z7 = this.o;
                                                    enabledProtocols = sSLSocket.getEnabledProtocols();
                                                    if (enabledProtocols == null) {
                                                        defpackage.aooh.g();
                                                    }
                                                    java.lang.String string2 = java.util.Arrays.toString(enabledProtocols);
                                                    defpackage.aooh.e(string2, "toString(...)");
                                                    throw new java.net.UnknownServiceException("Unable to find acceptable protocols. isFallback=" + z7 + ", modes=" + list3 + ", supported protocols=" + string2);
                                                }
                                            }
                                            apikVar = (defpackage.apik) list3.get(apkgVarK.n);
                                            z4 = apkgVarK.o;
                                            if (sSLSocket == null) {
                                                defpackage.aooh.i("sslSocket");
                                            }
                                            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                                            if (enabledCipherSuites == null) {
                                                defpackage.aooh.g();
                                            }
                                            if (apikVar == null) {
                                                defpackage.aooh.i("<this>");
                                            }
                                            if (enabledCipherSuites == null) {
                                                defpackage.aooh.i("socketEnabledCipherSuites");
                                            }
                                            strArr = apikVar.e;
                                            if (strArr != null) {
                                                enabledCipherSuites = defpackage.apjv.m(strArr, enabledCipherSuites, defpackage.apii.a);
                                            }
                                            strArr2 = apikVar.f;
                                            if (strArr2 != null) {
                                                java.lang.String[] enabledProtocols4 = sSLSocket.getEnabledProtocols();
                                                defpackage.aooh.e(enabledProtocols4, "getEnabledProtocols(...)");
                                                enabledProtocols2 = defpackage.apjv.m(enabledProtocols4, strArr2, defpackage.aolh.a);
                                            } else {
                                                enabledProtocols2 = sSLSocket.getEnabledProtocols();
                                            }
                                            supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                                            if (supportedCipherSuites == null) {
                                                defpackage.aooh.g();
                                            }
                                            comparator = defpackage.apii.a;
                                            int i6 = defpackage.apjv.a;
                                            if (supportedCipherSuites == null) {
                                                defpackage.aooh.i("<this>");
                                            }
                                            length = supportedCipherSuites.length;
                                            i2 = 0;
                                            while (true) {
                                                if (i2 < length) {
                                                    i2 = -1;
                                                    break;
                                                }
                                                i3 = length;
                                                if (comparator.compare(supportedCipherSuites[i2], "TLS_FALLBACK_SCSV") != 0) {
                                                    break;
                                                }
                                                i2++;
                                                length = i3;
                                            }
                                            if (z4 || i2 == -1) {
                                                z3 = true;
                                            } else {
                                                java.lang.String str4 = supportedCipherSuites[i2];
                                                defpackage.aooh.e(str4, "get(...)");
                                                if (enabledCipherSuites == null) {
                                                    defpackage.aooh.i("<this>");
                                                }
                                                if (str4 == null) {
                                                    defpackage.aooh.i("value");
                                                }
                                                z3 = true;
                                                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
                                                defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
                                                enabledCipherSuites = (java.lang.String[]) objArrCopyOf;
                                                enabledCipherSuites[defpackage.ajsz.cG(enabledCipherSuites)] = str4;
                                            }
                                            defpackage.apij apijVar2 = new defpackage.apij(apikVar);
                                            apijVar2.b((java.lang.String[]) java.util.Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
                                            apijVar2.d((java.lang.String[]) java.util.Arrays.copyOf(enabledProtocols2, enabledProtocols2.length));
                                            apikVarA = apijVar2.a();
                                            if (apikVarA.b() != null) {
                                                sSLSocket.setEnabledProtocols(apikVarA.f);
                                            }
                                            if (apikVarA.a() != null) {
                                                sSLSocket.setEnabledCipherSuites(apikVarA.e);
                                            }
                                            try {
                                                try {
                                                    z5 = apikVar.d;
                                                    if (z5) {
                                                        defpackage.apnn apnnVar4 = defpackage.apnn.b;
                                                        list2 = apibVar.j;
                                                        appbVar = apjpVar2.d;
                                                        if (sSLSocket == null) {
                                                            defpackage.aooh.i("sslSocket");
                                                        }
                                                        if (list2 == null) {
                                                            defpackage.aooh.i("protocols");
                                                        }
                                                        it2 = ((defpackage.apnl) apnnVar4).a.iterator();
                                                        do {
                                                            if (it2.hasNext()) {
                                                                next2 = null;
                                                                break;
                                                            }
                                                            next2 = it2.next();
                                                        } while (!((defpackage.apnw) next2).d(sSLSocket));
                                                        apnwVar2 = (defpackage.apnw) next2;
                                                        if (apnwVar2 != null) {
                                                            apnwVar2.b(sSLSocket, str, list2, appbVar);
                                                        }
                                                    }
                                                    sSLSocket.startHandshake();
                                                    session = sSLSocket.getSession();
                                                    if (session == null) {
                                                        defpackage.aooh.g();
                                                    }
                                                    apitVarV = defpackage.aooh.V(session);
                                                    hostnameVerifier = apibVar.d;
                                                    if (hostnameVerifier == null) {
                                                        defpackage.aooh.g();
                                                    }
                                                    if (!hostnameVerifier.verify(str, session)) {
                                                        listA = apitVarV.a();
                                                        if (!listA.isEmpty()) {
                                                            throw new javax.net.ssl.SSLPeerUnverifiedException(defpackage.a.bk(str, "Hostname ", " not verified (no certificates)"));
                                                        }
                                                        obj2 = listA.get(0);
                                                        if (obj2 == null) {
                                                            defpackage.aooh.h("null cannot be cast to non-null type java.security.cert.X509Certificate");
                                                        }
                                                        x509Certificate = (java.security.cert.X509Certificate) obj2;
                                                        defpackage.apih apihVar3 = defpackage.apih.a;
                                                        defpackage.aooh.f(x509Certificate, "certificate");
                                                        if (x509Certificate instanceof java.security.cert.X509Certificate) {
                                                            throw new java.lang.IllegalArgumentException("Certificate pinning requires X509 certificates");
                                                        }
                                                        defpackage.aooh.f(x509Certificate, "<this>");
                                                        defpackage.appb appbVar3 = defpackage.appb.a;
                                                        byte[] encoded2 = x509Certificate.getPublicKey().getEncoded();
                                                        defpackage.aooh.e(encoded2, "getEncoded(...)");
                                                        defpackage.appb appbVarAS3 = defpackage.aoov.aS(encoded2);
                                                        byte[] bArr2 = appbVarAS3.b;
                                                        java.security.MessageDigest messageDigest2 = java.security.MessageDigest.getInstance("SHA-256");
                                                        messageDigest2.update(bArr2, 0, appbVarAS3.c());
                                                        byte[] bArrDigest2 = messageDigest2.digest();
                                                        defpackage.aooh.c(bArrDigest2);
                                                        java.lang.String strConcat2 = "sha256/".concat(new defpackage.appb(bArrDigest2).p());
                                                        java.lang.String name2 = x509Certificate.getSubjectDN().getName();
                                                        if (x509Certificate == null) {
                                                            defpackage.aooh.i("certificate");
                                                        }
                                                        throw new javax.net.ssl.SSLPeerUnverifiedException(defpackage.aoov.n("\n            |Hostname " + str + " not verified:\n            |    certificate: " + strConcat2 + "\n            |    DN: " + name2 + "\n            |    subjectAltNames: " + defpackage.ajsz.bT(defpackage.apoe.a(x509Certificate, 7), defpackage.apoe.a(x509Certificate, 2)) + "\n            "));
                                                    }
                                                    apihVar = apibVar.e;
                                                    if (apihVar == null) {
                                                        defpackage.aooh.g();
                                                    }
                                                    this.s = new defpackage.apit(apitVarV.a, apitVarV.b, apitVarV.c, new defpackage.dcg(apihVar, apitVarV, apibVar, 5));
                                                    apihVar.b();
                                                    if (z5) {
                                                        defpackage.apnn apnnVar5 = defpackage.apnn.b;
                                                        if (sSLSocket == null) {
                                                            defpackage.aooh.i("sslSocket");
                                                        }
                                                        it = ((defpackage.apnl) apnnVar5).a.iterator();
                                                        do {
                                                            if (it.hasNext()) {
                                                                next = null;
                                                                break;
                                                            }
                                                            next = it.next();
                                                        } while (!((defpackage.apnw) next).d(sSLSocket));
                                                        apnwVar = (defpackage.apnw) next;
                                                        if (apnwVar != null) {
                                                            strA = apnwVar.a(sSLSocket);
                                                        } else {
                                                            strA = null;
                                                        }
                                                    } else {
                                                        strA = null;
                                                    }
                                                    this.c = sSLSocket;
                                                    if (sSLSocket == null) {
                                                        defpackage.aooh.i("<this>");
                                                    }
                                                    if (sSLSocket == null) {
                                                        defpackage.aooh.i("<this>");
                                                    }
                                                    this.v = new defpackage.apkd(new defpackage.apqm(sSLSocket));
                                                    if (strA != null) {
                                                        apjfVar4 = defpackage.apjf.HTTP_1_0;
                                                        if (!defpackage.aooh.n(strA, apjfVar4.h)) {
                                                            apjfVar4 = defpackage.apjf.HTTP_1_1;
                                                            if (!defpackage.aooh.n(strA, apjfVar4.h)) {
                                                                apjfVar4 = defpackage.apjf.H2_PRIOR_KNOWLEDGE;
                                                                if (!defpackage.aooh.n(strA, apjfVar4.h)) {
                                                                    apjfVar4 = defpackage.apjf.HTTP_2;
                                                                    if (!defpackage.aooh.n(strA, apjfVar4.h)) {
                                                                        apjfVar4 = defpackage.apjf.SPDY_3;
                                                                        if (!defpackage.aooh.n(strA, apjfVar4.h)) {
                                                                            apjfVar4 = defpackage.apjf.QUIC;
                                                                            if (!defpackage.aooh.n(strA, apjfVar4.h)) {
                                                                                apjfVar4 = defpackage.apjf.HTTP_3;
                                                                                if (!defpackage.aoov.ad(strA, apjfVar4.h)) {
                                                                                    throw new java.io.IOException("Unexpected protocol: ".concat(strA));
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        apjfVar4 = defpackage.apjf.HTTP_1_1;
                                                    }
                                                    this.t = apjfVar4;
                                                    defpackage.apnn apnnVar6 = defpackage.apnn.b;
                                                    if (sSLSocket == null) {
                                                        defpackage.aooh.i("sslSocket");
                                                    }
                                                    defpackage.apis apisVar6 = apksVar.c;
                                                } catch (javax.net.ssl.SSLException e) {
                                                    if (list3 == null) {
                                                        defpackage.aooh.i("connectionSpecs");
                                                    }
                                                    if (sSLSocket == null) {
                                                        defpackage.aooh.i("sslSocket");
                                                    }
                                                    if (apkgVarK.p == null) {
                                                        defpackage.apnn apnnVar7 = defpackage.apnn.b;
                                                        if (android.os.Build.VERSION.SDK_INT < 37 || !deh$.ExternalSyntheticApiModelOutline0.m(e) || (strM = deh$.ExternalSyntheticApiModelOutline0.m((echConfigMismatchExceptionM = deh$.ExternalSyntheticApiModelOutline0.m(e)))) == null) {
                                                            aplhVar = null;
                                                        } else {
                                                            defpackage.aorg aorgVar = aplh.a;
                                                            android.net.ssl.EchConfigList echConfigListM = deh$.ExternalSyntheticApiModelOutline0.m(echConfigMismatchExceptionM);
                                                            if (echConfigListM == null || (bArrM = deh$.ExternalSyntheticApiModelOutline0.m(echConfigListM)) == null) {
                                                                appbVarAS = null;
                                                            } else {
                                                                defpackage.appb appbVar4 = defpackage.appb.a;
                                                                appbVarAS = defpackage.aoov.aS(bArrM);
                                                            }
                                                            java.lang.String strA2 = defpackage.apju.a(strM);
                                                            if (strA2 == null || defpackage.apju.a.f(strA2) || aplh.a.f(strA2)) {
                                                                aplhVar = null;
                                                            } else {
                                                                aplhVar = new aplh(strM, appbVarAS);
                                                            }
                                                        }
                                                        if (aplhVar != null) {
                                                            defpackage.apjp apjpVar4 = apkgVarK.a;
                                                            defpackage.apib apibVar2 = apjpVar4.a;
                                                            javax.net.ssl.HostnameVerifier hostnameVerifier2 = apibVar2.d;
                                                            if (hostnameVerifier2 == null) {
                                                                defpackage.aooh.g();
                                                            }
                                                            java.lang.String str5 = aplhVar.b;
                                                            if (!hostnameVerifier2.verify(str5, sSLSocket.getSession())) {
                                                                throw new apli(defpackage.a.bk(str5, "public_name '", "' not verified"), e);
                                                            }
                                                            apkgVarK2 = j(apkgVarK, new defpackage.apjp(apibVar2, apjpVar4.b, apjpVar4.c, aplhVar.c), 0, false, aplhVar, 30);
                                                        } else if (!apkgVarK.j || (((e instanceof javax.net.ssl.SSLHandshakeException) && (e.getCause() instanceof java.security.cert.CertificateException)) || (e instanceof javax.net.ssl.SSLPeerUnverifiedException))) {
                                                            apkgVar = null;
                                                        } else {
                                                            apkgVarK2 = apkgVarK.k(list3, sSLSocket);
                                                        }
                                                        apkgVar = apkgVarK2;
                                                    } else {
                                                        apkgVar = null;
                                                    }
                                                    try {
                                                        throw e;
                                                    } catch (java.io.IOException e2) {
                                                        e = e2;
                                                        z2 = false;
                                                        r13 = apkgVar;
                                                        try {
                                                            defpackage.apis apisVar7 = this.k.c;
                                                            apjpVar = this.a;
                                                            apisVar7.c(apjpVar.c, apjpVar.b);
                                                            if (apjpVar == null) {
                                                                defpackage.aooh.i("route");
                                                            }
                                                            apkyVar = new defpackage.apky(this, r13, e);
                                                            this.k.p.remove(this);
                                                            if (!z2) {
                                                                socket2 = this.c;
                                                                if (socket2 != null) {
                                                                    defpackage.apjx.h(socket2);
                                                                }
                                                                defpackage.apjx.h(socket4);
                                                            }
                                                            return apkyVar;
                                                        } catch (java.lang.Throwable th) {
                                                            th = th;
                                                            this.k.p.remove(this);
                                                            if (!z2) {
                                                                socket = this.c;
                                                                if (socket != null) {
                                                                    defpackage.apjx.h(socket);
                                                                }
                                                                defpackage.apjx.h(socket4);
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                }
                                            } catch (java.lang.Throwable th2) {
                                                defpackage.apnn apnnVar8 = defpackage.apnn.b;
                                                if (sSLSocket == null) {
                                                    defpackage.aooh.i("sslSocket");
                                                }
                                                defpackage.apjx.h(sSLSocket);
                                                throw th2;
                                            }
                                        }
                                    }
                                    throw new java.io.IOException("TLS tunnel buffered too many bytes!");
                                }
                                z3 = true;
                                this.c = socket4;
                                list = this.a.a.j;
                                apjfVar = defpackage.apjf.H2_PRIOR_KNOWLEDGE;
                                if (!list.contains(apjfVar)) {
                                    apjfVar = defpackage.apjf.HTTP_1_1;
                                }
                                this.t = apjfVar;
                                defpackage.apkc apkcVar2 = this.d;
                                defpackage.apkv apkvVar2 = this.e;
                                defpackage.apjp apjpVar5 = this.a;
                                socket3 = this.c;
                                if (socket3 == null) {
                                    defpackage.aooh.g();
                                }
                                defpackage.apit apitVar2 = this.s;
                                apjfVar2 = this.t;
                                if (apjfVar2 == null) {
                                    defpackage.aooh.g();
                                }
                                apkdVar = this.v;
                                if (apkdVar == null) {
                                    defpackage.aooh.j("socket");
                                    apkdVar2 = null;
                                } else {
                                    apkdVar2 = apkdVar;
                                }
                                apktVar = new defpackage.apkt(apkcVar2, apjpVar5, socket4, socket3, apitVar2, apjfVar2, apkdVar2, (defpackage.apkh) apkvVar2.b);
                                this.u = apktVar;
                                apktVar.n = java.lang.System.nanoTime();
                                apjfVar3 = apktVar.e;
                                if (apjfVar3 != defpackage.apjf.HTTP_2 || apjfVar3 == defpackage.apjf.H2_PRIOR_KNOWLEDGE) {
                                    z = false;
                                    try {
                                        try {
                                            apktVar.c.setSoTimeout(0);
                                            defpackage.apmf apmfVar3 = defpackage.apmf.a;
                                            defpackage.apmn apmnVar3 = new defpackage.apmn(apktVar.a);
                                            apkdVar3 = apktVar.o;
                                            java.lang.String str6 = apktVar.b.a.i.b;
                                            if (apkdVar3 == null) {
                                                defpackage.aooh.i("socket");
                                            }
                                            if (apkdVar3 == null) {
                                                defpackage.aooh.i("<set-?>");
                                            }
                                            apmnVar3.e = apkdVar3;
                                            r8 = 32;
                                            apmnVar3.b = defpackage.a.bE(str6, (byte) 32, defpackage.apjx.b);
                                            apmnVar3.c = apktVar;
                                            apmnVar3.f = apmfVar3;
                                            apmsVar = new defpackage.apms(apmnVar3);
                                            apktVar.g = apmsVar;
                                            apktVar.l = defpackage.apms.a.d();
                                            apnaVar = apmsVar.u;
                                            try {
                                                synchronized (apnaVar) {
                                                    try {
                                                        if (!apnaVar.e) {
                                                            logger = defpackage.apna.a;
                                                            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                                                                logger.fine(defpackage.apjx.c(">> CONNECTION " + defpackage.apmk.a.g(), new java.lang.Object[0]));
                                                            }
                                                            apozVar = apnaVar.b;
                                                            apozVar.J(defpackage.apmk.a);
                                                            apozVar.flush();
                                                            apnfVar = apmsVar.q;
                                                            synchronized (apnaVar) {
                                                                try {
                                                                    if (!apnaVar.e) {
                                                                        try {
                                                                            apnaVar.c(0, java.lang.Integer.bitCount(apnfVar.a) * 6, 4, 0);
                                                                            while (i < 10) {
                                                                                if (apnfVar.f(i)) {
                                                                                    apozVar.R(i);
                                                                                    apozVar.Q(apnfVar.a(i));
                                                                                }
                                                                            }
                                                                            apozVar.flush();
                                                                            iC = apnfVar.c();
                                                                            if (iC != 65535) {
                                                                                z = false;
                                                                                apnaVar.e(0, iC - 65535);
                                                                            } else {
                                                                                z = false;
                                                                            }
                                                                            apmsVar.h.b().e(apmsVar.d, apmsVar.v);
                                                                        } catch (java.lang.Throwable th3) {
                                                                            th = th3;
                                                                        }
                                                                    } else {
                                                                        try {
                                                                            throw new java.io.IOException("closed");
                                                                        } catch (java.lang.Throwable th4) {
                                                                            th = th4;
                                                                        }
                                                                    }
                                                                } catch (java.lang.Throwable th5) {
                                                                    th = th5;
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        try {
                                                            throw new java.io.IOException("closed");
                                                        } catch (java.lang.Throwable th6) {
                                                            th = th6;
                                                        }
                                                    } catch (java.lang.Throwable th7) {
                                                        th = th7;
                                                    }
                                                    throw th;
                                                }
                                            } catch (java.io.IOException e3) {
                                                e = e3;
                                                r13 = r8;
                                                z2 = z;
                                                defpackage.apis apisVar8 = this.k.c;
                                                apjpVar = this.a;
                                                apisVar8.c(apjpVar.c, apjpVar.b);
                                                if (apjpVar == null) {
                                                    defpackage.aooh.i("route");
                                                }
                                                apkyVar = new defpackage.apky(this, r13, e);
                                                this.k.p.remove(this);
                                                if (!z2) {
                                                    socket2 = this.c;
                                                    if (socket2 != null) {
                                                        defpackage.apjx.h(socket2);
                                                    }
                                                    defpackage.apjx.h(socket4);
                                                }
                                                return apkyVar;
                                            }
                                        } catch (java.lang.Throwable th8) {
                                            th = th8;
                                            z2 = z;
                                            this.k.p.remove(this);
                                            if (!z2) {
                                                socket = this.c;
                                                if (socket != null) {
                                                    defpackage.apjx.h(socket);
                                                }
                                                defpackage.apjx.h(socket4);
                                            }
                                            throw th;
                                        }
                                    } catch (java.io.IOException e4) {
                                        e = e4;
                                        r8 = 0;
                                        r13 = r8;
                                        z2 = z;
                                        defpackage.apis apisVar9 = this.k.c;
                                        apjpVar = this.a;
                                        apisVar9.c(apjpVar.c, apjpVar.b);
                                        if (apjpVar == null) {
                                            defpackage.aooh.i("route");
                                        }
                                        apkyVar = new defpackage.apky(this, r13, e);
                                        this.k.p.remove(this);
                                        if (!z2) {
                                            socket2 = this.c;
                                            if (socket2 != null) {
                                                defpackage.apjx.h(socket2);
                                            }
                                            defpackage.apjx.h(socket4);
                                        }
                                        return apkyVar;
                                    }
                                }
                                z = false;
                                defpackage.apks apksVar4 = this.k;
                                defpackage.apis apisVar10 = apksVar4.c;
                                inetSocketAddress = apjpVar5.c;
                                proxy = apjpVar5.b;
                                if (inetSocketAddress == null) {
                                    defpackage.aooh.i("inetSocketAddress");
                                }
                                if (proxy == null) {
                                    defpackage.aooh.i("proxy");
                                }
                                try {
                                    try {
                                        obj = null;
                                        try {
                                            apkyVar = new defpackage.apky(this, null, null);
                                            apksVar4.p.remove(this);
                                        } catch (java.io.IOException e5) {
                                            e = e5;
                                            r13 = obj;
                                            z2 = z3;
                                            defpackage.apis apisVar11 = this.k.c;
                                            apjpVar = this.a;
                                            apisVar11.c(apjpVar.c, apjpVar.b);
                                            if (apjpVar == null) {
                                                defpackage.aooh.i("route");
                                            }
                                            apkyVar = new defpackage.apky(this, r13, e);
                                            this.k.p.remove(this);
                                            if (!z2) {
                                                socket2 = this.c;
                                                if (socket2 != null) {
                                                    defpackage.apjx.h(socket2);
                                                }
                                                defpackage.apjx.h(socket4);
                                            }
                                        }
                                    } catch (java.lang.Throwable th9) {
                                        th = th9;
                                        z2 = z3;
                                        this.k.p.remove(this);
                                        if (!z2) {
                                            socket = this.c;
                                            if (socket != null) {
                                                defpackage.apjx.h(socket);
                                            }
                                            defpackage.apjx.h(socket4);
                                        }
                                        throw th;
                                    }
                                } catch (java.io.IOException e6) {
                                    e = e6;
                                    obj = null;
                                }
                            } catch (java.io.IOException e7) {
                                e = e7;
                                r8 = 0;
                                z = false;
                            }
                        } catch (java.lang.Throwable th10) {
                            th = th10;
                            z = false;
                        }
                    } else {
                        this.k.p.remove(this);
                        socket2 = this.c;
                        if (socket2 != null) {
                            defpackage.apjx.h(socket2);
                        }
                        defpackage.apjx.h(socket4);
                    }
                } catch (java.io.IOException e8) {
                    e = e8;
                    z = false;
                    r8 = 0;
                    r13 = r8;
                    z2 = z;
                    defpackage.apis apisVar12 = this.k.c;
                    apjpVar = this.a;
                    apisVar12.c(apjpVar.c, apjpVar.b);
                    if (apjpVar == null) {
                        defpackage.aooh.i("route");
                    }
                    apkyVar = new defpackage.apky(this, r13, e);
                    this.k.p.remove(this);
                    if (!z2) {
                        socket2 = this.c;
                        if (socket2 != null) {
                            defpackage.apjx.h(socket2);
                        }
                        defpackage.apjx.h(socket4);
                    }
                    return apkyVar;
                }
            } catch (java.lang.Throwable th11) {
                th = th11;
                z = false;
            }
        } catch (java.io.IOException e9) {
            e = e9;
            z = false;
            r8 = 0;
        }
        return apkyVar;
    }

    @Override // defpackage.apkz
    public final defpackage.apkz e() {
        return new defpackage.apkg(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.a, this.b, this.m, this.n, this.o, this.p);
    }

    @Override // defpackage.apkz, defpackage.aplo
    public final void f() {
        this.q = true;
        java.net.Socket socket = this.r;
        if (socket != null) {
            defpackage.apjx.h(socket);
        }
    }

    @Override // defpackage.apkz
    public final boolean i() {
        return this.t != null;
    }

    @Override // defpackage.aplo
    public final void g() {
    }

    @Override // defpackage.aplo
    public final void h(defpackage.apks apksVar, java.io.IOException iOException) {
    }
}
