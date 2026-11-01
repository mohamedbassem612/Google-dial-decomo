package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class nzd implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ nzd(ahzi ahziVar, android.content.pm.PackageManager packageManager, aihd aihdVar, int i, int i2) {
        this.$cid = i2;
        this.c = ahziVar;
        this.b = packageManager;
        this.d = aihdVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws java.io.IOException {
        int i;
        akzc akzcVarF;
        int i2 = this.$cid;
        if (i2 == 0) {
            ((defpackage.nze) this.b).a.m(ruc.by);
            long jLongValue = ((java.lang.Long) aiql.H((java.util.concurrent.Future) this.c)).longValue();
            defpackage.nzc nzcVar = (defpackage.nzc) aiql.H((java.util.concurrent.Future) this.d);
            if (this.a - 1 != 1) {
                akzx akzxVarM = defpackage.nzb.a.m();
                boolean z = nzcVar.e;
                akzxVarM.u();
                defpackage.nzb nzbVar = (defpackage.nzb) akzxVarM.b;
                nzbVar.b |= 1;
                nzbVar.c = z;
                int iAd = mni.ad(nzcVar.g);
                i = iAd != 0 ? iAd : 1;
                akzxVarM.u();
                defpackage.nzb nzbVar2 = (defpackage.nzb) akzxVarM.b;
                nzbVar2.d = i - 1;
                nzbVar2.b |= 2;
                akzxVarM.u();
                defpackage.nzb nzbVar3 = (defpackage.nzb) akzxVarM.b;
                nzbVar3.b |= 4;
                nzbVar3.e = jLongValue;
                return (defpackage.nzb) akzxVarM.p();
            }
            akzx akzxVarM2 = defpackage.nzb.a.m();
            boolean z2 = nzcVar.d;
            akzxVarM2.u();
            defpackage.nzb nzbVar4 = (defpackage.nzb) akzxVarM2.b;
            nzbVar4.b |= 1;
            nzbVar4.c = z2;
            int iAd2 = mni.ad(nzcVar.f);
            i = iAd2 != 0 ? iAd2 : 1;
            akzxVarM2.u();
            defpackage.nzb nzbVar5 = (defpackage.nzb) akzxVarM2.b;
            nzbVar5.d = i - 1;
            nzbVar5.b |= 2;
            akzxVarM2.u();
            defpackage.nzb nzbVar6 = (defpackage.nzb) akzxVarM2.b;
            nzbVar6.b |= 4;
            nzbVar6.e = jLongValue;
            return (defpackage.nzb) akzxVarM2.p();
        }
        if (i2 == 1) {
            java.lang.Object obj = this.c;
            int i3 = this.a;
            java.util.Map map = defpackage.gzl.a;
            java.lang.Object obj2 = (android.content.Context) ((java.lang.ref.WeakReference) this.d).get();
            java.lang.Object obj3 = this.b;
            if (obj2 == null) {
                obj2 = obj3;
            }
            return defpackage.gzl.b((android.content.Context) obj2, i3, (java.lang.String) obj);
        }
        if (i2 != 2) {
            return new akaq((android.content.pm.PackageManager) this.b, (aihd) this.d, (aaco) this.c.eZ()).a(this.a);
        }
        int i4 = this.a;
        java.lang.Object obj4 = this.b;
        java.lang.Object obj5 = this.c;
        java.lang.Object obj6 = this.d;
        if (i4 == 4) {
            defpackage.idk idkVar = new defpackage.idk(((utq) obj5).d);
            defpackage.idt idtVar = (defpackage.idt) obj4;
            return ((uvb) obj6).f.a(zif.a(akzc.F(idkVar), idkVar.b), idkVar.a, (idtVar.c == 3 ? (defpackage.ids) idtVar.d : defpackage.ids.a).c);
        }
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(((utq) obj5).d));
        try {
            if (i4 == 3) {
                defpackage.idn idnVarD = defpackage.hgu.d(new java.io.File(((utq) obj5).d));
                defpackage.idm idmVar = idnVarD.c;
                if (idmVar == null) {
                    idmVar = defpackage.idm.a;
                }
                int i5 = idmVar.c + 28;
                defpackage.idm idmVar2 = idnVarD.c;
                if (idmVar2 == null) {
                    idmVar2 = defpackage.idm.a;
                }
                int i6 = idmVar2.e;
                akzc akzcVarX = akzc.F(bufferedInputStream).x(i5);
                defpackage.idm idmVar3 = idnVarD.c;
                if (idmVar3 == null) {
                    idmVar3 = defpackage.idm.a;
                }
                akzcVarF = ((uvb) obj6).f.a(zif.a(akzcVarX, idmVar3.d), i6, (((defpackage.idt) obj4).c == 3 ? (defpackage.ids) ((defpackage.idt) obj4).d : defpackage.ids.a).c);
            } else {
                akzcVarF = akzc.F(bufferedInputStream);
            }
            bufferedInputStream.close();
            return akzcVarF;
        } catch (java.lang.Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public /* synthetic */ nzd(java.lang.ref.WeakReference weakReference, android.content.Context context, int i, java.lang.String str, int i2) {
        this.$cid = i2;
        this.d = weakReference;
        this.b = context;
        this.a = i;
        this.c = str;
    }

    public /* synthetic */ nzd(defpackage.nze nzeVar, ajcq ajcqVar, ajcq ajcqVar2, int i, int i2) {
        this.$cid = i2;
        this.b = nzeVar;
        this.c = ajcqVar;
        this.d = ajcqVar2;
        this.a = i;
    }

    public /* synthetic */ nzd(uvb uvbVar, int i, utq utqVar, defpackage.idt idtVar, int i2) {
        this.$cid = i2;
        this.d = uvbVar;
        this.a = i;
        this.c = utqVar;
        this.b = idtVar;
    }
}
