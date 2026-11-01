package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aafq {
    public defpackage.aafm a;
    public com.google.android.gms.common.Feature[] b;
    private boolean d = false;
    private boolean e = false;
    public int c = 0;

    public final defpackage.aafr a() {
        if (this.a == null) {
            throw new java.lang.IllegalArgumentException("execute parameter required");
        }
        if (!this.e) {
            com.google.android.gms.common.Feature[] featureArr = this.b;
            boolean z = false;
            if (featureArr != null && featureArr.length != 0 && featureArr[0].c) {
                z = true;
            }
            this.d = z;
        }
        return new defpackage.aafr(this, this.b, this.d, this.c);
    }

    public final void b() {
        this.e = true;
        this.d = false;
    }
}
