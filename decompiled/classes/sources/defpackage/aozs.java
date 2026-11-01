package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aozs {
    private int a;
    private defpackage.apat b;
    public defpackage.aozu[] d;
    public int e;

    public final defpackage.aozh b() {
        defpackage.apat apatVar;
        synchronized (this) {
            apatVar = this.b;
            if (apatVar == null) {
                apatVar = new defpackage.apat(this.e);
                this.b = apatVar;
            }
        }
        return apatVar;
    }

    protected abstract defpackage.aozu i();

    protected abstract defpackage.aozu[] l();

    protected final defpackage.aozu m() {
        defpackage.aozu aozuVarI;
        defpackage.apat apatVar;
        synchronized (this) {
            defpackage.aozu[] aozuVarArrL = this.d;
            if (aozuVarArrL == null) {
                aozuVarArrL = l();
                this.d = aozuVarArrL;
            } else {
                int i = this.e;
                int length = aozuVarArrL.length;
                if (i >= length) {
                    java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(aozuVarArrL, length << 1);
                    defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
                    aozuVarArrL = (defpackage.aozu[]) objArrCopyOf;
                    this.d = aozuVarArrL;
                }
            }
            int i2 = this.a;
            do {
                aozuVarI = aozuVarArrL[i2];
                if (aozuVarI == null) {
                    aozuVarI = i();
                    aozuVarArrL[i2] = aozuVarI;
                }
                i2++;
                if (i2 >= aozuVarArrL.length) {
                    i2 = 0;
                }
            } while (!aozuVarI.a(this));
            this.a = i2;
            this.e++;
            apatVar = this.b;
        }
        if (apatVar != null) {
            apatVar.o(1);
        }
        return aozuVarI;
    }

    protected final void n(defpackage.aozu aozuVar) {
        defpackage.apat apatVar;
        int i;
        defpackage.aoln[] aolnVarArrB;
        synchronized (this) {
            int i2 = this.e - 1;
            this.e = i2;
            apatVar = this.b;
            if (i2 == 0) {
                this.a = 0;
            }
            if (aozuVar == null) {
                defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            }
            aolnVarArrB = aozuVar.b(this);
        }
        for (defpackage.aoln aolnVar : aolnVarArrB) {
            if (aolnVar != null) {
                aolnVar.w(defpackage.aojh.a);
            }
        }
        if (apatVar != null) {
            apatVar.o(-1);
        }
    }
}
