package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ifj implements ifa {
    final /* synthetic */ erg a;
    final /* synthetic */ defpackage.ifq b;

    public ifj(erg ergVar, defpackage.ifq ifqVar) {
        this.a = ergVar;
        this.b = ifqVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    public final void A(android.media.AudioDeviceInfo audioDeviceInfo) {
        java.lang.String string;
        int iA = ifi.a(audioDeviceInfo.getType());
        defpackage.ifq ifqVar = this.b;
        android.widget.ImageButton imageButton = ifqVar.i;
        imageButton.setImageResource(iA);
        ifi ifiVar = ifqVar.e;
        int type = audioDeviceInfo.getType();
        if (type == 1) {
            string = ifiVar.b.getString(2132017430);
            aooh.e(string, "getString(...)");
        } else if (type == 2) {
            string = ifiVar.b.getString(2132017432);
            aooh.e(string, "getString(...)");
        } else if (type == 3) {
            string = ifiVar.b.getString(2132017438);
            aooh.e(string, "getString(...)");
        } else if (type == 4) {
            string = ifiVar.b.getString(2132017436);
            aooh.e(string, "getString(...)");
        } else if (type == 7 || type == 26) {
            string = ifiVar.b.getString(2132017428);
            aooh.e(string, "getString(...)");
        } else if (type == 22) {
            string = ifiVar.b.getString(2132017438);
            aooh.e(string, "getString(...)");
        } else {
            if (type != 23) {
                throw new java.lang.IllegalArgumentException("Unsupported audio device type: " + audioDeviceInfo.getType());
            }
            string = ifiVar.b.getString(2132017433);
            aooh.e(string, "getString(...)");
        }
        imageButton.setContentDescription(string);
    }

    public final void f(boolean z) {
        this.a.f(z);
    }

    public final void g(boolean z) {
        this.a.g(z);
    }

    public final void n(int i) {
        this.a.n(i);
    }

    public final void p(defpackage.erb erbVar) {
        aooh.f(erbVar, "error");
        this.a.p(erbVar);
    }

    public final /* synthetic */ void u() {
    }

    public final /* synthetic */ void P(boolean z) {
    }

    public final /* synthetic */ void a(int i) {
    }

    public final /* synthetic */ void b(defpackage.ere ereVar) {
    }

    public final /* synthetic */ void c(defpackage.est estVar) {
    }

    public final /* synthetic */ void d(java.util.List list) {
    }

    public final /* synthetic */ void j(defpackage.eqw eqwVar) {
    }

    public final /* synthetic */ void k(defpackage.eqy eqyVar) {
    }

    public final /* synthetic */ void m(defpackage.erc ercVar) {
    }

    public final /* synthetic */ void o(int i) {
    }

    public final /* synthetic */ void q(defpackage.erb erbVar) {
    }

    public final /* synthetic */ void s(int i) {
    }

    public final /* synthetic */ void v(boolean z) {
    }

    public final /* synthetic */ void y(defpackage.ert ertVar) {
    }

    public final /* synthetic */ void z(defpackage.ery eryVar) {
    }

    public final /* synthetic */ void M(defpackage.eri eriVar, defpackage.erf erfVar) {
    }

    public final /* synthetic */ void Q(defpackage.eqt eqtVar, int i) {
    }

    public final /* synthetic */ void l(boolean z, int i) {
    }

    public final /* synthetic */ void r(boolean z, int i) {
    }

    public final /* synthetic */ void w(int i, int i2) {
    }

    public final /* synthetic */ void x(defpackage.erm ermVar, int i) {
    }

    public final /* synthetic */ void t(defpackage.erh erhVar, defpackage.erh erhVar2, int i) {
    }
}
