package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class epd extends eng {
    public final int g;
    public final defpackage.epl h;
    public defpackage.epe i;
    private emx j;
    private defpackage.epl k;

    public epd(int i, defpackage.epl eplVar, defpackage.epl eplVar2) {
        this.g = i;
        this.h = eplVar;
        this.k = eplVar2;
        if (eplVar.n != null) {
            throw new java.lang.IllegalStateException("There is already a listener registered");
        }
        eplVar.n = this;
        eplVar.g = i;
    }

    protected final void a() {
        if (defpackage.epg.g(2)) {
            toString();
            android.util.Log.v("LoaderManager", "  Starting: ".concat(toString()));
        }
        defpackage.epl eplVar = this.h;
        eplVar.i = true;
        eplVar.k = false;
        eplVar.j = false;
        eplVar.m();
    }

    protected final void b() {
        if (defpackage.epg.g(2)) {
            toString();
            android.util.Log.v("LoaderManager", "  Stopping: ".concat(toString()));
        }
        defpackage.epl eplVar = this.h;
        eplVar.i = false;
        eplVar.n();
    }

    final defpackage.epl c(boolean z) {
        if (defpackage.epg.g(3)) {
            toString();
            android.util.Log.d("LoaderManager", "  Destroying: ".concat(toString()));
        }
        defpackage.epl eplVar = this.h;
        eplVar.h();
        eplVar.j = true;
        defpackage.epe epeVar = this.i;
        if (epeVar != null) {
            j(epeVar);
            if (z && epeVar.c) {
                if (defpackage.epg.g(2)) {
                    defpackage.epl eplVar2 = epeVar.a;
                    java.util.Objects.toString(eplVar2);
                    android.util.Log.v("LoaderManager", "  Resetting: ".concat(java.lang.String.valueOf(eplVar2)));
                }
                epeVar.b.b(epeVar.a);
            }
        }
        defpackage.epd epdVar = eplVar.n;
        if (epdVar == null) {
            throw new java.lang.IllegalStateException("No listener register");
        }
        if (epdVar != this) {
            throw new java.lang.IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        eplVar.n = null;
        if ((epeVar == null || epeVar.c) && !z) {
            return eplVar;
        }
        eplVar.p();
        return this.k;
    }

    public final void j(enh enhVar) {
        super.j(enhVar);
        this.j = null;
        this.i = null;
    }

    public final void k(java.lang.Object obj) {
        super.k(obj);
        defpackage.epl eplVar = this.k;
        if (eplVar != null) {
            eplVar.p();
            this.k = null;
        }
    }

    public final void m() {
        emx emxVar = this.j;
        defpackage.epe epeVar = this.i;
        if (emxVar == null || epeVar == null) {
            return;
        }
        super.j(epeVar);
        g(emxVar, epeVar);
    }

    final void n(emx emxVar, defpackage.epb epbVar) {
        defpackage.epe epeVar = new defpackage.epe(this.h, epbVar);
        g(emxVar, epeVar);
        defpackage.epe epeVar2 = this.i;
        if (epeVar2 != null) {
            j(epeVar2);
        }
        this.j = emxVar;
        this.i = epeVar;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.g);
        sb.append(" : ");
        defpackage.epl eplVar = this.h;
        sb.append(eplVar.getClass().getSimpleName());
        sb.append('{');
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(eplVar)));
        sb.append("}}");
        return sb.toString();
    }
}
