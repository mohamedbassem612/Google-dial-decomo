package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class fff implements defpackage.ahzi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ fff(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [evq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [evq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [evq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, wvu] */
    /* JADX WARN: Type inference failed for: r8v10, types: [evq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v17, types: [aoin, java.lang.Object] */
    @Override // defpackage.ahzi
    public final java.lang.Object eZ() {
        wvn fgoVar;
        defpackage.apgc apgcVar;
        switch (this.$cid) {
            case 0:
                return ffh.a((java.lang.Class) this.a, (evq) this.b);
            case 1:
                return ffh.a((java.lang.Class) this.a, (evq) this.b);
            case 2:
                return ffh.a((java.lang.Class) this.a, (evq) this.b);
            case 3:
                fgoVar = new fgo((evq) this.b, ((ffg) this.a).a);
                ((fgo) fgoVar).b = true;
                break;
            case 4:
                return defpackage.ahvr.F(new omj(this.b, 13), this.a);
            case 5:
                fgoVar = new wid((defpackage.ops) this.b, (wib) this.a);
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                wvm wvmVar = (wvm) this.b;
                wvq wvqVar = wvmVar.d;
                defpackage.ajct ajctVar = wvmVar.c;
                fgoVar = new wvn((wvu) this.a, wvmVar.e, wvmVar.a, wvmVar.b, ajctVar, wvqVar);
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                android.content.pm.PackageManager packageManager = ((android.content.Context) this.b).getPackageManager();
                defpackage.apgc apgcVar2 = defpackage.apgc.PHONE_OR_TABLET;
                if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                    apgcVar = defpackage.apgc.WATCH;
                } else if (packageManager.hasSystemFeature("android.software.leanback")) {
                    apgcVar = defpackage.apgc.LEANBACK;
                } else {
                    apgcVar = (((java.lang.Boolean) this.a.a()).booleanValue() && packageManager.hasSystemFeature("android.software.xr.api.spatial")) ? defpackage.apgc.XR : apgcVar2;
                }
                return packageManager.hasSystemFeature("android.hardware.type.automotive") ? defpackage.apgc.AUTOMOTIVE : apgcVar;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Object obj = this.b;
                synchronized (this.a) {
                    java.lang.String strB = defpackage.aepw.b();
                    java.lang.String str = strB + ".trace";
                    java.io.File file = new java.io.File(((android.content.Context) obj).getFilesDir(), defpackage.a.bx(strB, "primes_profiling_"));
                    if (!file.exists() && !file.mkdir()) {
                        return defpackage.ahwt.a;
                    }
                    java.io.File file2 = new java.io.File(file, str);
                    file2.deleteOnExit();
                    try {
                        if (file2.exists()) {
                            file2.delete();
                        }
                        break;
                    } catch (java.lang.RuntimeException unused) {
                    }
                    return defpackage.ahyn.h(file2);
                }
            case 9:
                return ((defpackage.apni) this.b).l().acquireUnstableContentProviderClient((java.lang.String) this.a);
            default:
                int i = akdb.d;
                return new defpackage.aevm((defpackage.aevo) this.a, new zlk(this.b, 17));
        }
        return fgoVar;
    }

    public /* synthetic */ fff(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
