package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mbd {
    public static final defpackage.mbd a = new defpackage.mbd(rmx.mu, qbc.iu);
    public static final defpackage.mbd b = new defpackage.mbd(rmx.mw, qbc.iv);
    public static final defpackage.mbd c = new defpackage.mbd(rmx.mr, qbc.iw);
    public static final defpackage.mbd d = new defpackage.mbd(rmx.mt, qbc.ix);
    public static final defpackage.mbd e = new defpackage.mbd(rmx.mq, qbc.iy);
    public static final defpackage.mbd f = new defpackage.mbd(rmx.mE, qbc.iz);
    public static final defpackage.mbd g = new defpackage.mbd(rmx.mx, qbc.iA);
    public static final defpackage.mbd h = new defpackage.mbd(rmx.ms, qbc.iB);
    public static final defpackage.mbd i = new defpackage.mbd(rmx.mz, qbc.iC);
    public static final defpackage.mbd j = new defpackage.mbd(rmx.my, qbc.iD);
    public static final defpackage.mbd k = new defpackage.mbd(rmx.mv, qbc.iE);
    public static final defpackage.mbd l = new defpackage.mbd(rmx.mB, qbc.iF);
    public static final defpackage.mbd m = new defpackage.mbd(rmx.mA, qbc.iG);
    public final rmx n;
    public final qbc o;

    public mbd(rmx rmxVar, qbc qbcVar) {
        this.n = rmxVar;
        this.o = qbcVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mbd) {
            defpackage.mbd mbdVar = (defpackage.mbd) obj;
            if (this.n == mbdVar.n && this.o == mbdVar.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.n.hashCode() * 31) + this.o.hashCode();
    }

    public final java.lang.String toString() {
        return "CuiImpression(dialerImpression=" + this.n + ", inCallImpression=" + this.o + ')';
    }
}
