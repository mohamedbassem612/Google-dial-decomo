package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaod extends aagp {
    public final aec a;
    private final aec v;
    private final aec w;

    public aaod(android.content.Context context, android.os.Looper looper, aagi aagiVar, aaei aaeiVar, aafi aafiVar) {
        super(context, looper, 23, aagiVar, aaeiVar, aafiVar);
        this.a = new aec(0);
        this.v = new aec(0);
        this.w = new aec(0);
        new aec(0);
    }

    public final void M() {
        java.lang.System.currentTimeMillis();
        aec aecVar = this.a;
        synchronized (aecVar) {
            aecVar.clear();
        }
        aec aecVar2 = this.v;
        synchronized (aecVar2) {
            aecVar2.clear();
        }
        aec aecVar3 = this.w;
        synchronized (aecVar3) {
            aecVar3.clear();
        }
    }

    public final boolean N(com.google.android.gms.common.Feature feature) {
        com.google.android.gms.common.Feature feature2;
        com.google.android.gms.common.Feature[] featureArrR = r();
        if (featureArrR == null) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= featureArrR.length) {
                feature2 = null;
                break;
            }
            feature2 = featureArrR[i];
            if (feature.a.equals(feature2.a)) {
                break;
            }
            i++;
        }
        return feature2 != null && feature2.a() >= feature.a();
    }

    public final int a() {
        return 11717000;
    }

    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof defpackage.aanv ? (defpackage.aanv) iInterfaceQueryLocalInterface : new defpackage.aanv(iBinder);
    }

    protected final java.lang.String c() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected final java.lang.String d() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public final boolean e() {
        return true;
    }

    public final com.google.android.gms.common.Feature[] g() {
        return defpackage.aani.q;
    }
}
