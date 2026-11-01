package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bnx {
    public final defpackage.cer a(boolean z, defpackage.kaw kawVar, defpackage.cav cavVar, int i) {
        cavVar.u(-1763481333);
        float f = 0.0f;
        if (kawVar == null) {
            cavVar.u(167726411);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVar;
            java.lang.Object objR = cbtVar.R();
            if (objR == defpackage.cau.a) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.dpi(0.0f), defpackage.cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR = parcelableSnapshotMutableState;
            }
            defpackage.ccp ccpVar = (defpackage.ccp) objR;
            cbtVar.W(false);
            cbtVar.W(false);
            return ccpVar;
        }
        cavVar.u(167799447);
        defpackage.cbt cbtVar2 = (defpackage.cbt) cavVar;
        cbtVar2.W(false);
        java.lang.Object objR2 = cbtVar2.R();
        java.lang.Object obj = defpackage.cau.a;
        if (objR2 == obj) {
            objR2 = new androidx.compose.runtime.snapshots.SnapshotStateList();
            cbtVar2.ab(objR2);
        }
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) objR2;
        boolean z2 = true;
        boolean z3 = (((i & 112) ^ 48) > 32 && cavVar.B(kawVar)) || (i & 48) == 32;
        java.lang.Object objR3 = cbtVar2.R();
        if (z3 || objR3 == obj) {
            objR3 = new defpackage.bnl(kawVar, snapshotStateList, (defpackage.aoln) null, 2, (byte[]) null);
            cbtVar2.ab(objR3);
        }
        defpackage.cbp.g(kawVar, (defpackage.aonn) objR3, cavVar);
        defpackage.avj avjVar = (defpackage.avj) defpackage.ajsz.bJ(snapshotStateList);
        if (z && !(avjVar instanceof defpackage.avl)) {
            if (avjVar instanceof defpackage.avh) {
                f = 1.0f;
            } else if (!(avjVar instanceof defpackage.avd) && (avjVar instanceof defpackage.avb)) {
                f = 6.0f;
            }
        }
        float f2 = f;
        java.lang.Object objR4 = cbtVar2.R();
        if (objR4 == obj) {
            objR4 = new defpackage.aii(new defpackage.dpi(f2), defpackage.alo.c, null, "Animatable");
            cbtVar2.ab(objR4);
        }
        defpackage.aii aiiVar = (defpackage.aii) objR4;
        defpackage.dpi dpiVar = new defpackage.dpi(f2);
        boolean zD = cavVar.D(aiiVar) | cavVar.y(f2) | ((((i & 14) ^ 6) > 4 && cavVar.C(z)) || (i & 6) == 4);
        if ((((i & 896) ^ 384) <= 256 || !cavVar.B(this)) && (i & 384) != 256) {
            z2 = false;
        }
        boolean zD2 = zD | z2 | cavVar.D(avjVar);
        java.lang.Object objR5 = cbtVar2.R();
        if (zD2 || objR5 == obj) {
            objR5 = new defpackage.boe(aiiVar, f2, z, this, avjVar, (defpackage.aoln) null, 1);
            cbtVar2.ab(objR5);
        }
        defpackage.cbp.g(dpiVar, (defpackage.aonn) objR5, cavVar);
        defpackage.air airVar = aiiVar.b;
        cbtVar2.W(false);
        return airVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.bnx)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1333788672;
    }
}
