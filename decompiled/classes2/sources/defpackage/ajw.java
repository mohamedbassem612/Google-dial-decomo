package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajw {
    public final cfc a = new cfc(new defpackage.ajt[16]);
    public long b;
    public final ccp c;
    private final ccp d;

    public ajw() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        cdu cduVar = cdu.c;
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar);
        this.b = Long.MIN_VALUE;
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.TRUE, cduVar);
    }

    public final void a(cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-318043801);
        if (i3 == 0) {
            i2 = (true != cbtVarB.D(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 0;
        if (cbtVarB.H((i2 & 3) != 2, i2 & 1)) {
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR = parcelableSnapshotMutableState;
            }
            ccp ccpVar = (ccp) objR;
            if (((java.lang.Boolean) this.c.a()).booleanValue() || ((java.lang.Boolean) this.d.a()).booleanValue()) {
                cbtVarB.u(-144841960);
                boolean zD = cbtVarB.D(this);
                java.lang.Object objR2 = cbtVar.R();
                if (zD || objR2 == obj) {
                    objR2 = new defpackage.kae(ccpVar, this, (aoln) null, 1);
                    cbtVar.ab(objR2);
                }
                cbp.g(this, (aonn) objR2, cbtVarB);
                cbtVar.W(false);
            } else {
                cbtVarB.u(-143455237);
                cbtVar.W(false);
            }
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ajs(this, i, i4);
        }
    }

    public final void b(boolean z) {
        this.d.b(java.lang.Boolean.valueOf(z));
    }
}
