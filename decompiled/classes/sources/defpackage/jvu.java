package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class jvu implements defpackage.ahzi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ jvu(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r0v3, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r1v16, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v40, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [ahzi, java.lang.Object] */
    @Override // defpackage.ahzi
    public final java.lang.Object eZ() {
        defpackage.aada aadaVar;
        int i = 10;
        switch (this.$cid) {
            case 0:
                return defpackage.ahvr.H((defpackage.ajcq) ((defpackage.jvv) this.a).c.eZ(), new jvq(5), this.b);
            case 1:
                java.lang.Object obj = this.a;
                java.util.concurrent.Callable callableI = defpackage.ahqx.i(new hkx(obj, 16));
                defpackage.ajct ajctVar = ((defpackage.jvs) obj).c;
                return defpackage.ahvr.H(defpackage.ahrv.g(ajctVar.submit(callableI)).i(new hky(obj, 10), ajctVar), new jvq(3), this.b);
            case 2:
                java.lang.Object obj2 = this.a;
                if (obj2 == null) {
                    defpackage.aooh.g();
                }
                return this.b.a(obj2);
            case 3:
                return new defpackage.aaid((android.content.Context) this.a, (defpackage.aahr) this.b);
            case 4:
                aadaVar = new defpackage.aada((android.content.Context) this.a, null, defpackage.aakg.b, null, defpackage.aacz.a);
                break;
            case 5:
                defpackage.gat gatVar = (defpackage.gat) this.b;
                return new aaks((android.content.Context) this.a, (defpackage.acxg) gatVar.a.eZ(), (defpackage.ahzi) gatVar.c);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                aadaVar = new defpackage.aada((android.content.Context) this.a, null, defpackage.aakg.b, defpackage.aact.q, defpackage.aacz.a);
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Object obj3 = this.a;
                return new ahix((java.util.concurrent.ScheduledExecutorService) this.b, new defpackage.ajxw((android.content.Context) obj3, "STREAMZ_ONEGOOGLE_ANDROID"), obj3 instanceof android.app.Application ? (android.app.Application) obj3 : null, (byte[]) null);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aemi aemiVar = (defpackage.aemi) this.b;
                android.content.Context applicationContext = aemiVar.a.getApplicationContext();
                java.util.concurrent.ExecutorService executorService = aemiVar.b;
                defpackage.aemb aembVar = new defpackage.aemb(aemiVar.a, aemiVar.b);
                defpackage.ahvr.ci(applicationContext);
                defpackage.ahvr.ci(executorService);
                defpackage.anrn anrnVar = new defpackage.anrn();
                anrnVar.a = 641;
                defpackage.aaqm aaqmVarC = anrnVar.c();
                defpackage.acxg acxgVar = aaqn.b;
                defpackage.aacz aaczVar = defpackage.aacz.a;
                return new defpackage.aenc(new aemw(applicationContext, new defpackage.aada(applicationContext, null, acxgVar, aaqmVarC, aaczVar), new aaqj(applicationContext, aaqmVarC), new defpackage.aada(applicationContext, null, acxgVar, aaqmVarC, aaczVar), aembVar, executorService, defpackage.aabx.a), 2, (defpackage.adai) this.a, applicationContext.getPackageName(), 0);
            case 9:
                return ((defpackage.zzx) this.a).K(((defpackage.aeum) this.b.a()).b);
            case 10:
                ?? r1 = this.b;
                java.lang.Object obj4 = this.a;
                java.lang.Object objEZ = r1.eZ();
                java.lang.Object obj5 = ((defpackage.ajje) obj4).d;
                java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.aewq.a;
                return (defpackage.aexi) ((defpackage.ahyn) objEZ).c(defpackage.ahvr.bI(new defpackage.aeex(obj5, i)));
            case 11:
                return ((defpackage.aish) ((defpackage.aogc) this.a).a).k(((defpackage.akzc) this.b).D());
            case 12:
                defpackage.zyy zyyVar = (defpackage.zyy) this.a;
                java.lang.String str = zyyVar.j;
                java.lang.String str2 = zyyVar.i;
                return defpackage.gou.C(str2, (java.util.concurrent.atomic.AtomicReference) ((defpackage.gou) ((defpackage.zzx) this.b).a).d.get(new defpackage.ahyo(str, str2)));
            case 13:
                return defpackage.gou.C("", (java.util.concurrent.atomic.AtomicReference) ((defpackage.gou) ((defpackage.zzx) this.b).a).a.get(((defpackage.zyy) this.a).j));
            case 14:
                return java.lang.String.valueOf(defpackage.aewo.b((android.content.Context) this.a)) + java.io.File.separator + "phenotype_storage_info" + java.io.File.separator + "shared" + java.io.File.separator + ((java.lang.String) this.b);
            case 15:
                java.lang.Object obj6 = this.b;
                try {
                    return java.lang.Integer.valueOf(((android.content.pm.PackageManager) ((defpackage.afab) this.a).b).getPackageInfo((java.lang.String) obj6, 0).versionCode);
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    android.util.Log.w("PhenotypeResourceReader", "Failed to find version of package ".concat(java.lang.String.valueOf(obj6)));
                    return null;
                }
            case 16:
                return ((defpackage.apni) this.b).l().acquireUnstableContentProviderClient((android.net.Uri) this.a);
            default:
                return ((android.view.LayoutInflater) this.a).cloneInContext((android.content.Context) this.b);
        }
        return aadaVar;
    }

    public /* synthetic */ jvu(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
