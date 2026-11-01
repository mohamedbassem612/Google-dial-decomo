package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aom extends cmv implements dbd, ddc {
    public defpackage.aon a;
    public boolean b = false;
    public boolean c;

    public aom(defpackage.aon aonVar, boolean z) {
        this.a = aonVar;
        this.c = z;
    }

    public final void cQ(diq diqVar) {
        diqVar.a(din.n, java.lang.Boolean.TRUE);
        dic dicVar = new dic(new defpackage.mq(this, 13), new defpackage.mq(this, 14), false);
        if (this.c) {
            diqVar.a(din.x, dicVar);
        } else {
            diqVar.a(din.w, dicVar);
        }
    }

    public final cyf cX(cyi cyiVar, cyd cydVar, long j) {
        int iA;
        int iB;
        den.bk(j, this.c ? aso.a : aso.b);
        if (this.c) {
            iB = dpd.b(j);
            iA = Integer.MAX_VALUE;
        } else {
            iA = dpd.a(j);
            iB = Integer.MAX_VALUE;
        }
        czc czcVarV = cydVar.v(dpd.k(j, 0, iB, 0, iA, 5));
        int i = czcVarV.a;
        int iB2 = dpd.b(j);
        if (i <= iB2) {
            iB2 = i;
        }
        int i2 = czcVarV.b;
        int iA2 = dpd.a(j);
        if (i2 <= iA2) {
            iA2 = i2;
        }
        int i3 = i - iB2;
        int i4 = i2 - iA2;
        if (true == this.c) {
            i3 = i4;
        }
        defpackage.aon aonVar = this.a;
        aonVar.f.h(i3);
        cko ckoVar = (cko) ckw.i.i();
        aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
        cko ckoVarH = cfd.h(ckoVar);
        try {
            if (aonVar.c() > i3) {
                aonVar.e(i3);
            }
            cfd.i(ckoVar, ckoVarH, aonjVarI);
            this.a.d.h(true != this.c ? iB2 : iA2);
            this.a.e.h(this.c ? czcVarV.b : czcVarV.a);
            this.a.b.b(java.lang.Boolean.FALSE);
            return cyiVar.du(iB2, iA2, aokd.a, new abpk(this, i3, czcVarV, 1));
        } catch (java.lang.Throwable th) {
            cfd.i(ckoVar, ckoVarH, aonjVarI);
            throw th;
        }
    }

    public final int e(cxf cxfVar, cxe cxeVar, int i) {
        if (true != this.c) {
            i = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        }
        return cxeVar.c(i);
    }

    public final int f(cxf cxfVar, cxe cxeVar, int i) {
        if (true == this.c) {
            i = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        }
        return cxeVar.d(i);
    }

    public final int i(cxf cxfVar, cxe cxeVar, int i) {
        if (true != this.c) {
            i = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        }
        return cxeVar.e(i);
    }

    public final int j(cxf cxfVar, cxe cxeVar, int i) {
        if (true == this.c) {
            i = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        }
        return cxeVar.f(i);
    }

    public final /* synthetic */ boolean w() {
        return false;
    }

    public final /* synthetic */ boolean x() {
        return false;
    }

    public final /* synthetic */ boolean y() {
        return true;
    }
}
