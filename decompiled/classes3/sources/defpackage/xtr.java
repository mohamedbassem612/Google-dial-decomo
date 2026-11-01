package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xtr extends ajac implements defpackage.yeo {
    public defpackage.yen a;

    protected final java.lang.String b() {
        defpackage.yen yenVar;
        synchronized (this) {
            yenVar = this.a;
        }
        if (yenVar != null) {
            return a.bG((byte) 93, yenVar, "activeTarget=[");
        }
        return null;
    }

    public final boolean cancel(boolean z) {
        defpackage.yen yenVar;
        boolean zCancel = super.cancel(z);
        if (!zCancel) {
            return zCancel;
        }
        synchronized (this) {
            yenVar = this.a;
        }
        if (yenVar == null) {
            return zCancel;
        }
        yenVar.cancel(z);
        return true;
    }

    @Override // defpackage.yeo
    public final boolean d(defpackage.xxa xxaVar, defpackage.yfa yfaVar) {
        java.lang.Throwable runtimeException = xxaVar;
        if (xxaVar == null) {
            runtimeException = new java.lang.RuntimeException("Unknown error");
        }
        super.p(runtimeException);
        return true;
    }

    @Override // defpackage.yeo
    public final boolean e(java.lang.Object obj, defpackage.yfa yfaVar, defpackage.xuc xucVar) {
        try {
            super.o(new xtq(obj));
            return true;
        } catch (java.lang.Throwable th) {
            super.p(th);
            return true;
        }
    }
}
