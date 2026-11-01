package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xhk {
    public final boolean a;

    /* JADX WARN: Code duplicated, block: B:30:0x0093  */
    public xhk(eve eveVar, defpackage.amwp amwpVar) {
        int i = amwpVar.a;
        boolean z = false;
        ahvr.bM(i == 6 || i == 3);
        byte[] bArr = new byte[java.lang.Math.min(4, ((java.nio.ByteBuffer) amwpVar.b).remaining())];
        ((java.nio.ByteBuffer) amwpVar.b).asReadOnlyBuffer().get(bArr);
        etv etvVar = new etv(bArr);
        hgt.aE(eveVar.a);
        if (!etvVar.p()) {
            int iD = etvVar.d(2);
            boolean zP = etvVar.p();
            hgt.aE(eveVar.b);
            if (zP) {
                boolean zP2 = (iD == 3 || iD == 0) ? true : etvVar.p();
                etvVar.m();
                hgt.aE(!eveVar.d);
                if (etvVar.p()) {
                    hgt.aE(!eveVar.e);
                    etvVar.m();
                }
                hgt.aE(eveVar.c);
                if (iD != 3) {
                    etvVar.m();
                }
                etvVar.n(eveVar.f);
                if (iD != 2 && iD != 0 && !zP2) {
                    etvVar.n(3);
                }
                if (iD == 3 || iD == 0 || etvVar.d(8) != 0) {
                    z = true;
                }
            } else {
                z = true;
            }
        }
        this.a = z;
    }

    public xhk() {
        boolean z = true;
        if (!aooh.n(android.os.Build.TYPE, "userdebug") && !aooh.n(android.os.Build.TYPE, "eng") && android.os.Build.VERSION.SDK_INT < 35) {
            z = false;
        }
        this.a = z;
        aooh.e(j$.time.Duration.ofSeconds(300L), "ofSeconds(...)");
        aooh.e(j$.time.Duration.ofSeconds(3L), "ofSeconds(...)");
    }

    public xhk(boolean z) {
        this.a = z;
    }
}
