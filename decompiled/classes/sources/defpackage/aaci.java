package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaci {
    static final defpackage.aacg a;
    static final defpackage.aacg b;
    public static android.content.Context c;
    static volatile aahh d;
    private static final java.lang.Object e;

    static {
        new defpackage.aabz(defpackage.aahd.d("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
        new defpackage.aaca(defpackage.aahd.d("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
        new defpackage.aacb(defpackage.aahd.d("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new defpackage.aacc(defpackage.aahd.d("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new defpackage.aacd(defpackage.aahd.d("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new defpackage.aace(defpackage.aahd.d("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        e = new java.lang.Object();
    }

    static synchronized void a(android.content.Context context) {
        if (c == null) {
            c = context.getApplicationContext();
        } else {
            android.util.Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }

    static void b() {
        aahh aahhVar;
        if (d == null) {
            defpackage.aais.as(c);
            synchronized (e) {
                if (d == null) {
                    android.os.IBinder iBinderD = defpackage.aalm.c(c, defpackage.aalm.b, "com.google.android.gms.googlecertificates").d();
                    if (iBinderD == null) {
                        aahhVar = null;
                    } else {
                        aahh aahhVarQueryLocalInterface = iBinderD.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        aahhVar = aahhVarQueryLocalInterface instanceof aahh ? aahhVarQueryLocalInterface : new aahh(iBinderD);
                    }
                    d = aahhVar;
                }
            }
        }
    }

    @java.lang.Deprecated
    static aack c(java.lang.String str, defpackage.aahd aahdVar, boolean z, boolean z2) {
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            return d(str, aahdVar, z, z2);
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @java.lang.Deprecated
    public static aack d(java.lang.String str, defpackage.aahd aahdVar, boolean z, boolean z2) {
        try {
            b();
            defpackage.aais.as(c);
            com.google.android.gms.common.GoogleCertificatesQuery googleCertificatesQuery = new com.google.android.gms.common.GoogleCertificatesQuery(str, aahdVar, z, z2);
            try {
                aahh aahhVar = d;
                aala aalaVar = new aala(c.getPackageManager());
                android.os.Parcel parcelEP = aahhVar.eP();
                defpackage.yld.d(parcelEP, googleCertificatesQuery);
                defpackage.yld.f(parcelEP, aalaVar);
                android.os.Parcel parcelEQ = aahhVar.eQ(5, parcelEP);
                boolean zG = defpackage.yld.g(parcelEQ);
                parcelEQ.recycle();
                return zG ? aack.a : new aacj(new nyn(z, str, aahdVar, 7));
            } catch (android.os.RemoteException e2) {
                android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return new aack(false, "module call", e2);
            }
        } catch (defpackage.aali e3) {
            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return new aack(false, "module init: ".concat(java.lang.String.valueOf(e3.getMessage())), e3);
        }
    }
}
