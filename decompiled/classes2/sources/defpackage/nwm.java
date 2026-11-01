package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class nwm extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    java.lang.Object f;
    java.lang.Object g;
    int h;
    final /* synthetic */ zrx i;
    final /* synthetic */ nwn j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwm(zrx zrxVar, nwn nwnVar, aoln aolnVar) {
        super(2, aolnVar);
        this.i = zrxVar;
        this.j = nwnVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [aoln, nwm] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v3 */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        ?? r10;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        ?? r11;
        java.lang.Object obj8;
        java.lang.Object obj9;
        java.lang.Object obj10;
        aolu aoluVar = aolu.a;
        int i = this.h;
        try {
            if (i != 0) {
                if (i != 1) {
                    java.lang.Object obj11 = this.a;
                    aooc.af(obj);
                    r10 = obj11;
                    obj10 = obj;
                    ajsz.ak((java.io.Closeable) r10, (java.lang.Throwable) null);
                    return obj10;
                }
                obj5 = this.g;
                obj4 = this.f;
                obj8 = this.e;
                obj3 = this.d;
                obj9 = this.c;
                obj7 = this.b;
                java.lang.Object obj12 = this.a;
                aooc.af(obj);
                r11 = obj12;
                obj6 = obj;
                aooh.e(obj6, "await(...)");
                ((uzx) obj5).ac((defpackage.lvm) obj6);
                ((uzx) obj4).X(((uzx) obj8).ab());
                ((zoe) obj3).d(((uzx) obj9).T());
                zrx zrxVarA = ((zoe) obj7).a();
                ajsz.ak((java.io.Closeable) r11, (java.lang.Throwable) null);
                return zrxVarA;
            }
            aooc.af(obj);
            zrx zrxVar = this.i;
            nwn nwnVar = this.j;
            ahoq ahoqVarW = ahvr.W(384, "CallingAccountSelector_runWithUi");
            try {
                java.lang.String scheme = android.net.Uri.parse(zrxVar.e).getScheme();
                if (!aooh.n(scheme, "voicemail")) {
                    if (aooh.n(scheme, "tel")) {
                        this.a = ahoqVarW;
                        this.h = 2;
                        java.lang.Object objD = nwnVar.d(zrxVar, (aoln) this);
                        if (objD == aoluVar) {
                            return aoluVar;
                        }
                        obj2 = objD;
                    } else {
                        nwn.a.c().m(aioa.b).l("com/android/dialer/dualsim/impl/CallingAccountLoaderPrecallIntegration", "runWithoutUi$<anonymous>$<anonymous>", 94, "CallingAccountLoaderPrecallIntegration.kt").y("unable to process scheme %s", scheme);
                        obj2 = zrxVar;
                    }
                    r10 = ahoqVarW;
                    obj10 = obj2;
                    ajsz.ak((java.io.Closeable) r10, (java.lang.Throwable) null);
                    return obj10;
                }
                nwnVar.c.n(rmw.fZ);
                zoe zoeVarCi = aehj.ci(zrxVar.p());
                uzx uzxVarCu = aehj.cu(zoeVarCi.b().p());
                uzx uzxVarCv = aehj.cv(zsc.a.m());
                suf sufVar = nwnVar.d;
                ajcq ajcqVarH = ahvr.H(sufVar.e.b(), new rht(11), sufVar.c);
                this.a = ahoqVarW;
                this.b = zoeVarCi;
                this.c = uzxVarCu;
                this.d = zoeVarCi;
                this.e = uzxVarCv;
                this.f = uzxVarCu;
                this.g = uzxVarCv;
                this.h = 1;
                java.lang.Object objD2 = aosv.D(ajcqVarH, (aoln) this);
                if (objD2 == aoluVar) {
                    return aoluVar;
                }
                obj3 = zoeVarCi;
                obj4 = uzxVarCu;
                obj5 = uzxVarCv;
                obj6 = objD2;
                obj7 = obj3;
                r11 = ahoqVarW;
                obj8 = obj5;
                obj9 = obj4;
                aooh.e(obj6, "await(...)");
                ((uzx) obj5).ac((defpackage.lvm) obj6);
                ((uzx) obj4).X(((uzx) obj8).ab());
                ((zoe) obj3).d(((uzx) obj9).T());
                zrx zrxVarA2 = ((zoe) obj7).a();
                ajsz.ak((java.io.Closeable) r11, (java.lang.Throwable) null);
                return zrxVarA2;
            } catch (java.lang.Throwable th) {
                th = th;
                this = ahoqVarW;
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak((java.io.Closeable) this, th);
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.nwm(this.i, this.j, aolnVar);
    }
}
