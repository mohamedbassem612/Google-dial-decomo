package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class cve {
    public final defpackage.cfc d = new defpackage.cfc(new defpackage.cvd[16]);
    public final defpackage.adq e = new defpackage.adq(10);

    public boolean c(defpackage.adb adbVar, defpackage.cxi cxiVar, aae aaeVar, boolean z) {
        defpackage.cfc cfcVar = this.d;
        java.lang.Object[] objArr = cfcVar.a;
        int i = cfcVar.b;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < i) {
            ((defpackage.cvd) objArr[i2]).c(adbVar, cxiVar, aaeVar, z);
            i2++;
            z2 = true;
        }
        return z2;
    }

    public final void f() {
        defpackage.cfc cfcVar = this.d;
        int i = cfcVar.b;
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            if (((defpackage.cvd) cfcVar.a[i]).c.a == 0) {
                cfcVar.c(i);
            }
        }
    }
}
