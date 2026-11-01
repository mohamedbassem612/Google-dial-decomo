package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ufj implements afig {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ ufj(java.lang.Object obj, alad aladVar, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = aladVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v43, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object a(adag adagVar) {
        nzc nzcVarB;
        boolean zF = false;
        switch (this.$cid) {
            case 0:
                return java.lang.Boolean.valueOf(ufo.f(adagVar, (java.lang.String) this.a, (defpackage.ufu) this.b));
            case 1:
                aimz aimzVar = nzg.a;
                android.database.Cursor cursorY = adagVar.y((adag) this.a);
                java.lang.Object obj = this.b;
                try {
                    if (cursorY.moveToFirst()) {
                        nzcVarB = alad.B(nzc.a, cursorY.getBlob(cursorY.getColumnIndexOrThrow("eligibility_details")), akzq.a());
                    } else {
                        akzx akzxVarM = nzc.a.m();
                        java.lang.String str = ((hkd) obj).c;
                        akzxVarM.u();
                        nzc nzcVar = akzxVarM.b;
                        j$.util.Objects.requireNonNull(str);
                        nzcVar.b |= 1;
                        nzcVar.c = str;
                        akzxVarM.u();
                        nzc nzcVar2 = akzxVarM.b;
                        nzcVar2.b |= 2;
                        nzcVar2.d = false;
                        akzxVarM.u();
                        nzc nzcVar3 = akzxVarM.b;
                        nzcVar3.f = 1000;
                        nzcVar3.b |= 8;
                        akzxVarM.u();
                        nzc nzcVar4 = akzxVarM.b;
                        nzcVar4.b |= 4;
                        nzcVar4.e = false;
                        akzxVarM.u();
                        nzc nzcVar5 = akzxVarM.b;
                        nzcVar5.g = 1000;
                        nzcVar5.b |= 16;
                        nzcVarB = (nzc) akzxVarM.p();
                    }
                    nzc nzcVar6 = nzcVarB;
                    if (cursorY == null) {
                        return nzcVar6;
                    }
                    cursorY.close();
                    return nzcVar6;
                } catch (java.lang.Throwable th) {
                    if (cursorY != null) {
                        try {
                            cursorY.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        break;
                    }
                    throw th;
                }
            case 2:
                ?? r0 = this.a;
                if (r0.length() != 0) {
                    java.lang.Object obj2 = this.b;
                    akzx akzxVarP = ((defpackage.ufu) j$.util.Map.-EL.getOrDefault(ufo.e(adagVar, ajsz.aY((java.lang.Object) r0)), (java.lang.Object) r0, obj2)).p();
                    akzxVarP.z((alad) obj2);
                    defpackage.ufu ufuVar = (defpackage.ufu) akzxVarP.p();
                    aooh.c(ufuVar);
                    zF = ufo.f(adagVar, (java.lang.String) r0, ufuVar);
                }
                return java.lang.Boolean.valueOf(zF);
            case 3:
                int i = defpackage.usl.b;
                defpackage.afih afihVarZ = adagVar.z((adag) this.b);
                ?? r7 = this.a;
                for (int i2 = 0; i2 < r7.size(); i2++) {
                    try {
                        int i3 = i2 << 1;
                        afihVarZ.b(i3 + 1, ((defpackage.ury) r7.get(i2)).c);
                        afihVarZ.a(i3 + 2, ((defpackage.ury) r7.get(i2)).i());
                    } catch (java.lang.Throwable th3) {
                        try {
                            afihVarZ.close();
                            break;
                        } catch (java.lang.Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                afihVarZ.d();
                afihVarZ.close();
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int i4 = defpackage.usl.b;
                defpackage.afih afihVarZ2 = adagVar.z((adag) this.a);
                java.lang.Object obj3 = this.b;
                try {
                    alcf alcfVar = ((defpackage.uru) obj3).c;
                    if (alcfVar == null) {
                        alcfVar = alcf.a;
                    }
                    long jB = aldi.b(alcfVar);
                    afihVarZ2.c(1);
                    afihVarZ2.a.bindLong(1, jB);
                    afihVarZ2.b.put(1, 1);
                    afihVarZ2.a(2, ((akym) obj3).i());
                    afihVarZ2.d();
                    afihVarZ2.close();
                    return null;
                } catch (java.lang.Throwable th5) {
                    try {
                        afihVarZ2.close();
                        break;
                    } catch (java.lang.Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aify aifyVarI = wqr.i(adagVar, (aify) this.a);
                wqr.f(aifyVarI);
                aike aikeVarH = wqr.h(aifyVarI);
                int i5 = aikeVarH.d;
                for (int i6 = 0; i6 < i5; i6++) {
                    wqr.k(adagVar, (defpackage.wqp) aikeVarH.get(i6));
                }
                return java.lang.Integer.valueOf(i5);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aike aikeVarL = wqr.l(adagVar, (adag) this.a);
                wqr.f(aikeVarL);
                aike aikeVarH2 = wqr.h(aikeVarL);
                int i7 = aikeVarH2.d;
                for (int i8 = 0; i8 < i7; i8++) {
                    wqr.k(adagVar, (defpackage.wqp) aikeVarH2.get(i8));
                }
                return java.lang.Integer.valueOf(aikeVarL.d);
            default:
                ache acheVar = (ache) this.b;
                java.lang.String str2 = acheVar.c;
                java.lang.String str3 = acheVar.b;
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(adagVar.j(str3, "account = ?", new java.lang.String[]{str2}));
                for (java.util.Map.Entry entry : this.a.entrySet()) {
                    android.content.ContentValues contentValues = new android.content.ContentValues(3);
                    contentValues.put("account", str2);
                    contentValues.put("key", (java.lang.String) entry.getKey());
                    contentValues.put("value", ((albh) entry.getValue()).i());
                    if (adagVar.k(str3, contentValues, 5) == -1) {
                        throw new android.database.SQLException("Failed to clearAndPutAll() to DB.");
                    }
                }
                return numValueOf;
        }
    }

    public /* synthetic */ ufj(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
