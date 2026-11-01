package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class epl {
    public int g;
    public final android.content.Context h;
    public boolean i = false;
    public boolean j = false;
    public boolean k = true;
    public boolean l = false;
    public boolean m = false;
    public defpackage.epd n;

    public epl(android.content.Context context) {
        this.h = context.getApplicationContext();
    }

    public static final java.lang.String q(java.lang.Object obj) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        if (obj == null) {
            sb.append("null");
        } else {
            sb.append(obj.getClass().getSimpleName());
            sb.append('{');
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj)));
            sb.append('}');
        }
        return sb.toString();
    }

    @java.lang.Deprecated
    public void d(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        throw null;
    }

    public void h() {
        throw null;
    }

    public void k(java.lang.Object obj) {
        defpackage.epd epdVar = this.n;
        if (epdVar != null) {
            if (defpackage.epg.g(2)) {
                java.util.Objects.toString(epdVar);
                android.util.Log.v("LoaderManager", "onLoadComplete: ".concat(epdVar.toString()));
            }
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                epdVar.k(obj);
                return;
            }
            if (defpackage.epg.g(4)) {
                android.util.Log.i("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            epdVar.i(obj);
        }
    }

    public final void o() {
        if (this.i) {
            g();
        } else {
            this.l = true;
        }
    }

    public final void p() {
        l();
        this.k = true;
        this.i = false;
        this.j = false;
        this.l = false;
        this.m = false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        sb.append(getClass().getSimpleName());
        sb.append('{');
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" id=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }

    protected void g() {
    }

    protected void l() {
    }

    public void m() {
    }

    public void n() {
    }
}
