package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aafr {
    public final com.google.android.gms.common.Feature[] a;
    public final boolean b;
    public final int c;
    final /* synthetic */ defpackage.aafq d;

    public aafr(defpackage.aafq aafqVar, com.google.android.gms.common.Feature[] featureArr, boolean z, int i) {
        j$.util.Objects.requireNonNull(aafqVar);
        this.d = aafqVar;
        this.a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }
}
