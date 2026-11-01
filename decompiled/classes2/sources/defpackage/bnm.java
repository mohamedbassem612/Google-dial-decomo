package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bnm {
    public final cer a(boolean z, kaw kawVar, cav cavVar, int i) {
        cbt cbtVar = (cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        java.lang.Object obj = cau.a;
        if (objR == obj) {
            objR = new androidx.compose.runtime.snapshots.SnapshotStateList();
            cbtVar.ab(objR);
        }
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) objR;
        boolean z2 = (((i & 112) ^ 48) > 32 && cavVar.B(kawVar)) || (i & 48) == 32;
        java.lang.Object objR2 = cbtVar.R();
        if (z2 || objR2 == obj) {
            objR2 = new bnl(kawVar, snapshotStateList, (aoln) null, 0);
            cbtVar.ab(objR2);
        }
        cbp.g(kawVar, (aonn) objR2, cavVar);
        avj avjVar = (avj) ajsz.bJ(snapshotStateList);
        java.lang.Object objR3 = cbtVar.R();
        if (objR3 == obj) {
            objR3 = new aii(new dpi(0.0f), alo.c, (java.lang.Object) null, "Animatable");
            cbtVar.ab(objR3);
        }
        aii aiiVar = (aii) objR3;
        dpi dpiVar = new dpi(0.0f);
        boolean zD = cavVar.D(aiiVar) | cavVar.y(0.0f) | ((((i & 14) ^ 6) > 4 && cavVar.C(z)) || (i & 6) == 4) | ((((i & 896) ^ 384) > 256 && cavVar.B(this)) || (i & 384) == 256) | cavVar.D(avjVar);
        java.lang.Object objR4 = cbtVar.R();
        if (zD || objR4 == obj) {
            defpackage.bus busVar = new defpackage.bus(aiiVar, z, this, avjVar, (aoln) null, 1);
            cbtVar.ab(busVar);
            objR4 = busVar;
        }
        cbp.g(dpiVar, (aonn) objR4, cavVar);
        return aiiVar.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.bnm)) {
            if (dpi.c(0.0f, 0.0f) && dpi.c(0.0f, 0.0f) && dpi.c(0.0f, 0.0f) && dpi.c(0.0f, 0.0f) && dpi.c(0.0f, 0.0f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }
}
