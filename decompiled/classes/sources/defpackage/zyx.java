package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class zyx implements defpackage.zzo {
    static final com.google.android.gms.phenotype.ExperimentTokens[] a = new com.google.android.gms.phenotype.ExperimentTokens[0];
    static final java.lang.String[] b = new java.lang.String[0];

    @java.lang.Deprecated
    public static final defpackage.acxg l;
    private static volatile int m = -1;
    private static final defpackage.aais n;
    private static final defpackage.aais o;
    public final defpackage.zzq c;
    public final java.lang.String d;
    protected final android.content.Context e;
    public final defpackage.zze f;
    protected final java.lang.String g;
    protected final java.lang.String h;
    protected final defpackage.zzv i;
    public final defpackage.zzj j;
    public int k;

    static {
        defpackage.aais aaisVar = new defpackage.aais();
        o = aaisVar;
        defpackage.zyv zyvVar = new defpackage.zyv();
        n = zyvVar;
        l = new defpackage.acxg("ClearcutLogger.API", zyvVar, aaisVar);
    }

    public zyx(android.content.Context context, java.lang.String str, java.lang.String str2, defpackage.zzv zzvVar, int i, defpackage.zze zzeVar, defpackage.zzq zzqVar, defpackage.zzj zzjVar) {
        if (!zzvVar.a(defpackage.zzw.ACCOUNT_NAME) && str2 != null) {
            throw new java.lang.IllegalArgumentException("Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        c(zzvVar);
        this.e = context.getApplicationContext();
        this.h = context.getPackageName();
        this.g = str;
        this.d = str2;
        this.i = zzvVar;
        this.k = i == 0 ? 1 : i;
        this.f = zzeVar == null ? new defpackage.aaaf(context) : zzeVar;
        this.c = zzqVar == null ? new defpackage.aaak(context) : zzqVar;
        this.j = zzjVar;
    }

    static final int a(android.content.Context context) {
        if (m == -1) {
            synchronized (defpackage.zyx.class) {
                if (m == -1) {
                    try {
                        m = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                        android.util.Log.wtf("AbstractClearcutLogger", "This can't happen.", e);
                    }
                }
            }
        }
        return m;
    }

    static final java.lang.String b(java.lang.Iterable iterable) {
        return new defpackage.ahyj(", ").b(iterable);
    }

    static final void c(defpackage.zzv zzvVar) {
        if (!zzvVar.equals(defpackage.zzv.c) && !zzvVar.equals(defpackage.zzv.a) && !zzvVar.equals(defpackage.zzv.b)) {
            throw new java.lang.IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or DEIDENTIFIED");
        }
    }

    static final int[] e(java.util.ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i2] = ((java.lang.Integer) arrayList.get(i)).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    @Override // defpackage.zzo
    public final boolean d() {
        return this.i.equals(defpackage.zzv.b);
    }
}
