package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gms {
    public final int a;

    public gms() {
        int i = defpackage.gmz.a;
        this.a = defpackage.gmz.a();
    }

    public final void a(int i) {
        int i2 = this.a;
        if (i2 < i) {
            throw new java.lang.UnsupportedOperationException(defpackage.a.bf(i2, i, "This API requires extension version ", ", but the device is on "));
        }
    }
}
