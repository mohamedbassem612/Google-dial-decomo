package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apmt implements defpackage.aplp {
    public static final java.util.List a = defpackage.apjx.f(new java.lang.String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final java.util.List b = defpackage.apjx.f(new java.lang.String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    private final defpackage.aplo c;
    private final defpackage.aplr d;
    private final defpackage.apms e;
    private volatile defpackage.apmz f;
    private final defpackage.apjf g;
    private volatile boolean h;

    public apmt(defpackage.apje apjeVar, defpackage.aplo aploVar, defpackage.aplr aplrVar, defpackage.apms apmsVar) {
        this.c = aploVar;
        this.d = aplrVar;
        this.e = apmsVar;
        java.util.List list = apjeVar.r;
        defpackage.apjf apjfVar = defpackage.apjf.H2_PRIOR_KNOWLEDGE;
        this.g = list.contains(apjfVar) ? apjfVar : defpackage.apjf.HTTP_2;
    }

    @Override // defpackage.aplp
    public final long a(defpackage.apjm apjmVar) {
        if (defpackage.aplq.b(apjmVar)) {
            return defpackage.apjx.a(apjmVar);
        }
        return 0L;
    }

    @Override // defpackage.aplp
    public final defpackage.apjl b(boolean z) throws java.io.IOException {
        int i;
        defpackage.apiu apiuVar;
        defpackage.apmz apmzVar = this.f;
        if (apmzVar == null) {
            throw new java.io.IOException("stream wasn't created");
        }
        synchronized (apmzVar) {
            while (true) {
                if (!apmzVar.f.isEmpty() || apmzVar.c() != null) {
                    break;
                }
                i = (z || apmzVar.l()) ? 1 : 0;
                if (i != 0) {
                    apmzVar.i.d();
                }
                try {
                    apmzVar.k();
                    if (i != 0) {
                        apmzVar.i.b();
                    }
                } catch (java.lang.Throwable th) {
                    if (i != 0) {
                        apmzVar.i.b();
                    }
                    throw th;
                }
            }
            java.util.ArrayDeque arrayDeque = apmzVar.f;
            if (arrayDeque.isEmpty()) {
                java.io.IOException iOException = apmzVar.k;
                if (iOException != null) {
                    throw iOException;
                }
                defpackage.apme apmeVarC = apmzVar.c();
                if (apmeVarC == null) {
                    defpackage.aooh.g();
                }
                throw new apng(apmeVarC);
            }
            java.lang.Object objRemoveFirst = arrayDeque.removeFirst();
            defpackage.aooh.e(objRemoveFirst, "removeFirst(...)");
            apiuVar = (defpackage.apiu) objRemoveFirst;
        }
        defpackage.apjf apjfVar = this.g;
        if (apiuVar == null) {
            defpackage.aooh.i("headerBlock");
        }
        defpackage.zzx zzxVar = new defpackage.zzx((byte[]) null, (short[]) null);
        int iA = apiuVar.a();
        defpackage.aplu apluVarBb = null;
        for (i = 0; i < iA; i++) {
            java.lang.String strBe = defpackage.aoov.be(apiuVar, i);
            java.lang.String strBf = defpackage.aoov.bf(apiuVar, i);
            if (defpackage.aooh.n(strBe, ":status")) {
                apluVarBb = defpackage.aoov.bb("HTTP/1.1 ".concat(strBf));
            } else if (!b.contains(strBe)) {
                zzxVar.S(strBe, strBf);
            }
        }
        if (apluVarBb == null) {
            throw new java.net.ProtocolException("Expected ':status' header not present");
        }
        defpackage.apjl apjlVar = new defpackage.apjl();
        apjlVar.a = apjfVar;
        apjlVar.b = apluVarBb.b;
        apjlVar.c(apluVarBb.c);
        apjlVar.b(defpackage.aoov.bl(zzxVar));
        if (z && apjlVar.b == 100) {
            return null;
        }
        return apjlVar;
    }

    @Override // defpackage.aplp
    public final defpackage.aplo c() {
        return this.c;
    }

    @Override // defpackage.aplp
    public final defpackage.apqb d(defpackage.apjh apjhVar, long j) {
        defpackage.aooh.f(apjhVar, "request");
        defpackage.apmz apmzVar = this.f;
        defpackage.aooh.c(apmzVar);
        return apmzVar.h;
    }

    @Override // defpackage.aplp
    public final defpackage.apqc e() {
        defpackage.apmz apmzVar = this.f;
        defpackage.aooh.c(apmzVar);
        return apmzVar;
    }

    @Override // defpackage.aplp
    public final defpackage.apqd f(defpackage.apjm apjmVar) {
        defpackage.apmz apmzVar = this.f;
        if (apmzVar == null) {
            defpackage.aooh.g();
        }
        return apmzVar.g;
    }

    @Override // defpackage.aplp
    public final void g() {
        this.h = true;
        defpackage.apmz apmzVar = this.f;
        if (apmzVar != null) {
            apmzVar.h(defpackage.apme.CANCEL);
        }
    }

    @Override // defpackage.aplp
    public final void h() {
        defpackage.apmz apmzVar = this.f;
        if (apmzVar == null) {
            defpackage.aooh.g();
        }
        apmzVar.h.close();
    }

    @Override // defpackage.aplp
    public final void i() {
        this.e.e();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01de A[Catch: all -> 0x02a5, TryCatch #1 {, blocks: (B:48:0x00f8, B:50:0x00fc, B:52:0x0102, B:54:0x010c, B:55:0x010f, B:56:0x011b, B:58:0x0122, B:60:0x013e, B:64:0x014d, B:75:0x0177, B:77:0x0180, B:79:0x0188, B:80:0x018b, B:82:0x0193, B:84:0x0199, B:85:0x019c, B:87:0x01a4, B:90:0x01b1, B:91:0x01bb, B:95:0x01c2, B:106:0x0204, B:98:0x01ce, B:100:0x01de, B:102:0x01e6, B:104:0x01ee, B:105:0x01f8, B:67:0x015d, B:69:0x0167, B:107:0x020b, B:112:0x0224, B:113:0x0226, B:115:0x0233, B:118:0x023a, B:122:0x024c, B:141:0x029d, B:142:0x02a4), top: B:156:0x00f8, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01f8 A[Catch: all -> 0x02a5, TryCatch #1 {, blocks: (B:48:0x00f8, B:50:0x00fc, B:52:0x0102, B:54:0x010c, B:55:0x010f, B:56:0x011b, B:58:0x0122, B:60:0x013e, B:64:0x014d, B:75:0x0177, B:77:0x0180, B:79:0x0188, B:80:0x018b, B:82:0x0193, B:84:0x0199, B:85:0x019c, B:87:0x01a4, B:90:0x01b1, B:91:0x01bb, B:95:0x01c2, B:106:0x0204, B:98:0x01ce, B:100:0x01de, B:102:0x01e6, B:104:0x01ee, B:105:0x01f8, B:67:0x015d, B:69:0x0167, B:107:0x020b, B:112:0x0224, B:113:0x0226, B:115:0x0233, B:118:0x023a, B:122:0x024c, B:141:0x029d, B:142:0x02a4), top: B:156:0x00f8, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0177 A[Catch: all -> 0x02a5, TryCatch #1 {, blocks: (B:48:0x00f8, B:50:0x00fc, B:52:0x0102, B:54:0x010c, B:55:0x010f, B:56:0x011b, B:58:0x0122, B:60:0x013e, B:64:0x014d, B:75:0x0177, B:77:0x0180, B:79:0x0188, B:80:0x018b, B:82:0x0193, B:84:0x0199, B:85:0x019c, B:87:0x01a4, B:90:0x01b1, B:91:0x01bb, B:95:0x01c2, B:106:0x0204, B:98:0x01ce, B:100:0x01de, B:102:0x01e6, B:104:0x01ee, B:105:0x01f8, B:67:0x015d, B:69:0x0167, B:107:0x020b, B:112:0x0224, B:113:0x0226, B:115:0x0233, B:118:0x023a, B:122:0x024c, B:141:0x029d, B:142:0x02a4), top: B:156:0x00f8, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0180 A[Catch: all -> 0x02a5, TryCatch #1 {, blocks: (B:48:0x00f8, B:50:0x00fc, B:52:0x0102, B:54:0x010c, B:55:0x010f, B:56:0x011b, B:58:0x0122, B:60:0x013e, B:64:0x014d, B:75:0x0177, B:77:0x0180, B:79:0x0188, B:80:0x018b, B:82:0x0193, B:84:0x0199, B:85:0x019c, B:87:0x01a4, B:90:0x01b1, B:91:0x01bb, B:95:0x01c2, B:106:0x0204, B:98:0x01ce, B:100:0x01de, B:102:0x01e6, B:104:0x01ee, B:105:0x01f8, B:67:0x015d, B:69:0x0167, B:107:0x020b, B:112:0x0224, B:113:0x0226, B:115:0x0233, B:118:0x023a, B:122:0x024c, B:141:0x029d, B:142:0x02a4), top: B:156:0x00f8, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0188 A[Catch: all -> 0x02a5, TryCatch #1 {, blocks: (B:48:0x00f8, B:50:0x00fc, B:52:0x0102, B:54:0x010c, B:55:0x010f, B:56:0x011b, B:58:0x0122, B:60:0x013e, B:64:0x014d, B:75:0x0177, B:77:0x0180, B:79:0x0188, B:80:0x018b, B:82:0x0193, B:84:0x0199, B:85:0x019c, B:87:0x01a4, B:90:0x01b1, B:91:0x01bb, B:95:0x01c2, B:106:0x0204, B:98:0x01ce, B:100:0x01de, B:102:0x01e6, B:104:0x01ee, B:105:0x01f8, B:67:0x015d, B:69:0x0167, B:107:0x020b, B:112:0x0224, B:113:0x0226, B:115:0x0233, B:118:0x023a, B:122:0x024c, B:141:0x029d, B:142:0x02a4), top: B:156:0x00f8, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0193 A[Catch: all -> 0x02a5, TryCatch #1 {, blocks: (B:48:0x00f8, B:50:0x00fc, B:52:0x0102, B:54:0x010c, B:55:0x010f, B:56:0x011b, B:58:0x0122, B:60:0x013e, B:64:0x014d, B:75:0x0177, B:77:0x0180, B:79:0x0188, B:80:0x018b, B:82:0x0193, B:84:0x0199, B:85:0x019c, B:87:0x01a4, B:90:0x01b1, B:91:0x01bb, B:95:0x01c2, B:106:0x0204, B:98:0x01ce, B:100:0x01de, B:102:0x01e6, B:104:0x01ee, B:105:0x01f8, B:67:0x015d, B:69:0x0167, B:107:0x020b, B:112:0x0224, B:113:0x0226, B:115:0x0233, B:118:0x023a, B:122:0x024c, B:141:0x029d, B:142:0x02a4), top: B:156:0x00f8, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0199 A[Catch: all -> 0x02a5, TryCatch #1 {, blocks: (B:48:0x00f8, B:50:0x00fc, B:52:0x0102, B:54:0x010c, B:55:0x010f, B:56:0x011b, B:58:0x0122, B:60:0x013e, B:64:0x014d, B:75:0x0177, B:77:0x0180, B:79:0x0188, B:80:0x018b, B:82:0x0193, B:84:0x0199, B:85:0x019c, B:87:0x01a4, B:90:0x01b1, B:91:0x01bb, B:95:0x01c2, B:106:0x0204, B:98:0x01ce, B:100:0x01de, B:102:0x01e6, B:104:0x01ee, B:105:0x01f8, B:67:0x015d, B:69:0x0167, B:107:0x020b, B:112:0x0224, B:113:0x0226, B:115:0x0233, B:118:0x023a, B:122:0x024c, B:141:0x029d, B:142:0x02a4), top: B:156:0x00f8, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b1 A[Catch: all -> 0x02a5, TryCatch #1 {, blocks: (B:48:0x00f8, B:50:0x00fc, B:52:0x0102, B:54:0x010c, B:55:0x010f, B:56:0x011b, B:58:0x0122, B:60:0x013e, B:64:0x014d, B:75:0x0177, B:77:0x0180, B:79:0x0188, B:80:0x018b, B:82:0x0193, B:84:0x0199, B:85:0x019c, B:87:0x01a4, B:90:0x01b1, B:91:0x01bb, B:95:0x01c2, B:106:0x0204, B:98:0x01ce, B:100:0x01de, B:102:0x01e6, B:104:0x01ee, B:105:0x01f8, B:67:0x015d, B:69:0x0167, B:107:0x020b, B:112:0x0224, B:113:0x0226, B:115:0x0233, B:118:0x023a, B:122:0x024c, B:141:0x029d, B:142:0x02a4), top: B:156:0x00f8, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01c2 A[Catch: all -> 0x02a5, TryCatch #1 {, blocks: (B:48:0x00f8, B:50:0x00fc, B:52:0x0102, B:54:0x010c, B:55:0x010f, B:56:0x011b, B:58:0x0122, B:60:0x013e, B:64:0x014d, B:75:0x0177, B:77:0x0180, B:79:0x0188, B:80:0x018b, B:82:0x0193, B:84:0x0199, B:85:0x019c, B:87:0x01a4, B:90:0x01b1, B:91:0x01bb, B:95:0x01c2, B:106:0x0204, B:98:0x01ce, B:100:0x01de, B:102:0x01e6, B:104:0x01ee, B:105:0x01f8, B:67:0x015d, B:69:0x0167, B:107:0x020b, B:112:0x0224, B:113:0x0226, B:115:0x0233, B:118:0x023a, B:122:0x024c, B:141:0x029d, B:142:0x02a4), top: B:156:0x00f8, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ce A[Catch: all -> 0x02a5, TryCatch #1 {, blocks: (B:48:0x00f8, B:50:0x00fc, B:52:0x0102, B:54:0x010c, B:55:0x010f, B:56:0x011b, B:58:0x0122, B:60:0x013e, B:64:0x014d, B:75:0x0177, B:77:0x0180, B:79:0x0188, B:80:0x018b, B:82:0x0193, B:84:0x0199, B:85:0x019c, B:87:0x01a4, B:90:0x01b1, B:91:0x01bb, B:95:0x01c2, B:106:0x0204, B:98:0x01ce, B:100:0x01de, B:102:0x01e6, B:104:0x01ee, B:105:0x01f8, B:67:0x015d, B:69:0x0167, B:107:0x020b, B:112:0x0224, B:113:0x0226, B:115:0x0233, B:118:0x023a, B:122:0x024c, B:141:0x029d, B:142:0x02a4), top: B:156:0x00f8, outer: #0 }] */
    @Override // defpackage.aplp
    public final void j(defpackage.apjh apjhVar) throws java.io.IOException {
        int i;
        defpackage.apmz apmzVar;
        boolean z;
        defpackage.apna apnaVar;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int length;
        int i7;
        defpackage.apmg apmgVar;
        defpackage.apmg apmgVar2;
        if (apjhVar == null) {
            defpackage.aooh.i("request");
        }
        if (this.f == null) {
            int i8 = 0;
            boolean z4 = apjhVar.d != null;
            if (apjhVar == null) {
                defpackage.aooh.i("request");
            }
            defpackage.apiu apiuVar = apjhVar.c;
            java.util.ArrayList arrayList = new java.util.ArrayList(apiuVar.a() + 4);
            arrayList.add(new defpackage.apmg(defpackage.apmg.c, apjhVar.b));
            defpackage.apiw apiwVar = apjhVar.a;
            arrayList.add(new defpackage.apmg(defpackage.apmg.d, defpackage.aoov.bc(apiwVar)));
            java.lang.String strA = apjhVar.a("Host");
            if (strA != null) {
                arrayList.add(new defpackage.apmg(defpackage.apmg.f, strA));
            }
            arrayList.add(new defpackage.apmg(defpackage.apmg.e, apiwVar.a));
            int iA = apiuVar.a();
            for (int i9 = 0; i9 < iA; i9++) {
                java.lang.String strBe = defpackage.aoov.be(apiuVar, i9);
                java.util.Locale locale = java.util.Locale.US;
                defpackage.aooh.e(locale, "US");
                java.lang.String lowerCase = strBe.toLowerCase(locale);
                defpackage.aooh.e(lowerCase, "toLowerCase(...)");
                if (!a.contains(lowerCase) || (defpackage.aooh.n(lowerCase, "te") && defpackage.aooh.n(defpackage.aoov.bf(apiuVar, i9), "trailers"))) {
                    arrayList.add(new defpackage.apmg(lowerCase, defpackage.aoov.bf(apiuVar, i9)));
                }
            }
            defpackage.apms apmsVar = this.e;
            boolean z5 = !z4;
            synchronized (apmsVar.u) {
                synchronized (apmsVar) {
                    if (apmsVar.f > 1073741823) {
                        apmsVar.f(defpackage.apme.REFUSED_STREAM);
                    }
                    if (apmsVar.g) {
                        throw new apmd();
                    }
                    i = apmsVar.f;
                    apmsVar.f = i + 2;
                    apmzVar = new defpackage.apmz(i, apmsVar, z5, false, null);
                    z = !z4 || apmsVar.s >= apmsVar.t || apmzVar.d >= apmzVar.e;
                    if (apmzVar.n()) {
                        apmsVar.c.put(java.lang.Integer.valueOf(i), apmzVar);
                    }
                }
                apnaVar = apmsVar.u;
                synchronized (apnaVar) {
                    if (apnaVar.e) {
                        throw new java.io.IOException("closed");
                    }
                    defpackage.apmi apmiVar = apnaVar.f;
                    if (apmiVar.c) {
                        int i10 = apmiVar.b;
                        if (i10 < apmiVar.d) {
                            apmiVar.d(i10, 31, 32);
                        }
                        apmiVar.c = false;
                        apmiVar.b = Integer.MAX_VALUE;
                        apmiVar.d(apmiVar.d, 31, 32);
                    }
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        defpackage.apmg apmgVar3 = (defpackage.apmg) arrayList.get(i11);
                        defpackage.appb appbVarK = apmgVar3.g.k();
                        defpackage.appb appbVar = apmgVar3.h;
                        defpackage.apmg[] apmgVarArr = defpackage.apmj.a;
                        java.lang.Integer num = (java.lang.Integer) defpackage.apmj.b.get(appbVarK);
                        if (num != null) {
                            int iIntValue = num.intValue();
                            i3 = iIntValue + 1;
                            z3 = z4;
                            if (i3 >= 2 && i3 < 8) {
                                defpackage.apmg[] apmgVarArr2 = defpackage.apmj.a;
                                if (defpackage.aooh.n(apmgVarArr2[iIntValue].h, appbVar)) {
                                    i2 = i3;
                                } else if (defpackage.aooh.n(apmgVarArr2[i3].h, appbVar)) {
                                    i3 = iIntValue + 2;
                                    i2 = i3;
                                }
                                i4 = -1;
                                if (i3 == -1) {
                                    i6 = apmiVar.f + 1;
                                    length = apmiVar.e.length;
                                    while (true) {
                                        if (i6 >= length) {
                                            i3 = -1;
                                            break;
                                        }
                                        i7 = i6;
                                        apmgVar = apmiVar.e[i7];
                                        if (apmgVar == null) {
                                            defpackage.aooh.g();
                                        }
                                        if (!defpackage.aooh.n(apmgVar.g, appbVarK)) {
                                            apmgVar2 = apmiVar.e[i7];
                                            if (apmgVar2 == null) {
                                                defpackage.aooh.g();
                                            }
                                            if (defpackage.aooh.n(apmgVar2.h, appbVar)) {
                                                int i12 = i7 - apmiVar.f;
                                                int length2 = defpackage.apmj.a.length;
                                                i3 = i12 + 61;
                                                break;
                                            } else if (i2 == -1) {
                                                int i13 = i7 - apmiVar.f;
                                                int length3 = defpackage.apmj.a.length;
                                                i2 = i13 + 61;
                                            }
                                        }
                                        i6 = i7 + 1;
                                    }
                                    i4 = -1;
                                }
                                if (i3 != i4) {
                                    apmiVar.d(i3, 127, 128);
                                } else {
                                    if (i2 == i4) {
                                        apmiVar.a.N(64);
                                        apmiVar.c(appbVarK);
                                        apmiVar.c(appbVar);
                                        apmiVar.b(apmgVar3);
                                    } else if (appbVarK.m(defpackage.apmg.a) || defpackage.aooh.n(defpackage.apmg.f, appbVarK)) {
                                        i5 = 0;
                                        apmiVar.d(i2, 63, 64);
                                        apmiVar.c(appbVar);
                                        apmiVar.b(apmgVar3);
                                    } else {
                                        i5 = 0;
                                        apmiVar.d(i2, 15, 0);
                                        apmiVar.c(appbVar);
                                    }
                                    i11++;
                                    i8 = i5;
                                    z4 = z3;
                                }
                                i5 = 0;
                                i11++;
                                i8 = i5;
                                z4 = z3;
                            }
                            i2 = i3;
                        } else {
                            z3 = z4;
                            i2 = -1;
                        }
                        i3 = -1;
                        i4 = -1;
                        if (i3 == -1) {
                            i6 = apmiVar.f + 1;
                            length = apmiVar.e.length;
                            while (true) {
                                if (i6 >= length) {
                                    i3 = -1;
                                    break;
                                }
                                i7 = i6;
                                apmgVar = apmiVar.e[i7];
                                if (apmgVar == null) {
                                    defpackage.aooh.g();
                                }
                                if (!defpackage.aooh.n(apmgVar.g, appbVarK)) {
                                    apmgVar2 = apmiVar.e[i7];
                                    if (apmgVar2 == null) {
                                        defpackage.aooh.g();
                                    }
                                    if (defpackage.aooh.n(apmgVar2.h, appbVar)) {
                                        int i14 = i7 - apmiVar.f;
                                        int length4 = defpackage.apmj.a.length;
                                        i3 = i14 + 61;
                                        break;
                                    } else if (i2 == -1) {
                                        int i15 = i7 - apmiVar.f;
                                        int length5 = defpackage.apmj.a.length;
                                        i2 = i15 + 61;
                                    }
                                }
                                i6 = i7 + 1;
                            }
                            i4 = -1;
                        }
                        if (i3 != i4) {
                            apmiVar.d(i3, 127, 128);
                        } else {
                            if (i2 == i4) {
                                apmiVar.a.N(64);
                                apmiVar.c(appbVarK);
                                apmiVar.c(appbVar);
                                apmiVar.b(apmgVar3);
                            } else if (appbVarK.m(defpackage.apmg.a)) {
                                i5 = 0;
                                apmiVar.d(i2, 63, 64);
                                apmiVar.c(appbVar);
                                apmiVar.b(apmgVar3);
                            } else {
                                i5 = 0;
                                apmiVar.d(i2, 63, 64);
                                apmiVar.c(appbVar);
                                apmiVar.b(apmgVar3);
                            }
                            i11++;
                            i8 = i5;
                            z4 = z3;
                        }
                        i5 = 0;
                        i11++;
                        i8 = i5;
                        z4 = z3;
                    }
                    boolean z6 = z4;
                    int i16 = i8;
                    defpackage.apoy apoyVar = apnaVar.c;
                    long j = apoyVar.b;
                    long jMin = java.lang.Math.min(apnaVar.d, j);
                    int i17 = j == jMin ? 4 : i16;
                    if (!z6) {
                        i17 |= 1;
                    }
                    apnaVar.c(i, (int) jMin, 1, i17);
                    defpackage.apoz apozVar = apnaVar.b;
                    apozVar.fQ(apoyVar, jMin);
                    if (j > jMin) {
                        long j2 = j - jMin;
                        while (j2 > 0) {
                            boolean z7 = z;
                            long jMin2 = java.lang.Math.min(apnaVar.d, j2);
                            j2 -= jMin2;
                            apnaVar.c(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                            apozVar.fQ(apoyVar, jMin2);
                            z = z7;
                        }
                    }
                    z2 = z;
                }
            }
            if (z2) {
                apnaVar.b();
            }
            this.f = apmzVar;
            boolean z8 = this.h;
            defpackage.apmz apmzVar2 = this.f;
            if (z8) {
                if (apmzVar2 == null) {
                    defpackage.aooh.g();
                }
                apmzVar2.h(defpackage.apme.CANCEL);
                throw new java.io.IOException("Canceled");
            }
            if (apmzVar2 == null) {
                defpackage.aooh.g();
            }
            defpackage.aplr aplrVar = this.d;
            apmzVar2.i.f(aplrVar.e, java.util.concurrent.TimeUnit.MILLISECONDS);
            defpackage.apmz apmzVar3 = this.f;
            if (apmzVar3 == null) {
                defpackage.aooh.g();
            }
            apmzVar3.j.f(aplrVar.f, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.aplp
    public final boolean k() {
        boolean z;
        defpackage.apmz apmzVar = this.f;
        if (apmzVar == null) {
            return false;
        }
        synchronized (apmzVar) {
            defpackage.apmx apmxVar = apmzVar.g;
            z = apmxVar.b && apmxVar.d.B();
        }
        return z;
    }
}
