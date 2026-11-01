package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aya extends eac implements java.lang.Runnable, android.view.View.OnAttachStateChangeListener, dyy {
    public boolean a;
    public int b;
    public eax c;
    private final defpackage.baa e;

    public aya(defpackage.baa baaVar) {
        super(!baaVar.n ? 1 : 0);
        this.e = baaVar;
    }

    public final eax b(eax eaxVar, java.util.List list) {
        defpackage.baa baaVar = this.e;
        baaVar.e(eaxVar);
        return baaVar.n ? eax.a : eaxVar;
    }

    public final eab c(aiyy aiyyVar, eab eabVar) {
        this.a = false;
        if (aiyyVar.h() != 0) {
            this.b |= aiyyVar.g();
        }
        return eabVar;
    }

    public final void d(aiyy aiyyVar) {
        this.a = false;
        int iG = aiyyVar.g();
        int i = ~iG;
        eax eaxVar = this.c;
        int i2 = this.b & i;
        this.b = i2;
        boolean z = i2 == 0;
        if (eaxVar != null) {
            if (z || (iG & 8) != 0) {
                defpackage.baa baaVar = this.e;
                baaVar.c(eaxVar);
                baaVar.d(eaxVar);
            }
            if (z) {
                this.e.e(eaxVar);
            }
        }
        if (z) {
            this.c = null;
        }
    }

    public final eax dC(android.view.View view, eax eaxVar) {
        this.c = eaxVar;
        defpackage.baa baaVar = this.e;
        baaVar.d(eaxVar);
        if (this.a) {
            if (android.os.Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (this.b == 0) {
            baaVar.c(eaxVar);
            baaVar.e(eaxVar);
        }
        return baaVar.n ? eax.a : eaxVar;
    }

    public final void e(aiyy aiyyVar) {
        this.a = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            this.b = 0;
            this.a = false;
            eax eaxVar = this.c;
            if (eaxVar != null) {
                defpackage.baa baaVar = this.e;
                baaVar.c(eaxVar);
                baaVar.e(eaxVar);
                this.c = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
    }
}
